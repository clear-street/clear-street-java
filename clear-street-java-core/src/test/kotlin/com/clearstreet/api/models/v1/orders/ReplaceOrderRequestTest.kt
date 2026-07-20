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
                .limitPrice("49.00")
                .quantity("1")
                .stopPrice("52.00")
                .build()

        assertThat(replaceOrderRequest.limitPrice()).contains("49.00")
        assertThat(replaceOrderRequest.quantity()).contains("1")
        assertThat(replaceOrderRequest.stopPrice()).contains("52.00")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val replaceOrderRequest =
            ReplaceOrderRequest.builder()
                .limitPrice("49.00")
                .quantity("1")
                .stopPrice("52.00")
                .build()

        val roundtrippedReplaceOrderRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(replaceOrderRequest),
                jacksonTypeRef<ReplaceOrderRequest>(),
            )

        assertThat(roundtrippedReplaceOrderRequest).isEqualTo(replaceOrderRequest)
    }
}
