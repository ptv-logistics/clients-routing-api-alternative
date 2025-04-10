/* tslint:disable */
/* eslint-disable */
/**
 * Routing
 * With the Routing service you can calculate routes from A to B taking into account vehicle-specific restrictions, traffic situations, toll, emissions, drivers\' working hours, service times and opening intervals.
 *
 * The version of the OpenAPI document: 1.35
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


/**
 * Defines the version of the emission factors to use for emission calculation based on ISO 14083. Will be ignored for other calculation methods.
 * @export
 */
export const Iso14083EmissionFactorsVersion = {
    INITIAL: 'INITIAL',
    VERSION_2: 'VERSION_2',
    LATEST: 'LATEST'
} as const;
export type Iso14083EmissionFactorsVersion = typeof Iso14083EmissionFactorsVersion[keyof typeof Iso14083EmissionFactorsVersion];


export function instanceOfIso14083EmissionFactorsVersion(value: any): boolean {
    for (const key in Iso14083EmissionFactorsVersion) {
        if (Object.prototype.hasOwnProperty.call(Iso14083EmissionFactorsVersion, key)) {
            if (Iso14083EmissionFactorsVersion[key as keyof typeof Iso14083EmissionFactorsVersion] === value) {
                return true;
            }
        }
    }
    return false;
}

export function Iso14083EmissionFactorsVersionFromJSON(json: any): Iso14083EmissionFactorsVersion {
    return Iso14083EmissionFactorsVersionFromJSONTyped(json, false);
}

export function Iso14083EmissionFactorsVersionFromJSONTyped(json: any, ignoreDiscriminator: boolean): Iso14083EmissionFactorsVersion {
    return json as Iso14083EmissionFactorsVersion;
}

export function Iso14083EmissionFactorsVersionToJSON(value?: Iso14083EmissionFactorsVersion | null): any {
    return value as any;
}

