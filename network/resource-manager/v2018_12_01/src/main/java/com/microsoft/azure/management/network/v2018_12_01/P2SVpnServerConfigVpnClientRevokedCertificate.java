/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_12_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.SubResource;

/**
 * VPN client revoked certificate of P2SVpnServerConfiguration.
 */
@JsonFlatten
public class P2SVpnServerConfigVpnClientRevokedCertificate extends SubResource {
    /**
     * The revoked VPN client certificate thumbprint.
     */
    @JsonProperty(value = "properties.thumbprint")
    private String thumbprint;

    /**
     * The provisioning state of the VPN client revoked certificate resource.
     * Possible values are: 'Updating', 'Deleting', and 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /**
     * The name of the resource that is unique within a resource group. This
     * name can be used to access the resource.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag")
    private String etag;

    /**
     * Get the revoked VPN client certificate thumbprint.
     *
     * @return the thumbprint value
     */
    public String thumbprint() {
        return this.thumbprint;
    }

    /**
     * Set the revoked VPN client certificate thumbprint.
     *
     * @param thumbprint the thumbprint value to set
     * @return the P2SVpnServerConfigVpnClientRevokedCertificate object itself.
     */
    public P2SVpnServerConfigVpnClientRevokedCertificate withThumbprint(String thumbprint) {
        this.thumbprint = thumbprint;
        return this;
    }

    /**
     * Get the provisioning state of the VPN client revoked certificate resource. Possible values are: 'Updating', 'Deleting', and 'Failed'.
     *
     * @return the provisioningState value
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the name of the resource that is unique within a resource group. This name can be used to access the resource.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name of the resource that is unique within a resource group. This name can be used to access the resource.
     *
     * @param name the name value to set
     * @return the P2SVpnServerConfigVpnClientRevokedCertificate object itself.
     */
    public P2SVpnServerConfigVpnClientRevokedCertificate withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get a unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set a unique read-only string that changes whenever the resource is updated.
     *
     * @param etag the etag value to set
     * @return the P2SVpnServerConfigVpnClientRevokedCertificate object itself.
     */
    public P2SVpnServerConfigVpnClientRevokedCertificate withEtag(String etag) {
        this.etag = etag;
        return this;
    }

}
