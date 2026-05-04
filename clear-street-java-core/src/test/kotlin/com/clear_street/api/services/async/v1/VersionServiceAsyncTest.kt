// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.v1

import com.clear_street.api.client.okhttp.ClearStreetOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class VersionServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun getVersion() {
        val client = ClearStreetOkHttpClientAsync.builder().apiKey("My API Key").build()
        val versionServiceAsync = client.v1().version()

        val responseFuture = versionServiceAsync.getVersion()

        val response = responseFuture.get()
        response.validate()
    }
}
