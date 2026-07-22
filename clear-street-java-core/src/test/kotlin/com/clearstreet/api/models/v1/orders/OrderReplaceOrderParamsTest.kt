// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.orders

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OrderReplaceOrderParamsTest {

    @Test
    fun create() {
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
    }

    @Test
    fun pathParams() {
        val params =
            OrderReplaceOrderParams.builder()
                .accountId(0L)
                .orderId("order_id")
                .replaceOrderRequest(ReplaceOrderRequest.builder().build())
                .build()

        assertThat(params._pathParam(0)).isEqualTo("0")
        assertThat(params._pathParam(1)).isEqualTo("order_id")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
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

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                ReplaceOrderRequest.builder()
                    .limitPrice("49.00")
                    .quantity("1")
                    .stopPrice("52.00")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            OrderReplaceOrderParams.builder()
                .accountId(0L)
                .orderId("order_id")
                .replaceOrderRequest(ReplaceOrderRequest.builder().build())
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(ReplaceOrderRequest.builder().build())
    }
}
