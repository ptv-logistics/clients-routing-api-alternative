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
    /// ReachableLocationsResponse
    /// </summary>
    [DataContract(Name = "ReachableLocationsResponse")]
    public partial class ReachableLocationsResponse : IValidatableObject
    {

        /// <summary>
        /// Gets or Sets Status
        /// </summary>
        [DataMember(Name = "status", EmitDefaultValue = true)]
        public CalculationStatus? Status { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="ReachableLocationsResponse" /> class.
        /// </summary>
        /// <param name="status">status.</param>
        /// <param name="reachableLocations">reachableLocations.</param>
        /// <param name="error">error.</param>
        public ReachableLocationsResponse(CalculationStatus? status = default(CalculationStatus?), ReachableLocations reachableLocations = default(ReachableLocations), ErrorResponse error = default(ErrorResponse))
        {
            this.Status = status;
            this.ReachableLocations = reachableLocations;
            this.Error = error;
        }

        /// <summary>
        /// Gets or Sets ReachableLocations
        /// </summary>
        [DataMember(Name = "reachableLocations", EmitDefaultValue = false)]
        public ReachableLocations ReachableLocations { get; set; }

        /// <summary>
        /// Gets or Sets Error
        /// </summary>
        [DataMember(Name = "error", EmitDefaultValue = false)]
        public ErrorResponse Error { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ReachableLocationsResponse {\n");
            sb.Append("  Status: ").Append(Status).Append("\n");
            sb.Append("  ReachableLocations: ").Append(ReachableLocations).Append("\n");
            sb.Append("  Error: ").Append(Error).Append("\n");
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
            yield break;
        }
    }

}
