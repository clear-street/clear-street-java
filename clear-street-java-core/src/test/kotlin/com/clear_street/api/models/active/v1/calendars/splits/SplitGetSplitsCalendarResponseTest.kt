// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.calendars.splits

import com.clear_street.api.core.JsonValue
import com.clear_street.api.core.jsonMapper
import com.clear_street.api.models.ApiError
import com.clear_street.api.models.ResponseMetadata
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SplitGetSplitsCalendarResponseTest {

    @Test
    fun create() {
        val splitGetSplitsCalendarResponse =
            SplitGetSplitsCalendarResponse.builder()
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
                    StockSplitEvent.builder()
                        .date(LocalDate.parse("2025-06-10"))
                        .denominator(1L)
                        .numerator(10L)
                        .symbol("NVDA")
                        .build()
                )
                .build()

        assertThat(splitGetSplitsCalendarResponse.metadata())
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
        assertThat(splitGetSplitsCalendarResponse.error())
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
        assertThat(splitGetSplitsCalendarResponse.data())
            .containsExactly(
                StockSplitEvent.builder()
                    .date(LocalDate.parse("2025-06-10"))
                    .denominator(1L)
                    .numerator(10L)
                    .symbol("NVDA")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val splitGetSplitsCalendarResponse =
            SplitGetSplitsCalendarResponse.builder()
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
                    StockSplitEvent.builder()
                        .date(LocalDate.parse("2025-06-10"))
                        .denominator(1L)
                        .numerator(10L)
                        .symbol("NVDA")
                        .build()
                )
                .build()

        val roundtrippedSplitGetSplitsCalendarResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(splitGetSplitsCalendarResponse),
                jacksonTypeRef<SplitGetSplitsCalendarResponse>(),
            )

        assertThat(roundtrippedSplitGetSplitsCalendarResponse)
            .isEqualTo(splitGetSplitsCalendarResponse)
    }
}
