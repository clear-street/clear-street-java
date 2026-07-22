// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.orders

import com.clearstreet.api.core.jsonMapper
import com.clearstreet.api.models.v1.SecurityType
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
                .filledQuantity("0")
                .leavesQuantity("1")
                .orderType(OrderType.LIMIT)
                .quantity("1")
                .side(Side.BUY)
                .status(OrderStatus.PENDING_NEW)
                .timeInForce(TimeInForce.DAY)
                .updatedAt(OffsetDateTime.parse("2025-10-31T13:30:00.000000000Z"))
                .venue("XNAS")
                .averageFillPrice("47.95")
                .addDetail("string")
                .expiresAt(OffsetDateTime.parse("2025-10-15T16:00:00.000000000Z"))
                .extendedHours(false)
                .instrumentId("d4d5d6d7-e4e5-f4f5-a4a5-a6a7a8a9aaab")
                .instrumentType(SecurityType.COMMON_STOCK)
                .limitOffset("0.50")
                .limitPrice("48.00")
                .queueState(QueueState.AWAITING_RELEASE)
                .releasesAt(OffsetDateTime.parse("2025-10-31T14:30:00.000000000Z"))
                .stopPrice(null)
                .symbol("TSLA")
                .trailingLimitPx("47.50")
                .trailingOffset("2.00")
                .trailingOffsetType(TrailingOffsetType.PRICE)
                .trailingStopPx("48.00")
                .trailingWatermarkPx("50.00")
                .trailingWatermarkTs(OffsetDateTime.parse("2025-10-31T13:35:10.000000000Z"))
                .underlyingInstrumentId("a1a2a3a4-b1b2-c1c2-d1d2-d3d4d5d6d7d8")
                .build()

        assertThat(order.id()).isEqualTo("0195f6c7-4f64-7e3c-8b0a-1d8e4f5e6a7b")
        assertThat(order.accountId()).isEqualTo(19816L)
        assertThat(order.clientOrderId()).isEqualTo("my-ref-id-20251001-001")
        assertThat(order.createdAt())
            .isEqualTo(OffsetDateTime.parse("2025-10-31T13:30:00.000000000Z"))
        assertThat(order.filledQuantity()).isEqualTo("0")
        assertThat(order.leavesQuantity()).isEqualTo("1")
        assertThat(order.orderType()).isEqualTo(OrderType.LIMIT)
        assertThat(order.quantity()).isEqualTo("1")
        assertThat(order.side()).isEqualTo(Side.BUY)
        assertThat(order.status()).isEqualTo(OrderStatus.PENDING_NEW)
        assertThat(order.timeInForce()).isEqualTo(TimeInForce.DAY)
        assertThat(order.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2025-10-31T13:30:00.000000000Z"))
        assertThat(order.venue()).isEqualTo("XNAS")
        assertThat(order.averageFillPrice()).contains("47.95")
        assertThat(order.details().getOrNull()).containsExactly("string")
        assertThat(order.expiresAt())
            .contains(OffsetDateTime.parse("2025-10-15T16:00:00.000000000Z"))
        assertThat(order.extendedHours()).contains(false)
        assertThat(order.instrumentId()).contains("d4d5d6d7-e4e5-f4f5-a4a5-a6a7a8a9aaab")
        assertThat(order.instrumentType()).contains(SecurityType.COMMON_STOCK)
        assertThat(order.limitOffset()).contains("0.50")
        assertThat(order.limitPrice()).contains("48.00")
        assertThat(order.queueState()).contains(QueueState.AWAITING_RELEASE)
        assertThat(order.releasesAt())
            .contains(OffsetDateTime.parse("2025-10-31T14:30:00.000000000Z"))
        assertThat(order.stopPrice()).isEmpty
        assertThat(order.symbol()).contains("TSLA")
        assertThat(order.trailingLimitPx()).contains("47.50")
        assertThat(order.trailingOffset()).contains("2.00")
        assertThat(order.trailingOffsetType()).contains(TrailingOffsetType.PRICE)
        assertThat(order.trailingStopPx()).contains("48.00")
        assertThat(order.trailingWatermarkPx()).contains("50.00")
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
                .filledQuantity("0")
                .leavesQuantity("1")
                .orderType(OrderType.LIMIT)
                .quantity("1")
                .side(Side.BUY)
                .status(OrderStatus.PENDING_NEW)
                .timeInForce(TimeInForce.DAY)
                .updatedAt(OffsetDateTime.parse("2025-10-31T13:30:00.000000000Z"))
                .venue("XNAS")
                .averageFillPrice("47.95")
                .addDetail("string")
                .expiresAt(OffsetDateTime.parse("2025-10-15T16:00:00.000000000Z"))
                .extendedHours(false)
                .instrumentId("d4d5d6d7-e4e5-f4f5-a4a5-a6a7a8a9aaab")
                .instrumentType(SecurityType.COMMON_STOCK)
                .limitOffset("0.50")
                .limitPrice("48.00")
                .queueState(QueueState.AWAITING_RELEASE)
                .releasesAt(OffsetDateTime.parse("2025-10-31T14:30:00.000000000Z"))
                .stopPrice(null)
                .symbol("TSLA")
                .trailingLimitPx("47.50")
                .trailingOffset("2.00")
                .trailingOffsetType(TrailingOffsetType.PRICE)
                .trailingStopPx("48.00")
                .trailingWatermarkPx("50.00")
                .trailingWatermarkTs(OffsetDateTime.parse("2025-10-31T13:35:10.000000000Z"))
                .underlyingInstrumentId("a1a2a3a4-b1b2-c1c2-d1d2-d3d4d5d6d7d8")
                .build()

        val roundtrippedOrder =
            jsonMapper.readValue(jsonMapper.writeValueAsString(order), jacksonTypeRef<Order>())

        assertThat(roundtrippedOrder).isEqualTo(order)
    }
}
