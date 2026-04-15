// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.watchlists.items

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ItemDeleteWatchlistItemParamsTest {

    @Test
    fun create() {
        ItemDeleteWatchlistItemParams.builder()
            .watchlistId("550e8400-e29b-41d4-a716-446655440000")
            .itemId("660e8400-e29b-41d4-a716-446655440001")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ItemDeleteWatchlistItemParams.builder()
                .watchlistId("550e8400-e29b-41d4-a716-446655440000")
                .itemId("660e8400-e29b-41d4-a716-446655440001")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("550e8400-e29b-41d4-a716-446655440000")
        assertThat(params._pathParam(1)).isEqualTo("660e8400-e29b-41d4-a716-446655440001")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
