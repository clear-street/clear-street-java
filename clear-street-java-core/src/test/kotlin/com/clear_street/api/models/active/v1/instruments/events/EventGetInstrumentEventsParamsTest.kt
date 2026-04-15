// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.instruments.events

import com.clear_street.api.core.http.QueryParams
import com.clear_street.api.models.active.v1.SecurityIdSource
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EventGetInstrumentEventsParamsTest {

    @Test
    fun create() {
        EventGetInstrumentEventsParams.builder()
            .securityIdSource(SecurityIdSource.CMS)
            .securityId("security_id")
            .fromDate("from_date")
            .toDate("to_date")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            EventGetInstrumentEventsParams.builder()
                .securityIdSource(SecurityIdSource.CMS)
                .securityId("security_id")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("CMS")
        assertThat(params._pathParam(1)).isEqualTo("security_id")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            EventGetInstrumentEventsParams.builder()
                .securityIdSource(SecurityIdSource.CMS)
                .securityId("security_id")
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
                .securityIdSource(SecurityIdSource.CMS)
                .securityId("security_id")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
