// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.v1

import com.clear_street.api.client.okhttp.ClearStreetOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ClockServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun getClock() {
        val client = ClearStreetOkHttpClient.builder().apiKey("My API Key").build()
        val clockService = client.v1().clock()

        val response = clockService.getClock()

        response.validate()
    }
}
