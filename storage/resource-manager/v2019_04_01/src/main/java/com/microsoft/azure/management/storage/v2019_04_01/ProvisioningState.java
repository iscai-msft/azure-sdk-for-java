/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storage.v2019_04_01;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for ProvisioningState.
 */
public enum ProvisioningState {
    /** Enum value Creating. */
    CREATING("Creating"),

    /** Enum value ResolvingDNS. */
    RESOLVING_DNS("ResolvingDNS"),

    /** Enum value Succeeded. */
    SUCCEEDED("Succeeded");

    /** The actual serialized value for a ProvisioningState instance. */
    private String value;

    ProvisioningState(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a ProvisioningState instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed ProvisioningState object, or null if unable to parse.
     */
    @JsonCreator
    public static ProvisioningState fromString(String value) {
        ProvisioningState[] items = ProvisioningState.values();
        for (ProvisioningState item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
