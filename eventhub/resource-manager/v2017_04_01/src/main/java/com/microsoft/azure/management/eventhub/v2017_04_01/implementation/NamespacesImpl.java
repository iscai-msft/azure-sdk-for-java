/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * def
 */

package com.microsoft.azure.management.eventhub.v2017_04_01.implementation;

import com.microsoft.azure.arm.resources.collection.implementation.GroupableResourcesCoreImpl;
import com.microsoft.azure.management.eventhub.v2017_04_01.Namespaces;
import com.microsoft.azure.management.eventhub.v2017_04_01.EHNamespace;
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
import com.microsoft.azure.management.eventhub.v2017_04_01.MessagingPlan;
import com.microsoft.azure.management.eventhub.v2017_04_01.CheckNameAvailabilityResult;
import com.microsoft.azure.management.eventhub.v2017_04_01.NamespaceAuthorizationRule;
import com.microsoft.azure.management.eventhub.v2017_04_01.AccessKeys;
import com.microsoft.azure.management.eventhub.v2017_04_01.RegenerateAccessKeyParameters;
import com.microsoft.azure.management.eventhub.v2017_04_01.NetworkRuleSet;

class NamespacesImpl extends GroupableResourcesCoreImpl<EHNamespace, EHNamespaceImpl, EHNamespaceInner, NamespacesInner, EventHubManager>  implements Namespaces {
    protected NamespacesImpl(EventHubManager manager) {
        super(manager.inner().namespaces(), manager);
    }

    @Override
    protected Observable<EHNamespaceInner> getInnerAsync(String resourceGroupName, String name) {
        NamespacesInner client = this.inner();
        return client.getByResourceGroupAsync(resourceGroupName, name);
    }

