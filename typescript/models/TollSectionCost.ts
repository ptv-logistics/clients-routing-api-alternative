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
import type { PaymentMethod } from './PaymentMethod';
import {
    PaymentMethodFromJSON,
    PaymentMethodFromJSONTyped,
    PaymentMethodToJSON,
} from './PaymentMethod';
import type { TollPrice } from './TollPrice';
import {
    TollPriceFromJSON,
    TollPriceFromJSONTyped,
    TollPriceToJSON,
} from './TollPrice';

/**
 * 
 * @export
 * @interface TollSectionCost
 */
export interface TollSectionCost {
    /**
     * The price in the specified currency.
     * @type {number}
     * @memberof TollSectionCost
     */
    price: number;
    /**
     * The currency code according to [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217).
     * @type {string}
     * @memberof TollSectionCost
     */
    currency: string;
    /**
     * The payment methods for toll costs.  
     *  * `ELECTRONIC_TOLL_COLLECTION_SUBSCRIPTION` - Electronic toll collection system with a subscription required.  
     *  * `ELECTRONIC_TOLL_COLLECTION` - Electronic toll collection system with no subscription required.  
     *  * `CASH` - Cash payment at a toll booth.  
     *  * `CREDIT_CARD` - Credit card payment at a toll booth.
     * @type {Array<PaymentMethod>}
     * @memberof TollSectionCost
     */
    paymentMethods?: Array<PaymentMethod>;
    /**
     * The required electronic toll collection subscriptions for the payment method _ELECTRONIC_TOLL_COLLECTION_SUBSCRIPTION_.
     * @type {Array<string>}
     * @memberof TollSectionCost
     */
    etcSubscriptions?: Array<string>;
    /**
     * The price of the section in the converted currency.
     * @type {TollPrice}
     * @memberof TollSectionCost
     */
    convertedPrice?: TollPrice;
}

/**
 * Check if a given object implements the TollSectionCost interface.
 */
export function instanceOfTollSectionCost(value: object): value is TollSectionCost {
    if (!('price' in value) || value['price'] === undefined) return false;
    if (!('currency' in value) || value['currency'] === undefined) return false;
    return true;
}

export function TollSectionCostFromJSON(json: any): TollSectionCost {
    return TollSectionCostFromJSONTyped(json, false);
}

export function TollSectionCostFromJSONTyped(json: any, ignoreDiscriminator: boolean): TollSectionCost {
    if (json == null) {
        return json;
    }
    return {
        
        'price': json['price'],
        'currency': json['currency'],
        'paymentMethods': json['paymentMethods'] == null ? undefined : ((json['paymentMethods'] as Array<any>).map(PaymentMethodFromJSON)),
        'etcSubscriptions': json['etcSubscriptions'] == null ? undefined : json['etcSubscriptions'],
        'convertedPrice': json['convertedPrice'] == null ? undefined : TollPriceFromJSON(json['convertedPrice']),
    };
}

export function TollSectionCostToJSON(value?: TollSectionCost | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'price': value['price'],
        'currency': value['currency'],
        'paymentMethods': value['paymentMethods'] == null ? undefined : ((value['paymentMethods'] as Array<any>).map(PaymentMethodToJSON)),
        'etcSubscriptions': value['etcSubscriptions'],
        'convertedPrice': TollPriceToJSON(value['convertedPrice']),
    };
}

