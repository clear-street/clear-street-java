// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.instrumentdata.marketdata

import com.clearstreet.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SnapshotLastTradeTest {

    @Test
    fun create() {
        val snapshotLastTrade =
            SnapshotLastTrade.builder()
                .price("price")
                .size(0)
                .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .venue("venue")
                .build()

        assertThat(snapshotLastTrade.price()).isEqualTo("price")
        assertThat(snapshotLastTrade.size()).isEqualTo(0)
        assertThat(snapshotLastTrade.timestamp())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(snapshotLastTrade.venue()).contains("venue")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val snapshotLastTrade =
            SnapshotLastTrade.builder()
                .price("price")
                .size(0)
                .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .venue("venue")
                .build()

        val roundtrippedSnapshotLastTrade =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(snapshotLastTrade),
                jacksonTypeRef<SnapshotLastTrade>(),
            )

        assertThat(roundtrippedSnapshotLastTrade).isEqualTo(snapshotLastTrade)
    }
}
