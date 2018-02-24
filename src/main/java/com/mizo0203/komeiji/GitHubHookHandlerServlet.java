package com.mizo0203.komeiji;

import com.fasterxml.jackson.databind.ObjectMapper;
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
  }

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
    LOG.info(IOUtils.toString(req.getInputStream(), StandardCharsets.UTF_8));
  }
}
