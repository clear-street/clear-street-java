// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.omniai.threads

import com.clearstreet.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessageContentTest {

    @Test
    fun create() {
        val messageContent =
            MessageContent.builder()
                .addPart(
                    MessageContentPart.ContentPartText.builder()
                        .text("text")
                        .type(MessageContentPart.ContentPartText.Type.TEXT)
                        .build()
                )
                .build()

        assertThat(messageContent.parts())
            .containsExactly(
                MessageContentPart.ofContentPartText(
                    MessageContentPart.ContentPartText.builder()
                        .text("text")
                        .type(MessageContentPart.ContentPartText.Type.TEXT)
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
                    MessageContentPart.ContentPartText.builder()
                        .text("text")
                        .type(MessageContentPart.ContentPartText.Type.TEXT)
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
