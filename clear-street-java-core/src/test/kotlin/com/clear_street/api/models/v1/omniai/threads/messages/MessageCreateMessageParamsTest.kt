// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.omniai.threads.messages

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessageCreateMessageParamsTest {

    @Test
    fun create() {
        MessageCreateMessageParams.builder()
            .threadId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .accountId(19816L)
            .text("Compare that to AMD.")
            .addCapability(MessageCreateMessageParams.Capability.PREFILL_ORDER)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            MessageCreateMessageParams.builder()
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
            MessageCreateMessageParams.builder()
                .threadId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .accountId(19816L)
                .text("Compare that to AMD.")
                .addCapability(MessageCreateMessageParams.Capability.PREFILL_ORDER)
                .build()

        val body = params._body()

        assertThat(body.accountId()).isEqualTo(19816L)
        assertThat(body.text()).isEqualTo("Compare that to AMD.")
        assertThat(body.capabilities().getOrNull())
            .containsExactly(MessageCreateMessageParams.Capability.PREFILL_ORDER)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            MessageCreateMessageParams.builder()
                .threadId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .accountId(19816L)
                .text("Compare that to AMD.")
                .build()

        val body = params._body()

        assertThat(body.accountId()).isEqualTo(19816L)
        assertThat(body.text()).isEqualTo("Compare that to AMD.")
    }
}
