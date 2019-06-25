/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.postgresql.v2017_12_01.implementation;

import com.microsoft.azure.management.postgresql.v2017_12_01.ServerServer;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import rx.Observable;
import org.joda.time.DateTime;
import com.microsoft.azure.management.postgresql.v2017_12_01.Sku;
import com.microsoft.azure.management.postgresql.v2017_12_01.SslEnforcementEnum;
import com.microsoft.azure.management.postgresql.v2017_12_01.StorageProfile;
import java.util.Map;
import com.microsoft.azure.management.postgresql.v2017_12_01.ServerState;
import com.microsoft.azure.management.postgresql.v2017_12_01.ServerVersion;

class ServerServerImpl extends WrapperImpl<ServerInner> implements ServerServer {
    private final PostgreSQLManager manager;

    ServerServerImpl(ServerInner inner,  PostgreSQLManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public PostgreSQLManager manager() {
        return this.manager;
    }



    @Override
    public String administratorLogin() {
        return this.inner().administratorLogin();
    }

    @Override
    public DateTime earliestRestoreDate() {
        return this.inner().earliestRestoreDate();
    }

    @Override
    public String fullyQualifiedDomainName() {
        return this.inner().fullyQualifiedDomainName();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String location() {
        return this.inner().location();
    }

    @Override
    public String masterServerId() {
        return this.inner().masterServerId();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public Integer replicaCapacity() {
        return this.inner().replicaCapacity();
    }

    @Override
    public String replicationRole() {
        return this.inner().replicationRole();
    }

    @Override
    public Sku sku() {
        return this.inner().sku();
    }

    @Override
    public SslEnforcementEnum sslEnforcement() {
        return this.inner().sslEnforcement();
    }

    @Override
    public StorageProfile storageProfile() {
        return this.inner().storageProfile();
    }

    @Override
    public Map<String, String> tags() {
        return this.inner().getTags();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public ServerState userVisibleState() {
        return this.inner().userVisibleState();
    }

    @Override
    public ServerVersion version() {
        return this.inner().version();
    }

}
