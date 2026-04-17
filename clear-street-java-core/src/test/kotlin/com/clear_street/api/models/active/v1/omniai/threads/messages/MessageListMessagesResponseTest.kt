// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.omniai.threads.messages

import com.clear_street.api.core.JsonValue
import com.clear_street.api.core.jsonMapper
import com.clear_street.api.models.ApiError
import com.clear_street.api.models.ResponseMetadata
import com.clear_street.api.models.active.v1.omniai.ErrorStatus
import com.clear_street.api.models.active.v1.omniai.Message
import com.clear_street.api.models.active.v1.omniai.MessageContent
import com.clear_street.api.models.active.v1.omniai.MessageContentPart
import com.clear_street.api.models.active.v1.omniai.MessageOutcome
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
                .addData(
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
            .containsExactly(
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
                .addData(
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
