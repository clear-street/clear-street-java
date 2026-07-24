// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.instrumentdata.marketdata

import com.clearstreet.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MarketDataGetSnapshotsParamsTest {

    @Test
    fun create() {
        MarketDataGetSnapshotsParams.builder().addInstrumentId("x").build()
    }

    @Test
    fun queryParams() {
        val params = MarketDataGetSnapshotsParams.builder().addInstrumentId("x").build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder().put("instrument_ids", listOf("x").joinToString(",")).build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = MarketDataGetSnapshotsParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
