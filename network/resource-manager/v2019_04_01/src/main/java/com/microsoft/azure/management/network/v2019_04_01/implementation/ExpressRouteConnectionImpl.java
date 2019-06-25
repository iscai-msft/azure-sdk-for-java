/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_04_01.implementation;

import com.microsoft.azure.management.network.v2019_04_01.ExpressRouteConnection;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.network.v2019_04_01.ProvisioningState;
import com.microsoft.azure.management.network.v2019_04_01.ExpressRouteCircuitPeeringId;

class ExpressRouteConnectionImpl extends CreatableUpdatableImpl<ExpressRouteConnection, ExpressRouteConnectionInner, ExpressRouteConnectionImpl> implements ExpressRouteConnection, ExpressRouteConnection.Definition, ExpressRouteConnection.Update {
    private final NetworkManager manager;
    private String resourceGroupName;
    private String expressRouteGatewayName;
    private String connectionName;

    ExpressRouteConnectionImpl(String name, NetworkManager manager) {
        super(name, new ExpressRouteConnectionInner());
        this.manager = manager;
        // Set resource name
        this.connectionName = name;
        //
    }

    ExpressRouteConnectionImpl(ExpressRouteConnectionInner inner, NetworkManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.connectionName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.expressRouteGatewayName = IdParsingUtils.getValueFromIdByName(inner.id(), "expressRouteGateways");
        this.connectionName = IdParsingUtils.getValueFromIdByName(inner.id(), "expressRouteConnections");
        //
    }

    @Override
    public NetworkManager manager() {
        return this.manager;
    }

    @Override
    public Observable<ExpressRouteConnection> createResourceAsync() {
        ExpressRouteConnectionsInner client = this.manager().inner().expressRouteConnections();
        return client.createOrUpdateAsync(this.resourceGroupName, this.expressRouteGatewayName, this.connectionName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<ExpressRouteConnection> updateResourceAsync() {
        ExpressRouteConnectionsInner client = this.manager().inner().expressRouteConnections();
        return client.createOrUpdateAsync(this.resourceGroupName, this.expressRouteGatewayName, this.connectionName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<ExpressRouteConnectionInner> getInnerAsync() {
        ExpressRouteConnectionsInner client = this.manager().inner().expressRouteConnections();
        return client.getAsync(this.resourceGroupName, this.expressRouteGatewayName, this.connectionName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public String authorizationKey() {
        return this.inner().authorizationKey();
    }

    @Override
    public ExpressRouteCircuitPeeringId expressRouteCircuitPeering() {
        return this.inner().expressRouteCircuitPeering();
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
    public ProvisioningState provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public Integer routingWeight() {
        return this.inner().routingWeight();
    }

    @Override
    public ExpressRouteConnectionImpl withExistingExpressRouteGateway(String resourceGroupName, String expressRouteGatewayName) {
        this.resourceGroupName = resourceGroupName;
        this.expressRouteGatewayName = expressRouteGatewayName;
        return this;
    }

    @Override
    public ExpressRouteConnectionImpl withExpressRouteCircuitPeering(ExpressRouteCircuitPeeringId expressRouteCircuitPeering) {
        this.inner().withExpressRouteCircuitPeering(expressRouteCircuitPeering);
        return this;
    }

    @Override
    public ExpressRouteConnectionImpl withName(String name) {
        this.inner().withName(name);
        return this;
    }

    @Override
    public ExpressRouteConnectionImpl withAuthorizationKey(String authorizationKey) {
        this.inner().withAuthorizationKey(authorizationKey);
        return this;
    }

    @Override
    public ExpressRouteConnectionImpl withId(String id) {
        this.inner().withId(id);
        return this;
    }

    @Override
    public ExpressRouteConnectionImpl withProvisioningState(ProvisioningState provisioningState) {
        this.inner().withProvisioningState(provisioningState);
        return this;
    }

    @Override
    public ExpressRouteConnectionImpl withRoutingWeight(Integer routingWeight) {
        this.inner().withRoutingWeight(routingWeight);
        return this;
    }

}
