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

internal class EntitlementGetEntitlementsResponseTest {

    @Test
    fun create() {
        val entitlementGetEntitlementsResponse =
            EntitlementGetEntitlementsResponse.builder()
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
                    EntitlementResource.builder()
                        .accountId(0L)
                        .agreementId("agreement_id")
                        .entitlementCode(EntitlementCode.OMNI_ACCOUNT_DATA)
                        .entitlementId("entitlement_id")
                        .grantedAt("granted_at")
                        .build()
                )
                .build()

        assertThat(entitlementGetEntitlementsResponse.metadata())
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
        assertThat(entitlementGetEntitlementsResponse.error())
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
        assertThat(entitlementGetEntitlementsResponse.data())
            .containsExactly(
                EntitlementResource.builder()
                    .accountId(0L)
                    .agreementId("agreement_id")
                    .entitlementCode(EntitlementCode.OMNI_ACCOUNT_DATA)
                    .entitlementId("entitlement_id")
                    .grantedAt("granted_at")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val entitlementGetEntitlementsResponse =
            EntitlementGetEntitlementsResponse.builder()
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
                    EntitlementResource.builder()
                        .accountId(0L)
                        .agreementId("agreement_id")
                        .entitlementCode(EntitlementCode.OMNI_ACCOUNT_DATA)
                        .entitlementId("entitlement_id")
                        .grantedAt("granted_at")
                        .build()
                )
                .build()

        val roundtrippedEntitlementGetEntitlementsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(entitlementGetEntitlementsResponse),
                jacksonTypeRef<EntitlementGetEntitlementsResponse>(),
            )

        assertThat(roundtrippedEntitlementGetEntitlementsResponse)
            .isEqualTo(entitlementGetEntitlementsResponse)
    }
}
