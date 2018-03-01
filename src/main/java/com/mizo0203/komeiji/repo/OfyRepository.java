package com.mizo0203.komeiji.repo;

import com.googlecode.objectify.ObjectifyService;
import com.mizo0203.komeiji.repo.objectify.entity.CommitEventEntity;

public class OfyRepository {
  private static final OfyRepository ourInstance = new OfyRepository();

  private OfyRepository() {}

  public static OfyRepository getInstance() {
    return ourInstance;
  }

  public void saveKeyEntity(CommitEventEntity entity) {
    ObjectifyService.ofy().save().entity(entity).now();
  }
}
