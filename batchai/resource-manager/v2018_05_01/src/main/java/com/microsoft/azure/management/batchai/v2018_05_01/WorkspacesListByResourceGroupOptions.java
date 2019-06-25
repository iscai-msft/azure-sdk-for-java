/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.batchai.v2018_05_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Additional parameters for listByResourceGroup operation.
 */
public class WorkspacesListByResourceGroupOptions {
    /**
     * The maximum number of items to return in the response. A maximum of 1000
     * files can be returned.
     */
    @JsonProperty(value = "")
    private Integer maxResults;

    /**
     * Get the maximum number of items to return in the response. A maximum of 1000 files can be returned.
     *
     * @return the maxResults value
     */
    public Integer maxResults() {
        return this.maxResults;
    }

    /**
     * Set the maximum number of items to return in the response. A maximum of 1000 files can be returned.
     *
     * @param maxResults the maxResults value to set
     * @return the WorkspacesListByResourceGroupOptions object itself.
     */
    public WorkspacesListByResourceGroupOptions withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

}
