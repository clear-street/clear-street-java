// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.active.v1

import com.clear_street.api.client.okhttp.ClearStreetOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class WServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun websocketHandler() {
        val client = ClearStreetOkHttpClient.builder().apiKey("My API Key").build()
        val wService = client.active().v1().ws()

        wService.websocketHandler()
    }
}
