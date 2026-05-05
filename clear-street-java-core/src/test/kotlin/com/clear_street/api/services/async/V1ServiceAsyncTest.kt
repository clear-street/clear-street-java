// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async

import com.clear_street.api.client.okhttp.ClearStreetOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class V1ServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun websocketHandler() {
        val client = ClearStreetOkHttpClientAsync.builder().apiKey("My API Key").build()
        val v1ServiceAsync = client.v1()

        val future = v1ServiceAsync.websocketHandler()

        val response = future.get()
    }
}
