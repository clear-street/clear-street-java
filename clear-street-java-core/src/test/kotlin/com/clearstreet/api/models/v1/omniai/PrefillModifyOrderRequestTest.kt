// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.omniai

import com.clearstreet.api.core.jsonMapper
import com.clearstreet.api.models.v1.orders.TrailingOffsetType
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PrefillModifyOrderRequestTest {

    @Test
    fun create() {
        val prefillModifyOrderRequest =
            PrefillModifyOrderRequest.builder()
                .accountId(0L)
                .limitOffset("0.50")
                .limitPrice("49.00")
                .orderId("order_id")
                .quantity("1")
                .stopPrice("52.00")
                .trailingOffset("2.00")
                .trailingOffsetType(TrailingOffsetType.PRICE)
                .build()

        assertThat(prefillModifyOrderRequest.accountId()).contains(0L)
        assertThat(prefillModifyOrderRequest.limitOffset()).contains("0.50")
        assertThat(prefillModifyOrderRequest.limitPrice()).contains("49.00")
        assertThat(prefillModifyOrderRequest.orderId()).contains("order_id")
        assertThat(prefillModifyOrderRequest.quantity()).contains("1")
        assertThat(prefillModifyOrderRequest.stopPrice()).contains("52.00")
        assertThat(prefillModifyOrderRequest.trailingOffset()).contains("2.00")
        assertThat(prefillModifyOrderRequest.trailingOffsetType())
            .contains(TrailingOffsetType.PRICE)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val prefillModifyOrderRequest =
            PrefillModifyOrderRequest.builder()
                .accountId(0L)
                .limitOffset("0.50")
                .limitPrice("49.00")
                .orderId("order_id")
                .quantity("1")
                .stopPrice("52.00")
                .trailingOffset("2.00")
                .trailingOffsetType(TrailingOffsetType.PRICE)
                .build()

        val roundtrippedPrefillModifyOrderRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(prefillModifyOrderRequest),
                jacksonTypeRef<PrefillModifyOrderRequest>(),
            )

        assertThat(roundtrippedPrefillModifyOrderRequest).isEqualTo(prefillModifyOrderRequest)
    }
}
