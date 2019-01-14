package com.mizo0203.komeiji.repo.github.data;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class Repository {
  private final int id;
  private final String node_id;
  private final String name;
  private final String full_name;
  private final User owner;
  private final boolean private_value;
  private final String html_url;
  private final String description;
  private final boolean fork;
  private final String url;
  private final String forks_url;
  private final String keys_url;
  private final String collaborators_url;
  private final String teams_url;
  private final String hooks_url;
  private final String issue_events_url;
  private final String events_url;
  private final String assignees_url;
  private final String branches_url;
  private final String tags_url;
  private final String blobs_url;
  private final String git_tags_url;
  private final String git_refs_url;
  private final String trees_url;
  private final String statuses_url;
  private final String languages_url;
  private final String stargazers_url;
  private final String contributors_url;
  private final String subscribers_url;
  private final String subscription_url;
  private final String commits_url;
  private final String git_commits_url;
  private final String comments_url;
  private final String issue_comment_url;
  private final String contents_url;
  private final String compare_url;
  private final String merges_url;
  private final String archive_url;
  private final String downloads_url;
  private final String issues_url;
  private final String pulls_url;
  private final String milestones_url;
  private final String notifications_url;
  private final String labels_url;
  private final String releases_url;
  private final String deployments_url;
  private final String created_at;
  private final String updated_at;
  private final String pushed_at;
  private final String git_url;
  private final String ssh_url;
  private final String clone_url;
  private final String svn_url;
  private final String homepage;
  private final int size;
  private final int stargazers_count;
  private final int watchers_count;
  private final String language;
  private final boolean has_issues;
  private final boolean has_projects;
  private final boolean has_downloads;
  private final boolean has_wiki;
  private final boolean has_pages;
  private final int forks_count;
  private final String mirror_url;
  private final boolean archived;
  private final int open_issues_count;
  private final License license;
  private final int forks;
  private final int open_issues;
  private final int watchers;
  private final String default_branch;
  private final int stargazers;
  private final String master_branch;

  @JsonCreator
  public Repository(
      @JsonProperty("name") String name,
      @JsonProperty("id") int id,
      @JsonProperty("node_id") String node_id,
      @JsonProperty("full_name") String full_name,
      @JsonProperty("owner") User owner,
      @JsonProperty("private") boolean private_value,
      @JsonProperty("html_url") String html_url,
      @JsonProperty("description") String description,
      @JsonProperty("fork") boolean fork,
      @JsonProperty("url") String url,
      @JsonProperty("forks_url") String forks_url,
      @JsonProperty("keys_url") String keys_url,
      @JsonProperty("collaborators_url") String collaborators_url,
      @JsonProperty("teams_url") String teams_url,
      @JsonProperty("hooks_url") String hooks_url,
      @JsonProperty("issue_events_url") String issue_events_url,
      @JsonProperty("events_url") String events_url,
      @JsonProperty("assignees_url") String assignees_url,
      @JsonProperty("branches_url") String branches_url,
      @JsonProperty("tags_url") String tags_url,
      @JsonProperty("blobs_url") String blobs_url,
      @JsonProperty("git_tags_url") String git_tags_url,
      @JsonProperty("git_refs_url") String git_refs_url,
      @JsonProperty("trees_url") String trees_url,
      @JsonProperty("statuses_url") String statuses_url,
      @JsonProperty("languages_url") String languages_url,
      @JsonProperty("stargazers_url") String stargazers_url,
      @JsonProperty("contributors_url") String contributors_url,
      @JsonProperty("subscribers_url") String subscribers_url,
      @JsonProperty("subscription_url") String subscription_url,
      @JsonProperty("commits_url") String commits_url,
      @JsonProperty("git_commits_url") String git_commits_url,
      @JsonProperty("comments_url") String comments_url,
      @JsonProperty("issue_comment_url") String issue_comment_url,
      @JsonProperty("contents_url") String contents_url,
      @JsonProperty("compare_url") String compare_url,
      @JsonProperty("merges_url") String merges_url,
      @JsonProperty("archive_url") String archive_url,
      @JsonProperty("downloads_url") String downloads_url,
      @JsonProperty("issues_url") String issues_url,
      @JsonProperty("pulls_url") String pulls_url,
      @JsonProperty("milestones_url") String milestones_url,
      @JsonProperty("notifications_url") String notifications_url,
      @JsonProperty("labels_url") String labels_url,
      @JsonProperty("releases_url") String releases_url,
      @JsonProperty("deployments_url") String deployments_url,
      @JsonProperty("created_at") String created_at,
      @JsonProperty("updated_at") String updated_at,
      @JsonProperty("pushed_at") String pushed_at,
      @JsonProperty("git_url") String git_url,
      @JsonProperty("ssh_url") String ssh_url,
      @JsonProperty("clone_url") String clone_url,
      @JsonProperty("svn_url") String svn_url,
      @JsonProperty("homepage") String homepage,
      @JsonProperty("size") int size,
      @JsonProperty("stargazers_count") int stargazers_count,
      @JsonProperty("watchers_count") int watchers_count,
      @JsonProperty("language") String language,
      @JsonProperty("has_issues") boolean has_issues,
      @JsonProperty("has_projects") boolean has_projects,
      @JsonProperty("has_downloads") boolean has_downloads,
      @JsonProperty("has_wiki") boolean has_wiki,
      @JsonProperty("has_pages") boolean has_pages,
      @JsonProperty("forks_count") int forks_count,
      @JsonProperty("mirror_url") String mirror_url,
      @JsonProperty("archived") boolean archived,
      @JsonProperty("open_issues_count") int open_issues_count,
      @JsonProperty("license") License license,
      @JsonProperty("forks") int forks,
      @JsonProperty("open_issues") int open_issues,
      @JsonProperty("watchers") int watchers,
      @JsonProperty("default_branch") String default_branch,
      @JsonProperty("stargazers") int stargazers,
      @JsonProperty("master_branch") String master_branch) {
    this.id = id;
    this.node_id = node_id;
    this.name = name;
    this.full_name = full_name;
    this.owner = owner;
    this.private_value = private_value;
    this.html_url = html_url;
    this.description = description;
    this.fork = fork;
    this.url = url;
    this.forks_url = forks_url;
    this.keys_url = keys_url;
    this.collaborators_url = collaborators_url;
    this.teams_url = teams_url;
    this.hooks_url = hooks_url;
    this.issue_events_url = issue_events_url;
    this.events_url = events_url;
    this.assignees_url = assignees_url;
    this.branches_url = branches_url;
    this.tags_url = tags_url;
    this.blobs_url = blobs_url;
    this.git_tags_url = git_tags_url;
    this.git_refs_url = git_refs_url;
    this.trees_url = trees_url;
    this.statuses_url = statuses_url;
    this.languages_url = languages_url;
    this.stargazers_url = stargazers_url;
    this.contributors_url = contributors_url;
    this.subscribers_url = subscribers_url;
    this.subscription_url = subscription_url;
    this.commits_url = commits_url;
    this.git_commits_url = git_commits_url;
    this.comments_url = comments_url;
    this.issue_comment_url = issue_comment_url;
    this.contents_url = contents_url;
    this.compare_url = compare_url;
    this.merges_url = merges_url;
    this.archive_url = archive_url;
    this.downloads_url = downloads_url;
    this.issues_url = issues_url;
    this.pulls_url = pulls_url;
    this.milestones_url = milestones_url;
    this.notifications_url = notifications_url;
    this.labels_url = labels_url;
    this.releases_url = releases_url;
    this.deployments_url = deployments_url;
    this.created_at = created_at;
    this.updated_at = updated_at;
    this.pushed_at = pushed_at;
    this.git_url = git_url;
    this.ssh_url = ssh_url;
    this.clone_url = clone_url;
    this.svn_url = svn_url;
    this.homepage = homepage;
    this.size = size;
    this.stargazers_count = stargazers_count;
    this.watchers_count = watchers_count;
    this.language = language;
    this.has_issues = has_issues;
    this.has_projects = has_projects;
    this.has_downloads = has_downloads;
    this.has_wiki = has_wiki;
    this.has_pages = has_pages;
    this.forks_count = forks_count;
    this.mirror_url = mirror_url;
    this.archived = archived;
    this.open_issues_count = open_issues_count;
    this.license = license;
    this.forks = forks;
    this.open_issues = open_issues;
    this.watchers = watchers;
    this.default_branch = default_branch;
    this.stargazers = stargazers;
    this.master_branch = master_branch;
  }

  public int getId() {
    return id;
  }

  public String getNodeId() {
    return node_id;
  }

  public String getName() {
    return name;
  }

  public String getFull_name() {
    return full_name;
  }

  public User getOwner() {
    return owner;
  }

  public boolean isPrivate_value() {
    return private_value;
  }

  public String getHtml_url() {
    return html_url;
  }

  public String getDescription() {
    return description;
  }

  public boolean isFork() {
    return fork;
  }

  public String getUrl() {
    return url;
  }

  public String getForks_url() {
    return forks_url;
  }

  public String getKeys_url() {
    return keys_url;
  }

  public String getCollaborators_url() {
    return collaborators_url;
  }

  public String getTeams_url() {
    return teams_url;
  }

  public String getHooks_url() {
    return hooks_url;
  }

  public String getIssue_events_url() {
    return issue_events_url;
  }

  public String getEvents_url() {
    return events_url;
  }

  public String getAssignees_url() {
    return assignees_url;
  }

  public String getBranches_url() {
    return branches_url;
  }

  public String getTags_url() {
    return tags_url;
  }

  public String getBlobs_url() {
    return blobs_url;
  }

  public String getGit_tags_url() {
    return git_tags_url;
  }

  public String getGit_refs_url() {
    return git_refs_url;
  }

  public String getTrees_url() {
    return trees_url;
  }

  public String getStatuses_url() {
    return statuses_url;
  }

  public String getLanguages_url() {
    return languages_url;
  }

  public String getStargazers_url() {
    return stargazers_url;
  }

  public String getContributors_url() {
    return contributors_url;
  }

  public String getSubscribers_url() {
    return subscribers_url;
  }

  public String getSubscription_url() {
    return subscription_url;
  }

  public String getCommits_url() {
    return commits_url;
  }

  public String getGit_commits_url() {
    return git_commits_url;
  }

  public String getComments_url() {
    return comments_url;
  }

  public String getIssue_comment_url() {
    return issue_comment_url;
  }

  public String getContents_url() {
    return contents_url;
  }

  public String getCompare_url() {
    return compare_url;
  }

  public String getMerges_url() {
    return merges_url;
  }

  public String getArchive_url() {
    return archive_url;
  }

  public String getDownloads_url() {
    return downloads_url;
  }

  public String getIssues_url() {
    return issues_url;
  }

  public String getPulls_url() {
    return pulls_url;
  }

  public String getMilestones_url() {
    return milestones_url;
  }

  public String getNotifications_url() {
    return notifications_url;
  }

  public String getLabels_url() {
    return labels_url;
  }

  public String getReleases_url() {
    return releases_url;
  }

  public String getDeployments_url() {
    return deployments_url;
  }

  public String getCreated_at() {
    return created_at;
  }

  public String getUpdated_at() {
    return updated_at;
  }

  public String getPushed_at() {
    return pushed_at;
  }

  public String getGit_url() {
    return git_url;
  }

  public String getSsh_url() {
    return ssh_url;
  }

  public String getClone_url() {
    return clone_url;
  }

  public String getSvn_url() {
    return svn_url;
  }

  public String getHomepage() {
    return homepage;
  }

  public int getSize() {
    return size;
  }

  public int getStargazers_count() {
    return stargazers_count;
  }

  public int getWatchers_count() {
    return watchers_count;
  }

  public String getLanguage() {
    return language;
  }

  public boolean isHas_issues() {
    return has_issues;
  }

  public boolean isHas_projects() {
    return has_projects;
  }

  public boolean isHas_downloads() {
    return has_downloads;
  }

  public boolean isHas_wiki() {
    return has_wiki;
  }

  public boolean isHas_pages() {
    return has_pages;
  }

  public int getForks_count() {
    return forks_count;
  }

  public String getMirror_url() {
    return mirror_url;
  }

  public boolean isArchived() {
    return archived;
  }

  public int getOpen_issues_count() {
    return open_issues_count;
  }

  public License getLicense() {
    return license;
  }

  public int getForks() {
    return forks;
  }

  public int getOpen_issues() {
    return open_issues;
  }

  public int getWatchers() {
    return watchers;
  }

  public String getDefault_branch() {
    return default_branch;
  }

  public int getStargazers() {
    return stargazers;
  }

  public String getMaster_branch() {
    return master_branch;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Repository that = (Repository) o;
    return id == that.id
        && Objects.equals(node_id, that.node_id)
        && private_value == that.private_value
        && fork == that.fork
        && size == that.size
        && stargazers_count == that.stargazers_count
        && watchers_count == that.watchers_count
        && has_issues == that.has_issues
        && has_projects == that.has_projects
        && has_downloads == that.has_downloads
        && has_wiki == that.has_wiki
        && has_pages == that.has_pages
        && forks_count == that.forks_count
        && archived == that.archived
        && open_issues_count == that.open_issues_count
        && forks == that.forks
        && open_issues == that.open_issues
        && watchers == that.watchers
        && stargazers == that.stargazers
        && Objects.equals(name, that.name)
        && Objects.equals(full_name, that.full_name)
        && Objects.equals(owner, that.owner)
        && Objects.equals(html_url, that.html_url)
        && Objects.equals(description, that.description)
        && Objects.equals(url, that.url)
        && Objects.equals(forks_url, that.forks_url)
        && Objects.equals(keys_url, that.keys_url)
        && Objects.equals(collaborators_url, that.collaborators_url)
        && Objects.equals(teams_url, that.teams_url)
        && Objects.equals(hooks_url, that.hooks_url)
        && Objects.equals(issue_events_url, that.issue_events_url)
        && Objects.equals(events_url, that.events_url)
        && Objects.equals(assignees_url, that.assignees_url)
        && Objects.equals(branches_url, that.branches_url)
        && Objects.equals(tags_url, that.tags_url)
        && Objects.equals(blobs_url, that.blobs_url)
        && Objects.equals(git_tags_url, that.git_tags_url)
        && Objects.equals(git_refs_url, that.git_refs_url)
        && Objects.equals(trees_url, that.trees_url)
        && Objects.equals(statuses_url, that.statuses_url)
        && Objects.equals(languages_url, that.languages_url)
        && Objects.equals(stargazers_url, that.stargazers_url)
        && Objects.equals(contributors_url, that.contributors_url)
        && Objects.equals(subscribers_url, that.subscribers_url)
        && Objects.equals(subscription_url, that.subscription_url)
        && Objects.equals(commits_url, that.commits_url)
        && Objects.equals(git_commits_url, that.git_commits_url)
        && Objects.equals(comments_url, that.comments_url)
        && Objects.equals(issue_comment_url, that.issue_comment_url)
        && Objects.equals(contents_url, that.contents_url)
        && Objects.equals(compare_url, that.compare_url)
        && Objects.equals(merges_url, that.merges_url)
        && Objects.equals(archive_url, that.archive_url)
        && Objects.equals(downloads_url, that.downloads_url)
        && Objects.equals(issues_url, that.issues_url)
        && Objects.equals(pulls_url, that.pulls_url)
        && Objects.equals(milestones_url, that.milestones_url)
        && Objects.equals(notifications_url, that.notifications_url)
        && Objects.equals(labels_url, that.labels_url)
        && Objects.equals(releases_url, that.releases_url)
        && Objects.equals(deployments_url, that.deployments_url)
        && Objects.equals(created_at, that.created_at)
        && Objects.equals(updated_at, that.updated_at)
        && Objects.equals(pushed_at, that.pushed_at)
        && Objects.equals(git_url, that.git_url)
        && Objects.equals(ssh_url, that.ssh_url)
        && Objects.equals(clone_url, that.clone_url)
        && Objects.equals(svn_url, that.svn_url)
        && Objects.equals(homepage, that.homepage)
        && Objects.equals(language, that.language)
        && Objects.equals(mirror_url, that.mirror_url)
        && Objects.equals(license, that.license)
        && Objects.equals(default_branch, that.default_branch)
        && Objects.equals(master_branch, that.master_branch);
  }

  @Override
  public int hashCode() {

    return Objects.hash(
        id,
        node_id,
        name,
        full_name,
        owner,
        private_value,
        html_url,
        description,
        fork,
        url,
        forks_url,
        keys_url,
        collaborators_url,
        teams_url,
        hooks_url,
        issue_events_url,
        events_url,
        assignees_url,
        branches_url,
        tags_url,
        blobs_url,
        git_tags_url,
        git_refs_url,
        trees_url,
        statuses_url,
        languages_url,
        stargazers_url,
        contributors_url,
        subscribers_url,
        subscription_url,
        commits_url,
        git_commits_url,
        comments_url,
        issue_comment_url,
        contents_url,
        compare_url,
        merges_url,
        archive_url,
        downloads_url,
        issues_url,
        pulls_url,
        milestones_url,
        notifications_url,
        labels_url,
        releases_url,
        deployments_url,
        created_at,
        updated_at,
        pushed_at,
        git_url,
        ssh_url,
        clone_url,
        svn_url,
        homepage,
        size,
        stargazers_count,
        watchers_count,
        language,
        has_issues,
        has_projects,
        has_downloads,
        has_wiki,
        has_pages,
        forks_count,
        mirror_url,
        archived,
        open_issues_count,
        license,
        forks,
        open_issues,
        watchers,
        default_branch,
        stargazers,
        master_branch);
  }

  @Override
  public String toString() {
    return "Repository{"
        + "id="
        + id
        + ", node_id='"
        + node_id
        + '\''
        + ", name='"
        + name
        + '\''
        + ", full_name='"
        + full_name
        + '\''
        + ", owner="
        + owner
        + ", private_value="
        + private_value
        + ", html_url='"
        + html_url
        + '\''
        + ", description='"
        + description
        + '\''
        + ", fork="
        + fork
        + ", url='"
        + url
        + '\''
        + ", forks_url='"
        + forks_url
        + '\''
        + ", keys_url='"
        + keys_url
        + '\''
        + ", collaborators_url='"
        + collaborators_url
        + '\''
        + ", teams_url='"
        + teams_url
        + '\''
        + ", hooks_url='"
        + hooks_url
        + '\''
        + ", issue_events_url='"
        + issue_events_url
        + '\''
        + ", events_url='"
        + events_url
        + '\''
        + ", assignees_url='"
        + assignees_url
        + '\''
        + ", branches_url='"
        + branches_url
        + '\''
        + ", tags_url='"
        + tags_url
        + '\''
        + ", blobs_url='"
        + blobs_url
        + '\''
        + ", git_tags_url='"
        + git_tags_url
        + '\''
        + ", git_refs_url='"
        + git_refs_url
        + '\''
        + ", trees_url='"
        + trees_url
        + '\''
        + ", statuses_url='"
        + statuses_url
        + '\''
        + ", languages_url='"
        + languages_url
        + '\''
        + ", stargazers_url='"
        + stargazers_url
        + '\''
        + ", contributors_url='"
        + contributors_url
        + '\''
        + ", subscribers_url='"
        + subscribers_url
        + '\''
        + ", subscription_url='"
        + subscription_url
        + '\''
        + ", commits_url='"
        + commits_url
        + '\''
        + ", git_commits_url='"
        + git_commits_url
        + '\''
        + ", comments_url='"
        + comments_url
        + '\''
        + ", issue_comment_url='"
        + issue_comment_url
        + '\''
        + ", contents_url='"
        + contents_url
        + '\''
        + ", compare_url='"
        + compare_url
        + '\''
        + ", merges_url='"
        + merges_url
        + '\''
        + ", archive_url='"
        + archive_url
        + '\''
        + ", downloads_url='"
        + downloads_url
        + '\''
        + ", issues_url='"
        + issues_url
        + '\''
        + ", pulls_url='"
        + pulls_url
        + '\''
        + ", milestones_url='"
        + milestones_url
        + '\''
        + ", notifications_url='"
        + notifications_url
        + '\''
        + ", labels_url='"
        + labels_url
        + '\''
        + ", releases_url='"
        + releases_url
        + '\''
        + ", deployments_url='"
        + deployments_url
        + '\''
        + ", created_at='"
        + created_at
        + '\''
        + ", updated_at='"
        + updated_at
        + '\''
        + ", pushed_at='"
        + pushed_at
        + '\''
        + ", git_url='"
        + git_url
        + '\''
        + ", ssh_url='"
        + ssh_url
        + '\''
        + ", clone_url='"
        + clone_url
        + '\''
        + ", svn_url='"
        + svn_url
        + '\''
        + ", homepage='"
        + homepage
        + '\''
        + ", size="
        + size
        + ", stargazers_count="
        + stargazers_count
        + ", watchers_count="
        + watchers_count
        + ", language='"
        + language
        + '\''
        + ", has_issues="
        + has_issues
        + ", has_projects="
        + has_projects
        + ", has_downloads="
        + has_downloads
        + ", has_wiki="
        + has_wiki
        + ", has_pages="
        + has_pages
        + ", forks_count="
        + forks_count
        + ", mirror_url='"
        + mirror_url
        + '\''
        + ", archived="
        + archived
        + ", open_issues_count="
        + open_issues_count
        + ", license="
        + license
        + ", forks="
        + forks
        + ", open_issues="
        + open_issues
        + ", watchers="
        + watchers
        + ", default_branch='"
        + default_branch
        + '\''
        + ", stargazers="
        + stargazers
        + ", master_branch='"
        + master_branch
        + '\''
        + '}';
  }
}
