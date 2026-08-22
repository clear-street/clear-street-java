// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.services.async.v1

import com.clearstreet.api.TestServerExtension
import com.clearstreet.api.client.okhttp.ClearStreetOkHttpClientAsync
import com.clearstreet.api.models.v1.privatemarkets.PrivateMarketCreateIoiParams
import com.clearstreet.api.models.v1.privatemarkets.PrivateMarketDeleteIoiParams
import com.clearstreet.api.models.v1.privatemarkets.PrivateMarketGetCompanyByIdParams
import com.clearstreet.api.models.v1.privatemarkets.PrivateMarketGetIoisParams
import com.clearstreet.api.models.v1.privatemarkets.PrivateMarketGetSpvByIdParams
import com.clearstreet.api.models.v1.privatemarkets.PrivateMarketUpdateIoiParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PrivateMarketServiceAsyncTest {

    @Test
    fun createIoi() {
        val client =
            ClearStreetOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val privateMarketServiceAsync = client.v1().privateMarkets()

        val responseFuture =
            privateMarketServiceAsync.createIoi(
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
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun deleteIoi() {
        val client =
            ClearStreetOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val privateMarketServiceAsync = client.v1().privateMarkets()

        val future =
            privateMarketServiceAsync.deleteIoi(
                PrivateMarketDeleteIoiParams.builder()
                    .ioiId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .accountId(0L)
                    .build()
            )

        val response = future.get()
    }

    @Test
    fun getCompanyById() {
        val client =
            ClearStreetOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val privateMarketServiceAsync = client.v1().privateMarkets()

        val responseFuture =
            privateMarketServiceAsync.getCompanyById(
                PrivateMarketGetCompanyByIdParams.builder()
                    .companyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .accountId(0L)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun getIois() {
        val client =
            ClearStreetOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val privateMarketServiceAsync = client.v1().privateMarkets()

        val responseFuture =
            privateMarketServiceAsync.getIois(
                PrivateMarketGetIoisParams.builder().accountId(0L).build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun getSpvById() {
        val client =
            ClearStreetOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val privateMarketServiceAsync = client.v1().privateMarkets()

        val responseFuture =
            privateMarketServiceAsync.getSpvById(
                PrivateMarketGetSpvByIdParams.builder()
                    .spvId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .accountId(0L)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun updateIoi() {
        val client =
            ClearStreetOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val privateMarketServiceAsync = client.v1().privateMarkets()

        val responseFuture =
            privateMarketServiceAsync.updateIoi(
                PrivateMarketUpdateIoiParams.builder()
                    .ioiId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .accountId(0L)
                    .notionalAmount("125000.00")
                    .ndaAcceptance(
                        PrivateMarketUpdateIoiParams.NdaAcceptance.builder()
                            .accepted(true)
                            .agreementId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .authorityConfirmed(true)
                            .build()
                    )
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
