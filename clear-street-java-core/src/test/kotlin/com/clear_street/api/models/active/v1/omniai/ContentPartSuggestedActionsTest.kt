// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.omniai

import com.clear_street.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ContentPartSuggestedActionsTest {

    @Test
    fun create() {
        val contentPartSuggestedActions =
            ContentPartSuggestedActions.builder()
                .addActionButton(
                    ActionButton.builder()
                        .buttonId("button_id")
                        .label("label")
                        .action(
                            ButtonAction.Prompt.builder()
                                .prompt("prompt")
                                .actionType(ButtonAction.Prompt.ActionType.PROMPT)
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(contentPartSuggestedActions.actionButtons())
            .containsExactly(
                ActionButton.builder()
                    .buttonId("button_id")
                    .label("label")
                    .action(
                        ButtonAction.Prompt.builder()
                            .prompt("prompt")
                            .actionType(ButtonAction.Prompt.ActionType.PROMPT)
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val contentPartSuggestedActions =
            ContentPartSuggestedActions.builder()
                .addActionButton(
                    ActionButton.builder()
                        .buttonId("button_id")
                        .label("label")
                        .action(
                            ButtonAction.Prompt.builder()
                                .prompt("prompt")
                                .actionType(ButtonAction.Prompt.ActionType.PROMPT)
                                .build()
                        )
                        .build()
                )
                .build()

        val roundtrippedContentPartSuggestedActions =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(contentPartSuggestedActions),
                jacksonTypeRef<ContentPartSuggestedActions>(),
            )

        assertThat(roundtrippedContentPartSuggestedActions).isEqualTo(contentPartSuggestedActions)
    }
}
