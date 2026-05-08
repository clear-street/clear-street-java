// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.positions

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PositionClosePositionParamsTest {

    @Test
    fun create() {
        PositionClosePositionParams.builder()
            .accountId(0L)
            .instrumentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .cancelOrders(false)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            PositionClosePositionParams.builder()
                .accountId(0L)
                .instrumentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("0")
        assertThat(params._pathParam(1)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            PositionClosePositionParams.builder()
                .accountId(0L)
                .instrumentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .cancelOrders(false)
                .build()

        val body = params._body()

        assertThat(body.cancelOrders()).contains(false)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            PositionClosePositionParams.builder()
                .accountId(0L)
                .instrumentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val body = params._body()
    }
}
