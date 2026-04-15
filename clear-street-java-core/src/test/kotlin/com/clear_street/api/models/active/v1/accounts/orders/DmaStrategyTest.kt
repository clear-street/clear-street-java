// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.accounts.orders

import com.clear_street.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DmaStrategyTest {

    @Test
    fun create() {
        val dmaStrategy = DmaStrategy.builder().destination("destination").build()

        assertThat(dmaStrategy.destination()).isEqualTo("destination")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val dmaStrategy = DmaStrategy.builder().destination("destination").build()

        val roundtrippedDmaStrategy =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(dmaStrategy),
                jacksonTypeRef<DmaStrategy>(),
            )

        assertThat(roundtrippedDmaStrategy).isEqualTo(dmaStrategy)
    }
}
