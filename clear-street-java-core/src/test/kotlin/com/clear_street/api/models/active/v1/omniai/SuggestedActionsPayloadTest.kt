// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.omniai

import com.clear_street.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SuggestedActionsPayloadTest {

    @Test
    fun create() {
        val suggestedActionsPayload =
            SuggestedActionsPayload.builder()
                .addActionButton(
                    ActionButton.builder()
                        .buttonId("btn_show_aapl_1y")
                        .label("Show AAPL over 1 year")
                        .prompt(
                            PromptButtonAction.builder()
                                .prompt("Show AAPL over the last year")
                                .build()
                        )
                        .structuredAction(
                            StructuredActionButtonAction.builder()
                                .actionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .build()
                        )
                        .build()
                )
                .addActionButton(
                    ActionButton.builder()
                        .buttonId("btn_compare_aapl_spy")
                        .label("Compare AAPL vs SPY")
                        .prompt(
                            PromptButtonAction.builder()
                                .prompt("Compare AAPL vs SPY over 1 year")
                                .build()
                        )
                        .structuredAction(
                            StructuredActionButtonAction.builder()
                                .actionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(suggestedActionsPayload.actionButtons().getOrNull())
            .containsExactly(
                ActionButton.builder()
                    .buttonId("btn_show_aapl_1y")
                    .label("Show AAPL over 1 year")
                    .prompt(
                        PromptButtonAction.builder().prompt("Show AAPL over the last year").build()
                    )
                    .structuredAction(
                        StructuredActionButtonAction.builder()
                            .actionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .build()
                    )
                    .build(),
                ActionButton.builder()
                    .buttonId("btn_compare_aapl_spy")
                    .label("Compare AAPL vs SPY")
                    .prompt(
                        PromptButtonAction.builder()
                            .prompt("Compare AAPL vs SPY over 1 year")
                            .build()
                    )
                    .structuredAction(
                        StructuredActionButtonAction.builder()
                            .actionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .build()
                    )
                    .build(),
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val suggestedActionsPayload =
            SuggestedActionsPayload.builder()
                .addActionButton(
                    ActionButton.builder()
                        .buttonId("btn_show_aapl_1y")
                        .label("Show AAPL over 1 year")
                        .prompt(
                            PromptButtonAction.builder()
                                .prompt("Show AAPL over the last year")
                                .build()
                        )
                        .structuredAction(
                            StructuredActionButtonAction.builder()
                                .actionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .build()
                        )
                        .build()
                )
                .addActionButton(
                    ActionButton.builder()
                        .buttonId("btn_compare_aapl_spy")
                        .label("Compare AAPL vs SPY")
                        .prompt(
                            PromptButtonAction.builder()
                                .prompt("Compare AAPL vs SPY over 1 year")
                                .build()
                        )
                        .structuredAction(
                            StructuredActionButtonAction.builder()
                                .actionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .build()
                        )
                        .build()
                )
                .build()

        val roundtrippedSuggestedActionsPayload =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(suggestedActionsPayload),
                jacksonTypeRef<SuggestedActionsPayload>(),
            )

        assertThat(roundtrippedSuggestedActionsPayload).isEqualTo(suggestedActionsPayload)
    }
}
