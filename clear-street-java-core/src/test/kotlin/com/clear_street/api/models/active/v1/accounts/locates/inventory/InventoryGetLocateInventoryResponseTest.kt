// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.accounts.locates.inventory

import com.clear_street.api.core.JsonValue
import com.clear_street.api.core.jsonMapper
import com.clear_street.api.models.ApiError
import com.clear_street.api.models.ResponseMetadata
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InventoryGetLocateInventoryResponseTest {

    @Test
    fun create() {
        val inventoryGetLocateInventoryResponse =
            InventoryGetLocateInventoryResponse.builder()
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
                    LocateInventoryItem.builder()
                        .accountId(19816L)
                        .available(5000L)
                        .reserved(1000L)
                        .symbol("AAPL")
                        .used(2500L)
                        .build()
                )
                .build()

        assertThat(inventoryGetLocateInventoryResponse.metadata())
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
        assertThat(inventoryGetLocateInventoryResponse.error())
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
        assertThat(inventoryGetLocateInventoryResponse.data())
            .containsExactly(
                LocateInventoryItem.builder()
                    .accountId(19816L)
                    .available(5000L)
                    .reserved(1000L)
                    .symbol("AAPL")
                    .used(2500L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val inventoryGetLocateInventoryResponse =
            InventoryGetLocateInventoryResponse.builder()
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
                    LocateInventoryItem.builder()
                        .accountId(19816L)
                        .available(5000L)
                        .reserved(1000L)
                        .symbol("AAPL")
                        .used(2500L)
                        .build()
                )
                .build()

        val roundtrippedInventoryGetLocateInventoryResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(inventoryGetLocateInventoryResponse),
                jacksonTypeRef<InventoryGetLocateInventoryResponse>(),
            )

        assertThat(roundtrippedInventoryGetLocateInventoryResponse)
            .isEqualTo(inventoryGetLocateInventoryResponse)
    }
}
