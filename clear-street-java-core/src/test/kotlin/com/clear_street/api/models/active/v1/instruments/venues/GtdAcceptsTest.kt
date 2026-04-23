// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.instruments.venues

import com.clear_street.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GtdAcceptsTest {

    @Test
    fun create() {
        val gtdAccepts = GtdAccepts.builder().date(true).timestamp(true).build()

        assertThat(gtdAccepts.date()).isEqualTo(true)
        assertThat(gtdAccepts.timestamp()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val gtdAccepts = GtdAccepts.builder().date(true).timestamp(true).build()

        val roundtrippedGtdAccepts =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(gtdAccepts),
                jacksonTypeRef<GtdAccepts>(),
            )

        assertThat(roundtrippedGtdAccepts).isEqualTo(gtdAccepts)
    }
}
