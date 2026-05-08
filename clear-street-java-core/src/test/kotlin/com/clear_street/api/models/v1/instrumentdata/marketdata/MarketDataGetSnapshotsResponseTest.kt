// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.instrumentdata.marketdata

import com.clear_street.api.core.JsonValue
import com.clear_street.api.core.jsonMapper
import com.clear_street.api.models.ApiError
import com.clear_street.api.models.ResponseMetadata
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
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
                        .pageNumber(0)
                        .previousPageToken("U3RhaW5sZXNzIHJvY2tz")
                        .totalItems(0L)
                        .totalPages(0)
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
                        .symbol("AAPL")
                        .cumulativeVolume(12345678L)
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
                )
                .build()

        assertThat(marketDataGetSnapshotsResponse.metadata())
            .isEqualTo(
                ResponseMetadata.builder()
                    .requestId("request_id")
                    .nextPageToken("U3RhaW5sZXNzIHJvY2tz")
                    .pageNumber(0)
                    .previousPageToken("U3RhaW5sZXNzIHJvY2tz")
                    .totalItems(0L)
                    .totalPages(0)
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
                    .symbol("AAPL")
                    .cumulativeVolume(12345678L)
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
                        .pageNumber(0)
                        .previousPageToken("U3RhaW5sZXNzIHJvY2tz")
                        .totalItems(0L)
                        .totalPages(0)
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
                        .symbol("AAPL")
                        .cumulativeVolume(12345678L)
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
