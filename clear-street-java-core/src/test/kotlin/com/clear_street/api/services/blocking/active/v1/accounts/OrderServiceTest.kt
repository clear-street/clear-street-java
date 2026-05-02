// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.active.v1.accounts

import com.clear_street.api.client.okhttp.ClearStreetOkHttpClient
import com.clear_street.api.models.active.v1.SecurityType
import com.clear_street.api.models.active.v1.accounts.orders.OrderCancelAllOpenOrdersParams
import com.clear_street.api.models.active.v1.accounts.orders.OrderCancelOpenOrderParams
import com.clear_street.api.models.active.v1.accounts.orders.OrderGetOrderByIdParams
import com.clear_street.api.models.active.v1.accounts.orders.OrderGetOrdersParams
import com.clear_street.api.models.active.v1.accounts.orders.OrderReplaceOrderParams
import com.clear_street.api.models.active.v1.accounts.orders.OrderSubmitOrdersParams
import com.clear_street.api.models.active.v1.accounts.orders.OrderType
import com.clear_street.api.models.active.v1.accounts.orders.Side
import com.clear_street.api.models.active.v1.accounts.orders.TimeInForce
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class OrderServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun cancelAllOpenOrders() {
        val client = ClearStreetOkHttpClient.builder().apiKey("My API Key").build()
        val orderService = client.active().v1().accounts().orders()

        val response =
            orderService.cancelAllOpenOrders(
                OrderCancelAllOpenOrdersParams.builder()
                    .accountId(0L)
                    .instrumentType(OrderCancelAllOpenOrdersParams.InstrumentType.COMMON_STOCK)
                    .addSecurityId("string")
                    .addSecurityIdSource("string")
                    .side(OrderCancelAllOpenOrdersParams.Side.BUY)
                    .type(OrderCancelAllOpenOrdersParams.Type.MARKET)
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun cancelOpenOrder() {
        val client = ClearStreetOkHttpClient.builder().apiKey("My API Key").build()
        val orderService = client.active().v1().accounts().orders()

        val response =
            orderService.cancelOpenOrder(
                OrderCancelOpenOrderParams.builder().accountId(0L).orderId("order_id").build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getOrderById() {
        val client = ClearStreetOkHttpClient.builder().apiKey("My API Key").build()
        val orderService = client.active().v1().accounts().orders()

        val response =
            orderService.getOrderById(
                OrderGetOrderByIdParams.builder().accountId(0L).orderId("order_id").build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getOrders() {
        val client = ClearStreetOkHttpClient.builder().apiKey("My API Key").build()
        val orderService = client.active().v1().accounts().orders()

        val response =
            orderService.getOrders(
                OrderGetOrdersParams.builder()
                    .accountId(0L)
                    .from(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .instrumentType(OrderGetOrdersParams.InstrumentType.COMMON_STOCK)
                    .pageSize(1L)
                    .pageToken("U3RhaW5sZXNzIHJvY2tz")
                    .addSecurityId("string")
                    .addSecurityIdSource("string")
                    .addStatus(OrderGetOrdersParams.Status.PENDING_NEW)
                    .symbol("symbol")
                    .to(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .underlyingInstrumentIds("underlying_instrument_ids")
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun replaceOrder() {
        val client = ClearStreetOkHttpClient.builder().apiKey("My API Key").build()
        val orderService = client.active().v1().accounts().orders()

        val response =
            orderService.replaceOrder(
                OrderReplaceOrderParams.builder()
                    .accountId(0L)
                    .orderId("order_id")
                    .limitPrice("150.50")
                    .quantity("125")
                    .stopPrice("148.00")
                    .timeInForce(TimeInForce.DAY)
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun submitOrders() {
        val client = ClearStreetOkHttpClient.builder().apiKey("My API Key").build()
        val orderService = client.active().v1().accounts().orders()

        val response =
            orderService.submitOrders(
                OrderSubmitOrdersParams.builder()
                    .accountId(0L)
                    .addOrder(
                        OrderSubmitOrdersParams.Order.NewOrderMultilegRequest.builder()
                            .legs(
                                listOf(
                                    OrderSubmitOrdersParams.Order.NewOrderMultilegRequest.Leg
                                        .builder()
                                        .instrumentType(SecurityType.OPTION)
                                        .ratio("ratio")
                                        .security("0193bb84-447a-706f-996f-097254663f02")
                                        .side(Side.BUY)
                                        .id("1")
                                        .positionEffect(
                                            OrderSubmitOrdersParams.Order.NewOrderMultilegRequest
                                                .Leg
                                                .PositionEffect
                                                .OPEN
                                        )
                                        .build(),
                                    OrderSubmitOrdersParams.Order.NewOrderMultilegRequest.Leg
                                        .builder()
                                        .instrumentType(SecurityType.OPTION)
                                        .ratio("ratio")
                                        .security("0193bb84-4db4-78ec-b4fd-cba8be61cf8a")
                                        .side(Side.SELL)
                                        .id("2")
                                        .positionEffect(
                                            OrderSubmitOrdersParams.Order.NewOrderMultilegRequest
                                                .Leg
                                                .PositionEffect
                                                .OPEN
                                        )
                                        .build(),
                                    OrderSubmitOrdersParams.Order.NewOrderMultilegRequest.Leg
                                        .builder()
                                        .instrumentType(SecurityType.OPTION)
                                        .ratio("ratio")
                                        .security("0193bb84-5264-7f20-8fd3-35df82cd6ef0")
                                        .side(Side.BUY)
                                        .id("3")
                                        .positionEffect(
                                            OrderSubmitOrdersParams.Order.NewOrderMultilegRequest
                                                .Leg
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
            )

        response.validate()
    }
}
