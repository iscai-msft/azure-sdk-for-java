/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.servicefabric;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes a request to cancel a repair task.
 *
 * This type supports the Service Fabric platform; it is not meant to be used
 * directly from your code.
 */
public class RepairTaskCancelDescription {
    /**
     * The ID of the repair task.
     */
    @JsonProperty(value = "TaskId", required = true)
    private String taskId;

    /**
     * The current version number of the repair task. If non-zero, then the
     * request will only succeed if this value matches the actual current
     * version of the repair task. If zero, then no version check is performed.
     */
    @JsonProperty(value = "Version")
    private String version;

    /**
     * _True_ if the repair should be stopped as soon as possible even if it
     * has already started executing. _False_ if the repair should be cancelled
     * only if execution has not yet started.
     */
    @JsonProperty(value = "RequestAbort")
    private Boolean requestAbort;

    /**
     * Get the ID of the repair task.
     *
     * @return the taskId value
     */
    public String taskId() {
        return this.taskId;
    }

    /**
     * Set the ID of the repair task.
     *
     * @param taskId the taskId value to set
     * @return the RepairTaskCancelDescription object itself.
     */
    public RepairTaskCancelDescription withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * Get the current version number of the repair task. If non-zero, then the request will only succeed if this value matches the actual current version of the repair task. If zero, then no version check is performed.
     *
     * @return the version value
     */
    public String version() {
        return this.version;
    }

    /**
     * Set the current version number of the repair task. If non-zero, then the request will only succeed if this value matches the actual current version of the repair task. If zero, then no version check is performed.
     *
     * @param version the version value to set
     * @return the RepairTaskCancelDescription object itself.
     */
    public RepairTaskCancelDescription withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get _True_ if the repair should be stopped as soon as possible even if it has already started executing. _False_ if the repair should be cancelled only if execution has not yet started.
     *
     * @return the requestAbort value
     */
    public Boolean requestAbort() {
        return this.requestAbort;
    }

    /**
     * Set _True_ if the repair should be stopped as soon as possible even if it has already started executing. _False_ if the repair should be cancelled only if execution has not yet started.
     *
     * @param requestAbort the requestAbort value to set
     * @return the RepairTaskCancelDescription object itself.
     */
    public RepairTaskCancelDescription withRequestAbort(Boolean requestAbort) {
        this.requestAbort = requestAbort;
        return this;
    }

}
