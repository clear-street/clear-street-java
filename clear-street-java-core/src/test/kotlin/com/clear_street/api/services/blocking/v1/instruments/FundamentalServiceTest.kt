// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.v1.instruments

import com.clear_street.api.client.okhttp.ClearStreetOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class FundamentalServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun getInstrumentFundamentals() {
        val client = ClearStreetOkHttpClient.builder().apiKey("My API Key").build()
        val fundamentalService = client.v1().instruments().fundamentals()

        val response =
            fundamentalService.getInstrumentFundamentals("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        response.validate()
    }
}
