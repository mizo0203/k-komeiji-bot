package com.mizo0203.komeiji.repo.objectify.entity;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.mizo0203.komeiji.repo.objectify.OfyHelper;

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
public class KeyEntity {

  @Id private final String key;
  private final String value;

  @SuppressWarnings("unused")
  public KeyEntity() {
    // KeyEntity must have a no-arg constructor
    this.key = null;
    this.value = null;
  }

  public KeyEntity(String key, String value) {
    this.key = key;
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return "KeyEntity{" + "key='" + key + '\'' + ", value='" + value + '\'' + '}';
  }
}
