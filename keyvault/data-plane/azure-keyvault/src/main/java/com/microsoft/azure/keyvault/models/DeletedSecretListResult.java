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
 * The deleted secret list result.
 */
public final class DeletedSecretListResult {
    /**
     * A response message containing a list of the deleted secrets in the vault
     * along with a link to the next page of deleted secrets.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private List<DeletedSecretItem> value;

    /**
     * The URL to get the next set of deleted secrets.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Get the value value.
     *
     * @return the value value.
     */
    public List<DeletedSecretItem> value() {
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