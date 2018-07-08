/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * jkl
 */

package com.microsoft.azure.management.managementgroups.v2018_01_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.managementgroups.v2018_01_01_preview.ManagementGroups;
import rx.Completable;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.managementgroups.v2018_01_01_preview.ManagementGroup;
import com.microsoft.azure.management.managementgroups.v2018_01_01_preview.OperationResults;
import com.microsoft.azure.management.managementgroups.v2018_01_01_preview.ManagementGroupInfo;
import com.microsoft.azure.management.managementgroups.v2018_01_01_preview.CreateManagementGroupRequest;

class ManagementGroupsImpl extends WrapperImpl<ManagementGroupsInner> implements ManagementGroups {
    private final ManagementManager manager;

    ManagementGroupsImpl(ManagementManager manager) {
        super(manager.inner().managementGroups());
        this.manager = manager;
    }

    public ManagementManager manager() {
        return this.manager;
    }

    private ManagementGroupImpl wrapModel(ManagementGroupInner inner) {
        return  new ManagementGroupImpl(inner, manager());
    }

    @Override
    public Observable<ManagementGroup> getAsync(String groupId) {
        ManagementGroupsInner client = this.inner();
        return client.getAsync(groupId)
        .map(new Func1<ManagementGroupInner, ManagementGroup>() {
            @Override
            public ManagementGroup call(ManagementGroupInner inner) {
                return new ManagementGroupImpl(inner, manager());
            }
        });
    }

    @Override
    public Completable createOrUpdateAsync(String groupId, CreateManagementGroupRequest createManagementGroupRequest) {
        ManagementGroupsInner client = this.inner();
        return client.createOrUpdateAsync(groupId, createManagementGroupRequest).toCompletable();
    }

    @Override
    public Observable<OperationResults> deleteAsync(String groupId) {
        ManagementGroupsInner client = this.inner();
        return client.deleteAsync(groupId)
        .map(new Func1<OperationResultsInner, OperationResults>() {
            @Override
            public OperationResults call(OperationResultsInner inner) {
                return new OperationResultsImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<ManagementGroupInfo> listAsync() {
        ManagementGroupsInner client = this.inner();
        return client.listAsync()
        .flatMapIterable(new Func1<Page<ManagementGroupInfoInner>, Iterable<ManagementGroupInfoInner>>() {
            @Override
            public Iterable<ManagementGroupInfoInner> call(Page<ManagementGroupInfoInner> page) {
                return page.items();
            }
        })
        .map(new Func1<ManagementGroupInfoInner, ManagementGroupInfo>() {
            @Override
            public ManagementGroupInfo call(ManagementGroupInfoInner inner) {
                return new ManagementGroupInfoImpl(inner, manager());
            }
        });
    }

}