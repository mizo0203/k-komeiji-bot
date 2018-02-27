package com.mizo0203.komeiji.repo.github.data;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Committer {
  private final String name;
  private final String email;
  private final String username;

  public Committer(
      @JsonProperty("name") String name,
      @JsonProperty("email") String email,
      @JsonProperty("username") String username) {
    this.name = name;
    this.email = email;
    this.username = username;
  }
}
