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
 * The position of the vehicle if the vehicle position is not at a waypoint but somewhere on the route. This parameter is mutually exclusive with **waypoint**.
 */
@JsonPropertyOrder({
  PositionOnRoute.JSON_PROPERTY_LATITUDE,
  PositionOnRoute.JSON_PROPERTY_LONGITUDE,
  PositionOnRoute.JSON_PROPERTY_NEXT_WAYPOINT_NAME,
  PositionOnRoute.JSON_PROPERTY_HEADING,
  PositionOnRoute.JSON_PROPERTY_HEADING_TOLERANCE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-10T12:36:28.857695240Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class PositionOnRoute {
  public static final String JSON_PROPERTY_LATITUDE = "latitude";
  private Double latitude;

  public static final String JSON_PROPERTY_LONGITUDE = "longitude";
  private Double longitude;

  public static final String JSON_PROPERTY_NEXT_WAYPOINT_NAME = "nextWaypointName";
  private String nextWaypointName;

  public static final String JSON_PROPERTY_HEADING = "heading";
  private Integer heading;

  public static final String JSON_PROPERTY_HEADING_TOLERANCE = "headingTolerance";
  private Integer headingTolerance = 45;

  public PositionOnRoute() { 
  }

  public PositionOnRoute latitude(Double latitude) {
    this.latitude = latitude;
    return this;
  }

  /**
   * The latitude value in degrees (WGS84/EPSG:4326) from south to north.
   * minimum: -90
   * maximum: 90
   * @return latitude
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_LATITUDE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Double getLatitude() {
    return latitude;
  }


  @JsonProperty(JSON_PROPERTY_LATITUDE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }


  public PositionOnRoute longitude(Double longitude) {
    this.longitude = longitude;
    return this;
  }

  /**
   * The longitude value in degrees (WGS84/EPSG:4326) from west to east.
   * minimum: -180
   * maximum: 180
   * @return longitude
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_LONGITUDE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Double getLongitude() {
    return longitude;
  }


  @JsonProperty(JSON_PROPERTY_LONGITUDE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }


  public PositionOnRoute nextWaypointName(String nextWaypointName) {
    this.nextWaypointName = nextWaypointName;
    return this;
  }

  /**
   * The name of the next waypoint on the route.
   * @return nextWaypointName
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_NEXT_WAYPOINT_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getNextWaypointName() {
    return nextWaypointName;
  }


  @JsonProperty(JSON_PROPERTY_NEXT_WAYPOINT_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setNextWaypointName(String nextWaypointName) {
    this.nextWaypointName = nextWaypointName;
  }


  public PositionOnRoute heading(Integer heading) {
    this.heading = heading;
    return this;
  }

  /**
   * The current heading of the vehicle [deg]. It denotes the driving direction, North represents 0 degrees, East represents 90 degrees, South represents 180 degrees, West represents 270 degrees.  If specified and if the heading of the vehicle is not in the direction of the route near the given **position**, it is assumed that the vehicle has left the route so that a new route will be calculated. This new route will then be  calculated from the road closest to the position matching the vehicle heading. For more information see this [concept](./concepts/estimated-time-arrival).
   * minimum: 0
   * maximum: 360
   * @return heading
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HEADING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getHeading() {
    return heading;
  }


  @JsonProperty(JSON_PROPERTY_HEADING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHeading(Integer heading) {
    this.heading = heading;
  }


  public PositionOnRoute headingTolerance(Integer headingTolerance) {
    this.headingTolerance = headingTolerance;
    return this;
  }

  /**
   * Denotes the tolerance between **heading** and the direction of a road, i.e. roads with a direction of **heading**±**headingTolerance** are taken into account. Applies only if **heading** is specified.
   * minimum: 0
   * maximum: 180
   * @return headingTolerance
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HEADING_TOLERANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getHeadingTolerance() {
    return headingTolerance;
  }


  @JsonProperty(JSON_PROPERTY_HEADING_TOLERANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHeadingTolerance(Integer headingTolerance) {
    this.headingTolerance = headingTolerance;
  }


  /**
   * Return true if this PositionOnRoute object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PositionOnRoute positionOnRoute = (PositionOnRoute) o;
    return Objects.equals(this.latitude, positionOnRoute.latitude) &&
        Objects.equals(this.longitude, positionOnRoute.longitude) &&
        Objects.equals(this.nextWaypointName, positionOnRoute.nextWaypointName) &&
        Objects.equals(this.heading, positionOnRoute.heading) &&
        Objects.equals(this.headingTolerance, positionOnRoute.headingTolerance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(latitude, longitude, nextWaypointName, heading, headingTolerance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PositionOnRoute {\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    nextWaypointName: ").append(toIndentedString(nextWaypointName)).append("\n");
    sb.append("    heading: ").append(toIndentedString(heading)).append("\n");
    sb.append("    headingTolerance: ").append(toIndentedString(headingTolerance)).append("\n");
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

    // add `latitude` to the URL query string
    if (getLatitude() != null) {
      joiner.add(String.format("%slatitude%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getLatitude()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `longitude` to the URL query string
    if (getLongitude() != null) {
      joiner.add(String.format("%slongitude%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getLongitude()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `nextWaypointName` to the URL query string
    if (getNextWaypointName() != null) {
      joiner.add(String.format("%snextWaypointName%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getNextWaypointName()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `heading` to the URL query string
    if (getHeading() != null) {
      joiner.add(String.format("%sheading%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getHeading()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `headingTolerance` to the URL query string
    if (getHeadingTolerance() != null) {
      joiner.add(String.format("%sheadingTolerance%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getHeadingTolerance()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

