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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Specifies which objective function should be used for the route calculation.   * &#x60;FAST&#x60; is the default which returns a route considering a tradeoff between distance and travel time. All vehicle-specific restrictions are properly considered and violated only, if no other route can be found. * &#x60;SHORT&#x60; returns a route which is probably shorter but accepting longer travel times. The resulting route is still sensible and can be driven with the given vehicle, but it may disregard restrictions like driving through residential areas. * &#x60;SHORTEST&#x60; is even more aggressively optimized for minimizing distance, which can significantly increase travel times. The route remains valid and drivable for the vehicle, but may more readily use slower or smaller roads. * &#x60;MONETARY&#x60; assigns monetary costs to each road segment according the provided cost parameters and the vehicles properties like its consumption. Furthermore, toll costs are integrated as well. See [here](./concepts/monetary-costs) for more information.
 */
public enum RoutingMode {
  
  FAST("FAST"),
  
  SHORT("SHORT"),
  
  SHORTEST("SHORTEST"),
  
  MONETARY("MONETARY");

  private String value;

  RoutingMode(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static RoutingMode fromValue(String value) {
    for (RoutingMode b : RoutingMode.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  /**
   * Convert the instance into URL query string.
   *
   * @param prefix prefix of the query string
   * @return URL query string
   */
  public String toUrlQueryString(String prefix) {
    if (prefix == null) {
      prefix = "";
    }

    return String.format("%s=%s", prefix, this.toString());
  }

}

