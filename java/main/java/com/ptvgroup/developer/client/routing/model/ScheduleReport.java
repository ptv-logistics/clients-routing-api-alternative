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
 * Provides an overview of the times of the schedule of this route including break and rest times. The sum of all times is equal to the **travelTime** of the route.         If **useServiceTimeForRecreation** is true, waiting, break and rest times which take place during service will not be reported here. If that does not match your needs, please evaluate the corresponding **scheduleEvent**s.  Requires _SCHEDULE_REPORT_ to be requested, POST only.
 */
@JsonPropertyOrder({
  ScheduleReport.JSON_PROPERTY_START_TIME,
  ScheduleReport.JSON_PROPERTY_END_TIME,
  ScheduleReport.JSON_PROPERTY_DRIVING_TIME,
  ScheduleReport.JSON_PROPERTY_SERVICE_TIME,
  ScheduleReport.JSON_PROPERTY_WAITING_TIME,
  ScheduleReport.JSON_PROPERTY_BREAK_TIME,
  ScheduleReport.JSON_PROPERTY_REST_TIME
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-10T12:36:28.857695240Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class ScheduleReport {
  public static final String JSON_PROPERTY_START_TIME = "startTime";
  private String startTime;

  public static final String JSON_PROPERTY_END_TIME = "endTime";
  private String endTime;

  public static final String JSON_PROPERTY_DRIVING_TIME = "drivingTime";
  private Integer drivingTime;

  public static final String JSON_PROPERTY_SERVICE_TIME = "serviceTime";
  private Integer serviceTime;

  public static final String JSON_PROPERTY_WAITING_TIME = "waitingTime";
  private Integer waitingTime;

  public static final String JSON_PROPERTY_BREAK_TIME = "breakTime";
  private Integer breakTime;

  public static final String JSON_PROPERTY_REST_TIME = "restTime";
  private Integer restTime;

  public ScheduleReport() { 
  }

  public ScheduleReport startTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * The start time of the route formatted according to [RFC 3339](https://tools.ietf.org/html/rfc3339). Only present with **options[trafficMode]** _REALISTIC_ or when **options[startTime]** is specified.
   * @return startTime
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_START_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getStartTime() {
    return startTime;
  }


  @JsonProperty(JSON_PROPERTY_START_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }


  public ScheduleReport endTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * The end time of the route formatted according to [RFC 3339](https://tools.ietf.org/html/rfc3339). Only present with **options[trafficMode]** _REALISTIC_ or when **options[startTime]** is specified.
   * @return endTime
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_END_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getEndTime() {
    return endTime;
  }


  @JsonProperty(JSON_PROPERTY_END_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }


  public ScheduleReport drivingTime(Integer drivingTime) {
    this.drivingTime = drivingTime;
    return this;
  }

  /**
   * The total driving time of the route [s]. Time which is not service, waiting, break or rest is considered as driving.
   * minimum: 0
   * @return drivingTime
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DRIVING_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Integer getDrivingTime() {
    return drivingTime;
  }


  @JsonProperty(JSON_PROPERTY_DRIVING_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDrivingTime(Integer drivingTime) {
    this.drivingTime = drivingTime;
  }


  public ScheduleReport serviceTime(Integer serviceTime) {
    this.serviceTime = serviceTime;
    return this;
  }

  /**
   * The total service time of the route [s], equal to the sum of **schedule** events of type _SERVICE_.
   * minimum: 0
   * @return serviceTime
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SERVICE_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Integer getServiceTime() {
    return serviceTime;
  }


  @JsonProperty(JSON_PROPERTY_SERVICE_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setServiceTime(Integer serviceTime) {
    this.serviceTime = serviceTime;
  }


  public ScheduleReport waitingTime(Integer waitingTime) {
    this.waitingTime = waitingTime;
    return this;
  }

  /**
   * The total waiting time of the route [s], equal to the sum of **schedule** events of type _WAITING_ which are not _SERVICE_ at the same time.
   * minimum: 0
   * @return waitingTime
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_WAITING_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Integer getWaitingTime() {
    return waitingTime;
  }


  @JsonProperty(JSON_PROPERTY_WAITING_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setWaitingTime(Integer waitingTime) {
    this.waitingTime = waitingTime;
  }


  public ScheduleReport breakTime(Integer breakTime) {
    this.breakTime = breakTime;
    return this;
  }

  /**
   * The total break time of the route [s], equal to the sum of **schedule** events of type _BREAK_ which are not _SERVICE_ at the same time.
   * minimum: 0
   * @return breakTime
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_BREAK_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Integer getBreakTime() {
    return breakTime;
  }


  @JsonProperty(JSON_PROPERTY_BREAK_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBreakTime(Integer breakTime) {
    this.breakTime = breakTime;
  }


  public ScheduleReport restTime(Integer restTime) {
    this.restTime = restTime;
    return this;
  }

  /**
   * The total rest time of the route [s], equal to the sum of **schedule** events of type _DAILY_REST_ which are not _SERVICE_ at the same time.
   * minimum: 0
   * @return restTime
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_REST_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Integer getRestTime() {
    return restTime;
  }


  @JsonProperty(JSON_PROPERTY_REST_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRestTime(Integer restTime) {
    this.restTime = restTime;
  }


  /**
   * Return true if this ScheduleReport object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScheduleReport scheduleReport = (ScheduleReport) o;
    return Objects.equals(this.startTime, scheduleReport.startTime) &&
        Objects.equals(this.endTime, scheduleReport.endTime) &&
        Objects.equals(this.drivingTime, scheduleReport.drivingTime) &&
        Objects.equals(this.serviceTime, scheduleReport.serviceTime) &&
        Objects.equals(this.waitingTime, scheduleReport.waitingTime) &&
        Objects.equals(this.breakTime, scheduleReport.breakTime) &&
        Objects.equals(this.restTime, scheduleReport.restTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startTime, endTime, drivingTime, serviceTime, waitingTime, breakTime, restTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScheduleReport {\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    drivingTime: ").append(toIndentedString(drivingTime)).append("\n");
    sb.append("    serviceTime: ").append(toIndentedString(serviceTime)).append("\n");
    sb.append("    waitingTime: ").append(toIndentedString(waitingTime)).append("\n");
    sb.append("    breakTime: ").append(toIndentedString(breakTime)).append("\n");
    sb.append("    restTime: ").append(toIndentedString(restTime)).append("\n");
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

    // add `startTime` to the URL query string
    if (getStartTime() != null) {
      joiner.add(String.format("%sstartTime%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getStartTime()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `endTime` to the URL query string
    if (getEndTime() != null) {
      joiner.add(String.format("%sendTime%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getEndTime()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `drivingTime` to the URL query string
    if (getDrivingTime() != null) {
      joiner.add(String.format("%sdrivingTime%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getDrivingTime()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `serviceTime` to the URL query string
    if (getServiceTime() != null) {
      joiner.add(String.format("%sserviceTime%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getServiceTime()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `waitingTime` to the URL query string
    if (getWaitingTime() != null) {
      joiner.add(String.format("%swaitingTime%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getWaitingTime()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `breakTime` to the URL query string
    if (getBreakTime() != null) {
      joiner.add(String.format("%sbreakTime%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getBreakTime()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `restTime` to the URL query string
    if (getRestTime() != null) {
      joiner.add(String.format("%srestTime%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getRestTime()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

