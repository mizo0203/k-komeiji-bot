package com.mizo0203.komeiji.repo.github.data;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Arrays;

public class Commit {
  private final String id;
  private final String tree_id;
  private final boolean distinct;
  private final String message;
  private final String timestamp;
  private final String url;
  private final Committer author;
  private final Committer committer;
  private final String[] added;
  private final String[] removed;
  private final String[] modified;

  @JsonCreator
  public Commit(
      @JsonProperty("id") String id,
      @JsonProperty("tree_id") String tree_id,
      @JsonProperty("distinct") boolean distinct,
      @JsonProperty("message") String message,
      @JsonProperty("timestamp") String timestamp,
      @JsonProperty("url") String url,
      @JsonProperty("author") Committer author,
      @JsonProperty("committer") Committer committer,
      @JsonProperty("added") String[] added,
      @JsonProperty("removed") String[] removed,
      @JsonProperty("modified") String[] modified) {
    this.id = id;
    this.tree_id = tree_id;
    this.distinct = distinct;
    this.message = message;
    this.timestamp = timestamp;
    this.url = url;
    this.author = author;
    this.committer = committer;
    this.added = added;
    this.removed = removed;
    this.modified = modified;
  }

  @Override
  public String toString() {
    return "Commit{"
        + "id='"
        + id
        + '\''
        + ", tree_id='"
        + tree_id
        + '\''
        + ", distinct="
        + distinct
        + ", message='"
        + message
        + '\''
        + ", timestamp='"
        + timestamp
        + '\''
        + ", url='"
        + url
        + '\''
        + ", author="
        + author
        + ", committer="
        + committer
        + ", added="
        + Arrays.toString(added)
        + ", removed="
        + Arrays.toString(removed)
        + ", modified="
        + Arrays.toString(modified)
        + '}';
  }

  public String getId() {
    return id;
  }

  public String getMessage() {
    return message;
  }

  public String getUrl() {
    return url;
  }
}
