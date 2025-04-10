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

package com.ptvgroup.developer.client.routing.api;

import com.ptvgroup.developer.client.routing.ApiClient;
import com.ptvgroup.developer.client.routing.ApiException;
import com.ptvgroup.developer.client.routing.ApiResponse;
import com.ptvgroup.developer.client.routing.Pair;

import com.ptvgroup.developer.client.routing.model.ErrorResponse;
import com.ptvgroup.developer.client.routing.model.HorizonType;
import com.ptvgroup.developer.client.routing.model.ReachableAreas;
import com.ptvgroup.developer.client.routing.model.ReachableAreasId;
import com.ptvgroup.developer.client.routing.model.ReachableAreasResponse;
import com.ptvgroup.developer.client.routing.model.ReachableOptions;
import java.util.UUID;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.InputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.net.http.HttpRequest;
import java.nio.channels.Channels;
import java.nio.channels.Pipe;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

import java.util.ArrayList;
import java.util.StringJoiner;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-10T12:36:28.857695240Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class ReachableAreasApi {
  private final HttpClient memberVarHttpClient;
  private final ObjectMapper memberVarObjectMapper;
  private final String memberVarBaseUri;
  private final Consumer<HttpRequest.Builder> memberVarInterceptor;
  private final Duration memberVarReadTimeout;
  private final Consumer<HttpResponse<InputStream>> memberVarResponseInterceptor;
  private final Consumer<HttpResponse<String>> memberVarAsyncResponseInterceptor;

  public ReachableAreasApi() {
    this(new ApiClient());
  }

  public ReachableAreasApi(ApiClient apiClient) {
    memberVarHttpClient = apiClient.getHttpClient();
    memberVarObjectMapper = apiClient.getObjectMapper();
    memberVarBaseUri = apiClient.getBaseUri();
    memberVarInterceptor = apiClient.getRequestInterceptor();
    memberVarReadTimeout = apiClient.getReadTimeout();
    memberVarResponseInterceptor = apiClient.getResponseInterceptor();
    memberVarAsyncResponseInterceptor = apiClient.getAsyncResponseInterceptor();
  }

  protected ApiException getApiException(String operationId, HttpResponse<InputStream> response) throws IOException {
    String body = response.body() == null ? null : new String(response.body().readAllBytes());
    String message = formatExceptionMessage(operationId, response.statusCode(), body);
    return new ApiException(response.statusCode(), message, response.headers(), body);
  }

  private String formatExceptionMessage(String operationId, int statusCode, String body) {
    if (body == null || body.isEmpty()) {
      body = "[no body]";
    }
    return operationId + " call failed with: " + statusCode + " - " + body;
  }

  /**
   * 
   * Calculates the areas which can be reached from a waypoint, within given horizons (limited to 25 km or 20 minutes). Use the asynchronous POST and GET requests for larger horizons or calculation of areas from a route.
   * @param waypoint The start or destination waypoint. The format of the waypoint is &#x60;&lt;lat&gt;,&lt;lon&gt;[;&lt;attribute&gt;;&lt;attribute&gt;;...]&#x60; representing a point with the latitude value in degrees from south to north and the longitude value in degrees (WGS84/EPSG:4326) from west to east. This point will be matched to the nearest possible road. By default the air-line connection between given and matched coordinates is not included in the distance or duration. We will refer to this type of waypoint as an _on-road waypoint_.  The behaviour of a waypoint can be changed by appending the following attributes:   * &#x60;includeLastMeters&#x60; to include the air-line connection between given and matched coordinates in the distance or duration.   We will refer to this type of waypoint as an _off-road waypoint_.   * &#x60;roadAccess&#x3D;&lt;lat&gt;,&lt;lon&gt;&#x60;, to use these coordinates for matching to the nearest road. Implies **includeLastMeters**, i.e.   the air-line connection between the waypoint coordinates and the matched coordinates   is included in the distance or duration. This is useful if the waypoint should not be matched to the nearest possible road but to some road further away,   e.g. garage exit at a different road.  See [here](./concepts/waypoints) for more information. (required)
   * @param horizons The distances [m] or travel times [s] of the horizons, depending on the **horizonType**. Limited to 5 horizons (or 3 with a **routeId**). (required)
   * @param profile A profile defines a vehicle by a set of attributes, matching typical transport situations. It must be the name of one of the [predefined profiles](../data-api/concepts/profiles) such as _EUR_TRAILER_TRUCK_.  If this parameter is not specified and the first waypoint or the routeId is located in the Americas, _USA_8_SEMITRAILER_5AXLE_ is used as the default instead of _EUR_TRAILER_TRUCK_.  If the first waypoint or the routeId is located in the Americas but a non-American profile is specified or vice-versa, a warning is returned (routing only). Always use a profile which matches the region of the waypoints to obtain best results.  If the attributes of the profile do not fit to your vehicle, the values can be changed by the corresponding attributes in the **vehicle** parameter (routing only).  The values of the predefined profiles may be adapted to reflect current vehicle standards. To obtain the same results when values change, it is recommended to  always send with the request the **vehicle** parameters that are important for your use case. (optional, default to EUR_TRAILER_TRUCK)
   * @param horizonType  (optional, default to TRAVEL_TIME)
   * @param options Routing-relevant options like driving direction or the use of additional data. Use array notation like &#x60;options[trafficMode]&#x3D;AVERAGE&#x60; to set options. (optional)
   * @return ReachableAreas
   * @throws ApiException if fails to make API call
   */
  public ReachableAreas calculateReachableAreas(String waypoint, List<Integer> horizons, String profile, HorizonType horizonType, ReachableOptions options) throws ApiException {
    ApiResponse<ReachableAreas> localVarResponse = calculateReachableAreasWithHttpInfo(waypoint, horizons, profile, horizonType, options);
    return localVarResponse.getData();
  }

  /**
   * 
   * Calculates the areas which can be reached from a waypoint, within given horizons (limited to 25 km or 20 minutes). Use the asynchronous POST and GET requests for larger horizons or calculation of areas from a route.
   * @param waypoint The start or destination waypoint. The format of the waypoint is &#x60;&lt;lat&gt;,&lt;lon&gt;[;&lt;attribute&gt;;&lt;attribute&gt;;...]&#x60; representing a point with the latitude value in degrees from south to north and the longitude value in degrees (WGS84/EPSG:4326) from west to east. This point will be matched to the nearest possible road. By default the air-line connection between given and matched coordinates is not included in the distance or duration. We will refer to this type of waypoint as an _on-road waypoint_.  The behaviour of a waypoint can be changed by appending the following attributes:   * &#x60;includeLastMeters&#x60; to include the air-line connection between given and matched coordinates in the distance or duration.   We will refer to this type of waypoint as an _off-road waypoint_.   * &#x60;roadAccess&#x3D;&lt;lat&gt;,&lt;lon&gt;&#x60;, to use these coordinates for matching to the nearest road. Implies **includeLastMeters**, i.e.   the air-line connection between the waypoint coordinates and the matched coordinates   is included in the distance or duration. This is useful if the waypoint should not be matched to the nearest possible road but to some road further away,   e.g. garage exit at a different road.  See [here](./concepts/waypoints) for more information. (required)
   * @param horizons The distances [m] or travel times [s] of the horizons, depending on the **horizonType**. Limited to 5 horizons (or 3 with a **routeId**). (required)
   * @param profile A profile defines a vehicle by a set of attributes, matching typical transport situations. It must be the name of one of the [predefined profiles](../data-api/concepts/profiles) such as _EUR_TRAILER_TRUCK_.  If this parameter is not specified and the first waypoint or the routeId is located in the Americas, _USA_8_SEMITRAILER_5AXLE_ is used as the default instead of _EUR_TRAILER_TRUCK_.  If the first waypoint or the routeId is located in the Americas but a non-American profile is specified or vice-versa, a warning is returned (routing only). Always use a profile which matches the region of the waypoints to obtain best results.  If the attributes of the profile do not fit to your vehicle, the values can be changed by the corresponding attributes in the **vehicle** parameter (routing only).  The values of the predefined profiles may be adapted to reflect current vehicle standards. To obtain the same results when values change, it is recommended to  always send with the request the **vehicle** parameters that are important for your use case. (optional, default to EUR_TRAILER_TRUCK)
   * @param horizonType  (optional, default to TRAVEL_TIME)
   * @param options Routing-relevant options like driving direction or the use of additional data. Use array notation like &#x60;options[trafficMode]&#x3D;AVERAGE&#x60; to set options. (optional)
   * @return ApiResponse&lt;ReachableAreas&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ReachableAreas> calculateReachableAreasWithHttpInfo(String waypoint, List<Integer> horizons, String profile, HorizonType horizonType, ReachableOptions options) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = calculateReachableAreasRequestBuilder(waypoint, horizons, profile, horizonType, options);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("calculateReachableAreas", localVarResponse);
        }
        return new ApiResponse<ReachableAreas>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          localVarResponse.body() == null ? null : memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<ReachableAreas>() {}) // closes the InputStream
        );
      } finally {
      }
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder calculateReachableAreasRequestBuilder(String waypoint, List<Integer> horizons, String profile, HorizonType horizonType, ReachableOptions options) throws ApiException {
    // verify the required parameter 'waypoint' is set
    if (waypoint == null) {
      throw new ApiException(400, "Missing the required parameter 'waypoint' when calling calculateReachableAreas");
    }
    // verify the required parameter 'horizons' is set
    if (horizons == null) {
      throw new ApiException(400, "Missing the required parameter 'horizons' when calling calculateReachableAreas");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/reachable-areas";

    List<Pair> localVarQueryParams = new ArrayList<>();
    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    localVarQueryParameterBaseName = "waypoint";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("waypoint", waypoint));
    localVarQueryParameterBaseName = "profile";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("profile", profile));
    localVarQueryParameterBaseName = "horizons";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("csv", "horizons", horizons));
    localVarQueryParameterBaseName = "horizonType";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("horizonType", horizonType));
    localVarQueryParameterBaseName = "options";
    if (options != null) {
      String queryString = options.toUrlQueryString("options");
      if (!queryString.isBlank()) {
        localVarQueryStringJoiner.add(queryString);
      }
    }

    if (!localVarQueryParams.isEmpty() || localVarQueryStringJoiner.length() != 0) {
      StringJoiner queryJoiner = new StringJoiner("&");
      localVarQueryParams.forEach(p -> queryJoiner.add(p.getName() + '=' + p.getValue()));
      if (localVarQueryStringJoiner.length() != 0) {
        queryJoiner.add(localVarQueryStringJoiner.toString());
      }
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath + '?' + queryJoiner.toString()));
    } else {
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));
    }

    localVarRequestBuilder.header("Accept", "application/json");

    localVarRequestBuilder.method("GET", HttpRequest.BodyPublishers.noBody());
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }

  /**
   * 
   * Cancels a reachable areas calculation and deletes the calculated results specified by its ID. Results already calculated cannot be requested by its ID, anymore.
   * @param id The ID of the calculated reachable areas. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteReachableAreas(UUID id) throws ApiException {
    deleteReachableAreasWithHttpInfo(id);
  }

  /**
   * 
   * Cancels a reachable areas calculation and deletes the calculated results specified by its ID. Results already calculated cannot be requested by its ID, anymore.
   * @param id The ID of the calculated reachable areas. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteReachableAreasWithHttpInfo(UUID id) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = deleteReachableAreasRequestBuilder(id);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("deleteReachableAreas", localVarResponse);
        }
        return new ApiResponse<Void>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          null
        );
      } finally {
        // Drain the InputStream
        while (localVarResponse.body().read() != -1) {
            // Ignore
        }
        localVarResponse.body().close();
      }
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder deleteReachableAreasRequestBuilder(UUID id) throws ApiException {
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteReachableAreas");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/reachable-areas/{id}"
        .replace("{id}", ApiClient.urlEncode(id.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Accept", "application/json");

    localVarRequestBuilder.method("DELETE", HttpRequest.BodyPublishers.noBody());
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }

  /**
   * 
   * Gets the results of a reachable areas calculation specified by its ID.
   * @param id The ID of the calculated reachable areas. (required)
   * @return ReachableAreasResponse
   * @throws ApiException if fails to make API call
   */
  public ReachableAreasResponse getReachableAreas(UUID id) throws ApiException {
    ApiResponse<ReachableAreasResponse> localVarResponse = getReachableAreasWithHttpInfo(id);
    return localVarResponse.getData();
  }

  /**
   * 
   * Gets the results of a reachable areas calculation specified by its ID.
   * @param id The ID of the calculated reachable areas. (required)
   * @return ApiResponse&lt;ReachableAreasResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ReachableAreasResponse> getReachableAreasWithHttpInfo(UUID id) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getReachableAreasRequestBuilder(id);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("getReachableAreas", localVarResponse);
        }
        return new ApiResponse<ReachableAreasResponse>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          localVarResponse.body() == null ? null : memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<ReachableAreasResponse>() {}) // closes the InputStream
        );
      } finally {
      }
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder getReachableAreasRequestBuilder(UUID id) throws ApiException {
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getReachableAreas");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/reachable-areas/{id}"
        .replace("{id}", ApiClient.urlEncode(id.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Accept", "application/json");

    localVarRequestBuilder.method("GET", HttpRequest.BodyPublishers.noBody());
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }

  /**
   * 
   * Starts and creates the areas which can be reached from a waypoint or from a route, within given horizons. This type of request is recommended when the **horizons** parameter is more than 20 minutes or 25 km.
   * @param horizons The distances [m] or travel times [s] of the horizons, depending on the **horizonType**. Limited to 5 horizons (or 3 with a **routeId**). (required)
   * @param waypoint The start or destination waypoint. The format of the waypoint is &#x60;&lt;lat&gt;,&lt;lon&gt;[;&lt;attribute&gt;;&lt;attribute&gt;;...]&#x60; representing a point with the latitude value in degrees from south to north and the longitude value in degrees (WGS84/EPSG:4326) from west to east. This point will be matched to the nearest possible road. By default the air-line connection between given and matched coordinates is not included in the distance or duration. We will refer to this type of waypoint as an _on-road waypoint_.  The behaviour of a waypoint can be changed by appending the following attributes:   * &#x60;includeLastMeters&#x60; to include the air-line connection between given and matched coordinates in the distance or duration.   We will refer to this type of waypoint as an _off-road waypoint_.   * &#x60;roadAccess&#x3D;&lt;lat&gt;,&lt;lon&gt;&#x60;, to use these coordinates for matching to the nearest road. Implies **includeLastMeters**, i.e.   the air-line connection between the waypoint coordinates and the matched coordinates   is included in the distance or duration. This is useful if the waypoint should not be matched to the nearest possible road but to some road further away,   e.g. garage exit at a different road.  See [here](./concepts/waypoints) for more information. (optional)
   * @param routeId Instead of the waypoint mentioned above, a **routeId** from a previously calculated route or a matched track can be entered. More information and applying restrictions can be found [here](./concepts/route-ids). (optional)
   * @param profile A profile defines a vehicle by a set of attributes, matching typical transport situations. It must be the name of one of the [predefined profiles](../data-api/concepts/profiles) such as _EUR_TRAILER_TRUCK_.  If this parameter is not specified and the first waypoint or the routeId is located in the Americas, _USA_8_SEMITRAILER_5AXLE_ is used as the default instead of _EUR_TRAILER_TRUCK_.  If the first waypoint or the routeId is located in the Americas but a non-American profile is specified or vice-versa, a warning is returned (routing only). Always use a profile which matches the region of the waypoints to obtain best results.  If the attributes of the profile do not fit to your vehicle, the values can be changed by the corresponding attributes in the **vehicle** parameter (routing only).  The values of the predefined profiles may be adapted to reflect current vehicle standards. To obtain the same results when values change, it is recommended to  always send with the request the **vehicle** parameters that are important for your use case. (optional, default to EUR_TRAILER_TRUCK)
   * @param horizonType  (optional, default to TRAVEL_TIME)
   * @param options Routing-relevant options like driving direction or the use of additional data. Use array notation like &#x60;options[trafficMode]&#x3D;AVERAGE&#x60; to set options. (optional)
   * @return ReachableAreasId
   * @throws ApiException if fails to make API call
   */
  public ReachableAreasId startAndCreateReachableAreas(List<Integer> horizons, String waypoint, UUID routeId, String profile, HorizonType horizonType, ReachableOptions options) throws ApiException {
    ApiResponse<ReachableAreasId> localVarResponse = startAndCreateReachableAreasWithHttpInfo(horizons, waypoint, routeId, profile, horizonType, options);
    return localVarResponse.getData();
  }

  /**
   * 
   * Starts and creates the areas which can be reached from a waypoint or from a route, within given horizons. This type of request is recommended when the **horizons** parameter is more than 20 minutes or 25 km.
   * @param horizons The distances [m] or travel times [s] of the horizons, depending on the **horizonType**. Limited to 5 horizons (or 3 with a **routeId**). (required)
   * @param waypoint The start or destination waypoint. The format of the waypoint is &#x60;&lt;lat&gt;,&lt;lon&gt;[;&lt;attribute&gt;;&lt;attribute&gt;;...]&#x60; representing a point with the latitude value in degrees from south to north and the longitude value in degrees (WGS84/EPSG:4326) from west to east. This point will be matched to the nearest possible road. By default the air-line connection between given and matched coordinates is not included in the distance or duration. We will refer to this type of waypoint as an _on-road waypoint_.  The behaviour of a waypoint can be changed by appending the following attributes:   * &#x60;includeLastMeters&#x60; to include the air-line connection between given and matched coordinates in the distance or duration.   We will refer to this type of waypoint as an _off-road waypoint_.   * &#x60;roadAccess&#x3D;&lt;lat&gt;,&lt;lon&gt;&#x60;, to use these coordinates for matching to the nearest road. Implies **includeLastMeters**, i.e.   the air-line connection between the waypoint coordinates and the matched coordinates   is included in the distance or duration. This is useful if the waypoint should not be matched to the nearest possible road but to some road further away,   e.g. garage exit at a different road.  See [here](./concepts/waypoints) for more information. (optional)
   * @param routeId Instead of the waypoint mentioned above, a **routeId** from a previously calculated route or a matched track can be entered. More information and applying restrictions can be found [here](./concepts/route-ids). (optional)
   * @param profile A profile defines a vehicle by a set of attributes, matching typical transport situations. It must be the name of one of the [predefined profiles](../data-api/concepts/profiles) such as _EUR_TRAILER_TRUCK_.  If this parameter is not specified and the first waypoint or the routeId is located in the Americas, _USA_8_SEMITRAILER_5AXLE_ is used as the default instead of _EUR_TRAILER_TRUCK_.  If the first waypoint or the routeId is located in the Americas but a non-American profile is specified or vice-versa, a warning is returned (routing only). Always use a profile which matches the region of the waypoints to obtain best results.  If the attributes of the profile do not fit to your vehicle, the values can be changed by the corresponding attributes in the **vehicle** parameter (routing only).  The values of the predefined profiles may be adapted to reflect current vehicle standards. To obtain the same results when values change, it is recommended to  always send with the request the **vehicle** parameters that are important for your use case. (optional, default to EUR_TRAILER_TRUCK)
   * @param horizonType  (optional, default to TRAVEL_TIME)
   * @param options Routing-relevant options like driving direction or the use of additional data. Use array notation like &#x60;options[trafficMode]&#x3D;AVERAGE&#x60; to set options. (optional)
   * @return ApiResponse&lt;ReachableAreasId&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ReachableAreasId> startAndCreateReachableAreasWithHttpInfo(List<Integer> horizons, String waypoint, UUID routeId, String profile, HorizonType horizonType, ReachableOptions options) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = startAndCreateReachableAreasRequestBuilder(horizons, waypoint, routeId, profile, horizonType, options);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("startAndCreateReachableAreas", localVarResponse);
        }
        return new ApiResponse<ReachableAreasId>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          localVarResponse.body() == null ? null : memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<ReachableAreasId>() {}) // closes the InputStream
        );
      } finally {
      }
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder startAndCreateReachableAreasRequestBuilder(List<Integer> horizons, String waypoint, UUID routeId, String profile, HorizonType horizonType, ReachableOptions options) throws ApiException {
    // verify the required parameter 'horizons' is set
    if (horizons == null) {
      throw new ApiException(400, "Missing the required parameter 'horizons' when calling startAndCreateReachableAreas");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/reachable-areas";

    List<Pair> localVarQueryParams = new ArrayList<>();
    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    localVarQueryParameterBaseName = "waypoint";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("waypoint", waypoint));
    localVarQueryParameterBaseName = "routeId";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("routeId", routeId));
    localVarQueryParameterBaseName = "profile";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("profile", profile));
    localVarQueryParameterBaseName = "horizons";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("csv", "horizons", horizons));
    localVarQueryParameterBaseName = "horizonType";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("horizonType", horizonType));
    localVarQueryParameterBaseName = "options";
    if (options != null) {
      String queryString = options.toUrlQueryString("options");
      if (!queryString.isBlank()) {
        localVarQueryStringJoiner.add(queryString);
      }
    }

    if (!localVarQueryParams.isEmpty() || localVarQueryStringJoiner.length() != 0) {
      StringJoiner queryJoiner = new StringJoiner("&");
      localVarQueryParams.forEach(p -> queryJoiner.add(p.getName() + '=' + p.getValue()));
      if (localVarQueryStringJoiner.length() != 0) {
        queryJoiner.add(localVarQueryStringJoiner.toString());
      }
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath + '?' + queryJoiner.toString()));
    } else {
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));
    }

    localVarRequestBuilder.header("Accept", "application/json");

    localVarRequestBuilder.method("POST", HttpRequest.BodyPublishers.noBody());
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }

}
