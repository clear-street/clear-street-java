// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.privatemarkets.iois

import com.clearstreet.api.core.jsonMapper
import com.clearstreet.api.models.v1.privatemarkets.offerings.Currency
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IoiResourceTest {

    @Test
    fun create() {
        val ioiResource =
            IoiResource.builder()
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
                .build()

        assertThat(ioiResource.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(ioiResource.accountId()).isEqualTo(0L)
        assertThat(ioiResource.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(ioiResource.currency()).isEqualTo(Currency.USD)
        assertThat(ioiResource.notionalAmount()).isEqualTo("100000.00")
        assertThat(ioiResource.offeringId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(ioiResource.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(ioiResource.ndaAcceptance())
            .contains(
                NdaAcceptanceResource.builder()
                    .acceptedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .agreementId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .version(0)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val ioiResource =
            IoiResource.builder()
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
                .build()

        val roundtrippedIoiResource =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(ioiResource),
                jacksonTypeRef<IoiResource>(),
            )

        assertThat(roundtrippedIoiResource).isEqualTo(ioiResource)
    }
}
