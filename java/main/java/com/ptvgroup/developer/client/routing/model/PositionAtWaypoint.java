/*
 * Routing
 * With the Routing service you can calculate routes from A to B taking into account vehicle-specific restrictions, traffic situations, toll, emissions, drivers' working hours, service times and opening intervals.
 *
 * The version of the OpenAPI document: 1.35
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ptvgroup.developer.client.routing.model;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.StringJoiner;
import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.ptvgroup.developer.client.routing.ApiClient;
/**
 * The vehicle position if it is at a waypoint. This parameter is mutually exclusive with **position**.
 */
@JsonPropertyOrder({
  PositionAtWaypoint.JSON_PROPERTY_NAME,
  PositionAtWaypoint.JSON_PROPERTY_PERFORMED_SERVICE_TIME
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-10T12:36:28.857695240Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class PositionAtWaypoint {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PERFORMED_SERVICE_TIME = "performedServiceTime";
  private Integer performedServiceTime = 0;

  public PositionAtWaypoint() { 
  }

  public PositionAtWaypoint name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the waypoint.
   * @return name
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(String name) {
    this.name = name;
  }


  public PositionAtWaypoint performedServiceTime(Integer performedServiceTime) {
    this.performedServiceTime = performedServiceTime;
    return this;
  }

  /**
   * The service time [s] which has already been performed.
   * minimum: 0
   * @return performedServiceTime
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PERFORMED_SERVICE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getPerformedServiceTime() {
    return performedServiceTime;
  }


  @JsonProperty(JSON_PROPERTY_PERFORMED_SERVICE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPerformedServiceTime(Integer performedServiceTime) {
    this.performedServiceTime = performedServiceTime;
  }


  /**
   * Return true if this PositionAtWaypoint object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PositionAtWaypoint positionAtWaypoint = (PositionAtWaypoint) o;
    return Objects.equals(this.name, positionAtWaypoint.name) &&
        Objects.equals(this.performedServiceTime, positionAtWaypoint.performedServiceTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, performedServiceTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PositionAtWaypoint {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    performedServiceTime: ").append(toIndentedString(performedServiceTime)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

  /**
   * Convert the instance into URL query string.
   *
   * @return URL query string
   */
  public String toUrlQueryString() {
    return toUrlQueryString(null);
  }

  /**
   * Convert the instance into URL query string.
   *
   * @param prefix prefix of the query string
   * @return URL query string
   */
  public String toUrlQueryString(String prefix) {
    String suffix = "";
    String containerSuffix = "";
    String containerPrefix = "";
    if (prefix == null) {
      // style=form, explode=true, e.g. /pet?name=cat&type=manx
      prefix = "";
    } else {
      // deepObject style e.g. /pet?id[name]=cat&id[type]=manx
      prefix = prefix + "[";
      suffix = "]";
      containerSuffix = "]";
      containerPrefix = "[";
    }

    StringJoiner joiner = new StringJoiner("&");

    // add `name` to the URL query string
    if (getName() != null) {
      joiner.add(String.format("%sname%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getName()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `performedServiceTime` to the URL query string
    if (getPerformedServiceTime() != null) {
      joiner.add(String.format("%sperformedServiceTime%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getPerformedServiceTime()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

