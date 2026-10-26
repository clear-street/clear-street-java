// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.orders

import com.clearstreet.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OrderPreviewPositionTest {

    @Test
    fun create() {
        val orderPreviewPosition =
            OrderPreviewPosition.builder()
                .instrumentId("a1a2a3a4-b1b2-c1c2-d1d2-d3d4d5d6d7d8")
                .quantity(
                    OrderPreviewDelta.builder()
                        .after("190000.00")
                        .before("200000.00")
                        .change("-10000.00")
                        .build()
                )
                .symbol("AAPL")
                .build()

        assertThat(orderPreviewPosition.instrumentId())
            .isEqualTo("a1a2a3a4-b1b2-c1c2-d1d2-d3d4d5d6d7d8")
        assertThat(orderPreviewPosition.quantity())
            .isEqualTo(
                OrderPreviewDelta.builder()
                    .after("190000.00")
                    .before("200000.00")
                    .change("-10000.00")
                    .build()
            )
        assertThat(orderPreviewPosition.symbol()).isEqualTo("AAPL")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val orderPreviewPosition =
            OrderPreviewPosition.builder()
                .instrumentId("a1a2a3a4-b1b2-c1c2-d1d2-d3d4d5d6d7d8")
                .quantity(
                    OrderPreviewDelta.builder()
                        .after("190000.00")
                        .before("200000.00")
                        .change("-10000.00")
                        .build()
                )
                .symbol("AAPL")
                .build()

        val roundtrippedOrderPreviewPosition =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(orderPreviewPosition),
                jacksonTypeRef<OrderPreviewPosition>(),
            )

        assertThat(roundtrippedOrderPreviewPosition).isEqualTo(orderPreviewPosition)
    }
}
