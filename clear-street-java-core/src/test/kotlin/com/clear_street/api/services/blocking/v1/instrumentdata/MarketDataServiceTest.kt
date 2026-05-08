// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.v1.instrumentdata

import com.clear_street.api.client.okhttp.ClearStreetOkHttpClient
import com.clear_street.api.models.v1.instrumentdata.marketdata.MarketDataGetDailySummariesParams
import com.clear_street.api.models.v1.instrumentdata.marketdata.MarketDataGetSnapshotsParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class MarketDataServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun getDailySummaries() {
        val client = ClearStreetOkHttpClient.builder().apiKey("My API Key").build()
        val marketDataService = client.v1().instrumentData().marketData()

        val response =
            marketDataService.getDailySummaries(
                MarketDataGetDailySummariesParams.builder().instrumentIds("instrument_ids").build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getSnapshots() {
        val client = ClearStreetOkHttpClient.builder().apiKey("My API Key").build()
        val marketDataService = client.v1().instrumentData().marketData()

        val response =
            marketDataService.getSnapshots(
                MarketDataGetSnapshotsParams.builder()
                    .addInstrumentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        response.validate()
    }
}
