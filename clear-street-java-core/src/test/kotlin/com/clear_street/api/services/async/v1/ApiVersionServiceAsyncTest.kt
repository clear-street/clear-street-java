// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.v1

import com.clear_street.api.client.okhttp.ClearStreetOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ApiVersionServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun getVersion() {
        val client = ClearStreetOkHttpClientAsync.builder().apiKey("My API Key").build()
        val apiVersionServiceAsync = client.v1().apiVersion()

        val responseFuture = apiVersionServiceAsync.getVersion()

        val response = responseFuture.get()
        response.validate()
    }
}
