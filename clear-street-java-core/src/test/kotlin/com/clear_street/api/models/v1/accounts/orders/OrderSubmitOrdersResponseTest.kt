// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.accounts.orders

import com.clear_street.api.core.JsonValue
import com.clear_street.api.core.jsonMapper
import com.clear_street.api.models.ApiError
import com.clear_street.api.models.ResponseMetadata
import com.clear_street.api.models.v1.SecurityType
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OrderSubmitOrdersResponseTest {

    @Test
    fun create() {
        val orderSubmitOrdersResponse =
            OrderSubmitOrdersResponse.builder()
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
                    Order.builder()
                        .id("0195f6c7-4f64-7e3c-8b0a-1d8e4f5e6a7b")
                        .accountId(19816L)
                        .clientOrderId("my-ref-id-20251001-001")
                        .createdAt(OffsetDateTime.parse("2025-10-31T13:30:00.000000000Z"))
                        .filledQuantity("50")
                        .instrumentId("f47ac10b-58cc-4372-a567-0e02b2c3d479")
                        .instrumentType(SecurityType.COMMON_STOCK)
                        .leavesQuantity("50")
                        .orderType(OrderType.LIMIT)
                        .quantity("100")
                        .side(Side.BUY)
                        .status(OrderStatus.PARTIALLY_FILLED)
                        .symbol("AAPL")
                        .timeInForce(TimeInForce.DAY)
                        .updatedAt(OffsetDateTime.parse("2025-10-31T13:35:10.000000000Z"))
                        .venue("XNMS")
                        .averageFillPrice("149.95")
                        .addDetail("string")
                        .expiresAt(OffsetDateTime.parse("2025-10-15T16:00:00.000000000Z"))
                        .extendedHours(false)
                        .limitOffset("0.10")
                        .limitPrice("150.00")
                        .queueState(QueueState.AWAITING_RELEASE)
                        .releasesAt(OffsetDateTime.parse("2025-10-31T14:30:00.000000000Z"))
                        .stopPrice(null)
                        .trailingOffset("1.25")
                        .trailingOffsetType(TrailingOffsetType.PRICE)
                        .trailingWatermarkPx("150.00")
                        .trailingWatermarkTs(OffsetDateTime.parse("2025-10-31T13:35:10.000000000Z"))
                        .underlyingInstrumentId("a1a2a3a4-b1b2-c1c2-d1d2-d3d4d5d6d7d8")
                        .build()
                )
                .build()

        assertThat(orderSubmitOrdersResponse.metadata())
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
        assertThat(orderSubmitOrdersResponse.error())
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
        assertThat(orderSubmitOrdersResponse.data())
            .containsExactly(
                Order.builder()
                    .id("0195f6c7-4f64-7e3c-8b0a-1d8e4f5e6a7b")
                    .accountId(19816L)
                    .clientOrderId("my-ref-id-20251001-001")
                    .createdAt(OffsetDateTime.parse("2025-10-31T13:30:00.000000000Z"))
                    .filledQuantity("50")
                    .instrumentId("f47ac10b-58cc-4372-a567-0e02b2c3d479")
                    .instrumentType(SecurityType.COMMON_STOCK)
                    .leavesQuantity("50")
                    .orderType(OrderType.LIMIT)
                    .quantity("100")
                    .side(Side.BUY)
                    .status(OrderStatus.PARTIALLY_FILLED)
                    .symbol("AAPL")
                    .timeInForce(TimeInForce.DAY)
                    .updatedAt(OffsetDateTime.parse("2025-10-31T13:35:10.000000000Z"))
                    .venue("XNMS")
                    .averageFillPrice("149.95")
                    .addDetail("string")
                    .expiresAt(OffsetDateTime.parse("2025-10-15T16:00:00.000000000Z"))
                    .extendedHours(false)
                    .limitOffset("0.10")
                    .limitPrice("150.00")
                    .queueState(QueueState.AWAITING_RELEASE)
                    .releasesAt(OffsetDateTime.parse("2025-10-31T14:30:00.000000000Z"))
                    .stopPrice(null)
                    .trailingOffset("1.25")
                    .trailingOffsetType(TrailingOffsetType.PRICE)
                    .trailingWatermarkPx("150.00")
                    .trailingWatermarkTs(OffsetDateTime.parse("2025-10-31T13:35:10.000000000Z"))
                    .underlyingInstrumentId("a1a2a3a4-b1b2-c1c2-d1d2-d3d4d5d6d7d8")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val orderSubmitOrdersResponse =
            OrderSubmitOrdersResponse.builder()
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
                    Order.builder()
                        .id("0195f6c7-4f64-7e3c-8b0a-1d8e4f5e6a7b")
                        .accountId(19816L)
                        .clientOrderId("my-ref-id-20251001-001")
                        .createdAt(OffsetDateTime.parse("2025-10-31T13:30:00.000000000Z"))
                        .filledQuantity("50")
                        .instrumentId("f47ac10b-58cc-4372-a567-0e02b2c3d479")
                        .instrumentType(SecurityType.COMMON_STOCK)
                        .leavesQuantity("50")
                        .orderType(OrderType.LIMIT)
                        .quantity("100")
                        .side(Side.BUY)
                        .status(OrderStatus.PARTIALLY_FILLED)
                        .symbol("AAPL")
                        .timeInForce(TimeInForce.DAY)
                        .updatedAt(OffsetDateTime.parse("2025-10-31T13:35:10.000000000Z"))
                        .venue("XNMS")
                        .averageFillPrice("149.95")
                        .addDetail("string")
                        .expiresAt(OffsetDateTime.parse("2025-10-15T16:00:00.000000000Z"))
                        .extendedHours(false)
                        .limitOffset("0.10")
                        .limitPrice("150.00")
                        .queueState(QueueState.AWAITING_RELEASE)
                        .releasesAt(OffsetDateTime.parse("2025-10-31T14:30:00.000000000Z"))
                        .stopPrice(null)
                        .trailingOffset("1.25")
                        .trailingOffsetType(TrailingOffsetType.PRICE)
                        .trailingWatermarkPx("150.00")
                        .trailingWatermarkTs(OffsetDateTime.parse("2025-10-31T13:35:10.000000000Z"))
                        .underlyingInstrumentId("a1a2a3a4-b1b2-c1c2-d1d2-d3d4d5d6d7d8")
                        .build()
                )
                .build()

        val roundtrippedOrderSubmitOrdersResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(orderSubmitOrdersResponse),
                jacksonTypeRef<OrderSubmitOrdersResponse>(),
            )

        assertThat(roundtrippedOrderSubmitOrdersResponse).isEqualTo(orderSubmitOrdersResponse)
    }
}
