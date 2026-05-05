// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.instruments

import com.clear_street.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InstrumentSearchInstrumentsParamsTest {

    @Test
    fun create() {
        InstrumentSearchInstrumentsParams.builder()
            .q("q")
            .assetClass("asset_class")
            .country("country")
            .currency("currency")
            .includeInactive(true)
            .includeRestricted(true)
            .pageSize(1L)
            .pageToken("U3RhaW5sZXNzIHJvY2tz")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            InstrumentSearchInstrumentsParams.builder()
                .q("q")
                .assetClass("asset_class")
                .country("country")
                .currency("currency")
                .includeInactive(true)
                .includeRestricted(true)
                .pageSize(1L)
                .pageToken("U3RhaW5sZXNzIHJvY2tz")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("q", "q")
                    .put("asset_class", "asset_class")
                    .put("country", "country")
                    .put("currency", "currency")
                    .put("include_inactive", "true")
                    .put("include_restricted", "true")
                    .put("page_size", "1")
                    .put("page_token", "U3RhaW5sZXNzIHJvY2tz")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = InstrumentSearchInstrumentsParams.builder().q("q").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("q", "q").build())
    }
}
