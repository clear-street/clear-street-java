// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.omniai

import com.clear_street.api.core.JsonValue
import com.clear_street.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ListMessagesResponseTest {

    @Test
    fun create() {
        val listMessagesResponse =
            ListMessagesResponse.builder()
                .addMessage(
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
                )
                .nextPageToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(listMessagesResponse.messages())
            .containsExactly(
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
            )
        assertThat(listMessagesResponse.nextPageToken())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val listMessagesResponse =
            ListMessagesResponse.builder()
                .addMessage(
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
                )
                .nextPageToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val roundtrippedListMessagesResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(listMessagesResponse),
                jacksonTypeRef<ListMessagesResponse>(),
            )

        assertThat(roundtrippedListMessagesResponse).isEqualTo(listMessagesResponse)
    }
}
