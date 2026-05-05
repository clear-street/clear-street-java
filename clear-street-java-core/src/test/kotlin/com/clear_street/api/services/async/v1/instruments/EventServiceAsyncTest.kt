// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.v1.instruments

import com.clear_street.api.client.okhttp.ClearStreetOkHttpClientAsync
import com.clear_street.api.models.v1.instruments.events.AllEventsEventType
import com.clear_street.api.models.v1.instruments.events.EventGetAllInstrumentEventsParams
import com.clear_street.api.models.v1.instruments.events.EventGetInstrumentEventsParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class EventServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun getAllInstrumentEvents() {
        val client = ClearStreetOkHttpClientAsync.builder().apiKey("My API Key").build()
        val eventServiceAsync = client.v1().instruments().events()

        val responseFuture =
            eventServiceAsync.getAllInstrumentEvents(
                EventGetAllInstrumentEventsParams.builder()
                    .addEventType(AllEventsEventType.EARNINGS)
                    .fromDate("from_date")
                    .addInstrumentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .toDate("to_date")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getInstrumentEvents() {
        val client = ClearStreetOkHttpClientAsync.builder().apiKey("My API Key").build()
        val eventServiceAsync = client.v1().instruments().events()

        val responseFuture =
            eventServiceAsync.getInstrumentEvents(
                EventGetInstrumentEventsParams.builder()
                    .instrumentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .fromDate("from_date")
                    .toDate("to_date")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
