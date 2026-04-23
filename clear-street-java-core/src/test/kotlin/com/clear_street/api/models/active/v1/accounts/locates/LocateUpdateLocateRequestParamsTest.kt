// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.accounts.locates

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LocateUpdateLocateRequestParamsTest {

    @Test
    fun create() {
        LocateUpdateLocateRequestParams.builder().accountId(0L).accept(true).build()
    }

    @Test
    fun pathParams() {
        val params = LocateUpdateLocateRequestParams.builder().accountId(0L).accept(true).build()

        assertThat(params._pathParam(0)).isEqualTo("0")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params = LocateUpdateLocateRequestParams.builder().accountId(0L).accept(true).build()

        val body = params._body()

        assertThat(body.accept()).isEqualTo(true)
    }
}
