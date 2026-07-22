// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.omniai.entitlements

import com.clearstreet.api.core.JsonValue
import com.clearstreet.api.core.jsonMapper
import com.clearstreet.api.models.ApiError
import com.clearstreet.api.models.ResponseMetadata
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EntitlementDeleteEntitlementResponseTest {

    @Test
    fun create() {
        val entitlementDeleteEntitlementResponse =
            EntitlementDeleteEntitlementResponse.builder()
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
                    DeleteEntitlementResponse.builder()
                        .entitlementId("entitlement_id")
                        .revoked(true)
                        .build()
                )
                .build()

        assertThat(entitlementDeleteEntitlementResponse.metadata())
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
        assertThat(entitlementDeleteEntitlementResponse.error())
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
        assertThat(entitlementDeleteEntitlementResponse.data())
            .isEqualTo(
                DeleteEntitlementResponse.builder()
                    .entitlementId("entitlement_id")
                    .revoked(true)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val entitlementDeleteEntitlementResponse =
            EntitlementDeleteEntitlementResponse.builder()
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
                    DeleteEntitlementResponse.builder()
                        .entitlementId("entitlement_id")
                        .revoked(true)
                        .build()
                )
                .build()

        val roundtrippedEntitlementDeleteEntitlementResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(entitlementDeleteEntitlementResponse),
                jacksonTypeRef<EntitlementDeleteEntitlementResponse>(),
            )

        assertThat(roundtrippedEntitlementDeleteEntitlementResponse)
            .isEqualTo(entitlementDeleteEntitlementResponse)
    }
}
