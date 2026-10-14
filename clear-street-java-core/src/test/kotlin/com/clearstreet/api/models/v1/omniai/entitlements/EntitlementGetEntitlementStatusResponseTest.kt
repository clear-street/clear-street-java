// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.omniai.entitlements

import com.clearstreet.api.core.JsonValue
import com.clearstreet.api.core.jsonMapper
import com.clearstreet.api.models.ApiError
import com.clearstreet.api.models.ResponseMetadata
import com.clearstreet.api.models.v1.omniai.EntitlementCode
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EntitlementGetEntitlementStatusResponseTest {

    @Test
    fun create() {
        val entitlementGetEntitlementStatusResponse =
            EntitlementGetEntitlementStatusResponse.builder()
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
                .addData(
                    EntitlementStatusResource.builder()
                        .accountId(0L)
                        .enabled(true)
                        .entitlementCode(EntitlementCode.OMNI_ACCOUNT_DATA)
                        .build()
                )
                .build()

        assertThat(entitlementGetEntitlementStatusResponse.metadata())
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
        assertThat(entitlementGetEntitlementStatusResponse.error())
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
        assertThat(entitlementGetEntitlementStatusResponse.data())
            .containsExactly(
                EntitlementStatusResource.builder()
                    .accountId(0L)
                    .enabled(true)
                    .entitlementCode(EntitlementCode.OMNI_ACCOUNT_DATA)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val entitlementGetEntitlementStatusResponse =
            EntitlementGetEntitlementStatusResponse.builder()
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
                .addData(
                    EntitlementStatusResource.builder()
                        .accountId(0L)
                        .enabled(true)
                        .entitlementCode(EntitlementCode.OMNI_ACCOUNT_DATA)
                        .build()
                )
                .build()

        val roundtrippedEntitlementGetEntitlementStatusResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(entitlementGetEntitlementStatusResponse),
                jacksonTypeRef<EntitlementGetEntitlementStatusResponse>(),
            )

        assertThat(roundtrippedEntitlementGetEntitlementStatusResponse)
            .isEqualTo(entitlementGetEntitlementStatusResponse)
    }
}
