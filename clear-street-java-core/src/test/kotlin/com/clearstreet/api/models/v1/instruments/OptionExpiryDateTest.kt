// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.instruments

import com.clearstreet.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OptionExpiryDateTest {

    @Test
    fun create() {
        val optionExpiryDate =
            OptionExpiryDate.builder()
                .date(LocalDate.parse("2026-06-19"))
                .hasSettlesOnClose(true)
                .hasSettlesOnOpen(false)
                .build()

        assertThat(optionExpiryDate.date()).isEqualTo(LocalDate.parse("2026-06-19"))
        assertThat(optionExpiryDate.hasSettlesOnClose()).isEqualTo(true)
        assertThat(optionExpiryDate.hasSettlesOnOpen()).isEqualTo(false)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val optionExpiryDate =
            OptionExpiryDate.builder()
                .date(LocalDate.parse("2026-06-19"))
                .hasSettlesOnClose(true)
                .hasSettlesOnOpen(false)
                .build()

        val roundtrippedOptionExpiryDate =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(optionExpiryDate),
                jacksonTypeRef<OptionExpiryDate>(),
            )

        assertThat(roundtrippedOptionExpiryDate).isEqualTo(optionExpiryDate)
    }
}
