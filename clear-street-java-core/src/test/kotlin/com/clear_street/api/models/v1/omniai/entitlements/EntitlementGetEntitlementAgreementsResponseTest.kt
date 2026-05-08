// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.omniai.entitlements

import com.clear_street.api.core.JsonValue
import com.clear_street.api.core.jsonMapper
import com.clear_street.api.models.ApiError
import com.clear_street.api.models.ResponseMetadata
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EntitlementGetEntitlementAgreementsResponseTest {

    @Test
    fun create() {
        val entitlementGetEntitlementAgreementsResponse =
            EntitlementGetEntitlementAgreementsResponse.builder()
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
                    EntitlementAgreementResource.builder()
                        .agreementId("agreement_id")
                        .agreementKey(EntitlementAgreementKey.OMNI_ACCOUNT_DATA_ACCESS)
                        .documentContent("document_content")
                        .documentSha256("document_sha256")
                        .addEntitlementCode(EntitlementCode.OMNI_ACCOUNT_DATA)
                        .title("title")
                        .version(0)
                        .build()
                )
                .build()

        assertThat(entitlementGetEntitlementAgreementsResponse.metadata())
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
        assertThat(entitlementGetEntitlementAgreementsResponse.error())
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
        assertThat(entitlementGetEntitlementAgreementsResponse.data())
            .containsExactly(
                EntitlementAgreementResource.builder()
                    .agreementId("agreement_id")
                    .agreementKey(EntitlementAgreementKey.OMNI_ACCOUNT_DATA_ACCESS)
                    .documentContent("document_content")
                    .documentSha256("document_sha256")
                    .addEntitlementCode(EntitlementCode.OMNI_ACCOUNT_DATA)
                    .title("title")
                    .version(0)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val entitlementGetEntitlementAgreementsResponse =
            EntitlementGetEntitlementAgreementsResponse.builder()
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
                    EntitlementAgreementResource.builder()
                        .agreementId("agreement_id")
                        .agreementKey(EntitlementAgreementKey.OMNI_ACCOUNT_DATA_ACCESS)
                        .documentContent("document_content")
                        .documentSha256("document_sha256")
                        .addEntitlementCode(EntitlementCode.OMNI_ACCOUNT_DATA)
                        .title("title")
                        .version(0)
                        .build()
                )
                .build()

        val roundtrippedEntitlementGetEntitlementAgreementsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(entitlementGetEntitlementAgreementsResponse),
                jacksonTypeRef<EntitlementGetEntitlementAgreementsResponse>(),
            )

        assertThat(roundtrippedEntitlementGetEntitlementAgreementsResponse)
            .isEqualTo(entitlementGetEntitlementAgreementsResponse)
    }
}
