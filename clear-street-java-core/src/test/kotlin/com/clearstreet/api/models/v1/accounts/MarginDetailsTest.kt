// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.accounts

import com.clearstreet.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MarginDetailsTest {

    @Test
    fun create() {
        val marginDetails =
            MarginDetails.builder()
                .initialMarginExcess("50000.00")
                .initialMarginRequirement("50000.00")
                .intradayDetails(
                    MarginSessionDetails.builder().buyingPower("500000.00").multiplier("2").build()
                )
                .maintenanceMarginExcess("75000.00")
                .maintenanceMarginRequirement("25000.00")
                .overnightDetails(
                    MarginSessionDetails.builder().buyingPower("500000.00").multiplier("2").build()
                )
                .addTopContributor(
                    MarginTopContributor.builder()
                        .initialMarginRequirement("25000.00")
                        .maintenanceMarginRequirement("15000.00")
                        .marketValue("50000.00")
                        .underlyingInstrumentId("a1a2a3a4-b1b2-c1c2-d1d2-d3d4d5d6d7d8")
                        .build()
                )
                .usage(MarginDetailsUsage.builder().total("100000.00").used("5000.00").build())
                .build()

        assertThat(marginDetails.initialMarginExcess()).isEqualTo("50000.00")
        assertThat(marginDetails.initialMarginRequirement()).isEqualTo("50000.00")
        assertThat(marginDetails.intradayDetails())
            .isEqualTo(
                MarginSessionDetails.builder().buyingPower("500000.00").multiplier("2").build()
            )
        assertThat(marginDetails.maintenanceMarginExcess()).isEqualTo("75000.00")
        assertThat(marginDetails.maintenanceMarginRequirement()).isEqualTo("25000.00")
        assertThat(marginDetails.overnightDetails())
            .isEqualTo(
                MarginSessionDetails.builder().buyingPower("500000.00").multiplier("2").build()
            )
        assertThat(marginDetails.topContributors().getOrNull())
            .containsExactly(
                MarginTopContributor.builder()
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
                .initialMarginExcess("50000.00")
                .initialMarginRequirement("50000.00")
                .intradayDetails(
                    MarginSessionDetails.builder().buyingPower("500000.00").multiplier("2").build()
                )
                .maintenanceMarginExcess("75000.00")
                .maintenanceMarginRequirement("25000.00")
                .overnightDetails(
                    MarginSessionDetails.builder().buyingPower("500000.00").multiplier("2").build()
                )
                .addTopContributor(
                    MarginTopContributor.builder()
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
