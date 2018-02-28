package com.mizo0203.komeiji.domain;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mizo0203.komeiji.repo.github.data.PushEvent;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class CommitMessageTweetFormatTest {

  @Test
  public void format() throws IOException {
    String body =
        "{\n"
            + "  \"ref\": \"refs/heads/master\",\n"
            + "  \"before\": \"7437ea40aa36c0b471229fa9382e5b2ecf8fdbb2\",\n"
            + "  \"after\": \"7c4b6624d0990184affd9787a0f77f2e91b13d3b\",\n"
            + "  \"created\": false,\n"
            + "  \"deleted\": false,\n"
            + "  \"forced\": false,\n"
            + "  \"base_ref\": null,\n"
            + "  \"compare\": \"https://github.com/mizo0203/komeiji-bot/compare/7437ea40aa36...7c4b6624d099\",\n"
            + "  \"commits\": [\n"
            + "    {\n"
            + "      \"id\": \"e7d7ec9c4e5c15250f29f0796c331744cee4056e\",\n"
            + "      \"tree_id\": \"1eed98de0d8a1e625f2760f0b9df85f2a7ff4e70\",\n"
            + "      \"distinct\": true,\n"
            + "      \"message\": \"Parse tweet_create_events. fixes #344 @1h15m\",\n"
            + "      \"timestamp\": \"2018-02-26T22:08:01+09:00\",\n"
            + "      \"url\": \"https://github.com/mizo0203/komeiji-bot/commit/e7d7ec9c4e5c15250f29f0796c331744cee4056e\",\n"
            + "      \"author\": {\n"
            + "        \"name\": \"みぞ@CrazyBeatCoder\",\n"
            + "        \"email\": \"mizo0203@mizo0203.com\",\n"
            + "        \"username\": \"mizo0203\"\n"
            + "      },\n"
            + "      \"committer\": {\n"
            + "        \"name\": \"みぞ@CrazyBeatCoder\",\n"
            + "        \"email\": \"mizo0203@mizo0203.com\",\n"
            + "        \"username\": \"mizo0203\"\n"
            + "      },\n"
            + "      \"added\": [\n"
            + "        \"src/main/java/twitter4j/Twitter4JJSONUtil.java\"\n"
            + "      ],\n"
            + "      \"removed\": [\n"
            + "\n"
            + "      ],\n"
            + "      \"modified\": [\n"
            + "        \"src/main/java/com/mizo0203/twitter/account/activity/api/beta/samples/TwitterHookHandlerServlet.java\"\n"
            + "      ]\n"
            + "    },\n"
            + "    {\n"
            + "      \"id\": \"7c4b6624d0990184affd9787a0f77f2e91b13d3b\",\n"
            + "      \"tree_id\": \"cfea8b5fec447325aa9f9c6c9b8a3ba63bb0aa5a\",\n"
            + "      \"distinct\": true,\n"
            + "      \"message\": \"Merge branch 'master' of https://github.com/mizo0203/account-activity-api-beta-samples\",\n"
            + "      \"timestamp\": \"2018-02-26T22:09:40+09:00\",\n"
            + "      \"url\": \"https://github.com/mizo0203/komeiji-bot/commit/7c4b6624d0990184affd9787a0f77f2e91b13d3b\",\n"
            + "      \"author\": {\n"
            + "        \"name\": \"みぞ@CrazyBeatCoder\",\n"
            + "        \"email\": \"mizo0203@mizo0203.com\",\n"
            + "        \"username\": \"mizo0203\"\n"
            + "      },\n"
            + "      \"committer\": {\n"
            + "        \"name\": \"みぞ@CrazyBeatCoder\",\n"
            + "        \"email\": \"mizo0203@mizo0203.com\",\n"
            + "        \"username\": \"mizo0203\"\n"
            + "      },\n"
            + "      \"added\": [\n"
            + "        \"src/main/java/twitter4j/Twitter4JJSONUtil.java\"\n"
            + "      ],\n"
            + "      \"removed\": [\n"
            + "\n"
            + "      ],\n"
            + "      \"modified\": [\n"
            + "        \"src/main/java/com/mizo0203/komeiji/TwitterHookHandlerServlet.java\"\n"
            + "      ]\n"
            + "    }\n"
            + "  ],\n"
            + "  \"head_commit\": {\n"
            + "    \"id\": \"7c4b6624d0990184affd9787a0f77f2e91b13d3b\",\n"
            + "    \"tree_id\": \"cfea8b5fec447325aa9f9c6c9b8a3ba63bb0aa5a\",\n"
            + "    \"distinct\": true,\n"
            + "    \"message\": \"Merge branch 'master' of https://github.com/mizo0203/account-activity-api-beta-samples\",\n"
            + "    \"timestamp\": \"2018-02-26T22:09:40+09:00\",\n"
            + "    \"url\": \"https://github.com/mizo0203/komeiji-bot/commit/7c4b6624d0990184affd9787a0f77f2e91b13d3b\",\n"
            + "    \"author\": {\n"
            + "      \"name\": \"みぞ@CrazyBeatCoder\",\n"
            + "      \"email\": \"mizo0203@mizo0203.com\",\n"
            + "      \"username\": \"mizo0203\"\n"
            + "    },\n"
            + "    \"committer\": {\n"
            + "      \"name\": \"みぞ@CrazyBeatCoder\",\n"
            + "      \"email\": \"mizo0203@mizo0203.com\",\n"
            + "      \"username\": \"mizo0203\"\n"
            + "    },\n"
            + "    \"added\": [\n"
            + "      \"src/main/java/twitter4j/Twitter4JJSONUtil.java\"\n"
            + "    ],\n"
            + "    \"removed\": [\n"
            + "\n"
            + "    ],\n"
            + "    \"modified\": [\n"
            + "      \"src/main/java/com/mizo0203/komeiji/TwitterHookHandlerServlet.java\"\n"
            + "    ]\n"
            + "  },\n"
            + "  \"repository\": {\n"
            + "    \"id\": 122714802,\n"
            + "    \"name\": \"komeiji-bot\",\n"
            + "    \"full_name\": \"mizo0203/komeiji-bot\",\n"
            + "    \"owner\": {\n"
            + "      \"name\": \"mizo0203\",\n"
            + "      \"email\": \"mizo0203@mizo0203.com\",\n"
            + "      \"login\": \"mizo0203\",\n"
            + "      \"id\": 3683707,\n"
            + "      \"avatar_url\": \"https://avatars0.githubusercontent.com/u/3683707?v=4\",\n"
            + "      \"gravatar_id\": \"\",\n"
            + "      \"url\": \"https://api.github.com/users/mizo0203\",\n"
            + "      \"html_url\": \"https://github.com/mizo0203\",\n"
            + "      \"followers_url\": \"https://api.github.com/users/mizo0203/followers\",\n"
            + "      \"following_url\": \"https://api.github.com/users/mizo0203/following{/other_user}\",\n"
            + "      \"gists_url\": \"https://api.github.com/users/mizo0203/gists{/gist_id}\",\n"
            + "      \"starred_url\": \"https://api.github.com/users/mizo0203/starred{/owner}{/repo}\",\n"
            + "      \"subscriptions_url\": \"https://api.github.com/users/mizo0203/subscriptions\",\n"
            + "      \"organizations_url\": \"https://api.github.com/users/mizo0203/orgs\",\n"
            + "      \"repos_url\": \"https://api.github.com/users/mizo0203/repos\",\n"
            + "      \"events_url\": \"https://api.github.com/users/mizo0203/events{/privacy}\",\n"
            + "      \"received_events_url\": \"https://api.github.com/users/mizo0203/received_events\",\n"
            + "      \"type\": \"User\",\n"
            + "      \"site_admin\": false\n"
            + "    },\n"
            + "    \"private\": false,\n"
            + "    \"html_url\": \"https://github.com/mizo0203/komeiji-bot\",\n"
            + "    \"description\": null,\n"
            + "    \"fork\": false,\n"
            + "    \"url\": \"https://github.com/mizo0203/komeiji-bot\",\n"
            + "    \"forks_url\": \"https://api.github.com/repos/mizo0203/komeiji-bot/forks\",\n"
            + "    \"keys_url\": \"https://api.github.com/repos/mizo0203/komeiji-bot/keys{/key_id}\",\n"
            + "    \"collaborators_url\": \"https://api.github.com/repos/mizo0203/komeiji-bot/collaborators{/collaborator}\",\n"
            + "    \"teams_url\": \"https://api.github.com/repos/mizo0203/komeiji-bot/teams\",\n"
            + "    \"hooks_url\": \"https://api.github.com/repos/mizo0203/komeiji-bot/hooks\",\n"
            + "    \"issue_events_url\": \"https://api.github.com/repos/mizo0203/komeiji-bot/issues/events{/number}\",\n"
            + "    \"events_url\": \"https://api.github.com/repos/mizo0203/komeiji-bot/events\",\n"
            + "    \"assignees_url\": \"https://api.github.com/repos/mizo0203/komeiji-bot/assignees{/user}\",\n"
            + "    \"branches_url\": \"https://api.github.com/repos/mizo0203/komeiji-bot/branches{/branch}\",\n"
            + "    \"tags_url\": \"https://api.github.com/repos/mizo0203/komeiji-bot/tags\",\n"
            + "    \"blobs_url\": \"https://api.github.com/repos/mizo0203/komeiji-bot/git/blobs{/sha}\",\n"
            + "    \"git_tags_url\": \"https://api.github.com/repos/mizo0203/komeiji-bot/git/tags{/sha}\",\n"
            + "    \"git_refs_url\": \"https://api.github.com/repos/mizo0203/komeiji-bot/git/refs{/sha}\",\n"
            + "    \"trees_url\": \"https://api.github.com/repos/mizo0203/komeiji-bot/git/trees{/sha}\",\n"
            + "    \"statuses_url\": \"https://api.github.com/repos/mizo0203/komeiji-bot/statuses/{sha}\",\n"
            + "    \"languages_url\": \"https://api.github.com/repos/mizo0203/komeiji-bot/languages\",\n"
            + "    \"stargazers_url\": \"https://api.github.com/repos/mizo0203/komeiji-bot/stargazers\",\n"
            + "    \"contributors_url\": \"https://api.github.com/repos/mizo0203/komeiji-bot/contributors\",\n"
            + "    \"subscribers_url\": \"https://api.github.com/repos/mizo0203/komeiji-bot/subscribers\",\n"
            + "    \"subscription_url\": \"https://api.github.com/repos/mizo0203/komeiji-bot/subscription\",\n"
            + "    \"commits_url\": \"https://api.github.com/repos/mizo0203/komeiji-bot/commits{/sha}\",\n"
            + "    \"git_commits_url\": \"https://api.github.com/repos/mizo0203/komeiji-bot/git/commits{/sha}\",\n"
            + "    \"comments_url\": \"https://api.github.com/repos/mizo0203/komeiji-bot/comments{/number}\",\n"
            + "    \"issue_comment_url\": \"https://api.github.com/repos/mizo0203/komeiji-bot/issues/comments{/number}\",\n"
            + "    \"contents_url\": \"https://api.github.com/repos/mizo0203/komeiji-bot/contents/{+path}\",\n"
            + "    \"compare_url\": \"https://api.github.com/repos/mizo0203/komeiji-bot/compare/{base}...{head}\",\n"
            + "    \"merges_url\": \"https://api.github.com/repos/mizo0203/komeiji-bot/merges\",\n"
            + "    \"archive_url\": \"https://api.github.com/repos/mizo0203/komeiji-bot/{archive_format}{/ref}\",\n"
            + "    \"downloads_url\": \"https://api.github.com/repos/mizo0203/komeiji-bot/downloads\",\n"
            + "    \"issues_url\": \"https://api.github.com/repos/mizo0203/komeiji-bot/issues{/number}\",\n"
            + "    \"pulls_url\": \"https://api.github.com/repos/mizo0203/komeiji-bot/pulls{/number}\",\n"
            + "    \"milestones_url\": \"https://api.github.com/repos/mizo0203/komeiji-bot/milestones{/number}\",\n"
            + "    \"notifications_url\": \"https://api.github.com/repos/mizo0203/komeiji-bot/notifications{?since,all,participating}\",\n"
            + "    \"labels_url\": \"https://api.github.com/repos/mizo0203/komeiji-bot/labels{/name}\",\n"
            + "    \"releases_url\": \"https://api.github.com/repos/mizo0203/komeiji-bot/releases{/id}\",\n"
            + "    \"deployments_url\": \"https://api.github.com/repos/mizo0203/komeiji-bot/deployments\",\n"
            + "    \"created_at\": 1519456797,\n"
            + "    \"updated_at\": \"2018-02-24T07:38:47Z\",\n"
            + "    \"pushed_at\": 1519650600,\n"
            + "    \"git_url\": \"git://github.com/mizo0203/komeiji-bot.git\",\n"
            + "    \"ssh_url\": \"git@github.com:mizo0203/komeiji-bot.git\",\n"
            + "    \"clone_url\": \"https://github.com/mizo0203/komeiji-bot.git\",\n"
            + "    \"svn_url\": \"https://github.com/mizo0203/komeiji-bot\",\n"
            + "    \"homepage\": \"http://redmine.mizo0203.com/projects/komeiji-bot\",\n"
            + "    \"size\": 68,\n"
            + "    \"stargazers_count\": 0,\n"
            + "    \"watchers_count\": 0,\n"
            + "    \"language\": \"Java\",\n"
            + "    \"has_issues\": false,\n"
            + "    \"has_projects\": false,\n"
            + "    \"has_downloads\": true,\n"
            + "    \"has_wiki\": true,\n"
            + "    \"has_pages\": false,\n"
            + "    \"forks_count\": 0,\n"
            + "    \"mirror_url\": null,\n"
            + "    \"archived\": false,\n"
            + "    \"open_issues_count\": 0,\n"
            + "    \"license\": {\n"
            + "      \"key\": \"apache-2.0\",\n"
            + "      \"name\": \"Apache License 2.0\",\n"
            + "      \"spdx_id\": \"Apache-2.0\",\n"
            + "      \"url\": \"https://api.github.com/licenses/apache-2.0\"\n"
            + "    },\n"
            + "    \"forks\": 0,\n"
            + "    \"open_issues\": 0,\n"
            + "    \"watchers\": 0,\n"
            + "    \"default_branch\": \"master\",\n"
            + "    \"stargazers\": 0,\n"
            + "    \"master_branch\": \"master\"\n"
            + "  },\n"
            + "  \"pusher\": {\n"
            + "    \"name\": \"mizo0203\",\n"
            + "    \"email\": \"mizo0203@mizo0203.com\"\n"
            + "  },\n"
            + "  \"sender\": {\n"
            + "    \"login\": \"mizo0203\",\n"
            + "    \"id\": 3683707,\n"
            + "    \"avatar_url\": \"https://avatars0.githubusercontent.com/u/3683707?v=4\",\n"
            + "    \"gravatar_id\": \"\",\n"
            + "    \"url\": \"https://api.github.com/users/mizo0203\",\n"
            + "    \"html_url\": \"https://github.com/mizo0203\",\n"
            + "    \"followers_url\": \"https://api.github.com/users/mizo0203/followers\",\n"
            + "    \"following_url\": \"https://api.github.com/users/mizo0203/following{/other_user}\",\n"
            + "    \"gists_url\": \"https://api.github.com/users/mizo0203/gists{/gist_id}\",\n"
            + "    \"starred_url\": \"https://api.github.com/users/mizo0203/starred{/owner}{/repo}\",\n"
            + "    \"subscriptions_url\": \"https://api.github.com/users/mizo0203/subscriptions\",\n"
            + "    \"organizations_url\": \"https://api.github.com/users/mizo0203/orgs\",\n"
            + "    \"repos_url\": \"https://api.github.com/users/mizo0203/repos\",\n"
            + "    \"events_url\": \"https://api.github.com/users/mizo0203/events{/privacy}\",\n"
            + "    \"received_events_url\": \"https://api.github.com/users/mizo0203/received_events\",\n"
            + "    \"type\": \"User\",\n"
            + "    \"site_admin\": false\n"
            + "  }\n"
            + "}";
    PushEvent pushEvent = new ObjectMapper().readValue(body, PushEvent.class);
    assertEquals(
        "https://github.com/mizo0203/komeiji-bot/commit/e7d7ec9c4e5c15250f29f0796c331744cee4056e Parse tweet_create_events. fixes #344 @1h15m",
        new CommitMessageTweetFormat().format(pushEvent.getCommits()[0]));
    assertEquals(
        "https://github.com/mizo0203/komeiji-bot/commit/7c4b6624d0990184affd9787a0f77f2e91b13d3b Merge branch 'master' of https://github.com/mizo0203/account-activity-api-beta-samples",
        new CommitMessageTweetFormat().format(pushEvent.getCommits()[1]));
  }
}
