/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.compute;

import com.microsoft.azure.CloudException;
import com.microsoft.azure.management.compute.models.VirtualMachineImage;
import com.microsoft.azure.management.compute.models.VirtualMachineImageResource;
import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import java.util.List;

/**
 * An instance of this class provides access to all the operations defined
 * in VirtualMachineImagesOperations.
 */
public interface VirtualMachineImagesOperations {
    /**
     * Gets a virtual machine image.
     *
     * @param location the String value
     * @param publisherName the String value
     * @param offer the String value
     * @param skus the String value
     * @param version the String value
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the VirtualMachineImage object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<VirtualMachineImage> get(String location, String publisherName, String offer, String skus, String version) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets a virtual machine image.
     *
     * @param location the String value
     * @param publisherName the String value
     * @param offer the String value
     * @param skus the String value
     * @param version the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getAsync(String location, String publisherName, String offer, String skus, String version, final ServiceCallback<VirtualMachineImage> serviceCallback) throws IllegalArgumentException;

    /**
     * Gets a list of virtual machine images.
     *
     * @param location the String value
     * @param publisherName the String value
     * @param offer the String value
     * @param skus the String value
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;VirtualMachineImageResource&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<List<VirtualMachineImageResource>> list(String location, String publisherName, String offer, String skus) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets a list of virtual machine images.
     *
     * @param location the String value
     * @param publisherName the String value
     * @param offer the String value
     * @param skus the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listAsync(String location, String publisherName, String offer, String skus, final ServiceCallback<List<VirtualMachineImageResource>> serviceCallback) throws IllegalArgumentException;
    /**
     * Gets a list of virtual machine images.
     *
     * @param location the String value
     * @param publisherName the String value
     * @param offer the String value
     * @param skus the String value
     * @param filter The filter to apply on the operation.
     * @param top the Integer value
     * @param orderby the String value
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;VirtualMachineImageResource&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<List<VirtualMachineImageResource>> list(String location, String publisherName, String offer, String skus, VirtualMachineImageResource filter, Integer top, String orderby) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets a list of virtual machine images.
     *
     * @param location the String value
     * @param publisherName the String value
     * @param offer the String value
     * @param skus the String value
     * @param filter The filter to apply on the operation.
     * @param top the Integer value
     * @param orderby the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listAsync(String location, String publisherName, String offer, String skus, VirtualMachineImageResource filter, Integer top, String orderby, final ServiceCallback<List<VirtualMachineImageResource>> serviceCallback) throws IllegalArgumentException;

    /**
     * Gets a list of virtual machine image offers.
     *
     * @param location the String value
     * @param publisherName the String value
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;VirtualMachineImageResource&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<List<VirtualMachineImageResource>> listOffers(String location, String publisherName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets a list of virtual machine image offers.
     *
     * @param location the String value
     * @param publisherName the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listOffersAsync(String location, String publisherName, final ServiceCallback<List<VirtualMachineImageResource>> serviceCallback) throws IllegalArgumentException;

    /**
     * Gets a list of virtual machine image publishers.
     *
     * @param location the String value
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;VirtualMachineImageResource&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<List<VirtualMachineImageResource>> listPublishers(String location) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets a list of virtual machine image publishers.
     *
     * @param location the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listPublishersAsync(String location, final ServiceCallback<List<VirtualMachineImageResource>> serviceCallback) throws IllegalArgumentException;

    /**
     * Gets a list of virtual machine image skus.
     *
     * @param location the String value
     * @param publisherName the String value
     * @param offer the String value
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;VirtualMachineImageResource&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<List<VirtualMachineImageResource>> listSkus(String location, String publisherName, String offer) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets a list of virtual machine image skus.
     *
     * @param location the String value
     * @param publisherName the String value
     * @param offer the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listSkusAsync(String location, String publisherName, String offer, final ServiceCallback<List<VirtualMachineImageResource>> serviceCallback) throws IllegalArgumentException;

}