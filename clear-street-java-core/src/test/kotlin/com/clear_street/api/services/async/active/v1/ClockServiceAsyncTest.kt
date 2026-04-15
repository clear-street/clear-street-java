// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.active.v1

import com.clear_street.api.client.okhttp.ClearStreetOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ClockServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun getClock() {
        val client = ClearStreetOkHttpClientAsync.builder().apiKey("My API Key").build()
        val clockServiceAsync = client.active().v1().clock()

        val responseFuture = clockServiceAsync.getClock()

        val response = responseFuture.get()
        response.validate()
    }
}
