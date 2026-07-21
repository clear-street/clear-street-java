// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.accounts

import com.clearstreet.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AccountWithPersonalDetailsTest {

    @Test
    fun create() {
        val accountWithPersonalDetails =
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

        assertThat(accountWithPersonalDetails.id()).isEqualTo(19816L)
        assertThat(accountWithPersonalDetails.accountHolderEntityId()).isEqualTo(987654321L)
        assertThat(accountWithPersonalDetails.fullName()).isEqualTo("Test Trading Account")
        assertThat(accountWithPersonalDetails.openDate()).isEqualTo(LocalDate.parse("2023-01-15"))
        assertThat(accountWithPersonalDetails.optionsLevel()).isEqualTo(1L)
        assertThat(accountWithPersonalDetails.shortName()).isEqualTo("TST-ACCOUNT-01")
        assertThat(accountWithPersonalDetails.status()).isEqualTo(AccountStatus.ACTIVE)
        assertThat(accountWithPersonalDetails.subtype()).isEqualTo(AccountSubtype.MARGIN)
        assertThat(accountWithPersonalDetails.type()).isEqualTo(AccountType.CUSTOMER)
        assertThat(accountWithPersonalDetails.closeDate()).isEmpty
        assertThat(accountWithPersonalDetails.countryOfTaxResidency()).contains("US")
        assertThat(accountWithPersonalDetails.dateOfBirth()).contains(LocalDate.parse("1985-03-15"))
        assertThat(accountWithPersonalDetails.mailingAddress())
            .contains(
                Address.builder()
                    .city("New York")
                    .country("USA")
                    .line1("4 World Trade Center")
                    .postalCode("10007")
                    .line2("150 Greenwich Street, Floor 45")
                    .state("NY")
                    .build()
            )
        assertThat(accountWithPersonalDetails.phoneNumber()).contains("+12125550123")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val accountWithPersonalDetails =
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

        val roundtrippedAccountWithPersonalDetails =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(accountWithPersonalDetails),
                jacksonTypeRef<AccountWithPersonalDetails>(),
            )

        assertThat(roundtrippedAccountWithPersonalDetails).isEqualTo(accountWithPersonalDetails)
    }
}
