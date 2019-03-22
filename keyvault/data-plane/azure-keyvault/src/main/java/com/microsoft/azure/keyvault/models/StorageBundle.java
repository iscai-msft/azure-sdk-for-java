/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.keyvault.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/**
 * A Storage account bundle consists of key vault storage account details plus
 * its attributes.
 */
public class StorageBundle {
    /**
     * The storage account id.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /**
     * The storage account resource id.
     */
    @JsonProperty(value = "resourceId", access = JsonProperty.Access.WRITE_ONLY)
    private String resourceId;

    /**
     * The current active storage account key name.
     */
    @JsonProperty(value = "activeKeyName", access = JsonProperty.Access.WRITE_ONLY)
    private String activeKeyName;

    /**
     * whether keyvault should manage the storage account for the user.
     */
    @JsonProperty(value = "autoRegenerateKey", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean autoRegenerateKey;

    /**
     * The key regeneration time duration specified in ISO-8601 format.
     */
    @JsonProperty(value = "regenerationPeriod", access = JsonProperty.Access.WRITE_ONLY)
    private String regenerationPeriod;

    /**
     * The storage account attributes.
     */
    @JsonProperty(value = "attributes", access = JsonProperty.Access.WRITE_ONLY)
    private StorageAccountAttributes attributes;

    /**
     * Application specific metadata in the form of key-value pairs.
     */
    @JsonProperty(value = "tags", access = JsonProperty.Access.WRITE_ONLY)
    private Map<String, String> tags;

    /**
     * Get the id value.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the resourceId value.
     *
     * @return the resourceId value.
     */
    public String resourceId() {
        return this.resourceId;
    }

    /**
     * Get the activeKeyName value.
     *
     * @return the activeKeyName value.
     */
    public String activeKeyName() {
        return this.activeKeyName;
    }

    /**
     * Get the autoRegenerateKey value.
     *
     * @return the autoRegenerateKey value.
     */
    public Boolean autoRegenerateKey() {
        return this.autoRegenerateKey;
    }

    /**
     * Get the regenerationPeriod value.
     *
     * @return the regenerationPeriod value.
     */
    public String regenerationPeriod() {
        return this.regenerationPeriod;
    }

    /**
     * Get the attributes value.
     *
     * @return the attributes value.
     */
    public StorageAccountAttributes attributes() {
        return this.attributes;
    }

    /**
     * Get the tags value.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }
}
