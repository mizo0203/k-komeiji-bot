package com.mizo0203.komeiji.repo;

import com.googlecode.objectify.ObjectifyService;
import com.mizo0203.komeiji.repo.objectify.entity.CommitCommentEventEntity;
import com.mizo0203.komeiji.repo.objectify.entity.CommitEventEntity;
import com.mizo0203.komeiji.repo.objectify.entity.KeyEntity;

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

  public String loadKeyValue(String key) {
    KeyEntity keyEntity = ObjectifyService.ofy().load().type(KeyEntity.class).id(key).now();
    if (keyEntity == null) {
      keyEntity = new KeyEntity(key, "");
      ObjectifyService.ofy().save().entity(keyEntity).now();
    }
    return keyEntity.getValue();
  }
}
