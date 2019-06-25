/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2018_02_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Set of data with rendering instructions.
 */
public class DiagnosticData {
    /**
     * Data in table form.
     */
    @JsonProperty(value = "table")
    private DataTableResponseObject table;

    /**
     * Properties that describe how the table should be rendered.
     */
    @JsonProperty(value = "renderingProperties")
    private Rendering renderingProperties;

    /**
     * Get data in table form.
     *
     * @return the table value
     */
    public DataTableResponseObject table() {
        return this.table;
    }

    /**
     * Set data in table form.
     *
     * @param table the table value to set
     * @return the DiagnosticData object itself.
     */
    public DiagnosticData withTable(DataTableResponseObject table) {
        this.table = table;
        return this;
    }

    /**
     * Get properties that describe how the table should be rendered.
     *
     * @return the renderingProperties value
     */
    public Rendering renderingProperties() {
        return this.renderingProperties;
    }

    /**
     * Set properties that describe how the table should be rendered.
     *
     * @param renderingProperties the renderingProperties value to set
     * @return the DiagnosticData object itself.
     */
    public DiagnosticData withRenderingProperties(Rendering renderingProperties) {
        this.renderingProperties = renderingProperties;
        return this;
    }

}
