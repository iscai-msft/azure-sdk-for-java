/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.rest.v2.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * A list of HTTP status codes that are expected for this API.
 *
 * Example:
 *   {@literal @}ExpectedResponse({200, 201})
 *   {@literal @}POST("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.CustomerInsights/hubs/{hubName}/images/getEntityTypeImageUploadUrl")
 *   void getUploadUrlForEntityType(@Path("resourceGroupName") String resourceGroupName, @Path("hubName") String hubName, @Path("subscriptionId") String subscriptionId, @Body GetImageUploadUrlInputInner parameters);
 *
 */
@Retention(RUNTIME)
@Target(METHOD)
public @interface ExpectedResponse {
    /**
     * The status code that will trigger that an error of type errorType should be returned.
     * @return The status code that will trigger than an error of type errorType should be returned.
     */
    int[] value();
}