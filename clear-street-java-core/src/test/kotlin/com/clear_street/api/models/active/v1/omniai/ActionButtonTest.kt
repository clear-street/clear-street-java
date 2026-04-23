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
                .buttonId("buttonId")
                .label("label")
                .prompt(PromptButtonAction.builder().prompt("prompt").build())
                .structuredAction(
                    StructuredActionButtonAction.builder()
                        .actionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .build()

        assertThat(actionButton.buttonId()).isEqualTo("buttonId")
        assertThat(actionButton.label()).isEqualTo("label")
        assertThat(actionButton.prompt())
            .contains(PromptButtonAction.builder().prompt("prompt").build())
        assertThat(actionButton.structuredAction())
            .contains(
                StructuredActionButtonAction.builder()
                    .actionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val actionButton =
            ActionButton.builder()
                .buttonId("buttonId")
                .label("label")
                .prompt(PromptButtonAction.builder().prompt("prompt").build())
                .structuredAction(
                    StructuredActionButtonAction.builder()
                        .actionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
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
