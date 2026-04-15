// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.active.v1

import com.clear_street.api.client.okhttp.ClearStreetOkHttpClientAsync
import com.clear_street.api.models.active.v1.watchlists.WatchlistCreateWatchlistParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class WatchlistServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun createWatchlist() {
        val client = ClearStreetOkHttpClientAsync.builder().apiKey("My API Key").build()
        val watchlistServiceAsync = client.active().v1().watchlists()

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
        val watchlistServiceAsync = client.active().v1().watchlists()

        val future = watchlistServiceAsync.deleteWatchlist("550e8400-e29b-41d4-a716-446655440000")

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getWatchlistById() {
        val client = ClearStreetOkHttpClientAsync.builder().apiKey("My API Key").build()
        val watchlistServiceAsync = client.active().v1().watchlists()

        val responseFuture =
            watchlistServiceAsync.getWatchlistById("550e8400-e29b-41d4-a716-446655440000")

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getWatchlists() {
        val client = ClearStreetOkHttpClientAsync.builder().apiKey("My API Key").build()
        val watchlistServiceAsync = client.active().v1().watchlists()

        val responseFuture = watchlistServiceAsync.getWatchlists()

        val response = responseFuture.get()
        response.validate()
    }
}
