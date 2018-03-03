package com.mizo0203.komeiji.repo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mizo0203.komeiji.domain.difine.GitHubAccessTokens;
import com.mizo0203.komeiji.repo.github.data.CreateCommitComment;
import org.apache.commons.io.IOUtils;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.InputStreamEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GitHubClient {

  private static final Logger LOG = Logger.getLogger(GitHubClient.class.getName());
  private static final String
      GITHUB_REST_API_REPOSITORIES_COMMENTS_CREATE_A_COMMIT_COMMENT_URL_STR =
          "https://api.github.com/repos/mizo0203/%s/commits/%s/comments";

  public GitHubClient() {}

  /** Create a Commit */
  public void createCommit(
      String repositoryName, String sha, CreateCommitComment createCommitComment)
      throws JsonProcessingException {
    String uri =
        String.format(
            GITHUB_REST_API_REPOSITORIES_COMMENTS_CREATE_A_COMMIT_COMMENT_URL_STR,
            repositoryName,
            sha);
    HttpPost request = new HttpPost(uri);
    request.addHeader("Authorization", "token " + GitHubAccessTokens.PERSONAL_ACCESS_TOKEN);
    String entity = new ObjectMapper().writeValueAsString(createCommitComment);
    request.setEntity(new InputStreamEntity(IOUtils.toInputStream(entity, StandardCharsets.UTF_8)));
    try (CloseableHttpClient httpClient = HttpClientBuilder.create().build();
        CloseableHttpResponse httpResponse = httpClient.execute(request)) {
      LOG.log(Level.INFO, "createCommit httpResponse: " + httpResponse);
    } catch (IOException e) {
      LOG.log(Level.SEVERE, "createCommit", e);
    }
  }
}
