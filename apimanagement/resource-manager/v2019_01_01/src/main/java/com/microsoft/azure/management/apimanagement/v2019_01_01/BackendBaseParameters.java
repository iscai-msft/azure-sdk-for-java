/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2019_01_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Backend entity base Parameter set.
 */
public class BackendBaseParameters {
    /**
     * Backend Title.
     */
    @JsonProperty(value = "title")
    private String title;

    /**
     * Backend Description.
     */
    @JsonProperty(value = "description")
    private String description;

    /**
     * Management Uri of the Resource in External System. This url can be the
     * Arm Resource Id of Logic Apps, Function Apps or Api Apps.
     */
    @JsonProperty(value = "resourceId")
    private String resourceId;

    /**
     * Backend Properties contract.
     */
    @JsonProperty(value = "properties")
    private BackendProperties properties;

    /**
     * Backend Credentials Contract Properties.
     */
    @JsonProperty(value = "credentials")
    private BackendCredentialsContract credentials;

    /**
     * Backend Proxy Contract Properties.
     */
    @JsonProperty(value = "proxy")
    private BackendProxyContract proxy;

    /**
     * Backend TLS Properties.
     */
    @JsonProperty(value = "tls")
    private BackendTlsProperties tls;

    /**
     * Get backend Title.
     *
     * @return the title value
     */
    public String title() {
        return this.title;
    }

    /**
     * Set backend Title.
     *
     * @param title the title value to set
     * @return the BackendBaseParameters object itself.
     */
    public BackendBaseParameters withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Get backend Description.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set backend Description.
     *
     * @param description the description value to set
     * @return the BackendBaseParameters object itself.
     */
    public BackendBaseParameters withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get management Uri of the Resource in External System. This url can be the Arm Resource Id of Logic Apps, Function Apps or Api Apps.
     *
     * @return the resourceId value
     */
    public String resourceId() {
        return this.resourceId;
    }

    /**
     * Set management Uri of the Resource in External System. This url can be the Arm Resource Id of Logic Apps, Function Apps or Api Apps.
     *
     * @param resourceId the resourceId value to set
     * @return the BackendBaseParameters object itself.
     */
    public BackendBaseParameters withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * Get backend Properties contract.
     *
     * @return the properties value
     */
    public BackendProperties properties() {
        return this.properties;
    }

    /**
     * Set backend Properties contract.
     *
     * @param properties the properties value to set
     * @return the BackendBaseParameters object itself.
     */
    public BackendBaseParameters withProperties(BackendProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get backend Credentials Contract Properties.
     *
     * @return the credentials value
     */
    public BackendCredentialsContract credentials() {
        return this.credentials;
    }

    /**
     * Set backend Credentials Contract Properties.
     *
     * @param credentials the credentials value to set
     * @return the BackendBaseParameters object itself.
     */
    public BackendBaseParameters withCredentials(BackendCredentialsContract credentials) {
        this.credentials = credentials;
        return this;
    }

    /**
     * Get backend Proxy Contract Properties.
     *
     * @return the proxy value
     */
    public BackendProxyContract proxy() {
        return this.proxy;
    }

    /**
     * Set backend Proxy Contract Properties.
     *
     * @param proxy the proxy value to set
     * @return the BackendBaseParameters object itself.
     */
    public BackendBaseParameters withProxy(BackendProxyContract proxy) {
        this.proxy = proxy;
        return this;
    }

    /**
     * Get backend TLS Properties.
     *
     * @return the tls value
     */
    public BackendTlsProperties tls() {
        return this.tls;
    }

    /**
     * Set backend TLS Properties.
     *
     * @param tls the tls value to set
     * @return the BackendBaseParameters object itself.
     */
    public BackendBaseParameters withTls(BackendTlsProperties tls) {
        this.tls = tls;
        return this;
    }

}
