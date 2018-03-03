package com.mizo0203.komeiji.domain.difine;

import twitter4j.User;

public enum TwitterUser {
  MIZO0203,
  REDMIZO,
  ;

  public final boolean equals(User user) {
    return equals(user.getId());
  }

  public final boolean equals(long id) {
    switch (this) {
      case MIZO0203:
        return id == 212164063L;
      case REDMIZO:
        return id == 1882885831L;
      default:
        return false;
    }
  }
}
