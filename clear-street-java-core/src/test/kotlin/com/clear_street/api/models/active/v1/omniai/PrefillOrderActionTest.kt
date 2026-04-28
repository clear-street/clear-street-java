// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.omniai

import com.clear_street.api.core.jsonMapper
import com.clear_street.api.models.active.v1.SecurityType
import com.clear_street.api.models.active.v1.accounts.orders.OrderType
import com.clear_street.api.models.active.v1.accounts.orders.Side
import com.clear_street.api.models.active.v1.accounts.orders.TimeInForce
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PrefillOrderActionTest {

    @Test
    fun create() {
        val prefillOrderAction =
            PrefillOrderAction.builder()
                .actionType(PrefillOrderActionType.NEW)
                .addOrder(
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
                )
                .build()

        assertThat(prefillOrderAction.actionType()).isEqualTo(PrefillOrderActionType.NEW)
        assertThat(prefillOrderAction.orders())
            .containsExactly(
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
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val prefillOrderAction =
            PrefillOrderAction.builder()
                .actionType(PrefillOrderActionType.NEW)
                .addOrder(
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
                )
                .build()

        val roundtrippedPrefillOrderAction =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(prefillOrderAction),
                jacksonTypeRef<PrefillOrderAction>(),
            )

        assertThat(roundtrippedPrefillOrderAction).isEqualTo(prefillOrderAction)
    }
}
