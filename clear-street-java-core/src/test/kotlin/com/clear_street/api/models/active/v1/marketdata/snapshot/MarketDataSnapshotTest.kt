// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.marketdata.snapshot

import com.clear_street.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MarketDataSnapshotTest {

    @Test
    fun create() {
        val marketDataSnapshot =
            MarketDataSnapshot.builder()
                .instrumentId("a1a2a3a4-b1b2-c1c2-d1d2-d3d4d5d6d7d8")
                .symbol("AAPL")
                .lastQuote(
                    SnapshotQuote.builder()
                        .ask("210.14")
                        .bid("210.10")
                        .midpoint("210.12")
                        .askSize(200)
                        .bidSize(300)
                        .build()
                )
                .lastTrade(SnapshotLastTrade.builder().price("210.12").build())
                .name("Apple Inc.")
                .session(
                    SnapshotSession.builder()
                        .change("1.82")
                        .changePercent("0.8737")
                        .previousClose("208.30")
                        .build()
                )
                .build()

        assertThat(marketDataSnapshot.instrumentId())
            .isEqualTo("a1a2a3a4-b1b2-c1c2-d1d2-d3d4d5d6d7d8")
        assertThat(marketDataSnapshot.symbol()).isEqualTo("AAPL")
        assertThat(marketDataSnapshot.lastQuote())
            .contains(
                SnapshotQuote.builder()
                    .ask("210.14")
                    .bid("210.10")
                    .midpoint("210.12")
                    .askSize(200)
                    .bidSize(300)
                    .build()
            )
        assertThat(marketDataSnapshot.lastTrade())
            .contains(SnapshotLastTrade.builder().price("210.12").build())
        assertThat(marketDataSnapshot.name()).contains("Apple Inc.")
        assertThat(marketDataSnapshot.session())
            .contains(
                SnapshotSession.builder()
                    .change("1.82")
                    .changePercent("0.8737")
                    .previousClose("208.30")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val marketDataSnapshot =
            MarketDataSnapshot.builder()
                .instrumentId("a1a2a3a4-b1b2-c1c2-d1d2-d3d4d5d6d7d8")
                .symbol("AAPL")
                .lastQuote(
                    SnapshotQuote.builder()
                        .ask("210.14")
                        .bid("210.10")
                        .midpoint("210.12")
                        .askSize(200)
                        .bidSize(300)
                        .build()
                )
                .lastTrade(SnapshotLastTrade.builder().price("210.12").build())
                .name("Apple Inc.")
                .session(
                    SnapshotSession.builder()
                        .change("1.82")
                        .changePercent("0.8737")
                        .previousClose("208.30")
                        .build()
                )
                .build()

        val roundtrippedMarketDataSnapshot =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(marketDataSnapshot),
                jacksonTypeRef<MarketDataSnapshot>(),
            )

        assertThat(roundtrippedMarketDataSnapshot).isEqualTo(marketDataSnapshot)
    }
}
