/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_12_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Usage strings container.
 */
public class VirtualNetworkUsageName {
    /**
     * Localized subnet size and usage string.
     */
    @JsonProperty(value = "localizedValue", access = JsonProperty.Access.WRITE_ONLY)
    private String localizedValue;

    /**
     * Subnet size and usage string.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private String value;

    /**
     * Get localized subnet size and usage string.
     *
     * @return the localizedValue value
     */
    public String localizedValue() {
        return this.localizedValue;
    }

    /**
     * Get subnet size and usage string.
     *
     * @return the value value
     */
    public String value() {
        return this.value;
    }

}
