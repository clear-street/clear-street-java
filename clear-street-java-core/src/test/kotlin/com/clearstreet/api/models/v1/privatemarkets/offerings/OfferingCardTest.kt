// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.privatemarkets.offerings

import com.clearstreet.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OfferingCardTest {

    @Test
    fun create() {
        val offeringCard =
            OfferingCard.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .class_(OfferingClass.UPCOMING)
                .company(
                    OfferingCompany.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .name("name")
                        .shortDescription("short_description")
                        .slug("slug")
                        .logoUrl("logo_url")
                        .primaryDomain("primary_domain")
                        .build()
                )
                .currency(Currency.USD)
                .headline("headline")
                .summary("summary")
                .indicativePriceHigh("110")
                .indicativePriceLow("90")
                .indicativeValuationBasis(ValuationBasis.PRE_MONEY)
                .indicativeValuationHigh("indicative_valuation_high")
                .indicativeValuationLow("indicative_valuation_low")
                .ioiDeadline(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .minimumIoiAmount("25000")
                .spv(
                    OfferingSpv.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .name("name")
                        .status(SpvStatus.DRAFT)
                        .custodianName("custodian_name")
                        .managerName("manager_name")
                        .shareClass("share_class")
                        .structureDescription("structure_description")
                        .build()
                )
                .build()

        assertThat(offeringCard.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(offeringCard.class_()).isEqualTo(OfferingClass.UPCOMING)
        assertThat(offeringCard.company())
            .isEqualTo(
                OfferingCompany.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .name("name")
                    .shortDescription("short_description")
                    .slug("slug")
                    .logoUrl("logo_url")
                    .primaryDomain("primary_domain")
                    .build()
            )
        assertThat(offeringCard.currency()).isEqualTo(Currency.USD)
        assertThat(offeringCard.headline()).isEqualTo("headline")
        assertThat(offeringCard.summary()).isEqualTo("summary")
        assertThat(offeringCard.indicativePriceHigh()).contains("110")
        assertThat(offeringCard.indicativePriceLow()).contains("90")
        assertThat(offeringCard.indicativeValuationBasis()).contains(ValuationBasis.PRE_MONEY)
        assertThat(offeringCard.indicativeValuationHigh()).contains("indicative_valuation_high")
        assertThat(offeringCard.indicativeValuationLow()).contains("indicative_valuation_low")
        assertThat(offeringCard.ioiDeadline())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(offeringCard.minimumIoiAmount()).contains("25000")
        assertThat(offeringCard.spv())
            .contains(
                OfferingSpv.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .name("name")
                    .status(SpvStatus.DRAFT)
                    .custodianName("custodian_name")
                    .managerName("manager_name")
                    .shareClass("share_class")
                    .structureDescription("structure_description")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val offeringCard =
            OfferingCard.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .class_(OfferingClass.UPCOMING)
                .company(
                    OfferingCompany.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .name("name")
                        .shortDescription("short_description")
                        .slug("slug")
                        .logoUrl("logo_url")
                        .primaryDomain("primary_domain")
                        .build()
                )
                .currency(Currency.USD)
                .headline("headline")
                .summary("summary")
                .indicativePriceHigh("110")
                .indicativePriceLow("90")
                .indicativeValuationBasis(ValuationBasis.PRE_MONEY)
                .indicativeValuationHigh("indicative_valuation_high")
                .indicativeValuationLow("indicative_valuation_low")
                .ioiDeadline(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .minimumIoiAmount("25000")
                .spv(
                    OfferingSpv.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .name("name")
                        .status(SpvStatus.DRAFT)
                        .custodianName("custodian_name")
                        .managerName("manager_name")
                        .shareClass("share_class")
                        .structureDescription("structure_description")
                        .build()
                )
                .build()

        val roundtrippedOfferingCard =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(offeringCard),
                jacksonTypeRef<OfferingCard>(),
            )

        assertThat(roundtrippedOfferingCard).isEqualTo(offeringCard)
    }
}
