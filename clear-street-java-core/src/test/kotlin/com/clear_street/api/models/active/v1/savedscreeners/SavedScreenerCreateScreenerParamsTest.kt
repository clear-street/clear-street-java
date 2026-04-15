// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.savedscreeners

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SavedScreenerCreateScreenerParamsTest {

    @Test
    fun create() {
        SavedScreenerCreateScreenerParams.builder()
            .addFieldFilter("string")
            .addFilter(
                SavedScreenerFilter.builder()
                    .fieldName("field_name")
                    .operation("operation")
                    .value("value")
                    .build()
            )
            .name("name")
            .sortBy("sort_by")
            .sortDirection(SavedScreenerCreateScreenerParams.SortDirection.ASC)
            .build()
    }

    @Test
    fun body() {
        val params =
            SavedScreenerCreateScreenerParams.builder()
                .addFieldFilter("string")
                .addFilter(
                    SavedScreenerFilter.builder()
                        .fieldName("field_name")
                        .operation("operation")
                        .value("value")
                        .build()
                )
                .name("name")
                .sortBy("sort_by")
                .sortDirection(SavedScreenerCreateScreenerParams.SortDirection.ASC)
                .build()

        val body = params._body()

        assertThat(body.fieldFilter().getOrNull()).containsExactly("string")
        assertThat(body.filters().getOrNull())
            .containsExactly(
                SavedScreenerFilter.builder()
                    .fieldName("field_name")
                    .operation("operation")
                    .value("value")
                    .build()
            )
        assertThat(body.name()).contains("name")
        assertThat(body.sortBy()).contains("sort_by")
        assertThat(body.sortDirection())
            .contains(SavedScreenerCreateScreenerParams.SortDirection.ASC)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = SavedScreenerCreateScreenerParams.builder().build()

        val body = params._body()
    }
}
