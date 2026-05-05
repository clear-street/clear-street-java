// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.watchlists

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WatchlistCreateWatchlistParamsTest {

    @Test
    fun create() {
        WatchlistCreateWatchlistParams.builder().name("name").build()
    }

    @Test
    fun body() {
        val params = WatchlistCreateWatchlistParams.builder().name("name").build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("name")
    }
}
