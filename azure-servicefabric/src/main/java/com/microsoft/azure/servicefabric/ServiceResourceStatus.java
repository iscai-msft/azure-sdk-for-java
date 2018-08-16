/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.servicefabric;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for ServiceResourceStatus.
 */
public final class ServiceResourceStatus extends ExpandableStringEnum<ServiceResourceStatus> {
    /** Static value Unknown for ServiceResourceStatus. */
    public static final ServiceResourceStatus UNKNOWN = fromString("Unknown");

    /** Static value Active for ServiceResourceStatus. */
    public static final ServiceResourceStatus ACTIVE = fromString("Active");

    /** Static value Upgrading for ServiceResourceStatus. */
    public static final ServiceResourceStatus UPGRADING = fromString("Upgrading");

    /** Static value Deleting for ServiceResourceStatus. */
    public static final ServiceResourceStatus DELETING = fromString("Deleting");

    /** Static value Creating for ServiceResourceStatus. */
    public static final ServiceResourceStatus CREATING = fromString("Creating");

    /** Static value Failed for ServiceResourceStatus. */
    public static final ServiceResourceStatus FAILED = fromString("Failed");

    /**
     * Creates or finds a ServiceResourceStatus from its string representation.
     * @param name a name to look for
     * @return the corresponding ServiceResourceStatus
     */
    @JsonCreator
    public static ServiceResourceStatus fromString(String name) {
        return fromString(name, ServiceResourceStatus.class);
    }

    /**
     * @return known ServiceResourceStatus values
     */
    public static Collection<ServiceResourceStatus> values() {
        return values(ServiceResourceStatus.class);
    }
}
