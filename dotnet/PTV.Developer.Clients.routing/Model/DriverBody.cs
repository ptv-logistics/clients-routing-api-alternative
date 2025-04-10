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
    /// Options regarding the drivers&#39; working hours and work logbook. If no driver object with a working hours preset is passed with the request, working hours will be unlimited.
    /// </summary>
    [DataContract(Name = "DriverBody")]
    public partial class DriverBody : IValidatableObject
    {

        /// <summary>
        /// Gets or Sets WorkingHoursPreset
        /// </summary>
        [DataMember(Name = "workingHoursPreset", IsRequired = true, EmitDefaultValue = true)]
        public WorkingHoursPreset WorkingHoursPreset { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="DriverBody" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected DriverBody() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="DriverBody" /> class.
        /// </summary>
        /// <param name="workingHoursPreset">workingHoursPreset (required).</param>
        /// <param name="workLogbook">workLogbook.</param>
        /// <param name="useTimeOnCombinedTransportForRecreation">If true, the time on a combined transport, e.g. on a ferry, can be used for recreation.  That means that a break or a rest can be scheduled when traveling on a ferry or by rail. As breaks and daily rests may be split to match the time of the combined transport, we recommend to additionally request _COMBINED_TRANSPORT_EVENTS_ when _SCHEDULE_EVENTS_ or _SCHEDULE_EVENTS_WITH_DRIVING_ are requested. (default to false).</param>
        public DriverBody(WorkingHoursPreset workingHoursPreset = default(WorkingHoursPreset), WorkLogbook workLogbook = default(WorkLogbook), bool? useTimeOnCombinedTransportForRecreation = false)
        {
            this.WorkingHoursPreset = workingHoursPreset;
            this.WorkLogbook = workLogbook;
            // use default value if no "useTimeOnCombinedTransportForRecreation" provided
            this.UseTimeOnCombinedTransportForRecreation = useTimeOnCombinedTransportForRecreation ?? false;
        }

        /// <summary>
        /// Gets or Sets WorkLogbook
        /// </summary>
        [DataMember(Name = "workLogbook", EmitDefaultValue = false)]
        public WorkLogbook WorkLogbook { get; set; }

        /// <summary>
        /// If true, the time on a combined transport, e.g. on a ferry, can be used for recreation.  That means that a break or a rest can be scheduled when traveling on a ferry or by rail. As breaks and daily rests may be split to match the time of the combined transport, we recommend to additionally request _COMBINED_TRANSPORT_EVENTS_ when _SCHEDULE_EVENTS_ or _SCHEDULE_EVENTS_WITH_DRIVING_ are requested.
        /// </summary>
        /// <value>If true, the time on a combined transport, e.g. on a ferry, can be used for recreation.  That means that a break or a rest can be scheduled when traveling on a ferry or by rail. As breaks and daily rests may be split to match the time of the combined transport, we recommend to additionally request _COMBINED_TRANSPORT_EVENTS_ when _SCHEDULE_EVENTS_ or _SCHEDULE_EVENTS_WITH_DRIVING_ are requested.</value>
        [DataMember(Name = "useTimeOnCombinedTransportForRecreation", EmitDefaultValue = true)]
        public bool? UseTimeOnCombinedTransportForRecreation { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class DriverBody {\n");
            sb.Append("  WorkingHoursPreset: ").Append(WorkingHoursPreset).Append("\n");
            sb.Append("  WorkLogbook: ").Append(WorkLogbook).Append("\n");
            sb.Append("  UseTimeOnCombinedTransportForRecreation: ").Append(UseTimeOnCombinedTransportForRecreation).Append("\n");
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
