// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking

import com.clear_street.api.client.okhttp.ClearStreetOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class V1ServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun websocketHandler() {
        val client = ClearStreetOkHttpClient.builder().apiKey("My API Key").build()
        val v1Service = client.v1()

        v1Service.websocketHandler()
    }
}
