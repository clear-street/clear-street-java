// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.omniai.responses

import com.clearstreet.api.core.JsonValue
import com.clearstreet.api.core.jsonMapper
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
                .content(
                    ResponseContent.builder()
                        .addPart(
                            ResponseContentPart.ContentPartText.builder()
                                .text("text")
                                .type(ResponseContentPart.ContentPartText.Type.TEXT)
                                .build()
                        )
                        .build()
                )
                .continuedInResponseId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .error(
                    ErrorStatus.builder()
                        .code("code")
                        .message("message")
                        .details(JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .outputMessageId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .outputMessageSeq(0L)
                .userMessageId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .userMessageSeq(0L)
                .build()

        assertThat(response.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(response.status()).isEqualTo(ResponseStatus.QUEUED)
        assertThat(response.threadId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(response.content())
            .contains(
                ResponseContent.builder()
                    .addPart(
                        ResponseContentPart.ContentPartText.builder()
                            .text("text")
                            .type(ResponseContentPart.ContentPartText.Type.TEXT)
                            .build()
                    )
                    .build()
            )
        assertThat(response.continuedInResponseId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(response.error())
            .contains(
                ErrorStatus.builder()
                    .code("code")
                    .message("message")
                    .details(JsonValue.from(mapOf<String, Any>()))
                    .build()
            )
        assertThat(response.outputMessageId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(response.outputMessageSeq()).contains(0L)
        assertThat(response.userMessageId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(response.userMessageSeq()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val response =
            Response.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .status(ResponseStatus.QUEUED)
                .threadId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .content(
                    ResponseContent.builder()
                        .addPart(
                            ResponseContentPart.ContentPartText.builder()
                                .text("text")
                                .type(ResponseContentPart.ContentPartText.Type.TEXT)
                                .build()
                        )
                        .build()
                )
                .continuedInResponseId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .error(
                    ErrorStatus.builder()
                        .code("code")
                        .message("message")
                        .details(JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .outputMessageId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .outputMessageSeq(0L)
                .userMessageId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .userMessageSeq(0L)
                .build()

        val roundtrippedResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(response),
                jacksonTypeRef<Response>(),
            )

        assertThat(roundtrippedResponse).isEqualTo(response)
    }
}
