// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.orders

import com.clearstreet.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NewOrderRequestTest {

    @Test
    fun create() {
        val newOrderRequest =
            NewOrderRequest.builder()
                .orderType(RequestOrderType.MARKET)
                .quantity("1")
                .side(Side.BUY)
                .timeInForce(RequestTimeInForce.DAY)
                .id("my-ref-id-20251001-002")
                .expiresAt(OffsetDateTime.parse("2025-10-15T16:00:00.000000000Z"))
                .extendedHours(true)
                .instrumentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .limitOffset("0.50")
                .limitPrice("48.00")
                .positionEffect(PositionEffect.OPEN)
                .stopPrice("52.00")
                .symbol("TSLA")
                .trailingOffset("2.00")
                .trailingOffsetType(TrailingOffsetType.PRICE)
                .build()

        assertThat(newOrderRequest.orderType()).isEqualTo(RequestOrderType.MARKET)
        assertThat(newOrderRequest.quantity()).isEqualTo("1")
        assertThat(newOrderRequest.side()).isEqualTo(Side.BUY)
        assertThat(newOrderRequest.timeInForce()).isEqualTo(RequestTimeInForce.DAY)
        assertThat(newOrderRequest.id()).contains("my-ref-id-20251001-002")
        assertThat(newOrderRequest.expiresAt())
            .contains(OffsetDateTime.parse("2025-10-15T16:00:00.000000000Z"))
        assertThat(newOrderRequest.extendedHours()).contains(true)
        assertThat(newOrderRequest.instrumentId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(newOrderRequest.limitOffset()).contains("0.50")
        assertThat(newOrderRequest.limitPrice()).contains("48.00")
        assertThat(newOrderRequest.positionEffect()).contains(PositionEffect.OPEN)
        assertThat(newOrderRequest.stopPrice()).contains("52.00")
        assertThat(newOrderRequest.symbol()).contains("TSLA")
        assertThat(newOrderRequest.trailingOffset()).contains("2.00")
        assertThat(newOrderRequest.trailingOffsetType()).contains(TrailingOffsetType.PRICE)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val newOrderRequest =
            NewOrderRequest.builder()
                .orderType(RequestOrderType.MARKET)
                .quantity("1")
                .side(Side.BUY)
                .timeInForce(RequestTimeInForce.DAY)
                .id("my-ref-id-20251001-002")
                .expiresAt(OffsetDateTime.parse("2025-10-15T16:00:00.000000000Z"))
                .extendedHours(true)
                .instrumentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .limitOffset("0.50")
                .limitPrice("48.00")
                .positionEffect(PositionEffect.OPEN)
                .stopPrice("52.00")
                .symbol("TSLA")
                .trailingOffset("2.00")
                .trailingOffsetType(TrailingOffsetType.PRICE)
                .build()

        val roundtrippedNewOrderRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(newOrderRequest),
                jacksonTypeRef<NewOrderRequest>(),
            )

        assertThat(roundtrippedNewOrderRequest).isEqualTo(newOrderRequest)
    }
}
