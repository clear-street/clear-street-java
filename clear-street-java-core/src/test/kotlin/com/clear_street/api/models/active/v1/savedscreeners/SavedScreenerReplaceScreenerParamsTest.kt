// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.savedscreeners

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SavedScreenerReplaceScreenerParamsTest {

    @Test
    fun create() {
        SavedScreenerReplaceScreenerParams.builder()
            .screenerId("550e8400-e29b-41d4-a716-446655440000")
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
            .sortDirection(SavedScreenerReplaceScreenerParams.SortDirection.ASC)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            SavedScreenerReplaceScreenerParams.builder()
                .screenerId("550e8400-e29b-41d4-a716-446655440000")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("550e8400-e29b-41d4-a716-446655440000")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            SavedScreenerReplaceScreenerParams.builder()
                .screenerId("550e8400-e29b-41d4-a716-446655440000")
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
                .sortDirection(SavedScreenerReplaceScreenerParams.SortDirection.ASC)
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
            .contains(SavedScreenerReplaceScreenerParams.SortDirection.ASC)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            SavedScreenerReplaceScreenerParams.builder()
                .screenerId("550e8400-e29b-41d4-a716-446655440000")
                .build()

        val body = params._body()
    }
}
