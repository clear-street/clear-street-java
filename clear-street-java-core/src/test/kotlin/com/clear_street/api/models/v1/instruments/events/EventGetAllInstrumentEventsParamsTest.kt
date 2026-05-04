// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.instruments.events

import com.clear_street.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EventGetAllInstrumentEventsParamsTest {

    @Test
    fun create() {
        EventGetAllInstrumentEventsParams.builder()
            .addEventType(AllEventsEventType.EARNINGS)
            .fromDate("from_date")
            .addInstrumentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .toDate("to_date")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            EventGetAllInstrumentEventsParams.builder()
                .addEventType(AllEventsEventType.EARNINGS)
                .fromDate("from_date")
                .addInstrumentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .toDate("to_date")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("event_types[0]", "EARNINGS")
                    .put("from_date", "from_date")
                    .put("instrument_ids[0]", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .put("to_date", "to_date")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = EventGetAllInstrumentEventsParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
