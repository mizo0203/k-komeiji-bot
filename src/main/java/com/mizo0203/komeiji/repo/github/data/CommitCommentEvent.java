package com.mizo0203.komeiji.repo.github.data;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class CommitCommentEvent {
  private final String action;
  private final Comment comment;
  private final Repository repository;
  private final User sender;

  @JsonCreator
  public CommitCommentEvent(
      @JsonProperty("action") String action,
      @JsonProperty("comment") Comment comment,
      @JsonProperty("repository") Repository repository,
      @JsonProperty("sender") User sender) {
    this.action = action;
    this.comment = comment;
    this.repository = repository;
    this.sender = sender;
  }

  public String getAction() {
    return action;
  }

  public Comment getComment() {
    return comment;
  }

  public Repository getRepository() {
    return repository;
  }

  public User getSender() {
    return sender;
  }

  @Override
  public String toString() {
    return "CommitCommentEvent{"
        + "action='"
        + action
        + '\''
        + ", comment="
        + comment
        + ", repository="
        + repository
        + ", sender="
        + sender
        + '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommitCommentEvent that = (CommitCommentEvent) o;
    return Objects.equals(action, that.action)
        && Objects.equals(comment, that.comment)
        && Objects.equals(repository, that.repository)
        && Objects.equals(sender, that.sender);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, comment, repository, sender);
  }
}
