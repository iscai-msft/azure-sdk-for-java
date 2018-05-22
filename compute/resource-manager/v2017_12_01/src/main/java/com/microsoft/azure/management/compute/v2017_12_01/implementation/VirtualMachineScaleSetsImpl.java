/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * def
 */

package com.microsoft.azure.management.compute.v2017_12_01.implementation;

import com.microsoft.azure.arm.resources.collection.implementation.GroupableResourcesCoreImpl;
import com.microsoft.azure.management.compute.v2017_12_01.VirtualMachineScaleSets;
import com.microsoft.azure.management.compute.v2017_12_01.VirtualMachineScaleSet;
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
import com.microsoft.azure.management.compute.v2017_12_01.OperationStatusResponse;
import com.microsoft.azure.management.compute.v2017_12_01.VirtualMachineScaleSetInstanceView;
import com.microsoft.azure.management.compute.v2017_12_01.UpgradeOperationHistoricalStatusInfo;
import com.microsoft.azure.management.compute.v2017_12_01.RecoveryWalkResponse;
import java.util.List;
import com.microsoft.azure.management.compute.v2017_12_01.VirtualMachineScaleSetSku;

class VirtualMachineScaleSetsImpl extends GroupableResourcesCoreImpl<VirtualMachineScaleSet, VirtualMachineScaleSetImpl, VirtualMachineScaleSetInner, VirtualMachineScaleSetsInner, ComputeManager>  implements VirtualMachineScaleSets {
    protected VirtualMachineScaleSetsImpl(ComputeManager manager) {
        super(manager.inner().virtualMachineScaleSets(), manager);
    }

    @Override
    protected Observable<VirtualMachineScaleSetInner> getInnerAsync(String resourceGroupName, String name) {
        VirtualMachineScaleSetsInner client = this.inner();
        return client.getByResourceGroupAsync(resourceGroupName, name);
    }

