// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.watchlist

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WatchlistAddWatchlistItemParamsTest {

    @Test
    fun create() {
        WatchlistAddWatchlistItemParams.builder()
            .watchlistId("550e8400-e29b-41d4-a716-446655440000")
            .instrumentId("x")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            WatchlistAddWatchlistItemParams.builder()
                .watchlistId("550e8400-e29b-41d4-a716-446655440000")
                .instrumentId("x")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("550e8400-e29b-41d4-a716-446655440000")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            WatchlistAddWatchlistItemParams.builder()
                .watchlistId("550e8400-e29b-41d4-a716-446655440000")
                .instrumentId("x")
                .build()

        val body = params._body()

        assertThat(body.instrumentId()).isEqualTo("x")
    }
}
