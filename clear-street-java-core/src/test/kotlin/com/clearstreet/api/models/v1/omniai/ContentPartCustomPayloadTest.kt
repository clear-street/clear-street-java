// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.omniai

import com.clearstreet.api.core.JsonValue
import com.clearstreet.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ContentPartCustomPayloadTest {

    @Test
    fun create() {
        val contentPartCustomPayload =
            ContentPartCustomPayload.builder().payload(JsonValue.from(mapOf<String, Any>())).build()

        assertThat(contentPartCustomPayload._payload())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val contentPartCustomPayload =
            ContentPartCustomPayload.builder().payload(JsonValue.from(mapOf<String, Any>())).build()

        val roundtrippedContentPartCustomPayload =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(contentPartCustomPayload),
                jacksonTypeRef<ContentPartCustomPayload>(),
            )

        assertThat(roundtrippedContentPartCustomPayload).isEqualTo(contentPartCustomPayload)
    }
}
