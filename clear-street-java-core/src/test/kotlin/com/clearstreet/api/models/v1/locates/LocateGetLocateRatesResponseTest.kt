// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.locates

import com.clearstreet.api.core.JsonValue
import com.clearstreet.api.core.jsonMapper
import com.clearstreet.api.models.ApiError
import com.clearstreet.api.models.ResponseMetadata
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LocateGetLocateRatesResponseTest {

    @Test
    fun create() {
        val locateGetLocateRatesResponse =
            LocateGetLocateRatesResponse.builder()
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
                    LocateRateResult.builder()
                        .instrument("AAPL")
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
                        .rate(
                            LocateRate.builder()
                                .instrumentId("528ec5c3-cdbf-447c-b995-ec6c83cfbc02")
                                .rate("0.037012")
                                .asOf(OffsetDateTime.parse("2026-09-10T14:33:07.107683Z"))
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(locateGetLocateRatesResponse.metadata())
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
        assertThat(locateGetLocateRatesResponse.error())
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
        assertThat(locateGetLocateRatesResponse.data())
            .containsExactly(
                LocateRateResult.builder()
                    .instrument("AAPL")
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
                    .rate(
                        LocateRate.builder()
                            .instrumentId("528ec5c3-cdbf-447c-b995-ec6c83cfbc02")
                            .rate("0.037012")
                            .asOf(OffsetDateTime.parse("2026-09-10T14:33:07.107683Z"))
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val locateGetLocateRatesResponse =
            LocateGetLocateRatesResponse.builder()
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
                    LocateRateResult.builder()
                        .instrument("AAPL")
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
                        .rate(
                            LocateRate.builder()
                                .instrumentId("528ec5c3-cdbf-447c-b995-ec6c83cfbc02")
                                .rate("0.037012")
                                .asOf(OffsetDateTime.parse("2026-09-10T14:33:07.107683Z"))
                                .build()
                        )
                        .build()
                )
                .build()

        val roundtrippedLocateGetLocateRatesResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(locateGetLocateRatesResponse),
                jacksonTypeRef<LocateGetLocateRatesResponse>(),
            )

        assertThat(roundtrippedLocateGetLocateRatesResponse).isEqualTo(locateGetLocateRatesResponse)
    }
}
