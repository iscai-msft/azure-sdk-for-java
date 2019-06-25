/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2019_04_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for SourceTriggerEvent.
 */
public final class SourceTriggerEvent extends ExpandableStringEnum<SourceTriggerEvent> {
    /** Static value commit for SourceTriggerEvent. */
    public static final SourceTriggerEvent COMMIT = fromString("commit");

    /** Static value pullrequest for SourceTriggerEvent. */
    public static final SourceTriggerEvent PULLREQUEST = fromString("pullrequest");

    /**
     * Creates or finds a SourceTriggerEvent from its string representation.
     * @param name a name to look for
     * @return the corresponding SourceTriggerEvent
     */
    @JsonCreator
    public static SourceTriggerEvent fromString(String name) {
        return fromString(name, SourceTriggerEvent.class);
    }

    /**
     * @return known SourceTriggerEvent values
     */
    public static Collection<SourceTriggerEvent> values() {
        return values(SourceTriggerEvent.class);
    }
}
