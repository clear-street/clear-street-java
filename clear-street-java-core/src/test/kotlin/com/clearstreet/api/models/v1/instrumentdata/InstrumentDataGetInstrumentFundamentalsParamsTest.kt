// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.instrumentdata

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InstrumentDataGetInstrumentFundamentalsParamsTest {

    @Test
    fun create() {
        InstrumentDataGetInstrumentFundamentalsParams.builder().instrumentId("x").build()
    }

    @Test
    fun pathParams() {
        val params =
            InstrumentDataGetInstrumentFundamentalsParams.builder().instrumentId("x").build()

        assertThat(params._pathParam(0)).isEqualTo("x")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
