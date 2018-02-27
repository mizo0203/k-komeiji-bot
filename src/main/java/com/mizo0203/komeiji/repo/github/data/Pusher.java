package com.mizo0203.komeiji.repo.github.data;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Pusher {
  private final String name;
  private final String email;

  public Pusher(@JsonProperty("name") String name, @JsonProperty("email") String email) {
    this.name = name;
    this.email = email;
  }
}
