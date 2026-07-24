// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.services.blocking.v1.instrumentdata

import com.clearstreet.api.TestServerExtension
import com.clearstreet.api.client.okhttp.ClearStreetOkHttpClient
import com.clearstreet.api.models.v1.instrumentdata.marketdata.MarketDataGetDailySummariesParams
import com.clearstreet.api.models.v1.instrumentdata.marketdata.MarketDataGetSnapshotsParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class MarketDataServiceTest {

    @Test
    fun getDailySummaries() {
        val client =
            ClearStreetOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val marketDataService = client.v1().instrumentData().marketData()

        val response =
            marketDataService.getDailySummaries(
                MarketDataGetDailySummariesParams.builder().instrumentIds("instrument_ids").build()
            )

        response.validate()
    }

    @Test
    fun getSnapshots() {
        val client =
            ClearStreetOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val marketDataService = client.v1().instrumentData().marketData()

        val response =
            marketDataService.getSnapshots(
                MarketDataGetSnapshotsParams.builder().addInstrumentId("x").build()
            )

        response.validate()
    }
}
