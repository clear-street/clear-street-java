// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.omniai

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
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .content(
                    MessageContent.builder()
                        .addPart(
                            MessageContentPart.UnionMember0.builder()
                                .text("text")
                                .type(MessageContentPart.UnionMember0.Type.TEXT)
                                .build()
                        )
                        .build()
                )
                .createdAt("created_at")
                .outcome(MessageOutcome.COMPLETED)
                .role(MessageRole.USER)
                .seq(0L)
                .threadId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .error(
                    ErrorStatus.builder()
                        .code("code")
                        .message("message")
                        .details(JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .build()

        assertThat(message.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(message.content())
            .isEqualTo(
                MessageContent.builder()
                    .addPart(
                        MessageContentPart.UnionMember0.builder()
                            .text("text")
                            .type(MessageContentPart.UnionMember0.Type.TEXT)
                            .build()
                    )
                    .build()
            )
        assertThat(message.createdAt()).isEqualTo("created_at")
        assertThat(message.outcome()).isEqualTo(MessageOutcome.COMPLETED)
        assertThat(message.role()).isEqualTo(MessageRole.USER)
        assertThat(message.seq()).isEqualTo(0L)
        assertThat(message.threadId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(message.error())
            .contains(
                ErrorStatus.builder()
                    .code("code")
                    .message("message")
                    .details(JsonValue.from(mapOf<String, Any>()))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val message =
            Message.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .content(
                    MessageContent.builder()
                        .addPart(
                            MessageContentPart.UnionMember0.builder()
                                .text("text")
                                .type(MessageContentPart.UnionMember0.Type.TEXT)
                                .build()
                        )
                        .build()
                )
                .createdAt("created_at")
                .outcome(MessageOutcome.COMPLETED)
                .role(MessageRole.USER)
                .seq(0L)
                .threadId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .error(
                    ErrorStatus.builder()
                        .code("code")
                        .message("message")
                        .details(JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .build()

        val roundtrippedMessage =
            jsonMapper.readValue(jsonMapper.writeValueAsString(message), jacksonTypeRef<Message>())

        assertThat(roundtrippedMessage).isEqualTo(message)
    }
}
