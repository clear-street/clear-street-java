// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.screener

import com.clearstreet.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ModifierTest {

    @Test
    fun create() {
        val modifier =
            Modifier.builder().addArg(30.0).addArg("DAY").name(ModifierOp.SUBTRACT).build()

        assertThat(modifier.args())
            .containsExactly(Modifier.Arg.ofNumber(30.0), Modifier.Arg.ofString("DAY"))
        assertThat(modifier.name()).isEqualTo(ModifierOp.SUBTRACT)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val modifier =
            Modifier.builder().addArg(30.0).addArg("DAY").name(ModifierOp.SUBTRACT).build()

        val roundtrippedModifier =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(modifier),
                jacksonTypeRef<Modifier>(),
            )

        assertThat(roundtrippedModifier).isEqualTo(modifier)
    }
}
