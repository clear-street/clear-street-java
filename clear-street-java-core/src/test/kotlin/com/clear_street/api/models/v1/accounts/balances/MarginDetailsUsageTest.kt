// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.accounts.balances

import com.clear_street.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MarginDetailsUsageTest {

    @Test
    fun create() {
        val marginDetailsUsage =
            MarginDetailsUsage.builder().total("100000.00").used("5000.00").build()

        assertThat(marginDetailsUsage.total()).isEqualTo("100000.00")
        assertThat(marginDetailsUsage.used()).isEqualTo("5000.00")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val marginDetailsUsage =
            MarginDetailsUsage.builder().total("100000.00").used("5000.00").build()

        val roundtrippedMarginDetailsUsage =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(marginDetailsUsage),
                jacksonTypeRef<MarginDetailsUsage>(),
            )

        assertThat(roundtrippedMarginDetailsUsage).isEqualTo(marginDetailsUsage)
    }
}
