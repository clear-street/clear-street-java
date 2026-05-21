// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.accounts

import com.clear_street.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MarginDetailsTest {

    @Test
    fun create() {
        val marginDetails =
            MarginDetails.builder()
                .dayTradeCount(0)
                .initialMarginExcess("50000.00")
                .initialMarginRequirement("50000.00")
                .maintenanceMarginExcess("75000.00")
                .maintenanceMarginRequirement("25000.00")
                .patternDayTrader(true)
                .dayTradeBuyingPowerUsage("50000.00")
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

        assertThat(marginDetails.dayTradeCount()).isEqualTo(0)
        assertThat(marginDetails.initialMarginExcess()).isEqualTo("50000.00")
        assertThat(marginDetails.initialMarginRequirement()).isEqualTo("50000.00")
        assertThat(marginDetails.maintenanceMarginExcess()).isEqualTo("75000.00")
        assertThat(marginDetails.maintenanceMarginRequirement()).isEqualTo("25000.00")
        assertThat(marginDetails.patternDayTrader()).isEqualTo(true)
        assertThat(marginDetails.dayTradeBuyingPowerUsage()).contains("50000.00")
        assertThat(marginDetails.topContributors().getOrNull())
            .containsExactly(
                MarginTopContributor.builder()
                    .dayTradeBuyingPowerUsage("5000.00")
                    .initialMarginRequirement("25000.00")
                    .maintenanceMarginRequirement("15000.00")
                    .marketValue("50000.00")
                    .underlyingInstrumentId("a1a2a3a4-b1b2-c1c2-d1d2-d3d4d5d6d7d8")
                    .build()
            )
        assertThat(marginDetails.usage())
            .contains(MarginDetailsUsage.builder().total("100000.00").used("5000.00").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val marginDetails =
            MarginDetails.builder()
                .dayTradeCount(0)
                .initialMarginExcess("50000.00")
                .initialMarginRequirement("50000.00")
                .maintenanceMarginExcess("75000.00")
                .maintenanceMarginRequirement("25000.00")
                .patternDayTrader(true)
                .dayTradeBuyingPowerUsage("50000.00")
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

        val roundtrippedMarginDetails =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(marginDetails),
                jacksonTypeRef<MarginDetails>(),
            )

        assertThat(roundtrippedMarginDetails).isEqualTo(marginDetails)
    }
}
