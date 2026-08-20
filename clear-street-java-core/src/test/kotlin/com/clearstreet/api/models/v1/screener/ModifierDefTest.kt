// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.screener

import com.clearstreet.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ModifierDefTest {

    @Test
    fun create() {
        val modifierDef =
            ModifierDef.builder()
                .addArg(
                    ModifierArg.builder()
                        .kind("kind")
                        .note("note")
                        .position(0)
                        .required(true)
                        .default_("default")
                        .ref("ref")
                        .build()
                )
                .name("name")
                .build()

        assertThat(modifierDef.args())
            .containsExactly(
                ModifierArg.builder()
                    .kind("kind")
                    .note("note")
                    .position(0)
                    .required(true)
                    .default_("default")
                    .ref("ref")
                    .build()
            )
        assertThat(modifierDef.name()).isEqualTo("name")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val modifierDef =
            ModifierDef.builder()
                .addArg(
                    ModifierArg.builder()
                        .kind("kind")
                        .note("note")
                        .position(0)
                        .required(true)
                        .default_("default")
                        .ref("ref")
                        .build()
                )
                .name("name")
                .build()

        val roundtrippedModifierDef =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(modifierDef),
                jacksonTypeRef<ModifierDef>(),
            )

        assertThat(roundtrippedModifierDef).isEqualTo(modifierDef)
    }
}
