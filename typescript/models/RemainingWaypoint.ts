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
import type { ScheduleViolationType } from './ScheduleViolationType';
import {
    ScheduleViolationTypeFromJSON,
    ScheduleViolationTypeFromJSONTyped,
    ScheduleViolationTypeToJSON,
} from './ScheduleViolationType';

/**
 * 
 * @export
 * @interface RemainingWaypoint
 */
export interface RemainingWaypoint {
    /**
     * The name of this waypoint.
     * @type {string}
     * @memberof RemainingWaypoint
     */
    name: string;
    /**
     * The estimated time of arrival at this waypoint formatted according to [RFC 3339](https://tools.ietf.org/html/rfc3339).
     * Does not include service, break, rest and waiting at this waypoint.
     * @type {string}
     * @memberof RemainingWaypoint
     */
    estimatedTimeOfArrival: string;
    /**
     * The distance from the current position to this waypoint [m].
     * @type {number}
     * @memberof RemainingWaypoint
     */
    distance: number;
    /**
     * The travel time from the current position to this waypoint [s]. Does not include service, break, rest and waiting at this waypoint.
     * @type {number}
     * @memberof RemainingWaypoint
     */
    travelTime: number;
    /**
     * The delay due to live traffic from the current position to this waypoint [s].
     * @type {number}
     * @memberof RemainingWaypoint
     */
    trafficDelay: number;
    /**
     * The waiting time at this waypoint [s].
     * @type {number}
     * @memberof RemainingWaypoint
     */
    waitingTime: number;
    /**
     * Contains the list of violated schedule restrictions at this waypoint.
     * @type {Array<ScheduleViolationType>}
     * @memberof RemainingWaypoint
     */
    scheduleViolations: Array<ScheduleViolationType>;
    /**
     * If there is no valid route for the given vehicle between the vehicle position and this waypoint, but the resulting route can be calculated using roads actually prohibited, the route is marked as violated.
     * @type {boolean}
     * @memberof RemainingWaypoint
     */
    violated: boolean;
}

/**
 * Check if a given object implements the RemainingWaypoint interface.
 */
export function instanceOfRemainingWaypoint(value: object): value is RemainingWaypoint {
    if (!('name' in value) || value['name'] === undefined) return false;
    if (!('estimatedTimeOfArrival' in value) || value['estimatedTimeOfArrival'] === undefined) return false;
    if (!('distance' in value) || value['distance'] === undefined) return false;
    if (!('travelTime' in value) || value['travelTime'] === undefined) return false;
    if (!('trafficDelay' in value) || value['trafficDelay'] === undefined) return false;
    if (!('waitingTime' in value) || value['waitingTime'] === undefined) return false;
    if (!('scheduleViolations' in value) || value['scheduleViolations'] === undefined) return false;
    if (!('violated' in value) || value['violated'] === undefined) return false;
    return true;
}

export function RemainingWaypointFromJSON(json: any): RemainingWaypoint {
    return RemainingWaypointFromJSONTyped(json, false);
}

export function RemainingWaypointFromJSONTyped(json: any, ignoreDiscriminator: boolean): RemainingWaypoint {
    if (json == null) {
        return json;
    }
    return {
        
        'name': json['name'],
        'estimatedTimeOfArrival': json['estimatedTimeOfArrival'],
        'distance': json['distance'],
        'travelTime': json['travelTime'],
        'trafficDelay': json['trafficDelay'],
        'waitingTime': json['waitingTime'],
        'scheduleViolations': ((json['scheduleViolations'] as Array<any>).map(ScheduleViolationTypeFromJSON)),
        'violated': json['violated'],
    };
}

export function RemainingWaypointToJSON(value?: RemainingWaypoint | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'name': value['name'],
        'estimatedTimeOfArrival': value['estimatedTimeOfArrival'],
        'distance': value['distance'],
        'travelTime': value['travelTime'],
        'trafficDelay': value['trafficDelay'],
        'waitingTime': value['waitingTime'],
        'scheduleViolations': ((value['scheduleViolations'] as Array<any>).map(ScheduleViolationTypeToJSON)),
        'violated': value['violated'],
    };
}

