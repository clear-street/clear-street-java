// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.instrumentdata.marketdata

import com.clearstreet.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SnapshotQuoteTest {

    @Test
    fun create() {
        val snapshotQuote =
            SnapshotQuote.builder()
                .ask("ask")
                .askSize(0)
                .bid("bid")
                .bidSize(0)
                .midpoint("midpoint")
                .build()

        assertThat(snapshotQuote.ask()).contains("ask")
        assertThat(snapshotQuote.askSize()).contains(0)
        assertThat(snapshotQuote.bid()).contains("bid")
        assertThat(snapshotQuote.bidSize()).contains(0)
        assertThat(snapshotQuote.midpoint()).contains("midpoint")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val snapshotQuote =
            SnapshotQuote.builder()
                .ask("ask")
                .askSize(0)
                .bid("bid")
                .bidSize(0)
                .midpoint("midpoint")
                .build()

        val roundtrippedSnapshotQuote =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(snapshotQuote),
                jacksonTypeRef<SnapshotQuote>(),
            )

        assertThat(roundtrippedSnapshotQuote).isEqualTo(snapshotQuote)
    }
}
