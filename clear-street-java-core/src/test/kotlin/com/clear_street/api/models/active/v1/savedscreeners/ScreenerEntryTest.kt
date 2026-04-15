// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.savedscreeners

import com.clear_street.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ScreenerEntryTest {

    @Test
    fun create() {
        val screenerEntry =
            ScreenerEntry.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addFilter(
                    SavedScreenerFilter.builder()
                        .fieldName("field_name")
                        .operation("operation")
                        .value("value")
                        .build()
                )
                .name("name")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addFieldFilter("string")
                .sortBy("sort_by")
                .sortDirection("sort_direction")
                .build()

        assertThat(screenerEntry.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(screenerEntry.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(screenerEntry.filters())
            .containsExactly(
                SavedScreenerFilter.builder()
                    .fieldName("field_name")
                    .operation("operation")
                    .value("value")
                    .build()
            )
        assertThat(screenerEntry.name()).isEqualTo("name")
        assertThat(screenerEntry.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(screenerEntry.fieldFilter().getOrNull()).containsExactly("string")
        assertThat(screenerEntry.sortBy()).contains("sort_by")
        assertThat(screenerEntry.sortDirection()).contains("sort_direction")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val screenerEntry =
            ScreenerEntry.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addFilter(
                    SavedScreenerFilter.builder()
                        .fieldName("field_name")
                        .operation("operation")
                        .value("value")
                        .build()
                )
                .name("name")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addFieldFilter("string")
                .sortBy("sort_by")
                .sortDirection("sort_direction")
                .build()

        val roundtrippedScreenerEntry =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(screenerEntry),
                jacksonTypeRef<ScreenerEntry>(),
            )

        assertThat(roundtrippedScreenerEntry).isEqualTo(screenerEntry)
    }
}
