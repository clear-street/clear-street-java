// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.orders

import com.clear_street.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OrderCancelAllOpenOrdersParamsTest {

    @Test
    fun create() {
        OrderCancelAllOpenOrdersParams.builder()
            .accountId(0L)
            .addInstrumentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .instrumentType(OrderCancelAllOpenOrdersParams.InstrumentType.COMMON_STOCK)
            .side(OrderCancelAllOpenOrdersParams.Side.BUY)
            .type(OrderCancelAllOpenOrdersParams.Type.MARKET)
            .build()
    }

    @Test
    fun pathParams() {
        val params = OrderCancelAllOpenOrdersParams.builder().accountId(0L).build()

        assertThat(params._pathParam(0)).isEqualTo("0")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            OrderCancelAllOpenOrdersParams.builder()
                .accountId(0L)
                .addInstrumentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .instrumentType(OrderCancelAllOpenOrdersParams.InstrumentType.COMMON_STOCK)
                .side(OrderCancelAllOpenOrdersParams.Side.BUY)
                .type(OrderCancelAllOpenOrdersParams.Type.MARKET)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("instrument_ids[0]", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .put("instrument_type", "COMMON_STOCK")
                    .put("side", "BUY")
                    .put("type", "MARKET")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = OrderCancelAllOpenOrdersParams.builder().accountId(0L).build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
