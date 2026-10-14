// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.locates

import com.clearstreet.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LocateTest {

    @Test
    fun create() {
        val locate =
            Locate.builder()
                .accountId(0L)
                .clientRequestId("client_request_id")
                .effectiveDate(LocalDate.parse("2019-12-27"))
                .instrumentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .locateRequestId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .requestedQuantity(0L)
                .status(LocateStatus.REQUESTED)
                .locateId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .quantity(0L)
                .relatedOrderId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .reservedQuantity(0L)
                .usedQuantity(0L)
                .build()

        assertThat(locate.accountId()).isEqualTo(0L)
        assertThat(locate.clientRequestId()).isEqualTo("client_request_id")
        assertThat(locate.effectiveDate()).isEqualTo(LocalDate.parse("2019-12-27"))
        assertThat(locate.instrumentId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(locate.locateRequestId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(locate.requestedQuantity()).isEqualTo(0L)
        assertThat(locate.status()).isEqualTo(LocateStatus.REQUESTED)
        assertThat(locate.locateId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(locate.quantity()).contains(0L)
        assertThat(locate.relatedOrderId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(locate.reservedQuantity()).contains(0L)
        assertThat(locate.usedQuantity()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val locate =
            Locate.builder()
                .accountId(0L)
                .clientRequestId("client_request_id")
                .effectiveDate(LocalDate.parse("2019-12-27"))
                .instrumentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .locateRequestId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .requestedQuantity(0L)
                .status(LocateStatus.REQUESTED)
                .locateId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .quantity(0L)
                .relatedOrderId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .reservedQuantity(0L)
                .usedQuantity(0L)
                .build()

        val roundtrippedLocate =
            jsonMapper.readValue(jsonMapper.writeValueAsString(locate), jacksonTypeRef<Locate>())

        assertThat(roundtrippedLocate).isEqualTo(locate)
    }
}
