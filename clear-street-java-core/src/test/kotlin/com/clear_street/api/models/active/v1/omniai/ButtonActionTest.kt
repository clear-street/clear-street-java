// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.omniai

import com.clear_street.api.core.JsonValue
import com.clear_street.api.core.jsonMapper
import com.clear_street.api.errors.ClearStreetInvalidDataException
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class ButtonActionTest {

    @Test
    fun ofPrompt() {
        val prompt =
            ButtonAction.Prompt.builder()
                .prompt("prompt")
                .actionType(ButtonAction.Prompt.ActionType.PROMPT)
                .build()

        val buttonAction = ButtonAction.ofPrompt(prompt)

        assertThat(buttonAction.prompt()).contains(prompt)
        assertThat(buttonAction.structured()).isEmpty
    }

    @Test
    fun ofPromptRoundtrip() {
        val jsonMapper = jsonMapper()
        val buttonAction =
            ButtonAction.ofPrompt(
                ButtonAction.Prompt.builder()
                    .prompt("prompt")
                    .actionType(ButtonAction.Prompt.ActionType.PROMPT)
                    .build()
            )

        val roundtrippedButtonAction =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(buttonAction),
                jacksonTypeRef<ButtonAction>(),
            )

        assertThat(roundtrippedButtonAction).isEqualTo(buttonAction)
    }

    @Test
    fun ofStructured() {
        val structured =
            ButtonAction.StructuredAction.builder()
                .actionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .actionType(ButtonAction.StructuredAction.ActionType.STRUCTURED_ACTION)
                .build()

        val buttonAction = ButtonAction.ofStructured(structured)

        assertThat(buttonAction.prompt()).isEmpty
        assertThat(buttonAction.structured()).contains(structured)
    }

    @Test
    fun ofStructuredRoundtrip() {
        val jsonMapper = jsonMapper()
        val buttonAction =
            ButtonAction.ofStructured(
                ButtonAction.StructuredAction.builder()
                    .actionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .actionType(ButtonAction.StructuredAction.ActionType.STRUCTURED_ACTION)
                    .build()
            )

        val roundtrippedButtonAction =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(buttonAction),
                jacksonTypeRef<ButtonAction>(),
            )

        assertThat(roundtrippedButtonAction).isEqualTo(buttonAction)
    }

    enum class IncompatibleJsonShapeTestCase(val value: JsonValue) {
        BOOLEAN(JsonValue.from(false)),
        STRING(JsonValue.from("invalid")),
        INTEGER(JsonValue.from(-1)),
        FLOAT(JsonValue.from(3.14)),
        ARRAY(JsonValue.from(listOf("invalid", "array"))),
    }

    @ParameterizedTest
    @EnumSource
    fun incompatibleJsonShapeDeserializesToUnknown(testCase: IncompatibleJsonShapeTestCase) {
        val buttonAction = jsonMapper().convertValue(testCase.value, jacksonTypeRef<ButtonAction>())

        val e = assertThrows<ClearStreetInvalidDataException> { buttonAction.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
