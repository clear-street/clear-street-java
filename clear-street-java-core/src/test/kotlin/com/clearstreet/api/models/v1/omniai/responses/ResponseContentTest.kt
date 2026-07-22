// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.omniai.responses

import com.clearstreet.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ResponseContentTest {

    @Test
    fun create() {
        val responseContent =
            ResponseContent.builder()
                .addPart(
                    ResponseContentPart.ContentPartText.builder()
                        .text("text")
                        .type(ResponseContentPart.ContentPartText.Type.TEXT)
                        .build()
                )
                .build()

        assertThat(responseContent.parts())
            .containsExactly(
                ResponseContentPart.ofContentPartText(
                    ResponseContentPart.ContentPartText.builder()
                        .text("text")
                        .type(ResponseContentPart.ContentPartText.Type.TEXT)
                        .build()
                )
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val responseContent =
            ResponseContent.builder()
                .addPart(
                    ResponseContentPart.ContentPartText.builder()
                        .text("text")
                        .type(ResponseContentPart.ContentPartText.Type.TEXT)
                        .build()
                )
                .build()

        val roundtrippedResponseContent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(responseContent),
                jacksonTypeRef<ResponseContent>(),
            )

        assertThat(roundtrippedResponseContent).isEqualTo(responseContent)
    }
}
