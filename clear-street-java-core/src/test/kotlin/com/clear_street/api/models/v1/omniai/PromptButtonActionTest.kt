// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.omniai

import com.clear_street.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PromptButtonActionTest {

    @Test
    fun create() {
        val promptButtonAction = PromptButtonAction.builder().prompt("prompt").build()

        assertThat(promptButtonAction.prompt()).isEqualTo("prompt")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val promptButtonAction = PromptButtonAction.builder().prompt("prompt").build()

        val roundtrippedPromptButtonAction =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(promptButtonAction),
                jacksonTypeRef<PromptButtonAction>(),
            )

        assertThat(roundtrippedPromptButtonAction).isEqualTo(promptButtonAction)
    }
}
