// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.active.v1.instruments

import com.clear_street.api.client.okhttp.ClearStreetOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class VenueServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun getVenues() {
        val client = ClearStreetOkHttpClient.builder().apiKey("My API Key").build()
        val venueService = client.active().v1().instruments().venues()

        val response = venueService.getVenues()

        response.validate()
    }
}
