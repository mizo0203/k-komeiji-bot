package com.mizo0203.komeiji.domain.difine;

public enum GitHubUser {
  MIZO0203,
  ;

  public static GitHubUser getGitHubUser(int id) {
    switch (id) {
      case 3683707:
        return MIZO0203;
      default:
        return null;
    }
  }
}
