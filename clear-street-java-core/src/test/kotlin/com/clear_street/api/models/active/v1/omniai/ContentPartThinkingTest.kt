// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.omniai

import com.clear_street.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ContentPartThinkingTest {

    @Test
    fun create() {
        val contentPartThinking = ContentPartThinking.builder().addThought("string").build()

        assertThat(contentPartThinking.thoughts()).containsExactly("string")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val contentPartThinking = ContentPartThinking.builder().addThought("string").build()

        val roundtrippedContentPartThinking =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(contentPartThinking),
                jacksonTypeRef<ContentPartThinking>(),
            )

        assertThat(roundtrippedContentPartThinking).isEqualTo(contentPartThinking)
    }
}
