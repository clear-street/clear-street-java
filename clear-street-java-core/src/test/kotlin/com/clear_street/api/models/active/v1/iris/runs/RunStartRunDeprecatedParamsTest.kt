// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.iris.runs

import com.clear_street.api.models.active.v1.omniai.Capability
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RunStartRunDeprecatedParamsTest {

    @Test
    fun create() {
        RunStartRunDeprecatedParams.builder()
            .accountId("account_id")
            .commandText("command_text")
            .addCapability(Capability.NAVIGATE)
            .threadId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .threadTitle("thread_title")
            .build()
    }

    @Test
    fun body() {
        val params =
            RunStartRunDeprecatedParams.builder()
                .accountId("account_id")
                .commandText("command_text")
                .addCapability(Capability.NAVIGATE)
                .threadId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .threadTitle("thread_title")
                .build()

        val body = params._body()

        assertThat(body.accountId()).isEqualTo("account_id")
        assertThat(body.commandText()).isEqualTo("command_text")
        assertThat(body.capabilities().getOrNull()).containsExactly(Capability.NAVIGATE)
        assertThat(body.threadId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.threadTitle()).contains("thread_title")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            RunStartRunDeprecatedParams.builder()
                .accountId("account_id")
                .commandText("command_text")
                .build()

        val body = params._body()

        assertThat(body.accountId()).isEqualTo("account_id")
        assertThat(body.commandText()).isEqualTo("command_text")
    }
}
