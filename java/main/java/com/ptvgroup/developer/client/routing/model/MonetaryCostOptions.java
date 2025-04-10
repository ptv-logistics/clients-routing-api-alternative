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
 * MonetaryCostOptions
 */
@JsonPropertyOrder({
  MonetaryCostOptions.JSON_PROPERTY_COST_PER_KILOMETER,
  MonetaryCostOptions.JSON_PROPERTY_WORKING_COST_PER_HOUR,
  MonetaryCostOptions.JSON_PROPERTY_COST_PER_KWH,
  MonetaryCostOptions.JSON_PROPERTY_COST_PER_FUEL_UNIT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-10T12:36:28.857695240Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class MonetaryCostOptions {
  public static final String JSON_PROPERTY_COST_PER_KILOMETER = "costPerKilometer";
  private Double costPerKilometer;

  public static final String JSON_PROPERTY_WORKING_COST_PER_HOUR = "workingCostPerHour";
  private Double workingCostPerHour;

  public static final String JSON_PROPERTY_COST_PER_KWH = "costPerKwh";
  private Double costPerKwh;

  public static final String JSON_PROPERTY_COST_PER_FUEL_UNIT = "costPerFuelUnit";
  private Double costPerFuelUnit;

  public MonetaryCostOptions() { 
  }

  public MonetaryCostOptions costPerKilometer(Double costPerKilometer) {
    this.costPerKilometer = costPerKilometer;
    return this;
  }

  /**
   * Specifies the cost per kilometer. This value can contain the cost from the energy consumption, but it also possible to define the energy costs using **monetaryCostOptions[costPerKwh]** and **monetaryCostOptions[costPerFuelUnit]**. If it is not specified the default value depends on the used **profile**. The default value of the profile can change at any time.
   * minimum: 0
   * @return costPerKilometer
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COST_PER_KILOMETER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getCostPerKilometer() {
    return costPerKilometer;
  }


  @JsonProperty(JSON_PROPERTY_COST_PER_KILOMETER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCostPerKilometer(Double costPerKilometer) {
    this.costPerKilometer = costPerKilometer;
  }


  public MonetaryCostOptions workingCostPerHour(Double workingCostPerHour) {
    this.workingCostPerHour = workingCostPerHour;
    return this;
  }

  /**
   * Specifies the cost per hour. It is not applied to service, break or rest periods. If it is not specified the default value depends on the used **profile**. The default value of the profile can change at any time.
   * minimum: 0
   * @return workingCostPerHour
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WORKING_COST_PER_HOUR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getWorkingCostPerHour() {
    return workingCostPerHour;
  }


  @JsonProperty(JSON_PROPERTY_WORKING_COST_PER_HOUR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWorkingCostPerHour(Double workingCostPerHour) {
    this.workingCostPerHour = workingCostPerHour;
  }


  public MonetaryCostOptions costPerKwh(Double costPerKwh) {
    this.costPerKwh = costPerKwh;
    return this;
  }

  /**
   * Specifies the cost per kilowatt hour. Only relevant for **vehicle[engineType]** _ELECTRIC_ and _HYBRID_.
   * minimum: 0
   * @return costPerKwh
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COST_PER_KWH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getCostPerKwh() {
    return costPerKwh;
  }


  @JsonProperty(JSON_PROPERTY_COST_PER_KWH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCostPerKwh(Double costPerKwh) {
    this.costPerKwh = costPerKwh;
  }


  public MonetaryCostOptions costPerFuelUnit(Double costPerFuelUnit) {
    this.costPerFuelUnit = costPerFuelUnit;
    return this;
  }

  /**
   * Specifies the cost per fuel unit (per liter Diesel or per kg CNG). Only used for **vehicle[engineType]** _COMBUSTION_ and _HYBRID_.
   * minimum: 0
   * @return costPerFuelUnit
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COST_PER_FUEL_UNIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getCostPerFuelUnit() {
    return costPerFuelUnit;
  }


  @JsonProperty(JSON_PROPERTY_COST_PER_FUEL_UNIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCostPerFuelUnit(Double costPerFuelUnit) {
    this.costPerFuelUnit = costPerFuelUnit;
  }


  /**
   * Return true if this MonetaryCostOptions object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MonetaryCostOptions monetaryCostOptions = (MonetaryCostOptions) o;
    return Objects.equals(this.costPerKilometer, monetaryCostOptions.costPerKilometer) &&
        Objects.equals(this.workingCostPerHour, monetaryCostOptions.workingCostPerHour) &&
        Objects.equals(this.costPerKwh, monetaryCostOptions.costPerKwh) &&
        Objects.equals(this.costPerFuelUnit, monetaryCostOptions.costPerFuelUnit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(costPerKilometer, workingCostPerHour, costPerKwh, costPerFuelUnit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MonetaryCostOptions {\n");
    sb.append("    costPerKilometer: ").append(toIndentedString(costPerKilometer)).append("\n");
    sb.append("    workingCostPerHour: ").append(toIndentedString(workingCostPerHour)).append("\n");
    sb.append("    costPerKwh: ").append(toIndentedString(costPerKwh)).append("\n");
    sb.append("    costPerFuelUnit: ").append(toIndentedString(costPerFuelUnit)).append("\n");
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

    // add `costPerKilometer` to the URL query string
    if (getCostPerKilometer() != null) {
      joiner.add(String.format("%scostPerKilometer%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getCostPerKilometer()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `workingCostPerHour` to the URL query string
    if (getWorkingCostPerHour() != null) {
      joiner.add(String.format("%sworkingCostPerHour%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getWorkingCostPerHour()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `costPerKwh` to the URL query string
    if (getCostPerKwh() != null) {
      joiner.add(String.format("%scostPerKwh%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getCostPerKwh()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `costPerFuelUnit` to the URL query string
    if (getCostPerFuelUnit() != null) {
      joiner.add(String.format("%scostPerFuelUnit%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getCostPerFuelUnit()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

