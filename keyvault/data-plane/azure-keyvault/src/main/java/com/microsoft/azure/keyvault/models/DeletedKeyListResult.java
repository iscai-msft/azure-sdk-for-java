/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.keyvault.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * A list of keys that have been deleted in this vault.
 */
public final class DeletedKeyListResult {
    /**
     * A response message containing a list of deleted keys in the vault along
     * with a link to the next page of deleted keys.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private List<DeletedKeyItem> value;

    /**
     * The URL to get the next set of deleted keys.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Get the value value.
     *
     * @return the value value.
     */
    public List<DeletedKeyItem> value() {
        return this.value;
    }

    /**
     * Get the nextLink value.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }
}