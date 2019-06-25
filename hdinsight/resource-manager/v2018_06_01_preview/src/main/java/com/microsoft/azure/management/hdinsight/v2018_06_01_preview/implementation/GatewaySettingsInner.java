/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.hdinsight.v2018_06_01_preview.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Gateway settings.
 */
public class GatewaySettingsInner {
    /**
     * Indicates whether or not the gateway settings based authorization is
     * enabled.
     */
    @JsonProperty(value = "restAuthCredential\\.isEnabled", access = JsonProperty.Access.WRITE_ONLY)
    private String isCredentialEnabled;

    /**
     * The gateway settings user name.
     */
    @JsonProperty(value = "restAuthCredential\\.username", access = JsonProperty.Access.WRITE_ONLY)
    private String userName;

    /**
     * The gateway settings user password.
     */
    @JsonProperty(value = "restAuthCredential\\.password", access = JsonProperty.Access.WRITE_ONLY)
    private String password;

    /**
     * Get indicates whether or not the gateway settings based authorization is enabled.
     *
     * @return the isCredentialEnabled value
     */
    public String isCredentialEnabled() {
        return this.isCredentialEnabled;
    }

    /**
     * Get the gateway settings user name.
     *
     * @return the userName value
     */
    public String userName() {
        return this.userName;
    }

    /**
     * Get the gateway settings user password.
     *
     * @return the password value
     */
    public String password() {
        return this.password;
    }

}
