/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.azurestack.v2017_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Contains the localized display information for this particular operation or
 * action.
 */
public class Display {
    /**
     * The localized, friendly version of the resource provider name.
     */
    @JsonProperty(value = "provider")
    private String provider;

    /**
     * The localized, friendly version of the resource type related to this
     * action or operation; the resource type should match the public
     * documentation for the resource provider.
     */
    @JsonProperty(value = "resource")
    private String resource;

    /**
     * The localized, friendly name for the operation. Use the name as it will
     * displayed to the user.
     */
    @JsonProperty(value = "operation")
    private String operation;

    /**
     * The localized, friendly description for the operation. The description
     * will be displayed to the user. It should be thorough and concise for
     * used in both tooltips and detailed views.
     */
    @JsonProperty(value = "description")
    private String description;

    /**
     * Get the localized, friendly version of the resource provider name.
     *
     * @return the provider value
     */
    public String provider() {
        return this.provider;
    }

    /**
     * Set the localized, friendly version of the resource provider name.
     *
     * @param provider the provider value to set
     * @return the Display object itself.
     */
    public Display withProvider(String provider) {
        this.provider = provider;
        return this;
    }

    /**
     * Get the localized, friendly version of the resource type related to this action or operation; the resource type should match the public documentation for the resource provider.
     *
     * @return the resource value
     */
    public String resource() {
        return this.resource;
    }

    /**
     * Set the localized, friendly version of the resource type related to this action or operation; the resource type should match the public documentation for the resource provider.
     *
     * @param resource the resource value to set
     * @return the Display object itself.
     */
    public Display withResource(String resource) {
        this.resource = resource;
        return this;
    }

    /**
     * Get the localized, friendly name for the operation. Use the name as it will displayed to the user.
     *
     * @return the operation value
     */
    public String operation() {
        return this.operation;
    }

    /**
     * Set the localized, friendly name for the operation. Use the name as it will displayed to the user.
     *
     * @param operation the operation value to set
     * @return the Display object itself.
     */
    public Display withOperation(String operation) {
        this.operation = operation;
        return this;
    }

    /**
     * Get the localized, friendly description for the operation. The description will be displayed to the user. It should be thorough and concise for used in both tooltips and detailed views.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the localized, friendly description for the operation. The description will be displayed to the user. It should be thorough and concise for used in both tooltips and detailed views.
     *
     * @param description the description value to set
     * @return the Display object itself.
     */
    public Display withDescription(String description) {
        this.description = description;
        return this;
    }

}
