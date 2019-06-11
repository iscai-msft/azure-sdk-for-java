/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_04_01.implementation;

import com.microsoft.azure.management.network.v2019_04_01.P2SVpnServerConfiguration;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import java.util.List;
import com.microsoft.azure.management.network.v2019_04_01.VpnGatewayTunnelingProtocol;
import com.microsoft.azure.management.network.v2019_04_01.P2SVpnServerConfigVpnClientRootCertificate;
import com.microsoft.azure.management.network.v2019_04_01.P2SVpnServerConfigVpnClientRevokedCertificate;
import com.microsoft.azure.management.network.v2019_04_01.P2SVpnServerConfigRadiusServerRootCertificate;
import com.microsoft.azure.management.network.v2019_04_01.P2SVpnServerConfigRadiusClientRootCertificate;
import com.microsoft.azure.management.network.v2019_04_01.IpsecPolicy;
import com.microsoft.azure.SubResource;

class P2SVpnServerConfigurationImpl extends CreatableUpdatableImpl<P2SVpnServerConfiguration, P2SVpnServerConfigurationInner, P2SVpnServerConfigurationImpl> implements P2SVpnServerConfiguration, P2SVpnServerConfiguration.Definition, P2SVpnServerConfiguration.Update {
    private final NetworkManager manager;
    private String resourceGroupName;
    private String virtualWanName;
    private String p2SVpnServerConfigurationName;

    P2SVpnServerConfigurationImpl(String name, NetworkManager manager) {
        super(name, new P2SVpnServerConfigurationInner());
        this.manager = manager;
        // Set resource name
        this.p2SVpnServerConfigurationName = name;
        //
    }

    P2SVpnServerConfigurationImpl(P2SVpnServerConfigurationInner inner, NetworkManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.p2SVpnServerConfigurationName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.virtualWanName = IdParsingUtils.getValueFromIdByName(inner.id(), "virtualWans");
        this.p2SVpnServerConfigurationName = IdParsingUtils.getValueFromIdByName(inner.id(), "p2sVpnServerConfigurations");
        //
    }

    @Override
    public NetworkManager manager() {
        return this.manager;
    }

