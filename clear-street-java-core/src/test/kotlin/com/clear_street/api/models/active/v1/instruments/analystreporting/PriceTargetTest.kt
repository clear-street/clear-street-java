// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.instruments.analystreporting

import com.clear_street.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PriceTargetTest {

    @Test
    fun create() {
        val priceTarget =
            PriceTarget.builder()
                .average("220.00")
                .currency("USD")
                .high("250.00")
                .low("180.00")
                .build()

        assertThat(priceTarget.average()).isEqualTo("220.00")
        assertThat(priceTarget.currency()).isEqualTo("USD")
        assertThat(priceTarget.high()).isEqualTo("250.00")
        assertThat(priceTarget.low()).isEqualTo("180.00")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val priceTarget =
            PriceTarget.builder()
                .average("220.00")
                .currency("USD")
                .high("250.00")
                .low("180.00")
                .build()

        val roundtrippedPriceTarget =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(priceTarget),
                jacksonTypeRef<PriceTarget>(),
            )

        assertThat(roundtrippedPriceTarget).isEqualTo(priceTarget)
    }
}
