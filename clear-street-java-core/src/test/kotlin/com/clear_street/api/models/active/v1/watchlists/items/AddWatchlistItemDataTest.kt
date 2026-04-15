// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.watchlists.items

import com.clear_street.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AddWatchlistItemDataTest {

    @Test
    fun create() {
        val addWatchlistItemData =
            AddWatchlistItemData.builder().itemId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()

        assertThat(addWatchlistItemData.itemId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val addWatchlistItemData =
            AddWatchlistItemData.builder().itemId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()

        val roundtrippedAddWatchlistItemData =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(addWatchlistItemData),
                jacksonTypeRef<AddWatchlistItemData>(),
            )

        assertThat(roundtrippedAddWatchlistItemData).isEqualTo(addWatchlistItemData)
    }
}
