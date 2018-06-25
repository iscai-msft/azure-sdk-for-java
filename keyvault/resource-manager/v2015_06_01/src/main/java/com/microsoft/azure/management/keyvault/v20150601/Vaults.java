/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.keyvault.v2015_06_01;

import com.microsoft.azure.CloudException;
import com.microsoft.azure.ListOperationCallback;
import com.microsoft.azure.management.keyvault.v20150601.models.Vault;
import com.microsoft.azure.management.keyvault.v20150601.models.VaultCreateOrUpdateParameters;
import com.microsoft.azure.Page;
import com.microsoft.azure.PagedList;
import com.microsoft.azure.Resource;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import java.util.List;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Vaults.
 */
public interface Vaults {
    /**
     * Create or update a key vault in the specified subscription.
     *
     * @param resourceGroupName The name of the Resource Group to which the server belongs.
     * @param vaultName Name of the vault
     * @param parameters Parameters to create or update the vault
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Vault object if successful.
     */
    Vault createOrUpdate(String resourceGroupName, String vaultName, VaultCreateOrUpdateParameters parameters);

    /**
     * Create or update a key vault in the specified subscription.
     *
     * @param resourceGroupName The name of the Resource Group to which the server belongs.
     * @param vaultName Name of the vault
     * @param parameters Parameters to create or update the vault
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Vault> createOrUpdateAsync(String resourceGroupName, String vaultName, VaultCreateOrUpdateParameters parameters, final ServiceCallback<Vault> serviceCallback);

    /**
     * Create or update a key vault in the specified subscription.
     *
     * @param resourceGroupName The name of the Resource Group to which the server belongs.
     * @param vaultName Name of the vault
     * @param parameters Parameters to create or update the vault
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Vault object
     */
    Observable<Vault> createOrUpdateAsync(String resourceGroupName, String vaultName, VaultCreateOrUpdateParameters parameters);

    /**
     * Create or update a key vault in the specified subscription.
     *
     * @param resourceGroupName The name of the Resource Group to which the server belongs.
     * @param vaultName Name of the vault
     * @param parameters Parameters to create or update the vault
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Vault object
     */
    Observable<ServiceResponse<Vault>> createOrUpdateWithServiceResponseAsync(String resourceGroupName, String vaultName, VaultCreateOrUpdateParameters parameters);

    /**
     * Deletes the specified Azure key vault.
     *
     * @param resourceGroupName The name of the Resource Group to which the vault belongs.
     * @param vaultName The name of the vault to delete
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void delete(String resourceGroupName, String vaultName);

    /**
     * Deletes the specified Azure key vault.
     *
     * @param resourceGroupName The name of the Resource Group to which the vault belongs.
     * @param vaultName The name of the vault to delete
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> deleteAsync(String resourceGroupName, String vaultName, final ServiceCallback<Void> serviceCallback);

    /**
     * Deletes the specified Azure key vault.
     *
     * @param resourceGroupName The name of the Resource Group to which the vault belongs.
     * @param vaultName The name of the vault to delete
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> deleteAsync(String resourceGroupName, String vaultName);

    /**
     * Deletes the specified Azure key vault.
     *
     * @param resourceGroupName The name of the Resource Group to which the vault belongs.
     * @param vaultName The name of the vault to delete
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> deleteWithServiceResponseAsync(String resourceGroupName, String vaultName);

    /**
     * Gets the specified Azure key vault.
     *
     * @param resourceGroupName The name of the Resource Group to which the vault belongs.
     * @param vaultName The name of the vault.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Vault object if successful.
     */
    Vault get(String resourceGroupName, String vaultName);

    /**
     * Gets the specified Azure key vault.
     *
     * @param resourceGroupName The name of the Resource Group to which the vault belongs.
     * @param vaultName The name of the vault.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Vault> getAsync(String resourceGroupName, String vaultName, final ServiceCallback<Vault> serviceCallback);

    /**
     * Gets the specified Azure key vault.
     *
     * @param resourceGroupName The name of the Resource Group to which the vault belongs.
     * @param vaultName The name of the vault.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Vault object
     */
    Observable<Vault> getAsync(String resourceGroupName, String vaultName);

    /**
     * Gets the specified Azure key vault.
     *
     * @param resourceGroupName The name of the Resource Group to which the vault belongs.
     * @param vaultName The name of the vault.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Vault object
     */
    Observable<ServiceResponse<Vault>> getWithServiceResponseAsync(String resourceGroupName, String vaultName);

    /**
     * The List operation gets information about the vaults associated with the subscription and within the specified resource group.
     *
     * @param resourceGroupName The name of the Resource Group to which the vault belongs.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;Vault&gt; object if successful.
     */
    PagedList<Vault> listByResourceGroup(final String resourceGroupName);

    /**
     * The List operation gets information about the vaults associated with the subscription and within the specified resource group.
     *
     * @param resourceGroupName The name of the Resource Group to which the vault belongs.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<List<Vault>> listByResourceGroupAsync(final String resourceGroupName, final ListOperationCallback<Vault> serviceCallback);

    /**
     * The List operation gets information about the vaults associated with the subscription and within the specified resource group.
     *
     * @param resourceGroupName The name of the Resource Group to which the vault belongs.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;Vault&gt; object
     */
    Observable<Page<Vault>> listByResourceGroupAsync(final String resourceGroupName);

