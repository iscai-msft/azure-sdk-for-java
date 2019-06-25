/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.azurestack.v2017_06_01.implementation;

import com.microsoft.azure.arm.resources.models.implementation.GroupableResourceCoreImpl;
import com.microsoft.azure.management.azurestack.v2017_06_01.Location;
import com.microsoft.azure.management.azurestack.v2017_06_01.Registration;
import rx.Observable;
import com.microsoft.azure.management.azurestack.v2017_06_01.RegistrationParameter;
import rx.functions.Func1;

class RegistrationImpl extends GroupableResourceCoreImpl<Registration, RegistrationInner, RegistrationImpl, AzureStackManager> implements Registration, Registration.Definition, Registration.Update {
    private RegistrationParameter createOrUpdateParameter;
    RegistrationImpl(String name, RegistrationInner inner, AzureStackManager manager) {
        super(name, inner, manager);
        this.createOrUpdateParameter = new RegistrationParameter();
    }

    @Override
    public Observable<Registration> createResourceAsync() {
        RegistrationsInner client = this.manager().inner().registrations();
        this.createOrUpdateParameter.withLocation(Location.fromString(inner().location()));
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.createOrUpdateParameter)
            .map(new Func1<RegistrationInner, RegistrationInner>() {
               @Override
               public RegistrationInner call(RegistrationInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<Registration> updateResourceAsync() {
        RegistrationsInner client = this.manager().inner().registrations();
        return client.updateAsync(this.resourceGroupName(), this.name(), this.createOrUpdateParameter)
            .map(new Func1<RegistrationInner, RegistrationInner>() {
               @Override
               public RegistrationInner call(RegistrationInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<RegistrationInner> getInnerAsync() {
        RegistrationsInner client = this.manager().inner().registrations();
        return client.getByResourceGroupAsync(this.resourceGroupName(), this.name());
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.createOrUpdateParameter = new RegistrationParameter();
    }

    @Override
    public String billingModel() {
        return this.inner().billingModel();
    }

    @Override
    public String cloudId() {
        return this.inner().cloudId();
    }

    @Override
    public String etag() {
        return this.inner().etag();
    }

    @Override
    public String objectId() {
        return this.inner().objectId();
    }

    @Override
    public RegistrationImpl withRegistrationToken(String registrationToken) {
        this.createOrUpdateParameter.withRegistrationToken(registrationToken);
        return this;
    }

}
