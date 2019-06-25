/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.eventgrid.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;

/**
 * The event data for a Job output.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@odata.type")
@JsonTypeName("MediaJobOutput")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "#Microsoft.Media.JobOutputAsset", value = MediaJobOutputAsset.class)
})
public class MediaJobOutput {
    /**
     * Gets the Job output error.
     */
    @JsonProperty(value = "error")
    private MediaJobError error;

    /**
     * Gets the Job output label.
     */
    @JsonProperty(value = "label")
    private String label;

    /**
     * Gets the Job output progress.
     */
    @JsonProperty(value = "progress", required = true)
    private long progress;

    /**
     * Gets the Job output state. Possible values include: 'Canceled',
     * 'Canceling', 'Error', 'Finished', 'Processing', 'Queued', 'Scheduled'.
     */
    @JsonProperty(value = "state", required = true)
    private MediaJobState state;

    /**
     * Creates an instance of MediaJobOutput class.
     * @param progress gets the Job output progress.
     * @param state gets the Job output state. Possible values include: 'Canceled', 'Canceling', 'Error', 'Finished', 'Processing', 'Queued', 'Scheduled'.
     */
    public MediaJobOutput(long progress, MediaJobState state) {
        this.progress = progress;
        this.state = state;
    }

    /**
     * Private constructor for deserialization.
     */
    protected MediaJobOutput() {
    }

    /**
     * Get gets the Job output error.
     *
     * @return the error value
     */
    public MediaJobError error() {
        return this.error;
    }

    /**
     * Set gets the Job output error.
     *
     * @param error the error value to set
     * @return the MediaJobOutput object itself.
     */
    public MediaJobOutput withError(MediaJobError error) {
        this.error = error;
        return this;
    }

    /**
     * Get gets the Job output label.
     *
     * @return the label value
     */
    public String label() {
        return this.label;
    }

    /**
     * Set gets the Job output label.
     *
     * @param label the label value to set
     * @return the MediaJobOutput object itself.
     */
    public MediaJobOutput withLabel(String label) {
        this.label = label;
        return this;
    }

    /**
     * Get gets the Job output progress.
     *
     * @return the progress value
     */
    public long progress() {
        return this.progress;
    }

    /**
     * Get gets the Job output state. Possible values include: 'Canceled', 'Canceling', 'Error', 'Finished', 'Processing', 'Queued', 'Scheduled'.
     *
     * @return the state value
     */
    public MediaJobState state() {
        return this.state;
    }

}
