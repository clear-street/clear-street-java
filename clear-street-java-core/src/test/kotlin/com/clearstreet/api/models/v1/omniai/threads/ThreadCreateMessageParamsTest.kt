// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.omniai.threads

import com.clearstreet.api.core.JsonValue
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ThreadCreateMessageParamsTest {

    @Test
    fun create() {
        ThreadCreateMessageParams.builder()
            .threadId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .text("Compare that to AMD.")
            .accountId(19816L)
            .addCapability(ThreadCreateMessageParams.Capability.PREFILL_ORDER)
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
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ThreadCreateMessageParams.builder()
                .threadId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
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
                .text("Compare that to AMD.")
                .accountId(19816L)
                .addCapability(ThreadCreateMessageParams.Capability.PREFILL_ORDER)
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
                .build()

        val body = params._body()

        assertThat(body.text()).isEqualTo("Compare that to AMD.")
        assertThat(body.accountId()).contains(19816L)
        assertThat(body.capabilities().getOrNull())
            .containsExactly(ThreadCreateMessageParams.Capability.PREFILL_ORDER)
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
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ThreadCreateMessageParams.builder()
                .threadId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .text("Compare that to AMD.")
                .build()

        val body = params._body()

        assertThat(body.text()).isEqualTo("Compare that to AMD.")
    }
}
