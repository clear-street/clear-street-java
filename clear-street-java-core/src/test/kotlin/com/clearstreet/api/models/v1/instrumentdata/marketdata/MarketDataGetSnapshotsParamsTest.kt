// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.instrumentdata.marketdata

import com.clearstreet.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MarketDataGetSnapshotsParamsTest {

    @Test
    fun create() {
        MarketDataGetSnapshotsParams.builder()
            .addInstrumentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            MarketDataGetSnapshotsParams.builder()
                .addInstrumentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put(
                        "instrument_ids",
                        listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").joinToString(","),
                    )
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
