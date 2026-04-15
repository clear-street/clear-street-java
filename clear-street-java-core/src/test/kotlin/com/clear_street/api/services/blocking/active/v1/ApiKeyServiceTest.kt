// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.active.v1

import com.clear_street.api.client.okhttp.ClearStreetOkHttpClient
import com.clear_street.api.models.active.v1.apikeys.ApiKeyCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ApiKeyServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = ClearStreetOkHttpClient.builder().apiKey("My API Key").build()
        val apiKeyService = client.active().v1().apiKeys()

        val apiKey = apiKeyService.create(ApiKeyCreateParams.builder().name("name").build())

        apiKey.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = ClearStreetOkHttpClient.builder().apiKey("My API Key").build()
        val apiKeyService = client.active().v1().apiKeys()

        val apiKeys = apiKeyService.list()

        apiKeys.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun revoke() {
        val client = ClearStreetOkHttpClient.builder().apiKey("My API Key").build()
        val apiKeyService = client.active().v1().apiKeys()

        val response = apiKeyService.revoke("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun revokeAll() {
        val client = ClearStreetOkHttpClient.builder().apiKey("My API Key").build()
        val apiKeyService = client.active().v1().apiKeys()

        val response = apiKeyService.revokeAll()

        response.validate()
    }
}
