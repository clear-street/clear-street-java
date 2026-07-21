// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.accounts

import com.clearstreet.api.core.JsonValue
import com.clearstreet.api.core.jsonMapper
import com.clearstreet.api.models.ApiError
import com.clearstreet.api.models.ResponseMetadata
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AccountGetAccountByIdResponseTest {

    @Test
    fun create() {
        val accountGetAccountByIdResponse =
            AccountGetAccountByIdResponse.builder()
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
                    AccountWithPersonalDetails.builder()
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
                        .countryOfTaxResidency("US")
                        .dateOfBirth(LocalDate.parse("1985-03-15"))
                        .mailingAddress(
                            Address.builder()
                                .city("New York")
                                .country("USA")
                                .line1("4 World Trade Center")
                                .postalCode("10007")
                                .line2("150 Greenwich Street, Floor 45")
                                .state("NY")
                                .build()
                        )
                        .phoneNumber("+12125550123")
                        .build()
                )
                .build()

        assertThat(accountGetAccountByIdResponse.metadata())
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
        assertThat(accountGetAccountByIdResponse.error())
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
        assertThat(accountGetAccountByIdResponse.data())
            .isEqualTo(
                AccountWithPersonalDetails.builder()
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
                    .countryOfTaxResidency("US")
                    .dateOfBirth(LocalDate.parse("1985-03-15"))
                    .mailingAddress(
                        Address.builder()
                            .city("New York")
                            .country("USA")
                            .line1("4 World Trade Center")
                            .postalCode("10007")
                            .line2("150 Greenwich Street, Floor 45")
                            .state("NY")
                            .build()
                    )
                    .phoneNumber("+12125550123")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val accountGetAccountByIdResponse =
            AccountGetAccountByIdResponse.builder()
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
                    AccountWithPersonalDetails.builder()
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
                        .countryOfTaxResidency("US")
                        .dateOfBirth(LocalDate.parse("1985-03-15"))
                        .mailingAddress(
                            Address.builder()
                                .city("New York")
                                .country("USA")
                                .line1("4 World Trade Center")
                                .postalCode("10007")
                                .line2("150 Greenwich Street, Floor 45")
                                .state("NY")
                                .build()
                        )
                        .phoneNumber("+12125550123")
                        .build()
                )
                .build()

        val roundtrippedAccountGetAccountByIdResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(accountGetAccountByIdResponse),
                jacksonTypeRef<AccountGetAccountByIdResponse>(),
            )

        assertThat(roundtrippedAccountGetAccountByIdResponse)
            .isEqualTo(accountGetAccountByIdResponse)
    }
}
