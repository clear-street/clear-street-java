// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.screener

import com.clearstreet.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FieldRefTest {

    @Test
    fun create() {
        val fieldRef =
            FieldRef.builder()
                .name("market_cap")
                .lookback(FieldLookback.ONE_DAY)
                .period(FieldPeriod.QUARTER)
                .valueType(FieldType.DECIMAL)
                .build()

        assertThat(fieldRef.name()).isEqualTo("market_cap")
        assertThat(fieldRef.lookback()).contains(FieldLookback.ONE_DAY)
        assertThat(fieldRef.period()).contains(FieldPeriod.QUARTER)
        assertThat(fieldRef.valueType()).contains(FieldType.DECIMAL)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val fieldRef =
            FieldRef.builder()
                .name("market_cap")
                .lookback(FieldLookback.ONE_DAY)
                .period(FieldPeriod.QUARTER)
                .valueType(FieldType.DECIMAL)
                .build()

        val roundtrippedFieldRef =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(fieldRef),
                jacksonTypeRef<FieldRef>(),
            )

        assertThat(roundtrippedFieldRef).isEqualTo(fieldRef)
    }
}
