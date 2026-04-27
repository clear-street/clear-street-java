// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.accounts.orders

import com.clear_street.api.core.jsonMapper
import com.clear_street.api.models.active.v1.SecurityIdSource
import com.clear_street.api.models.active.v1.SecurityType
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
                .instrumentType(SecurityType.COMMON_STOCK)
                .leavesQuantity("50")
                .orderType(OrderType.LIMIT)
                .quantity("100")
                .securityId("037833100")
                .securityIdSource(SecurityIdSource.FIGI)
                .side(Side.BUY)
                .status(OrderStatus.PARTIALLY_FILLED)
                .symbol("AAPL")
                .timeInForce(TimeInForce.DAY)
                .updatedAt(OffsetDateTime.parse("2025-10-31T13:35:10.000000000Z"))
                .venue("XNMS")
                .averageFillPrice("149.95")
                .addDetail("string")
                .expiresAt(OffsetDateTime.parse("2025-10-15T16:00:00.000000000Z"))
                .limitOffset("0.10")
                .limitPrice("150.00")
                .stopPrice(null)
                .strategy(
                    OrderStrategy.Sor.builder()
                        .endAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .startAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .urgency(Urgency.SUPER_PASSIVE)
                        .type(OrderStrategy.Sor.Type.SOR)
                        .build()
                )
                .trailingOffsetAmt("1.25")
                .trailingOffsetAmtType(TrailingOffsetType.PRICE)
                .trailingWatermarkPx("150.00")
                .trailingWatermarkTs(OffsetDateTime.parse("2025-10-31T13:35:10.000000000Z"))
                .build()

        assertThat(order.id()).isEqualTo("0195f6c7-4f64-7e3c-8b0a-1d8e4f5e6a7b")
        assertThat(order.accountId()).isEqualTo(19816L)
        assertThat(order.clientOrderId()).isEqualTo("my-ref-id-20251001-001")
        assertThat(order.createdAt())
            .isEqualTo(OffsetDateTime.parse("2025-10-31T13:30:00.000000000Z"))
        assertThat(order.filledQuantity()).isEqualTo("50")
        assertThat(order.instrumentType()).isEqualTo(SecurityType.COMMON_STOCK)
        assertThat(order.leavesQuantity()).isEqualTo("50")
        assertThat(order.orderType()).isEqualTo(OrderType.LIMIT)
        assertThat(order.quantity()).isEqualTo("100")
        assertThat(order.securityId()).isEqualTo("037833100")
        assertThat(order.securityIdSource()).isEqualTo(SecurityIdSource.FIGI)
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
        assertThat(order.limitOffset()).contains("0.10")
        assertThat(order.limitPrice()).contains("150.00")
        assertThat(order.stopPrice()).isEmpty
        assertThat(order.strategy())
            .contains(
                OrderStrategy.ofSor(
                    OrderStrategy.Sor.builder()
                        .endAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .startAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .urgency(Urgency.SUPER_PASSIVE)
                        .type(OrderStrategy.Sor.Type.SOR)
                        .build()
                )
            )
        assertThat(order.trailingOffsetAmt()).contains("1.25")
        assertThat(order.trailingOffsetAmtType()).contains(TrailingOffsetType.PRICE)
        assertThat(order.trailingWatermarkPx()).contains("150.00")
        assertThat(order.trailingWatermarkTs())
            .contains(OffsetDateTime.parse("2025-10-31T13:35:10.000000000Z"))
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
                .instrumentType(SecurityType.COMMON_STOCK)
                .leavesQuantity("50")
                .orderType(OrderType.LIMIT)
                .quantity("100")
                .securityId("037833100")
                .securityIdSource(SecurityIdSource.FIGI)
                .side(Side.BUY)
                .status(OrderStatus.PARTIALLY_FILLED)
                .symbol("AAPL")
                .timeInForce(TimeInForce.DAY)
                .updatedAt(OffsetDateTime.parse("2025-10-31T13:35:10.000000000Z"))
                .venue("XNMS")
                .averageFillPrice("149.95")
                .addDetail("string")
                .expiresAt(OffsetDateTime.parse("2025-10-15T16:00:00.000000000Z"))
                .limitOffset("0.10")
                .limitPrice("150.00")
                .stopPrice(null)
                .strategy(
                    OrderStrategy.Sor.builder()
                        .endAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .startAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .urgency(Urgency.SUPER_PASSIVE)
                        .type(OrderStrategy.Sor.Type.SOR)
                        .build()
                )
                .trailingOffsetAmt("1.25")
                .trailingOffsetAmtType(TrailingOffsetType.PRICE)
                .trailingWatermarkPx("150.00")
                .trailingWatermarkTs(OffsetDateTime.parse("2025-10-31T13:35:10.000000000Z"))
                .build()

        val roundtrippedOrder =
            jsonMapper.readValue(jsonMapper.writeValueAsString(order), jacksonTypeRef<Order>())

        assertThat(roundtrippedOrder).isEqualTo(order)
    }
}
