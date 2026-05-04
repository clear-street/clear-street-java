// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.omniai

import com.clear_street.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class StructuredActionButtonActionTest {

    @Test
    fun create() {
        val structuredActionButtonAction =
            StructuredActionButtonAction.builder()
                .actionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(structuredActionButtonAction.actionId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val structuredActionButtonAction =
            StructuredActionButtonAction.builder()
                .actionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val roundtrippedStructuredActionButtonAction =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(structuredActionButtonAction),
                jacksonTypeRef<StructuredActionButtonAction>(),
            )

        assertThat(roundtrippedStructuredActionButtonAction).isEqualTo(structuredActionButtonAction)
    }
}
