// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.orders

import com.clearstreet.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EventContractOrderTest {

    @Test
    fun create() {
        val eventContractOrder =
            EventContractOrder.builder()
                .action(Side.BUY)
                .contractSide(EventContractSide.YES)
                .noAverageFillPrice("0.40")
                .noLimitPrice("0.40")
                .build()

        assertThat(eventContractOrder.action()).isEqualTo(Side.BUY)
        assertThat(eventContractOrder.contractSide()).isEqualTo(EventContractSide.YES)
        assertThat(eventContractOrder.noAverageFillPrice()).contains("0.40")
        assertThat(eventContractOrder.noLimitPrice()).contains("0.40")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val eventContractOrder =
            EventContractOrder.builder()
                .action(Side.BUY)
                .contractSide(EventContractSide.YES)
                .noAverageFillPrice("0.40")
                .noLimitPrice("0.40")
                .build()

        val roundtrippedEventContractOrder =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(eventContractOrder),
                jacksonTypeRef<EventContractOrder>(),
            )

        assertThat(roundtrippedEventContractOrder).isEqualTo(eventContractOrder)
    }
}
