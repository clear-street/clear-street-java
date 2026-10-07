// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.locates

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LocateGetLocateRateByIdParamsTest {

    @Test
    fun create() {
        LocateGetLocateRateByIdParams.builder().instrumentId("x").build()
    }

    @Test
    fun pathParams() {
        val params = LocateGetLocateRateByIdParams.builder().instrumentId("x").build()

        assertThat(params._pathParam(0)).isEqualTo("x")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
