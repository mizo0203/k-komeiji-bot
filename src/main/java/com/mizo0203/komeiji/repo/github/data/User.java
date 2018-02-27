package com.mizo0203.komeiji.repo.github.data;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class User extends Pusher {
  private final String login;
  private final int id;
  private final String avatar_url;
  private final String gravatar_id;
  private final String url;
  private final String html_url;
  private final String followers_url;
  private final String following_url;
  private final String gists_url;
  private final String starred_url;
  private final String subscriptions_url;
  private final String organizations_url;
  private final String repos_url;
  private final String events_url;
  private final String received_events_url;
  private final String type;
  private final boolean site_admin;

  @JsonCreator
  public User(
      @JsonProperty("name") String name,
      @JsonProperty("email") String email,
      @JsonProperty("login") String login,
      @JsonProperty("id") int id,
      @JsonProperty("avatar_url") String avatar_url,
      @JsonProperty("gravatar_id") String gravatar_id,
      @JsonProperty("url") String url,
      @JsonProperty("html_url") String html_url,
      @JsonProperty("followers_url") String followers_url,
      @JsonProperty("following_url") String following_url,
      @JsonProperty("gists_url") String gists_url,
      @JsonProperty("starred_url") String starred_url,
      @JsonProperty("subscriptions_url") String subscriptions_url,
      @JsonProperty("organizations_url") String organizations_url,
      @JsonProperty("repos_url") String repos_url,
      @JsonProperty("events_url") String events_url,
      @JsonProperty("received_events_url") String received_events_url,
      @JsonProperty("type") String type,
      @JsonProperty("site_admin") boolean site_admin) {
    super(name, email);
    this.login = login;
    this.id = id;
    this.avatar_url = avatar_url;
    this.gravatar_id = gravatar_id;
    this.url = url;
    this.html_url = html_url;
    this.followers_url = followers_url;
    this.following_url = following_url;
    this.gists_url = gists_url;
    this.starred_url = starred_url;
    this.subscriptions_url = subscriptions_url;
    this.organizations_url = organizations_url;
    this.repos_url = repos_url;
    this.events_url = events_url;
    this.received_events_url = received_events_url;
    this.type = type;
    this.site_admin = site_admin;
  }

  @Override
  public String toString() {
    return "User{"
        + "login='"
        + login
        + '\''
        + ", id="
        + id
        + ", avatar_url='"
        + avatar_url
        + '\''
        + ", gravatar_id='"
        + gravatar_id
        + '\''
        + ", url='"
        + url
        + '\''
        + ", html_url='"
        + html_url
        + '\''
        + ", followers_url='"
        + followers_url
        + '\''
        + ", following_url='"
        + following_url
        + '\''
        + ", gists_url='"
        + gists_url
        + '\''
        + ", starred_url='"
        + starred_url
        + '\''
        + ", subscriptions_url='"
        + subscriptions_url
        + '\''
        + ", organizations_url='"
        + organizations_url
        + '\''
        + ", repos_url='"
        + repos_url
        + '\''
        + ", events_url='"
        + events_url
        + '\''
        + ", received_events_url='"
        + received_events_url
        + '\''
        + ", type='"
        + type
        + '\''
        + ", site_admin="
        + site_admin
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
    User user = (User) o;
    return id == user.id
        && site_admin == user.site_admin
        && Objects.equals(login, user.login)
        && Objects.equals(avatar_url, user.avatar_url)
        && Objects.equals(gravatar_id, user.gravatar_id)
        && Objects.equals(url, user.url)
        && Objects.equals(html_url, user.html_url)
        && Objects.equals(followers_url, user.followers_url)
        && Objects.equals(following_url, user.following_url)
        && Objects.equals(gists_url, user.gists_url)
        && Objects.equals(starred_url, user.starred_url)
        && Objects.equals(subscriptions_url, user.subscriptions_url)
        && Objects.equals(organizations_url, user.organizations_url)
        && Objects.equals(repos_url, user.repos_url)
        && Objects.equals(events_url, user.events_url)
        && Objects.equals(received_events_url, user.received_events_url)
        && Objects.equals(type, user.type);
  }

  @Override
  public int hashCode() {

    return Objects.hash(
        login,
        id,
        avatar_url,
        gravatar_id,
        url,
        html_url,
        followers_url,
        following_url,
        gists_url,
        starred_url,
        subscriptions_url,
        organizations_url,
        repos_url,
        events_url,
        received_events_url,
        type,
        site_admin);
  }

  public String getLogin() {
    return login;
  }

  public int getId() {
    return id;
  }

  public String getAvatar_url() {
    return avatar_url;
  }

  public String getGravatar_id() {
    return gravatar_id;
  }

  public String getUrl() {
    return url;
  }

  public String getHtml_url() {
    return html_url;
  }

  public String getFollowers_url() {
    return followers_url;
  }

  public String getFollowing_url() {
    return following_url;
  }

  public String getGists_url() {
    return gists_url;
  }

  public String getStarred_url() {
    return starred_url;
  }

  public String getSubscriptions_url() {
    return subscriptions_url;
  }

  public String getOrganizations_url() {
    return organizations_url;
  }

  public String getRepos_url() {
    return repos_url;
  }

  public String getEvents_url() {
    return events_url;
  }

  public String getReceived_events_url() {
    return received_events_url;
  }

  public String getType() {
    return type;
  }

  public boolean isSite_admin() {
    return site_admin;
  }
}
