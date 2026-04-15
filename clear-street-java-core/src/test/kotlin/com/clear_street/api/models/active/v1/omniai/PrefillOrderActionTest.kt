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
                .addOrder(
                    OrderPayload.builder()
                        .orderType(OrderType.LIMIT)
                        .quantity("100")
                        .securityType(SecurityType.COMMON_STOCK)
                        .side(Side.BUY)
                        .symbol("AAPL")
                        .timeInForce(TimeInForce.DAY)
                        .limitPrice("150.00")
                        .stopPrice("148.00")
                        .strategy(OrderStrategyType.SOR)
                        .build()
                )
                .accountId(19816L)
                .build()

        assertThat(prefillOrderAction.orders())
            .containsExactly(
                OrderPayload.builder()
                    .orderType(OrderType.LIMIT)
                    .quantity("100")
                    .securityType(SecurityType.COMMON_STOCK)
                    .side(Side.BUY)
                    .symbol("AAPL")
                    .timeInForce(TimeInForce.DAY)
                    .limitPrice("150.00")
                    .stopPrice("148.00")
                    .strategy(OrderStrategyType.SOR)
                    .build()
            )
        assertThat(prefillOrderAction.accountId()).contains(19816L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val prefillOrderAction =
            PrefillOrderAction.builder()
                .addOrder(
                    OrderPayload.builder()
                        .orderType(OrderType.LIMIT)
                        .quantity("100")
                        .securityType(SecurityType.COMMON_STOCK)
                        .side(Side.BUY)
                        .symbol("AAPL")
                        .timeInForce(TimeInForce.DAY)
                        .limitPrice("150.00")
                        .stopPrice("148.00")
                        .strategy(OrderStrategyType.SOR)
                        .build()
                )
                .accountId(19816L)
                .build()

        val roundtrippedPrefillOrderAction =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(prefillOrderAction),
                jacksonTypeRef<PrefillOrderAction>(),
            )

        assertThat(roundtrippedPrefillOrderAction).isEqualTo(prefillOrderAction)
    }
}
