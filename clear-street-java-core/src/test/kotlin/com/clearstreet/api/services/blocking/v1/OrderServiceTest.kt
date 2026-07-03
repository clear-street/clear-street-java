// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.services.blocking.v1

import com.clearstreet.api.TestServerExtension
import com.clearstreet.api.client.okhttp.ClearStreetOkHttpClient
import com.clearstreet.api.models.v1.orders.NewOrderRequest
import com.clearstreet.api.models.v1.orders.OrderCancelAllOpenOrdersParams
import com.clearstreet.api.models.v1.orders.OrderCancelOpenOrderParams
import com.clearstreet.api.models.v1.orders.OrderGetExecutionsParams
import com.clearstreet.api.models.v1.orders.OrderGetOrderByIdParams
import com.clearstreet.api.models.v1.orders.OrderGetOrdersParams
import com.clearstreet.api.models.v1.orders.OrderReplaceOrderParams
import com.clearstreet.api.models.v1.orders.OrderSubmitOrdersParams
import com.clearstreet.api.models.v1.orders.PositionEffect
import com.clearstreet.api.models.v1.orders.RequestOrderType
import com.clearstreet.api.models.v1.orders.RequestTimeInForce
import com.clearstreet.api.models.v1.orders.Side
import com.clearstreet.api.models.v1.orders.TrailingOffsetType
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class OrderServiceTest {

    @Test
    fun cancelAllOpenOrders() {
        val client =
            ClearStreetOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val orderService = client.v1().orders()

        val response =
            orderService.cancelAllOpenOrders(
                OrderCancelAllOpenOrdersParams.builder()
                    .accountId(0L)
                    .addInstrumentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .instrumentType(OrderCancelAllOpenOrdersParams.InstrumentType.COMMON_STOCK)
                    .side(OrderCancelAllOpenOrdersParams.Side.BUY)
                    .type(OrderCancelAllOpenOrdersParams.Type.MARKET)
                    .build()
            )

        response.validate()
    }

    @Test
    fun cancelOpenOrder() {
        val client =
            ClearStreetOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val orderService = client.v1().orders()

        val response =
            orderService.cancelOpenOrder(
                OrderCancelOpenOrderParams.builder().accountId(0L).orderId("order_id").build()
            )

        response.validate()
    }

    @Test
    fun getExecutions() {
        val client =
            ClearStreetOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val orderService = client.v1().orders()

        val response =
            orderService.getExecutions(
                OrderGetExecutionsParams.builder()
                    .accountId(0L)
                    .from(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .addInstrumentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .pageSize(1L)
                    .pageToken("U3RhaW5sZXNzIHJvY2tz")
                    .to(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )

        response.validate()
    }

    @Test
    fun getOrderById() {
        val client =
            ClearStreetOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val orderService = client.v1().orders()

        val response =
            orderService.getOrderById(
                OrderGetOrderByIdParams.builder().accountId(0L).orderId("order_id").build()
            )

        response.validate()
    }

    @Test
    fun getOrders() {
        val client =
            ClearStreetOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val orderService = client.v1().orders()

        val response =
            orderService.getOrders(
                OrderGetOrdersParams.builder()
                    .accountId(0L)
                    .from(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .addInstrumentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .instrumentType(OrderGetOrdersParams.InstrumentType.COMMON_STOCK)
                    .addOrderId("string")
                    .pageSize(1L)
                    .pageToken("U3RhaW5sZXNzIHJvY2tz")
                    .addStatus(OrderGetOrdersParams.Status.PENDING_NEW)
                    .symbol("symbol")
                    .to(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .addUnderlyingInstrumentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        response.validate()
    }

    @Test
    fun replaceOrder() {
        val client =
            ClearStreetOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val orderService = client.v1().orders()

        val response =
            orderService.replaceOrder(
                OrderReplaceOrderParams.builder()
                    .accountId(0L)
                    .orderId("order_id")
                    .limitPrice("49.00")
                    .quantity("1")
                    .stopPrice("52.00")
                    .timeInForce(RequestTimeInForce.DAY)
                    .build()
            )

        response.validate()
    }

    @Test
    fun submitOrders() {
        val client =
            ClearStreetOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val orderService = client.v1().orders()

        val response =
            orderService.submitOrders(
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
            )

        response.validate()
    }
}
