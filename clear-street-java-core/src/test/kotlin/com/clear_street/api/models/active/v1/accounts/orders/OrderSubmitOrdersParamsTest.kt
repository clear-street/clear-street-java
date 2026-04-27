// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.accounts.orders

import com.clear_street.api.models.active.v1.SecurityType
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OrderSubmitOrdersParamsTest {

    @Test
    fun create() {
        OrderSubmitOrdersParams.builder()
            .accountId(0L)
            .addBody(
                OrderSubmitOrdersParams.Body.NewOrderMultilegRequest.builder()
                    .legs(
                        listOf(
                            OrderSubmitOrdersParams.Body.NewOrderMultilegRequest.Leg.builder()
                                .instrumentType(SecurityType.OPTION)
                                .ratio("ratio")
                                .security("0193bb84-447a-706f-996f-097254663f02")
                                .side(Side.BUY)
                                .id("1")
                                .positionEffect(
                                    OrderSubmitOrdersParams.Body.NewOrderMultilegRequest.Leg
                                        .PositionEffect
                                        .OPEN
                                )
                                .build(),
                            OrderSubmitOrdersParams.Body.NewOrderMultilegRequest.Leg.builder()
                                .instrumentType(SecurityType.OPTION)
                                .ratio("ratio")
                                .security("0193bb84-4db4-78ec-b4fd-cba8be61cf8a")
                                .side(Side.SELL)
                                .id("2")
                                .positionEffect(
                                    OrderSubmitOrdersParams.Body.NewOrderMultilegRequest.Leg
                                        .PositionEffect
                                        .OPEN
                                )
                                .build(),
                            OrderSubmitOrdersParams.Body.NewOrderMultilegRequest.Leg.builder()
                                .instrumentType(SecurityType.OPTION)
                                .ratio("ratio")
                                .security("0193bb84-5264-7f20-8fd3-35df82cd6ef0")
                                .side(Side.BUY)
                                .id("3")
                                .positionEffect(
                                    OrderSubmitOrdersParams.Body.NewOrderMultilegRequest.Leg
                                        .PositionEffect
                                        .OPEN
                                )
                                .build(),
                        )
                    )
                    .orderType(OrderType.LIMIT)
                    .timeInForce(TimeInForce.DAY)
                    .id("my-mleg-ref-20251001-001")
                    .limitPrice("0.50")
                    .quantity("1")
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            OrderSubmitOrdersParams.builder()
                .accountId(0L)
                .addBody(
                    OrderSubmitOrdersParams.Body.NewOrderMultilegRequest.builder()
                        .legs(
                            listOf(
                                OrderSubmitOrdersParams.Body.NewOrderMultilegRequest.Leg.builder()
                                    .instrumentType(SecurityType.OPTION)
                                    .ratio("ratio")
                                    .security("0193bb84-447a-706f-996f-097254663f02")
                                    .side(Side.BUY)
                                    .build(),
                                OrderSubmitOrdersParams.Body.NewOrderMultilegRequest.Leg.builder()
                                    .instrumentType(SecurityType.OPTION)
                                    .ratio("ratio")
                                    .security("0193bb84-4db4-78ec-b4fd-cba8be61cf8a")
                                    .side(Side.SELL)
                                    .build(),
                                OrderSubmitOrdersParams.Body.NewOrderMultilegRequest.Leg.builder()
                                    .instrumentType(SecurityType.OPTION)
                                    .ratio("ratio")
                                    .security("0193bb84-5264-7f20-8fd3-35df82cd6ef0")
                                    .side(Side.BUY)
                                    .build(),
                            )
                        )
                        .orderType(OrderType.LIMIT)
                        .timeInForce(TimeInForce.DAY)
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
                .addBody(
                    OrderSubmitOrdersParams.Body.NewOrderMultilegRequest.builder()
                        .legs(
                            listOf(
                                OrderSubmitOrdersParams.Body.NewOrderMultilegRequest.Leg.builder()
                                    .instrumentType(SecurityType.OPTION)
                                    .ratio("ratio")
                                    .security("0193bb84-447a-706f-996f-097254663f02")
                                    .side(Side.BUY)
                                    .id("1")
                                    .positionEffect(
                                        OrderSubmitOrdersParams.Body.NewOrderMultilegRequest.Leg
                                            .PositionEffect
                                            .OPEN
                                    )
                                    .build(),
                                OrderSubmitOrdersParams.Body.NewOrderMultilegRequest.Leg.builder()
                                    .instrumentType(SecurityType.OPTION)
                                    .ratio("ratio")
                                    .security("0193bb84-4db4-78ec-b4fd-cba8be61cf8a")
                                    .side(Side.SELL)
                                    .id("2")
                                    .positionEffect(
                                        OrderSubmitOrdersParams.Body.NewOrderMultilegRequest.Leg
                                            .PositionEffect
                                            .OPEN
                                    )
                                    .build(),
                                OrderSubmitOrdersParams.Body.NewOrderMultilegRequest.Leg.builder()
                                    .instrumentType(SecurityType.OPTION)
                                    .ratio("ratio")
                                    .security("0193bb84-5264-7f20-8fd3-35df82cd6ef0")
                                    .side(Side.BUY)
                                    .id("3")
                                    .positionEffect(
                                        OrderSubmitOrdersParams.Body.NewOrderMultilegRequest.Leg
                                            .PositionEffect
                                            .OPEN
                                    )
                                    .build(),
                            )
                        )
                        .orderType(OrderType.LIMIT)
                        .timeInForce(TimeInForce.DAY)
                        .id("my-mleg-ref-20251001-001")
                        .limitPrice("0.50")
                        .quantity("1")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .containsExactly(
                OrderSubmitOrdersParams.Body.ofNewOrderMultilegRequest(
                    OrderSubmitOrdersParams.Body.NewOrderMultilegRequest.builder()
                        .legs(
                            listOf(
                                OrderSubmitOrdersParams.Body.NewOrderMultilegRequest.Leg.builder()
                                    .instrumentType(SecurityType.OPTION)
                                    .ratio("ratio")
                                    .security("0193bb84-447a-706f-996f-097254663f02")
                                    .side(Side.BUY)
                                    .id("1")
                                    .positionEffect(
                                        OrderSubmitOrdersParams.Body.NewOrderMultilegRequest.Leg
                                            .PositionEffect
                                            .OPEN
                                    )
                                    .build(),
                                OrderSubmitOrdersParams.Body.NewOrderMultilegRequest.Leg.builder()
                                    .instrumentType(SecurityType.OPTION)
                                    .ratio("ratio")
                                    .security("0193bb84-4db4-78ec-b4fd-cba8be61cf8a")
                                    .side(Side.SELL)
                                    .id("2")
                                    .positionEffect(
                                        OrderSubmitOrdersParams.Body.NewOrderMultilegRequest.Leg
                                            .PositionEffect
                                            .OPEN
                                    )
                                    .build(),
                                OrderSubmitOrdersParams.Body.NewOrderMultilegRequest.Leg.builder()
                                    .instrumentType(SecurityType.OPTION)
                                    .ratio("ratio")
                                    .security("0193bb84-5264-7f20-8fd3-35df82cd6ef0")
                                    .side(Side.BUY)
                                    .id("3")
                                    .positionEffect(
                                        OrderSubmitOrdersParams.Body.NewOrderMultilegRequest.Leg
                                            .PositionEffect
                                            .OPEN
                                    )
                                    .build(),
                            )
                        )
                        .orderType(OrderType.LIMIT)
                        .timeInForce(TimeInForce.DAY)
                        .id("my-mleg-ref-20251001-001")
                        .limitPrice("0.50")
                        .quantity("1")
                        .build()
                )
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            OrderSubmitOrdersParams.builder()
                .accountId(0L)
                .addBody(
                    OrderSubmitOrdersParams.Body.NewOrderMultilegRequest.builder()
                        .legs(
                            listOf(
                                OrderSubmitOrdersParams.Body.NewOrderMultilegRequest.Leg.builder()
                                    .instrumentType(SecurityType.OPTION)
                                    .ratio("ratio")
                                    .security("0193bb84-447a-706f-996f-097254663f02")
                                    .side(Side.BUY)
                                    .build(),
                                OrderSubmitOrdersParams.Body.NewOrderMultilegRequest.Leg.builder()
                                    .instrumentType(SecurityType.OPTION)
                                    .ratio("ratio")
                                    .security("0193bb84-4db4-78ec-b4fd-cba8be61cf8a")
                                    .side(Side.SELL)
                                    .build(),
                                OrderSubmitOrdersParams.Body.NewOrderMultilegRequest.Leg.builder()
                                    .instrumentType(SecurityType.OPTION)
                                    .ratio("ratio")
                                    .security("0193bb84-5264-7f20-8fd3-35df82cd6ef0")
                                    .side(Side.BUY)
                                    .build(),
                            )
                        )
                        .orderType(OrderType.LIMIT)
                        .timeInForce(TimeInForce.DAY)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .containsExactly(
                OrderSubmitOrdersParams.Body.ofNewOrderMultilegRequest(
                    OrderSubmitOrdersParams.Body.NewOrderMultilegRequest.builder()
                        .legs(
                            listOf(
                                OrderSubmitOrdersParams.Body.NewOrderMultilegRequest.Leg.builder()
                                    .instrumentType(SecurityType.OPTION)
                                    .ratio("ratio")
                                    .security("0193bb84-447a-706f-996f-097254663f02")
                                    .side(Side.BUY)
                                    .build(),
                                OrderSubmitOrdersParams.Body.NewOrderMultilegRequest.Leg.builder()
                                    .instrumentType(SecurityType.OPTION)
                                    .ratio("ratio")
                                    .security("0193bb84-4db4-78ec-b4fd-cba8be61cf8a")
                                    .side(Side.SELL)
                                    .build(),
                                OrderSubmitOrdersParams.Body.NewOrderMultilegRequest.Leg.builder()
                                    .instrumentType(SecurityType.OPTION)
                                    .ratio("ratio")
                                    .security("0193bb84-5264-7f20-8fd3-35df82cd6ef0")
                                    .side(Side.BUY)
                                    .build(),
                            )
                        )
                        .orderType(OrderType.LIMIT)
                        .timeInForce(TimeInForce.DAY)
                        .build()
                )
            )
    }
}
