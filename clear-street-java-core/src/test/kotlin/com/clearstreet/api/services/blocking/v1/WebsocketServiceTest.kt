// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.services.blocking.v1

import com.clearstreet.api.client.okhttp.ClearStreetOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class WebsocketServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun websocketHandler() {
        val client = ClearStreetOkHttpClient.builder().apiKey("My API Key").build()
        val websocketService = client.v1().websocket()

        websocketService.websocketHandler()
    }
}
