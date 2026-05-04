// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.accounts.positions

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PositionClosePositionsParamsTest {

    @Test
    fun create() {
        PositionClosePositionsParams.builder().accountId(0L).cancelOrders(false).build()
    }

    @Test
    fun pathParams() {
        val params = PositionClosePositionsParams.builder().accountId(0L).build()

        assertThat(params._pathParam(0)).isEqualTo("0")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            PositionClosePositionsParams.builder().accountId(0L).cancelOrders(false).build()

        val body = params._body()

        assertThat(body.cancelOrders()).contains(false)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = PositionClosePositionsParams.builder().accountId(0L).build()

        val body = params._body()
    }
}
