/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2018_02_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.appservice.v2018_02_01.implementation.PublicCertificateInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.appservice.v2018_02_01.implementation.AppServiceManager;

/**
 * Type representing PublicCertificate.
 */
public interface PublicCertificate extends HasInner<PublicCertificateInner>, Indexable, Refreshable<PublicCertificate>, Updatable<PublicCertificate.Update>, HasManager<AppServiceManager> {
    /**
     * @return the blob value.
     */
    byte[] blob();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the kind value.
     */
    String kind();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the publicCertificateLocation value.
     */
    PublicCertificateLocation publicCertificateLocation();

    /**
     * @return the thumbprint value.
     */
    String thumbprint();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the PublicCertificate definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithSite, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of PublicCertificate definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a PublicCertificate definition.
         */
        interface Blank extends WithSite {
        }

        /**
         * The stage of the publiccertificate definition allowing to specify Site.
         */
        interface WithSite {
           /**
            * Specifies resourceGroupName, name.
            * @param resourceGroupName Name of the resource group to which the resource belongs
            * @param name Name of the app
            * @return the next definition stage
            */
            WithCreate withExistingSite(String resourceGroupName, String name);
        }

        /**
         * The stage of the publiccertificate definition allowing to specify Blob.
         */
        interface WithBlob {
            /**
             * Specifies blob.
             * @param blob Public Certificate byte array
             * @return the next definition stage
             */
            WithCreate withBlob(byte[] blob);
        }

        /**
         * The stage of the publiccertificate definition allowing to specify Kind.
         */
        interface WithKind {
            /**
             * Specifies kind.
             * @param kind Kind of resource
             * @return the next definition stage
             */
            WithCreate withKind(String kind);
        }

        /**
         * The stage of the publiccertificate definition allowing to specify PublicCertificateLocation.
         */
        interface WithPublicCertificateLocation {
            /**
             * Specifies publicCertificateLocation.
             * @param publicCertificateLocation Public Certificate Location. Possible values include: 'CurrentUserMy', 'LocalMachineMy', 'Unknown'
             * @return the next definition stage
             */
            WithCreate withPublicCertificateLocation(PublicCertificateLocation publicCertificateLocation);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<PublicCertificate>, DefinitionStages.WithBlob, DefinitionStages.WithKind, DefinitionStages.WithPublicCertificateLocation {
        }
    }
    /**
     * The template for a PublicCertificate update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<PublicCertificate>, UpdateStages.WithBlob, UpdateStages.WithKind, UpdateStages.WithPublicCertificateLocation {
    }

    /**
     * Grouping of PublicCertificate update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the publiccertificate update allowing to specify Blob.
         */
        interface WithBlob {
            /**
             * Specifies blob.
             * @param blob Public Certificate byte array
             * @return the next update stage
             */
            Update withBlob(byte[] blob);
        }

        /**
         * The stage of the publiccertificate update allowing to specify Kind.
         */
        interface WithKind {
            /**
             * Specifies kind.
             * @param kind Kind of resource
             * @return the next update stage
             */
            Update withKind(String kind);
        }

        /**
         * The stage of the publiccertificate update allowing to specify PublicCertificateLocation.
         */
        interface WithPublicCertificateLocation {
            /**
             * Specifies publicCertificateLocation.
             * @param publicCertificateLocation Public Certificate Location. Possible values include: 'CurrentUserMy', 'LocalMachineMy', 'Unknown'
             * @return the next update stage
             */
            Update withPublicCertificateLocation(PublicCertificateLocation publicCertificateLocation);
        }

    }
}
