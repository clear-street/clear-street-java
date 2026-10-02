// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.instrumentdata.marketdata

import com.clearstreet.api.core.http.QueryParams
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MarketDataGetSnapshotsParamsTest {

    @Test
    fun create() {
        MarketDataGetSnapshotsParams.builder()
            .expiry(LocalDate.parse("2019-12-27"))
            .addInstrumentId("x")
            .underlyingInstrumentId("x")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            MarketDataGetSnapshotsParams.builder()
                .expiry(LocalDate.parse("2019-12-27"))
                .addInstrumentId("x")
                .underlyingInstrumentId("x")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("expiry", "2019-12-27")
                    .put("instrument_ids", listOf("x").joinToString(","))
                    .put("underlying_instrument_id", "x")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = MarketDataGetSnapshotsParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
