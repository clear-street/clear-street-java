// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.instruments.reporting

import com.clear_street.api.core.JsonValue
import com.clear_street.api.core.jsonMapper
import com.clear_street.api.models.ApiError
import com.clear_street.api.models.ResponseMetadata
import com.clear_street.api.models.active.v1.instruments.InstrumentEarnings
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ReportingGetInstrumentReportingResponseTest {

    @Test
    fun create() {
        val reportingGetInstrumentReportingResponse =
            ReportingGetInstrumentReportingResponse.builder()
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
                    InstrumentEarnings.builder()
                        .date(LocalDate.parse("2025-07-25"))
                        .epsActual("1.35")
                        .epsEstimate("1.30")
                        .epsSurprisePercent("3.8")
                        .revenueActual("391035000000")
                        .revenueEstimate("391025000000")
                        .revenueSurprisePercent("0.05")
                        .build()
                )
                .build()

        assertThat(reportingGetInstrumentReportingResponse.metadata())
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
        assertThat(reportingGetInstrumentReportingResponse.error())
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
        assertThat(reportingGetInstrumentReportingResponse.data())
            .isEqualTo(
                InstrumentEarnings.builder()
                    .date(LocalDate.parse("2025-07-25"))
                    .epsActual("1.35")
                    .epsEstimate("1.30")
                    .epsSurprisePercent("3.8")
                    .revenueActual("391035000000")
                    .revenueEstimate("391025000000")
                    .revenueSurprisePercent("0.05")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val reportingGetInstrumentReportingResponse =
            ReportingGetInstrumentReportingResponse.builder()
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
                    InstrumentEarnings.builder()
                        .date(LocalDate.parse("2025-07-25"))
                        .epsActual("1.35")
                        .epsEstimate("1.30")
                        .epsSurprisePercent("3.8")
                        .revenueActual("391035000000")
                        .revenueEstimate("391025000000")
                        .revenueSurprisePercent("0.05")
                        .build()
                )
                .build()

        val roundtrippedReportingGetInstrumentReportingResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(reportingGetInstrumentReportingResponse),
                jacksonTypeRef<ReportingGetInstrumentReportingResponse>(),
            )

        assertThat(roundtrippedReportingGetInstrumentReportingResponse)
            .isEqualTo(reportingGetInstrumentReportingResponse)
    }
}
