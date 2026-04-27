// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.watchlists.items

import com.clear_street.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ItemDeleteWatchlistItemResponseTest {

    @Test
    fun create() {
        val itemDeleteWatchlistItemResponse = ItemDeleteWatchlistItemResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val itemDeleteWatchlistItemResponse = ItemDeleteWatchlistItemResponse.builder().build()

        val roundtrippedItemDeleteWatchlistItemResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(itemDeleteWatchlistItemResponse),
                jacksonTypeRef<ItemDeleteWatchlistItemResponse>(),
            )

        assertThat(roundtrippedItemDeleteWatchlistItemResponse)
            .isEqualTo(itemDeleteWatchlistItemResponse)
    }
}
