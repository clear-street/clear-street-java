// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.omniai

import com.clear_street.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ContentPartTextPayloadTest {

    @Test
    fun create() {
        val contentPartTextPayload = ContentPartTextPayload.builder().text("text").build()

        assertThat(contentPartTextPayload.text()).isEqualTo("text")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val contentPartTextPayload = ContentPartTextPayload.builder().text("text").build()

        val roundtrippedContentPartTextPayload =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(contentPartTextPayload),
                jacksonTypeRef<ContentPartTextPayload>(),
            )

        assertThat(roundtrippedContentPartTextPayload).isEqualTo(contentPartTextPayload)
    }
}
