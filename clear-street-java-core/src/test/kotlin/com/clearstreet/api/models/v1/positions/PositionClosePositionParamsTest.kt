// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.positions

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PositionClosePositionParamsTest {

    @Test
    fun create() {
        PositionClosePositionParams.builder()
            .accountId(0L)
            .instrumentId("x")
            .cancelOrders(false)
            .build()
    }

    @Test
    fun pathParams() {
        val params = PositionClosePositionParams.builder().accountId(0L).instrumentId("x").build()

        assertThat(params._pathParam(0)).isEqualTo("0")
        assertThat(params._pathParam(1)).isEqualTo("x")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            PositionClosePositionParams.builder()
                .accountId(0L)
                .instrumentId("x")
                .cancelOrders(false)
                .build()

        val body = params._body()

        assertThat(body.cancelOrders()).contains(false)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = PositionClosePositionParams.builder().accountId(0L).instrumentId("x").build()

        val body = params._body()
    }
}
