// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.instrumentdata.marketdata

import com.clear_street.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SnapshotQuoteTest {

    @Test
    fun create() {
        val snapshotQuote =
            SnapshotQuote.builder()
                .ask("ask")
                .bid("bid")
                .midpoint("midpoint")
                .askSize(0)
                .bidSize(0)
                .build()

        assertThat(snapshotQuote.ask()).isEqualTo("ask")
        assertThat(snapshotQuote.bid()).isEqualTo("bid")
        assertThat(snapshotQuote.midpoint()).isEqualTo("midpoint")
        assertThat(snapshotQuote.askSize()).contains(0)
        assertThat(snapshotQuote.bidSize()).contains(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val snapshotQuote =
            SnapshotQuote.builder()
                .ask("ask")
                .bid("bid")
                .midpoint("midpoint")
                .askSize(0)
                .bidSize(0)
                .build()

        val roundtrippedSnapshotQuote =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(snapshotQuote),
                jacksonTypeRef<SnapshotQuote>(),
            )

        assertThat(roundtrippedSnapshotQuote).isEqualTo(snapshotQuote)
    }
}
