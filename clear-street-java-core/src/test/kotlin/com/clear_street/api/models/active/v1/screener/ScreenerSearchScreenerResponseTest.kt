// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.screener

import com.clear_street.api.core.JsonValue
import com.clear_street.api.core.jsonMapper
import com.clear_street.api.models.ApiError
import com.clear_street.api.models.ResponseMetadata
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ScreenerSearchScreenerResponseTest {

    @Test
    fun create() {
        val screenerSearchScreenerResponse =
            ScreenerSearchScreenerResponse.builder()
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
                    listOf(
                        ScreenerColumn.builder()
                            .field(
                                FieldRef.builder()
                                    .name("market_cap")
                                    .lookback(FieldLookback.ONE_WEEK)
                                    .period(FieldPeriod.QUARTER)
                                    .valueType(FieldType.DECIMAL)
                                    .build()
                            )
                            .name("Market Cap")
                            .value(2890000000000.0)
                            .type("CURR_USD")
                            .build()
                    )
                )
                .build()

        assertThat(screenerSearchScreenerResponse.metadata())
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
        assertThat(screenerSearchScreenerResponse.error())
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
        assertThat(screenerSearchScreenerResponse.data())
            .containsExactly(
                listOf(
                    ScreenerColumn.builder()
                        .field(
                            FieldRef.builder()
                                .name("market_cap")
                                .lookback(FieldLookback.ONE_WEEK)
                                .period(FieldPeriod.QUARTER)
                                .valueType(FieldType.DECIMAL)
                                .build()
                        )
                        .name("Market Cap")
                        .value(2890000000000.0)
                        .type("CURR_USD")
                        .build()
                )
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val screenerSearchScreenerResponse =
            ScreenerSearchScreenerResponse.builder()
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
                    listOf(
                        ScreenerColumn.builder()
                            .field(
                                FieldRef.builder()
                                    .name("market_cap")
                                    .lookback(FieldLookback.ONE_WEEK)
                                    .period(FieldPeriod.QUARTER)
                                    .valueType(FieldType.DECIMAL)
                                    .build()
                            )
                            .name("Market Cap")
                            .value(2890000000000.0)
                            .type("CURR_USD")
                            .build()
                    )
                )
                .build()

        val roundtrippedScreenerSearchScreenerResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(screenerSearchScreenerResponse),
                jacksonTypeRef<ScreenerSearchScreenerResponse>(),
            )

        assertThat(roundtrippedScreenerSearchScreenerResponse)
            .isEqualTo(screenerSearchScreenerResponse)
    }
}
