// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.orders

import com.clear_street.api.core.jsonMapper
import com.clear_street.api.models.v1.SecurityType
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NewOrderRequestTest {

    @Test
    fun create() {
        val newOrderRequest =
            NewOrderRequest.builder()
                .instrumentType(SecurityType.COMMON_STOCK)
                .orderType(RequestOrderType.LIMIT)
                .quantity("25")
                .side(Side.BUY)
                .timeInForce(RequestTimeInForce.DAY)
                .id("my-ref-id-20251001-002")
                .expiresAt(OffsetDateTime.parse("2025-10-15T16:00:00.000000000Z"))
                .extendedHours(true)
                .instrumentId("f47ac10b-58cc-4372-a567-0e02b2c3d479")
                .limitOffset("0.10")
                .limitPrice("140.50")
                .positionEffect(PositionEffect.OPEN)
                .stopPrice("135.00")
                .symbol("AAPL")
                .trailingOffset("1.25")
                .trailingOffsetType(TrailingOffsetType.PRICE)
                .build()

        assertThat(newOrderRequest.instrumentType()).isEqualTo(SecurityType.COMMON_STOCK)
        assertThat(newOrderRequest.orderType()).isEqualTo(RequestOrderType.LIMIT)
        assertThat(newOrderRequest.quantity()).isEqualTo("25")
        assertThat(newOrderRequest.side()).isEqualTo(Side.BUY)
        assertThat(newOrderRequest.timeInForce()).isEqualTo(RequestTimeInForce.DAY)
        assertThat(newOrderRequest.id()).contains("my-ref-id-20251001-002")
        assertThat(newOrderRequest.expiresAt())
            .contains(OffsetDateTime.parse("2025-10-15T16:00:00.000000000Z"))
        assertThat(newOrderRequest.extendedHours()).contains(true)
        assertThat(newOrderRequest.instrumentId()).contains("f47ac10b-58cc-4372-a567-0e02b2c3d479")
        assertThat(newOrderRequest.limitOffset()).contains("0.10")
        assertThat(newOrderRequest.limitPrice()).contains("140.50")
        assertThat(newOrderRequest.positionEffect()).contains(PositionEffect.OPEN)
        assertThat(newOrderRequest.stopPrice()).contains("135.00")
        assertThat(newOrderRequest.symbol()).contains("AAPL")
        assertThat(newOrderRequest.trailingOffset()).contains("1.25")
        assertThat(newOrderRequest.trailingOffsetType()).contains(TrailingOffsetType.PRICE)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val newOrderRequest =
            NewOrderRequest.builder()
                .instrumentType(SecurityType.COMMON_STOCK)
                .orderType(RequestOrderType.LIMIT)
                .quantity("25")
                .side(Side.BUY)
                .timeInForce(RequestTimeInForce.DAY)
                .id("my-ref-id-20251001-002")
                .expiresAt(OffsetDateTime.parse("2025-10-15T16:00:00.000000000Z"))
                .extendedHours(true)
                .instrumentId("f47ac10b-58cc-4372-a567-0e02b2c3d479")
                .limitOffset("0.10")
                .limitPrice("140.50")
                .positionEffect(PositionEffect.OPEN)
                .stopPrice("135.00")
                .symbol("AAPL")
                .trailingOffset("1.25")
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
