// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.instrumentdata.marketdata

import com.clear_street.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MarketDataGetDailySummariesParamsTest {

    @Test
    fun create() {
        MarketDataGetDailySummariesParams.builder().instrumentIds("instrument_ids").build()
    }

    @Test
    fun queryParams() {
        val params =
            MarketDataGetDailySummariesParams.builder().instrumentIds("instrument_ids").build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("instrument_ids", "instrument_ids").build())
    }
}
