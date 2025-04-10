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
import com.ptvgroup.developer.client.routing.model.ScheduleType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.ptvgroup.developer.client.routing.ApiClient;
/**
 * Issued when the driver has to take a break or a rest, perform service or wait for a waypoint to open. If **useServiceTimeForRecreation** is true, each _SERVICE_ is reported along with another type depending on whether or not the service time is actually used for recreation. Times on a combined transport are always _WAITING_ unless used for recreation. Requires _SCHEDULE_EVENTS_ or _SCHEDULE_EVENTS_WITH_DRIVING_ to be requested, POST only. It can be helpful to take other events into account such as **waypoint** and **combinedTransport** to interpret the results, consider requesting them. When there are several waypoints at the same location, **waypoint** helps to match _SERVICE_ to the proper waypoint, **combinedTransport** helps to match recreation time.
 */
@JsonPropertyOrder({
  ScheduleEvent.JSON_PROPERTY_DURATION,
  ScheduleEvent.JSON_PROPERTY_SCHEDULE_TYPES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-10T12:36:28.857695240Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class ScheduleEvent {
  public static final String JSON_PROPERTY_DURATION = "duration";
  private Integer duration;

  public static final String JSON_PROPERTY_SCHEDULE_TYPES = "scheduleTypes";
  private List<ScheduleType> scheduleTypes = new ArrayList<>();

  public ScheduleEvent() { 
  }

  public ScheduleEvent duration(Integer duration) {
    this.duration = duration;
    return this;
  }

  /**
   * The duration [s].
   * minimum: 0
   * @return duration
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DURATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Integer getDuration() {
    return duration;
  }


  @JsonProperty(JSON_PROPERTY_DURATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDuration(Integer duration) {
    this.duration = duration;
  }


  public ScheduleEvent scheduleTypes(List<ScheduleType> scheduleTypes) {
    this.scheduleTypes = scheduleTypes;
    return this;
  }

  public ScheduleEvent addScheduleTypesItem(ScheduleType scheduleTypesItem) {
    if (this.scheduleTypes == null) {
      this.scheduleTypes = new ArrayList<>();
    }
    this.scheduleTypes.add(scheduleTypesItem);
    return this;
  }

  /**
   * Tells what happens at this position of the route. 
   * @return scheduleTypes
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SCHEDULE_TYPES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<ScheduleType> getScheduleTypes() {
    return scheduleTypes;
  }


  @JsonProperty(JSON_PROPERTY_SCHEDULE_TYPES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setScheduleTypes(List<ScheduleType> scheduleTypes) {
    this.scheduleTypes = scheduleTypes;
  }


  /**
   * Return true if this ScheduleEvent object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScheduleEvent scheduleEvent = (ScheduleEvent) o;
    return Objects.equals(this.duration, scheduleEvent.duration) &&
        Objects.equals(this.scheduleTypes, scheduleEvent.scheduleTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(duration, scheduleTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScheduleEvent {\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    scheduleTypes: ").append(toIndentedString(scheduleTypes)).append("\n");
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

    // add `duration` to the URL query string
    if (getDuration() != null) {
      joiner.add(String.format("%sduration%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getDuration()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `scheduleTypes` to the URL query string
    if (getScheduleTypes() != null) {
      for (int i = 0; i < getScheduleTypes().size(); i++) {
        if (getScheduleTypes().get(i) != null) {
          joiner.add(String.format("%sscheduleTypes%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(ApiClient.valueToString(getScheduleTypes().get(i)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
        }
      }
    }

    return joiner.toString();
  }
}

