/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2016_08_01.implementation;

import com.microsoft.azure.management.appservice.v2016_08_01.ProcessInfo;
import com.microsoft.azure.arm.model.implementation.IndexableRefreshableWrapperImpl;
import rx.Observable;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import com.microsoft.azure.management.appservice.v2016_08_01.ProcessModuleInfo;
import org.joda.time.DateTime;
import com.microsoft.azure.management.appservice.v2016_08_01.ProcessThreadInfo;

class ProcessInfoImpl extends IndexableRefreshableWrapperImpl<ProcessInfo, ProcessInfoInner> implements ProcessInfo {
    private final AppServiceManager manager;
    private String resourceGroupName;
    private String name;
    private String processId;
    private String instanceId;

    ProcessInfoImpl(ProcessInfoInner inner,  AppServiceManager manager) {
        super(null, inner);
        this.manager = manager;
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.name = IdParsingUtils.getValueFromIdByName(inner.id(), "sites");
        this.processId = IdParsingUtils.getValueFromIdByName(inner.id(), "processes");
        this.instanceId = IdParsingUtils.getValueFromIdByName(inner.id(), "instances");
    }

    @Override
    public AppServiceManager manager() {
        return this.manager;
    }

    @Override
    protected Observable<ProcessInfoInner> getInnerAsync() {
        WebAppsInner client = this.manager().inner().webApps();
        return client.getInstanceProcessAsync(this.resourceGroupName, this.name, this.processId, this.instanceId);
    }



    @Override
    public List<String> children() {
        return this.inner().children();
    }

    @Override
    public String commandLine() {
        return this.inner().commandLine();
    }

    @Override
    public String description() {
        return this.inner().description();
    }

    @Override
    public Map<String, String> environmentVariables() {
        return this.inner().environmentVariables();
    }

    @Override
    public String fileName() {
        return this.inner().fileName();
    }

    @Override
    public Integer handleCount() {
        return this.inner().handleCount();
    }

    @Override
    public String href() {
        return this.inner().href();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public Double iisProfileTimeoutInSeconds() {
        return this.inner().iisProfileTimeoutInSeconds();
    }

    @Override
    public Boolean isIisProfileRunning() {
        return this.inner().isIisProfileRunning();
    }

    @Override
    public Boolean isProfileRunning() {
        return this.inner().isProfileRunning();
    }

    @Override
    public Boolean isScmSite() {
        return this.inner().isScmSite();
    }

    @Override
    public Boolean isWebJob() {
        return this.inner().isWebJob();
    }

    @Override
    public String kind() {
        return this.inner().kind();
    }

    @Override
    public String miniDump() {
        return this.inner().miniDump();
    }

    @Override
    public Integer moduleCount() {
        return this.inner().moduleCount();
    }

    @Override
    public List<ProcessModuleInfo> modules() {
        List<ProcessModuleInfo> lst = new ArrayList<ProcessModuleInfo>();
        if (this.inner().modules() != null) {
            for (ProcessModuleInfoInner inner : this.inner().modules()) {
                lst.add( new ProcessModuleInfoImpl(inner, manager()));
            }
        }
        return lst;
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public Long nonpagedSystemMemorySize64() {
        return this.inner().nonpagedSystemMemorySize64();
    }

    @Override
    public List<String> openFileHandles() {
        return this.inner().openFileHandles();
    }

    @Override
    public Long pagedMemorySize64() {
        return this.inner().pagedMemorySize64();
    }

    @Override
    public Long pagedSystemMemorySize64() {
        return this.inner().pagedSystemMemorySize64();
    }

    @Override
    public String parent() {
        return this.inner().parent();
    }

    @Override
    public Long peakPagedMemorySize64() {
        return this.inner().peakPagedMemorySize64();
    }

    @Override
    public Long peakVirtualMemorySize64() {
        return this.inner().peakVirtualMemorySize64();
    }

    @Override
    public Long peakWorkingSet64() {
        return this.inner().peakWorkingSet64();
    }

    @Override
    public Long privateMemorySize64() {
        return this.inner().privateMemorySize64();
    }

    @Override
    public String privilegedProcessorTime() {
        return this.inner().privilegedProcessorTime();
    }

    @Override
    public Integer processInfoId() {
        return this.inner().processInfoId();
    }

    @Override
    public String processInfoName() {
        return this.inner().processInfoName();
    }

    @Override
    public DateTime startTime() {
        return this.inner().startTime();
    }

    @Override
    public Integer threadCount() {
        return this.inner().threadCount();
    }

    @Override
    public List<ProcessThreadInfo> threads() {
        List<ProcessThreadInfo> lst = new ArrayList<ProcessThreadInfo>();
        if (this.inner().threads() != null) {
            for (ProcessThreadInfoInner inner : this.inner().threads()) {
                lst.add( new ProcessThreadInfoImpl(inner, manager()));
            }
        }
        return lst;
    }

    @Override
    public DateTime timeStamp() {
        return this.inner().timeStamp();
    }

    @Override
    public String totalProcessorTime() {
        return this.inner().totalProcessorTime();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public String userName() {
        return this.inner().userName();
    }

    @Override
    public String userProcessorTime() {
        return this.inner().userProcessorTime();
    }

    @Override
    public Long virtualMemorySize64() {
        return this.inner().virtualMemorySize64();
    }

    @Override
    public Long workingSet64() {
        return this.inner().workingSet64();
    }

}
