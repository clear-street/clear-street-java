// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.instruments

import com.clearstreet.api.core.JsonValue
import com.clearstreet.api.core.jsonMapper
import com.clearstreet.api.models.ApiError
import com.clearstreet.api.models.ResponseMetadata
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InstrumentGetPredictionEventsResponseTest {

    @Test
    fun create() {
        val instrumentGetPredictionEventsResponse =
            InstrumentGetPredictionEventsResponse.builder()
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
                .data(
                    PredictionEvents.builder()
                        .addEvent(
                            PredictionEvent.builder()
                                .addCategory("string")
                                .code("KXNBA-27")
                                .addMarket(
                                    PredictionMarketSummary.builder()
                                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                        .isLiquidationOnly(true)
                                        .isTradable(true)
                                        .status(PredictionMarketStatus.OPEN)
                                        .symbol("KXNBA-27-MIN")
                                        .closeAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                        .openAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                        .outcome(PredictionMarketOutcome.YES)
                                        .settlementPrice("1")
                                        .title("title")
                                        .build()
                                )
                                .title("title")
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(instrumentGetPredictionEventsResponse.metadata())
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
        assertThat(instrumentGetPredictionEventsResponse.error())
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
        assertThat(instrumentGetPredictionEventsResponse.data())
            .isEqualTo(
                PredictionEvents.builder()
                    .addEvent(
                        PredictionEvent.builder()
                            .addCategory("string")
                            .code("KXNBA-27")
                            .addMarket(
                                PredictionMarketSummary.builder()
                                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .isLiquidationOnly(true)
                                    .isTradable(true)
                                    .status(PredictionMarketStatus.OPEN)
                                    .symbol("KXNBA-27-MIN")
                                    .closeAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .openAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .outcome(PredictionMarketOutcome.YES)
                                    .settlementPrice("1")
                                    .title("title")
                                    .build()
                            )
                            .title("title")
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val instrumentGetPredictionEventsResponse =
            InstrumentGetPredictionEventsResponse.builder()
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
                .data(
                    PredictionEvents.builder()
                        .addEvent(
                            PredictionEvent.builder()
                                .addCategory("string")
                                .code("KXNBA-27")
                                .addMarket(
                                    PredictionMarketSummary.builder()
                                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                        .isLiquidationOnly(true)
                                        .isTradable(true)
                                        .status(PredictionMarketStatus.OPEN)
                                        .symbol("KXNBA-27-MIN")
                                        .closeAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                        .openAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                        .outcome(PredictionMarketOutcome.YES)
                                        .settlementPrice("1")
                                        .title("title")
                                        .build()
                                )
                                .title("title")
                                .build()
                        )
                        .build()
                )
                .build()

        val roundtrippedInstrumentGetPredictionEventsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(instrumentGetPredictionEventsResponse),
                jacksonTypeRef<InstrumentGetPredictionEventsResponse>(),
            )

        assertThat(roundtrippedInstrumentGetPredictionEventsResponse)
            .isEqualTo(instrumentGetPredictionEventsResponse)
    }
}
