// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.screener

import com.clearstreet.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RulesTest {

    @Test
    fun create() {
        val rules =
            Rules.builder()
                .apiNameComposition("api_name_composition")
                .axes("axes")
                .defaults("defaults")
                .modifiers("modifiers")
                .operators("operators")
                .variables("variables")
                .build()

        assertThat(rules.apiNameComposition()).isEqualTo("api_name_composition")
        assertThat(rules.axes()).isEqualTo("axes")
        assertThat(rules.defaults()).isEqualTo("defaults")
        assertThat(rules.modifiers()).isEqualTo("modifiers")
        assertThat(rules.operators()).isEqualTo("operators")
        assertThat(rules.variables()).isEqualTo("variables")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val rules =
            Rules.builder()
                .apiNameComposition("api_name_composition")
                .axes("axes")
                .defaults("defaults")
                .modifiers("modifiers")
                .operators("operators")
                .variables("variables")
                .build()

        val roundtrippedRules =
            jsonMapper.readValue(jsonMapper.writeValueAsString(rules), jacksonTypeRef<Rules>())

        assertThat(roundtrippedRules).isEqualTo(rules)
    }
}
