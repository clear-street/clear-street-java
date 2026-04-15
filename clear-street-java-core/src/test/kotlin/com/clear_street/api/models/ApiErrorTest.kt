// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models

import com.clear_street.api.core.JsonValue
import com.clear_street.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ApiErrorTest {

    @Test
    fun create() {
        val apiError =
            ApiError.builder()
                .code(400)
                .message("Order quantity must be greater than zero")
                .addDetail(
                    ApiError.Detail.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .build()

        assertThat(apiError.code()).isEqualTo(400)
        assertThat(apiError.message()).isEqualTo("Order quantity must be greater than zero")
        assertThat(apiError.details().getOrNull())
            .containsExactly(
                ApiError.Detail.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val apiError =
            ApiError.builder()
                .code(400)
                .message("Order quantity must be greater than zero")
                .addDetail(
                    ApiError.Detail.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .build()

        val roundtrippedApiError =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(apiError),
                jacksonTypeRef<ApiError>(),
            )

        assertThat(roundtrippedApiError).isEqualTo(apiError)
    }
}
