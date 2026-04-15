// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.savedscreeners

import com.clear_street.api.core.JsonValue
import com.clear_street.api.core.jsonMapper
import com.clear_street.api.models.ApiError
import com.clear_street.api.models.ResponseMetadata
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SavedScreenerListScreenersResponseTest {

    @Test
    fun create() {
        val savedScreenerListScreenersResponse =
            SavedScreenerListScreenersResponse.builder()
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
                .addData(
                    ScreenerEntry.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .addFilter(
                            SavedScreenerFilter.builder()
                                .fieldName("field_name")
                                .operation("operation")
                                .value("value")
                                .build()
                        )
                        .name("name")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .addFieldFilter("string")
                        .sortBy("sort_by")
                        .sortDirection("sort_direction")
                        .build()
                )
                .build()

        assertThat(savedScreenerListScreenersResponse.metadata())
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
        assertThat(savedScreenerListScreenersResponse.error())
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
        assertThat(savedScreenerListScreenersResponse.data())
            .containsExactly(
                ScreenerEntry.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .addFilter(
                        SavedScreenerFilter.builder()
                            .fieldName("field_name")
                            .operation("operation")
                            .value("value")
                            .build()
                    )
                    .name("name")
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .addFieldFilter("string")
                    .sortBy("sort_by")
                    .sortDirection("sort_direction")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val savedScreenerListScreenersResponse =
            SavedScreenerListScreenersResponse.builder()
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
                .addData(
                    ScreenerEntry.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .addFilter(
                            SavedScreenerFilter.builder()
                                .fieldName("field_name")
                                .operation("operation")
                                .value("value")
                                .build()
                        )
                        .name("name")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .addFieldFilter("string")
                        .sortBy("sort_by")
                        .sortDirection("sort_direction")
                        .build()
                )
                .build()

        val roundtrippedSavedScreenerListScreenersResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(savedScreenerListScreenersResponse),
                jacksonTypeRef<SavedScreenerListScreenersResponse>(),
            )

        assertThat(roundtrippedSavedScreenerListScreenersResponse)
            .isEqualTo(savedScreenerListScreenersResponse)
    }
}
