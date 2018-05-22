/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2018_30_30_preview;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Akamai access control.
 */
public class AkamaiAccessControl {
    /**
     * authentication key list.
     */
    @JsonProperty(value = "akamaiSignatureHeaderAuthenticationKeyList")
    private List<AkamaiSignatureHeaderAuthenticationKey> akamaiSignatureHeaderAuthenticationKeyList;

    /**
     * Get the akamaiSignatureHeaderAuthenticationKeyList value.
     *
     * @return the akamaiSignatureHeaderAuthenticationKeyList value
     */
    public List<AkamaiSignatureHeaderAuthenticationKey> akamaiSignatureHeaderAuthenticationKeyList() {
        return this.akamaiSignatureHeaderAuthenticationKeyList;
    }

    /**
     * Set the akamaiSignatureHeaderAuthenticationKeyList value.
     *
     * @param akamaiSignatureHeaderAuthenticationKeyList the akamaiSignatureHeaderAuthenticationKeyList value to set
     * @return the AkamaiAccessControl object itself.
     */
    public AkamaiAccessControl withAkamaiSignatureHeaderAuthenticationKeyList(List<AkamaiSignatureHeaderAuthenticationKey> akamaiSignatureHeaderAuthenticationKeyList) {
        this.akamaiSignatureHeaderAuthenticationKeyList = akamaiSignatureHeaderAuthenticationKeyList;
        return this;
    }

}
