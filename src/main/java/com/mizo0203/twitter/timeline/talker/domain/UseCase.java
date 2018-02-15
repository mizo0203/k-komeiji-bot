package com.mizo0203.twitter.timeline.talker.domain;

import com.mizo0203.twitter.timeline.talker.repo.TwitterClient;

import java.util.logging.Logger;

public class UseCase implements AutoCloseable {
  private static final Logger LOG = Logger.getLogger(UseCase.class.getName());
  private final TwitterClient mTwitterClient;

  public UseCase() {
    mTwitterClient = new TwitterClient();
  }

  @Override
  public void close() {}

  public void registersWebhookURL() {
    mTwitterClient.registersWebhookURL();
  }

  public void subscriptions() {
    mTwitterClient.subscriptions();
  }
}
