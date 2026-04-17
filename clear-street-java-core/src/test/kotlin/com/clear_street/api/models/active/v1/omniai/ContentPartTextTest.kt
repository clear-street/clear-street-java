// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.omniai

import com.clear_street.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ContentPartTextTest {

    @Test
    fun create() {
        val contentPartText = ContentPartText.builder().text("text").build()

        assertThat(contentPartText.text()).isEqualTo("text")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val contentPartText = ContentPartText.builder().text("text").build()

        val roundtrippedContentPartText =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(contentPartText),
                jacksonTypeRef<ContentPartText>(),
            )

        assertThat(roundtrippedContentPartText).isEqualTo(contentPartText)
    }
}
