// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.instruments.events

import com.clear_street.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EventGetInstrumentEventsParamsTest {

    @Test
    fun create() {
        EventGetInstrumentEventsParams.builder()
            .instrumentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .fromDate("from_date")
            .toDate("to_date")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            EventGetInstrumentEventsParams.builder()
                .instrumentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            EventGetInstrumentEventsParams.builder()
                .instrumentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .fromDate("from_date")
                .toDate("to_date")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("from_date", "from_date")
                    .put("to_date", "to_date")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            EventGetInstrumentEventsParams.builder()
                .instrumentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
