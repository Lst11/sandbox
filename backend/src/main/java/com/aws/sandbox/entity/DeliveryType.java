package com.aws.sandbox.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * DeliveryType.
 *
 * @author alena.stanisheuskaya
 */

@Getter
@AllArgsConstructor
public enum DeliveryType {

    SHOP("Доставка до магазина"),
    COURIER("Доставка курьером"),
    POST("Доставка почтой");

    private String name;
}
