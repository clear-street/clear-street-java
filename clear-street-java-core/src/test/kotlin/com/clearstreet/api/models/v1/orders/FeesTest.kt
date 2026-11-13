// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.orders

import com.clearstreet.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FeesTest {

    @Test
    fun create() {
        val fees = Fees.builder().total("0.10").exchangeFee("0.10").build()

        assertThat(fees.total()).isEqualTo("0.10")
        assertThat(fees.exchangeFee()).contains("0.10")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val fees = Fees.builder().total("0.10").exchangeFee("0.10").build()

        val roundtrippedFees =
            jsonMapper.readValue(jsonMapper.writeValueAsString(fees), jacksonTypeRef<Fees>())

        assertThat(roundtrippedFees).isEqualTo(fees)
    }
}
