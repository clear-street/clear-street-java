// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.privatemarkets

import com.clearstreet.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PrivateMarketGetIoisParamsTest {

    @Test
    fun create() {
        PrivateMarketGetIoisParams.builder().accountId(0L).build()
    }

    @Test
    fun queryParams() {
        val params = PrivateMarketGetIoisParams.builder().accountId(0L).build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("account_id", "0").build())
    }
}
