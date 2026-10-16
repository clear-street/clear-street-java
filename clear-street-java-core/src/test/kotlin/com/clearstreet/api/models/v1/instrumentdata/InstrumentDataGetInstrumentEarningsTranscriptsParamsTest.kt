// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.instrumentdata

import com.clearstreet.api.core.http.QueryParams
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InstrumentDataGetInstrumentEarningsTranscriptsParamsTest {

    @Test
    fun create() {
        InstrumentDataGetInstrumentEarningsTranscriptsParams.builder()
            .instrumentId("x")
            .date(
                InstrumentDataGetInstrumentEarningsTranscriptsParams.Date.builder()
                    .gt("gt")
                    .gte("gte")
                    .lt("lt")
                    .lte("lte")
                    .build()
            )
            .eventDate(LocalDate.parse("2019-12-27"))
            .pageSize(1L)
            .pageToken("U3RhaW5sZXNzIHJvY2tz")
            .period(InstrumentDataGetInstrumentEarningsTranscriptsParams.Period.Q1)
            .year(0)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            InstrumentDataGetInstrumentEarningsTranscriptsParams.builder().instrumentId("x").build()

        assertThat(params._pathParam(0)).isEqualTo("x")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            InstrumentDataGetInstrumentEarningsTranscriptsParams.builder()
                .instrumentId("x")
                .date(
                    InstrumentDataGetInstrumentEarningsTranscriptsParams.Date.builder()
                        .gt("gt")
                        .gte("gte")
                        .lt("lt")
                        .lte("lte")
                        .build()
                )
                .eventDate(LocalDate.parse("2019-12-27"))
                .pageSize(1L)
                .pageToken("U3RhaW5sZXNzIHJvY2tz")
                .period(InstrumentDataGetInstrumentEarningsTranscriptsParams.Period.Q1)
                .year(0)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("date[gt]", "gt")
                    .put("date[gte]", "gte")
                    .put("date[lt]", "lt")
                    .put("date[lte]", "lte")
                    .put("event_date", "2019-12-27")
                    .put("page_size", "1")
                    .put("page_token", "U3RhaW5sZXNzIHJvY2tz")
                    .put("period", "Q1")
                    .put("year", "0")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            InstrumentDataGetInstrumentEarningsTranscriptsParams.builder().instrumentId("x").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
