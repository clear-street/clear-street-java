// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.screener

import com.clear_street.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ModifierTest {

    @Test
    fun create() {
        val modifier = Modifier.builder().addArg(30.0).addArg("DAY").name(ModifierOp.SUB).build()

        assertThat(modifier.args())
            .containsExactly(Modifier.Arg.ofNumber(30.0), Modifier.Arg.ofString("DAY"))
        assertThat(modifier.name()).isEqualTo(ModifierOp.SUB)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val modifier = Modifier.builder().addArg(30.0).addArg("DAY").name(ModifierOp.SUB).build()

        val roundtrippedModifier =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(modifier),
                jacksonTypeRef<Modifier>(),
            )

        assertThat(roundtrippedModifier).isEqualTo(modifier)
    }
}
