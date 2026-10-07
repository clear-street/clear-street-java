// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.services.async.v1

import com.clearstreet.api.TestServerExtension
import com.clearstreet.api.client.okhttp.ClearStreetOkHttpClientAsync
import com.clearstreet.api.models.v1.locates.LocateGetLocateRatesParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class LocateServiceAsyncTest {

    @Test
    fun getLocateRateById() {
        val client =
            ClearStreetOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val locateServiceAsync = client.v1().locates()

        val responseFuture = locateServiceAsync.getLocateRateById("x")

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun getLocateRates() {
        val client =
            ClearStreetOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val locateServiceAsync = client.v1().locates()

        val responseFuture =
            locateServiceAsync.getLocateRates(
                LocateGetLocateRatesParams.builder().addInstrumentId("x").build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
