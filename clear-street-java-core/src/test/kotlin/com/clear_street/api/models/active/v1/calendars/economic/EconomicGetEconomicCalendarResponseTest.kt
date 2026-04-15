// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.calendars.economic

import com.clear_street.api.core.JsonValue
import com.clear_street.api.core.jsonMapper
import com.clear_street.api.models.ApiError
import com.clear_street.api.models.ResponseMetadata
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EconomicGetEconomicCalendarResponseTest {

    @Test
    fun create() {
        val economicGetEconomicCalendarResponse =
            EconomicGetEconomicCalendarResponse.builder()
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
                    EconomicCalendarEvent.builder()
                        .country("JP")
                        .currency("JPY")
                        .eventName("3-Month Bill Auction")
                        .eventTimestamp(OffsetDateTime.parse("2025-03-01T03:35:00.000000000Z"))
                        .impact(EconomicEventImpact.LOW)
                        .actualValue("-0.096")
                        .changePercent("14.29")
                        .estimatedValue("-0.100")
                        .previousValue("-0.112")
                        .build()
                )
                .build()

        assertThat(economicGetEconomicCalendarResponse.metadata())
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
        assertThat(economicGetEconomicCalendarResponse.error())
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
        assertThat(economicGetEconomicCalendarResponse.data())
            .containsExactly(
                EconomicCalendarEvent.builder()
                    .country("JP")
                    .currency("JPY")
                    .eventName("3-Month Bill Auction")
                    .eventTimestamp(OffsetDateTime.parse("2025-03-01T03:35:00.000000000Z"))
                    .impact(EconomicEventImpact.LOW)
                    .actualValue("-0.096")
                    .changePercent("14.29")
                    .estimatedValue("-0.100")
                    .previousValue("-0.112")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val economicGetEconomicCalendarResponse =
            EconomicGetEconomicCalendarResponse.builder()
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
                    EconomicCalendarEvent.builder()
                        .country("JP")
                        .currency("JPY")
                        .eventName("3-Month Bill Auction")
                        .eventTimestamp(OffsetDateTime.parse("2025-03-01T03:35:00.000000000Z"))
                        .impact(EconomicEventImpact.LOW)
                        .actualValue("-0.096")
                        .changePercent("14.29")
                        .estimatedValue("-0.100")
                        .previousValue("-0.112")
                        .build()
                )
                .build()

        val roundtrippedEconomicGetEconomicCalendarResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(economicGetEconomicCalendarResponse),
                jacksonTypeRef<EconomicGetEconomicCalendarResponse>(),
            )

        assertThat(roundtrippedEconomicGetEconomicCalendarResponse)
            .isEqualTo(economicGetEconomicCalendarResponse)
    }
}
