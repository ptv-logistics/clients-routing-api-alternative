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
import type { WorkingHoursPreset } from './WorkingHoursPreset';
import {
    WorkingHoursPresetFromJSON,
    WorkingHoursPresetFromJSONTyped,
    WorkingHoursPresetToJSON,
} from './WorkingHoursPreset';

/**
 * 
 * @export
 * @interface Driver
 */
export interface Driver {
    /**
     * 
     * @type {WorkingHoursPreset}
     * @memberof Driver
     */
    workingHoursPreset: WorkingHoursPreset;
}



/**
 * Check if a given object implements the Driver interface.
 */
export function instanceOfDriver(value: object): value is Driver {
    if (!('workingHoursPreset' in value) || value['workingHoursPreset'] === undefined) return false;
    return true;
}

export function DriverFromJSON(json: any): Driver {
    return DriverFromJSONTyped(json, false);
}

export function DriverFromJSONTyped(json: any, ignoreDiscriminator: boolean): Driver {
    if (json == null) {
        return json;
    }
    return {
        
        'workingHoursPreset': WorkingHoursPresetFromJSON(json['workingHoursPreset']),
    };
}

export function DriverToJSON(value?: Driver | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'workingHoursPreset': WorkingHoursPresetToJSON(value['workingHoursPreset']),
    };
}

