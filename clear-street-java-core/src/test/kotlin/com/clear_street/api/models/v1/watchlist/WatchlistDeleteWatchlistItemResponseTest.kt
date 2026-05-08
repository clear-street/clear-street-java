// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.watchlist

import com.clear_street.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WatchlistDeleteWatchlistItemResponseTest {

    @Test
    fun create() {
        val watchlistDeleteWatchlistItemResponse =
            WatchlistDeleteWatchlistItemResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val watchlistDeleteWatchlistItemResponse =
            WatchlistDeleteWatchlistItemResponse.builder().build()

        val roundtrippedWatchlistDeleteWatchlistItemResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(watchlistDeleteWatchlistItemResponse),
                jacksonTypeRef<WatchlistDeleteWatchlistItemResponse>(),
            )

        assertThat(roundtrippedWatchlistDeleteWatchlistItemResponse)
            .isEqualTo(watchlistDeleteWatchlistItemResponse)
    }
}
