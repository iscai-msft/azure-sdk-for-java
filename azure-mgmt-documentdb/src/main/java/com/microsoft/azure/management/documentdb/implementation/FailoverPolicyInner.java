/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.documentdb.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The failover policy for a given region of a database account.
 */
public class FailoverPolicyInner {
    /**
     * The unique identifier of the region in which the database account
     * replicates to. Example:
     * &amp;lt;accountName&amp;gt;-&amp;lt;locationName&amp;gt;.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /**
     * The name of the region in which the database account exists.
     */
    @JsonProperty(value = "locationName")
    private String locationName;

    /**
     * The failover priority of the region. A failover priority of 0 indicates
     * a write region. The maximum value for a failover priority = (total
     * number of regions - 1). Failover priority values must be unique for each
     * of the regions in which the database account exists.
     */
    @JsonProperty(value = "failoverPriority")
    private Integer failoverPriority;

    /**
     * Get the id value.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the locationName value.
     *
     * @return the locationName value
     */
    public String locationName() {
        return this.locationName;
    }

    /**
     * Set the locationName value.
     *
     * @param locationName the locationName value to set
     * @return the FailoverPolicyInner object itself.
     */
    public FailoverPolicyInner withLocationName(String locationName) {
        this.locationName = locationName;
        return this;
    }

    /**
     * Get the failoverPriority value.
     *
     * @return the failoverPriority value
     */
    public Integer failoverPriority() {
        return this.failoverPriority;
    }

    /**
     * Set the failoverPriority value.
     *
     * @param failoverPriority the failoverPriority value to set
     * @return the FailoverPolicyInner object itself.
     */
    public FailoverPolicyInner withFailoverPriority(Integer failoverPriority) {
        this.failoverPriority = failoverPriority;
        return this;
    }

}