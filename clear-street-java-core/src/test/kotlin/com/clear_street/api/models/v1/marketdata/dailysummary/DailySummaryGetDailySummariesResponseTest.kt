// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.marketdata.dailysummary

import com.clear_street.api.core.JsonValue
import com.clear_street.api.core.jsonMapper
import com.clear_street.api.models.ApiError
import com.clear_street.api.models.ResponseMetadata
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DailySummaryGetDailySummariesResponseTest {

    @Test
    fun create() {
        val dailySummaryGetDailySummariesResponse =
            DailySummaryGetDailySummariesResponse.builder()
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
                    DailySummary.builder()
                        .instrumentId("a1a2a3a4-b1b2-c1c2-d1d2-d3d4d5d6d7d8")
                        .high("215.20")
                        .low("210.10")
                        .open("211.00")
                        .symbol("AAPL")
                        .tradeDate(LocalDate.parse("2026-04-23"))
                        .volume(88000000L)
                        .build()
                )
                .build()

        assertThat(dailySummaryGetDailySummariesResponse.metadata())
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
        assertThat(dailySummaryGetDailySummariesResponse.error())
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
        assertThat(dailySummaryGetDailySummariesResponse.data())
            .containsExactly(
                DailySummary.builder()
                    .instrumentId("a1a2a3a4-b1b2-c1c2-d1d2-d3d4d5d6d7d8")
                    .high("215.20")
                    .low("210.10")
                    .open("211.00")
                    .symbol("AAPL")
                    .tradeDate(LocalDate.parse("2026-04-23"))
                    .volume(88000000L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val dailySummaryGetDailySummariesResponse =
            DailySummaryGetDailySummariesResponse.builder()
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
                    DailySummary.builder()
                        .instrumentId("a1a2a3a4-b1b2-c1c2-d1d2-d3d4d5d6d7d8")
                        .high("215.20")
                        .low("210.10")
                        .open("211.00")
                        .symbol("AAPL")
                        .tradeDate(LocalDate.parse("2026-04-23"))
                        .volume(88000000L)
                        .build()
                )
                .build()

        val roundtrippedDailySummaryGetDailySummariesResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(dailySummaryGetDailySummariesResponse),
                jacksonTypeRef<DailySummaryGetDailySummariesResponse>(),
            )

        assertThat(roundtrippedDailySummaryGetDailySummariesResponse)
            .isEqualTo(dailySummaryGetDailySummariesResponse)
    }
}
