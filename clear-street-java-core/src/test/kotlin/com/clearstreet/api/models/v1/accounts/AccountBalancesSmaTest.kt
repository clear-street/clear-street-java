// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.accounts

import com.clearstreet.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AccountBalancesSmaTest {

    @Test
    fun create() {
        val accountBalancesSma =
            AccountBalancesSma.builder()
                .asof(OffsetDateTime.parse("2026-10-30T15:30:00.000000000Z"))
                .value("12500.00")
                .build()

        assertThat(accountBalancesSma.asof())
            .isEqualTo(OffsetDateTime.parse("2026-10-30T15:30:00.000000000Z"))
        assertThat(accountBalancesSma.value()).isEqualTo("12500.00")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val accountBalancesSma =
            AccountBalancesSma.builder()
                .asof(OffsetDateTime.parse("2026-10-30T15:30:00.000000000Z"))
                .value("12500.00")
                .build()

        val roundtrippedAccountBalancesSma =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(accountBalancesSma),
                jacksonTypeRef<AccountBalancesSma>(),
            )

        assertThat(roundtrippedAccountBalancesSma).isEqualTo(accountBalancesSma)
    }
}
