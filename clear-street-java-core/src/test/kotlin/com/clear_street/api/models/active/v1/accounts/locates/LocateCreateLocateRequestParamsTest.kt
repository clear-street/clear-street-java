// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.accounts.locates

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LocateCreateLocateRequestParamsTest {

    @Test
    fun create() {
        LocateCreateLocateRequestParams.builder()
            .accountId(0L)
            .addBody(
                LocateCreateLocateRequestParams.Body.builder()
                    .quantity(500L)
                    .symbol("AAPL")
                    .comments("Locate for earnings play")
                    .referenceId("my-locate-batch-001")
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            LocateCreateLocateRequestParams.builder()
                .accountId(0L)
                .addBody(
                    LocateCreateLocateRequestParams.Body.builder()
                        .quantity(500L)
                        .symbol("AAPL")
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("0")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            LocateCreateLocateRequestParams.builder()
                .accountId(0L)
                .addBody(
                    LocateCreateLocateRequestParams.Body.builder()
                        .quantity(500L)
                        .symbol("AAPL")
                        .comments("Locate for earnings play")
                        .referenceId("my-locate-batch-001")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .containsExactly(
                LocateCreateLocateRequestParams.Body.builder()
                    .quantity(500L)
                    .symbol("AAPL")
                    .comments("Locate for earnings play")
                    .referenceId("my-locate-batch-001")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            LocateCreateLocateRequestParams.builder()
                .accountId(0L)
                .addBody(
                    LocateCreateLocateRequestParams.Body.builder()
                        .quantity(500L)
                        .symbol("AAPL")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .containsExactly(
                LocateCreateLocateRequestParams.Body.builder().quantity(500L).symbol("AAPL").build()
            )
    }
}
