// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.services.blocking.v1

import com.clearstreet.api.TestServerExtension
import com.clearstreet.api.client.okhttp.ClearStreetOkHttpClient
import com.clearstreet.api.models.v1.privatemarkets.PrivateMarketCreateIoiParams
import com.clearstreet.api.models.v1.privatemarkets.PrivateMarketDeleteIoiParams
import com.clearstreet.api.models.v1.privatemarkets.PrivateMarketGetCompanyByIdParams
import com.clearstreet.api.models.v1.privatemarkets.PrivateMarketGetIoisParams
import com.clearstreet.api.models.v1.privatemarkets.PrivateMarketGetSpvByIdParams
import com.clearstreet.api.models.v1.privatemarkets.PrivateMarketUpdateIoiParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PrivateMarketServiceTest {

    @Test
    fun createIoi() {
        val client =
            ClearStreetOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val privateMarketService = client.v1().privateMarkets()

        val response =
            privateMarketService.createIoi(
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

        response.validate()
    }

    @Test
    fun deleteIoi() {
        val client =
            ClearStreetOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val privateMarketService = client.v1().privateMarkets()

        privateMarketService.deleteIoi(
            PrivateMarketDeleteIoiParams.builder()
                .ioiId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .accountId(0L)
                .build()
        )
    }

    @Test
    fun getCompanyById() {
        val client =
            ClearStreetOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val privateMarketService = client.v1().privateMarkets()

        val response =
            privateMarketService.getCompanyById(
                PrivateMarketGetCompanyByIdParams.builder()
                    .companyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .accountId(0L)
                    .build()
            )

        response.validate()
    }

    @Test
    fun getIois() {
        val client =
            ClearStreetOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val privateMarketService = client.v1().privateMarkets()

        val response =
            privateMarketService.getIois(PrivateMarketGetIoisParams.builder().accountId(0L).build())

        response.validate()
    }

    @Test
    fun getSpvById() {
        val client =
            ClearStreetOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val privateMarketService = client.v1().privateMarkets()

        val response =
            privateMarketService.getSpvById(
                PrivateMarketGetSpvByIdParams.builder()
                    .spvId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .accountId(0L)
                    .build()
            )

        response.validate()
    }

    @Test
    fun updateIoi() {
        val client =
            ClearStreetOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val privateMarketService = client.v1().privateMarkets()

        val response =
            privateMarketService.updateIoi(
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

        response.validate()
    }
}
