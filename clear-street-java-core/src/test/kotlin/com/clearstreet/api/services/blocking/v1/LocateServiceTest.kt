// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.services.blocking.v1

import com.clearstreet.api.TestServerExtension
import com.clearstreet.api.client.okhttp.ClearStreetOkHttpClient
import com.clearstreet.api.models.v1.locates.LocateGetLocateRatesParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class LocateServiceTest {

    @Test
    fun getLocateRateById() {
        val client =
            ClearStreetOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val locateService = client.v1().locates()

        val response = locateService.getLocateRateById("x")

        response.validate()
    }

    @Test
    fun getLocateRates() {
        val client =
            ClearStreetOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val locateService = client.v1().locates()

        val response =
            locateService.getLocateRates(
                LocateGetLocateRatesParams.builder().addInstrumentId("x").build()
            )

        response.validate()
    }
}
