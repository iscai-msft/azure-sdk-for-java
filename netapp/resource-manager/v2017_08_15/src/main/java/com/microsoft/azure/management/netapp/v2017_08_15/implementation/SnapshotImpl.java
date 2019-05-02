/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.netapp.v2017_08_15.implementation;

import com.microsoft.azure.management.netapp.v2017_08_15.Snapshot;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import org.joda.time.DateTime;
import java.util.Map;

class SnapshotImpl extends CreatableUpdatableImpl<Snapshot, SnapshotInner, SnapshotImpl> implements Snapshot, Snapshot.Definition, Snapshot.Update {
    private final NetAppManager manager;
    private String resourceGroupName;
    private String accountName;
    private String poolName;
    private String volumeName;
    private String snapshotName;

    SnapshotImpl(String name, NetAppManager manager) {
        super(name, new SnapshotInner());
        this.manager = manager;
        // Set resource name
        this.snapshotName = name;
        //
    }

    SnapshotImpl(SnapshotInner inner, NetAppManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.snapshotName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.accountName = IdParsingUtils.getValueFromIdByName(inner.id(), "netAppAccounts");
        this.poolName = IdParsingUtils.getValueFromIdByName(inner.id(), "capacityPools");
        this.volumeName = IdParsingUtils.getValueFromIdByName(inner.id(), "volumes");
        this.snapshotName = IdParsingUtils.getValueFromIdByName(inner.id(), "snapshots");
        //
    }

    @Override
    public NetAppManager manager() {
        return this.manager;
    }

    @Override
    public Observable<Snapshot> createResourceAsync() {
        SnapshotsInner client = this.manager().inner().snapshots();
        return client.createAsync(this.resourceGroupName, this.accountName, this.poolName, this.volumeName, this.snapshotName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<Snapshot> updateResourceAsync() {
        SnapshotsInner client = this.manager().inner().snapshots();
        return client.createAsync(this.resourceGroupName, this.accountName, this.poolName, this.volumeName, this.snapshotName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<SnapshotInner> getInnerAsync() {
        SnapshotsInner client = this.manager().inner().snapshots();
        return client.getAsync(this.resourceGroupName, this.accountName, this.poolName, this.volumeName, this.snapshotName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public DateTime creationDate() {
        return this.inner().creationDate();
    }

    @Override
    public String fileSystemId() {
        return this.inner().fileSystemId();
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
    public String name() {
        return this.inner().name();
    }

    @Override
    public String provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public String snapshotId() {
        return this.inner().snapshotId();
    }

    @Override
    public Map<String, String> tags() {
        return this.inner().getTags();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public SnapshotImpl withExistingVolume(String resourceGroupName, String accountName, String poolName, String volumeName) {
        this.resourceGroupName = resourceGroupName;
        this.accountName = accountName;
        this.poolName = poolName;
        this.volumeName = volumeName;
        return this;
    }

    @Override
    public SnapshotImpl withFileSystemId(String fileSystemId) {
        this.inner().withFileSystemId(fileSystemId);
        return this;
    }

    @Override
    public SnapshotImpl withLocation(String location) {
        this.inner().withLocation(location);
        return this;
    }

    @Override
    public SnapshotImpl withTags(Map<String, String> tags) {
        this.inner().withTags(tags);
        return this;
    }

}
