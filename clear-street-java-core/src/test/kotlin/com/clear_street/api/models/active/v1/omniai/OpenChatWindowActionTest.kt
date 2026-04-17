// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.omniai

import com.clear_street.api.core.JsonValue
import com.clear_street.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OpenChatWindowActionTest {

    @Test
    fun create() {
        val openChatWindowAction =
            OpenChatWindowAction.builder()
                .extras(JsonValue.from(mapOf<String, Any>()))
                .threadId("550e8400-e29b-41d4-a716-446655440000")
                .title("Trading Assistant")
                .build()

        assertThat(openChatWindowAction._extras()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(openChatWindowAction.threadId()).contains("550e8400-e29b-41d4-a716-446655440000")
        assertThat(openChatWindowAction.title()).contains("Trading Assistant")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val openChatWindowAction =
            OpenChatWindowAction.builder()
                .extras(JsonValue.from(mapOf<String, Any>()))
                .threadId("550e8400-e29b-41d4-a716-446655440000")
                .title("Trading Assistant")
                .build()

        val roundtrippedOpenChatWindowAction =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(openChatWindowAction),
                jacksonTypeRef<OpenChatWindowAction>(),
            )

        assertThat(roundtrippedOpenChatWindowAction).isEqualTo(openChatWindowAction)
    }
}
