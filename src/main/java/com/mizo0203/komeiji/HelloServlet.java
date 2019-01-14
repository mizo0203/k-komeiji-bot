package com.mizo0203.komeiji;

import com.mizo0203.komeiji.repo.github.data.Repository;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Path;

import javax.annotation.Nonnull;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HelloServlet extends HttpServlet {

  private static final Logger LOG = Logger.getLogger(HelloServlet.class.getName());

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
    Retrofit retrofit =
        new Retrofit.Builder()
            .baseUrl("https://api.github.com")
            .addConverterFactory(JacksonConverterFactory.create())
            .build();

    GitHubService service = retrofit.create(GitHubService.class);

    service
        .listRepos("octocat")
        .enqueue(
            new Callback<List<Repository>>() {
              @Override
              public void onResponse(
                  @Nonnull Call<List<Repository>> call,
                  @Nonnull Response<List<Repository>> response) {
                LOG.info("code: " + response.code());
                LOG.info("message: " + response.message());
                if (response.isSuccessful()) {
                  List<Repository> repositoryList = response.body();
                  for (Repository repository : Objects.requireNonNull(repositoryList)) {
                    LOG.info("repository: " + repository.getName());
                  }
                }
              }

              @Override
              public void onFailure(
                  @Nonnull Call<List<Repository>> call, @Nonnull Throwable throwable) {
                LOG.log(Level.WARNING, "onFailure", throwable);
              }
            });
  }

  private interface GitHubService {
    @GET("users/{user}/repos")
    Call<List<Repository>> listRepos(@Path("user") String user);
  }
}
