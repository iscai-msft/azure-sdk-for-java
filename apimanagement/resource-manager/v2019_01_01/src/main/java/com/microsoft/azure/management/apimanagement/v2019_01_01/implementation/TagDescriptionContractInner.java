/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2019_01_01.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * Contract details.
 */
@JsonFlatten
public class TagDescriptionContractInner extends ProxyResource {
    /**
     * Description of the Tag.
     */
    @JsonProperty(value = "properties.description")
    private String description;

    /**
     * Absolute URL of external resources describing the tag.
     */
    @JsonProperty(value = "properties.externalDocsUrl")
    private String externalDocsUrl;

    /**
     * Description of the external resources describing the tag.
     */
    @JsonProperty(value = "properties.externalDocsDescription")
    private String externalDocsDescription;

    /**
     * Tag name.
     */
    @JsonProperty(value = "properties.displayName")
    private String displayName;

    /**
     * Get description of the Tag.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set description of the Tag.
     *
     * @param description the description value to set
     * @return the TagDescriptionContractInner object itself.
     */
    public TagDescriptionContractInner withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get absolute URL of external resources describing the tag.
     *
     * @return the externalDocsUrl value
     */
    public String externalDocsUrl() {
        return this.externalDocsUrl;
    }

    /**
     * Set absolute URL of external resources describing the tag.
     *
     * @param externalDocsUrl the externalDocsUrl value to set
     * @return the TagDescriptionContractInner object itself.
     */
    public TagDescriptionContractInner withExternalDocsUrl(String externalDocsUrl) {
        this.externalDocsUrl = externalDocsUrl;
        return this;
    }

    /**
     * Get description of the external resources describing the tag.
     *
     * @return the externalDocsDescription value
     */
    public String externalDocsDescription() {
        return this.externalDocsDescription;
    }

    /**
     * Set description of the external resources describing the tag.
     *
     * @param externalDocsDescription the externalDocsDescription value to set
     * @return the TagDescriptionContractInner object itself.
     */
    public TagDescriptionContractInner withExternalDocsDescription(String externalDocsDescription) {
        this.externalDocsDescription = externalDocsDescription;
        return this;
    }

    /**
     * Get tag name.
     *
     * @return the displayName value
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set tag name.
     *
     * @param displayName the displayName value to set
     * @return the TagDescriptionContractInner object itself.
     */
    public TagDescriptionContractInner withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

}
