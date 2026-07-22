// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.orders

import com.clearstreet.api.core.JsonValue
import com.clearstreet.api.core.jsonMapper
import com.clearstreet.api.models.ApiError
import com.clearstreet.api.models.ResponseMetadata
import com.clearstreet.api.models.v1.SecurityType
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OrderCancelOpenOrderResponseTest {

    @Test
    fun create() {
        val orderCancelOpenOrderResponse =
            OrderCancelOpenOrderResponse.builder()
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
                    Order.builder()
                        .id("0195f6c7-4f64-7e3c-8b0a-1d8e4f5e6a7b")
                        .accountId(19816L)
                        .clientOrderId("my-ref-id-20251001-001")
                        .createdAt(OffsetDateTime.parse("2025-10-31T13:30:00.000000000Z"))
                        .filledQuantity("0")
                        .leavesQuantity("1")
                        .orderType(OrderType.LIMIT)
                        .quantity("1")
                        .side(Side.BUY)
                        .status(OrderStatus.PENDING_NEW)
                        .timeInForce(TimeInForce.DAY)
                        .updatedAt(OffsetDateTime.parse("2025-10-31T13:30:00.000000000Z"))
                        .venue("XNAS")
                        .averageFillPrice("47.95")
                        .addDetail("string")
                        .expiresAt(OffsetDateTime.parse("2025-10-15T16:00:00.000000000Z"))
                        .extendedHours(false)
                        .instrumentId("d4d5d6d7-e4e5-f4f5-a4a5-a6a7a8a9aaab")
                        .instrumentType(SecurityType.COMMON_STOCK)
                        .limitOffset("0.50")
                        .limitPrice("48.00")
                        .queueState(QueueState.AWAITING_RELEASE)
                        .releasesAt(OffsetDateTime.parse("2025-10-31T14:30:00.000000000Z"))
                        .stopPrice(null)
                        .symbol("TSLA")
                        .trailingLimitPx("47.50")
                        .trailingOffset("2.00")
                        .trailingOffsetType(TrailingOffsetType.PRICE)
                        .trailingStopPx("48.00")
                        .trailingWatermarkPx("50.00")
                        .trailingWatermarkTs(OffsetDateTime.parse("2025-10-31T13:35:10.000000000Z"))
                        .underlyingInstrumentId("a1a2a3a4-b1b2-c1c2-d1d2-d3d4d5d6d7d8")
                        .build()
                )
                .build()

        assertThat(orderCancelOpenOrderResponse.metadata())
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
        assertThat(orderCancelOpenOrderResponse.error())
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
        assertThat(orderCancelOpenOrderResponse.data())
            .isEqualTo(
                Order.builder()
                    .id("0195f6c7-4f64-7e3c-8b0a-1d8e4f5e6a7b")
                    .accountId(19816L)
                    .clientOrderId("my-ref-id-20251001-001")
                    .createdAt(OffsetDateTime.parse("2025-10-31T13:30:00.000000000Z"))
                    .filledQuantity("0")
                    .leavesQuantity("1")
                    .orderType(OrderType.LIMIT)
                    .quantity("1")
                    .side(Side.BUY)
                    .status(OrderStatus.PENDING_NEW)
                    .timeInForce(TimeInForce.DAY)
                    .updatedAt(OffsetDateTime.parse("2025-10-31T13:30:00.000000000Z"))
                    .venue("XNAS")
                    .averageFillPrice("47.95")
                    .addDetail("string")
                    .expiresAt(OffsetDateTime.parse("2025-10-15T16:00:00.000000000Z"))
                    .extendedHours(false)
                    .instrumentId("d4d5d6d7-e4e5-f4f5-a4a5-a6a7a8a9aaab")
                    .instrumentType(SecurityType.COMMON_STOCK)
                    .limitOffset("0.50")
                    .limitPrice("48.00")
                    .queueState(QueueState.AWAITING_RELEASE)
                    .releasesAt(OffsetDateTime.parse("2025-10-31T14:30:00.000000000Z"))
                    .stopPrice(null)
                    .symbol("TSLA")
                    .trailingLimitPx("47.50")
                    .trailingOffset("2.00")
                    .trailingOffsetType(TrailingOffsetType.PRICE)
                    .trailingStopPx("48.00")
                    .trailingWatermarkPx("50.00")
                    .trailingWatermarkTs(OffsetDateTime.parse("2025-10-31T13:35:10.000000000Z"))
                    .underlyingInstrumentId("a1a2a3a4-b1b2-c1c2-d1d2-d3d4d5d6d7d8")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val orderCancelOpenOrderResponse =
            OrderCancelOpenOrderResponse.builder()
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
                    Order.builder()
                        .id("0195f6c7-4f64-7e3c-8b0a-1d8e4f5e6a7b")
                        .accountId(19816L)
                        .clientOrderId("my-ref-id-20251001-001")
                        .createdAt(OffsetDateTime.parse("2025-10-31T13:30:00.000000000Z"))
                        .filledQuantity("0")
                        .leavesQuantity("1")
                        .orderType(OrderType.LIMIT)
                        .quantity("1")
                        .side(Side.BUY)
                        .status(OrderStatus.PENDING_NEW)
                        .timeInForce(TimeInForce.DAY)
                        .updatedAt(OffsetDateTime.parse("2025-10-31T13:30:00.000000000Z"))
                        .venue("XNAS")
                        .averageFillPrice("47.95")
                        .addDetail("string")
                        .expiresAt(OffsetDateTime.parse("2025-10-15T16:00:00.000000000Z"))
                        .extendedHours(false)
                        .instrumentId("d4d5d6d7-e4e5-f4f5-a4a5-a6a7a8a9aaab")
                        .instrumentType(SecurityType.COMMON_STOCK)
                        .limitOffset("0.50")
                        .limitPrice("48.00")
                        .queueState(QueueState.AWAITING_RELEASE)
                        .releasesAt(OffsetDateTime.parse("2025-10-31T14:30:00.000000000Z"))
                        .stopPrice(null)
                        .symbol("TSLA")
                        .trailingLimitPx("47.50")
                        .trailingOffset("2.00")
                        .trailingOffsetType(TrailingOffsetType.PRICE)
                        .trailingStopPx("48.00")
                        .trailingWatermarkPx("50.00")
                        .trailingWatermarkTs(OffsetDateTime.parse("2025-10-31T13:35:10.000000000Z"))
                        .underlyingInstrumentId("a1a2a3a4-b1b2-c1c2-d1d2-d3d4d5d6d7d8")
                        .build()
                )
                .build()

        val roundtrippedOrderCancelOpenOrderResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(orderCancelOpenOrderResponse),
                jacksonTypeRef<OrderCancelOpenOrderResponse>(),
            )

        assertThat(roundtrippedOrderCancelOpenOrderResponse).isEqualTo(orderCancelOpenOrderResponse)
    }
}
