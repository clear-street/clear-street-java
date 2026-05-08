// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.instrumentdata

import com.clear_street.api.core.JsonValue
import com.clear_street.api.core.jsonMapper
import com.clear_street.api.models.ApiError
import com.clear_street.api.models.ResponseMetadata
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InstrumentDataGetInstrumentAnalystConsensusResponseTest {

    @Test
    fun create() {
        val instrumentDataGetInstrumentAnalystConsensusResponse =
            InstrumentDataGetInstrumentAnalystConsensusResponse.builder()
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
                .data(
                    InstrumentAnalystConsensus.builder()
                        .date(LocalDate.parse("2024-11-15"))
                        .distribution(
                            AnalystDistribution.builder()
                                .buy(28L)
                                .hold(6L)
                                .sell(2L)
                                .strongBuy(20L)
                                .strongSell(0L)
                                .build()
                        )
                        .priceTarget(
                            PriceTarget.builder()
                                .average("220.00")
                                .currency("USD")
                                .high("250.00")
                                .low("180.00")
                                .build()
                        )
                        .rating(AnalystRating.STRONG_BUY)
                        .build()
                )
                .build()

        assertThat(instrumentDataGetInstrumentAnalystConsensusResponse.metadata())
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
        assertThat(instrumentDataGetInstrumentAnalystConsensusResponse.error())
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
        assertThat(instrumentDataGetInstrumentAnalystConsensusResponse.data())
            .isEqualTo(
                InstrumentAnalystConsensus.builder()
                    .date(LocalDate.parse("2024-11-15"))
                    .distribution(
                        AnalystDistribution.builder()
                            .buy(28L)
                            .hold(6L)
                            .sell(2L)
                            .strongBuy(20L)
                            .strongSell(0L)
                            .build()
                    )
                    .priceTarget(
                        PriceTarget.builder()
                            .average("220.00")
                            .currency("USD")
                            .high("250.00")
                            .low("180.00")
                            .build()
                    )
                    .rating(AnalystRating.STRONG_BUY)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val instrumentDataGetInstrumentAnalystConsensusResponse =
            InstrumentDataGetInstrumentAnalystConsensusResponse.builder()
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
                .data(
                    InstrumentAnalystConsensus.builder()
                        .date(LocalDate.parse("2024-11-15"))
                        .distribution(
                            AnalystDistribution.builder()
                                .buy(28L)
                                .hold(6L)
                                .sell(2L)
                                .strongBuy(20L)
                                .strongSell(0L)
                                .build()
                        )
                        .priceTarget(
                            PriceTarget.builder()
                                .average("220.00")
                                .currency("USD")
                                .high("250.00")
                                .low("180.00")
                                .build()
                        )
                        .rating(AnalystRating.STRONG_BUY)
                        .build()
                )
                .build()

        val roundtrippedInstrumentDataGetInstrumentAnalystConsensusResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(instrumentDataGetInstrumentAnalystConsensusResponse),
                jacksonTypeRef<InstrumentDataGetInstrumentAnalystConsensusResponse>(),
            )

        assertThat(roundtrippedInstrumentDataGetInstrumentAnalystConsensusResponse)
            .isEqualTo(instrumentDataGetInstrumentAnalystConsensusResponse)
    }
}
