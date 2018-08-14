/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2018_07_01.implementation;

import com.microsoft.azure.management.mediaservices.v2018_07_01.AccountFilterCollection;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import java.util.List;

class AccountFilterCollectionImpl extends WrapperImpl<AccountFilterCollectionInner> implements AccountFilterCollection {
    private final MediaManager manager;
    AccountFilterCollectionImpl(AccountFilterCollectionInner inner, MediaManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public MediaManager manager() {
        return this.manager;
    }

    @Override
    public String odatanextLink() {
        return this.inner().odatanextLink();
    }

    @Override
    public List<AccountFilterInner> value() {
        return this.inner().value();
    }

}
