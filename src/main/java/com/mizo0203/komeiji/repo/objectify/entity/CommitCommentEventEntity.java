package com.mizo0203.komeiji.repo.objectify.entity;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.mizo0203.komeiji.repo.objectify.OfyHelper;

import javax.annotation.Nullable;

/**
 * The @Entity tells Objectify about our entity. We also register it in {@link OfyHelper} Our
 * primary key @Id is set automatically by the Google Datastore for us.
 *
 * <p>We add a @Parent to tell the object about its ancestor. We are doing this to support many
 * guestbooks. Objectify, unlike the AppEngine library requires that you specify the fields you want
 * to index using @Index. Only indexing the fields you need can lead to substantial gains in
 * performance -- though if not indexing your data from the start will require indexing it later.
 *
 * <p>NOTE - all the properties are PUBLIC so that can keep the code simple.
 */
@Entity
public class CommitCommentEventEntity {

  @Id private final long statusId;
  private final String repositoryName;
  private final String commitId;
  @Nullable private final String commitPath;
  @Nullable private final String commitPosition;

  @SuppressWarnings("unused")
  public CommitCommentEventEntity() {
    // CommitEventEntity must have a no-arg constructor
    this.statusId = 0;
    this.repositoryName = null;
    this.commitId = null;
    this.commitPath = null;
    this.commitPosition = null;
  }

  public CommitCommentEventEntity(
      long statusId,
      String repositoryName,
      String commitId,
      @Nullable String commitPath,
      @Nullable String commitPosition) {
    this.statusId = statusId;
    this.repositoryName = repositoryName;
    this.commitId = commitId;
    this.commitPath = commitPath;
    this.commitPosition = commitPosition;
  }

  @Override
  public String toString() {
    return "CommitCommentEventEntity{"
        + "statusId="
        + statusId
        + ", repositoryName='"
        + repositoryName
        + '\''
        + ", commitId='"
        + commitId
        + '\''
        + ", commitPath='"
        + commitPath
        + '\''
        + ", commitPosition='"
        + commitPosition
        + '\''
        + '}';
  }
}
