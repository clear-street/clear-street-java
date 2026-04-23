// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.active.v1.instruments

import com.clear_street.api.client.okhttp.ClearStreetOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class VenueServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun getVenues() {
        val client = ClearStreetOkHttpClientAsync.builder().apiKey("My API Key").build()
        val venueServiceAsync = client.active().v1().instruments().venues()

        val responseFuture = venueServiceAsync.getVenues()

        val response = responseFuture.get()
        response.validate()
    }
}
