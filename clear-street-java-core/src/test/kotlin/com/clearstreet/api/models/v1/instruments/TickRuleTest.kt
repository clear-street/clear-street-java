// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.instruments

import com.clearstreet.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TickRuleTest {

    @Test
    fun create() {
        val tickRule =
            TickRule.builder().startPrice("3.00").tickSize("0.10").endPrice("10.00").build()

        assertThat(tickRule.startPrice()).isEqualTo("3.00")
        assertThat(tickRule.tickSize()).isEqualTo("0.10")
        assertThat(tickRule.endPrice()).contains("10.00")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val tickRule =
            TickRule.builder().startPrice("3.00").tickSize("0.10").endPrice("10.00").build()

        val roundtrippedTickRule =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(tickRule),
                jacksonTypeRef<TickRule>(),
            )

        assertThat(roundtrippedTickRule).isEqualTo(tickRule)
    }
}
