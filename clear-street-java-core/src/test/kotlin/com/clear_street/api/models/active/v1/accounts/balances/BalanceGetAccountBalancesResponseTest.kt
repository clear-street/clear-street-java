// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.accounts.balances

import com.clear_street.api.core.JsonValue
import com.clear_street.api.core.jsonMapper
import com.clear_street.api.models.ApiError
import com.clear_street.api.models.ResponseMetadata
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BalanceGetAccountBalancesResponseTest {

    @Test
    fun create() {
        val balanceGetAccountBalancesResponse =
            BalanceGetAccountBalancesResponse.builder()
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
                                        .initialMarginRequirement("25000.00")
                                        .maintenanceMarginRequirement("15000.00")
                                        .marketValue("50000.00")
                                        .underlyingInstrumentId(
                                            "a1a2a3a4-b1b2-c1c2-d1d2-d3d4d5d6d7d8"
                                        )
                                        .build()
                                )
                                .usage(
                                    MarginDetailsUsage.builder()
                                        .total("100000.00")
                                        .used("5000.00")
                                        .build()
                                )
                                .build()
                        )
                        .multiplier("2")
                        .shortMarketValue("10000.00")
                        .build()
                )
                .build()

        assertThat(balanceGetAccountBalancesResponse.metadata())
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
        assertThat(balanceGetAccountBalancesResponse.error())
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
        assertThat(balanceGetAccountBalancesResponse.data())
            .isEqualTo(
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
                                    .initialMarginRequirement("25000.00")
                                    .maintenanceMarginRequirement("15000.00")
                                    .marketValue("50000.00")
                                    .underlyingInstrumentId("a1a2a3a4-b1b2-c1c2-d1d2-d3d4d5d6d7d8")
                                    .build()
                            )
                            .usage(
                                MarginDetailsUsage.builder()
                                    .total("100000.00")
                                    .used("5000.00")
                                    .build()
                            )
                            .build()
                    )
                    .multiplier("2")
                    .shortMarketValue("10000.00")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val balanceGetAccountBalancesResponse =
            BalanceGetAccountBalancesResponse.builder()
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
                                        .initialMarginRequirement("25000.00")
                                        .maintenanceMarginRequirement("15000.00")
                                        .marketValue("50000.00")
                                        .underlyingInstrumentId(
                                            "a1a2a3a4-b1b2-c1c2-d1d2-d3d4d5d6d7d8"
                                        )
                                        .build()
                                )
                                .usage(
                                    MarginDetailsUsage.builder()
                                        .total("100000.00")
                                        .used("5000.00")
                                        .build()
                                )
                                .build()
                        )
                        .multiplier("2")
                        .shortMarketValue("10000.00")
                        .build()
                )
                .build()

        val roundtrippedBalanceGetAccountBalancesResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(balanceGetAccountBalancesResponse),
                jacksonTypeRef<BalanceGetAccountBalancesResponse>(),
            )

        assertThat(roundtrippedBalanceGetAccountBalancesResponse)
            .isEqualTo(balanceGetAccountBalancesResponse)
    }
}
