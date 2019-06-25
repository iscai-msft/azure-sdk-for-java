/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * def
 */

package com.microsoft.azure.management.batchai.v2018_03_01.implementation;

import com.microsoft.azure.arm.resources.collection.implementation.GroupableResourcesCoreImpl;
import com.microsoft.azure.management.batchai.v2018_03_01.Clusters;
import com.microsoft.azure.management.batchai.v2018_03_01.Cluster;
import rx.Observable;
import rx.Completable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import com.microsoft.azure.arm.resources.ResourceUtilsCore;
import com.microsoft.azure.arm.utils.RXMapper;
import rx.functions.Func1;
import com.microsoft.azure.PagedList;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.batchai.v2018_03_01.RemoteLoginInformation;

class ClustersImpl extends GroupableResourcesCoreImpl<Cluster, ClusterImpl, ClusterInner, ClustersInner, BatchAIManager>  implements Clusters {
    protected ClustersImpl(BatchAIManager manager) {
        super(manager.inner().clusters(), manager);
    }

    @Override
    protected Observable<ClusterInner> getInnerAsync(String resourceGroupName, String name) {
        ClustersInner client = this.inner();
        return client.getByResourceGroupAsync(resourceGroupName, name);
    }

    @Override
    protected Completable deleteInnerAsync(String resourceGroupName, String name) {
        ClustersInner client = this.inner();
        return client.deleteAsync(resourceGroupName, name).toCompletable();
    }

    @Override
    public Observable<String> deleteByIdsAsync(Collection<String> ids) {
        if (ids == null || ids.isEmpty()) {
            return Observable.empty();
        }
        Collection<Observable<String>> observables = new ArrayList<>();
        for (String id : ids) {
            final String resourceGroupName = ResourceUtilsCore.groupFromResourceId(id);
            final String name = ResourceUtilsCore.nameFromResourceId(id);
            Observable<String> o = RXMapper.map(this.inner().deleteAsync(resourceGroupName, name), id);
            observables.add(o);
        }
        return Observable.mergeDelayError(observables);
    }

    @Override
    public Observable<String> deleteByIdsAsync(String...ids) {
        return this.deleteByIdsAsync(new ArrayList<String>(Arrays.asList(ids)));
    }

    @Override
    public void deleteByIds(Collection<String> ids) {
        if (ids != null && !ids.isEmpty()) {
            this.deleteByIdsAsync(ids).toBlocking().last();
        }
    }

    @Override
    public void deleteByIds(String...ids) {
        this.deleteByIds(new ArrayList<String>(Arrays.asList(ids)));
    }

    @Override
    public PagedList<Cluster> listByResourceGroup(String resourceGroupName) {
        ClustersInner client = this.inner();
        return this.wrapList(client.listByResourceGroup(resourceGroupName));
    }

    @Override
    public Observable<Cluster> listByResourceGroupAsync(String resourceGroupName) {
        ClustersInner client = this.inner();
        return client.listByResourceGroupAsync(resourceGroupName)
        .flatMapIterable(new Func1<Page<ClusterInner>, Iterable<ClusterInner>>() {
            @Override
            public Iterable<ClusterInner> call(Page<ClusterInner> page) {
                return page.items();
            }
        })
        .map(new Func1<ClusterInner, Cluster>() {
            @Override
            public Cluster call(ClusterInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public PagedList<Cluster> list() {
        ClustersInner client = this.inner();
        return this.wrapList(client.list());
    }

    @Override
    public Observable<Cluster> listAsync() {
        ClustersInner client = this.inner();
        return client.listAsync()
        .flatMapIterable(new Func1<Page<ClusterInner>, Iterable<ClusterInner>>() {
            @Override
            public Iterable<ClusterInner> call(Page<ClusterInner> page) {
                return page.items();
            }
        })
        .map(new Func1<ClusterInner, Cluster>() {
            @Override
            public Cluster call(ClusterInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public ClusterImpl define(String name) {
        return wrapModel(name);
    }

    @Override
    public Observable<RemoteLoginInformation> listRemoteLoginInformationAsync(final String resourceGroupName, final String clusterName) {
        ClustersInner client = this.inner();
        return client.listRemoteLoginInformationAsync(resourceGroupName, clusterName)
        .flatMapIterable(new Func1<Page<RemoteLoginInformationInner>, Iterable<RemoteLoginInformationInner>>() {
            @Override
            public Iterable<RemoteLoginInformationInner> call(Page<RemoteLoginInformationInner> page) {
                return page.items();
            }
        })
        .map(new Func1<RemoteLoginInformationInner, RemoteLoginInformation>() {
            @Override
            public RemoteLoginInformation call(RemoteLoginInformationInner inner) {
                return new RemoteLoginInformationImpl(inner, manager());
            }
        });
    }

    @Override
    protected ClusterImpl wrapModel(ClusterInner inner) {
        return  new ClusterImpl(inner.name(), inner, manager());
    }

    @Override
    protected ClusterImpl wrapModel(String name) {
        return new ClusterImpl(name, new ClusterInner(), this.manager());
    }

}
