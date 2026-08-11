// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.services.async.v1

import com.clearstreet.api.TestServerExtension
import com.clearstreet.api.client.okhttp.ClearStreetOkHttpClientAsync
import com.clearstreet.api.models.v1.orders.NewOrderRequest
import com.clearstreet.api.models.v1.orders.OrderCancelAllOpenOrdersParams
import com.clearstreet.api.models.v1.orders.OrderCancelOpenOrderParams
import com.clearstreet.api.models.v1.orders.OrderGetExecutionsParams
import com.clearstreet.api.models.v1.orders.OrderGetOrderByIdParams
import com.clearstreet.api.models.v1.orders.OrderGetOrdersParams
import com.clearstreet.api.models.v1.orders.OrderReplaceOrderParams
import com.clearstreet.api.models.v1.orders.OrderSubmitOrdersParams
import com.clearstreet.api.models.v1.orders.ReplaceOrderRequest
import com.clearstreet.api.models.v1.orders.RequestOrderType
import com.clearstreet.api.models.v1.orders.RequestTimeInForce
import com.clearstreet.api.models.v1.orders.Side
import com.clearstreet.api.models.v1.orders.TrailingOffsetType
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class OrderServiceAsyncTest {

    @Test
    fun cancelAllOpenOrders() {
        val client =
            ClearStreetOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val orderServiceAsync = client.v1().orders()

        val responseFuture =
            orderServiceAsync.cancelAllOpenOrders(
                OrderCancelAllOpenOrdersParams.builder()
                    .accountId(0L)
                    .addInstrumentId("x")
                    .instrumentType(OrderCancelAllOpenOrdersParams.InstrumentType.COMMON_STOCK)
                    .side(OrderCancelAllOpenOrdersParams.Side.BUY)
                    .type(OrderCancelAllOpenOrdersParams.Type.MARKET)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun cancelOpenOrder() {
        val client =
            ClearStreetOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val orderServiceAsync = client.v1().orders()

        val responseFuture =
            orderServiceAsync.cancelOpenOrder(
                OrderCancelOpenOrderParams.builder().accountId(0L).orderId("order_id").build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun getExecutions() {
        val client =
            ClearStreetOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val orderServiceAsync = client.v1().orders()

        val responseFuture =
            orderServiceAsync.getExecutions(
                OrderGetExecutionsParams.builder()
                    .accountId(0L)
                    .from(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .addInstrumentId("x")
                    .addOrderId("string")
                    .pageSize(1L)
                    .pageToken("U3RhaW5sZXNzIHJvY2tz")
                    .to(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .addUnderlyingInstrumentId("x")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun getOrderById() {
        val client =
            ClearStreetOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val orderServiceAsync = client.v1().orders()

        val responseFuture =
            orderServiceAsync.getOrderById(
                OrderGetOrderByIdParams.builder().accountId(0L).orderId("order_id").build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun getOrders() {
        val client =
            ClearStreetOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val orderServiceAsync = client.v1().orders()

        val responseFuture =
            orderServiceAsync.getOrders(
                OrderGetOrdersParams.builder()
                    .accountId(0L)
                    .from(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .addInstrumentId("x")
                    .instrumentType(OrderGetOrdersParams.InstrumentType.COMMON_STOCK)
                    .addOrderId("string")
                    .pageSize(1L)
                    .pageToken("U3RhaW5sZXNzIHJvY2tz")
                    .addStatus(OrderGetOrdersParams.Status.PENDING_NEW)
                    .symbol("symbol")
                    .to(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .addUnderlyingInstrumentId("x")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun replaceOrder() {
        val client =
            ClearStreetOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val orderServiceAsync = client.v1().orders()

        val responseFuture =
            orderServiceAsync.replaceOrder(
                OrderReplaceOrderParams.builder()
                    .accountId(0L)
                    .orderId("order_id")
                    .replaceOrderRequest(
                        ReplaceOrderRequest.builder()
                            .limitPrice("49.00")
                            .quantity("1")
                            .stopPrice("52.00")
                            .build()
                    )
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun submitOrders() {
        val client =
            ClearStreetOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val orderServiceAsync = client.v1().orders()

        val responseFuture =
            orderServiceAsync.submitOrders(
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
                            .instrumentId("x")
                            .limitOffset("0.50")
                            .limitPrice("48.00")
                            .stopPrice("52.00")
                            .symbol("TSLA")
                            .trailingOffset("2.00")
                            .trailingOffsetType(TrailingOffsetType.PRICE)
                            .build()
                    )
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
