// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.accounts.locates.inventory

import com.clear_street.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InventoryGetLocateInventoryParamsTest {

    @Test
    fun create() {
        InventoryGetLocateInventoryParams.builder().accountId(0L).symbol("symbol").build()
    }

    @Test
    fun pathParams() {
        val params =
            InventoryGetLocateInventoryParams.builder().accountId(0L).symbol("symbol").build()

        assertThat(params._pathParam(0)).isEqualTo("0")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            InventoryGetLocateInventoryParams.builder().accountId(0L).symbol("symbol").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("symbol", "symbol").build())
    }
}
