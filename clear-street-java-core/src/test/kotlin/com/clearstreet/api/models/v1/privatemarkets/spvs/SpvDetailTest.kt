// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.privatemarkets.spvs

import com.clearstreet.api.core.jsonMapper
import com.clearstreet.api.models.v1.privatemarkets.offerings.Currency
import com.clearstreet.api.models.v1.privatemarkets.offerings.SpvStatus
import com.clearstreet.api.models.v1.privatemarkets.offerings.ValuationBasis
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SpvDetailTest {

    @Test
    fun create() {
        val spvDetail =
            SpvDetail.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .companyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .currency(Currency.USD)
                .name("name")
                .status(SpvStatus.DRAFT)
                .allInPricePerShare("102.5")
                .custodianName("custodian_name")
                .feePerShare("2.5")
                .addFeeTerm(
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
                )
                .fundedPercent("70")
                .fundingDeadline(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .managerName("manager_name")
                .minimumInvestmentAmount("25000")
                .openedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .pricePerShare("100")
                .remainingAllocationAmount("1500000")
                .remainingShareAllocation("15000")
                .shareClass("share_class")
                .structureDescription("structure_description")
                .totalAllocationAmount("5000000")
                .totalShareAllocation("50000")
                .valuation("5000000000")
                .valuationBasis(ValuationBasis.PRE_MONEY)
                .build()

        assertThat(spvDetail.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(spvDetail.companyId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(spvDetail.currency()).isEqualTo(Currency.USD)
        assertThat(spvDetail.name()).isEqualTo("name")
        assertThat(spvDetail.status()).isEqualTo(SpvStatus.DRAFT)
        assertThat(spvDetail.allInPricePerShare()).contains("102.5")
        assertThat(spvDetail.custodianName()).contains("custodian_name")
        assertThat(spvDetail.feePerShare()).contains("2.5")
        assertThat(spvDetail.feeTerms().getOrNull())
            .containsExactly(
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
            )
        assertThat(spvDetail.fundedPercent()).contains("70")
        assertThat(spvDetail.fundingDeadline())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(spvDetail.managerName()).contains("manager_name")
        assertThat(spvDetail.minimumInvestmentAmount()).contains("25000")
        assertThat(spvDetail.openedAt()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(spvDetail.pricePerShare()).contains("100")
        assertThat(spvDetail.remainingAllocationAmount()).contains("1500000")
        assertThat(spvDetail.remainingShareAllocation()).contains("15000")
        assertThat(spvDetail.shareClass()).contains("share_class")
        assertThat(spvDetail.structureDescription()).contains("structure_description")
        assertThat(spvDetail.totalAllocationAmount()).contains("5000000")
        assertThat(spvDetail.totalShareAllocation()).contains("50000")
        assertThat(spvDetail.valuation()).contains("5000000000")
        assertThat(spvDetail.valuationBasis()).contains(ValuationBasis.PRE_MONEY)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val spvDetail =
            SpvDetail.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .companyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .currency(Currency.USD)
                .name("name")
                .status(SpvStatus.DRAFT)
                .allInPricePerShare("102.5")
                .custodianName("custodian_name")
                .feePerShare("2.5")
                .addFeeTerm(
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
                )
                .fundedPercent("70")
                .fundingDeadline(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .managerName("manager_name")
                .minimumInvestmentAmount("25000")
                .openedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .pricePerShare("100")
                .remainingAllocationAmount("1500000")
                .remainingShareAllocation("15000")
                .shareClass("share_class")
                .structureDescription("structure_description")
                .totalAllocationAmount("5000000")
                .totalShareAllocation("50000")
                .valuation("5000000000")
                .valuationBasis(ValuationBasis.PRE_MONEY)
                .build()

        val roundtrippedSpvDetail =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(spvDetail),
                jacksonTypeRef<SpvDetail>(),
            )

        assertThat(roundtrippedSpvDetail).isEqualTo(spvDetail)
    }
}
