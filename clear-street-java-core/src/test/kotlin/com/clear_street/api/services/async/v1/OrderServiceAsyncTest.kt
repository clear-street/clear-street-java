// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.v1

import com.clear_street.api.client.okhttp.ClearStreetOkHttpClientAsync
import com.clear_street.api.models.v1.SecurityType
import com.clear_street.api.models.v1.orders.OrderCancelAllOpenOrdersParams
import com.clear_street.api.models.v1.orders.OrderCancelOpenOrderParams
import com.clear_street.api.models.v1.orders.OrderGetOrderByIdParams
import com.clear_street.api.models.v1.orders.OrderGetOrdersParams
import com.clear_street.api.models.v1.orders.OrderReplaceOrderParams
import com.clear_street.api.models.v1.orders.OrderSubmitOrdersParams
import com.clear_street.api.models.v1.orders.PositionEffect
import com.clear_street.api.models.v1.orders.RequestOrderType
import com.clear_street.api.models.v1.orders.RequestTimeInForce
import com.clear_street.api.models.v1.orders.Side
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class OrderServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun cancelAllOpenOrders() {
        val client = ClearStreetOkHttpClientAsync.builder().apiKey("My API Key").build()
        val orderServiceAsync = client.v1().orders()

        val responseFuture =
            orderServiceAsync.cancelAllOpenOrders(
                OrderCancelAllOpenOrdersParams.builder()
                    .accountId(0L)
                    .addInstrumentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .instrumentType(OrderCancelAllOpenOrdersParams.InstrumentType.COMMON_STOCK)
                    .side(OrderCancelAllOpenOrdersParams.Side.BUY)
                    .type(OrderCancelAllOpenOrdersParams.Type.MARKET)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun cancelOpenOrder() {
        val client = ClearStreetOkHttpClientAsync.builder().apiKey("My API Key").build()
        val orderServiceAsync = client.v1().orders()

        val responseFuture =
            orderServiceAsync.cancelOpenOrder(
                OrderCancelOpenOrderParams.builder().accountId(0L).orderId("order_id").build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getOrderById() {
        val client = ClearStreetOkHttpClientAsync.builder().apiKey("My API Key").build()
        val orderServiceAsync = client.v1().orders()

        val responseFuture =
            orderServiceAsync.getOrderById(
                OrderGetOrderByIdParams.builder().accountId(0L).orderId("order_id").build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getOrders() {
        val client = ClearStreetOkHttpClientAsync.builder().apiKey("My API Key").build()
        val orderServiceAsync = client.v1().orders()

        val responseFuture =
            orderServiceAsync.getOrders(
                OrderGetOrdersParams.builder()
                    .accountId(0L)
                    .from(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .addInstrumentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .instrumentType(OrderGetOrdersParams.InstrumentType.COMMON_STOCK)
                    .pageSize(1L)
                    .pageToken("U3RhaW5sZXNzIHJvY2tz")
                    .addStatus(OrderGetOrdersParams.Status.PENDING_NEW)
                    .symbol("symbol")
                    .to(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .underlyingInstrumentIds("underlying_instrument_ids")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun replaceOrder() {
        val client = ClearStreetOkHttpClientAsync.builder().apiKey("My API Key").build()
        val orderServiceAsync = client.v1().orders()

        val responseFuture =
            orderServiceAsync.replaceOrder(
                OrderReplaceOrderParams.builder()
                    .accountId(0L)
                    .orderId("order_id")
                    .limitPrice("150.50")
                    .quantity("125")
                    .stopPrice("148.00")
                    .timeInForce(RequestTimeInForce.DAY)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun submitOrders() {
        val client = ClearStreetOkHttpClientAsync.builder().apiKey("My API Key").build()
        val orderServiceAsync = client.v1().orders()

        val responseFuture =
            orderServiceAsync.submitOrders(
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
                                        .positionEffect(PositionEffect.OPEN)
                                        .build(),
                                    OrderSubmitOrdersParams.Order.NewOrderMultilegRequest.Leg
                                        .builder()
                                        .instrumentType(SecurityType.OPTION)
                                        .ratio("ratio")
                                        .security("0193bb84-4db4-78ec-b4fd-cba8be61cf8a")
                                        .side(Side.SELL)
                                        .id("2")
                                        .positionEffect(PositionEffect.OPEN)
                                        .build(),
                                    OrderSubmitOrdersParams.Order.NewOrderMultilegRequest.Leg
                                        .builder()
                                        .instrumentType(SecurityType.OPTION)
                                        .ratio("ratio")
                                        .security("0193bb84-5264-7f20-8fd3-35df82cd6ef0")
                                        .side(Side.BUY)
                                        .id("3")
                                        .positionEffect(PositionEffect.OPEN)
                                        .build(),
                                )
                            )
                            .orderType(RequestOrderType.LIMIT)
                            .timeInForce(RequestTimeInForce.DAY)
                            .id("my-mleg-ref-20251001-001")
                            .limitPrice("0.50")
                            .quantity("1")
                            .build()
                    )
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