    /**
     * The List operation gets information about the vaults associated with the subscription and within the specified resource group.
     *
     * @param resourceGroupName The name of the Resource Group to which the vault belongs.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;Vault&gt; object
     */
    Observable<ServiceResponse<Page<Vault>>> listByResourceGroupWithServiceResponseAsync(final String resourceGroupName);
    /**
     * The List operation gets information about the vaults associated with the subscription and within the specified resource group.
     *
     * @param resourceGroupName The name of the Resource Group to which the vault belongs.
     * @param top Maximum number of results to return.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;Vault&gt; object if successful.
     */
    PagedList<Vault> listByResourceGroup(final String resourceGroupName, final Integer top);

    /**
     * The List operation gets information about the vaults associated with the subscription and within the specified resource group.
     *
     * @param resourceGroupName The name of the Resource Group to which the vault belongs.
     * @param top Maximum number of results to return.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<List<Vault>> listByResourceGroupAsync(final String resourceGroupName, final Integer top, final ListOperationCallback<Vault> serviceCallback);

    /**
     * The List operation gets information about the vaults associated with the subscription and within the specified resource group.
     *
     * @param resourceGroupName The name of the Resource Group to which the vault belongs.
     * @param top Maximum number of results to return.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;Vault&gt; object
     */
    Observable<Page<Vault>> listByResourceGroupAsync(final String resourceGroupName, final Integer top);

    /**
     * The List operation gets information about the vaults associated with the subscription and within the specified resource group.
     *
     * @param resourceGroupName The name of the Resource Group to which the vault belongs.
     * @param top Maximum number of results to return.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;Vault&gt; object
     */
    Observable<ServiceResponse<Page<Vault>>> listByResourceGroupWithServiceResponseAsync(final String resourceGroupName, final Integer top);

    /**
     * The List operation gets information about the vaults associated with the subscription.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;Resource&gt; object if successful.
     */
    PagedList<Resource> list();

    /**
     * The List operation gets information about the vaults associated with the subscription.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<List<Resource>> listAsync(final ListOperationCallback<Resource> serviceCallback);

    /**
     * The List operation gets information about the vaults associated with the subscription.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;Resource&gt; object
     */
    Observable<Page<Resource>> listAsync();

    /**
     * The List operation gets information about the vaults associated with the subscription.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;Resource&gt; object
     */
    Observable<ServiceResponse<Page<Resource>>> listWithServiceResponseAsync();
    /**
     * The List operation gets information about the vaults associated with the subscription.
     *
     * @param top Maximum number of results to return.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;Resource&gt; object if successful.
     */
    PagedList<Resource> list(final Integer top);

    /**
     * The List operation gets information about the vaults associated with the subscription.
     *
     * @param top Maximum number of results to return.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<List<Resource>> listAsync(final Integer top, final ListOperationCallback<Resource> serviceCallback);

    /**
     * The List operation gets information about the vaults associated with the subscription.
     *
     * @param top Maximum number of results to return.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;Resource&gt; object
     */
    Observable<Page<Resource>> listAsync(final Integer top);

    /**
     * The List operation gets information about the vaults associated with the subscription.
     *
     * @param top Maximum number of results to return.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;Resource&gt; object
     */
    Observable<ServiceResponse<Page<Resource>>> listWithServiceResponseAsync(final Integer top);

    /**
     * The List operation gets information about the vaults associated with the subscription and within the specified resource group.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;Vault&gt; object if successful.
     */
    PagedList<Vault> listByResourceGroupNext(final String nextPageLink);

    /**
     * The List operation gets information about the vaults associated with the subscription and within the specified resource group.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceFuture the ServiceFuture object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<List<Vault>> listByResourceGroupNextAsync(final String nextPageLink, final ServiceFuture<List<Vault>> serviceFuture, final ListOperationCallback<Vault> serviceCallback);

    /**
     * The List operation gets information about the vaults associated with the subscription and within the specified resource group.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;Vault&gt; object
     */
    Observable<Page<Vault>> listByResourceGroupNextAsync(final String nextPageLink);

    /**
     * The List operation gets information about the vaults associated with the subscription and within the specified resource group.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;Vault&gt; object
     */
    Observable<ServiceResponse<Page<Vault>>> listByResourceGroupNextWithServiceResponseAsync(final String nextPageLink);

    /**
     * The List operation gets information about the vaults associated with the subscription.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;Resource&gt; object if successful.
     */
    PagedList<Resource> listNext(final String nextPageLink);

    /**
     * The List operation gets information about the vaults associated with the subscription.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceFuture the ServiceFuture object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<List<Resource>> listNextAsync(final String nextPageLink, final ServiceFuture<List<Resource>> serviceFuture, final ListOperationCallback<Resource> serviceCallback);

    /**
     * The List operation gets information about the vaults associated with the subscription.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;Resource&gt; object
     */
    Observable<Page<Resource>> listNextAsync(final String nextPageLink);

    /**
     * The List operation gets information about the vaults associated with the subscription.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;Resource&gt; object
     */
    Observable<ServiceResponse<Page<Resource>>> listNextWithServiceResponseAsync(final String nextPageLink);

}