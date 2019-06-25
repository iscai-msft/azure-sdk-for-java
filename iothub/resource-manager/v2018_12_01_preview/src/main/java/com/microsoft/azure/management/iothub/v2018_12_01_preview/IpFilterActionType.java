/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.iothub.v2018_12_01_preview;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for IpFilterActionType.
 */
public enum IpFilterActionType {
    /** Enum value Accept. */
    ACCEPT("Accept"),

    /** Enum value Reject. */
    REJECT("Reject");

    /** The actual serialized value for a IpFilterActionType instance. */
    private String value;

    IpFilterActionType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a IpFilterActionType instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed IpFilterActionType object, or null if unable to parse.
     */
    @JsonCreator
    public static IpFilterActionType fromString(String value) {
        IpFilterActionType[] items = IpFilterActionType.values();
        for (IpFilterActionType item : items) {
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
