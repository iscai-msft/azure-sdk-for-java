/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.apimanagement.v2018_06_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.TenantAccessGits;
import rx.Completable;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.AccessInformationContract;

class TenantAccessGitsImpl extends WrapperImpl<TenantAccessGitsInner> implements TenantAccessGits {
    private final ApiManagementManager manager;

    TenantAccessGitsImpl(ApiManagementManager manager) {
        super(manager.inner().tenantAccessGits());
        this.manager = manager;
    }

    public ApiManagementManager manager() {
        return this.manager;
    }

    @Override
    public Observable<AccessInformationContract> getAsync(String resourceGroupName, String serviceName) {
        TenantAccessGitsInner client = this.inner();
        return client.getAsync(resourceGroupName, serviceName)
        .map(new Func1<AccessInformationContractInner, AccessInformationContract>() {
            @Override
            public AccessInformationContract call(AccessInformationContractInner inner) {
                return new AccessInformationContractImpl(inner, manager());
            }
        });
    }

    @Override
    public Completable regeneratePrimaryKeyAsync(String resourceGroupName, String serviceName) {
        TenantAccessGitsInner client = this.inner();
        return client.regeneratePrimaryKeyAsync(resourceGroupName, serviceName).toCompletable();
    }

    @Override
    public Completable regenerateSecondaryKeyAsync(String resourceGroupName, String serviceName) {
        TenantAccessGitsInner client = this.inner();
        return client.regenerateSecondaryKeyAsync(resourceGroupName, serviceName).toCompletable();
    }

}
