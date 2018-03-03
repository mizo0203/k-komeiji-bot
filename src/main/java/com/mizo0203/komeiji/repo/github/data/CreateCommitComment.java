package com.mizo0203.komeiji.repo.github.data;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

@SuppressWarnings("unused")
public class CreateCommitComment {
  private final int position;
  private final int line;
  private final String path;
  private final String body;

  @JsonCreator
  public CreateCommitComment(
      @JsonProperty("position") int position,
      @JsonProperty("path") String path,
      @JsonProperty("body") String body) {
    this.position = position;
    this.line = 0;
    this.path = path;
    this.body = body;
  }

  @JsonCreator
  public CreateCommitComment(@JsonProperty("body") String body) {
    this.position = 0;
    this.line = 0;
    this.path = null;
    this.body = body;
  }

  public int getPosition() {
    return position;
  }

  public int getLine() {
    return line;
  }

  public String getPath() {
    return path;
  }

  public String getBody() {
    return body;
  }
}
