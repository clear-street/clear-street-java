// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.services.blocking.v1

import com.clearstreet.api.TestServerExtension
import com.clearstreet.api.client.okhttp.ClearStreetOkHttpClient
import com.clearstreet.api.models.v1.watchlist.WatchlistAddWatchlistItemParams
import com.clearstreet.api.models.v1.watchlist.WatchlistCreateWatchlistParams
import com.clearstreet.api.models.v1.watchlist.WatchlistDeleteWatchlistItemParams
import com.clearstreet.api.models.v1.watchlist.WatchlistGetWatchlistsParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class WatchlistServiceTest {

    @Test
    fun addWatchlistItem() {
        val client =
            ClearStreetOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val watchlistService = client.v1().watchlist()

        val response =
            watchlistService.addWatchlistItem(
                WatchlistAddWatchlistItemParams.builder()
                    .watchlistId("550e8400-e29b-41d4-a716-446655440000")
                    .instrumentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        response.validate()
    }

    @Test
    fun createWatchlist() {
        val client =
            ClearStreetOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val watchlistService = client.v1().watchlist()

        val response =
            watchlistService.createWatchlist(
                WatchlistCreateWatchlistParams.builder().name("name").build()
            )

        response.validate()
    }

    @Test
    fun deleteWatchlist() {
        val client =
            ClearStreetOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val watchlistService = client.v1().watchlist()

        val response = watchlistService.deleteWatchlist("550e8400-e29b-41d4-a716-446655440000")

        response.validate()
    }

    @Test
    fun deleteWatchlistItem() {
        val client =
            ClearStreetOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val watchlistService = client.v1().watchlist()

        val response =
            watchlistService.deleteWatchlistItem(
                WatchlistDeleteWatchlistItemParams.builder()
                    .watchlistId("550e8400-e29b-41d4-a716-446655440000")
                    .itemId("660e8400-e29b-41d4-a716-446655440001")
                    .build()
            )

        response.validate()
    }

    @Test
    fun getWatchlistById() {
        val client =
            ClearStreetOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val watchlistService = client.v1().watchlist()

        val response = watchlistService.getWatchlistById("550e8400-e29b-41d4-a716-446655440000")

        response.validate()
    }

    @Test
    fun getWatchlists() {
        val client =
            ClearStreetOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val watchlistService = client.v1().watchlist()

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
