/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2018_06_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.implementation.QuotaCounterContractInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.implementation.ApiManagementManager;
import org.joda.time.DateTime;

/**
 * Type representing QuotaCounterContract.
 */
public interface QuotaCounterContract extends HasInner<QuotaCounterContractInner>, HasManager<ApiManagementManager> {
    /**
     * @return the counterKey value.
     */
    String counterKey();

    /**
     * @return the periodEndTime value.
     */
    DateTime periodEndTime();

    /**
     * @return the periodKey value.
     */
    String periodKey();

    /**
     * @return the periodStartTime value.
     */
    DateTime periodStartTime();

    /**
     * @return the value value.
     */
    QuotaCounterValueContractProperties value();

}
