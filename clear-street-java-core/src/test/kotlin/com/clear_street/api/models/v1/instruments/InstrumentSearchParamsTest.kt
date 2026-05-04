// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.instruments

import com.clear_street.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InstrumentSearchParamsTest {

    @Test
    fun create() {
        InstrumentSearchParams.builder()
            .q("q")
            .assetClass("asset_class")
            .country("country")
            .currency("currency")
            .cursor("cursor")
            .includeInactive(true)
            .includeRestricted(true)
            .limit(0L)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            InstrumentSearchParams.builder()
                .q("q")
                .assetClass("asset_class")
                .country("country")
                .currency("currency")
                .cursor("cursor")
                .includeInactive(true)
                .includeRestricted(true)
                .limit(0L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("q", "q")
                    .put("asset_class", "asset_class")
                    .put("country", "country")
                    .put("currency", "currency")
                    .put("cursor", "cursor")
                    .put("include_inactive", "true")
                    .put("include_restricted", "true")
                    .put("limit", "0")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = InstrumentSearchParams.builder().q("q").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("q", "q").build())
    }
}
