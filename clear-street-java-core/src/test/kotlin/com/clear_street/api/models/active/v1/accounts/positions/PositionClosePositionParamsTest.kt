// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.accounts.positions

import com.clear_street.api.models.active.v1.SecurityIdSource
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PositionClosePositionParamsTest {

    @Test
    fun create() {
        PositionClosePositionParams.builder()
            .accountId(0L)
            .securityIdSource(SecurityIdSource.CMS)
            .securityId("security_id")
            .cancelOrders(false)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            PositionClosePositionParams.builder()
                .accountId(0L)
                .securityIdSource(SecurityIdSource.CMS)
                .securityId("security_id")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("0")
        assertThat(params._pathParam(1)).isEqualTo("CMS")
        assertThat(params._pathParam(2)).isEqualTo("security_id")
        // out-of-bound path param
        assertThat(params._pathParam(3)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            PositionClosePositionParams.builder()
                .accountId(0L)
                .securityIdSource(SecurityIdSource.CMS)
                .securityId("security_id")
                .cancelOrders(false)
                .build()

        val body = params._body()

        assertThat(body.cancelOrders()).contains(false)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            PositionClosePositionParams.builder()
                .accountId(0L)
                .securityIdSource(SecurityIdSource.CMS)
                .securityId("security_id")
                .build()

        val body = params._body()
    }
}
