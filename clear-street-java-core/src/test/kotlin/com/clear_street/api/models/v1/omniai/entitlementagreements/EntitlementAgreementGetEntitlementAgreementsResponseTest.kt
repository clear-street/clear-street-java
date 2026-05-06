// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.omniai.entitlementagreements

import com.clear_street.api.core.JsonValue
import com.clear_street.api.core.jsonMapper
import com.clear_street.api.models.ApiError
import com.clear_street.api.models.ResponseMetadata
import com.clear_street.api.models.v1.omniai.EntitlementAgreementKey
import com.clear_street.api.models.v1.omniai.EntitlementCode
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EntitlementAgreementGetEntitlementAgreementsResponseTest {

    @Test
    fun create() {
        val entitlementAgreementGetEntitlementAgreementsResponse =
            EntitlementAgreementGetEntitlementAgreementsResponse.builder()
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

        assertThat(entitlementAgreementGetEntitlementAgreementsResponse.metadata())
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
        assertThat(entitlementAgreementGetEntitlementAgreementsResponse.error())
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
        assertThat(entitlementAgreementGetEntitlementAgreementsResponse.data())
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
        val entitlementAgreementGetEntitlementAgreementsResponse =
            EntitlementAgreementGetEntitlementAgreementsResponse.builder()
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

        val roundtrippedEntitlementAgreementGetEntitlementAgreementsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(entitlementAgreementGetEntitlementAgreementsResponse),
                jacksonTypeRef<EntitlementAgreementGetEntitlementAgreementsResponse>(),
            )

        assertThat(roundtrippedEntitlementAgreementGetEntitlementAgreementsResponse)
            .isEqualTo(entitlementAgreementGetEntitlementAgreementsResponse)
    }
}
