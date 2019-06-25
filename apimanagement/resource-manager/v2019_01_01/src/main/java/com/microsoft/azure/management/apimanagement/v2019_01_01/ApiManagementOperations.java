/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2019_01_01;

import rx.Observable;
import com.microsoft.azure.management.apimanagement.v2019_01_01.implementation.ApiManagementOperationsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing ApiManagementOperations.
 */
public interface ApiManagementOperations extends HasInner<ApiManagementOperationsInner> {
    /**
     * Lists all of the available REST API operations of the Microsoft.ApiManagement provider.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Operation> listAsync();

}
