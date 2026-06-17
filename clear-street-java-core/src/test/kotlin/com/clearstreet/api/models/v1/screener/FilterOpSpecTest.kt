// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.screener

import com.clearstreet.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FilterOpSpecTest {

    @Test
    fun create() {
        val filterOpSpec =
            FilterOpSpec.builder()
                .name(FilterOperator.LESS_THAN)
                .addArg(OperatorArg.LEFT_INCLUSIVE)
                .build()

        assertThat(filterOpSpec.name()).isEqualTo(FilterOperator.LESS_THAN)
        assertThat(filterOpSpec.args().getOrNull()).containsExactly(OperatorArg.LEFT_INCLUSIVE)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val filterOpSpec =
            FilterOpSpec.builder()
                .name(FilterOperator.LESS_THAN)
                .addArg(OperatorArg.LEFT_INCLUSIVE)
                .build()

        val roundtrippedFilterOpSpec =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(filterOpSpec),
                jacksonTypeRef<FilterOpSpec>(),
            )

        assertThat(roundtrippedFilterOpSpec).isEqualTo(filterOpSpec)
    }
}
