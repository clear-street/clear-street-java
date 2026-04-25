// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.instruments.fundamentals

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FundamentalGetInstrumentFundamentalsParamsTest {

    @Test
    fun create() {
        FundamentalGetInstrumentFundamentalsParams.builder()
            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            FundamentalGetInstrumentFundamentalsParams.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
