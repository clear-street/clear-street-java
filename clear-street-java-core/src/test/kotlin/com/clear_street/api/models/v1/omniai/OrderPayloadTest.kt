// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.omniai

import com.clear_street.api.core.jsonMapper
import com.clear_street.api.models.v1.SecurityType
import com.clear_street.api.models.v1.accounts.orders.OrderType
import com.clear_street.api.models.v1.accounts.orders.Side
import com.clear_street.api.models.v1.accounts.orders.TimeInForce
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OrderPayloadTest {

    @Test
    fun create() {
        val orderPayload =
            OrderPayload.builder()
                .instrumentType(SecurityType.COMMON_STOCK)
                .orderType(OrderType.LIMIT)
                .quantity("100")
                .side(Side.BUY)
                .symbol("AAPL")
                .timeInForce(TimeInForce.DAY)
                .limitPrice("150.00")
                .orderId("order_id")
                .stopPrice("148.00")
                .strategy(OrderStrategyType.SOR)
                .build()

        assertThat(orderPayload.instrumentType()).isEqualTo(SecurityType.COMMON_STOCK)
        assertThat(orderPayload.orderType()).isEqualTo(OrderType.LIMIT)
        assertThat(orderPayload.quantity()).isEqualTo("100")
        assertThat(orderPayload.side()).isEqualTo(Side.BUY)
        assertThat(orderPayload.symbol()).isEqualTo("AAPL")
        assertThat(orderPayload.timeInForce()).isEqualTo(TimeInForce.DAY)
        assertThat(orderPayload.limitPrice()).contains("150.00")
        assertThat(orderPayload.orderId()).contains("order_id")
        assertThat(orderPayload.stopPrice()).contains("148.00")
        assertThat(orderPayload.strategy()).contains(OrderStrategyType.SOR)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val orderPayload =
            OrderPayload.builder()
                .instrumentType(SecurityType.COMMON_STOCK)
                .orderType(OrderType.LIMIT)
                .quantity("100")
                .side(Side.BUY)
                .symbol("AAPL")
                .timeInForce(TimeInForce.DAY)
                .limitPrice("150.00")
                .orderId("order_id")
                .stopPrice("148.00")
                .strategy(OrderStrategyType.SOR)
                .build()

        val roundtrippedOrderPayload =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(orderPayload),
                jacksonTypeRef<OrderPayload>(),
            )

        assertThat(roundtrippedOrderPayload).isEqualTo(orderPayload)
    }
}
