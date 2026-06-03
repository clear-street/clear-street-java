// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.services.async.v1

import com.clearstreet.api.client.okhttp.ClearStreetOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class WebsocketServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun websocketHandler() {
        val client = ClearStreetOkHttpClientAsync.builder().apiKey("My API Key").build()
        val websocketServiceAsync = client.v1().websocket()

        val future = websocketServiceAsync.websocketHandler()

        val response = future.get()
    }
}
