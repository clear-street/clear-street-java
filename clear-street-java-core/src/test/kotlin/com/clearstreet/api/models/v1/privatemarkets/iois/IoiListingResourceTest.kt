// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.privatemarkets.iois

import com.clearstreet.api.core.jsonMapper
import com.clearstreet.api.models.v1.privatemarkets.offerings.Currency
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IoiListingResourceTest {

    @Test
    fun create() {
        val ioiListingResource =
            IoiListingResource.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .accountId(0L)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency(Currency.USD)
                .notionalAmount("100000.00")
                .offeringId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .ndaAcceptance(
                    NdaAcceptanceResource.builder()
                        .acceptedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .agreementId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .version(0)
                        .build()
                )
                .company(
                    IoiCompanyResource.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .name("name")
                        .build()
                )
                .offering(
                    IoiOfferingResource.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .headline("headline")
                        .build()
                )
                .build()

        assertThat(ioiListingResource.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(ioiListingResource.accountId()).isEqualTo(0L)
        assertThat(ioiListingResource.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(ioiListingResource.currency()).isEqualTo(Currency.USD)
        assertThat(ioiListingResource.notionalAmount()).isEqualTo("100000.00")
        assertThat(ioiListingResource.offeringId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(ioiListingResource.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(ioiListingResource.ndaAcceptance())
            .contains(
                NdaAcceptanceResource.builder()
                    .acceptedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .agreementId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .version(0)
                    .build()
            )
        assertThat(ioiListingResource.company())
            .isEqualTo(
                IoiCompanyResource.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .name("name")
                    .build()
            )
        assertThat(ioiListingResource.offering())
            .isEqualTo(
                IoiOfferingResource.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .headline("headline")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val ioiListingResource =
            IoiListingResource.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .accountId(0L)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency(Currency.USD)
                .notionalAmount("100000.00")
                .offeringId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .ndaAcceptance(
                    NdaAcceptanceResource.builder()
                        .acceptedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .agreementId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .version(0)
                        .build()
                )
                .company(
                    IoiCompanyResource.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .name("name")
                        .build()
                )
                .offering(
                    IoiOfferingResource.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .headline("headline")
                        .build()
                )
                .build()

        val roundtrippedIoiListingResource =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(ioiListingResource),
                jacksonTypeRef<IoiListingResource>(),
            )

        assertThat(roundtrippedIoiListingResource).isEqualTo(ioiListingResource)
    }
}
