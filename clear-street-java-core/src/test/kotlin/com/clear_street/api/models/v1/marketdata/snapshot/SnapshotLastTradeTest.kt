// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.marketdata.snapshot

import com.clear_street.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SnapshotLastTradeTest {

    @Test
    fun create() {
        val snapshotLastTrade = SnapshotLastTrade.builder().price("price").build()

        assertThat(snapshotLastTrade.price()).isEqualTo("price")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val snapshotLastTrade = SnapshotLastTrade.builder().price("price").build()

        val roundtrippedSnapshotLastTrade =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(snapshotLastTrade),
                jacksonTypeRef<SnapshotLastTrade>(),
            )

        assertThat(roundtrippedSnapshotLastTrade).isEqualTo(snapshotLastTrade)
    }
}
