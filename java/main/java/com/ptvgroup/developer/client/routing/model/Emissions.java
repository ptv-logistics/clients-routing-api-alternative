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
import com.ptvgroup.developer.client.routing.model.EmissionsEN162582012;
import com.ptvgroup.developer.client.routing.model.EmissionsFrenchCO2eDecree2017639;
import com.ptvgroup.developer.client.routing.model.EmissionsISO140832022;
import com.ptvgroup.developer.client.routing.model.EmissionsISO140832023;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.ptvgroup.developer.client.routing.ApiClient;
/**
 * Emissions such as the CO2-equivalent (CO2e) according to the selected standards.  The CO2e value is the unit for comparing the radiative forcing of a greenhouse gas to carbon dioxide according to [ISO 14064-1:2006](https://en.wikipedia.org/wiki/ISO_14064).
 */
@JsonPropertyOrder({
  Emissions.JSON_PROPERTY_EN162582012,
  Emissions.JSON_PROPERTY_ISO140832022,
  Emissions.JSON_PROPERTY_ISO140832023,
  Emissions.JSON_PROPERTY_FRENCH_C_O2E_DECREE2017639
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-10T12:36:28.857695240Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class Emissions {
  public static final String JSON_PROPERTY_EN162582012 = "en16258_2012";
  private EmissionsEN162582012 en162582012;

  public static final String JSON_PROPERTY_ISO140832022 = "iso14083_2022";
  private EmissionsISO140832022 iso140832022;

  public static final String JSON_PROPERTY_ISO140832023 = "iso14083_2023";
  private EmissionsISO140832023 iso140832023;

  public static final String JSON_PROPERTY_FRENCH_C_O2E_DECREE2017639 = "frenchCO2eDecree2017_639";
  private EmissionsFrenchCO2eDecree2017639 frenchCO2eDecree2017639;

  public Emissions() { 
  }

  public Emissions en162582012(EmissionsEN162582012 en162582012) {
    this.en162582012 = en162582012;
    return this;
  }

  /**
   * Get en162582012
   * @return en162582012
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EN162582012)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public EmissionsEN162582012 getEn162582012() {
    return en162582012;
  }


  @JsonProperty(JSON_PROPERTY_EN162582012)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEn162582012(EmissionsEN162582012 en162582012) {
    this.en162582012 = en162582012;
  }


  public Emissions iso140832022(EmissionsISO140832022 iso140832022) {
    this.iso140832022 = iso140832022;
    return this;
  }

  /**
   * Get iso140832022
   * @return iso140832022
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ISO140832022)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public EmissionsISO140832022 getIso140832022() {
    return iso140832022;
  }


  @JsonProperty(JSON_PROPERTY_ISO140832022)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIso140832022(EmissionsISO140832022 iso140832022) {
    this.iso140832022 = iso140832022;
  }


  public Emissions iso140832023(EmissionsISO140832023 iso140832023) {
    this.iso140832023 = iso140832023;
    return this;
  }

  /**
   * Get iso140832023
   * @return iso140832023
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ISO140832023)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public EmissionsISO140832023 getIso140832023() {
    return iso140832023;
  }


  @JsonProperty(JSON_PROPERTY_ISO140832023)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIso140832023(EmissionsISO140832023 iso140832023) {
    this.iso140832023 = iso140832023;
  }


  public Emissions frenchCO2eDecree2017639(EmissionsFrenchCO2eDecree2017639 frenchCO2eDecree2017639) {
    this.frenchCO2eDecree2017639 = frenchCO2eDecree2017639;
    return this;
  }

  /**
   * Get frenchCO2eDecree2017639
   * @return frenchCO2eDecree2017639
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FRENCH_C_O2E_DECREE2017639)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public EmissionsFrenchCO2eDecree2017639 getFrenchCO2eDecree2017639() {
    return frenchCO2eDecree2017639;
  }


  @JsonProperty(JSON_PROPERTY_FRENCH_C_O2E_DECREE2017639)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFrenchCO2eDecree2017639(EmissionsFrenchCO2eDecree2017639 frenchCO2eDecree2017639) {
    this.frenchCO2eDecree2017639 = frenchCO2eDecree2017639;
  }


  /**
   * Return true if this Emissions object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Emissions emissions = (Emissions) o;
    return Objects.equals(this.en162582012, emissions.en162582012) &&
        Objects.equals(this.iso140832022, emissions.iso140832022) &&
        Objects.equals(this.iso140832023, emissions.iso140832023) &&
        Objects.equals(this.frenchCO2eDecree2017639, emissions.frenchCO2eDecree2017639);
  }

  @Override
  public int hashCode() {
    return Objects.hash(en162582012, iso140832022, iso140832023, frenchCO2eDecree2017639);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Emissions {\n");
    sb.append("    en162582012: ").append(toIndentedString(en162582012)).append("\n");
    sb.append("    iso140832022: ").append(toIndentedString(iso140832022)).append("\n");
    sb.append("    iso140832023: ").append(toIndentedString(iso140832023)).append("\n");
    sb.append("    frenchCO2eDecree2017639: ").append(toIndentedString(frenchCO2eDecree2017639)).append("\n");
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

    // add `en16258_2012` to the URL query string
    if (getEn162582012() != null) {
      joiner.add(getEn162582012().toUrlQueryString(prefix + "en16258_2012" + suffix));
    }

    // add `iso14083_2022` to the URL query string
    if (getIso140832022() != null) {
      joiner.add(getIso140832022().toUrlQueryString(prefix + "iso14083_2022" + suffix));
    }

    // add `iso14083_2023` to the URL query string
    if (getIso140832023() != null) {
      joiner.add(getIso140832023().toUrlQueryString(prefix + "iso14083_2023" + suffix));
    }

    // add `frenchCO2eDecree2017_639` to the URL query string
    if (getFrenchCO2eDecree2017639() != null) {
      joiner.add(getFrenchCO2eDecree2017639().toUrlQueryString(prefix + "frenchCO2eDecree2017_639" + suffix));
    }

    return joiner.toString();
  }
}

