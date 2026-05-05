// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.v1.marketdata

import com.clear_street.api.client.okhttp.ClearStreetOkHttpClient
import com.clear_street.api.models.v1.marketdata.dailysummary.DailySummaryGetDailySummariesParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class DailySummaryServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun getDailySummaries() {
        val client = ClearStreetOkHttpClient.builder().apiKey("My API Key").build()
        val dailySummaryService = client.v1().marketData().dailySummary()

        val response =
            dailySummaryService.getDailySummaries(
                DailySummaryGetDailySummariesParams.builder()
                    .instrumentIds("instrument_ids")
                    .build()
            )

        response.validate()
    }
}
