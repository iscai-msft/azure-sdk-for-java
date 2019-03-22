/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.keyvault.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.v3.ExpandableStringEnum;
import java.util.Collection;

/**
 * Defines values for DeletionRecoveryLevel.
 */
public final class DeletionRecoveryLevel extends ExpandableStringEnum<DeletionRecoveryLevel> {
    /**
     * Static value Purgeable for DeletionRecoveryLevel.
     */
    public static final DeletionRecoveryLevel PURGEABLE = fromString("Purgeable");

    /**
     * Static value Recoverable+Purgeable for DeletionRecoveryLevel.
     */
    public static final DeletionRecoveryLevel RECOVERABLE_PURGEABLE = fromString("Recoverable+Purgeable");

    /**
     * Static value Recoverable for DeletionRecoveryLevel.
     */
    public static final DeletionRecoveryLevel RECOVERABLE = fromString("Recoverable");

    /**
     * Static value Recoverable+ProtectedSubscription for DeletionRecoveryLevel.
     */
    public static final DeletionRecoveryLevel RECOVERABLE_PROTECTED_SUBSCRIPTION = fromString("Recoverable+ProtectedSubscription");

    /**
     * Creates or finds a DeletionRecoveryLevel from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding DeletionRecoveryLevel.
     */
    @JsonCreator
    public static DeletionRecoveryLevel fromString(String name) {
        return fromString(name, DeletionRecoveryLevel.class);
    }

    /**
     * @return known DeletionRecoveryLevel values.
     */
    public static Collection<DeletionRecoveryLevel> values() {
        return values(DeletionRecoveryLevel.class);
    }
}
