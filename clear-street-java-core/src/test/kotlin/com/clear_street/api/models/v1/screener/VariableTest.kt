// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.screener

import com.clear_street.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VariableTest {

    @Test
    fun create() {
        val variable =
            Variable.builder()
                .name("today")
                .lookback(FieldLookback.ONE_WEEK)
                .modifier(
                    Modifier.builder().addArg(30.0).addArg("DAY").name(ModifierOp.SUB).build()
                )
                .period(FieldPeriod.QUARTER)
                .build()

        assertThat(variable.name()).isEqualTo("today")
        assertThat(variable.lookback()).contains(FieldLookback.ONE_WEEK)
        assertThat(variable.modifier())
            .contains(Modifier.builder().addArg(30.0).addArg("DAY").name(ModifierOp.SUB).build())
        assertThat(variable.period()).contains(FieldPeriod.QUARTER)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val variable =
            Variable.builder()
                .name("today")
                .lookback(FieldLookback.ONE_WEEK)
                .modifier(
                    Modifier.builder().addArg(30.0).addArg("DAY").name(ModifierOp.SUB).build()
                )
                .period(FieldPeriod.QUARTER)
                .build()

        val roundtrippedVariable =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(variable),
                jacksonTypeRef<Variable>(),
            )

        assertThat(roundtrippedVariable).isEqualTo(variable)
    }
}
