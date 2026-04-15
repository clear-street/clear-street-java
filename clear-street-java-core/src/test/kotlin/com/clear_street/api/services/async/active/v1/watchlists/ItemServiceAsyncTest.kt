// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.active.v1.watchlists

import com.clear_street.api.client.okhttp.ClearStreetOkHttpClientAsync
import com.clear_street.api.models.active.v1.SecurityIdSource
import com.clear_street.api.models.active.v1.watchlists.items.ItemAddWatchlistItemParams
import com.clear_street.api.models.active.v1.watchlists.items.ItemDeleteWatchlistItemParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ItemServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun addWatchlistItem() {
        val client = ClearStreetOkHttpClientAsync.builder().apiKey("My API Key").build()
        val itemServiceAsync = client.active().v1().watchlists().items()

        val responseFuture =
            itemServiceAsync.addWatchlistItem(
                ItemAddWatchlistItemParams.builder()
                    .watchlistId("550e8400-e29b-41d4-a716-446655440000")
                    .instrumentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .securityId("security_id")
                    .securityIdSource(SecurityIdSource.CMS)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun deleteWatchlistItem() {
        val client = ClearStreetOkHttpClientAsync.builder().apiKey("My API Key").build()
        val itemServiceAsync = client.active().v1().watchlists().items()

        val future =
            itemServiceAsync.deleteWatchlistItem(
                ItemDeleteWatchlistItemParams.builder()
                    .watchlistId("550e8400-e29b-41d4-a716-446655440000")
                    .itemId("660e8400-e29b-41d4-a716-446655440001")
                    .build()
            )

        val response = future.get()
    }
}
