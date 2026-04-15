// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.watchlists.items

import com.clear_street.api.models.active.v1.SecurityIdSource
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ItemAddWatchlistItemParamsTest {

    @Test
    fun create() {
        ItemAddWatchlistItemParams.builder()
            .watchlistId("550e8400-e29b-41d4-a716-446655440000")
            .instrumentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .securityId("security_id")
            .securityIdSource(SecurityIdSource.CMS)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ItemAddWatchlistItemParams.builder()
                .watchlistId("550e8400-e29b-41d4-a716-446655440000")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("550e8400-e29b-41d4-a716-446655440000")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ItemAddWatchlistItemParams.builder()
                .watchlistId("550e8400-e29b-41d4-a716-446655440000")
                .instrumentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .securityId("security_id")
                .securityIdSource(SecurityIdSource.CMS)
                .build()

        val body = params._body()

        assertThat(body.instrumentId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.securityId()).contains("security_id")
        assertThat(body.securityIdSource()).contains(SecurityIdSource.CMS)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ItemAddWatchlistItemParams.builder()
                .watchlistId("550e8400-e29b-41d4-a716-446655440000")
                .build()

        val body = params._body()
    }
}
