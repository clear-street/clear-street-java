// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.accounts

import com.clearstreet.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MarginSessionDetailsTest {

    @Test
    fun create() {
        val marginSessionDetails =
            MarginSessionDetails.builder().buyingPower("500000.00").multiplier("2").build()

        assertThat(marginSessionDetails.buyingPower()).isEqualTo("500000.00")
        assertThat(marginSessionDetails.multiplier()).contains("2")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val marginSessionDetails =
            MarginSessionDetails.builder().buyingPower("500000.00").multiplier("2").build()

        val roundtrippedMarginSessionDetails =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(marginSessionDetails),
                jacksonTypeRef<MarginSessionDetails>(),
            )

        assertThat(roundtrippedMarginSessionDetails).isEqualTo(marginSessionDetails)
    }
}
