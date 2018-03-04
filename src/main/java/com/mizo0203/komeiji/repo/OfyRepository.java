package com.mizo0203.komeiji.repo;

import com.googlecode.objectify.ObjectifyService;
import com.mizo0203.komeiji.repo.objectify.entity.CommitCommentEventEntity;
import com.mizo0203.komeiji.repo.objectify.entity.CommitEventEntity;

public class OfyRepository {
  private static final OfyRepository ourInstance = new OfyRepository();

  private OfyRepository() {}

  public static OfyRepository getInstance() {
    return ourInstance;
  }

  public void saveCommitEventEntity(CommitEventEntity entity) {
    ObjectifyService.ofy().save().entity(entity).now();
  }

  public CommitEventEntity loadCommitEventEntity(long statusId) {
    return ObjectifyService.ofy().load().type(CommitEventEntity.class).id(statusId).now();
  }

  public void saveCommitCommentEventEntity(CommitCommentEventEntity entity) {
    ObjectifyService.ofy().save().entity(entity).now();
  }

  public CommitCommentEventEntity loadCommitCommentEventEntity(long statusId) {
    return ObjectifyService.ofy().load().type(CommitCommentEventEntity.class).id(statusId).now();
  }
}
