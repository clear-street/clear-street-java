// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.omniai

import com.clear_street.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionButtonTest {

    @Test
    fun create() {
        val actionButton =
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

        assertThat(actionButton.buttonId()).isEqualTo("button_id")
        assertThat(actionButton.label()).isEqualTo("label")
        assertThat(actionButton.action())
            .contains(
                ButtonAction.ofPrompt(
                    ButtonAction.Prompt.builder()
                        .prompt("prompt")
                        .actionType(ButtonAction.Prompt.ActionType.PROMPT)
                        .build()
                )
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val actionButton =
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

        val roundtrippedActionButton =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(actionButton),
                jacksonTypeRef<ActionButton>(),
            )

        assertThat(roundtrippedActionButton).isEqualTo(actionButton)
    }
}
