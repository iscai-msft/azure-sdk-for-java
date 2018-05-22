/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2018_30_30_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes the properties of a TransformOutput, which are the rules to be
 * applied while generating the desired output.
 */
public class TransformOutput {
    /**
     * A Transform can define more than one outputs. This property defines what
     * the service should do when one output fails - either continue to produce
     * other outputs, or, stop the other outputs. The default is stop. Possible
     * values include: 'StopProcessingJob', 'ContinueJob'.
     */
    @JsonProperty(value = "onError")
    private OnErrorType onError;

    /**
     * Sets the relative priority of the TransformOutputs within a Transform.
     * This sets the priority that the service uses for processing
     * TransformOutputs. The default priority is Normal. Possible values
     * include: 'Low', 'Normal', 'High'.
     */
    @JsonProperty(value = "relativePriority")
    private Priority relativePriority;

    /**
     * Preset that describes the operations that will be used to modify,
     * transcode, or extract insights from the source file to generate the
     * output.
     */
    @JsonProperty(value = "preset", required = true)
    private Preset preset;

    /**
     * Get the onError value.
     *
     * @return the onError value
     */
    public OnErrorType onError() {
        return this.onError;
    }

    /**
     * Set the onError value.
     *
     * @param onError the onError value to set
     * @return the TransformOutput object itself.
     */
    public TransformOutput withOnError(OnErrorType onError) {
        this.onError = onError;
        return this;
    }

    /**
     * Get the relativePriority value.
     *
     * @return the relativePriority value
     */
    public Priority relativePriority() {
        return this.relativePriority;
    }

    /**
     * Set the relativePriority value.
     *
     * @param relativePriority the relativePriority value to set
     * @return the TransformOutput object itself.
     */
    public TransformOutput withRelativePriority(Priority relativePriority) {
        this.relativePriority = relativePriority;
        return this;
    }

    /**
     * Get the preset value.
     *
     * @return the preset value
     */
    public Preset preset() {
        return this.preset;
    }

    /**
     * Set the preset value.
     *
     * @param preset the preset value to set
     * @return the TransformOutput object itself.
     */
    public TransformOutput withPreset(Preset preset) {
        this.preset = preset;
        return this;
    }

}
