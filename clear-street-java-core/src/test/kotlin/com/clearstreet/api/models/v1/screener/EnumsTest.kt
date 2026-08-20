// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.screener

import com.clearstreet.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EnumsTest {

    @Test
    fun create() {
        val enums =
            Enums.builder()
                .addBuiltinVariable("string")
                .addCategory("string")
                .addDateUnit("string")
                .addFormat("string")
                .addLookback("string")
                .addModifierOp("string")
                .addOperator("string")
                .addOperatorArg("string")
                .addPeriod("string")
                .addValueType("string")
                .build()

        assertThat(enums.builtinVariable()).containsExactly("string")
        assertThat(enums.category()).containsExactly("string")
        assertThat(enums.dateUnit()).containsExactly("string")
        assertThat(enums.format()).containsExactly("string")
        assertThat(enums.lookback()).containsExactly("string")
        assertThat(enums.modifierOp()).containsExactly("string")
        assertThat(enums.operator()).containsExactly("string")
        assertThat(enums.operatorArg()).containsExactly("string")
        assertThat(enums.period()).containsExactly("string")
        assertThat(enums.valueType()).containsExactly("string")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val enums =
            Enums.builder()
                .addBuiltinVariable("string")
                .addCategory("string")
                .addDateUnit("string")
                .addFormat("string")
                .addLookback("string")
                .addModifierOp("string")
                .addOperator("string")
                .addOperatorArg("string")
                .addPeriod("string")
                .addValueType("string")
                .build()

        val roundtrippedEnums =
            jsonMapper.readValue(jsonMapper.writeValueAsString(enums), jacksonTypeRef<Enums>())

        assertThat(roundtrippedEnums).isEqualTo(enums)
    }
}
