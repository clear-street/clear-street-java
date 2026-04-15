// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.active.v1.instruments

import com.clear_street.api.client.okhttp.ClearStreetOkHttpClient
import com.clear_street.api.models.active.v1.SecurityIdSource
import com.clear_street.api.models.active.v1.instruments.events.AllEventsEventType
import com.clear_street.api.models.active.v1.instruments.events.EventGetAllInstrumentEventsParams
import com.clear_street.api.models.active.v1.instruments.events.EventGetInstrumentEventsParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class EventServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun getAllInstrumentEvents() {
        val client = ClearStreetOkHttpClient.builder().apiKey("My API Key").build()
        val eventService = client.active().v1().instruments().events()

        val response =
            eventService.getAllInstrumentEvents(
                EventGetAllInstrumentEventsParams.builder()
                    .addEventType(AllEventsEventType.EARNINGS)
                    .fromDate("from_date")
                    .addInstrumentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addSecurityId("string")
                    .addSecurityIdSource("string")
                    .toDate("to_date")
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getInstrumentEvents() {
        val client = ClearStreetOkHttpClient.builder().apiKey("My API Key").build()
        val eventService = client.active().v1().instruments().events()

        val response =
            eventService.getInstrumentEvents(
                EventGetInstrumentEventsParams.builder()
                    .securityIdSource(SecurityIdSource.CMS)
                    .securityId("security_id")
                    .fromDate("from_date")
                    .toDate("to_date")
                    .build()
            )

        response.validate()
    }
}
