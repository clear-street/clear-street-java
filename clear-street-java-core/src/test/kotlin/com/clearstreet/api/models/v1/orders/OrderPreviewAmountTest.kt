// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.orders

import com.clearstreet.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OrderPreviewAmountTest {

    @Test
    fun create() {
        val orderPreviewAmount =
            OrderPreviewAmount.builder().grossAmount("10000.00").netAmount("10000.00").build()

        assertThat(orderPreviewAmount.grossAmount()).isEqualTo("10000.00")
        assertThat(orderPreviewAmount.netAmount()).isEqualTo("10000.00")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val orderPreviewAmount =
            OrderPreviewAmount.builder().grossAmount("10000.00").netAmount("10000.00").build()

        val roundtrippedOrderPreviewAmount =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(orderPreviewAmount),
                jacksonTypeRef<OrderPreviewAmount>(),
            )

        assertThat(roundtrippedOrderPreviewAmount).isEqualTo(orderPreviewAmount)
    }
}
