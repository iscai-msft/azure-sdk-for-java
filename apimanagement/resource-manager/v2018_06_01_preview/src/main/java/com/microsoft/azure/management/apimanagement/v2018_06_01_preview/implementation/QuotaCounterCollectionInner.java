/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2018_06_01_preview.implementation;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Paged Quota Counter list representation.
 */
public class QuotaCounterCollectionInner {
    /**
     * Quota counter values.
     */
    @JsonProperty(value = "value")
    private List<QuotaCounterContractInner> value;

    /**
     * Total record count number across all pages.
     */
    @JsonProperty(value = "count")
    private Long count;

    /**
     * Next page link if any.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get quota counter values.
     *
     * @return the value value
     */
    public List<QuotaCounterContractInner> value() {
        return this.value;
    }

    /**
     * Set quota counter values.
     *
     * @param value the value value to set
     * @return the QuotaCounterCollectionInner object itself.
     */
    public QuotaCounterCollectionInner withValue(List<QuotaCounterContractInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get total record count number across all pages.
     *
     * @return the count value
     */
    public Long count() {
        return this.count;
    }

    /**
     * Set total record count number across all pages.
     *
     * @param count the count value to set
     * @return the QuotaCounterCollectionInner object itself.
     */
    public QuotaCounterCollectionInner withCount(Long count) {
        this.count = count;
        return this;
    }

    /**
     * Get next page link if any.
     *
     * @return the nextLink value
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set next page link if any.
     *
     * @param nextLink the nextLink value to set
     * @return the QuotaCounterCollectionInner object itself.
     */
    public QuotaCounterCollectionInner withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

}
