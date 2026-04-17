// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.omniai

import com.clear_street.api.core.JsonValue
import com.clear_street.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessageTest {

    @Test
    fun create() {
        val message =
            Message.builder()
                .contentText("content_text")
                .createdAt("created_at")
                .role(MessageRole.UNSPECIFIED)
                .seq(0L)
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .authorUserId("author_user_id")
                .content(
                    MessageContent.builder()
                        .addPart(
                            ContentPart.Text.builder()
                                .text("text")
                                .type(ContentPart.Text.Type.TEXT)
                                .build()
                        )
                        .build()
                )
                .metadata(JsonValue.from(mapOf<String, Any>()))
                .runId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .threadId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(message.contentText()).isEqualTo("content_text")
        assertThat(message.createdAt()).isEqualTo("created_at")
        assertThat(message.role()).isEqualTo(MessageRole.UNSPECIFIED)
        assertThat(message.seq()).isEqualTo(0L)
        assertThat(message.id()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(message.authorUserId()).contains("author_user_id")
        assertThat(message.content())
            .contains(
                MessageContent.builder()
                    .addPart(
                        ContentPart.Text.builder()
                            .text("text")
                            .type(ContentPart.Text.Type.TEXT)
                            .build()
                    )
                    .build()
            )
        assertThat(message._metadata()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(message.runId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(message.threadId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val message =
            Message.builder()
                .contentText("content_text")
                .createdAt("created_at")
                .role(MessageRole.UNSPECIFIED)
                .seq(0L)
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .authorUserId("author_user_id")
                .content(
                    MessageContent.builder()
                        .addPart(
                            ContentPart.Text.builder()
                                .text("text")
                                .type(ContentPart.Text.Type.TEXT)
                                .build()
                        )
                        .build()
                )
                .metadata(JsonValue.from(mapOf<String, Any>()))
                .runId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .threadId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val roundtrippedMessage =
            jsonMapper.readValue(jsonMapper.writeValueAsString(message), jacksonTypeRef<Message>())

        assertThat(roundtrippedMessage).isEqualTo(message)
    }
}
