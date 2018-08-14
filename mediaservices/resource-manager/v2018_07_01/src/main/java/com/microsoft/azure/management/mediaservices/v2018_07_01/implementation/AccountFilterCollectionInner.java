/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2018_07_01.implementation;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A collection of AccountFilter items.
 */
public class AccountFilterCollectionInner {
    /**
     * A collection of AccountFilter items.
     */
    @JsonProperty(value = "value")
    private List<AccountFilterInner> value;

    /**
     * A link to the next page of the collection (when the collection contains
     * too many results to return in one response).
     */
    @JsonProperty(value = "@odata\\.nextLink")
    private String odatanextLink;

    /**
     * Get a collection of AccountFilter items.
     *
     * @return the value value
     */
    public List<AccountFilterInner> value() {
        return this.value;
    }

    /**
     * Set a collection of AccountFilter items.
     *
     * @param value the value value to set
     * @return the AccountFilterCollectionInner object itself.
     */
    public AccountFilterCollectionInner withValue(List<AccountFilterInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get a link to the next page of the collection (when the collection contains too many results to return in one response).
     *
     * @return the odatanextLink value
     */
    public String odatanextLink() {
        return this.odatanextLink;
    }

    /**
     * Set a link to the next page of the collection (when the collection contains too many results to return in one response).
     *
     * @param odatanextLink the odatanextLink value to set
     * @return the AccountFilterCollectionInner object itself.
     */
    public AccountFilterCollectionInner withOdatanextLink(String odatanextLink) {
        this.odatanextLink = odatanextLink;
        return this;
    }

}
