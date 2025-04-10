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
import com.ptvgroup.developer.client.routing.model.PolylineFormat;
import com.ptvgroup.developer.client.routing.model.PolylineMapType;
import com.ptvgroup.developer.client.routing.model.RoutingMode;
import com.ptvgroup.developer.client.routing.model.TrafficMode;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.ptvgroup.developer.client.routing.ApiClient;
/**
 * Options
 */
@JsonPropertyOrder({
  Options.JSON_PROPERTY_START_TIME,
  Options.JSON_PROPERTY_ARRIVAL_TIME,
  Options.JSON_PROPERTY_TOLL_TIME,
  Options.JSON_PROPERTY_TRAFFIC_MODE,
  Options.JSON_PROPERTY_LANGUAGE,
  Options.JSON_PROPERTY_POLYLINE_FORMAT,
  Options.JSON_PROPERTY_POLYLINE_MAP_TYPE,
  Options.JSON_PROPERTY_ALLOWED_COUNTRIES,
  Options.JSON_PROPERTY_PROHIBITED_COUNTRIES,
  Options.JSON_PROPERTY_CURRENCY,
  Options.JSON_PROPERTY_PREFER_TURNS_ON_PASSENGER_SIDE,
  Options.JSON_PROPERTY_AVOID,
  Options.JSON_PROPERTY_BLOCK_INTERSECTING_ROADS,
  Options.JSON_PROPERTY_CUSTOM_ROAD_ATTRIBUTE_SCENARIOS,
  Options.JSON_PROPERTY_ROUTING_MODE,
  Options.JSON_PROPERTY_MAXIMUM_SPEED,
  Options.JSON_PROPERTY_SPEED_FACTOR
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-10T12:36:28.857695240Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class Options {
  public static final String JSON_PROPERTY_START_TIME = "startTime";
  private String startTime;

  public static final String JSON_PROPERTY_ARRIVAL_TIME = "arrivalTime";
  private String arrivalTime;

  public static final String JSON_PROPERTY_TOLL_TIME = "tollTime";
  private String tollTime;

  public static final String JSON_PROPERTY_TRAFFIC_MODE = "trafficMode";
  private TrafficMode trafficMode = TrafficMode.REALISTIC;

  public static final String JSON_PROPERTY_LANGUAGE = "language";
  private String language = "en";

  public static final String JSON_PROPERTY_POLYLINE_FORMAT = "polylineFormat";
  private PolylineFormat polylineFormat = PolylineFormat.GEO_JSON;

  public static final String JSON_PROPERTY_POLYLINE_MAP_TYPE = "polylineMapType";
  private PolylineMapType polylineMapType = PolylineMapType.RASTER;

  public static final String JSON_PROPERTY_ALLOWED_COUNTRIES = "allowedCountries";
  private String allowedCountries;

  public static final String JSON_PROPERTY_PROHIBITED_COUNTRIES = "prohibitedCountries";
  private String prohibitedCountries;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  private String currency;

  public static final String JSON_PROPERTY_PREFER_TURNS_ON_PASSENGER_SIDE = "preferTurnsOnPassengerSide";
  private Boolean preferTurnsOnPassengerSide = false;

  public static final String JSON_PROPERTY_AVOID = "avoid";
  private String avoid;

  public static final String JSON_PROPERTY_BLOCK_INTERSECTING_ROADS = "blockIntersectingRoads";
  private String blockIntersectingRoads;

  public static final String JSON_PROPERTY_CUSTOM_ROAD_ATTRIBUTE_SCENARIOS = "customRoadAttributeScenarios";
  private String customRoadAttributeScenarios;

  public static final String JSON_PROPERTY_ROUTING_MODE = "routingMode";
  private RoutingMode routingMode = RoutingMode.FAST;

  public static final String JSON_PROPERTY_MAXIMUM_SPEED = "maximumSpeed";
  private Integer maximumSpeed;

  public static final String JSON_PROPERTY_SPEED_FACTOR = "speedFactor";
  private Double speedFactor = 1d;

  public Options() { 
  }

  public Options startTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * Defines the start time of the route formatted according to [RFC 3339](https://tools.ietf.org/html/rfc3339). If none of them is specified the current time will be used as the start time for **trafficMode** _REALISTIC_.  This field is mutually exclusive with **arrivalTime** and **tollTime**. If the date-time string does not include an explicit offset to UTC, the time will be interpreted as the local time of the start waypoint. The date must not be before 1970-01-01T00:00:00+00:00 nor after 2037-12-31T23:59:59+00:00.  The response will contain the offset to UTC specified in the request or that of the start waypoint. For best results it should not be more than one month in the past nor more than six months in the future.   See [here](./concepts/date-and-time) for more information on the relevance of date and time.
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


  public Options arrivalTime(String arrivalTime) {
    this.arrivalTime = arrivalTime;
    return this;
  }

  /**
   * Defines the arrival time of the route formatted according to [RFC 3339](https://tools.ietf.org/html/rfc3339).  This field is mutually exclusive with **startTime** and **tollTime** and cannot be used with the **results** _SCHEDULE_REPORT_ and _SCHEDULE_EVENT_ nor when **openingIntervals**, **serviceTime** or **workingHoursPreset** are specified. If the date-time string does not include an explicit offset to UTC, the time will be interpreted as the local time of the destination waypoint. The date must not be before 1970-01-01T00:00:00+00:00 nor after 2037-12-31T23:59:59+00:00.  The response will contain the offset to UTC specified in the request or that of the destination waypoint. For best results it should not be more than one month in the past nor more than six months in the future.   See [here](./concepts/date-and-time) for more information on the relevance of date and time.
   * @return arrivalTime
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ARRIVAL_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getArrivalTime() {
    return arrivalTime;
  }


  @JsonProperty(JSON_PROPERTY_ARRIVAL_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setArrivalTime(String arrivalTime) {
    this.arrivalTime = arrivalTime;
  }


  public Options tollTime(String tollTime) {
    this.tollTime = tollTime;
    return this;
  }

  /**
   * Defines the date and time at which to calculate toll prices formatted according to [RFC 3339](https://tools.ietf.org/html/rfc3339).  This parameter only has an influence if toll related results are requested. It can only be used in combination with **trafficMode** _AVERAGE_  and it is mutually exclusive with both **startTime** and **arrivalTime**. If the date-time string does not include an explicit offset to UTC, the time will be interpreted as the local time of the start waypoint. The date must not be before 1970-01-01T00:00:00+00:00 nor after 2037-12-31T23:59:59+00:00.   See [here](./concepts/date-and-time) for more information on the relevance of date and time.
   * @return tollTime
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOLL_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTollTime() {
    return tollTime;
  }


  @JsonProperty(JSON_PROPERTY_TOLL_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTollTime(String tollTime) {
    this.tollTime = tollTime;
  }


  public Options trafficMode(TrafficMode trafficMode) {
    this.trafficMode = trafficMode;
    return this;
  }

  /**
   * Get trafficMode
   * @return trafficMode
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TRAFFIC_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TrafficMode getTrafficMode() {
    return trafficMode;
  }


  @JsonProperty(JSON_PROPERTY_TRAFFIC_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTrafficMode(TrafficMode trafficMode) {
    this.trafficMode = trafficMode;
  }


  public Options language(String language) {
    this.language = language;
    return this;
  }

  /**
   * The language of texts such as the descriptions of _MANEUVER_EVENTS_ and _TRAFFIC_EVENTS_. Languages have to be specified according to their [ISO-639-1](https://www.loc.gov/standards/iso639-2/php/code_list.php) code or as a combination of language code and sub-tag according to [BCP47](https://tools.ietf.org/rfc/bcp/bcp47.txt).   The **warningCode** _ROUTING_MANEUVERS_IN_DIFFERENT_LANGUAGE_ is returned if the language is not supported for maneuvers.
   * @return language
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LANGUAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getLanguage() {
    return language;
  }


  @JsonProperty(JSON_PROPERTY_LANGUAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLanguage(String language) {
    this.language = language;
  }


  public Options polylineFormat(PolylineFormat polylineFormat) {
    this.polylineFormat = polylineFormat;
    return this;
  }

  /**
   * Get polylineFormat
   * @return polylineFormat
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_POLYLINE_FORMAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public PolylineFormat getPolylineFormat() {
    return polylineFormat;
  }


  @JsonProperty(JSON_PROPERTY_POLYLINE_FORMAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPolylineFormat(PolylineFormat polylineFormat) {
    this.polylineFormat = polylineFormat;
  }


  public Options polylineMapType(PolylineMapType polylineMapType) {
    this.polylineMapType = polylineMapType;
    return this;
  }

  /**
   * Get polylineMapType
   * @return polylineMapType
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_POLYLINE_MAP_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public PolylineMapType getPolylineMapType() {
    return polylineMapType;
  }


  @JsonProperty(JSON_PROPERTY_POLYLINE_MAP_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPolylineMapType(PolylineMapType polylineMapType) {
    this.polylineMapType = polylineMapType;
  }


  public Options allowedCountries(String allowedCountries) {
    this.allowedCountries = allowedCountries;
    return this;
  }

  /**
   * Comma-separated list of countries the route is allowed to pass. By default, all countries are allowed. If this parameter is present, only these countries are allowed to be passed, i.e. drive only in these countries. This parameter is mutually exclusive with **prohibitedCountries**. Countries are represented according to their [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) or [ISO 3166-2](https://en.wikipedia.org/wiki/ISO_3166-2) if referring to a subdivision.
   * @return allowedCountries
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALLOWED_COUNTRIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAllowedCountries() {
    return allowedCountries;
  }


  @JsonProperty(JSON_PROPERTY_ALLOWED_COUNTRIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAllowedCountries(String allowedCountries) {
    this.allowedCountries = allowedCountries;
  }


  public Options prohibitedCountries(String prohibitedCountries) {
    this.prohibitedCountries = prohibitedCountries;
    return this;
  }

  /**
   * Comma-separated list of countries the route must not pass. By default, all countries are allowed. If this parameter is present, all but the given countries are allowed to be passed, i.e. do not drive in these countries. This parameter is mutually exclusive with **allowedCountries**. Countries are represented according to their [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) or [ISO 3166-2](https://en.wikipedia.org/wiki/ISO_3166-2) if referring to a subdivision.
   * @return prohibitedCountries
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROHIBITED_COUNTRIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getProhibitedCountries() {
    return prohibitedCountries;
  }


  @JsonProperty(JSON_PROPERTY_PROHIBITED_COUNTRIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProhibitedCountries(String prohibitedCountries) {
    this.prohibitedCountries = prohibitedCountries;
  }


  public Options currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * The currency code according to [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217).   If it is not specified, the currency is taken from the **profile**.   It is used for the costs in the monetary cost report if _MONETARY_COSTS_ are requested in the **results** and for  toll price conversion if _TOLL_COSTS_ or _TOLL_SECTIONS_ are requested in the **results**. Furthermore, it is used  when setting **options[routingMode]&#x3D;MONETARY**.
   * @return currency
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCurrency() {
    return currency;
  }


  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrency(String currency) {
    this.currency = currency;
  }


  public Options preferTurnsOnPassengerSide(Boolean preferTurnsOnPassengerSide) {
    this.preferTurnsOnPassengerSide = preferTurnsOnPassengerSide;
    return this;
  }

  /**
   * Specifies that the route is constructed such that turns to the passenger side are preferred. 
   * @return preferTurnsOnPassengerSide
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PREFER_TURNS_ON_PASSENGER_SIDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getPreferTurnsOnPassengerSide() {
    return preferTurnsOnPassengerSide;
  }


  @JsonProperty(JSON_PROPERTY_PREFER_TURNS_ON_PASSENGER_SIDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPreferTurnsOnPassengerSide(Boolean preferTurnsOnPassengerSide) {
    this.preferTurnsOnPassengerSide = preferTurnsOnPassengerSide;
  }


  public Options avoid(String avoid) {
    this.avoid = avoid;
    return this;
  }

  /**
   * Comma-separated list of features which should be avoided on the route. Avoided features could be included in a route if there is no possibility to reach the target otherwise.  Available values are provided by type &#x60;AvoidFeature&#x60;: * &#x60;TOLL&#x60; - Avoid roads with toll. * &#x60;FERRIES&#x60; - Avoid ferries. Ferries which cannot be avoided can be requested with _COMBINED_TRANSPORT_EVENTS_ and will appear with the type _BOAT_. * &#x60;RAIL_SHUTTLES&#x60; - Avoid rail shuttles. Rail shuttles which cannot be avoided can be requested with _COMBINED_TRANSPORT_EVENTS_ and will appear with the type _RAIL_. * &#x60;HIGHWAYS&#x60; - Avoid highways and motorways. Waypoints will not be matched to highways, they will be matched to the nearest road which is not a highway.  Cannot be used with **options[routingMode]&#x3D;MONETARY**.  See [here](./concepts/avoid) for more information. 
   * @return avoid
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AVOID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAvoid() {
    return avoid;
  }


  @JsonProperty(JSON_PROPERTY_AVOID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAvoid(String avoid) {
    this.avoid = avoid;
  }


  public Options blockIntersectingRoads(String blockIntersectingRoads) {
    this.blockIntersectingRoads = blockIntersectingRoads;
    return this;
  }

  /**
   * Pipe-separated list of polylines.   Roads and combined transports that intersect the given polylines will be considered as blocked. Each list element is a polyline. Each point is a coordinate of latitude and longitude. Coordinates and points are separated by a comma. Format: &#x60;&lt;poly1_lat1&gt;,&lt;poly1_lon1&gt;,...,&lt;poly1_latN&gt;,&lt;poly1_lonN&gt;|&lt;poly2_lat1&gt;,&lt;poly2_lon1&gt;,...,&lt;poly2_latN&gt;,&lt;poly2_lonN&gt;|...&#x60;   Notes: * Be aware of the URL length restrictions. * If there is no other route connecting two waypoints the will be reported as violated and correspondingly violation events with type **BLOCKED_ROAD_BY_INTERSECTION** will be reported if violation events are requested. * Requests will be rejected if at least one provided polyline   * does not consist of an even number of coordinates,   * consists of less than two points,   * contains invalid coordinates or   * intersects more than 5000 road segments. 
   * @return blockIntersectingRoads
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BLOCK_INTERSECTING_ROADS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getBlockIntersectingRoads() {
    return blockIntersectingRoads;
  }


  @JsonProperty(JSON_PROPERTY_BLOCK_INTERSECTING_ROADS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBlockIntersectingRoads(String blockIntersectingRoads) {
    this.blockIntersectingRoads = blockIntersectingRoads;
  }


  public Options customRoadAttributeScenarios(String customRoadAttributeScenarios) {
    this.customRoadAttributeScenarios = customRoadAttributeScenarios;
    return this;
  }

  /**
   * Comma-separated list of [custom road attribute scenarios](../data-api/concepts/custom-road-attributes) to be considered in the route calculation.  Each scenario can be specified by its name or its ID. A shared scenario can only be specified by its ID.  The size limitations that apply to each scenario, also apply to the collection of scenarios, i.e. the limit  on the number of roads in one scenario can not be circumvented by splitting it in multiple scenarios.
   * @return customRoadAttributeScenarios
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CUSTOM_ROAD_ATTRIBUTE_SCENARIOS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCustomRoadAttributeScenarios() {
    return customRoadAttributeScenarios;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOM_ROAD_ATTRIBUTE_SCENARIOS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomRoadAttributeScenarios(String customRoadAttributeScenarios) {
    this.customRoadAttributeScenarios = customRoadAttributeScenarios;
  }


  public Options routingMode(RoutingMode routingMode) {
    this.routingMode = routingMode;
    return this;
  }

  /**
   * Get routingMode
   * @return routingMode
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ROUTING_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public RoutingMode getRoutingMode() {
    return routingMode;
  }


  @JsonProperty(JSON_PROPERTY_ROUTING_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRoutingMode(RoutingMode routingMode) {
    this.routingMode = routingMode;
  }


  public Options maximumSpeed(Integer maximumSpeed) {
    this.maximumSpeed = maximumSpeed;
    return this;
  }

  /**
   * The maximum speed of the vehicle [km/h]. The speeds for calculating the driving times on all roads will be limited to this value.  See [here](./concepts/speeds) for more information.
   * minimum: 1
   * @return maximumSpeed
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAXIMUM_SPEED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getMaximumSpeed() {
    return maximumSpeed;
  }


  @JsonProperty(JSON_PROPERTY_MAXIMUM_SPEED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaximumSpeed(Integer maximumSpeed) {
    this.maximumSpeed = maximumSpeed;
  }


  public Options speedFactor(Double speedFactor) {
    this.speedFactor = speedFactor;
    return this;
  }

  /**
   * An additional factor to apply to the speed of the vehicle. This modified speed is used to modify the driving times after the route has been calculated. That means in particular that the route itself will not be modified by applying a speed factor. When lower than one, the driving time of the vehicle will increase, when greater than one, the driving time of the vehicle will decrease. Note that the factor is only applied on the parts of the route where the vehicle is driving. Therefore, a speed factor of 1.1 does not necessarily mean that the **travelTime** of the resulting route will be 10% faster. The speed is not capped by the maximum speed of the  vehicle or of the road.  See [here](./concepts/speeds) for more information.
   * minimum: 0.1
   * maximum: 10
   * @return speedFactor
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SPEED_FACTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getSpeedFactor() {
    return speedFactor;
  }


  @JsonProperty(JSON_PROPERTY_SPEED_FACTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSpeedFactor(Double speedFactor) {
    this.speedFactor = speedFactor;
  }


  /**
   * Return true if this Options object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Options options = (Options) o;
    return Objects.equals(this.startTime, options.startTime) &&
        Objects.equals(this.arrivalTime, options.arrivalTime) &&
        Objects.equals(this.tollTime, options.tollTime) &&
        Objects.equals(this.trafficMode, options.trafficMode) &&
        Objects.equals(this.language, options.language) &&
        Objects.equals(this.polylineFormat, options.polylineFormat) &&
        Objects.equals(this.polylineMapType, options.polylineMapType) &&
        Objects.equals(this.allowedCountries, options.allowedCountries) &&
        Objects.equals(this.prohibitedCountries, options.prohibitedCountries) &&
        Objects.equals(this.currency, options.currency) &&
        Objects.equals(this.preferTurnsOnPassengerSide, options.preferTurnsOnPassengerSide) &&
        Objects.equals(this.avoid, options.avoid) &&
        Objects.equals(this.blockIntersectingRoads, options.blockIntersectingRoads) &&
        Objects.equals(this.customRoadAttributeScenarios, options.customRoadAttributeScenarios) &&
        Objects.equals(this.routingMode, options.routingMode) &&
        Objects.equals(this.maximumSpeed, options.maximumSpeed) &&
        Objects.equals(this.speedFactor, options.speedFactor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startTime, arrivalTime, tollTime, trafficMode, language, polylineFormat, polylineMapType, allowedCountries, prohibitedCountries, currency, preferTurnsOnPassengerSide, avoid, blockIntersectingRoads, customRoadAttributeScenarios, routingMode, maximumSpeed, speedFactor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Options {\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    arrivalTime: ").append(toIndentedString(arrivalTime)).append("\n");
    sb.append("    tollTime: ").append(toIndentedString(tollTime)).append("\n");
    sb.append("    trafficMode: ").append(toIndentedString(trafficMode)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    polylineFormat: ").append(toIndentedString(polylineFormat)).append("\n");
    sb.append("    polylineMapType: ").append(toIndentedString(polylineMapType)).append("\n");
    sb.append("    allowedCountries: ").append(toIndentedString(allowedCountries)).append("\n");
    sb.append("    prohibitedCountries: ").append(toIndentedString(prohibitedCountries)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    preferTurnsOnPassengerSide: ").append(toIndentedString(preferTurnsOnPassengerSide)).append("\n");
    sb.append("    avoid: ").append(toIndentedString(avoid)).append("\n");
    sb.append("    blockIntersectingRoads: ").append(toIndentedString(blockIntersectingRoads)).append("\n");
    sb.append("    customRoadAttributeScenarios: ").append(toIndentedString(customRoadAttributeScenarios)).append("\n");
    sb.append("    routingMode: ").append(toIndentedString(routingMode)).append("\n");
    sb.append("    maximumSpeed: ").append(toIndentedString(maximumSpeed)).append("\n");
    sb.append("    speedFactor: ").append(toIndentedString(speedFactor)).append("\n");
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

    // add `arrivalTime` to the URL query string
    if (getArrivalTime() != null) {
      joiner.add(String.format("%sarrivalTime%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getArrivalTime()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `tollTime` to the URL query string
    if (getTollTime() != null) {
      joiner.add(String.format("%stollTime%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getTollTime()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `trafficMode` to the URL query string
    if (getTrafficMode() != null) {
      joiner.add(String.format("%strafficMode%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getTrafficMode()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `language` to the URL query string
    if (getLanguage() != null) {
      joiner.add(String.format("%slanguage%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getLanguage()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `polylineFormat` to the URL query string
    if (getPolylineFormat() != null) {
      joiner.add(String.format("%spolylineFormat%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getPolylineFormat()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `polylineMapType` to the URL query string
    if (getPolylineMapType() != null) {
      joiner.add(String.format("%spolylineMapType%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getPolylineMapType()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `allowedCountries` to the URL query string
    if (getAllowedCountries() != null) {
      joiner.add(String.format("%sallowedCountries%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getAllowedCountries()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `prohibitedCountries` to the URL query string
    if (getProhibitedCountries() != null) {
      joiner.add(String.format("%sprohibitedCountries%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getProhibitedCountries()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `currency` to the URL query string
    if (getCurrency() != null) {
      joiner.add(String.format("%scurrency%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getCurrency()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `preferTurnsOnPassengerSide` to the URL query string
    if (getPreferTurnsOnPassengerSide() != null) {
      joiner.add(String.format("%spreferTurnsOnPassengerSide%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getPreferTurnsOnPassengerSide()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `avoid` to the URL query string
    if (getAvoid() != null) {
      joiner.add(String.format("%savoid%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getAvoid()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `blockIntersectingRoads` to the URL query string
    if (getBlockIntersectingRoads() != null) {
      joiner.add(String.format("%sblockIntersectingRoads%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getBlockIntersectingRoads()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `customRoadAttributeScenarios` to the URL query string
    if (getCustomRoadAttributeScenarios() != null) {
      joiner.add(String.format("%scustomRoadAttributeScenarios%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getCustomRoadAttributeScenarios()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `routingMode` to the URL query string
    if (getRoutingMode() != null) {
      joiner.add(String.format("%sroutingMode%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getRoutingMode()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `maximumSpeed` to the URL query string
    if (getMaximumSpeed() != null) {
      joiner.add(String.format("%smaximumSpeed%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getMaximumSpeed()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `speedFactor` to the URL query string
    if (getSpeedFactor() != null) {
      joiner.add(String.format("%sspeedFactor%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getSpeedFactor()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