    @Override
    protected Completable deleteInnerAsync(String resourceGroupName, String name) {
        VirtualMachineScaleSetsInner client = this.inner();
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
    public PagedList<VirtualMachineScaleSet> listByResourceGroup(String resourceGroupName) {
        VirtualMachineScaleSetsInner client = this.inner();
        return this.wrapList(client.listByResourceGroup(resourceGroupName));
    }

    private Observable<Page<VirtualMachineScaleSetInner>> listByResourceGroupNextInnerPageAsync(String nextLink) {
        if (nextLink == null) {
            Observable.empty();
        }
        VirtualMachineScaleSetsInner client = this.inner();
        return client.listByResourceGroupNextAsync(nextLink)
        .flatMap(new Func1<Page<VirtualMachineScaleSetInner>, Observable<Page<VirtualMachineScaleSetInner>>>() {
            @Override
            public Observable<Page<VirtualMachineScaleSetInner>> call(Page<VirtualMachineScaleSetInner> page) {
                return Observable.just(page).concatWith(listByResourceGroupNextInnerPageAsync(page.nextPageLink()));
            }
        });
    }
    @Override
    public Observable<VirtualMachineScaleSet> listByResourceGroupAsync(String resourceGroupName) {
        VirtualMachineScaleSetsInner client = this.inner();
        return client.listByResourceGroupAsync(resourceGroupName)
        .flatMap(new Func1<Page<VirtualMachineScaleSetInner>, Observable<Page<VirtualMachineScaleSetInner>>>() {
            @Override
            public Observable<Page<VirtualMachineScaleSetInner>> call(Page<VirtualMachineScaleSetInner> page) {
                return listByResourceGroupNextInnerPageAsync(page.nextPageLink());
            }
        })
        .flatMapIterable(new Func1<Page<VirtualMachineScaleSetInner>, Iterable<VirtualMachineScaleSetInner>>() {
            @Override
            public Iterable<VirtualMachineScaleSetInner> call(Page<VirtualMachineScaleSetInner> page) {
                return page.items();
            }
       })
        .map(new Func1<VirtualMachineScaleSetInner, VirtualMachineScaleSet>() {
            @Override
            public VirtualMachineScaleSet call(VirtualMachineScaleSetInner inner) {
                return wrapModel(inner);
            }
       });
    }

    @Override
    public PagedList<VirtualMachineScaleSet> list() {
        VirtualMachineScaleSetsInner client = this.inner();
        return this.wrapList(client.list());
    }

    private Observable<Page<VirtualMachineScaleSetInner>> listNextInnerPageAsync(String nextLink) {
        if (nextLink == null) {
            Observable.empty();
        }
        VirtualMachineScaleSetsInner client = this.inner();
        return client.listNextAsync(nextLink)
        .flatMap(new Func1<Page<VirtualMachineScaleSetInner>, Observable<Page<VirtualMachineScaleSetInner>>>() {
            @Override
            public Observable<Page<VirtualMachineScaleSetInner>> call(Page<VirtualMachineScaleSetInner> page) {
                return Observable.just(page).concatWith(listNextInnerPageAsync(page.nextPageLink()));
            }
        });
    }
    @Override
    public Observable<VirtualMachineScaleSet> listAsync() {
        VirtualMachineScaleSetsInner client = this.inner();
        return client.listAsync()
        .flatMap(new Func1<Page<VirtualMachineScaleSetInner>, Observable<Page<VirtualMachineScaleSetInner>>>() {
            @Override
            public Observable<Page<VirtualMachineScaleSetInner>> call(Page<VirtualMachineScaleSetInner> page) {
                return listNextInnerPageAsync(page.nextPageLink());
            }
        })
        .flatMapIterable(new Func1<Page<VirtualMachineScaleSetInner>, Iterable<VirtualMachineScaleSetInner>>() {
            @Override
            public Iterable<VirtualMachineScaleSetInner> call(Page<VirtualMachineScaleSetInner> page) {
                return page.items();
            }
       })
        .map(new Func1<VirtualMachineScaleSetInner, VirtualMachineScaleSet>() {
            @Override
            public VirtualMachineScaleSet call(VirtualMachineScaleSetInner inner) {
                return wrapModel(inner);
            }
       });
    }

    @Override
    public VirtualMachineScaleSetImpl define(String name) {
        return wrapModel(name);
    }

    @Override
    public Observable<OperationStatusResponse> deallocateAsync(String resourceGroupName, String vmScaleSetName) {
        VirtualMachineScaleSetsInner client = this.inner();
        return client.deallocateAsync(resourceGroupName, vmScaleSetName)
        .map(new Func1<OperationStatusResponseInner, OperationStatusResponse>() {
            @Override
            public OperationStatusResponse call(OperationStatusResponseInner inner) {
                return new OperationStatusResponseImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<OperationStatusResponse> deleteInstancesAsync(String resourceGroupName, String vmScaleSetName, List<String> instanceIds) {
        VirtualMachineScaleSetsInner client = this.inner();
        return client.deleteInstancesAsync(resourceGroupName, vmScaleSetName, instanceIds)
        .map(new Func1<OperationStatusResponseInner, OperationStatusResponse>() {
            @Override
            public OperationStatusResponse call(OperationStatusResponseInner inner) {
                return new OperationStatusResponseImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<VirtualMachineScaleSetInstanceView> getInstanceViewAsync(String resourceGroupName, String vmScaleSetName) {
        VirtualMachineScaleSetsInner client = this.inner();
        return client.getInstanceViewAsync(resourceGroupName, vmScaleSetName)
        .map(new Func1<VirtualMachineScaleSetInstanceViewInner, VirtualMachineScaleSetInstanceView>() {
            @Override
            public VirtualMachineScaleSetInstanceView call(VirtualMachineScaleSetInstanceViewInner inner) {
                return new VirtualMachineScaleSetInstanceViewImpl(inner, manager());
            }
        });
    }

    private Observable<Page<UpgradeOperationHistoricalStatusInfoInner>> getOSUpgradeHistoryNextInnerPageAsync(String nextLink) {
        if (nextLink == null) {
            Observable.empty();
        }
        VirtualMachineScaleSetsInner client = this.inner();
        return client.getOSUpgradeHistoryNextAsync(nextLink)
        .flatMap(new Func1<Page<UpgradeOperationHistoricalStatusInfoInner>, Observable<Page<UpgradeOperationHistoricalStatusInfoInner>>>() {
            @Override
            public Observable<Page<UpgradeOperationHistoricalStatusInfoInner>> call(Page<UpgradeOperationHistoricalStatusInfoInner> page) {
                return Observable.just(page).concatWith(getOSUpgradeHistoryNextInnerPageAsync(page.nextPageLink()));
            }
        });
    }
    @Override
    public Observable<UpgradeOperationHistoricalStatusInfo> getOSUpgradeHistoryAsync(final String resourceGroupName, final String vmScaleSetName) {
        VirtualMachineScaleSetsInner client = this.inner();
        return client.getOSUpgradeHistoryAsync(resourceGroupName, vmScaleSetName)
        .flatMap(new Func1<Page<UpgradeOperationHistoricalStatusInfoInner>, Observable<Page<UpgradeOperationHistoricalStatusInfoInner>>>() {
            @Override
            public Observable<Page<UpgradeOperationHistoricalStatusInfoInner>> call(Page<UpgradeOperationHistoricalStatusInfoInner> page) {
                return getOSUpgradeHistoryNextInnerPageAsync(page.nextPageLink());
            }
        })
        .flatMapIterable(new Func1<Page<UpgradeOperationHistoricalStatusInfoInner>, Iterable<UpgradeOperationHistoricalStatusInfoInner>>() {
            @Override
            public Iterable<UpgradeOperationHistoricalStatusInfoInner> call(Page<UpgradeOperationHistoricalStatusInfoInner> page) {
                return page.items();
            }
       })
        .map(new Func1<UpgradeOperationHistoricalStatusInfoInner, UpgradeOperationHistoricalStatusInfo>() {
            @Override
            public UpgradeOperationHistoricalStatusInfo call(UpgradeOperationHistoricalStatusInfoInner inner) {
                return new UpgradeOperationHistoricalStatusInfoImpl(inner, manager());
            }
       });
    }

    @Override
    public Observable<OperationStatusResponse> powerOffAsync(String resourceGroupName, String vmScaleSetName) {
        VirtualMachineScaleSetsInner client = this.inner();
        return client.powerOffAsync(resourceGroupName, vmScaleSetName)
        .map(new Func1<OperationStatusResponseInner, OperationStatusResponse>() {
            @Override
            public OperationStatusResponse call(OperationStatusResponseInner inner) {
                return new OperationStatusResponseImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<OperationStatusResponse> restartAsync(String resourceGroupName, String vmScaleSetName) {
        VirtualMachineScaleSetsInner client = this.inner();
        return client.restartAsync(resourceGroupName, vmScaleSetName)
        .map(new Func1<OperationStatusResponseInner, OperationStatusResponse>() {
            @Override
            public OperationStatusResponse call(OperationStatusResponseInner inner) {
                return new OperationStatusResponseImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<OperationStatusResponse> startAsync(String resourceGroupName, String vmScaleSetName) {
        VirtualMachineScaleSetsInner client = this.inner();
        return client.startAsync(resourceGroupName, vmScaleSetName)
        .map(new Func1<OperationStatusResponseInner, OperationStatusResponse>() {
            @Override
            public OperationStatusResponse call(OperationStatusResponseInner inner) {
                return new OperationStatusResponseImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<OperationStatusResponse> redeployAsync(String resourceGroupName, String vmScaleSetName) {
        VirtualMachineScaleSetsInner client = this.inner();
        return client.redeployAsync(resourceGroupName, vmScaleSetName)
        .map(new Func1<OperationStatusResponseInner, OperationStatusResponse>() {
            @Override
            public OperationStatusResponse call(OperationStatusResponseInner inner) {
                return new OperationStatusResponseImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<OperationStatusResponse> performMaintenanceAsync(String resourceGroupName, String vmScaleSetName) {
        VirtualMachineScaleSetsInner client = this.inner();
        return client.performMaintenanceAsync(resourceGroupName, vmScaleSetName)
        .map(new Func1<OperationStatusResponseInner, OperationStatusResponse>() {
            @Override
            public OperationStatusResponse call(OperationStatusResponseInner inner) {
                return new OperationStatusResponseImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<OperationStatusResponse> updateInstancesAsync(String resourceGroupName, String vmScaleSetName, List<String> instanceIds) {
        VirtualMachineScaleSetsInner client = this.inner();
        return client.updateInstancesAsync(resourceGroupName, vmScaleSetName, instanceIds)
        .map(new Func1<OperationStatusResponseInner, OperationStatusResponse>() {
            @Override
            public OperationStatusResponse call(OperationStatusResponseInner inner) {
                return new OperationStatusResponseImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<OperationStatusResponse> reimageAsync(String resourceGroupName, String vmScaleSetName) {
        VirtualMachineScaleSetsInner client = this.inner();
        return client.reimageAsync(resourceGroupName, vmScaleSetName)
        .map(new Func1<OperationStatusResponseInner, OperationStatusResponse>() {
            @Override
            public OperationStatusResponse call(OperationStatusResponseInner inner) {
                return new OperationStatusResponseImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<OperationStatusResponse> reimageAllAsync(String resourceGroupName, String vmScaleSetName) {
        VirtualMachineScaleSetsInner client = this.inner();
        return client.reimageAllAsync(resourceGroupName, vmScaleSetName)
        .map(new Func1<OperationStatusResponseInner, OperationStatusResponse>() {
            @Override
            public OperationStatusResponse call(OperationStatusResponseInner inner) {
                return new OperationStatusResponseImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<RecoveryWalkResponse> forceRecoveryServiceFabricPlatformUpdateDomainWalkAsync(String resourceGroupName, String vmScaleSetName, int platformUpdateDomain) {
        VirtualMachineScaleSetsInner client = this.inner();
        return client.forceRecoveryServiceFabricPlatformUpdateDomainWalkAsync(resourceGroupName, vmScaleSetName, platformUpdateDomain)
        .map(new Func1<RecoveryWalkResponseInner, RecoveryWalkResponse>() {
            @Override
            public RecoveryWalkResponse call(RecoveryWalkResponseInner inner) {
                return new RecoveryWalkResponseImpl(inner, manager());
            }
        });
    }

    @Override
    protected VirtualMachineScaleSetImpl wrapModel(VirtualMachineScaleSetInner inner) {
        return  new VirtualMachineScaleSetImpl(inner.name(), inner, manager());
    }

    @Override
    protected VirtualMachineScaleSetImpl wrapModel(String name) {
        return new VirtualMachineScaleSetImpl(name, new VirtualMachineScaleSetInner(), this.manager());
    }

    private VirtualMachineScaleSetSkuImpl wrapModel(VirtualMachineScaleSetSkuInner inner) {
        return  new VirtualMachineScaleSetSkuImpl(inner, manager());
    }

    private Observable<Page<VirtualMachineScaleSetSkuInner>> listSkusNextInnerPageAsync(String nextLink) {
        if (nextLink == null) {
            Observable.empty();
        }
        VirtualMachineScaleSetsInner client = this.inner();
        return client.listSkusNextAsync(nextLink)
        .flatMap(new Func1<Page<VirtualMachineScaleSetSkuInner>, Observable<Page<VirtualMachineScaleSetSkuInner>>>() {
            @Override
            public Observable<Page<VirtualMachineScaleSetSkuInner>> call(Page<VirtualMachineScaleSetSkuInner> page) {
                return Observable.just(page).concatWith(listSkusNextInnerPageAsync(page.nextPageLink()));
            }
        });
    }
    @Override
    public Observable<VirtualMachineScaleSetSku> listSkusAsync(final String resourceGroupName, final String vmScaleSetName) {
        VirtualMachineScaleSetsInner client = this.inner();
        return client.listSkusAsync(resourceGroupName, vmScaleSetName)
        .flatMap(new Func1<Page<VirtualMachineScaleSetSkuInner>, Observable<Page<VirtualMachineScaleSetSkuInner>>>() {
            @Override
            public Observable<Page<VirtualMachineScaleSetSkuInner>> call(Page<VirtualMachineScaleSetSkuInner> page) {
                return listSkusNextInnerPageAsync(page.nextPageLink());
            }
        })
        .flatMapIterable(new Func1<Page<VirtualMachineScaleSetSkuInner>, Iterable<VirtualMachineScaleSetSkuInner>>() {
            @Override
            public Iterable<VirtualMachineScaleSetSkuInner> call(Page<VirtualMachineScaleSetSkuInner> page) {
                return page.items();
            }
       })
        .map(new Func1<VirtualMachineScaleSetSkuInner, VirtualMachineScaleSetSku>() {
            @Override
            public VirtualMachineScaleSetSku call(VirtualMachineScaleSetSkuInner inner) {
                return wrapModel(inner);
            }
       });
    }

}
