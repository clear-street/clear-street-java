// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.active.v1

import com.clear_street.api.client.okhttp.ClearStreetOkHttpClientAsync
import com.clear_street.api.models.active.v1.apikeys.ApiKeyCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ApiKeyServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = ClearStreetOkHttpClientAsync.builder().apiKey("My API Key").build()
        val apiKeyServiceAsync = client.active().v1().apiKeys()

        val apiKeyFuture =
            apiKeyServiceAsync.create(ApiKeyCreateParams.builder().name("name").build())

        val apiKey = apiKeyFuture.get()
        apiKey.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = ClearStreetOkHttpClientAsync.builder().apiKey("My API Key").build()
        val apiKeyServiceAsync = client.active().v1().apiKeys()

        val apiKeysFuture = apiKeyServiceAsync.list()

        val apiKeys = apiKeysFuture.get()
        apiKeys.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun revoke() {
        val client = ClearStreetOkHttpClientAsync.builder().apiKey("My API Key").build()
        val apiKeyServiceAsync = client.active().v1().apiKeys()

        val responseFuture = apiKeyServiceAsync.revoke("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun revokeAll() {
        val client = ClearStreetOkHttpClientAsync.builder().apiKey("My API Key").build()
        val apiKeyServiceAsync = client.active().v1().apiKeys()

        val responseFuture = apiKeyServiceAsync.revokeAll()

        val response = responseFuture.get()
        response.validate()
    }
}
