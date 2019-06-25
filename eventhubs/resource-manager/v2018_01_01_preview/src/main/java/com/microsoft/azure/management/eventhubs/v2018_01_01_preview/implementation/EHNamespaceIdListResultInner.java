/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.eventhubs.v2018_01_01_preview.implementation;

import java.util.List;
import com.microsoft.azure.management.eventhubs.v2018_01_01_preview.EHNamespaceIdContainer;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The response of the List Namespace IDs operation.
 */
public class EHNamespaceIdListResultInner {
    /**
     * Result of the List Namespace IDs operation.
     */
    @JsonProperty(value = "value")
    private List<EHNamespaceIdContainer> value;

    /**
     * Get result of the List Namespace IDs operation.
     *
     * @return the value value
     */
    public List<EHNamespaceIdContainer> value() {
        return this.value;
    }

    /**
     * Set result of the List Namespace IDs operation.
     *
     * @param value the value value to set
     * @return the EHNamespaceIdListResultInner object itself.
     */
    public EHNamespaceIdListResultInner withValue(List<EHNamespaceIdContainer> value) {
        this.value = value;
        return this;
    }

}
