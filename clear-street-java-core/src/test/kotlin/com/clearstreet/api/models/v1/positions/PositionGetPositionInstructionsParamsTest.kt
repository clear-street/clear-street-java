// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.positions

import com.clearstreet.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PositionGetPositionInstructionsParamsTest {

    @Test
    fun create() {
        PositionGetPositionInstructionsParams.builder().accountId(0L).instrumentId("x").build()
    }

    @Test
    fun pathParams() {
        val params = PositionGetPositionInstructionsParams.builder().accountId(0L).build()

        assertThat(params._pathParam(0)).isEqualTo("0")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            PositionGetPositionInstructionsParams.builder().accountId(0L).instrumentId("x").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("instrument_id", "x").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = PositionGetPositionInstructionsParams.builder().accountId(0L).build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
