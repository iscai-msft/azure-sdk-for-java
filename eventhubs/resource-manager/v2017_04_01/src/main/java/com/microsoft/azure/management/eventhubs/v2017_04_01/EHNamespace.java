/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.eventhubs.v2017_04_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.Resource;
import com.microsoft.azure.arm.resources.models.GroupableResourceCore;
import com.microsoft.azure.arm.resources.models.HasResourceGroup;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.eventhubs.v2017_04_01.implementation.EventHubsManager;
import org.joda.time.DateTime;
import com.microsoft.azure.management.eventhubs.v2017_04_01.implementation.EHNamespaceInner;

/**
 * Type representing EHNamespace.
 */
public interface EHNamespace extends HasInner<EHNamespaceInner>, Resource, GroupableResourceCore<EventHubsManager, EHNamespaceInner>, HasResourceGroup, Refreshable<EHNamespace>, Updatable<EHNamespace.Update>, HasManager<EventHubsManager> {
    /**
     * @return the createdAt value.
     */
    DateTime createdAt();

    /**
     * @return the isAutoInflateEnabled value.
     */
    Boolean isAutoInflateEnabled();

    /**
     * @return the kafkaEnabled value.
     */
    Boolean kafkaEnabled();

    /**
     * @return the maximumThroughputUnits value.
     */
    Integer maximumThroughputUnits();

    /**
     * @return the metricId value.
     */
    String metricId();

    /**
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * @return the serviceBusEndpoint value.
     */
    String serviceBusEndpoint();

    /**
     * @return the sku value.
     */
    Sku sku();

    /**
     * @return the updatedAt value.
     */
    DateTime updatedAt();

    /**
     * The entirety of the EHNamespace definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithGroup, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of EHNamespace definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a EHNamespace definition.
         */
        interface Blank extends GroupableResourceCore.DefinitionWithRegion<WithGroup> {
        }

        /**
         * The stage of the EHNamespace definition allowing to specify the resource group.
         */
        interface WithGroup extends GroupableResourceCore.DefinitionStages.WithGroup<WithCreate> {
        }

        /**
         * The stage of the ehnamespace definition allowing to specify IsAutoInflateEnabled.
         */
        interface WithIsAutoInflateEnabled {
            /**
             * Specifies isAutoInflateEnabled.
             * @param isAutoInflateEnabled Value that indicates whether AutoInflate is enabled for eventhub namespace
             * @return the next definition stage
             */
            WithCreate withIsAutoInflateEnabled(Boolean isAutoInflateEnabled);
        }

        /**
         * The stage of the ehnamespace definition allowing to specify KafkaEnabled.
         */
        interface WithKafkaEnabled {
            /**
             * Specifies kafkaEnabled.
             * @param kafkaEnabled Value that indicates whether Kafka is enabled for eventhub namespace
             * @return the next definition stage
             */
            WithCreate withKafkaEnabled(Boolean kafkaEnabled);
        }

        /**
         * The stage of the ehnamespace definition allowing to specify MaximumThroughputUnits.
         */
        interface WithMaximumThroughputUnits {
            /**
             * Specifies maximumThroughputUnits.
             * @param maximumThroughputUnits Upper limit of throughput units when AutoInflate is enabled, value should be within 0 to 20 throughput units. ( '0' if AutoInflateEnabled = true)
             * @return the next definition stage
             */
            WithCreate withMaximumThroughputUnits(Integer maximumThroughputUnits);
        }

        /**
         * The stage of the ehnamespace definition allowing to specify Sku.
         */
        interface WithSku {
            /**
             * Specifies sku.
             * @param sku Properties of sku resource
             * @return the next definition stage
             */
            WithCreate withSku(Sku sku);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<EHNamespace>, Resource.DefinitionWithTags<WithCreate>, DefinitionStages.WithIsAutoInflateEnabled, DefinitionStages.WithKafkaEnabled, DefinitionStages.WithMaximumThroughputUnits, DefinitionStages.WithSku {
        }
    }
    /**
     * The template for a EHNamespace update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<EHNamespace>, Resource.UpdateWithTags<Update>, UpdateStages.WithIsAutoInflateEnabled, UpdateStages.WithKafkaEnabled, UpdateStages.WithMaximumThroughputUnits, UpdateStages.WithSku {
    }

    /**
     * Grouping of EHNamespace update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the ehnamespace update allowing to specify IsAutoInflateEnabled.
         */
        interface WithIsAutoInflateEnabled {
            /**
             * Specifies isAutoInflateEnabled.
             * @param isAutoInflateEnabled Value that indicates whether AutoInflate is enabled for eventhub namespace
             * @return the next update stage
             */
            Update withIsAutoInflateEnabled(Boolean isAutoInflateEnabled);
        }

        /**
         * The stage of the ehnamespace update allowing to specify KafkaEnabled.
         */
        interface WithKafkaEnabled {
            /**
             * Specifies kafkaEnabled.
             * @param kafkaEnabled Value that indicates whether Kafka is enabled for eventhub namespace
             * @return the next update stage
             */
            Update withKafkaEnabled(Boolean kafkaEnabled);
        }

        /**
         * The stage of the ehnamespace update allowing to specify MaximumThroughputUnits.
         */
        interface WithMaximumThroughputUnits {
            /**
             * Specifies maximumThroughputUnits.
             * @param maximumThroughputUnits Upper limit of throughput units when AutoInflate is enabled, value should be within 0 to 20 throughput units. ( '0' if AutoInflateEnabled = true)
             * @return the next update stage
             */
            Update withMaximumThroughputUnits(Integer maximumThroughputUnits);
        }

        /**
         * The stage of the ehnamespace update allowing to specify Sku.
         */
        interface WithSku {
            /**
             * Specifies sku.
             * @param sku Properties of sku resource
             * @return the next update stage
             */
            Update withSku(Sku sku);
        }

    }
}
