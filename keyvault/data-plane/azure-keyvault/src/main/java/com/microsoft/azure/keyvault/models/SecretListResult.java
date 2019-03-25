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
 * The secret list result.
 */
public final class SecretListResult {
    /**
     * A response message containing a list of secrets in the key vault along
     * with a link to the next page of secrets.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private List<SecretItem> value;

    /**
     * The URL to get the next set of secrets.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Get the value value.
     *
     * @return the value value.
     */
    public List<SecretItem> value() {
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