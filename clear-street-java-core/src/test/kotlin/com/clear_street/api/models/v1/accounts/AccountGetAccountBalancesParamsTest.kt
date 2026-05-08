// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.accounts

import com.clear_street.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AccountGetAccountBalancesParamsTest {

    @Test
    fun create() {
        AccountGetAccountBalancesParams.builder()
            .accountId(0L)
            .topMarginContributorsLimit(1)
            .build()
    }

    @Test
    fun pathParams() {
        val params = AccountGetAccountBalancesParams.builder().accountId(0L).build()

        assertThat(params._pathParam(0)).isEqualTo("0")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            AccountGetAccountBalancesParams.builder()
                .accountId(0L)
                .topMarginContributorsLimit(1)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("top_margin_contributors_limit", "1").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = AccountGetAccountBalancesParams.builder().accountId(0L).build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
