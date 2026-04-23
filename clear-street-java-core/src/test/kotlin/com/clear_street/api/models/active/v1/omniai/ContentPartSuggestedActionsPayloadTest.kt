// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.omniai

import com.clear_street.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ContentPartSuggestedActionsPayloadTest {

    @Test
    fun create() {
        val contentPartSuggestedActionsPayload =
            ContentPartSuggestedActionsPayload.builder()
                .payload(
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
                )
                .build()

        assertThat(contentPartSuggestedActionsPayload.payload())
            .isEqualTo(
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
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val contentPartSuggestedActionsPayload =
            ContentPartSuggestedActionsPayload.builder()
                .payload(
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
                )
                .build()

        val roundtrippedContentPartSuggestedActionsPayload =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(contentPartSuggestedActionsPayload),
                jacksonTypeRef<ContentPartSuggestedActionsPayload>(),
            )

        assertThat(roundtrippedContentPartSuggestedActionsPayload)
            .isEqualTo(contentPartSuggestedActionsPayload)
    }
}
