// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.omniai.entitlements

import com.clear_street.api.core.JsonValue
import com.clear_street.api.core.jsonMapper
import com.clear_street.api.models.ApiError
import com.clear_street.api.models.ResponseMetadata
import com.clear_street.api.models.v1.omniai.EntitlementCode
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EntitlementCreateEntitlementsResponseTest {

    @Test
    fun create() {
        val entitlementCreateEntitlementsResponse =
            EntitlementCreateEntitlementsResponse.builder()
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
                        .agreementId("agreement_id")
                        .entitlementCode(EntitlementCode.OMNI_ACCOUNT_DATA)
                        .entitlementId("entitlement_id")
                        .grantedAt("granted_at")
                        .tradingAccountId(0L)
                        .build()
                )
                .build()

        assertThat(entitlementCreateEntitlementsResponse.metadata())
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
        assertThat(entitlementCreateEntitlementsResponse.error())
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
        assertThat(entitlementCreateEntitlementsResponse.data())
            .containsExactly(
                EntitlementResource.builder()
                    .agreementId("agreement_id")
                    .entitlementCode(EntitlementCode.OMNI_ACCOUNT_DATA)
                    .entitlementId("entitlement_id")
                    .grantedAt("granted_at")
                    .tradingAccountId(0L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val entitlementCreateEntitlementsResponse =
            EntitlementCreateEntitlementsResponse.builder()
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
                        .agreementId("agreement_id")
                        .entitlementCode(EntitlementCode.OMNI_ACCOUNT_DATA)
                        .entitlementId("entitlement_id")
                        .grantedAt("granted_at")
                        .tradingAccountId(0L)
                        .build()
                )
                .build()

        val roundtrippedEntitlementCreateEntitlementsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(entitlementCreateEntitlementsResponse),
                jacksonTypeRef<EntitlementCreateEntitlementsResponse>(),
            )

        assertThat(roundtrippedEntitlementCreateEntitlementsResponse)
            .isEqualTo(entitlementCreateEntitlementsResponse)
    }
}
