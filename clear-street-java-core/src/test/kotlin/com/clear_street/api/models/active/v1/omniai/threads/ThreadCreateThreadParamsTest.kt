// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.omniai.threads

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ThreadCreateThreadParamsTest {

    @Test
    fun create() {
        ThreadCreateThreadParams.builder()
            .accountId(19816L)
            .type(ThreadCreateThreadParams.Type.INSTANT)
            .addCapability(ThreadCreateThreadParams.Capability.PREFILL_ORDER)
            .target(
                ThreadCreateThreadParams.Target.builder()
                    .ticker("ticker")
                    .type(ThreadCreateThreadParams.Target.Type.TICKER)
                    .build()
            )
            .text("What changed in NVDA today?")
            .thesis("thesis")
            .build()
    }

    @Test
    fun body() {
        val params =
            ThreadCreateThreadParams.builder()
                .accountId(19816L)
                .type(ThreadCreateThreadParams.Type.INSTANT)
                .addCapability(ThreadCreateThreadParams.Capability.PREFILL_ORDER)
                .target(
                    ThreadCreateThreadParams.Target.builder()
                        .ticker("ticker")
                        .type(ThreadCreateThreadParams.Target.Type.TICKER)
                        .build()
                )
                .text("What changed in NVDA today?")
                .thesis("thesis")
                .build()

        val body = params._body()

        assertThat(body.accountId()).isEqualTo(19816L)
        assertThat(body.type()).isEqualTo(ThreadCreateThreadParams.Type.INSTANT)
        assertThat(body.capabilities().getOrNull())
            .containsExactly(ThreadCreateThreadParams.Capability.PREFILL_ORDER)
        assertThat(body.target())
            .contains(
                ThreadCreateThreadParams.Target.builder()
                    .ticker("ticker")
                    .type(ThreadCreateThreadParams.Target.Type.TICKER)
                    .build()
            )
        assertThat(body.text()).contains("What changed in NVDA today?")
        assertThat(body.thesis()).contains("thesis")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ThreadCreateThreadParams.builder()
                .accountId(19816L)
                .type(ThreadCreateThreadParams.Type.INSTANT)
                .build()

        val body = params._body()

        assertThat(body.accountId()).isEqualTo(19816L)
        assertThat(body.type()).isEqualTo(ThreadCreateThreadParams.Type.INSTANT)
    }
}
