// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.omniai.entitlementagreements

import com.clear_street.api.core.JsonValue
import com.clear_street.api.core.jsonMapper
import com.clear_street.api.models.ApiError
import com.clear_street.api.models.ResponseMetadata
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EntitlementAgreementListEntitlementAgreementsResponseTest {

    @Test
    fun create() {
        val entitlementAgreementListEntitlementAgreementsResponse =
            EntitlementAgreementListEntitlementAgreementsResponse.builder()
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
                        .agreementKey("agreement_key")
                        .documentContent("document_content")
                        .documentSha256("document_sha256")
                        .addEntitlementCode("string")
                        .title("title")
                        .version(0)
                        .build()
                )
                .build()

        assertThat(entitlementAgreementListEntitlementAgreementsResponse.metadata())
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
        assertThat(entitlementAgreementListEntitlementAgreementsResponse.error())
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
        assertThat(entitlementAgreementListEntitlementAgreementsResponse.data())
            .containsExactly(
                EntitlementAgreementResource.builder()
                    .agreementId("agreement_id")
                    .agreementKey("agreement_key")
                    .documentContent("document_content")
                    .documentSha256("document_sha256")
                    .addEntitlementCode("string")
                    .title("title")
                    .version(0)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val entitlementAgreementListEntitlementAgreementsResponse =
            EntitlementAgreementListEntitlementAgreementsResponse.builder()
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
                        .agreementKey("agreement_key")
                        .documentContent("document_content")
                        .documentSha256("document_sha256")
                        .addEntitlementCode("string")
                        .title("title")
                        .version(0)
                        .build()
                )
                .build()

        val roundtrippedEntitlementAgreementListEntitlementAgreementsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(
                    entitlementAgreementListEntitlementAgreementsResponse
                ),
                jacksonTypeRef<EntitlementAgreementListEntitlementAgreementsResponse>(),
            )

        assertThat(roundtrippedEntitlementAgreementListEntitlementAgreementsResponse)
            .isEqualTo(entitlementAgreementListEntitlementAgreementsResponse)
    }
}
