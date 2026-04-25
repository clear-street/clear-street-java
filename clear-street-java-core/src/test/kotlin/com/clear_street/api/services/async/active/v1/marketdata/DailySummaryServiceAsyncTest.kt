// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.active.v1.marketdata

import com.clear_street.api.client.okhttp.ClearStreetOkHttpClientAsync
import com.clear_street.api.models.active.v1.marketdata.dailysummary.DailySummaryGetDailySummariesParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class DailySummaryServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun getDailySummaries() {
        val client = ClearStreetOkHttpClientAsync.builder().apiKey("My API Key").build()
        val dailySummaryServiceAsync = client.active().v1().marketData().dailySummary()

        val responseFuture =
            dailySummaryServiceAsync.getDailySummaries(
                DailySummaryGetDailySummariesParams.builder()
                    .instrumentIds("instrument_ids")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
