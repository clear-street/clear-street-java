// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.active.v1

import com.clear_street.api.client.okhttp.ClearStreetOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class WServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun websocketHandler() {
        val client = ClearStreetOkHttpClientAsync.builder().apiKey("My API Key").build()
        val wServiceAsync = client.active().v1().ws()

        val future = wServiceAsync.websocketHandler()

        val response = future.get()
    }
}
