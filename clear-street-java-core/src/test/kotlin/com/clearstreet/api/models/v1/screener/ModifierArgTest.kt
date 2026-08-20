// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.screener

import com.clearstreet.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ModifierArgTest {

    @Test
    fun create() {
        val modifierArg =
            ModifierArg.builder()
                .kind("kind")
                .note("note")
                .position(0)
                .required(true)
                .default_("default")
                .ref("ref")
                .build()

        assertThat(modifierArg.kind()).isEqualTo("kind")
        assertThat(modifierArg.note()).isEqualTo("note")
        assertThat(modifierArg.position()).isEqualTo(0)
        assertThat(modifierArg.required()).isEqualTo(true)
        assertThat(modifierArg.default_()).contains("default")
        assertThat(modifierArg.ref()).contains("ref")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val modifierArg =
            ModifierArg.builder()
                .kind("kind")
                .note("note")
                .position(0)
                .required(true)
                .default_("default")
                .ref("ref")
                .build()

        val roundtrippedModifierArg =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(modifierArg),
                jacksonTypeRef<ModifierArg>(),
            )

        assertThat(roundtrippedModifierArg).isEqualTo(modifierArg)
    }
}
