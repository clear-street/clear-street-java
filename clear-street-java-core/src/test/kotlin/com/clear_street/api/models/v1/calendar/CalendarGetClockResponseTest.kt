// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.calendar

import com.clear_street.api.core.JsonValue
import com.clear_street.api.core.jsonMapper
import com.clear_street.api.models.ApiError
import com.clear_street.api.models.ResponseMetadata
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CalendarGetClockResponseTest {

    @Test
    fun create() {
        val calendarGetClockResponse =
            CalendarGetClockResponse.builder()
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
                    ClockDetail.builder()
                        .clock(OffsetDateTime.parse("2025-03-01T03:35:00.000000000Z"))
                        .build()
                )
                .build()

        assertThat(calendarGetClockResponse.metadata())
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
        assertThat(calendarGetClockResponse.error())
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
        assertThat(calendarGetClockResponse.data())
            .isEqualTo(
                ClockDetail.builder()
                    .clock(OffsetDateTime.parse("2025-03-01T03:35:00.000000000Z"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val calendarGetClockResponse =
            CalendarGetClockResponse.builder()
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
                    ClockDetail.builder()
                        .clock(OffsetDateTime.parse("2025-03-01T03:35:00.000000000Z"))
                        .build()
                )
                .build()

        val roundtrippedCalendarGetClockResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(calendarGetClockResponse),
                jacksonTypeRef<CalendarGetClockResponse>(),
            )

        assertThat(roundtrippedCalendarGetClockResponse).isEqualTo(calendarGetClockResponse)
    }
}
