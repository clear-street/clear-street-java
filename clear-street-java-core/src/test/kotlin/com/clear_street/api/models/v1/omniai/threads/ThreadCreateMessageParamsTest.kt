// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.omniai.threads

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ThreadCreateMessageParamsTest {

    @Test
    fun create() {
        ThreadCreateMessageParams.builder()
            .threadId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .accountId(19816L)
            .text("Compare that to AMD.")
            .addCapability(ThreadCreateMessageParams.Capability.PREFILL_ORDER)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ThreadCreateMessageParams.builder()
                .threadId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .accountId(19816L)
                .text("Compare that to AMD.")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ThreadCreateMessageParams.builder()
                .threadId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .accountId(19816L)
                .text("Compare that to AMD.")
                .addCapability(ThreadCreateMessageParams.Capability.PREFILL_ORDER)
                .build()

        val body = params._body()

        assertThat(body.accountId()).isEqualTo(19816L)
        assertThat(body.text()).isEqualTo("Compare that to AMD.")
        assertThat(body.capabilities().getOrNull())
            .containsExactly(ThreadCreateMessageParams.Capability.PREFILL_ORDER)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ThreadCreateMessageParams.builder()
                .threadId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .accountId(19816L)
                .text("Compare that to AMD.")
                .build()

        val body = params._body()

        assertThat(body.accountId()).isEqualTo(19816L)
        assertThat(body.text()).isEqualTo("Compare that to AMD.")
    }
}
