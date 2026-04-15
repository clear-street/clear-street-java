// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.omniai.runs

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RunCancelRunParamsTest {

    @Test
    fun create() {
        RunCancelRunParams.builder()
            .runId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .accountId("account_id")
            .reason("reason")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            RunCancelRunParams.builder()
                .runId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .accountId("account_id")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            RunCancelRunParams.builder()
                .runId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .accountId("account_id")
                .reason("reason")
                .build()

        val body = params._body()

        assertThat(body.accountId()).isEqualTo("account_id")
        assertThat(body.reason()).contains("reason")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            RunCancelRunParams.builder()
                .runId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .accountId("account_id")
                .build()

        val body = params._body()

        assertThat(body.accountId()).isEqualTo("account_id")
    }
}
