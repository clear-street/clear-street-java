// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.orders

import com.clearstreet.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EventContractExecutionTest {

    @Test
    fun create() {
        val eventContractExecution =
            EventContractExecution.builder()
                .action(Side.BUY)
                .contractSide(EventContractSide.YES)
                .noPrice("0.40")
                .build()

        assertThat(eventContractExecution.action()).isEqualTo(Side.BUY)
        assertThat(eventContractExecution.contractSide()).isEqualTo(EventContractSide.YES)
        assertThat(eventContractExecution.noPrice()).contains("0.40")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val eventContractExecution =
            EventContractExecution.builder()
                .action(Side.BUY)
                .contractSide(EventContractSide.YES)
                .noPrice("0.40")
                .build()

        val roundtrippedEventContractExecution =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(eventContractExecution),
                jacksonTypeRef<EventContractExecution>(),
            )

        assertThat(roundtrippedEventContractExecution).isEqualTo(eventContractExecution)
    }
}
