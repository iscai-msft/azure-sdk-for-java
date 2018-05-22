/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic.v2016_06_01.implementation;

import com.microsoft.azure.arm.resources.models.implementation.GroupableResourceCoreImpl;
import com.microsoft.azure.management.logic.v2016_06_01.Workflow;
import rx.Observable;
import com.microsoft.azure.management.logic.v2016_06_01.WorkflowProvisioningState;
import org.joda.time.DateTime;
import com.microsoft.azure.management.logic.v2016_06_01.WorkflowState;
import com.microsoft.azure.management.logic.v2016_06_01.Sku;
import java.util.Map;
import com.microsoft.azure.management.logic.v2016_06_01.WorkflowParameter;

class WorkflowImpl extends GroupableResourceCoreImpl<Workflow, WorkflowInner, WorkflowImpl, LogicManager> implements Workflow, Workflow.Definition, Workflow.Update {
    WorkflowImpl(String name, WorkflowInner inner, LogicManager manager) {
        super(name, inner, manager);
    }

    @Override
    public Observable<Workflow> createResourceAsync() {
        WorkflowsInner client = this.manager().inner().workflows();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<Workflow> updateResourceAsync() {
        WorkflowsInner client = this.manager().inner().workflows();
        return client.updateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<WorkflowInner> getInnerAsync() {
        WorkflowsInner client = this.manager().inner().workflows();
        return client.getByResourceGroupAsync(this.resourceGroupName(), this.name());
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public String accessEndpoint() {
        return this.inner().accessEndpoint();
    }

    @Override
    public DateTime changedTime() {
        return this.inner().changedTime();
    }

    @Override
    public DateTime createdTime() {
        return this.inner().createdTime();
    }

    @Override
    public Object definition() {
        return this.inner().definition();
    }

    @Override
    public ResourceReferenceInner integrationAccount() {
        return this.inner().integrationAccount();
    }

    @Override
    public Map<String, WorkflowParameter> parameters() {
        return this.inner().parameters();
    }

    @Override
    public WorkflowProvisioningState provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public Sku sku() {
        return this.inner().sku();
    }

    @Override
    public WorkflowState state() {
        return this.inner().state();
    }

    @Override
    public String version() {
        return this.inner().version();
    }

    @Override
    public WorkflowImpl withDefinition(Object definition) {
        this.inner().withDefinition(definition);
        return this;
    }

    @Override
    public WorkflowImpl withIntegrationAccount(ResourceReferenceInner integrationAccount) {
        this.inner().withIntegrationAccount(integrationAccount);
        return this;
    }

    @Override
    public WorkflowImpl withParameters(Map<String, WorkflowParameter> parameters) {
        this.inner().withParameters(parameters);
        return this;
    }

    @Override
    public WorkflowImpl withSku(Sku sku) {
        this.inner().withSku(sku);
        return this;
    }

    @Override
    public WorkflowImpl withState(WorkflowState state) {
        this.inner().withState(state);
        return this;
    }

}
