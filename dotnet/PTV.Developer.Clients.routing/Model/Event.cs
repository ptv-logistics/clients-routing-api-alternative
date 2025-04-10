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
    /// Event
    /// </summary>
    [DataContract(Name = "Event")]
    public partial class Event : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="Event" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected Event() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="Event" /> class.
        /// </summary>
        /// <param name="latitude">The latitude of the position where the event takes place in degrees (WGS84/EPSG:4326) from south to north. (required).</param>
        /// <param name="longitude">The longitude of the position where the event takes place in degrees (WGS84/EPSG:4326) from west to east. (required).</param>
        /// <param name="startsAt">The time at which the event starts formatted according to [RFC 3339](https://tools.ietf.org/html/rfc3339). Will not be present for **trafficMode** _AVERAGE_ when neither **startTime** nor **arrivalTime** is specified..</param>
        /// <param name="distanceFromStart">The distance from the start to this event [m]. (required).</param>
        /// <param name="travelTimeFromStart">The travel time from the start to this event [s]. (required).</param>
        /// <param name="countryCode">Countries are represented according to their [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) or [ISO 3166-2](https://en.wikipedia.org/wiki/ISO_3166-2) if referring to a subdivision. (required).</param>
        /// <param name="utcOffset">The offset to UTC [min]. Will not contain daylight-saving time for **trafficMode** _AVERAGE_ when neither **startTime** nor **arrivalTime** is specified. (required).</param>
        /// <param name="toll">toll.</param>
        /// <param name="maneuver">maneuver.</param>
        /// <param name="border">border.</param>
        /// <param name="violation">violation.</param>
        /// <param name="waypoint">waypoint.</param>
        /// <param name="utcOffsetChange">utcOffsetChange.</param>
        /// <param name="schedule">schedule.</param>
        /// <param name="combinedTransport">combinedTransport.</param>
        /// <param name="traffic">traffic.</param>
        /// <param name="lowEmissionZone">lowEmissionZone.</param>
        /// <param name="deliveryOnly">deliveryOnly.</param>
        /// <param name="evStatus">evStatus.</param>
        /// <param name="charge">charge.</param>
        public Event(double? latitude = default(double?), double? longitude = default(double?), string startsAt = default(string), int? distanceFromStart = default(int?), int? travelTimeFromStart = default(int?), string countryCode = default(string), int? utcOffset = default(int?), TollEvent toll = default(TollEvent), ManeuverEvent maneuver = default(ManeuverEvent), BorderEvent border = default(BorderEvent), ViolationEvent violation = default(ViolationEvent), WaypointEvent waypoint = default(WaypointEvent), UTCOffsetChangeEvent utcOffsetChange = default(UTCOffsetChangeEvent), ScheduleEvent schedule = default(ScheduleEvent), CombinedTransportEvent combinedTransport = default(CombinedTransportEvent), TrafficEvent traffic = default(TrafficEvent), LowEmissionZoneEvent lowEmissionZone = default(LowEmissionZoneEvent), DeliveryOnlyEvent deliveryOnly = default(DeliveryOnlyEvent), EvStatusEvent evStatus = default(EvStatusEvent), ChargeEvent charge = default(ChargeEvent))
        {
            // to ensure "latitude" is required (not null)
            if (latitude == null)
            {
                throw new ArgumentNullException("latitude is a required property for Event and cannot be null");
            }
            this.Latitude = latitude;
            // to ensure "longitude" is required (not null)
            if (longitude == null)
            {
                throw new ArgumentNullException("longitude is a required property for Event and cannot be null");
            }
            this.Longitude = longitude;
            // to ensure "distanceFromStart" is required (not null)
            if (distanceFromStart == null)
            {
                throw new ArgumentNullException("distanceFromStart is a required property for Event and cannot be null");
            }
            this.DistanceFromStart = distanceFromStart;
            // to ensure "travelTimeFromStart" is required (not null)
            if (travelTimeFromStart == null)
            {
                throw new ArgumentNullException("travelTimeFromStart is a required property for Event and cannot be null");
            }
            this.TravelTimeFromStart = travelTimeFromStart;
            // to ensure "countryCode" is required (not null)
            if (countryCode == null)
            {
                throw new ArgumentNullException("countryCode is a required property for Event and cannot be null");
            }
            this.CountryCode = countryCode;
            // to ensure "utcOffset" is required (not null)
            if (utcOffset == null)
            {
                throw new ArgumentNullException("utcOffset is a required property for Event and cannot be null");
            }
            this.UtcOffset = utcOffset;
            this.StartsAt = startsAt;
            this.Toll = toll;
            this.Maneuver = maneuver;
            this.Border = border;
            this.Violation = violation;
            this.Waypoint = waypoint;
            this.UtcOffsetChange = utcOffsetChange;
            this.Schedule = schedule;
            this.CombinedTransport = combinedTransport;
            this.Traffic = traffic;
            this.LowEmissionZone = lowEmissionZone;
            this.DeliveryOnly = deliveryOnly;
            this.EvStatus = evStatus;
            this.Charge = charge;
        }

        /// <summary>
        /// The latitude of the position where the event takes place in degrees (WGS84/EPSG:4326) from south to north.
        /// </summary>
        /// <value>The latitude of the position where the event takes place in degrees (WGS84/EPSG:4326) from south to north.</value>
        /// <example>49.254878</example>
        [DataMember(Name = "latitude", IsRequired = true, EmitDefaultValue = true)]
        public double? Latitude { get; set; }

        /// <summary>
        /// The longitude of the position where the event takes place in degrees (WGS84/EPSG:4326) from west to east.
        /// </summary>
        /// <value>The longitude of the position where the event takes place in degrees (WGS84/EPSG:4326) from west to east.</value>
        /// <example>8.544585</example>
        [DataMember(Name = "longitude", IsRequired = true, EmitDefaultValue = true)]
        public double? Longitude { get; set; }

        /// <summary>
        /// The time at which the event starts formatted according to [RFC 3339](https://tools.ietf.org/html/rfc3339). Will not be present for **trafficMode** _AVERAGE_ when neither **startTime** nor **arrivalTime** is specified.
        /// </summary>
        /// <value>The time at which the event starts formatted according to [RFC 3339](https://tools.ietf.org/html/rfc3339). Will not be present for **trafficMode** _AVERAGE_ when neither **startTime** nor **arrivalTime** is specified.</value>
        /// <example>2020-04-06T06:00:00+00:00</example>
        [DataMember(Name = "startsAt", EmitDefaultValue = true)]
        public string StartsAt { get; set; }

        /// <summary>
        /// The distance from the start to this event [m].
        /// </summary>
        /// <value>The distance from the start to this event [m].</value>
        /// <example>1422</example>
        [DataMember(Name = "distanceFromStart", IsRequired = true, EmitDefaultValue = true)]
        public int? DistanceFromStart { get; set; }

        /// <summary>
        /// The travel time from the start to this event [s].
        /// </summary>
        /// <value>The travel time from the start to this event [s].</value>
        /// <example>56</example>
        [DataMember(Name = "travelTimeFromStart", IsRequired = true, EmitDefaultValue = true)]
        public int? TravelTimeFromStart { get; set; }

        /// <summary>
        /// Countries are represented according to their [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) or [ISO 3166-2](https://en.wikipedia.org/wiki/ISO_3166-2) if referring to a subdivision.
        /// </summary>
        /// <value>Countries are represented according to their [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) or [ISO 3166-2](https://en.wikipedia.org/wiki/ISO_3166-2) if referring to a subdivision.</value>
        /// <example>DE</example>
        [DataMember(Name = "countryCode", IsRequired = true, EmitDefaultValue = true)]
        public string CountryCode { get; set; }

        /// <summary>
        /// The offset to UTC [min]. Will not contain daylight-saving time for **trafficMode** _AVERAGE_ when neither **startTime** nor **arrivalTime** is specified.
        /// </summary>
        /// <value>The offset to UTC [min]. Will not contain daylight-saving time for **trafficMode** _AVERAGE_ when neither **startTime** nor **arrivalTime** is specified.</value>
        [DataMember(Name = "utcOffset", IsRequired = true, EmitDefaultValue = true)]
        public int? UtcOffset { get; set; }

        /// <summary>
        /// Gets or Sets Toll
        /// </summary>
        [DataMember(Name = "toll", EmitDefaultValue = false)]
        public TollEvent Toll { get; set; }

        /// <summary>
        /// Gets or Sets Maneuver
        /// </summary>
        [DataMember(Name = "maneuver", EmitDefaultValue = false)]
        public ManeuverEvent Maneuver { get; set; }

        /// <summary>
        /// Gets or Sets Border
        /// </summary>
        [DataMember(Name = "border", EmitDefaultValue = false)]
        public BorderEvent Border { get; set; }

        /// <summary>
        /// Gets or Sets Violation
        /// </summary>
        [DataMember(Name = "violation", EmitDefaultValue = false)]
        public ViolationEvent Violation { get; set; }

        /// <summary>
        /// Gets or Sets Waypoint
        /// </summary>
        [DataMember(Name = "waypoint", EmitDefaultValue = false)]
        public WaypointEvent Waypoint { get; set; }

        /// <summary>
        /// Gets or Sets UtcOffsetChange
        /// </summary>
        [DataMember(Name = "utcOffsetChange", EmitDefaultValue = false)]
        public UTCOffsetChangeEvent UtcOffsetChange { get; set; }

        /// <summary>
        /// Gets or Sets Schedule
        /// </summary>
        [DataMember(Name = "schedule", EmitDefaultValue = false)]
        public ScheduleEvent Schedule { get; set; }

        /// <summary>
        /// Gets or Sets CombinedTransport
        /// </summary>
        [DataMember(Name = "combinedTransport", EmitDefaultValue = false)]
        public CombinedTransportEvent CombinedTransport { get; set; }

        /// <summary>
        /// Gets or Sets Traffic
        /// </summary>
        [DataMember(Name = "traffic", EmitDefaultValue = false)]
        public TrafficEvent Traffic { get; set; }

        /// <summary>
        /// Gets or Sets LowEmissionZone
        /// </summary>
        [DataMember(Name = "lowEmissionZone", EmitDefaultValue = false)]
        public LowEmissionZoneEvent LowEmissionZone { get; set; }

        /// <summary>
        /// Gets or Sets DeliveryOnly
        /// </summary>
        [DataMember(Name = "deliveryOnly", EmitDefaultValue = false)]
        public DeliveryOnlyEvent DeliveryOnly { get; set; }

        /// <summary>
        /// Gets or Sets EvStatus
        /// </summary>
        [DataMember(Name = "evStatus", EmitDefaultValue = false)]
        public EvStatusEvent EvStatus { get; set; }

        /// <summary>
        /// Gets or Sets Charge
        /// </summary>
        [DataMember(Name = "charge", EmitDefaultValue = false)]
        public ChargeEvent Charge { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class Event {\n");
            sb.Append("  Latitude: ").Append(Latitude).Append("\n");
            sb.Append("  Longitude: ").Append(Longitude).Append("\n");
            sb.Append("  StartsAt: ").Append(StartsAt).Append("\n");
            sb.Append("  DistanceFromStart: ").Append(DistanceFromStart).Append("\n");
            sb.Append("  TravelTimeFromStart: ").Append(TravelTimeFromStart).Append("\n");
            sb.Append("  CountryCode: ").Append(CountryCode).Append("\n");
            sb.Append("  UtcOffset: ").Append(UtcOffset).Append("\n");
            sb.Append("  Toll: ").Append(Toll).Append("\n");
            sb.Append("  Maneuver: ").Append(Maneuver).Append("\n");
            sb.Append("  Border: ").Append(Border).Append("\n");
            sb.Append("  Violation: ").Append(Violation).Append("\n");
            sb.Append("  Waypoint: ").Append(Waypoint).Append("\n");
            sb.Append("  UtcOffsetChange: ").Append(UtcOffsetChange).Append("\n");
            sb.Append("  Schedule: ").Append(Schedule).Append("\n");
            sb.Append("  CombinedTransport: ").Append(CombinedTransport).Append("\n");
            sb.Append("  Traffic: ").Append(Traffic).Append("\n");
            sb.Append("  LowEmissionZone: ").Append(LowEmissionZone).Append("\n");
            sb.Append("  DeliveryOnly: ").Append(DeliveryOnly).Append("\n");
            sb.Append("  EvStatus: ").Append(EvStatus).Append("\n");
            sb.Append("  Charge: ").Append(Charge).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            // Latitude (double?) maximum
            if (this.Latitude > (double?)90)
            {
                yield return new ValidationResult("Invalid value for Latitude, must be a value less than or equal to 90.", new [] { "Latitude" });
            }

            // Latitude (double?) minimum
            if (this.Latitude < (double?)-90)
            {
                yield return new ValidationResult("Invalid value for Latitude, must be a value greater than or equal to -90.", new [] { "Latitude" });
            }

            // Longitude (double?) maximum
            if (this.Longitude > (double?)180)
            {
                yield return new ValidationResult("Invalid value for Longitude, must be a value less than or equal to 180.", new [] { "Longitude" });
            }

            // Longitude (double?) minimum
            if (this.Longitude < (double?)-180)
            {
                yield return new ValidationResult("Invalid value for Longitude, must be a value greater than or equal to -180.", new [] { "Longitude" });
            }

            // DistanceFromStart (int?) minimum
            if (this.DistanceFromStart < (int?)0)
            {
                yield return new ValidationResult("Invalid value for DistanceFromStart, must be a value greater than or equal to 0.", new [] { "DistanceFromStart" });
            }

            // TravelTimeFromStart (int?) minimum
            if (this.TravelTimeFromStart < (int?)0)
            {
                yield return new ValidationResult("Invalid value for TravelTimeFromStart, must be a value greater than or equal to 0.", new [] { "TravelTimeFromStart" });
            }

            // UtcOffset (int?) maximum
            if (this.UtcOffset > (int?)840)
            {
                yield return new ValidationResult("Invalid value for UtcOffset, must be a value less than or equal to 840.", new [] { "UtcOffset" });
            }

            // UtcOffset (int?) minimum
            if (this.UtcOffset < (int?)-720)
            {
                yield return new ValidationResult("Invalid value for UtcOffset, must be a value greater than or equal to -720.", new [] { "UtcOffset" });
            }

            yield break;
        }
    }

}
