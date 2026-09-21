// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.omniai.threads

import com.clearstreet.api.core.JsonValue
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ThreadCreateThreadParamsTest {

    @Test
    fun create() {
        ThreadCreateThreadParams.builder()
            .type(ThreadCreateThreadParams.Type.INSTANT)
            .accountId(19816L)
            .addCapability(ThreadCreateThreadParams.Capability.PREFILL_ORDER)
            .context(
                TurnContext.builder()
                    .addItem(
                        ContextItem.builder()
                            .data(
                                ContextItem.Data.builder()
                                    .putAdditionalProperty("change_pct", JsonValue.from("bar"))
                                    .putAdditionalProperty("range", JsonValue.from("bar"))
                                    .putAdditionalProperty("ticker", JsonValue.from("bar"))
                                    .build()
                            )
                            .kind("chart")
                            .label("NVDA intraday performance")
                            .capturedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .build()
            )
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
                .type(ThreadCreateThreadParams.Type.INSTANT)
                .accountId(19816L)
                .addCapability(ThreadCreateThreadParams.Capability.PREFILL_ORDER)
                .context(
                    TurnContext.builder()
                        .addItem(
                            ContextItem.builder()
                                .data(
                                    ContextItem.Data.builder()
                                        .putAdditionalProperty("change_pct", JsonValue.from("bar"))
                                        .putAdditionalProperty("range", JsonValue.from("bar"))
                                        .putAdditionalProperty("ticker", JsonValue.from("bar"))
                                        .build()
                                )
                                .kind("chart")
                                .label("NVDA intraday performance")
                                .capturedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .build()
                        )
                        .build()
                )
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

        assertThat(body.type()).isEqualTo(ThreadCreateThreadParams.Type.INSTANT)
        assertThat(body.accountId()).contains(19816L)
        assertThat(body.capabilities().getOrNull())
            .containsExactly(ThreadCreateThreadParams.Capability.PREFILL_ORDER)
        assertThat(body.context())
            .contains(
                TurnContext.builder()
                    .addItem(
                        ContextItem.builder()
                            .data(
                                ContextItem.Data.builder()
                                    .putAdditionalProperty("change_pct", JsonValue.from("bar"))
                                    .putAdditionalProperty("range", JsonValue.from("bar"))
                                    .putAdditionalProperty("ticker", JsonValue.from("bar"))
                                    .build()
                            )
                            .kind("chart")
                            .label("NVDA intraday performance")
                            .capturedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .build()
            )
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
            ThreadCreateThreadParams.builder().type(ThreadCreateThreadParams.Type.INSTANT).build()

        val body = params._body()

        assertThat(body.type()).isEqualTo(ThreadCreateThreadParams.Type.INSTANT)
    }
}
