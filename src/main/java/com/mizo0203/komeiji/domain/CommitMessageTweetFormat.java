package com.mizo0203.komeiji.domain;

import com.mizo0203.komeiji.repo.github.data.Commit;

public class CommitMessageTweetFormat {
  public String format(Commit commit) {
    // TODO: 省略した文字列は三点リーダ "…" に置換
    return commit.getUrl()
        + " "
        + commit.getMessage().substring(0, Math.min(commit.getMessage().length(), 128));
  }
}
