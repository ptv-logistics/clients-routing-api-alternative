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

import { mapValues } from '../runtime';
/**
 * 
 * @export
 * @interface EvOptions
 */
export interface EvOptions {
    /**
     * The available battery capacity at the start of the route [%].
     * @type {number}
     * @memberof EvOptions
     */
    initialStateOfCharge?: number;
    /**
     * The minimum wanted remaining battery capacity at the end of the route and at the end of each leg [%].
     * @type {number}
     * @memberof EvOptions
     */
    minimumStateOfCharge?: number;
    /**
     * Specifies if an energy efficient route should be calculated.
     * @type {boolean}
     * @memberof EvOptions
     */
    energyEfficientRoute?: boolean;
}

/**
 * Check if a given object implements the EvOptions interface.
 */
export function instanceOfEvOptions(value: object): value is EvOptions {
    return true;
}

export function EvOptionsFromJSON(json: any): EvOptions {
    return EvOptionsFromJSONTyped(json, false);
}

export function EvOptionsFromJSONTyped(json: any, ignoreDiscriminator: boolean): EvOptions {
    if (json == null) {
        return json;
    }
    return {
        
        'initialStateOfCharge': json['initialStateOfCharge'] == null ? undefined : json['initialStateOfCharge'],
        'minimumStateOfCharge': json['minimumStateOfCharge'] == null ? undefined : json['minimumStateOfCharge'],
        'energyEfficientRoute': json['energyEfficientRoute'] == null ? undefined : json['energyEfficientRoute'],
    };
}

export function EvOptionsToJSON(value?: EvOptions | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'initialStateOfCharge': value['initialStateOfCharge'],
        'minimumStateOfCharge': value['minimumStateOfCharge'],
        'energyEfficientRoute': value['energyEfficientRoute'],
    };
}

