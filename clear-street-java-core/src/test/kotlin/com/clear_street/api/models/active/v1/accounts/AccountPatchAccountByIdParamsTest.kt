// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.accounts

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AccountPatchAccountByIdParamsTest {

    @Test
    fun create() {
        AccountPatchAccountByIdParams.builder()
            .accountId(0L)
            .risk(RiskSettings.builder().maxNotional("5000000.00").build())
            .build()
    }

    @Test
    fun pathParams() {
        val params = AccountPatchAccountByIdParams.builder().accountId(0L).build()

        assertThat(params._pathParam(0)).isEqualTo("0")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            AccountPatchAccountByIdParams.builder()
                .accountId(0L)
                .risk(RiskSettings.builder().maxNotional("5000000.00").build())
                .build()

        val body = params._body()

        assertThat(body.risk()).contains(RiskSettings.builder().maxNotional("5000000.00").build())
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = AccountPatchAccountByIdParams.builder().accountId(0L).build()

        val body = params._body()
    }
}
