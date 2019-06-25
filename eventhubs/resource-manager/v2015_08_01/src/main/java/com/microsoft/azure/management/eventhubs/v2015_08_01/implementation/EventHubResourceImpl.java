/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.eventhubs.v2015_08_01.implementation;

import com.microsoft.azure.management.eventhubs.v2015_08_01.EventHubResource;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.eventhubs.v2015_08_01.EventHubCreateOrUpdateParameters;
import org.joda.time.DateTime;
import java.util.List;
import com.microsoft.azure.management.eventhubs.v2015_08_01.EntityStatus;
import rx.functions.Func1;

class EventHubResourceImpl extends CreatableUpdatableImpl<EventHubResource, EventHubResourceInner, EventHubResourceImpl> implements EventHubResource, EventHubResource.Definition, EventHubResource.Update {
    private final EventHubsManager manager;
    private String resourceGroupName;
    private String namespaceName;
    private String eventHubName;
    private EventHubCreateOrUpdateParameters createOrUpdateParameter;

    EventHubResourceImpl(String name, EventHubsManager manager) {
        super(name, new EventHubResourceInner());
        this.manager = manager;
        // Set resource name
        this.eventHubName = name;
        //
        this.createOrUpdateParameter = new EventHubCreateOrUpdateParameters();
    }

    EventHubResourceImpl(EventHubResourceInner inner, EventHubsManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.eventHubName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.namespaceName = IdParsingUtils.getValueFromIdByName(inner.id(), "namespaces");
        this.eventHubName = IdParsingUtils.getValueFromIdByName(inner.id(), "eventhubs");
        //
        this.createOrUpdateParameter = new EventHubCreateOrUpdateParameters();
    }

    @Override
    public EventHubsManager manager() {
        return this.manager;
    }

    @Override
    public Observable<EventHubResource> createResourceAsync() {
        EventHubsInner client = this.manager().inner().eventHubs();
        return client.createOrUpdateAsync(this.resourceGroupName, this.namespaceName, this.eventHubName, this.createOrUpdateParameter)
            .map(new Func1<EventHubResourceInner, EventHubResourceInner>() {
               @Override
               public EventHubResourceInner call(EventHubResourceInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<EventHubResource> updateResourceAsync() {
        EventHubsInner client = this.manager().inner().eventHubs();
        return client.createOrUpdateAsync(this.resourceGroupName, this.namespaceName, this.eventHubName, this.createOrUpdateParameter)
            .map(new Func1<EventHubResourceInner, EventHubResourceInner>() {
               @Override
               public EventHubResourceInner call(EventHubResourceInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<EventHubResourceInner> getInnerAsync() {
        EventHubsInner client = this.manager().inner().eventHubs();
        return client.getAsync(this.resourceGroupName, this.namespaceName, this.eventHubName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.createOrUpdateParameter = new EventHubCreateOrUpdateParameters();
    }

    @Override
    public DateTime createdAt() {
        return this.inner().createdAt();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String location() {
        return this.inner().location();
    }

    @Override
    public Long messageRetentionInDays() {
        return this.inner().messageRetentionInDays();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public Long partitionCount() {
        return this.inner().partitionCount();
    }

    @Override
    public List<String> partitionIds() {
        return this.inner().partitionIds();
    }

    @Override
    public EntityStatus status() {
        return this.inner().status();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public DateTime updatedAt() {
        return this.inner().updatedAt();
    }

    @Override
    public EventHubResourceImpl withExistingNamespace(String resourceGroupName, String namespaceName) {
        this.resourceGroupName = resourceGroupName;
        this.namespaceName = namespaceName;
        return this;
    }

    @Override
    public EventHubResourceImpl withLocation(String location) {
        this.createOrUpdateParameter.withLocation(location);
        return this;
    }

    @Override
    public EventHubResourceImpl withMessageRetentionInDays(Long messageRetentionInDays) {
        this.createOrUpdateParameter.withMessageRetentionInDays(messageRetentionInDays);
        return this;
    }

    @Override
    public EventHubResourceImpl withName(String name) {
        this.createOrUpdateParameter.withName(name);
        return this;
    }

    @Override
    public EventHubResourceImpl withPartitionCount(Long partitionCount) {
        this.createOrUpdateParameter.withPartitionCount(partitionCount);
        return this;
    }

    @Override
    public EventHubResourceImpl withStatus(EntityStatus status) {
        this.createOrUpdateParameter.withStatus(status);
        return this;
    }

    @Override
    public EventHubResourceImpl withType(String type) {
        this.createOrUpdateParameter.withType(type);
        return this;
    }

}
