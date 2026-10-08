// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.instrumentdata.marketdata

import com.clearstreet.api.core.JsonValue
import com.clearstreet.api.core.jsonMapper
import com.clearstreet.api.models.ApiError
import com.clearstreet.api.models.ResponseMetadata
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MarketDataGetSnapshotsResponseTest {

    @Test
    fun create() {
        val marketDataGetSnapshotsResponse =
            MarketDataGetSnapshotsResponse.builder()
                .metadata(
                    ResponseMetadata.builder()
                        .requestId("request_id")
                        .nextPageToken("U3RhaW5sZXNzIHJvY2tz")
                        .pageNumber(1)
                        .previousPageToken("U3RhaW5sZXNzIHJvY2tz")
                        .totalItems(42L)
                        .totalPages(5)
                        .build()
                )
                .error(
                    ApiError.builder()
                        .code(400)
                        .message("Order quantity must be greater than zero")
                        .addDetail(
                            ApiError.Detail.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .build()
                )
                .addData(
                    MarketDataSnapshot.builder()
                        .instrumentId("a1a2a3a4-b1b2-c1c2-d1d2-d3d4d5d6d7d8")
                        .session(
                            SnapshotSession.builder()
                                .ohlvApplicable(true)
                                .change("4.68")
                                .changePercent("2.2780")
                                .cumulativeVolume(12345678L)
                                .high("211.30")
                                .low("207.55")
                                .ohlvDate(LocalDate.parse("2026-08-11"))
                                .open("208.00")
                                .previousClose("205.44")
                                .previousCloseUnadjusted("208.30")
                                .build()
                        )
                        .shortSaleRestricted(false)
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
                                .askTimestamp(
                                    OffsetDateTime.parse("2026-08-11T14:30:01.987654321Z")
                                )
                                .askVenue("XNAS")
                                .bid("210.10")
                                .bidSize(300)
                                .bidTimestamp(
                                    OffsetDateTime.parse("2026-08-11T14:30:00.123456789Z")
                                )
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
                        .openInterest(4520L)
                        .build()
                )
                .build()

        assertThat(marketDataGetSnapshotsResponse.metadata())
            .isEqualTo(
                ResponseMetadata.builder()
                    .requestId("request_id")
                    .nextPageToken("U3RhaW5sZXNzIHJvY2tz")
                    .pageNumber(1)
                    .previousPageToken("U3RhaW5sZXNzIHJvY2tz")
                    .totalItems(42L)
                    .totalPages(5)
                    .build()
            )
        assertThat(marketDataGetSnapshotsResponse.error())
            .contains(
                ApiError.builder()
                    .code(400)
                    .message("Order quantity must be greater than zero")
                    .addDetail(
                        ApiError.Detail.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .build()
            )
        assertThat(marketDataGetSnapshotsResponse.data())
            .containsExactly(
                MarketDataSnapshot.builder()
                    .instrumentId("a1a2a3a4-b1b2-c1c2-d1d2-d3d4d5d6d7d8")
                    .session(
                        SnapshotSession.builder()
                            .ohlvApplicable(true)
                            .change("4.68")
                            .changePercent("2.2780")
                            .cumulativeVolume(12345678L)
                            .high("211.30")
                            .low("207.55")
                            .ohlvDate(LocalDate.parse("2026-08-11"))
                            .open("208.00")
                            .previousClose("205.44")
                            .previousCloseUnadjusted("208.30")
                            .build()
                    )
                    .shortSaleRestricted(false)
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
                    .openInterest(4520L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val marketDataGetSnapshotsResponse =
            MarketDataGetSnapshotsResponse.builder()
                .metadata(
                    ResponseMetadata.builder()
                        .requestId("request_id")
                        .nextPageToken("U3RhaW5sZXNzIHJvY2tz")
                        .pageNumber(1)
                        .previousPageToken("U3RhaW5sZXNzIHJvY2tz")
                        .totalItems(42L)
                        .totalPages(5)
                        .build()
                )
                .error(
                    ApiError.builder()
                        .code(400)
                        .message("Order quantity must be greater than zero")
                        .addDetail(
                            ApiError.Detail.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .build()
                )
                .addData(
                    MarketDataSnapshot.builder()
                        .instrumentId("a1a2a3a4-b1b2-c1c2-d1d2-d3d4d5d6d7d8")
                        .session(
                            SnapshotSession.builder()
                                .ohlvApplicable(true)
                                .change("4.68")
                                .changePercent("2.2780")
                                .cumulativeVolume(12345678L)
                                .high("211.30")
                                .low("207.55")
                                .ohlvDate(LocalDate.parse("2026-08-11"))
                                .open("208.00")
                                .previousClose("205.44")
                                .previousCloseUnadjusted("208.30")
                                .build()
                        )
                        .shortSaleRestricted(false)
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
                                .askTimestamp(
                                    OffsetDateTime.parse("2026-08-11T14:30:01.987654321Z")
                                )
                                .askVenue("XNAS")
                                .bid("210.10")
                                .bidSize(300)
                                .bidTimestamp(
                                    OffsetDateTime.parse("2026-08-11T14:30:00.123456789Z")
                                )
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
                        .openInterest(4520L)
                        .build()
                )
                .build()

        val roundtrippedMarketDataGetSnapshotsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(marketDataGetSnapshotsResponse),
                jacksonTypeRef<MarketDataGetSnapshotsResponse>(),
            )

        assertThat(roundtrippedMarketDataGetSnapshotsResponse)
            .isEqualTo(marketDataGetSnapshotsResponse)
    }
}
