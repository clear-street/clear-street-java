// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.v1

import com.clear_street.api.client.okhttp.ClearStreetOkHttpClient
import com.clear_street.api.models.v1.watchlists.WatchlistCreateWatchlistParams
import com.clear_street.api.models.v1.watchlists.WatchlistGetWatchlistsParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class WatchlistServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun createWatchlist() {
        val client = ClearStreetOkHttpClient.builder().apiKey("My API Key").build()
        val watchlistService = client.v1().watchlists()

        val response =
            watchlistService.createWatchlist(
                WatchlistCreateWatchlistParams.builder().name("name").build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun deleteWatchlist() {
        val client = ClearStreetOkHttpClient.builder().apiKey("My API Key").build()
        val watchlistService = client.v1().watchlists()

        val response = watchlistService.deleteWatchlist("550e8400-e29b-41d4-a716-446655440000")

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getWatchlistById() {
        val client = ClearStreetOkHttpClient.builder().apiKey("My API Key").build()
        val watchlistService = client.v1().watchlists()

        val response = watchlistService.getWatchlistById("550e8400-e29b-41d4-a716-446655440000")

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getWatchlists() {
        val client = ClearStreetOkHttpClient.builder().apiKey("My API Key").build()
        val watchlistService = client.v1().watchlists()

        val response =
            watchlistService.getWatchlists(
                WatchlistGetWatchlistsParams.builder()
                    .pageSize(1L)
                    .pageToken("U3RhaW5sZXNzIHJvY2tz")
                    .build()
            )

        response.validate()
    }
}