    @Override
    public Observable<P2SVpnServerConfiguration> createResourceAsync() {
        P2sVpnServerConfigurationsInner client = this.manager().inner().p2sVpnServerConfigurations();
        return client.createOrUpdateAsync(this.resourceGroupName, this.virtualWanName, this.p2SVpnServerConfigurationName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<P2SVpnServerConfiguration> updateResourceAsync() {
        P2sVpnServerConfigurationsInner client = this.manager().inner().p2sVpnServerConfigurations();
        return client.createOrUpdateAsync(this.resourceGroupName, this.virtualWanName, this.p2SVpnServerConfigurationName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<P2SVpnServerConfigurationInner> getInnerAsync() {
        P2sVpnServerConfigurationsInner client = this.manager().inner().p2sVpnServerConfigurations();
        return client.getAsync(this.resourceGroupName, this.virtualWanName, this.p2SVpnServerConfigurationName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public String etag() {
        return this.inner().etag();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public List<SubResource> p2SVpnGateways() {
        return this.inner().p2SVpnGateways();
    }

    @Override
    public List<P2SVpnServerConfigRadiusClientRootCertificate> p2SVpnServerConfigRadiusClientRootCertificates() {
        return this.inner().p2SVpnServerConfigRadiusClientRootCertificates();
    }

    @Override
    public List<P2SVpnServerConfigRadiusServerRootCertificate> p2SVpnServerConfigRadiusServerRootCertificates() {
        return this.inner().p2SVpnServerConfigRadiusServerRootCertificates();
    }

    @Override
    public String p2SVpnServerConfigurationPropertiesEtag() {
        return this.inner().p2SVpnServerConfigurationPropertiesEtag();
    }

    @Override
    public String p2SVpnServerConfigurationPropertiesName() {
        return this.inner().p2SVpnServerConfigurationPropertiesName();
    }

    @Override
    public List<P2SVpnServerConfigVpnClientRevokedCertificate> p2SVpnServerConfigVpnClientRevokedCertificates() {
        return this.inner().p2SVpnServerConfigVpnClientRevokedCertificates();
    }

    @Override
    public List<P2SVpnServerConfigVpnClientRootCertificate> p2SVpnServerConfigVpnClientRootCertificates() {
        return this.inner().p2SVpnServerConfigVpnClientRootCertificates();
    }

    @Override
    public String provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public String radiusServerAddress() {
        return this.inner().radiusServerAddress();
    }

    @Override
    public String radiusServerSecret() {
        return this.inner().radiusServerSecret();
    }

    @Override
    public List<IpsecPolicy> vpnClientIpsecPolicies() {
        return this.inner().vpnClientIpsecPolicies();
    }

    @Override
    public List<VpnGatewayTunnelingProtocol> vpnProtocols() {
        return this.inner().vpnProtocols();
    }

    @Override
    public P2SVpnServerConfigurationImpl withExistingVirtualWan(String resourceGroupName, String virtualWanName) {
        this.resourceGroupName = resourceGroupName;
        this.virtualWanName = virtualWanName;
        return this;
    }

    @Override
    public P2SVpnServerConfigurationImpl withId(String id) {
        this.inner().withId(id);
        return this;
    }

    @Override
    public P2SVpnServerConfigurationImpl withName(String name) {
        this.inner().withName(name);
        return this;
    }

    @Override
    public P2SVpnServerConfigurationImpl withP2SVpnServerConfigRadiusClientRootCertificates(List<P2SVpnServerConfigRadiusClientRootCertificate> p2SVpnServerConfigRadiusClientRootCertificates) {
        this.inner().withP2SVpnServerConfigRadiusClientRootCertificates(p2SVpnServerConfigRadiusClientRootCertificates);
        return this;
    }

    @Override
    public P2SVpnServerConfigurationImpl withP2SVpnServerConfigRadiusServerRootCertificates(List<P2SVpnServerConfigRadiusServerRootCertificate> p2SVpnServerConfigRadiusServerRootCertificates) {
        this.inner().withP2SVpnServerConfigRadiusServerRootCertificates(p2SVpnServerConfigRadiusServerRootCertificates);
        return this;
    }

    @Override
    public P2SVpnServerConfigurationImpl withP2SVpnServerConfigurationPropertiesEtag(String p2SVpnServerConfigurationPropertiesEtag) {
        this.inner().withP2SVpnServerConfigurationPropertiesEtag(p2SVpnServerConfigurationPropertiesEtag);
        return this;
    }

    @Override
    public P2SVpnServerConfigurationImpl withP2SVpnServerConfigurationPropertiesName(String p2SVpnServerConfigurationPropertiesName) {
        this.inner().withP2SVpnServerConfigurationPropertiesName(p2SVpnServerConfigurationPropertiesName);
        return this;
    }

    @Override
    public P2SVpnServerConfigurationImpl withP2SVpnServerConfigVpnClientRevokedCertificates(List<P2SVpnServerConfigVpnClientRevokedCertificate> p2SVpnServerConfigVpnClientRevokedCertificates) {
        this.inner().withP2SVpnServerConfigVpnClientRevokedCertificates(p2SVpnServerConfigVpnClientRevokedCertificates);
        return this;
    }

    @Override
    public P2SVpnServerConfigurationImpl withP2SVpnServerConfigVpnClientRootCertificates(List<P2SVpnServerConfigVpnClientRootCertificate> p2SVpnServerConfigVpnClientRootCertificates) {
        this.inner().withP2SVpnServerConfigVpnClientRootCertificates(p2SVpnServerConfigVpnClientRootCertificates);
        return this;
    }

    @Override
    public P2SVpnServerConfigurationImpl withRadiusServerAddress(String radiusServerAddress) {
        this.inner().withRadiusServerAddress(radiusServerAddress);
        return this;
    }

    @Override
    public P2SVpnServerConfigurationImpl withRadiusServerSecret(String radiusServerSecret) {
        this.inner().withRadiusServerSecret(radiusServerSecret);
        return this;
    }

    @Override
    public P2SVpnServerConfigurationImpl withVpnClientIpsecPolicies(List<IpsecPolicy> vpnClientIpsecPolicies) {
        this.inner().withVpnClientIpsecPolicies(vpnClientIpsecPolicies);
        return this;
    }

    @Override
    public P2SVpnServerConfigurationImpl withVpnProtocols(List<VpnGatewayTunnelingProtocol> vpnProtocols) {
        this.inner().withVpnProtocols(vpnProtocols);
        return this;
    }

}
