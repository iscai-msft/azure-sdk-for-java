/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.automation.v2018_06_30.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.automation.v2018_06_30.RunbookDrafts;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.management.automation.v2018_06_30.RunbookDraft;
import com.microsoft.azure.management.automation.v2018_06_30.RunbookDraftUndoEditResult;

import java.io.InputStream;

class RunbookDraftsImpl extends WrapperImpl<RunbookDraftsInner> implements RunbookDrafts {
    private final AutomationManager manager;

    RunbookDraftsImpl(AutomationManager manager) {
        super(manager.inner().runbookDrafts());
        this.manager = manager;
    }

    public AutomationManager manager() {
        return this.manager;
    }

    @Override
    public Observable<InputStream> getContentAsync(String resourceGroupName, String automationAccountName, String runbookName) {
        RunbookDraftsInner client = this.inner();
        return client.getContentAsync(resourceGroupName, automationAccountName, runbookName)
    ;}

    @Override
    public Observable<InputStream> replaceContentAsync(String resourceGroupName, String automationAccountName, String runbookName, byte[] runbookContent) {
        RunbookDraftsInner client = this.inner();
        return client.replaceContentAsync(resourceGroupName, automationAccountName, runbookName, runbookContent)
    ;}

    @Override
    public Observable<RunbookDraft> getAsync(String resourceGroupName, String automationAccountName, String runbookName) {
        RunbookDraftsInner client = this.inner();
        return client.getAsync(resourceGroupName, automationAccountName, runbookName)
        .map(new Func1<RunbookDraftInner, RunbookDraft>() {
            @Override
            public RunbookDraft call(RunbookDraftInner inner) {
                return new RunbookDraftImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<RunbookDraftUndoEditResult> undoEditAsync(String resourceGroupName, String automationAccountName, String runbookName) {
        RunbookDraftsInner client = this.inner();
        return client.undoEditAsync(resourceGroupName, automationAccountName, runbookName)
        .map(new Func1<RunbookDraftUndoEditResultInner, RunbookDraftUndoEditResult>() {
            @Override
            public RunbookDraftUndoEditResult call(RunbookDraftUndoEditResultInner inner) {
                return new RunbookDraftUndoEditResultImpl(inner, manager());
            }
        });
    }

}
