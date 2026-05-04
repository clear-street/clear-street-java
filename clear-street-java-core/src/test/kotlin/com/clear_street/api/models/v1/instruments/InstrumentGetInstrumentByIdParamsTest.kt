// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.instruments

import com.clear_street.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InstrumentGetInstrumentByIdParamsTest {

    @Test
    fun create() {
        InstrumentGetInstrumentByIdParams.builder()
            .instrumentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .includeOptionsExpiryDates(true)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            InstrumentGetInstrumentByIdParams.builder()
                .instrumentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            InstrumentGetInstrumentByIdParams.builder()
                .instrumentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .includeOptionsExpiryDates(true)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("include_options_expiry_dates", "true").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            InstrumentGetInstrumentByIdParams.builder()
                .instrumentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
