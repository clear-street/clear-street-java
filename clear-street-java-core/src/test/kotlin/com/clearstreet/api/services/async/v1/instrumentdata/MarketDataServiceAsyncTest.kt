// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.services.async.v1.instrumentdata

import com.clearstreet.api.TestServerExtension
import com.clearstreet.api.client.okhttp.ClearStreetOkHttpClientAsync
import com.clearstreet.api.models.v1.instrumentdata.marketdata.MarketDataGetDailySummariesParams
import com.clearstreet.api.models.v1.instrumentdata.marketdata.MarketDataGetSnapshotsParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class MarketDataServiceAsyncTest {

    @Test
    fun getDailySummaries() {
        val client =
            ClearStreetOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val marketDataServiceAsync = client.v1().instrumentData().marketData()

        val responseFuture =
            marketDataServiceAsync.getDailySummaries(
                MarketDataGetDailySummariesParams.builder().instrumentIds("instrument_ids").build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun getSnapshots() {
        val client =
            ClearStreetOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
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
