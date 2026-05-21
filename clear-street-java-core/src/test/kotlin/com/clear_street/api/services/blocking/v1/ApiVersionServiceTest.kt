// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.v1

import com.clear_street.api.client.okhttp.ClearStreetOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ApiVersionServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun getVersion() {
        val client = ClearStreetOkHttpClient.builder().apiKey("My API Key").build()
        val apiVersionService = client.v1().apiVersion()

        val response = apiVersionService.getVersion()

        response.validate()
    }
}
