// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.screener

import com.clearstreet.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FieldKindTest {

    @Test
    fun create() {
        val fieldKind =
            FieldKind.builder()
                .category("category")
                .addCombination(Combination.builder().lookback("lookback").period("period").build())
                .defaultCombination(
                    Combination.builder().lookback("lookback").period("period").build()
                )
                .format("format")
                .valueType("value_type")
                .build()

        assertThat(fieldKind.category()).isEqualTo("category")
        assertThat(fieldKind.combinations())
            .containsExactly(Combination.builder().lookback("lookback").period("period").build())
        assertThat(fieldKind.defaultCombination())
            .isEqualTo(Combination.builder().lookback("lookback").period("period").build())
        assertThat(fieldKind.format()).isEqualTo("format")
        assertThat(fieldKind.valueType()).isEqualTo("value_type")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val fieldKind =
            FieldKind.builder()
                .category("category")
                .addCombination(Combination.builder().lookback("lookback").period("period").build())
                .defaultCombination(
                    Combination.builder().lookback("lookback").period("period").build()
                )
                .format("format")
                .valueType("value_type")
                .build()

        val roundtrippedFieldKind =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(fieldKind),
                jacksonTypeRef<FieldKind>(),
            )

        assertThat(roundtrippedFieldKind).isEqualTo(fieldKind)
    }
}
