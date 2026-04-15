// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.calendars.earnings

import com.clear_street.api.core.JsonValue
import com.clear_street.api.core.jsonMapper
import com.clear_street.api.models.ApiError
import com.clear_street.api.models.ResponseMetadata
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EarningGetEarningsCalendarResponseTest {

    @Test
    fun create() {
        val earningGetEarningsCalendarResponse =
            EarningGetEarningsCalendarResponse.builder()
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
                    EarningsCalendarEvent.builder()
                        .date(LocalDate.parse("2025-10-28"))
                        .lastUpdated(LocalDate.parse("2025-08-10"))
                        .symbol("AAPL")
                        .epsActual("1.30")
                        .epsEstimated("1.25")
                        .revenueActual("89400000000")
                        .revenueEstimated("88900000000")
                        .build()
                )
                .build()

        assertThat(earningGetEarningsCalendarResponse.metadata())
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
        assertThat(earningGetEarningsCalendarResponse.error())
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
        assertThat(earningGetEarningsCalendarResponse.data())
            .containsExactly(
                EarningsCalendarEvent.builder()
                    .date(LocalDate.parse("2025-10-28"))
                    .lastUpdated(LocalDate.parse("2025-08-10"))
                    .symbol("AAPL")
                    .epsActual("1.30")
                    .epsEstimated("1.25")
                    .revenueActual("89400000000")
                    .revenueEstimated("88900000000")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val earningGetEarningsCalendarResponse =
            EarningGetEarningsCalendarResponse.builder()
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
                    EarningsCalendarEvent.builder()
                        .date(LocalDate.parse("2025-10-28"))
                        .lastUpdated(LocalDate.parse("2025-08-10"))
                        .symbol("AAPL")
                        .epsActual("1.30")
                        .epsEstimated("1.25")
                        .revenueActual("89400000000")
                        .revenueEstimated("88900000000")
                        .build()
                )
                .build()

        val roundtrippedEarningGetEarningsCalendarResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(earningGetEarningsCalendarResponse),
                jacksonTypeRef<EarningGetEarningsCalendarResponse>(),
            )

        assertThat(roundtrippedEarningGetEarningsCalendarResponse)
            .isEqualTo(earningGetEarningsCalendarResponse)
    }
}
