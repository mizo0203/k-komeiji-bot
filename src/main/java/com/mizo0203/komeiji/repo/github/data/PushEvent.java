package com.mizo0203.komeiji.repo.github.data;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Arrays;

public class PushEvent {
  private final String ref;
  private final String before;
  private final String after;
  private final boolean created;
  private final boolean deleted;
  private final boolean forced;
  private final String base_ref;
  private final String compare;
  private final Commit[] commits;
  private final Commit head_commit;
  private final Repository repository;
  private final Pusher pusher;
  private final User sender;

  @JsonCreator
  public PushEvent(
      @JsonProperty("ref") String ref,
      @JsonProperty("before") String before,
      @JsonProperty("after") String after,
      @JsonProperty("created") boolean created,
      @JsonProperty("deleted") boolean deleted,
      @JsonProperty("forced") boolean forced,
      @JsonProperty("base_ref") String base_ref,
      @JsonProperty("compare") String compare,
      @JsonProperty("commits") Commit[] commits,
      @JsonProperty("head_commit") Commit head_commit,
      @JsonProperty("repository") Repository repository,
      @JsonProperty("pusher") Pusher pusher,
      @JsonProperty("sender") User sender) {
    this.ref = ref;
    this.before = before;
    this.after = after;
    this.created = created;
    this.deleted = deleted;
    this.forced = forced;
    this.base_ref = base_ref;
    this.compare = compare;
    this.commits = commits;
    this.head_commit = head_commit;
    this.repository = repository;
    this.pusher = pusher;
    this.sender = sender;
  }

  @Override
  public String toString() {
    return "PushEvent{"
        + "ref='"
        + ref
        + '\''
        + ", before='"
        + before
        + '\''
        + ", after='"
        + after
        + '\''
        + ", created="
        + created
        + ", deleted="
        + deleted
        + ", forced="
        + forced
        + ", base_ref='"
        + base_ref
        + '\''
        + ", compare='"
        + compare
        + '\''
        + ", commits="
        + Arrays.toString(commits)
        + ", head_commit="
        + head_commit
        + ", repository="
        + repository
        + ", pusher="
        + pusher
        + ", sender="
        + sender
        + '}';
  }
}
