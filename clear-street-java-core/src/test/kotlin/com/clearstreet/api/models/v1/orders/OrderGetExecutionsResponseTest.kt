// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.orders

import com.clearstreet.api.core.JsonValue
import com.clearstreet.api.core.jsonMapper
import com.clearstreet.api.models.ApiError
import com.clearstreet.api.models.ResponseMetadata
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OrderGetExecutionsResponseTest {

    @Test
    fun create() {
        val orderGetExecutionsResponse =
            OrderGetExecutionsResponse.builder()
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
                    Execution.builder()
                        .id("019d216d-9857-7e23-ae01-edc07126c9e4")
                        .orderId("01928b4d-c000-7000-8000-000000000001")
                        .price("150.25")
                        .quantity("100")
                        .side(Side.BUY)
                        .transactionTime(OffsetDateTime.parse("2026-03-24T19:58:43.798000Z"))
                        .instrumentId("528ec5c3-cdbf-447c-b995-ec6c83cfbc02")
                        .symbol("AAPL")
                        .build()
                )
                .build()

        assertThat(orderGetExecutionsResponse.metadata())
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
        assertThat(orderGetExecutionsResponse.error())
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
        assertThat(orderGetExecutionsResponse.data())
            .containsExactly(
                Execution.builder()
                    .id("019d216d-9857-7e23-ae01-edc07126c9e4")
                    .orderId("01928b4d-c000-7000-8000-000000000001")
                    .price("150.25")
                    .quantity("100")
                    .side(Side.BUY)
                    .transactionTime(OffsetDateTime.parse("2026-03-24T19:58:43.798000Z"))
                    .instrumentId("528ec5c3-cdbf-447c-b995-ec6c83cfbc02")
                    .symbol("AAPL")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val orderGetExecutionsResponse =
            OrderGetExecutionsResponse.builder()
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
                    Execution.builder()
                        .id("019d216d-9857-7e23-ae01-edc07126c9e4")
                        .orderId("01928b4d-c000-7000-8000-000000000001")
                        .price("150.25")
                        .quantity("100")
                        .side(Side.BUY)
                        .transactionTime(OffsetDateTime.parse("2026-03-24T19:58:43.798000Z"))
                        .instrumentId("528ec5c3-cdbf-447c-b995-ec6c83cfbc02")
                        .symbol("AAPL")
                        .build()
                )
                .build()

        val roundtrippedOrderGetExecutionsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(orderGetExecutionsResponse),
                jacksonTypeRef<OrderGetExecutionsResponse>(),
            )

        assertThat(roundtrippedOrderGetExecutionsResponse).isEqualTo(orderGetExecutionsResponse)
    }
}
