// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.screener

import com.clearstreet.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VariableDefTest {

    @Test
    fun create() {
        val variableDef =
            VariableDef.builder()
                .description("description")
                .name("name")
                .resolvesTo("resolves_to")
                .build()

        assertThat(variableDef.description()).isEqualTo("description")
        assertThat(variableDef.name()).isEqualTo("name")
        assertThat(variableDef.resolvesTo()).isEqualTo("resolves_to")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val variableDef =
            VariableDef.builder()
                .description("description")
                .name("name")
                .resolvesTo("resolves_to")
                .build()

        val roundtrippedVariableDef =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(variableDef),
                jacksonTypeRef<VariableDef>(),
            )

        assertThat(roundtrippedVariableDef).isEqualTo(variableDef)
    }
}
