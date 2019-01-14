package com.mizo0203.komeiji.repo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mizo0203.komeiji.repo.github.data.CreateCommitComment;
import com.mizo0203.komeiji.repo.github.data.Repository;
import com.mizo0203.komeiji.util.HttpUtil;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Path;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
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

  /**
   * ユーザーリポジトリの一覧表示 / List user repositories
   *
   * <p>指定したユーザーのパブリックリポジトリを一覧表示します。
   *
   * <p>List public repositories for the specified user.
   */
  public void getRepositoryList(String user, Callback<List<Repository>> callback) {
    service().listRepos(user).enqueue(callback);
  }

  private GitHubService service() {
    return new Retrofit.Builder()
        .baseUrl("https://api.github.com")
        .addConverterFactory(JacksonConverterFactory.create())
        .build()
        .create(GitHubService.class);
  }

  private interface GitHubService {
    @GET("users/{user}/repos")
    Call<List<Repository>> listRepos(@Path("user") String user);
  }
}
