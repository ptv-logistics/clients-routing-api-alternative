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
import type { AccessType } from './AccessType';
import {
    AccessTypeFromJSON,
    AccessTypeFromJSONTyped,
    AccessTypeToJSON,
} from './AccessType';

/**
 * Issued when the route passes a road for which live traffic data contain an incident such as a traffic jam. Requires _TRAFFIC_EVENTS_ to be requested.
 * @export
 * @interface TrafficEvent
 */
export interface TrafficEvent {
    /**
     * The delay due to this incident [s].
     * @type {number}
     * @memberof TrafficEvent
     */
    delay: number;
    /**
     * The description of the incident in the language specified by the parameter **options[language]**.
     * 
     * @type {string}
     * @memberof TrafficEvent
     */
    description?: string;
    /**
     * The language of the description, if the given language is not supported for this incident. Not present otherwise.
     * @type {string}
     * @memberof TrafficEvent
     */
    language?: string;
    /**
     * 
     * @type {AccessType}
     * @memberof TrafficEvent
     */
    accessType: AccessType;
    /**
     * For **accessType** _ENTER_ this index points to the corresponding event with **accessType** _EXIT_ and vice-versa. Not present otherwise.
     * @type {number}
     * @memberof TrafficEvent
     */
    relatedEventIndex?: number;
    /**
     * The polyline of the traffic event in the format specified by **options[polylineFormat]**. Only present for **accessType** _ENTER_. Requires _TRAFFIC_EVENTS_POLYLINE_ to be requested.
     * @type {string}
     * @memberof TrafficEvent
     */
    polyline?: string;
}



/**
 * Check if a given object implements the TrafficEvent interface.
 */
export function instanceOfTrafficEvent(value: object): value is TrafficEvent {
    if (!('delay' in value) || value['delay'] === undefined) return false;
    if (!('accessType' in value) || value['accessType'] === undefined) return false;
    return true;
}

export function TrafficEventFromJSON(json: any): TrafficEvent {
    return TrafficEventFromJSONTyped(json, false);
}

export function TrafficEventFromJSONTyped(json: any, ignoreDiscriminator: boolean): TrafficEvent {
    if (json == null) {
        return json;
    }
    return {
        
        'delay': json['delay'],
        'description': json['description'] == null ? undefined : json['description'],
        'language': json['language'] == null ? undefined : json['language'],
        'accessType': AccessTypeFromJSON(json['accessType']),
        'relatedEventIndex': json['relatedEventIndex'] == null ? undefined : json['relatedEventIndex'],
        'polyline': json['polyline'] == null ? undefined : json['polyline'],
    };
}

export function TrafficEventToJSON(value?: TrafficEvent | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'delay': value['delay'],
        'description': value['description'],
        'language': value['language'],
        'accessType': AccessTypeToJSON(value['accessType']),
        'relatedEventIndex': value['relatedEventIndex'],
        'polyline': value['polyline'],
    };
}

