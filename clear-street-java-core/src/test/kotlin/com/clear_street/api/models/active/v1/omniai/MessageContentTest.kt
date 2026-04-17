// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.omniai

import com.clear_street.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessageContentTest {

    @Test
    fun create() {
        val messageContent =
            MessageContent.builder()
                .addPart(
                    MessageContentPart.UnionMember0.builder()
                        .text("text")
                        .type(MessageContentPart.UnionMember0.Type.TEXT)
                        .build()
                )
                .build()

        assertThat(messageContent.parts())
            .containsExactly(
                MessageContentPart.ofUnionMember0(
                    MessageContentPart.UnionMember0.builder()
                        .text("text")
                        .type(MessageContentPart.UnionMember0.Type.TEXT)
                        .build()
                )
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val messageContent =
            MessageContent.builder()
                .addPart(
                    MessageContentPart.UnionMember0.builder()
                        .text("text")
                        .type(MessageContentPart.UnionMember0.Type.TEXT)
                        .build()
                )
                .build()

        val roundtrippedMessageContent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(messageContent),
                jacksonTypeRef<MessageContent>(),
            )

        assertThat(roundtrippedMessageContent).isEqualTo(messageContent)
    }
}
