/*
 * Routing
 *
 * With the Routing service you can calculate routes from A to B taking into account vehicle-specific restrictions, traffic situations, toll, emissions, drivers' working hours, service times and opening intervals.
 *
 * The version of the OpenAPI document: 1.35
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = PTV.Developer.Clients.routing.Client.OpenAPIDateConverter;

namespace PTV.Developer.Clients.routing.Model
{
    /// <summary>
    /// The reason why the road or the schedule is violated.  * &#x60;PROHIBITED&#x60; - The violated road is prohibited in general for the current vehicle such as some roads in city centers, parks, forests and farmland or it is temporarily closed due to construction sites.    * &#x60;DELIVERY_ONLY&#x60; - The violated road is prohibited except for delivery vehicles such as factory premises or pedestrian zones. Cars and vans are no delivery vehicles and may produce such violations.    * &#x60;URBAN&#x60; - The violated road is prohibited because urban roads are prohibited for the current vehicle. This will not happen for the predefined profiles.    * &#x60;RESIDENTS_ONLY&#x60; - The violated road is prohibited because roads flagged as residents only are prohibited for the current vehicle. This will not happen for the predefined profiles.  * &#x60;RESTRICTED_ACCESS&#x60; - The violated road is prohibited because it has restricted access because a gate or a bollard has to be passed. This will always have **accessType** _PASS_.    * &#x60;VEHICLE_PROPERTY&#x60; - The violated road is prohibited for the current vehicle as some vehicle property exceeds a limit such as the weight or height, or the road is prohibited for trucks in general.    * &#x60;COMBINED_TRANSPORT&#x60; - The violated road is a boat (ferry) or rail (train or rail shuttle) connection prohibited for the current vehicle.  * &#x60;SCHEDULE&#x60; - The schedule is violated. The reasons can be found in **scheduleViolationTypes**.  * &#x60;BLOCKED_ROAD_BY_INTERSECTION&#x60; - The violated road has been blocked through **options[blockIntersectingRoads]**.
    /// </summary>
    /// <value>The reason why the road or the schedule is violated.  * &#x60;PROHIBITED&#x60; - The violated road is prohibited in general for the current vehicle such as some roads in city centers, parks, forests and farmland or it is temporarily closed due to construction sites.    * &#x60;DELIVERY_ONLY&#x60; - The violated road is prohibited except for delivery vehicles such as factory premises or pedestrian zones. Cars and vans are no delivery vehicles and may produce such violations.    * &#x60;URBAN&#x60; - The violated road is prohibited because urban roads are prohibited for the current vehicle. This will not happen for the predefined profiles.    * &#x60;RESIDENTS_ONLY&#x60; - The violated road is prohibited because roads flagged as residents only are prohibited for the current vehicle. This will not happen for the predefined profiles.  * &#x60;RESTRICTED_ACCESS&#x60; - The violated road is prohibited because it has restricted access because a gate or a bollard has to be passed. This will always have **accessType** _PASS_.    * &#x60;VEHICLE_PROPERTY&#x60; - The violated road is prohibited for the current vehicle as some vehicle property exceeds a limit such as the weight or height, or the road is prohibited for trucks in general.    * &#x60;COMBINED_TRANSPORT&#x60; - The violated road is a boat (ferry) or rail (train or rail shuttle) connection prohibited for the current vehicle.  * &#x60;SCHEDULE&#x60; - The schedule is violated. The reasons can be found in **scheduleViolationTypes**.  * &#x60;BLOCKED_ROAD_BY_INTERSECTION&#x60; - The violated road has been blocked through **options[blockIntersectingRoads]**.</value>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum ViolationType
    {
        /// <summary>
        /// Enum PROHIBITED for value: PROHIBITED
        /// </summary>
        [EnumMember(Value = "PROHIBITED")]
        PROHIBITED = 1,

        /// <summary>
        /// Enum DELIVERY_ONLY for value: DELIVERY_ONLY
        /// </summary>
        [EnumMember(Value = "DELIVERY_ONLY")]
        DELIVERY_ONLY = 2,

        /// <summary>
        /// Enum URBAN for value: URBAN
        /// </summary>
        [EnumMember(Value = "URBAN")]
        URBAN = 3,

        /// <summary>
        /// Enum RESIDENTS_ONLY for value: RESIDENTS_ONLY
        /// </summary>
        [EnumMember(Value = "RESIDENTS_ONLY")]
        RESIDENTS_ONLY = 4,

        /// <summary>
        /// Enum RESTRICTED_ACCESS for value: RESTRICTED_ACCESS
        /// </summary>
        [EnumMember(Value = "RESTRICTED_ACCESS")]
        RESTRICTED_ACCESS = 5,

        /// <summary>
        /// Enum VEHICLE_PROPERTY for value: VEHICLE_PROPERTY
        /// </summary>
        [EnumMember(Value = "VEHICLE_PROPERTY")]
        VEHICLE_PROPERTY = 6,

        /// <summary>
        /// Enum COMBINED_TRANSPORT for value: COMBINED_TRANSPORT
        /// </summary>
        [EnumMember(Value = "COMBINED_TRANSPORT")]
        COMBINED_TRANSPORT = 7,

        /// <summary>
        /// Enum SCHEDULE for value: SCHEDULE
        /// </summary>
        [EnumMember(Value = "SCHEDULE")]
        SCHEDULE = 8,

        /// <summary>
        /// Enum BLOCKED_ROAD_BY_INTERSECTION for value: BLOCKED_ROAD_BY_INTERSECTION
        /// </summary>
        [EnumMember(Value = "BLOCKED_ROAD_BY_INTERSECTION")]
        BLOCKED_ROAD_BY_INTERSECTION = 9
    }

}
