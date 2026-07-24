// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.instruments

import com.clearstreet.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InstrumentGetInstrumentByIdParamsTest {

    @Test
    fun create() {
        InstrumentGetInstrumentByIdParams.builder()
            .instrumentId("x")
            .includeOptionsExpiryDates(true)
            .build()
    }

    @Test
    fun pathParams() {
        val params = InstrumentGetInstrumentByIdParams.builder().instrumentId("x").build()

        assertThat(params._pathParam(0)).isEqualTo("x")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            InstrumentGetInstrumentByIdParams.builder()
                .instrumentId("x")
                .includeOptionsExpiryDates(true)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("include_options_expiry_dates", "true").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = InstrumentGetInstrumentByIdParams.builder().instrumentId("x").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
