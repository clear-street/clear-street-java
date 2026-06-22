// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.orders

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OrderSubmitOrdersParamsTest {

    @Test
    fun create() {
        OrderSubmitOrdersParams.builder()
            .accountId(0L)
            .addOrder(
                NewOrderRequest.builder()
                    .orderType(RequestOrderType.LIMIT)
                    .quantity("1")
                    .side(Side.BUY)
                    .timeInForce(RequestTimeInForce.DAY)
                    .id("my-ref-id-20251001-002")
                    .expiresAt(OffsetDateTime.parse("2025-10-15T16:00:00.000000000Z"))
                    .extendedHours(true)
                    .instrumentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .limitOffset("0.50")
                    .limitPrice("48.00")
                    .positionEffect(PositionEffect.OPEN)
                    .stopPrice("52.00")
                    .symbol("TSLA")
                    .trailingOffset("2.00")
                    .trailingOffsetType(TrailingOffsetType.PRICE)
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            OrderSubmitOrdersParams.builder()
                .accountId(0L)
                .addOrder(
                    NewOrderRequest.builder()
                        .orderType(RequestOrderType.LIMIT)
                        .quantity("1")
                        .side(Side.BUY)
                        .timeInForce(RequestTimeInForce.DAY)
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("0")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            OrderSubmitOrdersParams.builder()
                .accountId(0L)
                .addOrder(
                    NewOrderRequest.builder()
                        .orderType(RequestOrderType.LIMIT)
                        .quantity("1")
                        .side(Side.BUY)
                        .timeInForce(RequestTimeInForce.DAY)
                        .id("my-ref-id-20251001-002")
                        .expiresAt(OffsetDateTime.parse("2025-10-15T16:00:00.000000000Z"))
                        .extendedHours(true)
                        .instrumentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .limitOffset("0.50")
                        .limitPrice("48.00")
                        .positionEffect(PositionEffect.OPEN)
                        .stopPrice("52.00")
                        .symbol("TSLA")
                        .trailingOffset("2.00")
                        .trailingOffsetType(TrailingOffsetType.PRICE)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .containsExactly(
                OrderSubmitOrdersParams.Order.ofNewOrderRequest(
                    NewOrderRequest.builder()
                        .orderType(RequestOrderType.LIMIT)
                        .quantity("1")
                        .side(Side.BUY)
                        .timeInForce(RequestTimeInForce.DAY)
                        .id("my-ref-id-20251001-002")
                        .expiresAt(OffsetDateTime.parse("2025-10-15T16:00:00.000000000Z"))
                        .extendedHours(true)
                        .instrumentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .limitOffset("0.50")
                        .limitPrice("48.00")
                        .positionEffect(PositionEffect.OPEN)
                        .stopPrice("52.00")
                        .symbol("TSLA")
                        .trailingOffset("2.00")
                        .trailingOffsetType(TrailingOffsetType.PRICE)
                        .build()
                )
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            OrderSubmitOrdersParams.builder()
                .accountId(0L)
                .addOrder(
                    NewOrderRequest.builder()
                        .orderType(RequestOrderType.LIMIT)
                        .quantity("1")
                        .side(Side.BUY)
                        .timeInForce(RequestTimeInForce.DAY)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .containsExactly(
                OrderSubmitOrdersParams.Order.ofNewOrderRequest(
                    NewOrderRequest.builder()
                        .orderType(RequestOrderType.LIMIT)
                        .quantity("1")
                        .side(Side.BUY)
                        .timeInForce(RequestTimeInForce.DAY)
                        .build()
                )
            )
    }
}
