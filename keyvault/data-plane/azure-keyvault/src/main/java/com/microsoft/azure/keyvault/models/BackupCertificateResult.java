/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.keyvault.models;

import com.azure.common.implementation.Base64Url;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The backup certificate result, containing the backup blob.
 */
public final class BackupCertificateResult {
    /**
     * The backup blob containing the backed up certificate.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private Base64Url value;

    /**
     * Get the value value.
     *
     * @return the value value.
     */
    public byte[] value() {
        if (this.value == null) {
            return null;
        }
        return this.value.decodedBytes();
    }
}
