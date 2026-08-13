// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.orders

import com.clearstreet.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ReplaceOrderRequestTest {

    @Test
    fun create() {
        val replaceOrderRequest =
            ReplaceOrderRequest.builder()
                .limitOffset("0.50")
                .limitPrice("49.00")
                .quantity("1")
                .stopPrice("52.00")
                .trailingOffset("2.00")
                .trailingOffsetType(TrailingOffsetType.PRICE)
                .build()

        assertThat(replaceOrderRequest.limitOffset()).contains("0.50")
        assertThat(replaceOrderRequest.limitPrice()).contains("49.00")
        assertThat(replaceOrderRequest.quantity()).contains("1")
        assertThat(replaceOrderRequest.stopPrice()).contains("52.00")
        assertThat(replaceOrderRequest.trailingOffset()).contains("2.00")
        assertThat(replaceOrderRequest.trailingOffsetType()).contains(TrailingOffsetType.PRICE)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val replaceOrderRequest =
            ReplaceOrderRequest.builder()
                .limitOffset("0.50")
                .limitPrice("49.00")
                .quantity("1")
                .stopPrice("52.00")
                .trailingOffset("2.00")
                .trailingOffsetType(TrailingOffsetType.PRICE)
                .build()

        val roundtrippedReplaceOrderRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(replaceOrderRequest),
                jacksonTypeRef<ReplaceOrderRequest>(),
            )

        assertThat(roundtrippedReplaceOrderRequest).isEqualTo(replaceOrderRequest)
    }
}
