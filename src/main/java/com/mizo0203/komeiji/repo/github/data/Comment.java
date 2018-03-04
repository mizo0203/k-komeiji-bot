package com.mizo0203.komeiji.repo.github.data;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class Comment {
  private final String url;
  private final String html_url;
  private final int id;
  private final User user;
  private final String position;
  private final String line;
  private final String path;
  private final String commit_id;
  private final String created_at;
  private final String updated_at;
  private final String author_association;
  private final String body;

  @JsonCreator
  public Comment(
      @JsonProperty("url") String url,
      @JsonProperty("html_url") String html_url,
      @JsonProperty("id") int id,
      @JsonProperty("user") User user,
      @JsonProperty("position") String position,
      @JsonProperty("line") String line,
      @JsonProperty("path") String path,
      @JsonProperty("commit_id") String commit_id,
      @JsonProperty("created_at") String created_at,
      @JsonProperty("updated_at") String updated_at,
      @JsonProperty("author_association") String author_association,
      @JsonProperty("body") String body) {
    this.url = url;
    this.html_url = html_url;
    this.id = id;
    this.user = user;
    this.position = position;
    this.line = line;
    this.path = path;
    this.commit_id = commit_id;
    this.created_at = created_at;
    this.updated_at = updated_at;
    this.author_association = author_association;
    this.body = body;
  }

  @Override
  public String toString() {
    return "Comment{"
        + "url='"
        + url
        + '\''
        + ", html_url='"
        + html_url
        + '\''
        + ", id="
        + id
        + ", user="
        + user
        + ", position='"
        + position
        + '\''
        + ", line='"
        + line
        + '\''
        + ", path='"
        + path
        + '\''
        + ", commit_id='"
        + commit_id
        + '\''
        + ", created_at='"
        + created_at
        + '\''
        + ", updated_at='"
        + updated_at
        + '\''
        + ", author_association='"
        + author_association
        + '\''
        + ", body='"
        + body
        + '\''
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
    Comment comment = (Comment) o;
    return id == comment.id
        && Objects.equals(url, comment.url)
        && Objects.equals(html_url, comment.html_url)
        && Objects.equals(user, comment.user)
        && Objects.equals(position, comment.position)
        && Objects.equals(line, comment.line)
        && Objects.equals(path, comment.path)
        && Objects.equals(commit_id, comment.commit_id)
        && Objects.equals(created_at, comment.created_at)
        && Objects.equals(updated_at, comment.updated_at)
        && Objects.equals(author_association, comment.author_association)
        && Objects.equals(body, comment.body);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        url,
        html_url,
        id,
        user,
        position,
        line,
        path,
        commit_id,
        created_at,
        updated_at,
        author_association,
        body);
  }

  public String getHtml_url() {
    return html_url;
  }

  public int getId() {
    return id;
  }

  public String getPosition() {
    return position;
  }

  public String getPath() {
    return path;
  }

  public String getCommitId() {
    return commit_id;
  }

  public String getBody() {
    return body;
  }
}
