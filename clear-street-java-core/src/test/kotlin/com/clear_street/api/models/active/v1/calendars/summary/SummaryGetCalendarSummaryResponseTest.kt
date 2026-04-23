// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.calendars.summary

import com.clear_street.api.core.JsonValue
import com.clear_street.api.core.jsonMapper
import com.clear_street.api.models.ApiError
import com.clear_street.api.models.ResponseMetadata
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SummaryGetCalendarSummaryResponseTest {

    @Test
    fun create() {
        val summaryGetCalendarSummaryResponse =
            SummaryGetCalendarSummaryResponse.builder()
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
                    CalendarDateSummary.builder()
                        .date(LocalDate.parse("2025-10-28"))
                        .dividendsCount(75L)
                        .earningsCount(150L)
                        .economicEventsCount(20L)
                        .mergersAcquisitionsCount(2L)
                        .stockSplitsCount(5L)
                        .build()
                )
                .build()

        assertThat(summaryGetCalendarSummaryResponse.metadata())
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
        assertThat(summaryGetCalendarSummaryResponse.error())
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
        assertThat(summaryGetCalendarSummaryResponse.data())
            .containsExactly(
                CalendarDateSummary.builder()
                    .date(LocalDate.parse("2025-10-28"))
                    .dividendsCount(75L)
                    .earningsCount(150L)
                    .economicEventsCount(20L)
                    .mergersAcquisitionsCount(2L)
                    .stockSplitsCount(5L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val summaryGetCalendarSummaryResponse =
            SummaryGetCalendarSummaryResponse.builder()
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
                    CalendarDateSummary.builder()
                        .date(LocalDate.parse("2025-10-28"))
                        .dividendsCount(75L)
                        .earningsCount(150L)
                        .economicEventsCount(20L)
                        .mergersAcquisitionsCount(2L)
                        .stockSplitsCount(5L)
                        .build()
                )
                .build()

        val roundtrippedSummaryGetCalendarSummaryResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(summaryGetCalendarSummaryResponse),
                jacksonTypeRef<SummaryGetCalendarSummaryResponse>(),
            )

        assertThat(roundtrippedSummaryGetCalendarSummaryResponse)
            .isEqualTo(summaryGetCalendarSummaryResponse)
    }
}
