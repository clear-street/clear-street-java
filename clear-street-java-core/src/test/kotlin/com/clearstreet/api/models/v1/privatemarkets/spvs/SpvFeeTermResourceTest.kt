// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.privatemarkets.spvs

import com.clearstreet.api.core.jsonMapper
import com.clearstreet.api.models.v1.privatemarkets.offerings.Currency
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SpvFeeTermResourceTest {

    @Test
    fun create() {
        val spvFeeTermResource =
            SpvFeeTermResource.builder()
                .chargedBy(ChargedBy.FUND_MANAGER)
                .currency(Currency.USD)
                .description("description")
                .feeType(FeeType.MANAGEMENT)
                .frequency(FeeFrequency.ONE_TIME)
                .amount("25000")
                .durationYears("10")
                .hurdleRate("0.08")
                .rate("0.02")
                .build()

        assertThat(spvFeeTermResource.chargedBy()).isEqualTo(ChargedBy.FUND_MANAGER)
        assertThat(spvFeeTermResource.currency()).isEqualTo(Currency.USD)
        assertThat(spvFeeTermResource.description()).isEqualTo("description")
        assertThat(spvFeeTermResource.feeType()).isEqualTo(FeeType.MANAGEMENT)
        assertThat(spvFeeTermResource.frequency()).isEqualTo(FeeFrequency.ONE_TIME)
        assertThat(spvFeeTermResource.amount()).contains("25000")
        assertThat(spvFeeTermResource.durationYears()).contains("10")
        assertThat(spvFeeTermResource.hurdleRate()).contains("0.08")
        assertThat(spvFeeTermResource.rate()).contains("0.02")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val spvFeeTermResource =
            SpvFeeTermResource.builder()
                .chargedBy(ChargedBy.FUND_MANAGER)
                .currency(Currency.USD)
                .description("description")
                .feeType(FeeType.MANAGEMENT)
                .frequency(FeeFrequency.ONE_TIME)
                .amount("25000")
                .durationYears("10")
                .hurdleRate("0.08")
                .rate("0.02")
                .build()

        val roundtrippedSpvFeeTermResource =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(spvFeeTermResource),
                jacksonTypeRef<SpvFeeTermResource>(),
            )

        assertThat(roundtrippedSpvFeeTermResource).isEqualTo(spvFeeTermResource)
    }
}
