// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.instruments

import com.clearstreet.api.core.JsonValue
import com.clearstreet.api.core.jsonMapper
import com.clearstreet.api.models.ApiError
import com.clearstreet.api.models.ResponseMetadata
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InstrumentGetPredictionCategoriesResponseTest {

    @Test
    fun create() {
        val instrumentGetPredictionCategoriesResponse =
            InstrumentGetPredictionCategoriesResponse.builder()
                .metadata(
                    ResponseMetadata.builder()
                        .requestId("request_id")
                        .nextPageToken("U3RhaW5sZXNzIHJvY2tz")
                        .pageNumber(1)
                        .previousPageToken("U3RhaW5sZXNzIHJvY2tz")
                        .totalItems(42L)
                        .totalPages(5)
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
                    PredictionCategories.builder()
                        .categories(listOf("Economics", "Elections", "Sports"))
                        .build()
                )
                .build()

        assertThat(instrumentGetPredictionCategoriesResponse.metadata())
            .isEqualTo(
                ResponseMetadata.builder()
                    .requestId("request_id")
                    .nextPageToken("U3RhaW5sZXNzIHJvY2tz")
                    .pageNumber(1)
                    .previousPageToken("U3RhaW5sZXNzIHJvY2tz")
                    .totalItems(42L)
                    .totalPages(5)
                    .build()
            )
        assertThat(instrumentGetPredictionCategoriesResponse.error())
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
        assertThat(instrumentGetPredictionCategoriesResponse.data())
            .isEqualTo(
                PredictionCategories.builder()
                    .categories(listOf("Economics", "Elections", "Sports"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val instrumentGetPredictionCategoriesResponse =
            InstrumentGetPredictionCategoriesResponse.builder()
                .metadata(
                    ResponseMetadata.builder()
                        .requestId("request_id")
                        .nextPageToken("U3RhaW5sZXNzIHJvY2tz")
                        .pageNumber(1)
                        .previousPageToken("U3RhaW5sZXNzIHJvY2tz")
                        .totalItems(42L)
                        .totalPages(5)
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
                    PredictionCategories.builder()
                        .categories(listOf("Economics", "Elections", "Sports"))
                        .build()
                )
                .build()

        val roundtrippedInstrumentGetPredictionCategoriesResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(instrumentGetPredictionCategoriesResponse),
                jacksonTypeRef<InstrumentGetPredictionCategoriesResponse>(),
            )

        assertThat(roundtrippedInstrumentGetPredictionCategoriesResponse)
            .isEqualTo(instrumentGetPredictionCategoriesResponse)
    }
}
