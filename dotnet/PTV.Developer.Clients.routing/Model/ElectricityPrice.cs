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
    /// The electricity price payable for charging the battery.
    /// </summary>
    [DataContract(Name = "ElectricityPrice")]
    public partial class ElectricityPrice : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ElectricityPrice" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ElectricityPrice() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ElectricityPrice" /> class.
        /// </summary>
        /// <param name="price">The electricity price in the specified currency. (required).</param>
        /// <param name="currency">The currency code according to [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217). (required).</param>
        public ElectricityPrice(double? price = default(double?), string currency = default(string))
        {
            // to ensure "price" is required (not null)
            if (price == null)
            {
                throw new ArgumentNullException("price is a required property for ElectricityPrice and cannot be null");
            }
            this.Price = price;
            // to ensure "currency" is required (not null)
            if (currency == null)
            {
                throw new ArgumentNullException("currency is a required property for ElectricityPrice and cannot be null");
            }
            this.Currency = currency;
        }

        /// <summary>
        /// The electricity price in the specified currency.
        /// </summary>
        /// <value>The electricity price in the specified currency.</value>
        /// <example>12.91</example>
        [DataMember(Name = "price", IsRequired = true, EmitDefaultValue = true)]
        public double? Price { get; set; }

        /// <summary>
        /// The currency code according to [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217).
        /// </summary>
        /// <value>The currency code according to [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217).</value>
        /// <example>EUR</example>
        [DataMember(Name = "currency", IsRequired = true, EmitDefaultValue = true)]
        public string Currency { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ElectricityPrice {\n");
            sb.Append("  Price: ").Append(Price).Append("\n");
            sb.Append("  Currency: ").Append(Currency).Append("\n");
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
            // Price (double?) minimum
            if (this.Price < (double?)0)
            {
                yield return new ValidationResult("Invalid value for Price, must be a value greater than or equal to 0.", new [] { "Price" });
            }

            yield break;
        }
    }

}
