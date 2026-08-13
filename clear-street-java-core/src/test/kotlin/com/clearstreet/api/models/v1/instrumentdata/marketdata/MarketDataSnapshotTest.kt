// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.instrumentdata.marketdata

import com.clearstreet.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MarketDataSnapshotTest {

    @Test
    fun create() {
        val marketDataSnapshot =
            MarketDataSnapshot.builder()
                .instrumentId("a1a2a3a4-b1b2-c1c2-d1d2-d3d4d5d6d7d8")
                .symbol("AAPL")
                .cumulativeVolume(12345678L)
                .greeks(
                    SnapshotGreeks.builder()
                        .delta("delta")
                        .gamma("gamma")
                        .iv("iv")
                        .rho("rho")
                        .theoPrice("theo_price")
                        .theta("theta")
                        .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .vega("vega")
                        .build()
                )
                .lastQuote(
                    SnapshotQuote.builder()
                        .ask("210.14")
                        .askSize(200)
                        .askTimestamp(OffsetDateTime.parse("2026-08-11T14:30:01.987654321Z"))
                        .askVenue("XNAS")
                        .bid("210.10")
                        .bidSize(300)
                        .bidTimestamp(OffsetDateTime.parse("2026-08-11T14:30:00.123456789Z"))
                        .bidVenue("XNAS")
                        .midpoint("210.12")
                        .build()
                )
                .lastTrade(
                    SnapshotLastTrade.builder()
                        .price("210.12")
                        .size(100)
                        .timestamp(OffsetDateTime.parse("2026-08-11T14:30:02.123456789Z"))
                        .venue("XNAS")
                        .build()
                )
                .name("Apple Inc.")
                .session(
                    SnapshotSession.builder()
                        .change("4.68")
                        .changePercent("2.2780")
                        .previousClose("205.44")
                        .previousCloseUnadjusted("208.30")
                        .build()
                )
                .build()

        assertThat(marketDataSnapshot.instrumentId())
            .isEqualTo("a1a2a3a4-b1b2-c1c2-d1d2-d3d4d5d6d7d8")
        assertThat(marketDataSnapshot.symbol()).isEqualTo("AAPL")
        assertThat(marketDataSnapshot.cumulativeVolume()).contains(12345678L)
        assertThat(marketDataSnapshot.greeks())
            .contains(
                SnapshotGreeks.builder()
                    .delta("delta")
                    .gamma("gamma")
                    .iv("iv")
                    .rho("rho")
                    .theoPrice("theo_price")
                    .theta("theta")
                    .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .vega("vega")
                    .build()
            )
        assertThat(marketDataSnapshot.lastQuote())
            .contains(
                SnapshotQuote.builder()
                    .ask("210.14")
                    .askSize(200)
                    .askTimestamp(OffsetDateTime.parse("2026-08-11T14:30:01.987654321Z"))
                    .askVenue("XNAS")
                    .bid("210.10")
                    .bidSize(300)
                    .bidTimestamp(OffsetDateTime.parse("2026-08-11T14:30:00.123456789Z"))
                    .bidVenue("XNAS")
                    .midpoint("210.12")
                    .build()
            )
        assertThat(marketDataSnapshot.lastTrade())
            .contains(
                SnapshotLastTrade.builder()
                    .price("210.12")
                    .size(100)
                    .timestamp(OffsetDateTime.parse("2026-08-11T14:30:02.123456789Z"))
                    .venue("XNAS")
                    .build()
            )
        assertThat(marketDataSnapshot.name()).contains("Apple Inc.")
        assertThat(marketDataSnapshot.session())
            .contains(
                SnapshotSession.builder()
                    .change("4.68")
                    .changePercent("2.2780")
                    .previousClose("205.44")
                    .previousCloseUnadjusted("208.30")
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
                .cumulativeVolume(12345678L)
                .greeks(
                    SnapshotGreeks.builder()
                        .delta("delta")
                        .gamma("gamma")
                        .iv("iv")
                        .rho("rho")
                        .theoPrice("theo_price")
                        .theta("theta")
                        .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .vega("vega")
                        .build()
                )
                .lastQuote(
                    SnapshotQuote.builder()
                        .ask("210.14")
                        .askSize(200)
                        .askTimestamp(OffsetDateTime.parse("2026-08-11T14:30:01.987654321Z"))
                        .askVenue("XNAS")
                        .bid("210.10")
                        .bidSize(300)
                        .bidTimestamp(OffsetDateTime.parse("2026-08-11T14:30:00.123456789Z"))
                        .bidVenue("XNAS")
                        .midpoint("210.12")
                        .build()
                )
                .lastTrade(
                    SnapshotLastTrade.builder()
                        .price("210.12")
                        .size(100)
                        .timestamp(OffsetDateTime.parse("2026-08-11T14:30:02.123456789Z"))
                        .venue("XNAS")
                        .build()
                )
                .name("Apple Inc.")
                .session(
                    SnapshotSession.builder()
                        .change("4.68")
                        .changePercent("2.2780")
                        .previousClose("205.44")
                        .previousCloseUnadjusted("208.30")
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
