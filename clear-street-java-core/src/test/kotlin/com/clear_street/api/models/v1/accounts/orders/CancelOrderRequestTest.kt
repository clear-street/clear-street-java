// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.accounts.orders

import com.clear_street.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CancelOrderRequestTest {

    @Test
    fun create() {
        val cancelOrderRequest =
            CancelOrderRequest.builder().accountId(0L).orderId("order_id").build()

        assertThat(cancelOrderRequest.accountId()).isEqualTo(0L)
        assertThat(cancelOrderRequest.orderId()).isEqualTo("order_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val cancelOrderRequest =
            CancelOrderRequest.builder().accountId(0L).orderId("order_id").build()

        val roundtrippedCancelOrderRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cancelOrderRequest),
                jacksonTypeRef<CancelOrderRequest>(),
            )

        assertThat(roundtrippedCancelOrderRequest).isEqualTo(cancelOrderRequest)
    }
}
