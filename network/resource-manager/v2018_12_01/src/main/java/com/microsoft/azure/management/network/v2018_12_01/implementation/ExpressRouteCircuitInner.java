/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_12_01.implementation;

import com.microsoft.azure.management.network.v2018_12_01.ExpressRouteCircuitSku;
import com.microsoft.azure.management.network.v2018_12_01.ServiceProviderProvisioningState;
import java.util.List;
import com.microsoft.azure.management.network.v2018_12_01.ExpressRouteCircuitServiceProviderProperties;
import com.microsoft.azure.SubResource;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.rest.SkipParentValidation;
import com.microsoft.azure.Resource;

/**
 * ExpressRouteCircuit resource.
 */
@JsonFlatten
@SkipParentValidation
public class ExpressRouteCircuitInner extends Resource {
    /**
     * The SKU.
     */
    @JsonProperty(value = "sku")
    private ExpressRouteCircuitSku sku;

    /**
     * Allow classic operations.
     */
    @JsonProperty(value = "properties.allowClassicOperations")
    private Boolean allowClassicOperations;

    /**
     * The CircuitProvisioningState state of the resource.
     */
    @JsonProperty(value = "properties.circuitProvisioningState")
    private String circuitProvisioningState;

    /**
     * The ServiceProviderProvisioningState state of the resource. Possible
     * values are 'NotProvisioned', 'Provisioning', 'Provisioned', and
     * 'Deprovisioning'. Possible values include: 'NotProvisioned',
     * 'Provisioning', 'Provisioned', 'Deprovisioning'.
     */
    @JsonProperty(value = "properties.serviceProviderProvisioningState")
    private ServiceProviderProvisioningState serviceProviderProvisioningState;

    /**
     * The list of authorizations.
     */
    @JsonProperty(value = "properties.authorizations")
    private List<ExpressRouteCircuitAuthorizationInner> authorizations;

    /**
     * The list of peerings.
     */
    @JsonProperty(value = "properties.peerings")
    private List<ExpressRouteCircuitPeeringInner> peerings;

    /**
     * The ServiceKey.
     */
    @JsonProperty(value = "properties.serviceKey")
    private String serviceKey;

    /**
     * The ServiceProviderNotes.
     */
    @JsonProperty(value = "properties.serviceProviderNotes")
    private String serviceProviderNotes;

    /**
     * The ServiceProviderProperties.
     */
    @JsonProperty(value = "properties.serviceProviderProperties")
    private ExpressRouteCircuitServiceProviderProperties serviceProviderProperties;

    /**
     * The reference to the ExpressRoutePort resource when the circuit is
     * provisioned on an ExpressRoutePort resource.
     */
    @JsonProperty(value = "properties.expressRoutePort")
    private SubResource expressRoutePort;

    /**
     * The bandwidth of the circuit when the circuit is provisioned on an
     * ExpressRoutePort resource.
     */
    @JsonProperty(value = "properties.bandwidthInGbps")
    private Double bandwidthInGbps;

    /**
     * The identifier of the circuit traffic. Outer tag for QinQ encapsulation.
     */
    @JsonProperty(value = "properties.stag", access = JsonProperty.Access.WRITE_ONLY)
    private Integer stag;

    /**
     * Gets the provisioning state of the public IP resource. Possible values
     * are: 'Updating', 'Deleting', and 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState")
    private String provisioningState;

    /**
     * The GatewayManager Etag.
     */
    @JsonProperty(value = "properties.gatewayManagerEtag")
    private String gatewayManagerEtag;

    /**
     * Flag to enable Global Reach on the circuit.
     */
    @JsonProperty(value = "properties.allowGlobalReach")
    private Boolean allowGlobalReach;

    /**
     * Flag denoting Global reach status.
     */
    @JsonProperty(value = "properties.globalReachEnabled")
    private Boolean globalReachEnabled;

    /**
     * Gets a unique read-only string that changes whenever the resource is
     * updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /**
     * Resource ID.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get the SKU.
     *
     * @return the sku value
     */
    public ExpressRouteCircuitSku sku() {
        return this.sku;
    }

