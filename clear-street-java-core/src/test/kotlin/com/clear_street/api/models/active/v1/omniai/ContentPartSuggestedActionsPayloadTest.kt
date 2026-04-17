// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.omniai

import com.clear_street.api.core.JsonValue
import com.clear_street.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ContentPartSuggestedActionsPayloadTest {

    @Test
    fun create() {
        val contentPartSuggestedActionsPayload =
            ContentPartSuggestedActionsPayload.builder()
                .payload(JsonValue.from(mapOf<String, Any>()))
                .build()

        assertThat(contentPartSuggestedActionsPayload._payload())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val contentPartSuggestedActionsPayload =
            ContentPartSuggestedActionsPayload.builder()
                .payload(JsonValue.from(mapOf<String, Any>()))
                .build()

        val roundtrippedContentPartSuggestedActionsPayload =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(contentPartSuggestedActionsPayload),
                jacksonTypeRef<ContentPartSuggestedActionsPayload>(),
            )

        assertThat(roundtrippedContentPartSuggestedActionsPayload)
            .isEqualTo(contentPartSuggestedActionsPayload)
    }
}
