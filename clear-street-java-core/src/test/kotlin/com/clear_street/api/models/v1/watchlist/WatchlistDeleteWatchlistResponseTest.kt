// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.watchlist

import com.clear_street.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WatchlistDeleteWatchlistResponseTest {

    @Test
    fun create() {
        val watchlistDeleteWatchlistResponse = WatchlistDeleteWatchlistResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val watchlistDeleteWatchlistResponse = WatchlistDeleteWatchlistResponse.builder().build()

        val roundtrippedWatchlistDeleteWatchlistResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(watchlistDeleteWatchlistResponse),
                jacksonTypeRef<WatchlistDeleteWatchlistResponse>(),
            )

        assertThat(roundtrippedWatchlistDeleteWatchlistResponse)
            .isEqualTo(watchlistDeleteWatchlistResponse)
    }
}
