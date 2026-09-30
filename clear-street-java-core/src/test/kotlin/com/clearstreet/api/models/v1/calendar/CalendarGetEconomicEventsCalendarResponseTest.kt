// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.calendar

import com.clearstreet.api.core.JsonValue
import com.clearstreet.api.core.jsonMapper
import com.clearstreet.api.models.ApiError
import com.clearstreet.api.models.ResponseMetadata
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CalendarGetEconomicEventsCalendarResponseTest {

    @Test
    fun create() {
        val calendarGetEconomicEventsCalendarResponse =
            CalendarGetEconomicEventsCalendarResponse.builder()
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
                    EconomicEvent.builder()
                        .country("US")
                        .name("CPI m/m")
                        .timestamp(OffsetDateTime.parse("2026-09-25T12:30:00.000000000Z"))
                        .actual(null)
                        .change(null)
                        .changePercentage(null)
                        .currency("USD")
                        .estimate("0.30")
                        .impact(EconomicEventImpact.HIGH)
                        .previous("0.20")
                        .unit("%")
                        .build()
                )
                .build()

        assertThat(calendarGetEconomicEventsCalendarResponse.metadata())
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
        assertThat(calendarGetEconomicEventsCalendarResponse.error())
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
        assertThat(calendarGetEconomicEventsCalendarResponse.data())
            .containsExactly(
                EconomicEvent.builder()
                    .country("US")
                    .name("CPI m/m")
                    .timestamp(OffsetDateTime.parse("2026-09-25T12:30:00.000000000Z"))
                    .actual(null)
                    .change(null)
                    .changePercentage(null)
                    .currency("USD")
                    .estimate("0.30")
                    .impact(EconomicEventImpact.HIGH)
                    .previous("0.20")
                    .unit("%")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val calendarGetEconomicEventsCalendarResponse =
            CalendarGetEconomicEventsCalendarResponse.builder()
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
                    EconomicEvent.builder()
                        .country("US")
                        .name("CPI m/m")
                        .timestamp(OffsetDateTime.parse("2026-09-25T12:30:00.000000000Z"))
                        .actual(null)
                        .change(null)
                        .changePercentage(null)
                        .currency("USD")
                        .estimate("0.30")
                        .impact(EconomicEventImpact.HIGH)
                        .previous("0.20")
                        .unit("%")
                        .build()
                )
                .build()

        val roundtrippedCalendarGetEconomicEventsCalendarResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(calendarGetEconomicEventsCalendarResponse),
                jacksonTypeRef<CalendarGetEconomicEventsCalendarResponse>(),
            )

        assertThat(roundtrippedCalendarGetEconomicEventsCalendarResponse)
            .isEqualTo(calendarGetEconomicEventsCalendarResponse)
    }
}
