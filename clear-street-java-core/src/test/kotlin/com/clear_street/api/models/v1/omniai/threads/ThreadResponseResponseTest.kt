// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.omniai.threads

import com.clear_street.api.core.JsonValue
import com.clear_street.api.core.jsonMapper
import com.clear_street.api.models.ApiError
import com.clear_street.api.models.ResponseMetadata
import com.clear_street.api.models.v1.omniai.ErrorStatus
import com.clear_street.api.models.v1.omniai.Response
import com.clear_street.api.models.v1.omniai.ResponseContent
import com.clear_street.api.models.v1.omniai.ResponseContentPart
import com.clear_street.api.models.v1.omniai.ResponseStatus
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ThreadResponseResponseTest {

    @Test
    fun create() {
        val threadResponseResponse =
            ThreadResponseResponse.builder()
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
                )
                .build()

        assertThat(threadResponseResponse.metadata())
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
        assertThat(threadResponseResponse.error())
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
        assertThat(threadResponseResponse.data())
            .isEqualTo(
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
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val threadResponseResponse =
            ThreadResponseResponse.builder()
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
                )
                .build()

        val roundtrippedThreadResponseResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(threadResponseResponse),
                jacksonTypeRef<ThreadResponseResponse>(),
            )

        assertThat(roundtrippedThreadResponseResponse).isEqualTo(threadResponseResponse)
    }
}
