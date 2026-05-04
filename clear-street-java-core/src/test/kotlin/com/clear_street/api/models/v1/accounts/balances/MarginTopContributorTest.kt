// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.accounts.balances

import com.clear_street.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MarginTopContributorTest {

    @Test
    fun create() {
        val marginTopContributor =
            MarginTopContributor.builder()
                .dayTradeBuyingPowerUsage("5000.00")
                .initialMarginRequirement("25000.00")
                .maintenanceMarginRequirement("15000.00")
                .marketValue("50000.00")
                .underlyingInstrumentId("a1a2a3a4-b1b2-c1c2-d1d2-d3d4d5d6d7d8")
                .build()

        assertThat(marginTopContributor.dayTradeBuyingPowerUsage()).isEqualTo("5000.00")
        assertThat(marginTopContributor.initialMarginRequirement()).isEqualTo("25000.00")
        assertThat(marginTopContributor.maintenanceMarginRequirement()).isEqualTo("15000.00")
        assertThat(marginTopContributor.marketValue()).isEqualTo("50000.00")
        assertThat(marginTopContributor.underlyingInstrumentId())
            .isEqualTo("a1a2a3a4-b1b2-c1c2-d1d2-d3d4d5d6d7d8")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val marginTopContributor =
            MarginTopContributor.builder()
                .dayTradeBuyingPowerUsage("5000.00")
                .initialMarginRequirement("25000.00")
                .maintenanceMarginRequirement("15000.00")
                .marketValue("50000.00")
                .underlyingInstrumentId("a1a2a3a4-b1b2-c1c2-d1d2-d3d4d5d6d7d8")
                .build()

        val roundtrippedMarginTopContributor =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(marginTopContributor),
                jacksonTypeRef<MarginTopContributor>(),
            )

        assertThat(roundtrippedMarginTopContributor).isEqualTo(marginTopContributor)
    }
}
