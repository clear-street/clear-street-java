// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.services.async.v1.privatemarkets

import com.clearstreet.api.TestServerExtension
import com.clearstreet.api.client.okhttp.ClearStreetOkHttpClientAsync
import com.clearstreet.api.models.v1.privatemarkets.iois.IoisCreateIoiParams
import com.clearstreet.api.models.v1.privatemarkets.iois.IoisDeleteIoiParams
import com.clearstreet.api.models.v1.privatemarkets.iois.IoisGetIoisParams
import com.clearstreet.api.models.v1.privatemarkets.iois.IoisUpdateIoiParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class IoisServiceAsyncTest {

    @Test
    fun createIoi() {
        val client =
            ClearStreetOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val ioisServiceAsync = client.v1().privateMarkets().iois()

        val responseFuture =
            ioisServiceAsync.createIoi(
                IoisCreateIoiParams.builder()
                    .accountId(0L)
                    .notionalAmount("100000.00")
                    .offeringId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .ndaAcceptance(
                        IoisCreateIoiParams.NdaAcceptance.builder()
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
        val ioisServiceAsync = client.v1().privateMarkets().iois()

        val future =
            ioisServiceAsync.deleteIoi(
                IoisDeleteIoiParams.builder()
                    .ioiId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .accountId(0L)
                    .build()
            )

        val response = future.get()
    }

    @Test
    fun getIois() {
        val client =
            ClearStreetOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val ioisServiceAsync = client.v1().privateMarkets().iois()

        val responseFuture =
            ioisServiceAsync.getIois(IoisGetIoisParams.builder().accountId(0L).build())

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
        val ioisServiceAsync = client.v1().privateMarkets().iois()

        val responseFuture =
            ioisServiceAsync.updateIoi(
                IoisUpdateIoiParams.builder()
                    .ioiId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .accountId(0L)
                    .notionalAmount("125000.00")
                    .ndaAcceptance(
                        IoisUpdateIoiParams.NdaAcceptance.builder()
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
