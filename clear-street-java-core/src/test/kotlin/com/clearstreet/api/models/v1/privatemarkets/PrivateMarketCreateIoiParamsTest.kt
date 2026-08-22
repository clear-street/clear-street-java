// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.privatemarkets

import com.clearstreet.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PrivateMarketCreateIoiParamsTest {

    @Test
    fun create() {
        PrivateMarketCreateIoiParams.builder()
            .accountId(0L)
            .notionalAmount("100000.00")
            .offeringId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .ndaAcceptance(
                PrivateMarketCreateIoiParams.NdaAcceptance.builder()
                    .accepted(true)
                    .agreementId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .authorityConfirmed(true)
                    .build()
            )
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            PrivateMarketCreateIoiParams.builder()
                .accountId(0L)
                .notionalAmount("100000.00")
                .offeringId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .ndaAcceptance(
                    PrivateMarketCreateIoiParams.NdaAcceptance.builder()
                        .accepted(true)
                        .agreementId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .authorityConfirmed(true)
                        .build()
                )
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("account_id", "0").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            PrivateMarketCreateIoiParams.builder()
                .accountId(0L)
                .notionalAmount("100000.00")
                .offeringId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("account_id", "0").build())
    }

    @Test
    fun body() {
        val params =
            PrivateMarketCreateIoiParams.builder()
                .accountId(0L)
                .notionalAmount("100000.00")
                .offeringId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .ndaAcceptance(
                    PrivateMarketCreateIoiParams.NdaAcceptance.builder()
                        .accepted(true)
                        .agreementId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .authorityConfirmed(true)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.notionalAmount()).isEqualTo("100000.00")
        assertThat(body.offeringId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.ndaAcceptance())
            .contains(
                PrivateMarketCreateIoiParams.NdaAcceptance.builder()
                    .accepted(true)
                    .agreementId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .authorityConfirmed(true)
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            PrivateMarketCreateIoiParams.builder()
                .accountId(0L)
                .notionalAmount("100000.00")
                .offeringId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val body = params._body()

        assertThat(body.notionalAmount()).isEqualTo("100000.00")
        assertThat(body.offeringId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }
}
