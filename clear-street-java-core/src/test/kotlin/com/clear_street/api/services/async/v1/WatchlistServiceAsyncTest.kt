// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.v1

import com.clear_street.api.client.okhttp.ClearStreetOkHttpClientAsync
import com.clear_street.api.models.v1.watchlist.WatchlistAddWatchlistItemParams
import com.clear_street.api.models.v1.watchlist.WatchlistCreateWatchlistParams
import com.clear_street.api.models.v1.watchlist.WatchlistDeleteWatchlistItemParams
import com.clear_street.api.models.v1.watchlist.WatchlistGetWatchlistsParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class WatchlistServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun addWatchlistItem() {
        val client = ClearStreetOkHttpClientAsync.builder().apiKey("My API Key").build()
        val watchlistServiceAsync = client.v1().watchlist()

        val responseFuture =
            watchlistServiceAsync.addWatchlistItem(
                WatchlistAddWatchlistItemParams.builder()
                    .watchlistId("550e8400-e29b-41d4-a716-446655440000")
                    .instrumentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun createWatchlist() {
        val client = ClearStreetOkHttpClientAsync.builder().apiKey("My API Key").build()
        val watchlistServiceAsync = client.v1().watchlist()

        val responseFuture =
            watchlistServiceAsync.createWatchlist(
                WatchlistCreateWatchlistParams.builder().name("name").build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun deleteWatchlist() {
        val client = ClearStreetOkHttpClientAsync.builder().apiKey("My API Key").build()
        val watchlistServiceAsync = client.v1().watchlist()

        val responseFuture =
            watchlistServiceAsync.deleteWatchlist("550e8400-e29b-41d4-a716-446655440000")

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun deleteWatchlistItem() {
        val client = ClearStreetOkHttpClientAsync.builder().apiKey("My API Key").build()
        val watchlistServiceAsync = client.v1().watchlist()

        val responseFuture =
            watchlistServiceAsync.deleteWatchlistItem(
                WatchlistDeleteWatchlistItemParams.builder()
                    .watchlistId("550e8400-e29b-41d4-a716-446655440000")
                    .itemId("660e8400-e29b-41d4-a716-446655440001")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getWatchlistById() {
        val client = ClearStreetOkHttpClientAsync.builder().apiKey("My API Key").build()
        val watchlistServiceAsync = client.v1().watchlist()

        val responseFuture =
            watchlistServiceAsync.getWatchlistById("550e8400-e29b-41d4-a716-446655440000")

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getWatchlists() {
        val client = ClearStreetOkHttpClientAsync.builder().apiKey("My API Key").build()
        val watchlistServiceAsync = client.v1().watchlist()

        val responseFuture =
            watchlistServiceAsync.getWatchlists(
                WatchlistGetWatchlistsParams.builder()
                    .pageSize(1L)
                    .pageToken("U3RhaW5sZXNzIHJvY2tz")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
