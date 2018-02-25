package com.mizo0203.komeiji;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mizo0203.komeiji.domain.UseCase;
import com.mizo0203.komeiji.domain.difine.GitHubUser;
import com.mizo0203.komeiji.domain.difine.TwitterUser;
import com.mizo0203.komeiji.repo.github.data.Comment;
import com.mizo0203.komeiji.repo.github.data.CommitCommentEvent;
import org.apache.commons.io.IOUtils;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.logging.Logger;

public class GitHubHookHandlerServlet extends HttpServlet {

  private static final Logger LOG = Logger.getLogger(GitHubHookHandlerServlet.class.getName());

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
    String body = IOUtils.toString(req.getInputStream(), StandardCharsets.UTF_8);
    LOG.info(body);
    CommitCommentEvent commitCommentEvent =
        new ObjectMapper().readValue(body, CommitCommentEvent.class);
    LOG.info("commitCommentEvent: " + commitCommentEvent);
    GitHubUser gitHubUser = GitHubUser.getGitHubUser(commitCommentEvent.getSender().getId());
    TwitterUser twitterUser =
        gitHubUser == GitHubUser.MIZO0203 ? TwitterUser.MIZO0203 : TwitterUser.REDMIZO;
    Comment comment = commitCommentEvent.getComment();
    String commentBody = comment.getBody();
    String commentBodySubString = commentBody.substring(0, Math.min(commentBody.length(), 123));
    try (UseCase useCase = new UseCase()) {
      useCase.updateStatus(
          twitterUser, "@mizo0203 " + commentBodySubString + " " + comment.getHtml_url());
    }
  }

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
    LOG.info(IOUtils.toString(req.getInputStream(), StandardCharsets.UTF_8));
  }
}
