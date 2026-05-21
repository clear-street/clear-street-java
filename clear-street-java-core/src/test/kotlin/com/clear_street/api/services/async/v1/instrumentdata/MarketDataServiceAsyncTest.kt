// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.v1.instrumentdata

import com.clear_street.api.client.okhttp.ClearStreetOkHttpClientAsync
import com.clear_street.api.models.v1.instrumentdata.marketdata.MarketDataGetDailySummariesParams
import com.clear_street.api.models.v1.instrumentdata.marketdata.MarketDataGetSnapshotsParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class MarketDataServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun getDailySummaries() {
        val client = ClearStreetOkHttpClientAsync.builder().apiKey("My API Key").build()
        val marketDataServiceAsync = client.v1().instrumentData().marketData()

        val responseFuture =
            marketDataServiceAsync.getDailySummaries(
                MarketDataGetDailySummariesParams.builder().instrumentIds("instrument_ids").build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getSnapshots() {
        val client = ClearStreetOkHttpClientAsync.builder().apiKey("My API Key").build()
        val marketDataServiceAsync = client.v1().instrumentData().marketData()

        val responseFuture =
            marketDataServiceAsync.getSnapshots(
                MarketDataGetSnapshotsParams.builder()
                    .addInstrumentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
