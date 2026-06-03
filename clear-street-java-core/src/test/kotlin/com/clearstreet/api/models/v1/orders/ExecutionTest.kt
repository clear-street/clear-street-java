// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.orders

import com.clearstreet.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExecutionTest {

    @Test
    fun create() {
        val execution =
            Execution.builder()
                .id("019d216d-9857-7e23-ae01-edc07126c9e4")
                .instrumentId("528ec5c3-cdbf-447c-b995-ec6c83cfbc02")
                .orderId("01928b4d-c000-7000-8000-000000000001")
                .price("150.25")
                .quantity("100")
                .side(Side.BUY)
                .symbol("AAPL")
                .transactionTime(OffsetDateTime.parse("2026-03-24T19:58:43.798000Z"))
                .build()

        assertThat(execution.id()).isEqualTo("019d216d-9857-7e23-ae01-edc07126c9e4")
        assertThat(execution.instrumentId()).isEqualTo("528ec5c3-cdbf-447c-b995-ec6c83cfbc02")
        assertThat(execution.orderId()).isEqualTo("01928b4d-c000-7000-8000-000000000001")
        assertThat(execution.price()).isEqualTo("150.25")
        assertThat(execution.quantity()).isEqualTo("100")
        assertThat(execution.side()).isEqualTo(Side.BUY)
        assertThat(execution.symbol()).isEqualTo("AAPL")
        assertThat(execution.transactionTime())
            .isEqualTo(OffsetDateTime.parse("2026-03-24T19:58:43.798000Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val execution =
            Execution.builder()
                .id("019d216d-9857-7e23-ae01-edc07126c9e4")
                .instrumentId("528ec5c3-cdbf-447c-b995-ec6c83cfbc02")
                .orderId("01928b4d-c000-7000-8000-000000000001")
                .price("150.25")
                .quantity("100")
                .side(Side.BUY)
                .symbol("AAPL")
                .transactionTime(OffsetDateTime.parse("2026-03-24T19:58:43.798000Z"))
                .build()

        val roundtrippedExecution =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(execution),
                jacksonTypeRef<Execution>(),
            )

        assertThat(roundtrippedExecution).isEqualTo(execution)
    }
}
