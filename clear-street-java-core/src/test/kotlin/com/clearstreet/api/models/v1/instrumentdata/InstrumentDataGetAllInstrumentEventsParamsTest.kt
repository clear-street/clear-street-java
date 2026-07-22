// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.instrumentdata

import com.clearstreet.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InstrumentDataGetAllInstrumentEventsParamsTest {

    @Test
    fun create() {
        InstrumentDataGetAllInstrumentEventsParams.builder()
            .addEventType(AllEventsEventType.EARNINGS)
            .fromDate("from_date")
            .addInstrumentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .toDate("to_date")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            InstrumentDataGetAllInstrumentEventsParams.builder()
                .addEventType(AllEventsEventType.EARNINGS)
                .fromDate("from_date")
                .addInstrumentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .toDate("to_date")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("event_types", listOf("EARNINGS").joinToString(","))
                    .put("from_date", "from_date")
                    .put(
                        "instrument_ids",
                        listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").joinToString(","),
                    )
                    .put("to_date", "to_date")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = InstrumentDataGetAllInstrumentEventsParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
