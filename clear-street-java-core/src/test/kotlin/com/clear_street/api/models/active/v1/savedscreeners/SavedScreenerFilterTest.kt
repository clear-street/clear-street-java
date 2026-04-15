// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.savedscreeners

import com.clear_street.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SavedScreenerFilterTest {

    @Test
    fun create() {
        val savedScreenerFilter =
            SavedScreenerFilter.builder()
                .fieldName("field_name")
                .operation("operation")
                .value("value")
                .build()

        assertThat(savedScreenerFilter.fieldName()).isEqualTo("field_name")
        assertThat(savedScreenerFilter.operation()).isEqualTo("operation")
        assertThat(savedScreenerFilter.value()).isEqualTo("value")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val savedScreenerFilter =
            SavedScreenerFilter.builder()
                .fieldName("field_name")
                .operation("operation")
                .value("value")
                .build()

        val roundtrippedSavedScreenerFilter =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(savedScreenerFilter),
                jacksonTypeRef<SavedScreenerFilter>(),
            )

        assertThat(roundtrippedSavedScreenerFilter).isEqualTo(savedScreenerFilter)
    }
}
