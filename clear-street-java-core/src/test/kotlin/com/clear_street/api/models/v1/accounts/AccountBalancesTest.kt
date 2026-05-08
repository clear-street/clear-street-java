// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.accounts

import com.clear_street.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AccountBalancesTest {

    @Test
    fun create() {
        val accountBalances =
            AccountBalances.builder()
                .accountId(19816L)
                .buyingPower("90000.00")
                .currency("USD")
                .dailyRealizedPnl("700.00")
                .dailyTotalPnl("1250.00")
                .dailyUnrealizedPnl("550.00")
                .equity("100000.00")
                .longMarketValue("40000.00")
                .marginType(MarginType.REG_T)
                .openOrderAdjustment("-10000.00")
                .settledCash("99775.05")
                .sod(
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
                )
                .tradeCash("70000.00")
                .unsettledCredits("20000.00")
                .unsettledDebits("10000.00")
                .withdrawableCash("75000.00")
                .marginDetails(
                    MarginDetails.builder()
                        .dayTradeCount(2)
                        .initialMarginExcess("50000.00")
                        .initialMarginRequirement("50000.00")
                        .maintenanceMarginExcess("75000.00")
                        .maintenanceMarginRequirement("25000.00")
                        .patternDayTrader(false)
                        .dayTradeBuyingPowerUsage("0.00")
                        .addTopContributor(
                            MarginTopContributor.builder()
                                .dayTradeBuyingPowerUsage("5000.00")
                                .initialMarginRequirement("25000.00")
                                .maintenanceMarginRequirement("15000.00")
                                .marketValue("50000.00")
                                .underlyingInstrumentId("a1a2a3a4-b1b2-c1c2-d1d2-d3d4d5d6d7d8")
                                .build()
                        )
                        .usage(
                            MarginDetailsUsage.builder().total("100000.00").used("5000.00").build()
                        )
                        .build()
                )
                .multiplier("2")
                .shortMarketValue("10000.00")
                .build()

        assertThat(accountBalances.accountId()).isEqualTo(19816L)
        assertThat(accountBalances.buyingPower()).isEqualTo("90000.00")
        assertThat(accountBalances.currency()).isEqualTo("USD")
        assertThat(accountBalances.dailyRealizedPnl()).isEqualTo("700.00")
        assertThat(accountBalances.dailyTotalPnl()).isEqualTo("1250.00")
        assertThat(accountBalances.dailyUnrealizedPnl()).isEqualTo("550.00")
        assertThat(accountBalances.equity()).isEqualTo("100000.00")
        assertThat(accountBalances.longMarketValue()).isEqualTo("40000.00")
        assertThat(accountBalances.marginType()).isEqualTo(MarginType.REG_T)
        assertThat(accountBalances.openOrderAdjustment()).isEqualTo("-10000.00")
        assertThat(accountBalances.settledCash()).isEqualTo("99775.05")
        assertThat(accountBalances.sod())
            .isEqualTo(
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
            )
        assertThat(accountBalances.tradeCash()).isEqualTo("70000.00")
        assertThat(accountBalances.unsettledCredits()).isEqualTo("20000.00")
        assertThat(accountBalances.unsettledDebits()).isEqualTo("10000.00")
        assertThat(accountBalances.withdrawableCash()).isEqualTo("75000.00")
        assertThat(accountBalances.marginDetails())
            .contains(
                MarginDetails.builder()
                    .dayTradeCount(2)
                    .initialMarginExcess("50000.00")
                    .initialMarginRequirement("50000.00")
                    .maintenanceMarginExcess("75000.00")
                    .maintenanceMarginRequirement("25000.00")
                    .patternDayTrader(false)
                    .dayTradeBuyingPowerUsage("0.00")
                    .addTopContributor(
                        MarginTopContributor.builder()
                            .dayTradeBuyingPowerUsage("5000.00")
                            .initialMarginRequirement("25000.00")
                            .maintenanceMarginRequirement("15000.00")
                            .marketValue("50000.00")
                            .underlyingInstrumentId("a1a2a3a4-b1b2-c1c2-d1d2-d3d4d5d6d7d8")
                            .build()
                    )
                    .usage(MarginDetailsUsage.builder().total("100000.00").used("5000.00").build())
                    .build()
            )
        assertThat(accountBalances.multiplier()).contains("2")
        assertThat(accountBalances.shortMarketValue()).contains("10000.00")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val accountBalances =
            AccountBalances.builder()
                .accountId(19816L)
                .buyingPower("90000.00")
                .currency("USD")
                .dailyRealizedPnl("700.00")
                .dailyTotalPnl("1250.00")
                .dailyUnrealizedPnl("550.00")
                .equity("100000.00")
                .longMarketValue("40000.00")
                .marginType(MarginType.REG_T)
                .openOrderAdjustment("-10000.00")
                .settledCash("99775.05")
                .sod(
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
                )
                .tradeCash("70000.00")
                .unsettledCredits("20000.00")
                .unsettledDebits("10000.00")
                .withdrawableCash("75000.00")
                .marginDetails(
                    MarginDetails.builder()
                        .dayTradeCount(2)
                        .initialMarginExcess("50000.00")
                        .initialMarginRequirement("50000.00")
                        .maintenanceMarginExcess("75000.00")
                        .maintenanceMarginRequirement("25000.00")
                        .patternDayTrader(false)
                        .dayTradeBuyingPowerUsage("0.00")
                        .addTopContributor(
                            MarginTopContributor.builder()
                                .dayTradeBuyingPowerUsage("5000.00")
                                .initialMarginRequirement("25000.00")
                                .maintenanceMarginRequirement("15000.00")
                                .marketValue("50000.00")
                                .underlyingInstrumentId("a1a2a3a4-b1b2-c1c2-d1d2-d3d4d5d6d7d8")
                                .build()
                        )
                        .usage(
                            MarginDetailsUsage.builder().total("100000.00").used("5000.00").build()
                        )
                        .build()
                )
                .multiplier("2")
                .shortMarketValue("10000.00")
                .build()

        val roundtrippedAccountBalances =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(accountBalances),
                jacksonTypeRef<AccountBalances>(),
            )

        assertThat(roundtrippedAccountBalances).isEqualTo(accountBalances)
    }
}
