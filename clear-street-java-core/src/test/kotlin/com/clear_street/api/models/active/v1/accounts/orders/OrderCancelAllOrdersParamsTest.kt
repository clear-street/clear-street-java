// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.accounts.orders

import com.clear_street.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OrderCancelAllOrdersParamsTest {

    @Test
    fun create() {
        OrderCancelAllOrdersParams.builder()
            .accountId(0L)
            .addSecurityId("string")
            .addSecurityIdSource("string")
            .securityType(OrderCancelAllOrdersParams.SecurityType.COMMON_STOCK)
            .side(OrderCancelAllOrdersParams.Side.BUY)
            .type(OrderCancelAllOrdersParams.Type.MARKET)
            .build()
    }

    @Test
    fun pathParams() {
        val params = OrderCancelAllOrdersParams.builder().accountId(0L).build()

        assertThat(params._pathParam(0)).isEqualTo("0")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            OrderCancelAllOrdersParams.builder()
                .accountId(0L)
                .addSecurityId("string")
                .addSecurityIdSource("string")
                .securityType(OrderCancelAllOrdersParams.SecurityType.COMMON_STOCK)
                .side(OrderCancelAllOrdersParams.Side.BUY)
                .type(OrderCancelAllOrdersParams.Type.MARKET)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("security_id[0]", "string")
                    .put("security_id_source[0]", "string")
                    .put("security_type", "COMMON_STOCK")
                    .put("side", "BUY")
                    .put("type", "MARKET")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = OrderCancelAllOrdersParams.builder().accountId(0L).build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
