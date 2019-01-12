package com.mizo0203.komeiji.repo.github.data;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class License {
  private final String key;
  private final String name;
  private final String spdx_id;
  private final String url;
  private final String node_id;

  public License(
      @JsonProperty("key") String key,
      @JsonProperty("name") String name,
      @JsonProperty("spdx_id") String spdx_id,
      @JsonProperty("url") String url,
      @JsonProperty("node_id") String node_id) {
    this.key = key;
    this.name = name;
    this.spdx_id = spdx_id;
    this.url = url;
    this.node_id = node_id;
  }

  public String getKey() {
    return key;
  }

  public String getName() {
    return name;
  }

  public String getSpdx_id() {
    return spdx_id;
  }

  public String getUrl() {
    return url;
  }

  public String getNodeId() {
    return node_id;
  }

  @Override
  public String toString() {
    return "License{"
        + "key='"
        + key
        + '\''
        + ", name='"
        + name
        + '\''
        + ", spdx_id='"
        + spdx_id
        + '\''
        + ", url='"
        + url
        + '\''
        + ", node_id='"
        + node_id
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
    License license = (License) o;
    return Objects.equals(key, license.key)
        && Objects.equals(name, license.name)
        && Objects.equals(spdx_id, license.spdx_id)
        && Objects.equals(url, license.url)
        && Objects.equals(node_id, license.node_id);
  }

  @Override
  public int hashCode() {

    return Objects.hash(key, name, spdx_id, url, node_id);
  }
}
