/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * def
 */

package com.microsoft.azure.management.network.v2018_12_01.implementation;

import com.microsoft.azure.arm.resources.collection.implementation.GroupableResourcesCoreImpl;
import com.microsoft.azure.management.network.v2018_12_01.WebApplicationFirewallPolicies;
import com.microsoft.azure.management.network.v2018_12_01.WebApplicationFirewallPolicy;
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

class WebApplicationFirewallPoliciesImpl extends GroupableResourcesCoreImpl<WebApplicationFirewallPolicy, WebApplicationFirewallPolicyImpl, WebApplicationFirewallPolicyInner, WebApplicationFirewallPoliciesInner, NetworkManager>  implements WebApplicationFirewallPolicies {
    protected WebApplicationFirewallPoliciesImpl(NetworkManager manager) {
        super(manager.inner().webApplicationFirewallPolicies(), manager);
    }

    @Override
    protected Observable<WebApplicationFirewallPolicyInner> getInnerAsync(String resourceGroupName, String name) {
        WebApplicationFirewallPoliciesInner client = this.inner();
        return client.getByResourceGroupAsync(resourceGroupName, name);
    }

    @Override
    protected Completable deleteInnerAsync(String resourceGroupName, String name) {
        WebApplicationFirewallPoliciesInner client = this.inner();
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
    public PagedList<WebApplicationFirewallPolicy> listByResourceGroup(String resourceGroupName) {
        WebApplicationFirewallPoliciesInner client = this.inner();
        return this.wrapList(client.listByResourceGroup(resourceGroupName));
    }

    @Override
    public Observable<WebApplicationFirewallPolicy> listByResourceGroupAsync(String resourceGroupName) {
        WebApplicationFirewallPoliciesInner client = this.inner();
        return client.listByResourceGroupAsync(resourceGroupName)
        .flatMapIterable(new Func1<Page<WebApplicationFirewallPolicyInner>, Iterable<WebApplicationFirewallPolicyInner>>() {
            @Override
            public Iterable<WebApplicationFirewallPolicyInner> call(Page<WebApplicationFirewallPolicyInner> page) {
                return page.items();
            }
        })
        .map(new Func1<WebApplicationFirewallPolicyInner, WebApplicationFirewallPolicy>() {
            @Override
            public WebApplicationFirewallPolicy call(WebApplicationFirewallPolicyInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public PagedList<WebApplicationFirewallPolicy> list() {
        WebApplicationFirewallPoliciesInner client = this.inner();
        return this.wrapList(client.list());
    }

    @Override
    public Observable<WebApplicationFirewallPolicy> listAsync() {
        WebApplicationFirewallPoliciesInner client = this.inner();
        return client.listAsync()
        .flatMapIterable(new Func1<Page<WebApplicationFirewallPolicyInner>, Iterable<WebApplicationFirewallPolicyInner>>() {
            @Override
            public Iterable<WebApplicationFirewallPolicyInner> call(Page<WebApplicationFirewallPolicyInner> page) {
                return page.items();
            }
        })
        .map(new Func1<WebApplicationFirewallPolicyInner, WebApplicationFirewallPolicy>() {
            @Override
            public WebApplicationFirewallPolicy call(WebApplicationFirewallPolicyInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public WebApplicationFirewallPolicyImpl define(String name) {
        return wrapModel(name);
    }

    @Override
    protected WebApplicationFirewallPolicyImpl wrapModel(WebApplicationFirewallPolicyInner inner) {
        return  new WebApplicationFirewallPolicyImpl(inner.name(), inner, manager());
    }

    @Override
    protected WebApplicationFirewallPolicyImpl wrapModel(String name) {
        return new WebApplicationFirewallPolicyImpl(name, new WebApplicationFirewallPolicyInner(), this.manager());
    }

}
