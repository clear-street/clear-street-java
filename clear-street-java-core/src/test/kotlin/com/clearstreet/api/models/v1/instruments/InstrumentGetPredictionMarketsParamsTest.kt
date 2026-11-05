// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.instruments

import com.clearstreet.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InstrumentGetPredictionMarketsParamsTest {

    @Test
    fun create() {
        InstrumentGetPredictionMarketsParams.builder()
            .eventCode("event_code")
            .marketIds("market_ids")
            .pageSize(1L)
            .pageToken("U3RhaW5sZXNzIHJvY2tz")
            .statuses("statuses")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            InstrumentGetPredictionMarketsParams.builder()
                .eventCode("event_code")
                .marketIds("market_ids")
                .pageSize(1L)
                .pageToken("U3RhaW5sZXNzIHJvY2tz")
                .statuses("statuses")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("event_code", "event_code")
                    .put("market_ids", "market_ids")
                    .put("page_size", "1")
                    .put("page_token", "U3RhaW5sZXNzIHJvY2tz")
                    .put("statuses", "statuses")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = InstrumentGetPredictionMarketsParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
