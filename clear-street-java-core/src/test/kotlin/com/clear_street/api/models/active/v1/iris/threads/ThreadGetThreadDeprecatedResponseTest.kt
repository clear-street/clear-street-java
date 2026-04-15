// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.iris.threads

import com.clear_street.api.core.JsonValue
import com.clear_street.api.core.jsonMapper
import com.clear_street.api.models.ApiError
import com.clear_street.api.models.ResponseMetadata
import com.clear_street.api.models.active.v1.omniai.GetThreadResponse
import com.clear_street.api.models.active.v1.omniai.Thread
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ThreadGetThreadDeprecatedResponseTest {

    @Test
    fun create() {
        val threadGetThreadDeprecatedResponse =
            ThreadGetThreadDeprecatedResponse.builder()
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
                    GetThreadResponse.builder()
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
                        .build()
                )
                .build()

        assertThat(threadGetThreadDeprecatedResponse.metadata())
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
        assertThat(threadGetThreadDeprecatedResponse.error())
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
        assertThat(threadGetThreadDeprecatedResponse.data())
            .isEqualTo(
                GetThreadResponse.builder()
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
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val threadGetThreadDeprecatedResponse =
            ThreadGetThreadDeprecatedResponse.builder()
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
                    GetThreadResponse.builder()
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
                        .build()
                )
                .build()

        val roundtrippedThreadGetThreadDeprecatedResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(threadGetThreadDeprecatedResponse),
                jacksonTypeRef<ThreadGetThreadDeprecatedResponse>(),
            )

        assertThat(roundtrippedThreadGetThreadDeprecatedResponse)
            .isEqualTo(threadGetThreadDeprecatedResponse)
    }
}
