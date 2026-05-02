// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.accounts

import com.clear_street.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AccountTest {

    @Test
    fun create() {
        val account =
            Account.builder()
                .id(19816L)
                .accountHolderEntityId(987654321L)
                .fullName("Test Trading Account")
                .kind(AccountKind.CUSTOMER)
                .openDate(LocalDate.parse("2023-01-15"))
                .optionsLevel(1L)
                .shortName("TST-ACCOUNT-01")
                .status(AccountStatus.ACTIVE)
                .subkind(AccountSubkind.MARGIN)
                .closeDate(null)
                .build()

        assertThat(account.id()).isEqualTo(19816L)
        assertThat(account.accountHolderEntityId()).isEqualTo(987654321L)
        assertThat(account.fullName()).isEqualTo("Test Trading Account")
        assertThat(account.kind()).isEqualTo(AccountKind.CUSTOMER)
        assertThat(account.openDate()).isEqualTo(LocalDate.parse("2023-01-15"))
        assertThat(account.optionsLevel()).isEqualTo(1L)
        assertThat(account.shortName()).isEqualTo("TST-ACCOUNT-01")
        assertThat(account.status()).isEqualTo(AccountStatus.ACTIVE)
        assertThat(account.subkind()).isEqualTo(AccountSubkind.MARGIN)
        assertThat(account.closeDate()).isEmpty
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val account =
            Account.builder()
                .id(19816L)
                .accountHolderEntityId(987654321L)
                .fullName("Test Trading Account")
                .kind(AccountKind.CUSTOMER)
                .openDate(LocalDate.parse("2023-01-15"))
                .optionsLevel(1L)
                .shortName("TST-ACCOUNT-01")
                .status(AccountStatus.ACTIVE)
                .subkind(AccountSubkind.MARGIN)
                .closeDate(null)
                .build()

        val roundtrippedAccount =
            jsonMapper.readValue(jsonMapper.writeValueAsString(account), jacksonTypeRef<Account>())

        assertThat(roundtrippedAccount).isEqualTo(account)
    }
}
