// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.omniai

import com.clear_street.api.core.JsonValue
import com.clear_street.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ResponseTest {

    @Test
    fun create() {
        val response =
            Response.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .status(ResponseStatus.QUEUED)
                .threadId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .userMessageId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .content(
                    ResponseContent.builder()
                        .addPart(
                            ResponseContentPart.UnionMember0.builder()
                                .text("text")
                                .type(ResponseContentPart.UnionMember0.Type.TEXT)
                                .build()
                        )
                        .build()
                )
                .error(
                    ErrorStatus.builder()
                        .code("code")
                        .message("message")
                        .details(JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .outputMessageId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(response.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(response.status()).isEqualTo(ResponseStatus.QUEUED)
        assertThat(response.threadId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(response.userMessageId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(response.content())
            .contains(
                ResponseContent.builder()
                    .addPart(
                        ResponseContentPart.UnionMember0.builder()
                            .text("text")
                            .type(ResponseContentPart.UnionMember0.Type.TEXT)
                            .build()
                    )
                    .build()
            )
        assertThat(response.error())
            .contains(
                ErrorStatus.builder()
                    .code("code")
                    .message("message")
                    .details(JsonValue.from(mapOf<String, Any>()))
                    .build()
            )
        assertThat(response.outputMessageId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val response =
            Response.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .status(ResponseStatus.QUEUED)
                .threadId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .userMessageId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .content(
                    ResponseContent.builder()
                        .addPart(
                            ResponseContentPart.UnionMember0.builder()
                                .text("text")
                                .type(ResponseContentPart.UnionMember0.Type.TEXT)
                                .build()
                        )
                        .build()
                )
                .error(
                    ErrorStatus.builder()
                        .code("code")
                        .message("message")
                        .details(JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .outputMessageId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val roundtrippedResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(response),
                jacksonTypeRef<Response>(),
            )

        assertThat(roundtrippedResponse).isEqualTo(response)
    }
}
