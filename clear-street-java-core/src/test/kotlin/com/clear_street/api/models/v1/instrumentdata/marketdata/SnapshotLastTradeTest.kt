// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.instrumentdata.marketdata

import com.clear_street.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SnapshotLastTradeTest {

    @Test
    fun create() {
        val snapshotLastTrade = SnapshotLastTrade.builder().price("price").size(0).build()

        assertThat(snapshotLastTrade.price()).isEqualTo("price")
        assertThat(snapshotLastTrade.size()).isEqualTo(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val snapshotLastTrade = SnapshotLastTrade.builder().price("price").size(0).build()

        val roundtrippedSnapshotLastTrade =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(snapshotLastTrade),
                jacksonTypeRef<SnapshotLastTrade>(),
            )

        assertThat(roundtrippedSnapshotLastTrade).isEqualTo(snapshotLastTrade)
    }
}
