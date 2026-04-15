// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.accounts.orders

import com.clear_street.api.core.JsonValue
import com.clear_street.api.core.jsonMapper
import com.clear_street.api.models.ApiError
import com.clear_street.api.models.ResponseMetadata
import com.clear_street.api.models.active.v1.SecurityIdSource
import com.clear_street.api.models.active.v1.SecurityType
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OrderReplaceOrderResponseTest {

    @Test
    fun create() {
        val orderReplaceOrderResponse =
            OrderReplaceOrderResponse.builder()
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
                        .id("my-ref-id-20251001-001")
                        .accountId(19816L)
                        .createdAt(OffsetDateTime.parse("2025-10-31T13:30:00.000000000Z"))
                        .filledQuantity("50")
                        .leavesQuantity("50")
                        .orderType(OrderType.LIMIT)
                        .quantity("100")
                        .securityId("037833100")
                        .securityIdSource(SecurityIdSource.FIGI)
                        .securityType(SecurityType.COMMON_STOCK)
                        .side(Side.BUY)
                        .status(OrderStatus.PARTIALLY_FILLED)
                        .symbol("AAPL")
                        .timeInForce(TimeInForce.DAY)
                        .updatedAt(OffsetDateTime.parse("2025-10-31T13:35:10.000000000Z"))
                        .venue("XNMS")
                        .averageFillPrice("149.95")
                        .addDetail("string")
                        .expiresAt(OffsetDateTime.parse("2025-10-15T16:00:00.000000000Z"))
                        .limitOffset("0.10")
                        .limitPrice("150.00")
                        .stopPrice(null)
                        .strategy(
                            OrderStrategy.Sor.builder()
                                .endAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .startAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .urgency(Urgency.SUPER_PASSIVE)
                                .type(OrderStrategy.Sor.Type.SOR)
                                .build()
                        )
                        .trailingOffsetAmt("1.25")
                        .trailingOffsetAmtType(TrailingOffsetType.PRICE)
                        .trailingWatermarkPx("150.00")
                        .trailingWatermarkTs(OffsetDateTime.parse("2025-10-31T13:35:10.000000000Z"))
                        .build()
                )
                .build()

        assertThat(orderReplaceOrderResponse.metadata())
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
        assertThat(orderReplaceOrderResponse.error())
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
        assertThat(orderReplaceOrderResponse.data())
            .isEqualTo(
                Order.builder()
                    .id("my-ref-id-20251001-001")
                    .accountId(19816L)
                    .createdAt(OffsetDateTime.parse("2025-10-31T13:30:00.000000000Z"))
                    .filledQuantity("50")
                    .leavesQuantity("50")
                    .orderType(OrderType.LIMIT)
                    .quantity("100")
                    .securityId("037833100")
                    .securityIdSource(SecurityIdSource.FIGI)
                    .securityType(SecurityType.COMMON_STOCK)
                    .side(Side.BUY)
                    .status(OrderStatus.PARTIALLY_FILLED)
                    .symbol("AAPL")
                    .timeInForce(TimeInForce.DAY)
                    .updatedAt(OffsetDateTime.parse("2025-10-31T13:35:10.000000000Z"))
                    .venue("XNMS")
                    .averageFillPrice("149.95")
                    .addDetail("string")
                    .expiresAt(OffsetDateTime.parse("2025-10-15T16:00:00.000000000Z"))
                    .limitOffset("0.10")
                    .limitPrice("150.00")
                    .stopPrice(null)
                    .strategy(
                        OrderStrategy.Sor.builder()
                            .endAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .startAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .urgency(Urgency.SUPER_PASSIVE)
                            .type(OrderStrategy.Sor.Type.SOR)
                            .build()
                    )
                    .trailingOffsetAmt("1.25")
                    .trailingOffsetAmtType(TrailingOffsetType.PRICE)
                    .trailingWatermarkPx("150.00")
                    .trailingWatermarkTs(OffsetDateTime.parse("2025-10-31T13:35:10.000000000Z"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val orderReplaceOrderResponse =
            OrderReplaceOrderResponse.builder()
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
                        .id("my-ref-id-20251001-001")
                        .accountId(19816L)
                        .createdAt(OffsetDateTime.parse("2025-10-31T13:30:00.000000000Z"))
                        .filledQuantity("50")
                        .leavesQuantity("50")
                        .orderType(OrderType.LIMIT)
                        .quantity("100")
                        .securityId("037833100")
                        .securityIdSource(SecurityIdSource.FIGI)
                        .securityType(SecurityType.COMMON_STOCK)
                        .side(Side.BUY)
                        .status(OrderStatus.PARTIALLY_FILLED)
                        .symbol("AAPL")
                        .timeInForce(TimeInForce.DAY)
                        .updatedAt(OffsetDateTime.parse("2025-10-31T13:35:10.000000000Z"))
                        .venue("XNMS")
                        .averageFillPrice("149.95")
                        .addDetail("string")
                        .expiresAt(OffsetDateTime.parse("2025-10-15T16:00:00.000000000Z"))
                        .limitOffset("0.10")
                        .limitPrice("150.00")
                        .stopPrice(null)
                        .strategy(
                            OrderStrategy.Sor.builder()
                                .endAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .startAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .urgency(Urgency.SUPER_PASSIVE)
                                .type(OrderStrategy.Sor.Type.SOR)
                                .build()
                        )
                        .trailingOffsetAmt("1.25")
                        .trailingOffsetAmtType(TrailingOffsetType.PRICE)
                        .trailingWatermarkPx("150.00")
                        .trailingWatermarkTs(OffsetDateTime.parse("2025-10-31T13:35:10.000000000Z"))
                        .build()
                )
                .build()

        val roundtrippedOrderReplaceOrderResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(orderReplaceOrderResponse),
                jacksonTypeRef<OrderReplaceOrderResponse>(),
            )

        assertThat(roundtrippedOrderReplaceOrderResponse).isEqualTo(orderReplaceOrderResponse)
    }
}
