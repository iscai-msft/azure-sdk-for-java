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
 * The secret set parameters.
 */
public final class SecretSetParameters {
    /**
     * The value of the secret.
     */
    @JsonProperty(value = "value", required = true)
    private String value;

    /**
     * Application specific metadata in the form of key-value pairs.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /**
     * Type of the secret value such as a password.
     */
    @JsonProperty(value = "contentType")
    private String contentType;

    /**
     * The secret management attributes.
     */
    @JsonProperty(value = "attributes")
    private SecretAttributes secretAttributes;

    /**
     * Get the value value.
     *
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value value.
     *
     * @param value the value value to set.
     * @return the SecretSetParameters object itself.
     */
    public SecretSetParameters withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Get the tags value.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags value.
     *
     * @param tags the tags value to set.
     * @return the SecretSetParameters object itself.
     */
    public SecretSetParameters withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the contentType value.
     *
     * @return the contentType value.
     */
    public String contentType() {
        return this.contentType;
    }

    /**
     * Set the contentType value.
     *
     * @param contentType the contentType value to set.
     * @return the SecretSetParameters object itself.
     */
    public SecretSetParameters withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    /**
     * Get the secretAttributes value.
     *
     * @return the secretAttributes value.
     */
    public SecretAttributes secretAttributes() {
        return this.secretAttributes;
    }

    /**
     * Set the secretAttributes value.
     *
     * @param secretAttributes the secretAttributes value to set.
     * @return the SecretSetParameters object itself.
     */
    public SecretSetParameters withSecretAttributes(SecretAttributes secretAttributes) {
        this.secretAttributes = secretAttributes;
        return this;
    }
}
