/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.advisor.v2017_04_19.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.advisor.v2017_04_19.Operations;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.advisor.v2017_04_19.OperationEntity;

class OperationsImpl extends WrapperImpl<OperationsInner> implements Operations {
    private final AdvisorManager manager;

    OperationsImpl(AdvisorManager manager) {
        super(manager.inner().operations());
        this.manager = manager;
    }

    public AdvisorManager manager() {
        return this.manager;
    }

    @Override
    public Observable<OperationEntity> listAsync() {
        OperationsInner client = this.inner();
        return client.listAsync()
        .flatMapIterable(new Func1<Page<OperationEntityInner>, Iterable<OperationEntityInner>>() {
            @Override
            public Iterable<OperationEntityInner> call(Page<OperationEntityInner> page) {
                return page.items();
            }
        })
        .map(new Func1<OperationEntityInner, OperationEntity>() {
            @Override
            public OperationEntity call(OperationEntityInner inner) {
                return new OperationEntityImpl(inner, manager());
            }
        });
    }

}
