// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.accounts.orders

import com.clear_street.api.core.jsonMapper
import com.clear_street.api.models.v1.SecurityType
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OrderTest {

    @Test
    fun create() {
        val order =
            Order.builder()
                .id("0195f6c7-4f64-7e3c-8b0a-1d8e4f5e6a7b")
                .accountId(19816L)
                .clientOrderId("my-ref-id-20251001-001")
                .createdAt(OffsetDateTime.parse("2025-10-31T13:30:00.000000000Z"))
                .filledQuantity("50")
                .instrumentId("f47ac10b-58cc-4372-a567-0e02b2c3d479")
                .instrumentType(SecurityType.COMMON_STOCK)
                .leavesQuantity("50")
                .orderType(OrderType.LIMIT)
                .quantity("100")
                .side(Side.BUY)
                .status(OrderStatus.PARTIALLY_FILLED)
                .symbol("AAPL")
                .timeInForce(TimeInForce.DAY)
                .updatedAt(OffsetDateTime.parse("2025-10-31T13:35:10.000000000Z"))
                .venue("XNMS")
                .averageFillPrice("149.95")
                .addDetail("string")
                .expiresAt(OffsetDateTime.parse("2025-10-15T16:00:00.000000000Z"))
                .extendedHours(false)
                .limitOffset("0.10")
                .limitPrice("150.00")
                .queueState(QueueState.AWAITING_RELEASE)
                .releasesAt(OffsetDateTime.parse("2025-10-31T14:30:00.000000000Z"))
                .stopPrice(null)
                .trailingOffset("1.25")
                .trailingOffsetType(TrailingOffsetType.PRICE)
                .trailingWatermarkPx("150.00")
                .trailingWatermarkTs(OffsetDateTime.parse("2025-10-31T13:35:10.000000000Z"))
                .underlyingInstrumentId("a1a2a3a4-b1b2-c1c2-d1d2-d3d4d5d6d7d8")
                .build()

        assertThat(order.id()).isEqualTo("0195f6c7-4f64-7e3c-8b0a-1d8e4f5e6a7b")
        assertThat(order.accountId()).isEqualTo(19816L)
        assertThat(order.clientOrderId()).isEqualTo("my-ref-id-20251001-001")
        assertThat(order.createdAt())
            .isEqualTo(OffsetDateTime.parse("2025-10-31T13:30:00.000000000Z"))
        assertThat(order.filledQuantity()).isEqualTo("50")
        assertThat(order.instrumentId()).isEqualTo("f47ac10b-58cc-4372-a567-0e02b2c3d479")
        assertThat(order.instrumentType()).isEqualTo(SecurityType.COMMON_STOCK)
        assertThat(order.leavesQuantity()).isEqualTo("50")
        assertThat(order.orderType()).isEqualTo(OrderType.LIMIT)
        assertThat(order.quantity()).isEqualTo("100")
        assertThat(order.side()).isEqualTo(Side.BUY)
        assertThat(order.status()).isEqualTo(OrderStatus.PARTIALLY_FILLED)
        assertThat(order.symbol()).isEqualTo("AAPL")
        assertThat(order.timeInForce()).isEqualTo(TimeInForce.DAY)
        assertThat(order.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2025-10-31T13:35:10.000000000Z"))
        assertThat(order.venue()).isEqualTo("XNMS")
        assertThat(order.averageFillPrice()).contains("149.95")
        assertThat(order.details().getOrNull()).containsExactly("string")
        assertThat(order.expiresAt())
            .contains(OffsetDateTime.parse("2025-10-15T16:00:00.000000000Z"))
        assertThat(order.extendedHours()).contains(false)
        assertThat(order.limitOffset()).contains("0.10")
        assertThat(order.limitPrice()).contains("150.00")
        assertThat(order.queueState()).contains(QueueState.AWAITING_RELEASE)
        assertThat(order.releasesAt())
            .contains(OffsetDateTime.parse("2025-10-31T14:30:00.000000000Z"))
        assertThat(order.stopPrice()).isEmpty
        assertThat(order.trailingOffset()).contains("1.25")
        assertThat(order.trailingOffsetType()).contains(TrailingOffsetType.PRICE)
        assertThat(order.trailingWatermarkPx()).contains("150.00")
        assertThat(order.trailingWatermarkTs())
            .contains(OffsetDateTime.parse("2025-10-31T13:35:10.000000000Z"))
        assertThat(order.underlyingInstrumentId()).contains("a1a2a3a4-b1b2-c1c2-d1d2-d3d4d5d6d7d8")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val order =
            Order.builder()
                .id("0195f6c7-4f64-7e3c-8b0a-1d8e4f5e6a7b")
                .accountId(19816L)
                .clientOrderId("my-ref-id-20251001-001")
                .createdAt(OffsetDateTime.parse("2025-10-31T13:30:00.000000000Z"))
                .filledQuantity("50")
                .instrumentId("f47ac10b-58cc-4372-a567-0e02b2c3d479")
                .instrumentType(SecurityType.COMMON_STOCK)
                .leavesQuantity("50")
                .orderType(OrderType.LIMIT)
                .quantity("100")
                .side(Side.BUY)
                .status(OrderStatus.PARTIALLY_FILLED)
                .symbol("AAPL")
                .timeInForce(TimeInForce.DAY)
                .updatedAt(OffsetDateTime.parse("2025-10-31T13:35:10.000000000Z"))
                .venue("XNMS")
                .averageFillPrice("149.95")
                .addDetail("string")
                .expiresAt(OffsetDateTime.parse("2025-10-15T16:00:00.000000000Z"))
                .extendedHours(false)
                .limitOffset("0.10")
                .limitPrice("150.00")
                .queueState(QueueState.AWAITING_RELEASE)
                .releasesAt(OffsetDateTime.parse("2025-10-31T14:30:00.000000000Z"))
                .stopPrice(null)
                .trailingOffset("1.25")
                .trailingOffsetType(TrailingOffsetType.PRICE)
                .trailingWatermarkPx("150.00")
                .trailingWatermarkTs(OffsetDateTime.parse("2025-10-31T13:35:10.000000000Z"))
                .underlyingInstrumentId("a1a2a3a4-b1b2-c1c2-d1d2-d3d4d5d6d7d8")
                .build()

        val roundtrippedOrder =
            jsonMapper.readValue(jsonMapper.writeValueAsString(order), jacksonTypeRef<Order>())

        assertThat(roundtrippedOrder).isEqualTo(order)
    }
}
