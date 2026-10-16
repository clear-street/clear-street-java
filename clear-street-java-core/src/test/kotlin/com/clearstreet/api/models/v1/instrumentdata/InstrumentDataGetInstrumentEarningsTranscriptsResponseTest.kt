// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.instrumentdata

import com.clearstreet.api.core.JsonValue
import com.clearstreet.api.core.jsonMapper
import com.clearstreet.api.models.ApiError
import com.clearstreet.api.models.ResponseMetadata
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InstrumentDataGetInstrumentEarningsTranscriptsResponseTest {

    @Test
    fun create() {
        val instrumentDataGetInstrumentEarningsTranscriptsResponse =
            InstrumentDataGetInstrumentEarningsTranscriptsResponse.builder()
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
                    InstrumentEarningsTranscript.builder()
                        .content(
                            "Operator: Good afternoon, and welcome to the Apple Q3 2025 earnings call..."
                        )
                        .date(LocalDate.parse("2025-07-31"))
                        .period(FiscalQuarter.Q3)
                        .periodType(FiscalPeriodType.QUARTERLY)
                        .year(2025)
                        .build()
                )
                .build()

        assertThat(instrumentDataGetInstrumentEarningsTranscriptsResponse.metadata())
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
        assertThat(instrumentDataGetInstrumentEarningsTranscriptsResponse.error())
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
        assertThat(instrumentDataGetInstrumentEarningsTranscriptsResponse.data())
            .containsExactly(
                InstrumentEarningsTranscript.builder()
                    .content(
                        "Operator: Good afternoon, and welcome to the Apple Q3 2025 earnings call..."
                    )
                    .date(LocalDate.parse("2025-07-31"))
                    .period(FiscalQuarter.Q3)
                    .periodType(FiscalPeriodType.QUARTERLY)
                    .year(2025)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val instrumentDataGetInstrumentEarningsTranscriptsResponse =
            InstrumentDataGetInstrumentEarningsTranscriptsResponse.builder()
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
                    InstrumentEarningsTranscript.builder()
                        .content(
                            "Operator: Good afternoon, and welcome to the Apple Q3 2025 earnings call..."
                        )
                        .date(LocalDate.parse("2025-07-31"))
                        .period(FiscalQuarter.Q3)
                        .periodType(FiscalPeriodType.QUARTERLY)
                        .year(2025)
                        .build()
                )
                .build()

        val roundtrippedInstrumentDataGetInstrumentEarningsTranscriptsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(
                    instrumentDataGetInstrumentEarningsTranscriptsResponse
                ),
                jacksonTypeRef<InstrumentDataGetInstrumentEarningsTranscriptsResponse>(),
            )

        assertThat(roundtrippedInstrumentDataGetInstrumentEarningsTranscriptsResponse)
            .isEqualTo(instrumentDataGetInstrumentEarningsTranscriptsResponse)
    }
}
