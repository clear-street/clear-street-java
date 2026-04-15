// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.omniai

import com.clear_street.api.core.JsonValue
import com.clear_street.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class StartRunResponseTest {

    @Test
    fun create() {
        val startRunResponse =
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

        assertThat(startRunResponse.run())
            .isEqualTo(
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
        assertThat(startRunResponse.thread())
            .isEqualTo(
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
        assertThat(startRunResponse.userMessage())
            .isEqualTo(
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
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val startRunResponse =
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

        val roundtrippedStartRunResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(startRunResponse),
                jacksonTypeRef<StartRunResponse>(),
            )

        assertThat(roundtrippedStartRunResponse).isEqualTo(startRunResponse)
    }
}
