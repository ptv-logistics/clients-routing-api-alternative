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
 * Provides an overview of the times of the schedule of this route including break and rest times.
 * The sum of all times is equal to the **travelTime** of the route.        
 * If **useServiceTimeForRecreation** is true, waiting, break and rest times which take place during service will
 * not be reported here. If that does not match your needs, please evaluate the corresponding **scheduleEvent**s. 
 * Requires _SCHEDULE_REPORT_ to be requested, POST only.
 * @export
 * @interface ScheduleReport
 */
export interface ScheduleReport {
    /**
     * The start time of the route formatted according to [RFC 3339](https://tools.ietf.org/html/rfc3339). Only present with **options[trafficMode]** _REALISTIC_ or when **options[startTime]** is specified.
     * @type {string}
     * @memberof ScheduleReport
     */
    startTime?: string;
    /**
     * The end time of the route formatted according to [RFC 3339](https://tools.ietf.org/html/rfc3339). Only present with **options[trafficMode]** _REALISTIC_ or when **options[startTime]** is specified.
     * @type {string}
     * @memberof ScheduleReport
     */
    endTime?: string;
    /**
     * The total driving time of the route [s]. Time which is not service, waiting, break or rest is considered as driving.
     * @type {number}
     * @memberof ScheduleReport
     */
    drivingTime: number;
    /**
     * The total service time of the route [s], equal to the sum of **schedule** events of type _SERVICE_.
     * @type {number}
     * @memberof ScheduleReport
     */
    serviceTime: number;
    /**
     * The total waiting time of the route [s], equal to the sum of **schedule** events of type _WAITING_ which are not _SERVICE_ at the same time.
     * @type {number}
     * @memberof ScheduleReport
     */
    waitingTime: number;
    /**
     * The total break time of the route [s], equal to the sum of **schedule** events of type _BREAK_ which are not _SERVICE_ at the same time.
     * @type {number}
     * @memberof ScheduleReport
     */
    breakTime: number;
    /**
     * The total rest time of the route [s], equal to the sum of **schedule** events of type _DAILY_REST_ which are not _SERVICE_ at the same time.
     * @type {number}
     * @memberof ScheduleReport
     */
    restTime: number;
}

/**
 * Check if a given object implements the ScheduleReport interface.
 */
export function instanceOfScheduleReport(value: object): value is ScheduleReport {
    if (!('drivingTime' in value) || value['drivingTime'] === undefined) return false;
    if (!('serviceTime' in value) || value['serviceTime'] === undefined) return false;
    if (!('waitingTime' in value) || value['waitingTime'] === undefined) return false;
    if (!('breakTime' in value) || value['breakTime'] === undefined) return false;
    if (!('restTime' in value) || value['restTime'] === undefined) return false;
    return true;
}

export function ScheduleReportFromJSON(json: any): ScheduleReport {
    return ScheduleReportFromJSONTyped(json, false);
}

export function ScheduleReportFromJSONTyped(json: any, ignoreDiscriminator: boolean): ScheduleReport {
    if (json == null) {
        return json;
    }
    return {
        
        'startTime': json['startTime'] == null ? undefined : json['startTime'],
        'endTime': json['endTime'] == null ? undefined : json['endTime'],
        'drivingTime': json['drivingTime'],
        'serviceTime': json['serviceTime'],
        'waitingTime': json['waitingTime'],
        'breakTime': json['breakTime'],
        'restTime': json['restTime'],
    };
}

export function ScheduleReportToJSON(value?: ScheduleReport | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'startTime': value['startTime'],
        'endTime': value['endTime'],
        'drivingTime': value['drivingTime'],
        'serviceTime': value['serviceTime'],
        'waitingTime': value['waitingTime'],
        'breakTime': value['breakTime'],
        'restTime': value['restTime'],
    };
}

