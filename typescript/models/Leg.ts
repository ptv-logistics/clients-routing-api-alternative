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
import type { EvReportLeg } from './EvReportLeg';
import {
    EvReportLegFromJSON,
    EvReportLegFromJSONTyped,
    EvReportLegToJSON,
} from './EvReportLeg';
import type { TollCosts } from './TollCosts';
import {
    TollCostsFromJSON,
    TollCostsFromJSONTyped,
    TollCostsToJSON,
} from './TollCosts';

/**
 * 
 * @export
 * @interface Leg
 */
export interface Leg {
    /**
     * The distance of the leg [m].
     * @type {number}
     * @memberof Leg
     */
    distance: number;
    /**
     * The travel time for the leg [s].
     * @type {number}
     * @memberof Leg
     */
    travelTime: number;
    /**
     * The total delay due to live traffic on this leg [s].
     * 
     * This value contains the sum of all traffic events on this leg and will be non-zero only if **options[trafficMode]=REALISTIC**.
     * See [here](./concepts/traffic-modes) for more information.
     * @type {number}
     * @memberof Leg
     */
    trafficDelay?: number;
    /**
     * If there is no valid connection between the waypoints of this leg but the resulting leg can be calculated by using actually prohibited roads, the route is marked as violated.
     * @type {boolean}
     * @memberof Leg
     */
    violated: boolean;
    /**
     * 
     * @type {TollCosts}
     * @memberof Leg
     */
    tollCosts?: TollCosts;
    /**
     * The polyline of the leg in the format specified by **options[polylineFormat]**.
     * @type {string}
     * @memberof Leg
     */
    polyline?: string;
    /**
     * 
     * @type {EvReportLeg}
     * @memberof Leg
     */
    evReport?: EvReportLeg;
}

/**
 * Check if a given object implements the Leg interface.
 */
export function instanceOfLeg(value: object): value is Leg {
    if (!('distance' in value) || value['distance'] === undefined) return false;
    if (!('travelTime' in value) || value['travelTime'] === undefined) return false;
    if (!('violated' in value) || value['violated'] === undefined) return false;
    return true;
}

export function LegFromJSON(json: any): Leg {
    return LegFromJSONTyped(json, false);
}

export function LegFromJSONTyped(json: any, ignoreDiscriminator: boolean): Leg {
    if (json == null) {
        return json;
    }
    return {
        
        'distance': json['distance'],
        'travelTime': json['travelTime'],
        'trafficDelay': json['trafficDelay'] == null ? undefined : json['trafficDelay'],
        'violated': json['violated'],
        'tollCosts': json['tollCosts'] == null ? undefined : TollCostsFromJSON(json['tollCosts']),
        'polyline': json['polyline'] == null ? undefined : json['polyline'],
        'evReport': json['evReport'] == null ? undefined : EvReportLegFromJSON(json['evReport']),
    };
}

export function LegToJSON(value?: Leg | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'distance': value['distance'],
        'travelTime': value['travelTime'],
        'trafficDelay': value['trafficDelay'],
        'violated': value['violated'],
        'tollCosts': TollCostsToJSON(value['tollCosts']),
        'polyline': value['polyline'],
        'evReport': EvReportLegToJSON(value['evReport']),
    };
}

