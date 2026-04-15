// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.omniai.threads.messages

import com.clear_street.api.core.JsonValue
import com.clear_street.api.core.jsonMapper
import com.clear_street.api.models.ApiError
import com.clear_street.api.models.ResponseMetadata
import com.clear_street.api.models.active.v1.omniai.ContentPart
import com.clear_street.api.models.active.v1.omniai.ListMessagesResponse
import com.clear_street.api.models.active.v1.omniai.Message
import com.clear_street.api.models.active.v1.omniai.MessageContent
import com.clear_street.api.models.active.v1.omniai.MessageRole
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessageListMessagesResponseTest {

    @Test
    fun create() {
        val messageListMessagesResponse =
            MessageListMessagesResponse.builder()
                .metadata(
                    ResponseMetadata.builder()
                        .requestId("request_id")
                        .nextPageToken("U3RhaW5sZXNzIHJvY2tz")
                        .pageNumber(0)
                        .previousPageToken("U3RhaW5sZXNzIHJvY2tz")
                        .totalItems(0L)
                        .totalPages(0)
                        .build()
                )
                .error(
                    ApiError.builder()
                        .code(400)
                        .message("Order quantity must be greater than zero")
                        .addDetail(
                            ApiError.Detail.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .build()
                )
                .data(
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
                )
                .build()

        assertThat(messageListMessagesResponse.metadata())
            .isEqualTo(
                ResponseMetadata.builder()
                    .requestId("request_id")
                    .nextPageToken("U3RhaW5sZXNzIHJvY2tz")
                    .pageNumber(0)
                    .previousPageToken("U3RhaW5sZXNzIHJvY2tz")
                    .totalItems(0L)
                    .totalPages(0)
                    .build()
            )
        assertThat(messageListMessagesResponse.error())
            .contains(
                ApiError.builder()
                    .code(400)
                    .message("Order quantity must be greater than zero")
                    .addDetail(
                        ApiError.Detail.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .build()
            )
        assertThat(messageListMessagesResponse.data())
            .isEqualTo(
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
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val messageListMessagesResponse =
            MessageListMessagesResponse.builder()
                .metadata(
                    ResponseMetadata.builder()
                        .requestId("request_id")
                        .nextPageToken("U3RhaW5sZXNzIHJvY2tz")
                        .pageNumber(0)
                        .previousPageToken("U3RhaW5sZXNzIHJvY2tz")
                        .totalItems(0L)
                        .totalPages(0)
                        .build()
                )
                .error(
                    ApiError.builder()
                        .code(400)
                        .message("Order quantity must be greater than zero")
                        .addDetail(
                            ApiError.Detail.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .build()
                )
                .data(
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
                )
                .build()

        val roundtrippedMessageListMessagesResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(messageListMessagesResponse),
                jacksonTypeRef<MessageListMessagesResponse>(),
            )

        assertThat(roundtrippedMessageListMessagesResponse).isEqualTo(messageListMessagesResponse)
    }
}
