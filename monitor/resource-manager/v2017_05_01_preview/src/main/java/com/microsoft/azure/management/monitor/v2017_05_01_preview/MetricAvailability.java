/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.monitor.v2017_05_01_preview;

import org.joda.time.Period;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Metric availability specifies the time grain (aggregation interval or
 * frequency) and the retention period for that time grain.
 */
public class MetricAvailability {
    /**
     * the time grain specifies the aggregation interval for the metric.
     * Expressed as a duration 'PT1M', 'P1D', etc.
     */
    @JsonProperty(value = "timeGrain")
    private Period timeGrain;

    /**
     * the retention period for the metric at the specified timegrain.
     * Expressed as a duration 'PT1M', 'P1D', etc.
     */
    @JsonProperty(value = "retention")
    private Period retention;

    /**
     * Get the time grain specifies the aggregation interval for the metric. Expressed as a duration 'PT1M', 'P1D', etc.
     *
     * @return the timeGrain value
     */
    public Period timeGrain() {
        return this.timeGrain;
    }

    /**
     * Set the time grain specifies the aggregation interval for the metric. Expressed as a duration 'PT1M', 'P1D', etc.
     *
     * @param timeGrain the timeGrain value to set
     * @return the MetricAvailability object itself.
     */
    public MetricAvailability withTimeGrain(Period timeGrain) {
        this.timeGrain = timeGrain;
        return this;
    }

    /**
     * Get the retention period for the metric at the specified timegrain.  Expressed as a duration 'PT1M', 'P1D', etc.
     *
     * @return the retention value
     */
    public Period retention() {
        return this.retention;
    }

    /**
     * Set the retention period for the metric at the specified timegrain.  Expressed as a duration 'PT1M', 'P1D', etc.
     *
     * @param retention the retention value to set
     * @return the MetricAvailability object itself.
     */
    public MetricAvailability withRetention(Period retention) {
        this.retention = retention;
        return this;
    }

}
