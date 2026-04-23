// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.accounts.locates.inventory

import com.clear_street.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LocateInventoryItemTest {

    @Test
    fun create() {
        val locateInventoryItem =
            LocateInventoryItem.builder()
                .accountId(19816L)
                .available(5000L)
                .reserved(1000L)
                .symbol("AAPL")
                .used(2500L)
                .build()

        assertThat(locateInventoryItem.accountId()).isEqualTo(19816L)
        assertThat(locateInventoryItem.available()).isEqualTo(5000L)
        assertThat(locateInventoryItem.reserved()).isEqualTo(1000L)
        assertThat(locateInventoryItem.symbol()).isEqualTo("AAPL")
        assertThat(locateInventoryItem.used()).isEqualTo(2500L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val locateInventoryItem =
            LocateInventoryItem.builder()
                .accountId(19816L)
                .available(5000L)
                .reserved(1000L)
                .symbol("AAPL")
                .used(2500L)
                .build()

        val roundtrippedLocateInventoryItem =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(locateInventoryItem),
                jacksonTypeRef<LocateInventoryItem>(),
            )

        assertThat(roundtrippedLocateInventoryItem).isEqualTo(locateInventoryItem)
    }
}
