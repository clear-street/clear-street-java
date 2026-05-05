// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.accounts

import com.clear_street.api.core.JsonValue
import com.clear_street.api.core.jsonMapper
import com.clear_street.api.models.ApiError
import com.clear_street.api.models.ResponseMetadata
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AccountGetAccountsResponseTest {

    @Test
    fun create() {
        val accountGetAccountsResponse =
            AccountGetAccountsResponse.builder()
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
                    Account.builder()
                        .id(19816L)
                        .accountHolderEntityId(987654321L)
                        .fullName("Test Trading Account")
                        .openDate(LocalDate.parse("2023-01-15"))
                        .optionsLevel(1L)
                        .shortName("TST-ACCOUNT-01")
                        .status(AccountStatus.ACTIVE)
                        .subtype(AccountSubtype.MARGIN)
                        .type(AccountType.CUSTOMER)
                        .closeDate(null)
                        .build()
                )
                .build()

        assertThat(accountGetAccountsResponse.metadata())
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
        assertThat(accountGetAccountsResponse.error())
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
        assertThat(accountGetAccountsResponse.data())
            .containsExactly(
                Account.builder()
                    .id(19816L)
                    .accountHolderEntityId(987654321L)
                    .fullName("Test Trading Account")
                    .openDate(LocalDate.parse("2023-01-15"))
                    .optionsLevel(1L)
                    .shortName("TST-ACCOUNT-01")
                    .status(AccountStatus.ACTIVE)
                    .subtype(AccountSubtype.MARGIN)
                    .type(AccountType.CUSTOMER)
                    .closeDate(null)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val accountGetAccountsResponse =
            AccountGetAccountsResponse.builder()
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
                    Account.builder()
                        .id(19816L)
                        .accountHolderEntityId(987654321L)
                        .fullName("Test Trading Account")
                        .openDate(LocalDate.parse("2023-01-15"))
                        .optionsLevel(1L)
                        .shortName("TST-ACCOUNT-01")
                        .status(AccountStatus.ACTIVE)
                        .subtype(AccountSubtype.MARGIN)
                        .type(AccountType.CUSTOMER)
                        .closeDate(null)
                        .build()
                )
                .build()

        val roundtrippedAccountGetAccountsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(accountGetAccountsResponse),
                jacksonTypeRef<AccountGetAccountsResponse>(),
            )

        assertThat(roundtrippedAccountGetAccountsResponse).isEqualTo(accountGetAccountsResponse)
    }
}
