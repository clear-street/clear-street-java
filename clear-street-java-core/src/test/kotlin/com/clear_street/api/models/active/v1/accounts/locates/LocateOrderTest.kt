// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.accounts.locates

import com.clear_street.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LocateOrderTest {

    @Test
    fun create() {
        val locateOrder =
            LocateOrder.builder()
                .locateOrderId("loc_2af0305ffa5b4c91ba4e7ab45e2d8e4e")
                .locatedQuantity(1000L)
                .mpid("CLST")
                .requestedAt(OffsetDateTime.parse("2025-10-31T13:00:00.000000000Z"))
                .requestedQuantity(1000L)
                .status(LocateOrderStatus.OFFERED)
                .symbol("TSLA")
                .borrowRate("0.23")
                .deskComment("Offer for locate of 1000 TSLA shares")
                .expiresAt(OffsetDateTime.parse("2025-10-31T13:15:00.000000000Z"))
                .locateId("19dd51b8a64d953955c5c202")
                .locatedAt(OffsetDateTime.parse("2025-10-31T13:05:00.000000000Z"))
                .referenceId("my-locate-ref-001")
                .totalCost("123.99")
                .traderComment("Request for 1000 TSLA shares for short strategy")
                .build()

        assertThat(locateOrder.locateOrderId()).isEqualTo("loc_2af0305ffa5b4c91ba4e7ab45e2d8e4e")
        assertThat(locateOrder.locatedQuantity()).isEqualTo(1000L)
        assertThat(locateOrder.mpid()).isEqualTo("CLST")
        assertThat(locateOrder.requestedAt())
            .isEqualTo(OffsetDateTime.parse("2025-10-31T13:00:00.000000000Z"))
        assertThat(locateOrder.requestedQuantity()).isEqualTo(1000L)
        assertThat(locateOrder.status()).isEqualTo(LocateOrderStatus.OFFERED)
        assertThat(locateOrder.symbol()).isEqualTo("TSLA")
        assertThat(locateOrder.borrowRate()).contains("0.23")
        assertThat(locateOrder.deskComment()).contains("Offer for locate of 1000 TSLA shares")
        assertThat(locateOrder.expiresAt())
            .contains(OffsetDateTime.parse("2025-10-31T13:15:00.000000000Z"))
        assertThat(locateOrder.locateId()).contains("19dd51b8a64d953955c5c202")
        assertThat(locateOrder.locatedAt())
            .contains(OffsetDateTime.parse("2025-10-31T13:05:00.000000000Z"))
        assertThat(locateOrder.referenceId()).contains("my-locate-ref-001")
        assertThat(locateOrder.totalCost()).contains("123.99")
        assertThat(locateOrder.traderComment())
            .contains("Request for 1000 TSLA shares for short strategy")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val locateOrder =
            LocateOrder.builder()
                .locateOrderId("loc_2af0305ffa5b4c91ba4e7ab45e2d8e4e")
                .locatedQuantity(1000L)
                .mpid("CLST")
                .requestedAt(OffsetDateTime.parse("2025-10-31T13:00:00.000000000Z"))
                .requestedQuantity(1000L)
                .status(LocateOrderStatus.OFFERED)
                .symbol("TSLA")
                .borrowRate("0.23")
                .deskComment("Offer for locate of 1000 TSLA shares")
                .expiresAt(OffsetDateTime.parse("2025-10-31T13:15:00.000000000Z"))
                .locateId("19dd51b8a64d953955c5c202")
                .locatedAt(OffsetDateTime.parse("2025-10-31T13:05:00.000000000Z"))
                .referenceId("my-locate-ref-001")
                .totalCost("123.99")
                .traderComment("Request for 1000 TSLA shares for short strategy")
                .build()

        val roundtrippedLocateOrder =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(locateOrder),
                jacksonTypeRef<LocateOrder>(),
            )

        assertThat(roundtrippedLocateOrder).isEqualTo(locateOrder)
    }
}
