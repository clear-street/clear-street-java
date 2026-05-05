// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.omniai.threads.messages

import com.clear_street.api.core.JsonValue
import com.clear_street.api.core.jsonMapper
import com.clear_street.api.models.ApiError
import com.clear_street.api.models.ResponseMetadata
import com.clear_street.api.models.v1.omniai.ErrorStatus
import com.clear_street.api.models.v1.omniai.Message
import com.clear_street.api.models.v1.omniai.MessageContent
import com.clear_street.api.models.v1.omniai.MessageContentPart
import com.clear_street.api.models.v1.omniai.MessageOutcome
import com.clear_street.api.models.v1.omniai.MessageRole
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessageGetMessagesResponseTest {

    @Test
    fun create() {
        val messageGetMessagesResponse =
            MessageGetMessagesResponse.builder()
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

        assertThat(messageGetMessagesResponse.metadata())
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
        assertThat(messageGetMessagesResponse.error())
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
        assertThat(messageGetMessagesResponse.data())
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
        val messageGetMessagesResponse =
            MessageGetMessagesResponse.builder()
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

        val roundtrippedMessageGetMessagesResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(messageGetMessagesResponse),
                jacksonTypeRef<MessageGetMessagesResponse>(),
            )

        assertThat(roundtrippedMessageGetMessagesResponse).isEqualTo(messageGetMessagesResponse)
    }
}
