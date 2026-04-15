// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.instruments

import com.clear_street.api.core.http.QueryParams
import com.clear_street.api.models.active.v1.SecurityIdSource
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InstrumentGetInstrumentByIdParamsTest {

    @Test
    fun create() {
        InstrumentGetInstrumentByIdParams.builder()
            .securityIdSource(SecurityIdSource.CMS)
            .securityId("security_id")
            .includeOptionsExpiryDates(true)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            InstrumentGetInstrumentByIdParams.builder()
                .securityIdSource(SecurityIdSource.CMS)
                .securityId("security_id")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("CMS")
        assertThat(params._pathParam(1)).isEqualTo("security_id")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            InstrumentGetInstrumentByIdParams.builder()
                .securityIdSource(SecurityIdSource.CMS)
                .securityId("security_id")
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
                .securityIdSource(SecurityIdSource.CMS)
                .securityId("security_id")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
