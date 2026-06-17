// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.screener

import com.clearstreet.api.core.jsonMapper
import com.clearstreet.api.models.v1.SortDirection
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SortSpecTest {

    @Test
    fun create() {
        val sortSpec =
            SortSpec.builder()
                .field(
                    FieldRef.builder()
                        .name("market_cap")
                        .lookback(FieldLookback.ONE_DAY)
                        .period(FieldPeriod.QUARTER)
                        .valueType(FieldType.DECIMAL)
                        .build()
                )
                .direction(SortDirection.DESC)
                .build()

        assertThat(sortSpec.field())
            .isEqualTo(
                FieldRef.builder()
                    .name("market_cap")
                    .lookback(FieldLookback.ONE_DAY)
                    .period(FieldPeriod.QUARTER)
                    .valueType(FieldType.DECIMAL)
                    .build()
            )
        assertThat(sortSpec.direction()).contains(SortDirection.DESC)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val sortSpec =
            SortSpec.builder()
                .field(
                    FieldRef.builder()
                        .name("market_cap")
                        .lookback(FieldLookback.ONE_DAY)
                        .period(FieldPeriod.QUARTER)
                        .valueType(FieldType.DECIMAL)
                        .build()
                )
                .direction(SortDirection.DESC)
                .build()

        val roundtrippedSortSpec =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(sortSpec),
                jacksonTypeRef<SortSpec>(),
            )

        assertThat(roundtrippedSortSpec).isEqualTo(sortSpec)
    }
}