    @Override
    protected Completable deleteInnerAsync(String resourceGroupName, String name) {
        NamespacesInner client = this.inner();
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
    public PagedList<EHNamespace> listByResourceGroup(String resourceGroupName) {
        NamespacesInner client = this.inner();
        return this.wrapList(client.listByResourceGroup(resourceGroupName));
    }

    @Override
    public Observable<EHNamespace> listByResourceGroupAsync(String resourceGroupName) {
        NamespacesInner client = this.inner();
        return client.listByResourceGroupAsync(resourceGroupName)
        .flatMapIterable(new Func1<Page<EHNamespaceInner>, Iterable<EHNamespaceInner>>() {
            @Override
            public Iterable<EHNamespaceInner> call(Page<EHNamespaceInner> page) {
                return page.items();
            }
        })
        .map(new Func1<EHNamespaceInner, EHNamespace>() {
            @Override
            public EHNamespace call(EHNamespaceInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public PagedList<EHNamespace> list() {
        NamespacesInner client = this.inner();
        return this.wrapList(client.list());
    }

    @Override
    public Observable<EHNamespace> listAsync() {
        NamespacesInner client = this.inner();
        return client.listAsync()
        .flatMapIterable(new Func1<Page<EHNamespaceInner>, Iterable<EHNamespaceInner>>() {
            @Override
            public Iterable<EHNamespaceInner> call(Page<EHNamespaceInner> page) {
                return page.items();
            }
        })
        .map(new Func1<EHNamespaceInner, EHNamespace>() {
            @Override
            public EHNamespace call(EHNamespaceInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public EHNamespaceImpl define(String name) {
        return wrapModel(name);
    }

    @Override
    public Observable<MessagingPlan> getMessagingPlanAsync(String resourceGroupName, String namespaceName) {
        NamespacesInner client = this.inner();
        return client.getMessagingPlanAsync(resourceGroupName, namespaceName)
        .map(new Func1<MessagingPlanInner, MessagingPlan>() {
            @Override
            public MessagingPlan call(MessagingPlanInner inner) {
                return new MessagingPlanImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<CheckNameAvailabilityResult> checkNameAvailabilityAsync(String name) {
        NamespacesInner client = this.inner();
        return client.checkNameAvailabilityAsync(name)
        .map(new Func1<CheckNameAvailabilityResultInner, CheckNameAvailabilityResult>() {
            @Override
            public CheckNameAvailabilityResult call(CheckNameAvailabilityResultInner inner) {
                return new CheckNameAvailabilityResultImpl(inner, manager());
            }
        });
    }

    @Override
    protected EHNamespaceImpl wrapModel(EHNamespaceInner inner) {
        return  new EHNamespaceImpl(inner.name(), inner, manager());
    }

    @Override
    protected EHNamespaceImpl wrapModel(String name) {
        return new EHNamespaceImpl(name, new EHNamespaceInner(), this.manager());
    }

    @Override
    public NamespaceAuthorizationRuleImpl defineAuthorizationRule(String name) {
        return wrapAuthorizationRuleModel(name);
    }

    private NamespaceAuthorizationRuleImpl wrapAuthorizationRuleModel(String name) {
        return new NamespaceAuthorizationRuleImpl(name, this.manager());
    }

    private NamespaceAuthorizationRuleImpl wrapNamespaceAuthorizationRuleModel(AuthorizationRuleInner inner) {
        return  new NamespaceAuthorizationRuleImpl(inner, manager());
    }

    private Observable<AuthorizationRuleInner> getAuthorizationRuleInnerUsingNamespacesInnerAsync(String id) {
        String resourceGroupName = IdParsingUtils.getValueFromIdByName(id, "resourceGroups");
        String namespaceName = IdParsingUtils.getValueFromIdByName(id, "namespaces");
        String authorizationRuleName = IdParsingUtils.getValueFromIdByName(id, "AuthorizationRules");
        NamespacesInner client = this.inner();
        return client.getAuthorizationRuleAsync(resourceGroupName, namespaceName, authorizationRuleName);
    }

    @Override
    public Observable<NamespaceAuthorizationRule> getAuthorizationRuleAsync(String resourceGroupName, String namespaceName, String authorizationRuleName) {
        NamespacesInner client = this.inner();
        return client.getAuthorizationRuleAsync(resourceGroupName, namespaceName, authorizationRuleName)
        .map(new Func1<AuthorizationRuleInner, NamespaceAuthorizationRule>() {
            @Override
            public NamespaceAuthorizationRule call(AuthorizationRuleInner inner) {
                return wrapNamespaceAuthorizationRuleModel(inner);
            }
       });
    }

    @Override
    public Observable<NamespaceAuthorizationRule> listAuthorizationRulesAsync(final String resourceGroupName, final String namespaceName) {
        NamespacesInner client = this.inner();
        return client.listAuthorizationRulesAsync(resourceGroupName, namespaceName)
        .flatMapIterable(new Func1<Page<AuthorizationRuleInner>, Iterable<AuthorizationRuleInner>>() {
            @Override
            public Iterable<AuthorizationRuleInner> call(Page<AuthorizationRuleInner> page) {
                return page.items();
            }
        })
        .map(new Func1<AuthorizationRuleInner, NamespaceAuthorizationRule>() {
            @Override
            public NamespaceAuthorizationRule call(AuthorizationRuleInner inner) {
                return wrapNamespaceAuthorizationRuleModel(inner);
            }
        });
    }

    @Override
    public Completable deleteAuthorizationRuleAsync(String resourceGroupName, String namespaceName, String authorizationRuleName) {
        NamespacesInner client = this.inner();
        return client.deleteAuthorizationRuleAsync(resourceGroupName, namespaceName, authorizationRuleName).toCompletable();
    }

    @Override
    public Observable<AccessKeys> listKeysAsync(String resourceGroupName, String namespaceName, String authorizationRuleName) {
        NamespacesInner client = this.inner();
        return client.listKeysAsync(resourceGroupName, namespaceName, authorizationRuleName)
        .map(new Func1<AccessKeysInner, AccessKeys>() {
            @Override
            public AccessKeys call(AccessKeysInner inner) {
                return new AccessKeysImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<AccessKeys> regenerateKeysAsync(String resourceGroupName, String namespaceName, String authorizationRuleName, RegenerateAccessKeyParameters parameters) {
        NamespacesInner client = this.inner();
        return client.regenerateKeysAsync(resourceGroupName, namespaceName, authorizationRuleName, parameters)
        .map(new Func1<AccessKeysInner, AccessKeys>() {
            @Override
            public AccessKeys call(AccessKeysInner inner) {
                return new AccessKeysImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<NetworkRuleSet> createOrUpdateNetworkRuleSetAsync(String resourceGroupName, String namespaceName, NetworkRuleSetInner parameters) {
        NamespacesInner client = this.inner();
        return client.createOrUpdateNetworkRuleSetAsync(resourceGroupName, namespaceName, parameters)
        .map(new Func1<NetworkRuleSetInner, NetworkRuleSet>() {
            @Override
            public NetworkRuleSet call(NetworkRuleSetInner inner) {
                return new NetworkRuleSetImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<NetworkRuleSet> getNetworkRuleSetAsync(String resourceGroupName, String namespaceName) {
        NamespacesInner client = this.inner();
        return client.getNetworkRuleSetAsync(resourceGroupName, namespaceName)
        .map(new Func1<NetworkRuleSetInner, NetworkRuleSet>() {
            @Override
            public NetworkRuleSet call(NetworkRuleSetInner inner) {
                return new NetworkRuleSetImpl(inner, manager());
            }
        });
    }

}
