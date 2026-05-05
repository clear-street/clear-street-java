// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.accounts.orders

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OrderGetOrderByIdParamsTest {

    @Test
    fun create() {
        OrderGetOrderByIdParams.builder().accountId(0L).orderId("order_id").build()
    }

    @Test
    fun pathParams() {
        val params = OrderGetOrderByIdParams.builder().accountId(0L).orderId("order_id").build()

        assertThat(params._pathParam(0)).isEqualTo("0")
        assertThat(params._pathParam(1)).isEqualTo("order_id")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
