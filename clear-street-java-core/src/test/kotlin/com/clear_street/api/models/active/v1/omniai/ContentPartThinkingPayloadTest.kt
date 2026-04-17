// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.omniai

import com.clear_street.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ContentPartThinkingPayloadTest {

    @Test
    fun create() {
        val contentPartThinkingPayload =
            ContentPartThinkingPayload.builder().addThought("string").build()

        assertThat(contentPartThinkingPayload.thoughts()).containsExactly("string")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val contentPartThinkingPayload =
            ContentPartThinkingPayload.builder().addThought("string").build()

        val roundtrippedContentPartThinkingPayload =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(contentPartThinkingPayload),
                jacksonTypeRef<ContentPartThinkingPayload>(),
            )

        assertThat(roundtrippedContentPartThinkingPayload).isEqualTo(contentPartThinkingPayload)
    }
}
