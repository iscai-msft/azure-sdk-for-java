/*
 * The MIT License (MIT)
 * Copyright (c) 2018 Microsoft Corporation
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.microsoft.azure.cosmosdb.internal;

import com.microsoft.azure.cosmosdb.Resource;
import com.microsoft.azure.cosmosdb.rx.internal.RxDocumentServiceRequest;
import org.apache.commons.lang3.StringUtils;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class PathsHelperTest {

    private static final String DATABASE_ID = "IXYFAA==";
    private static final String DATABASE_COLLECTION_ID = "IXYFAOHEBPM=";
    private static final String DOCUMENT_ID = "IXYFAOHEBPMBAAAAAAAAAA==";
    private static final String ATTACHMENT_ID = "IXYFAOHEBPMBAAAAAAAAABJYSJk=";
    private static final String PERMISSION_ID = "IXYFAE9ZOwBGkyqWIsNKAA==";
    private static final String STORED_PRCEDURE_ID = "IXYFAOHEBPMCAAAAAAAAgA==";
    private static final String TRIGGER_ID = "IXYFAOHEBPMCAAAAAAAAcA==";
    private static final String USER_DEFINED_FUNCTION_ID = "IXYFAOHEBPMBAAAAAAAAYA==";
    private static final String USER_ID = "IXYFAE9ZOwA=";
    private static final String CONFLICT_ID = "k6d9ALgBmD8BAAAAAAAAQA==";

    private static final String DATABASE_FULL_NAME = "dbs/IXYFAA==/";
    private static final String DOCUMENT_COLLECTION_FULL_NAME = "dbs/IXYFAA==/colls/IXYFAOHEBPM=/";
    private static final String DOCUMENT_FULL_NAME = "dbs/IXYFAA==/colls/IXYFAOHEBPM=/docs/IXYFAOHEBPMBAAAAAAAAAA==/";
    private static final String STORED_PRCEDURE_FULL_NAME = "dbs/IXYFAA==/colls/IXYFAOHEBPM=/sprocs/IXYFAOHEBPMCAAAAAAAAgA==/";
    private static final String USER_DEFINED_FUNCTION_FULL_NAME = "dbs/IXYFAA==/colls/IXYFAOHEBPM=/udfs/IXYFAOHEBPMBAAAAAAAAYA==/";
    private static final String USER_FULL_NAME = "dbs/IXYFAA==/users/IXYFAE9ZOwA=/";
    private static final String PERMISSION_FULL_NAME = "dbs/IXYFAA==/users/IXYFAE9ZOwA=/permissions/IXYFAE9ZOwBGkyqWIsNKAA==/";
    private static final String ATTACHMENT_FULL_NAME = "dbs/IXYFAA==/colls/IXYFAOHEBPM=/docs/IXYFAOHEBPMBAAAAAAAAAA==/attachments/IXYFAOHEBPMBAAAAAAAAABJYSJk=/";
    private static final String TRIGGER_FULL_NAME = "dbs/IXYFAA==/colls/IXYFAOHEBPM=/triggers/IXYFAOHEBPMCAAAAAAAAcA==/";
    private static final String CONFLICT_FULL_NAME = "dbs/k6d9AA==/colls/k6d9ALgBmD8=/conflicts/k6d9ALgBmD8BAAAAAAAAQA==/";

    private static final String INCORRECT = "incorrect";

    @Test(groups = { "unit" })
    public void validateResourceID() {
        assertThat(PathsHelper.validateResourceId(ResourceType.Database, DATABASE_ID)).isTrue();
        assertThat(PathsHelper.validateResourceId(ResourceType.DocumentCollection, DATABASE_COLLECTION_ID)).isTrue();
        assertThat(PathsHelper.validateResourceId(ResourceType.Document, DOCUMENT_ID)).isTrue();
        assertThat(PathsHelper.validateResourceId(ResourceType.Attachment, ATTACHMENT_ID)).isTrue();
        assertThat(PathsHelper.validateResourceId(ResourceType.Permission, PERMISSION_ID)).isTrue();
        assertThat(PathsHelper.validateResourceId(ResourceType.StoredProcedure, STORED_PRCEDURE_ID)).isTrue();
        assertThat(PathsHelper.validateResourceId(ResourceType.Trigger, TRIGGER_ID)).isTrue();
        assertThat(PathsHelper.validateResourceId(ResourceType.UserDefinedFunction, USER_DEFINED_FUNCTION_ID)).isTrue();
        assertThat(PathsHelper.validateResourceId(ResourceType.User, USER_ID)).isTrue();
        assertThat(PathsHelper.validateResourceId(ResourceType.Conflict, CONFLICT_ID)).isTrue();

        assertThat(PathsHelper.validateResourceId(ResourceType.Database, DATABASE_ID + INCORRECT)).isFalse();
        assertThat(PathsHelper.validateResourceId(ResourceType.DocumentCollection, DATABASE_COLLECTION_ID + INCORRECT)).isFalse();
        assertThat(PathsHelper.validateResourceId(ResourceType.Document, DOCUMENT_ID + INCORRECT)).isFalse();
        assertThat(PathsHelper.validateResourceId(ResourceType.Attachment, ATTACHMENT_ID + INCORRECT)).isFalse();
        assertThat(PathsHelper.validateResourceId(ResourceType.Permission, PERMISSION_ID + INCORRECT)).isFalse();
        assertThat(PathsHelper.validateResourceId(ResourceType.StoredProcedure, STORED_PRCEDURE_ID + INCORRECT)).isFalse();
        assertThat(PathsHelper.validateResourceId(ResourceType.Trigger, TRIGGER_ID + INCORRECT)).isFalse();
        assertThat(PathsHelper.validateResourceId(ResourceType.UserDefinedFunction, USER_DEFINED_FUNCTION_ID + INCORRECT)).isFalse();
        assertThat(PathsHelper.validateResourceId(ResourceType.User, USER_ID + INCORRECT)).isFalse();
        assertThat(PathsHelper.validateResourceId(ResourceType.Conflict, CONFLICT_ID + INCORRECT)).isFalse();
    }

    @Test(groups = { "unit" })
    public void validateResourceFullName() {
        assertThat(PathsHelper.validateResourceFullName(ResourceType.Database, DATABASE_FULL_NAME)).isTrue();
        assertThat(PathsHelper.validateResourceFullName(ResourceType.DocumentCollection, DOCUMENT_COLLECTION_FULL_NAME)).isTrue();
        assertThat(PathsHelper.validateResourceFullName(ResourceType.Document, DOCUMENT_FULL_NAME)).isTrue();
        assertThat(PathsHelper.validateResourceFullName(ResourceType.Attachment, ATTACHMENT_FULL_NAME)).isTrue();
        assertThat(PathsHelper.validateResourceFullName(ResourceType.Permission, PERMISSION_FULL_NAME)).isTrue();
        assertThat(PathsHelper.validateResourceFullName(ResourceType.User, USER_FULL_NAME)).isTrue();
        assertThat(PathsHelper.validateResourceFullName(ResourceType.Conflict, CONFLICT_FULL_NAME)).isTrue();
        assertThat(PathsHelper.validateResourceFullName(ResourceType.UserDefinedFunction, USER_DEFINED_FUNCTION_FULL_NAME)).isTrue();
        assertThat(PathsHelper.validateResourceFullName(ResourceType.StoredProcedure, STORED_PRCEDURE_FULL_NAME)).isTrue();
        assertThat(PathsHelper.validateResourceFullName(ResourceType.Trigger, TRIGGER_FULL_NAME)).isTrue();

        assertThat(PathsHelper.validateResourceFullName(ResourceType.Database, DATABASE_FULL_NAME + INCORRECT)).isFalse();
        assertThat(PathsHelper.validateResourceFullName(ResourceType.DocumentCollection, DOCUMENT_COLLECTION_FULL_NAME + INCORRECT)).isFalse();
        assertThat(PathsHelper.validateResourceFullName(ResourceType.Document, DOCUMENT_FULL_NAME + INCORRECT)).isFalse();
        assertThat(PathsHelper.validateResourceFullName(ResourceType.Attachment, ATTACHMENT_FULL_NAME + INCORRECT)).isFalse();
        assertThat(PathsHelper.validateResourceFullName(ResourceType.Permission, PERMISSION_FULL_NAME + INCORRECT)).isFalse();
        assertThat(PathsHelper.validateResourceFullName(ResourceType.User, USER_FULL_NAME + INCORRECT)).isFalse();
        assertThat(PathsHelper.validateResourceFullName(ResourceType.Conflict, CONFLICT_FULL_NAME + INCORRECT)).isFalse();
        assertThat(PathsHelper.validateResourceFullName(ResourceType.UserDefinedFunction, USER_DEFINED_FUNCTION_FULL_NAME + INCORRECT)).isFalse();
        assertThat(PathsHelper.validateResourceFullName(ResourceType.StoredProcedure, STORED_PRCEDURE_FULL_NAME + INCORRECT)).isFalse();
        assertThat(PathsHelper.validateResourceFullName(ResourceType.Trigger, TRIGGER_FULL_NAME + INCORRECT)).isFalse();

    }

    @Test(groups = {"unit"})
    public void generatePathAtDBLevel() {
        RxDocumentServiceRequest rxDocumentServiceRequest = RxDocumentServiceRequest.create(OperationType.Read, ResourceType.DatabaseAccount);
        String path = PathsHelper.generatePath(ResourceType.DatabaseAccount, rxDocumentServiceRequest, rxDocumentServiceRequest.isFeed);
        assertThat(path).isEqualTo(Paths.DATABASE_ACCOUNT_PATH_SEGMENT + "/");

        rxDocumentServiceRequest = RxDocumentServiceRequest.create(OperationType.Create, ResourceType.Database);
        path = PathsHelper.generatePath(ResourceType.Database, rxDocumentServiceRequest, rxDocumentServiceRequest.isFeed);
        assertThat(path).isEqualTo(Paths.DATABASES_PATH_SEGMENT + "/");
    }
}
