// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.accounts

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AccountGetAccountByIdParamsTest {

    @Test
    fun create() {
        AccountGetAccountByIdParams.builder().accountId(0L).build()
    }

    @Test
    fun pathParams() {
        val params = AccountGetAccountByIdParams.builder().accountId(0L).build()

        assertThat(params._pathParam(0)).isEqualTo("0")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