    /**
     * Set the SKU.
     *
     * @param sku the sku value to set
     * @return the ExpressRouteCircuitInner object itself.
     */
    public ExpressRouteCircuitInner withSku(ExpressRouteCircuitSku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get allow classic operations.
     *
     * @return the allowClassicOperations value
     */
    public Boolean allowClassicOperations() {
        return this.allowClassicOperations;
    }

    /**
     * Set allow classic operations.
     *
     * @param allowClassicOperations the allowClassicOperations value to set
     * @return the ExpressRouteCircuitInner object itself.
     */
    public ExpressRouteCircuitInner withAllowClassicOperations(Boolean allowClassicOperations) {
        this.allowClassicOperations = allowClassicOperations;
        return this;
    }

    /**
     * Get the CircuitProvisioningState state of the resource.
     *
     * @return the circuitProvisioningState value
     */
    public String circuitProvisioningState() {
        return this.circuitProvisioningState;
    }

    /**
     * Set the CircuitProvisioningState state of the resource.
     *
     * @param circuitProvisioningState the circuitProvisioningState value to set
     * @return the ExpressRouteCircuitInner object itself.
     */
    public ExpressRouteCircuitInner withCircuitProvisioningState(String circuitProvisioningState) {
        this.circuitProvisioningState = circuitProvisioningState;
        return this;
    }

    /**
     * Get the ServiceProviderProvisioningState state of the resource. Possible values are 'NotProvisioned', 'Provisioning', 'Provisioned', and 'Deprovisioning'. Possible values include: 'NotProvisioned', 'Provisioning', 'Provisioned', 'Deprovisioning'.
     *
     * @return the serviceProviderProvisioningState value
     */
    public ServiceProviderProvisioningState serviceProviderProvisioningState() {
        return this.serviceProviderProvisioningState;
    }

    /**
     * Set the ServiceProviderProvisioningState state of the resource. Possible values are 'NotProvisioned', 'Provisioning', 'Provisioned', and 'Deprovisioning'. Possible values include: 'NotProvisioned', 'Provisioning', 'Provisioned', 'Deprovisioning'.
     *
     * @param serviceProviderProvisioningState the serviceProviderProvisioningState value to set
     * @return the ExpressRouteCircuitInner object itself.
     */
    public ExpressRouteCircuitInner withServiceProviderProvisioningState(ServiceProviderProvisioningState serviceProviderProvisioningState) {
        this.serviceProviderProvisioningState = serviceProviderProvisioningState;
        return this;
    }

    /**
     * Get the list of authorizations.
     *
     * @return the authorizations value
     */
    public List<ExpressRouteCircuitAuthorizationInner> authorizations() {
        return this.authorizations;
    }

    /**
     * Set the list of authorizations.
     *
     * @param authorizations the authorizations value to set
     * @return the ExpressRouteCircuitInner object itself.
     */
    public ExpressRouteCircuitInner withAuthorizations(List<ExpressRouteCircuitAuthorizationInner> authorizations) {
        this.authorizations = authorizations;
        return this;
    }

    /**
     * Get the list of peerings.
     *
     * @return the peerings value
     */
    public List<ExpressRouteCircuitPeeringInner> peerings() {
        return this.peerings;
    }

    /**
     * Set the list of peerings.
     *
     * @param peerings the peerings value to set
     * @return the ExpressRouteCircuitInner object itself.
     */
    public ExpressRouteCircuitInner withPeerings(List<ExpressRouteCircuitPeeringInner> peerings) {
        this.peerings = peerings;
        return this;
    }

    /**
     * Get the ServiceKey.
     *
     * @return the serviceKey value
     */
    public String serviceKey() {
        return this.serviceKey;
    }

    /**
     * Set the ServiceKey.
     *
     * @param serviceKey the serviceKey value to set
     * @return the ExpressRouteCircuitInner object itself.
     */
    public ExpressRouteCircuitInner withServiceKey(String serviceKey) {
        this.serviceKey = serviceKey;
        return this;
    }

    /**
     * Get the ServiceProviderNotes.
     *
     * @return the serviceProviderNotes value
     */
    public String serviceProviderNotes() {
        return this.serviceProviderNotes;
    }

    /**
     * Set the ServiceProviderNotes.
     *
     * @param serviceProviderNotes the serviceProviderNotes value to set
     * @return the ExpressRouteCircuitInner object itself.
     */
    public ExpressRouteCircuitInner withServiceProviderNotes(String serviceProviderNotes) {
        this.serviceProviderNotes = serviceProviderNotes;
        return this;
    }

    /**
     * Get the ServiceProviderProperties.
     *
     * @return the serviceProviderProperties value
     */
    public ExpressRouteCircuitServiceProviderProperties serviceProviderProperties() {
        return this.serviceProviderProperties;
    }

    /**
     * Set the ServiceProviderProperties.
     *
     * @param serviceProviderProperties the serviceProviderProperties value to set
     * @return the ExpressRouteCircuitInner object itself.
     */
    public ExpressRouteCircuitInner withServiceProviderProperties(ExpressRouteCircuitServiceProviderProperties serviceProviderProperties) {
        this.serviceProviderProperties = serviceProviderProperties;
        return this;
    }

    /**
     * Get the reference to the ExpressRoutePort resource when the circuit is provisioned on an ExpressRoutePort resource.
     *
     * @return the expressRoutePort value
     */
    public SubResource expressRoutePort() {
        return this.expressRoutePort;
    }

    /**
     * Set the reference to the ExpressRoutePort resource when the circuit is provisioned on an ExpressRoutePort resource.
     *
     * @param expressRoutePort the expressRoutePort value to set
     * @return the ExpressRouteCircuitInner object itself.
     */
    public ExpressRouteCircuitInner withExpressRoutePort(SubResource expressRoutePort) {
        this.expressRoutePort = expressRoutePort;
        return this;
    }

    /**
     * Get the bandwidth of the circuit when the circuit is provisioned on an ExpressRoutePort resource.
     *
     * @return the bandwidthInGbps value
     */
    public Double bandwidthInGbps() {
        return this.bandwidthInGbps;
    }

    /**
     * Set the bandwidth of the circuit when the circuit is provisioned on an ExpressRoutePort resource.
     *
     * @param bandwidthInGbps the bandwidthInGbps value to set
     * @return the ExpressRouteCircuitInner object itself.
     */
    public ExpressRouteCircuitInner withBandwidthInGbps(Double bandwidthInGbps) {
        this.bandwidthInGbps = bandwidthInGbps;
        return this;
    }

    /**
     * Get the identifier of the circuit traffic. Outer tag for QinQ encapsulation.
     *
     * @return the stag value
     */
    public Integer stag() {
        return this.stag;
    }

    /**
     * Get gets the provisioning state of the public IP resource. Possible values are: 'Updating', 'Deleting', and 'Failed'.
     *
     * @return the provisioningState value
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set gets the provisioning state of the public IP resource. Possible values are: 'Updating', 'Deleting', and 'Failed'.
     *
     * @param provisioningState the provisioningState value to set
     * @return the ExpressRouteCircuitInner object itself.
     */
    public ExpressRouteCircuitInner withProvisioningState(String provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get the GatewayManager Etag.
     *
     * @return the gatewayManagerEtag value
     */
    public String gatewayManagerEtag() {
        return this.gatewayManagerEtag;
    }

    /**
     * Set the GatewayManager Etag.
     *
     * @param gatewayManagerEtag the gatewayManagerEtag value to set
     * @return the ExpressRouteCircuitInner object itself.
     */
    public ExpressRouteCircuitInner withGatewayManagerEtag(String gatewayManagerEtag) {
        this.gatewayManagerEtag = gatewayManagerEtag;
        return this;
    }

    /**
     * Get flag to enable Global Reach on the circuit.
     *
     * @return the allowGlobalReach value
     */
    public Boolean allowGlobalReach() {
        return this.allowGlobalReach;
    }

    /**
     * Set flag to enable Global Reach on the circuit.
     *
     * @param allowGlobalReach the allowGlobalReach value to set
     * @return the ExpressRouteCircuitInner object itself.
     */
    public ExpressRouteCircuitInner withAllowGlobalReach(Boolean allowGlobalReach) {
        this.allowGlobalReach = allowGlobalReach;
        return this;
    }

    /**
     * Get flag denoting Global reach status.
     *
     * @return the globalReachEnabled value
     */
    public Boolean globalReachEnabled() {
        return this.globalReachEnabled;
    }

    /**
     * Set flag denoting Global reach status.
     *
     * @param globalReachEnabled the globalReachEnabled value to set
     * @return the ExpressRouteCircuitInner object itself.
     */
    public ExpressRouteCircuitInner withGlobalReachEnabled(Boolean globalReachEnabled) {
        this.globalReachEnabled = globalReachEnabled;
        return this;
    }

    /**
     * Get gets a unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get resource ID.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set resource ID.
     *
     * @param id the id value to set
     * @return the ExpressRouteCircuitInner object itself.
     */
    public ExpressRouteCircuitInner withId(String id) {
        this.id = id;
        return this;
    }

}
