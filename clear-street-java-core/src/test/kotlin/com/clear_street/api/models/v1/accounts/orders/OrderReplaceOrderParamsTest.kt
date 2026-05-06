// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.accounts.orders

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OrderReplaceOrderParamsTest {

    @Test
    fun create() {
        OrderReplaceOrderParams.builder()
            .accountId(0L)
            .orderId("order_id")
            .limitPrice("150.50")
            .quantity("125")
            .stopPrice("148.00")
            .timeInForce(RequestTimeInForce.DAY)
            .build()
    }

    @Test
    fun pathParams() {
        val params = OrderReplaceOrderParams.builder().accountId(0L).orderId("order_id").build()

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
                .limitPrice("150.50")
                .quantity("125")
                .stopPrice("148.00")
                .timeInForce(RequestTimeInForce.DAY)
                .build()

        val body = params._body()

        assertThat(body.limitPrice()).contains("150.50")
        assertThat(body.quantity()).contains("125")
        assertThat(body.stopPrice()).contains("148.00")
        assertThat(body.timeInForce()).contains(RequestTimeInForce.DAY)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = OrderReplaceOrderParams.builder().accountId(0L).orderId("order_id").build()

        val body = params._body()
    }
}
