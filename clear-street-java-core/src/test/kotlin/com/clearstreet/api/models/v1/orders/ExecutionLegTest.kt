// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.orders

import com.clearstreet.api.core.jsonMapper
import com.clearstreet.api.models.v1.SecurityType
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExecutionLegTest {

    @Test
    fun create() {
        val executionLeg =
            ExecutionLeg.builder()
                .price("price")
                .ratio("ratio")
                .side(Side.BUY)
                .symbol("AAPL  250620C00150000")
                .instrumentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .instrumentType(SecurityType.COMMON_STOCK)
                .underlyingInstrumentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .underlyingInstrumentType(SecurityType.COMMON_STOCK)
                .venue("XNAS")
                .build()

        assertThat(executionLeg.price()).isEqualTo("price")
        assertThat(executionLeg.ratio()).isEqualTo("ratio")
        assertThat(executionLeg.side()).isEqualTo(Side.BUY)
        assertThat(executionLeg.symbol()).isEqualTo("AAPL  250620C00150000")
        assertThat(executionLeg.instrumentId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(executionLeg.instrumentType()).contains(SecurityType.COMMON_STOCK)
        assertThat(executionLeg.underlyingInstrumentId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(executionLeg.underlyingInstrumentType()).contains(SecurityType.COMMON_STOCK)
        assertThat(executionLeg.venue()).contains("XNAS")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val executionLeg =
            ExecutionLeg.builder()
                .price("price")
                .ratio("ratio")
                .side(Side.BUY)
                .symbol("AAPL  250620C00150000")
                .instrumentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .instrumentType(SecurityType.COMMON_STOCK)
                .underlyingInstrumentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .underlyingInstrumentType(SecurityType.COMMON_STOCK)
                .venue("XNAS")
                .build()

        val roundtrippedExecutionLeg =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(executionLeg),
                jacksonTypeRef<ExecutionLeg>(),
            )

        assertThat(roundtrippedExecutionLeg).isEqualTo(executionLeg)
    }
}
