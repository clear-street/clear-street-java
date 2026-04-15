// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.accounts

import com.clear_street.api.core.JsonValue
import com.clear_street.api.core.jsonMapper
import com.clear_street.api.models.ApiError
import com.clear_street.api.models.ResponseMetadata
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AccountPatchAccountByIdResponseTest {

    @Test
    fun create() {
        val accountPatchAccountByIdResponse =
            AccountPatchAccountByIdResponse.builder()
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
                    AccountSettings.builder()
                        .risk(RiskSettings.builder().maxNotional("5000000.00").build())
                        .build()
                )
                .build()

        assertThat(accountPatchAccountByIdResponse.metadata())
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
        assertThat(accountPatchAccountByIdResponse.error())
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
        assertThat(accountPatchAccountByIdResponse.data())
            .isEqualTo(
                AccountSettings.builder()
                    .risk(RiskSettings.builder().maxNotional("5000000.00").build())
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val accountPatchAccountByIdResponse =
            AccountPatchAccountByIdResponse.builder()
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
                    AccountSettings.builder()
                        .risk(RiskSettings.builder().maxNotional("5000000.00").build())
                        .build()
                )
                .build()

        val roundtrippedAccountPatchAccountByIdResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(accountPatchAccountByIdResponse),
                jacksonTypeRef<AccountPatchAccountByIdResponse>(),
            )

        assertThat(roundtrippedAccountPatchAccountByIdResponse)
            .isEqualTo(accountPatchAccountByIdResponse)
    }
}
