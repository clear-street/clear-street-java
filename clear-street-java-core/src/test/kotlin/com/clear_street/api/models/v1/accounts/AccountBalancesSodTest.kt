// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.accounts

import com.clear_street.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AccountBalancesSodTest {

    @Test
    fun create() {
        val accountBalancesSod =
            AccountBalancesSod.builder()
                .buyingPower("90000.00")
                .equity("100000.00")
                .longMarketValue("40000.00")
                .shortMarketValue("10000.00")
                .asof(LocalDate.parse("2023-09-27"))
                .dayTradeBuyingPower("200000.00")
                .maintenanceMarginExcess("50000.00")
                .maintenanceMarginRequirement("50000.00")
                .tradeCash("70000.00")
                .build()

        assertThat(accountBalancesSod.buyingPower()).isEqualTo("90000.00")
        assertThat(accountBalancesSod.equity()).isEqualTo("100000.00")
        assertThat(accountBalancesSod.longMarketValue()).isEqualTo("40000.00")
        assertThat(accountBalancesSod.shortMarketValue()).isEqualTo("10000.00")
        assertThat(accountBalancesSod.asof()).contains(LocalDate.parse("2023-09-27"))
        assertThat(accountBalancesSod.dayTradeBuyingPower()).contains("200000.00")
        assertThat(accountBalancesSod.maintenanceMarginExcess()).contains("50000.00")
        assertThat(accountBalancesSod.maintenanceMarginRequirement()).contains("50000.00")
        assertThat(accountBalancesSod.tradeCash()).contains("70000.00")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val accountBalancesSod =
            AccountBalancesSod.builder()
                .buyingPower("90000.00")
                .equity("100000.00")
                .longMarketValue("40000.00")
                .shortMarketValue("10000.00")
                .asof(LocalDate.parse("2023-09-27"))
                .dayTradeBuyingPower("200000.00")
                .maintenanceMarginExcess("50000.00")
                .maintenanceMarginRequirement("50000.00")
                .tradeCash("70000.00")
                .build()

        val roundtrippedAccountBalancesSod =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(accountBalancesSod),
                jacksonTypeRef<AccountBalancesSod>(),
            )

        assertThat(roundtrippedAccountBalancesSod).isEqualTo(accountBalancesSod)
    }
}
