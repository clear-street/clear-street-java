// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.active.v1.instruments

import com.clear_street.api.client.okhttp.ClearStreetOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class FundamentalServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun getInstrumentFundamentals() {
        val client = ClearStreetOkHttpClientAsync.builder().apiKey("My API Key").build()
        val fundamentalServiceAsync = client.active().v1().instruments().fundamentals()

        val responseFuture =
            fundamentalServiceAsync.getInstrumentFundamentals(
                "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"
            )

        val response = responseFuture.get()
        response.validate()
    }
}
