/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2015_04_08;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Cosmos DB table id object.
 */
public class TableResource {
    /**
     * Name of the Cosmos DB table.
     */
    @JsonProperty(value = "id", required = true)
    private String id;

    /**
     * Get name of the Cosmos DB table.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set name of the Cosmos DB table.
     *
     * @param id the id value to set
     * @return the TableResource object itself.
     */
    public TableResource withId(String id) {
        this.id = id;
        return this;
    }

}
