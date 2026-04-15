// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.watchlists

import com.clear_street.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WatchlistEntryTest {

    @Test
    fun create() {
        val watchlistEntry =
            WatchlistEntry.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .name("name")
                .build()

        assertThat(watchlistEntry.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(watchlistEntry.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(watchlistEntry.name()).isEqualTo("name")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val watchlistEntry =
            WatchlistEntry.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .name("name")
                .build()

        val roundtrippedWatchlistEntry =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(watchlistEntry),
                jacksonTypeRef<WatchlistEntry>(),
            )

        assertThat(roundtrippedWatchlistEntry).isEqualTo(watchlistEntry)
    }
}
