// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.calendars.dividends

import com.clear_street.api.core.JsonValue
import com.clear_street.api.core.jsonMapper
import com.clear_street.api.models.ApiError
import com.clear_street.api.models.ResponseMetadata
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DividendGetDividendsCalendarResponseTest {

    @Test
    fun create() {
        val dividendGetDividendsCalendarResponse =
            DividendGetDividendsCalendarResponse.builder()
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
                    DividendCalendarEvent.builder()
                        .adjustedDividend("0.75")
                        .date(LocalDate.parse("2025-11-19"))
                        .dividend("0.75")
                        .symbol("MSFT")
                        .declarationDate(LocalDate.parse("2025-09-17"))
                        .frequency(DividendFrequency.QUARTERLY)
                        .paymentDate(LocalDate.parse("2025-12-11"))
                        .recordDate(LocalDate.parse("2025-11-20"))
                        .yield("0.02")
                        .build()
                )
                .build()

        assertThat(dividendGetDividendsCalendarResponse.metadata())
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
        assertThat(dividendGetDividendsCalendarResponse.error())
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
        assertThat(dividendGetDividendsCalendarResponse.data())
            .containsExactly(
                DividendCalendarEvent.builder()
                    .adjustedDividend("0.75")
                    .date(LocalDate.parse("2025-11-19"))
                    .dividend("0.75")
                    .symbol("MSFT")
                    .declarationDate(LocalDate.parse("2025-09-17"))
                    .frequency(DividendFrequency.QUARTERLY)
                    .paymentDate(LocalDate.parse("2025-12-11"))
                    .recordDate(LocalDate.parse("2025-11-20"))
                    .yield("0.02")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val dividendGetDividendsCalendarResponse =
            DividendGetDividendsCalendarResponse.builder()
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
                    DividendCalendarEvent.builder()
                        .adjustedDividend("0.75")
                        .date(LocalDate.parse("2025-11-19"))
                        .dividend("0.75")
                        .symbol("MSFT")
                        .declarationDate(LocalDate.parse("2025-09-17"))
                        .frequency(DividendFrequency.QUARTERLY)
                        .paymentDate(LocalDate.parse("2025-12-11"))
                        .recordDate(LocalDate.parse("2025-11-20"))
                        .yield("0.02")
                        .build()
                )
                .build()

        val roundtrippedDividendGetDividendsCalendarResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(dividendGetDividendsCalendarResponse),
                jacksonTypeRef<DividendGetDividendsCalendarResponse>(),
            )

        assertThat(roundtrippedDividendGetDividendsCalendarResponse)
            .isEqualTo(dividendGetDividendsCalendarResponse)
    }
}
