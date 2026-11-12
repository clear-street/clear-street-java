// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.orders

import com.clearstreet.api.core.jsonMapper
import com.clearstreet.api.models.v1.SecurityType
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OrderLegTest {

    @Test
    fun create() {
        val orderLeg =
            OrderLeg.builder()
                .ratio("ratio")
                .side(Side.BUY)
                .averageFillPrice("average_fill_price")
                .instrumentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .instrumentType(SecurityType.COMMON_STOCK)
                .positionEffect(RequestPositionEffect.OPEN)
                .symbol("symbol")
                .underlyingInstrumentId("a1a2a3a4-b1b2-c1c2-d1d2-d3d4d5d6d7d8")
                .underlyingInstrumentType(SecurityType.COMMON_STOCK)
                .build()

        assertThat(orderLeg.ratio()).isEqualTo("ratio")
        assertThat(orderLeg.side()).isEqualTo(Side.BUY)
        assertThat(orderLeg.averageFillPrice()).contains("average_fill_price")
        assertThat(orderLeg.instrumentId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(orderLeg.instrumentType()).contains(SecurityType.COMMON_STOCK)
        assertThat(orderLeg.positionEffect()).contains(RequestPositionEffect.OPEN)
        assertThat(orderLeg.symbol()).contains("symbol")
        assertThat(orderLeg.underlyingInstrumentId())
            .contains("a1a2a3a4-b1b2-c1c2-d1d2-d3d4d5d6d7d8")
        assertThat(orderLeg.underlyingInstrumentType()).contains(SecurityType.COMMON_STOCK)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val orderLeg =
            OrderLeg.builder()
                .ratio("ratio")
                .side(Side.BUY)
                .averageFillPrice("average_fill_price")
                .instrumentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .instrumentType(SecurityType.COMMON_STOCK)
                .positionEffect(RequestPositionEffect.OPEN)
                .symbol("symbol")
                .underlyingInstrumentId("a1a2a3a4-b1b2-c1c2-d1d2-d3d4d5d6d7d8")
                .underlyingInstrumentType(SecurityType.COMMON_STOCK)
                .build()

        val roundtrippedOrderLeg =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(orderLeg),
                jacksonTypeRef<OrderLeg>(),
            )

        assertThat(roundtrippedOrderLeg).isEqualTo(orderLeg)
    }
}
