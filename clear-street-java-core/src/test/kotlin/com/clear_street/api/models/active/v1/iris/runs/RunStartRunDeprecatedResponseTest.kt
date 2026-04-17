// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.iris.runs

import com.clear_street.api.core.JsonValue
import com.clear_street.api.core.jsonMapper
import com.clear_street.api.models.ApiError
import com.clear_street.api.models.ResponseMetadata
import com.clear_street.api.models.active.v1.omniai.Capability
import com.clear_street.api.models.active.v1.omniai.ContentPart
import com.clear_street.api.models.active.v1.omniai.Message
import com.clear_street.api.models.active.v1.omniai.MessageContent
import com.clear_street.api.models.active.v1.omniai.MessageRole
import com.clear_street.api.models.active.v1.omniai.Run
import com.clear_street.api.models.active.v1.omniai.RunStatus
import com.clear_street.api.models.active.v1.omniai.StartRunResponse
import com.clear_street.api.models.active.v1.omniai.Thread
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RunStartRunDeprecatedResponseTest {

    @Test
    fun create() {
        val runStartRunDeprecatedResponse =
            RunStartRunDeprecatedResponse.builder()
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
                    StartRunResponse.builder()
                        .run(
                            Run.builder()
                                .createdAt("created_at")
                                .status(RunStatus.UNSPECIFIED)
                                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .addCapability(Capability.NAVIGATE)
                                .endedAt("ended_at")
                                .error(JsonValue.from(mapOf<String, Any>()))
                                .startedAt("started_at")
                                .threadId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .build()
                        )
                        .thread(
                            Thread.builder()
                                .accountId("account_id")
                                .createdAt("created_at")
                                .description("description")
                                .ownerUserId("owner_user_id")
                                .title("title")
                                .updatedAt("updated_at")
                                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .metadata(JsonValue.from(mapOf<String, Any>()))
                                .build()
                        )
                        .userMessage(
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
                        .build()
                )
                .build()

        assertThat(runStartRunDeprecatedResponse.metadata())
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
        assertThat(runStartRunDeprecatedResponse.error())
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
        assertThat(runStartRunDeprecatedResponse.data())
            .isEqualTo(
                StartRunResponse.builder()
                    .run(
                        Run.builder()
                            .createdAt("created_at")
                            .status(RunStatus.UNSPECIFIED)
                            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .addCapability(Capability.NAVIGATE)
                            .endedAt("ended_at")
                            .error(JsonValue.from(mapOf<String, Any>()))
                            .startedAt("started_at")
                            .threadId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .build()
                    )
                    .thread(
                        Thread.builder()
                            .accountId("account_id")
                            .createdAt("created_at")
                            .description("description")
                            .ownerUserId("owner_user_id")
                            .title("title")
                            .updatedAt("updated_at")
                            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .metadata(JsonValue.from(mapOf<String, Any>()))
                            .build()
                    )
                    .userMessage(
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
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val runStartRunDeprecatedResponse =
            RunStartRunDeprecatedResponse.builder()
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
                    StartRunResponse.builder()
                        .run(
                            Run.builder()
                                .createdAt("created_at")
                                .status(RunStatus.UNSPECIFIED)
                                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .addCapability(Capability.NAVIGATE)
                                .endedAt("ended_at")
                                .error(JsonValue.from(mapOf<String, Any>()))
                                .startedAt("started_at")
                                .threadId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .build()
                        )
                        .thread(
                            Thread.builder()
                                .accountId("account_id")
                                .createdAt("created_at")
                                .description("description")
                                .ownerUserId("owner_user_id")
                                .title("title")
                                .updatedAt("updated_at")
                                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .metadata(JsonValue.from(mapOf<String, Any>()))
                                .build()
                        )
                        .userMessage(
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
                        .build()
                )
                .build()

        val roundtrippedRunStartRunDeprecatedResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(runStartRunDeprecatedResponse),
                jacksonTypeRef<RunStartRunDeprecatedResponse>(),
            )

        assertThat(roundtrippedRunStartRunDeprecatedResponse)
            .isEqualTo(runStartRunDeprecatedResponse)
    }
}
