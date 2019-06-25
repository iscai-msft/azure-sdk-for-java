/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2018_06_01_preview.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.AzureServiceFuture;
import com.microsoft.azure.ListOperationCallback;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.ErrorResponseException;
import com.microsoft.azure.Page;
import com.microsoft.azure.PagedList;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import java.util.List;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.Url;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Regions.
 */
public class RegionsInner {
    /** The Retrofit service to perform REST calls. */
    private RegionsService service;
    /** The service client containing this operation class. */
    private ApiManagementClientImpl client;

    /**
     * Initializes an instance of RegionsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public RegionsInner(Retrofit retrofit, ApiManagementClientImpl client) {
        this.service = retrofit.create(RegionsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for Regions to be
     * used by Retrofit to perform actually REST calls.
     */
    interface RegionsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.apimanagement.v2018_06_01_preview.Regions listByService" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ApiManagement/service/{serviceName}/regions")
        Observable<Response<ResponseBody>> listByService(@Path("resourceGroupName") String resourceGroupName, @Path("serviceName") String serviceName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.apimanagement.v2018_06_01_preview.Regions listByServiceNext" })
        @GET
        Observable<Response<ResponseBody>> listByServiceNext(@Url String nextUrl, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Lists all azure regions in which the service exists.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;RegionContractInner&gt; object if successful.
     */
    public PagedList<RegionContractInner> listByService(final String resourceGroupName, final String serviceName) {
        ServiceResponse<Page<RegionContractInner>> response = listByServiceSinglePageAsync(resourceGroupName, serviceName).toBlocking().single();
        return new PagedList<RegionContractInner>(response.body()) {
            @Override
            public Page<RegionContractInner> nextPage(String nextPageLink) {
                return listByServiceNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Lists all azure regions in which the service exists.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<RegionContractInner>> listByServiceAsync(final String resourceGroupName, final String serviceName, final ListOperationCallback<RegionContractInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listByServiceSinglePageAsync(resourceGroupName, serviceName),
            new Func1<String, Observable<ServiceResponse<Page<RegionContractInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<RegionContractInner>>> call(String nextPageLink) {
                    return listByServiceNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Lists all azure regions in which the service exists.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;RegionContractInner&gt; object
     */
    public Observable<Page<RegionContractInner>> listByServiceAsync(final String resourceGroupName, final String serviceName) {
        return listByServiceWithServiceResponseAsync(resourceGroupName, serviceName)
            .map(new Func1<ServiceResponse<Page<RegionContractInner>>, Page<RegionContractInner>>() {
                @Override
                public Page<RegionContractInner> call(ServiceResponse<Page<RegionContractInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Lists all azure regions in which the service exists.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;RegionContractInner&gt; object
     */
    public Observable<ServiceResponse<Page<RegionContractInner>>> listByServiceWithServiceResponseAsync(final String resourceGroupName, final String serviceName) {
        return listByServiceSinglePageAsync(resourceGroupName, serviceName)
            .concatMap(new Func1<ServiceResponse<Page<RegionContractInner>>, Observable<ServiceResponse<Page<RegionContractInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<RegionContractInner>>> call(ServiceResponse<Page<RegionContractInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listByServiceNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Lists all azure regions in which the service exists.
     *
    ServiceResponse<PageImpl<RegionContractInner>> * @param resourceGroupName The name of the resource group.
    ServiceResponse<PageImpl<RegionContractInner>> * @param serviceName The name of the API Management service.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;RegionContractInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<RegionContractInner>>> listByServiceSinglePageAsync(final String resourceGroupName, final String serviceName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (serviceName == null) {
            throw new IllegalArgumentException("Parameter serviceName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        final String apiVersion = "2018-06-01-preview";
        return service.listByService(resourceGroupName, serviceName, this.client.subscriptionId(), apiVersion, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<RegionContractInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<RegionContractInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<RegionContractInner>> result = listByServiceDelegate(response);
                        return Observable.just(new ServiceResponse<Page<RegionContractInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<RegionContractInner>> listByServiceDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<RegionContractInner>, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<RegionContractInner>>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Lists all azure regions in which the service exists.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;RegionContractInner&gt; object if successful.
     */
    public PagedList<RegionContractInner> listByServiceNext(final String nextPageLink) {
        ServiceResponse<Page<RegionContractInner>> response = listByServiceNextSinglePageAsync(nextPageLink).toBlocking().single();
        return new PagedList<RegionContractInner>(response.body()) {
            @Override
            public Page<RegionContractInner> nextPage(String nextPageLink) {
                return listByServiceNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Lists all azure regions in which the service exists.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceFuture the ServiceFuture object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<RegionContractInner>> listByServiceNextAsync(final String nextPageLink, final ServiceFuture<List<RegionContractInner>> serviceFuture, final ListOperationCallback<RegionContractInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listByServiceNextSinglePageAsync(nextPageLink),
            new Func1<String, Observable<ServiceResponse<Page<RegionContractInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<RegionContractInner>>> call(String nextPageLink) {
                    return listByServiceNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Lists all azure regions in which the service exists.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;RegionContractInner&gt; object
     */
    public Observable<Page<RegionContractInner>> listByServiceNextAsync(final String nextPageLink) {
        return listByServiceNextWithServiceResponseAsync(nextPageLink)
            .map(new Func1<ServiceResponse<Page<RegionContractInner>>, Page<RegionContractInner>>() {
                @Override
                public Page<RegionContractInner> call(ServiceResponse<Page<RegionContractInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Lists all azure regions in which the service exists.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;RegionContractInner&gt; object
     */
    public Observable<ServiceResponse<Page<RegionContractInner>>> listByServiceNextWithServiceResponseAsync(final String nextPageLink) {
        return listByServiceNextSinglePageAsync(nextPageLink)
            .concatMap(new Func1<ServiceResponse<Page<RegionContractInner>>, Observable<ServiceResponse<Page<RegionContractInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<RegionContractInner>>> call(ServiceResponse<Page<RegionContractInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listByServiceNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Lists all azure regions in which the service exists.
     *
    ServiceResponse<PageImpl<RegionContractInner>> * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;RegionContractInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<RegionContractInner>>> listByServiceNextSinglePageAsync(final String nextPageLink) {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        String nextUrl = String.format("%s", nextPageLink);
        return service.listByServiceNext(nextUrl, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<RegionContractInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<RegionContractInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<RegionContractInner>> result = listByServiceNextDelegate(response);
                        return Observable.just(new ServiceResponse<Page<RegionContractInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<RegionContractInner>> listByServiceNextDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<RegionContractInner>, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<RegionContractInner>>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

}
