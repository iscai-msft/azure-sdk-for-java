/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.eventhubs.v2015_08_01.implementation;

import com.microsoft.azure.management.eventhubs.v2015_08_01.UnavailableReason;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Result of the CheckNameAvailability operation.
 */
public class CheckNameAvailabilityResultInner {
    /**
     * Value indicating Namespace is availability, true if the Namespace is
     * available; otherwise, false.
     */
    @JsonProperty(value = "nameAvailable")
    private Boolean nameAvailable;

    /**
     * The reason for unavailability of a Namespace. Possible values include:
     * 'None', 'InvalidName', 'SubscriptionIsDisabled', 'NameInUse',
     * 'NameInLockdown', 'TooManyNamespaceInCurrentSubscription'.
     */
    @JsonProperty(value = "reason")
    private UnavailableReason reason;

    /**
     * The detailed info regarding the reason associated with the Namespace.
     */
    @JsonProperty(value = "message", access = JsonProperty.Access.WRITE_ONLY)
    private String message;

    /**
     * Get value indicating Namespace is availability, true if the Namespace is available; otherwise, false.
     *
     * @return the nameAvailable value
     */
    public Boolean nameAvailable() {
        return this.nameAvailable;
    }

    /**
     * Set value indicating Namespace is availability, true if the Namespace is available; otherwise, false.
     *
     * @param nameAvailable the nameAvailable value to set
     * @return the CheckNameAvailabilityResultInner object itself.
     */
    public CheckNameAvailabilityResultInner withNameAvailable(Boolean nameAvailable) {
        this.nameAvailable = nameAvailable;
        return this;
    }

    /**
     * Get the reason for unavailability of a Namespace. Possible values include: 'None', 'InvalidName', 'SubscriptionIsDisabled', 'NameInUse', 'NameInLockdown', 'TooManyNamespaceInCurrentSubscription'.
     *
     * @return the reason value
     */
    public UnavailableReason reason() {
        return this.reason;
    }

    /**
     * Set the reason for unavailability of a Namespace. Possible values include: 'None', 'InvalidName', 'SubscriptionIsDisabled', 'NameInUse', 'NameInLockdown', 'TooManyNamespaceInCurrentSubscription'.
     *
     * @param reason the reason value to set
     * @return the CheckNameAvailabilityResultInner object itself.
     */
    public CheckNameAvailabilityResultInner withReason(UnavailableReason reason) {
        this.reason = reason;
        return this;
    }

    /**
     * Get the detailed info regarding the reason associated with the Namespace.
     *
     * @return the message value
     */
    public String message() {
        return this.message;
    }

}
