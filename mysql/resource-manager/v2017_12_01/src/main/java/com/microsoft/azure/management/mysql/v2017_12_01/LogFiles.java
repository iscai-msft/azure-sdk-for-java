/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mysql.v2017_12_01;

import rx.Observable;
import com.microsoft.azure.management.mysql.v2017_12_01.implementation.LogFilesInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing LogFiles.
 */
public interface LogFiles extends HasInner<LogFilesInner> {
    /**
     * List all the log files in a given server.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<LogFile> listByServerAsync(String resourceGroupName, String serverName);

}
