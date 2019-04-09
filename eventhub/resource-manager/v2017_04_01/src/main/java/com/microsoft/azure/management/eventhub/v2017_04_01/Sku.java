/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.eventhub.v2017_04_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SKU parameters supplied to the create namespace operation.
 */
public class Sku {
    /**
     * Name of this SKU. Possible values include: 'Basic', 'Standard'.
     */
    @JsonProperty(value = "name", required = true)
    private SkuName name;

    /**
     * The billing tier of this particular SKU. Possible values include:
     * 'Basic', 'Standard'.
     */
    @JsonProperty(value = "tier")
    private SkuTier tier;

    /**
     * The Event Hubs throughput units, value should be 0 to 20 throughput
     * units.
     */
    @JsonProperty(value = "capacity")
    private Integer capacity;

    /**
     * Get name of this SKU. Possible values include: 'Basic', 'Standard'.
     *
     * @return the name value
     */
    public SkuName name() {
        return this.name;
    }

    /**
     * Set name of this SKU. Possible values include: 'Basic', 'Standard'.
     *
     * @param name the name value to set
     * @return the Sku object itself.
     */
    public Sku withName(SkuName name) {
        this.name = name;
        return this;
    }

    /**
     * Get the billing tier of this particular SKU. Possible values include: 'Basic', 'Standard'.
     *
     * @return the tier value
     */
    public SkuTier tier() {
        return this.tier;
    }

    /**
     * Set the billing tier of this particular SKU. Possible values include: 'Basic', 'Standard'.
     *
     * @param tier the tier value to set
     * @return the Sku object itself.
     */
    public Sku withTier(SkuTier tier) {
        this.tier = tier;
        return this;
    }

    /**
     * Get the Event Hubs throughput units, value should be 0 to 20 throughput units.
     *
     * @return the capacity value
     */
    public Integer capacity() {
        return this.capacity;
    }

    /**
     * Set the Event Hubs throughput units, value should be 0 to 20 throughput units.
     *
     * @param capacity the capacity value to set
     * @return the Sku object itself.
     */
    public Sku withCapacity(Integer capacity) {
        this.capacity = capacity;
        return this;
    }

}
