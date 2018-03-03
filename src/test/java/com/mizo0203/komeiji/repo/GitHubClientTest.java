package com.mizo0203.komeiji.repo;

import com.mizo0203.komeiji.domain.difine.GitHubAccessTokens;
import com.mizo0203.komeiji.repo.github.data.CreateCommitComment;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GitHubClientTest {

  private GitHubClient mTarget;

  @Before
  public void setUp() throws Exception {
    mTarget = new GitHubClient(GitHubAccessTokens.MUNO0203_PERSONAL_ACCESS_TOKEN);
  }

  @After
  public void tearDown() throws Exception {
    mTarget = null;
  }

  @Test
  public void createCommit() throws Exception {
    CreateCommitComment createCommitComment = new CreateCommitComment("Comment Test 14");
    mTarget.createCommit(
        "WebhooksTest", "e517f82312c1dc4a87c28e252071b7b893564452", createCommitComment);
  }
}
