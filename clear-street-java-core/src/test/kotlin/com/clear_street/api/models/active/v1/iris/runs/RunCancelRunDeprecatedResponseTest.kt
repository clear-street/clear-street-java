// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.iris.runs

import com.clear_street.api.core.JsonValue
import com.clear_street.api.core.jsonMapper
import com.clear_street.api.models.ApiError
import com.clear_street.api.models.ResponseMetadata
import com.clear_street.api.models.active.v1.omniai.CancelRunResponse
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RunCancelRunDeprecatedResponseTest {

    @Test
    fun create() {
        val runCancelRunDeprecatedResponse =
            RunCancelRunDeprecatedResponse.builder()
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
                .data(CancelRunResponse.builder().canceled(true).build())
                .build()

        assertThat(runCancelRunDeprecatedResponse.metadata())
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
        assertThat(runCancelRunDeprecatedResponse.error())
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
        assertThat(runCancelRunDeprecatedResponse.data())
            .isEqualTo(CancelRunResponse.builder().canceled(true).build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val runCancelRunDeprecatedResponse =
            RunCancelRunDeprecatedResponse.builder()
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
                .data(CancelRunResponse.builder().canceled(true).build())
                .build()

        val roundtrippedRunCancelRunDeprecatedResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(runCancelRunDeprecatedResponse),
                jacksonTypeRef<RunCancelRunDeprecatedResponse>(),
            )

        assertThat(roundtrippedRunCancelRunDeprecatedResponse)
            .isEqualTo(runCancelRunDeprecatedResponse)
    }
}
