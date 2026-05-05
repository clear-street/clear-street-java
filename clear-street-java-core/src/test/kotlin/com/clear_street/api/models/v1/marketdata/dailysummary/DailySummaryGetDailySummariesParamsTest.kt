// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.marketdata.dailysummary

import com.clear_street.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DailySummaryGetDailySummariesParamsTest {

    @Test
    fun create() {
        DailySummaryGetDailySummariesParams.builder().instrumentIds("instrument_ids").build()
    }

    @Test
    fun queryParams() {
        val params =
            DailySummaryGetDailySummariesParams.builder().instrumentIds("instrument_ids").build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("instrument_ids", "instrument_ids").build())
    }
}
