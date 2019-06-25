/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2019_01_01.implementation;

import com.microsoft.azure.management.apimanagement.v2019_01_01.TagResourceContract;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import rx.Observable;
import com.microsoft.azure.management.apimanagement.v2019_01_01.ApiTagResourceContractProperties;
import com.microsoft.azure.management.apimanagement.v2019_01_01.OperationTagResourceContractProperties;
import com.microsoft.azure.management.apimanagement.v2019_01_01.ProductTagResourceContractProperties;
import com.microsoft.azure.management.apimanagement.v2019_01_01.TagTagResourceContractProperties;

class TagResourceContractImpl extends WrapperImpl<TagResourceContractInner> implements TagResourceContract {
    private final ApiManagementManager manager;

    TagResourceContractImpl(TagResourceContractInner inner,  ApiManagementManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public ApiManagementManager manager() {
        return this.manager;
    }



    @Override
    public ApiTagResourceContractProperties api() {
        return this.inner().api();
    }

    @Override
    public OperationTagResourceContractProperties operation() {
        return this.inner().operation();
    }

    @Override
    public ProductTagResourceContractProperties product() {
        return this.inner().product();
    }

    @Override
    public TagTagResourceContractProperties tag() {
        return this.inner().tag();
    }

}
