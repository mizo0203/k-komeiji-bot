package com.mizo0203.komeiji.repo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mizo0203.komeiji.repo.github.data.CreateCommitComment;
import com.mizo0203.komeiji.util.HttpUtil;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

public class GitHubClient {

  private static final Logger LOG = Logger.getLogger(GitHubClient.class.getName());
  private static final String
      GITHUB_REST_API_REPOSITORIES_COMMENTS_CREATE_A_COMMIT_COMMENT_URL_STR =
          "https://api.github.com/repos/mizo0203/%s/commits/%s/comments";
  private final String mAccessToken;

  public GitHubClient(String accessToken) {
    mAccessToken = accessToken;
  }

  /** Create a Commit */
  public void createCommit(
      String repositoryName, String sha, CreateCommitComment createCommitComment)
      throws JsonProcessingException, MalformedURLException {
    String uri =
        String.format(
            GITHUB_REST_API_REPOSITORIES_COMMENTS_CREATE_A_COMMIT_COMMENT_URL_STR,
            repositoryName,
            sha);
    Map<String, String> params = new HashMap<>();
    params.put("Authorization", "token " + mAccessToken);
    String body = new ObjectMapper().writeValueAsString(createCommitComment);
    HttpUtil.post(new URL(uri), params, body, null);
  }
}
