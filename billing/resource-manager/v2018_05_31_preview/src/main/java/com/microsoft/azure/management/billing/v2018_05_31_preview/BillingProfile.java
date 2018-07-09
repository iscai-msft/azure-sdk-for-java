/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2018_05_31_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.billing.v2018_05_31_preview.implementation.BillingProfileInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.billing.v2018_05_31_preview.implementation.BillingManager;

/**
 * Type representing BillingProfile.
 */
public interface BillingProfile extends HasInner<BillingProfileInner>, Indexable, Refreshable<BillingProfile>, Updatable<BillingProfile.Update>, HasManager<BillingManager> {
    /**
     * @return the billingAddress value.
     */
    Address billingAddress();

    /**
     * @return the billingContact value.
     */
    String billingContact();

    /**
     * @return the currency value.
     */
    String currency();

    /**
     * @return the displayName value.
     */
    String displayName();

    /**
     * @return the emailInvoice value.
     */
    Boolean emailInvoice();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the invoiceDay value.
     */
    String invoiceDay();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the poNumber value.
     */
    String poNumber();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The template for a BillingProfile update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<BillingProfile>, UpdateStages.WithBillingAddress, UpdateStages.WithDisplayName, UpdateStages.WithPoNumber {
    }

    /**
     * Grouping of BillingProfile update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the billingprofile update allowing to specify BillingAddress.
         */
        interface WithBillingAddress {
            /**
             * Specifies billingAddress.
             */
            Update withBillingAddress(Address billingAddress);
        }

        /**
         * The stage of the billingprofile update allowing to specify DisplayName.
         */
        interface WithDisplayName {
            /**
             * Specifies displayName.
             */
            Update withDisplayName(String displayName);
        }

        /**
         * The stage of the billingprofile update allowing to specify PoNumber.
         */
        interface WithPoNumber {
            /**
             * Specifies poNumber.
             */
            Update withPoNumber(String poNumber);
        }

    }
}