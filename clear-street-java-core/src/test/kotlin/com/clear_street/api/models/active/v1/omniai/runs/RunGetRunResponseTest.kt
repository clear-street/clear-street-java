// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.omniai.runs

import com.clear_street.api.core.JsonValue
import com.clear_street.api.core.jsonMapper
import com.clear_street.api.models.ApiError
import com.clear_street.api.models.ResponseMetadata
import com.clear_street.api.models.active.v1.omniai.Capability
import com.clear_street.api.models.active.v1.omniai.GetRunResponse
import com.clear_street.api.models.active.v1.omniai.Run
import com.clear_street.api.models.active.v1.omniai.RunStatus
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RunGetRunResponseTest {

    @Test
    fun create() {
        val runGetRunResponse =
            RunGetRunResponse.builder()
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
                    GetRunResponse.builder()
                        .addEvent(JsonValue.from(mapOf<String, Any>()))
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
                        .nextPageToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .build()

        assertThat(runGetRunResponse.metadata())
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
        assertThat(runGetRunResponse.error())
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
        assertThat(runGetRunResponse.data())
            .isEqualTo(
                GetRunResponse.builder()
                    .addEvent(JsonValue.from(mapOf<String, Any>()))
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
                    .nextPageToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val runGetRunResponse =
            RunGetRunResponse.builder()
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
                    GetRunResponse.builder()
                        .addEvent(JsonValue.from(mapOf<String, Any>()))
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
                        .nextPageToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .build()

        val roundtrippedRunGetRunResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(runGetRunResponse),
                jacksonTypeRef<RunGetRunResponse>(),
            )

        assertThat(roundtrippedRunGetRunResponse).isEqualTo(runGetRunResponse)
    }
}
