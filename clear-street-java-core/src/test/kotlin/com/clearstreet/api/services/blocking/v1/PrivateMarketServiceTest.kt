// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.services.blocking.v1

import com.clearstreet.api.TestServerExtension
import com.clearstreet.api.client.okhttp.ClearStreetOkHttpClient
import com.clearstreet.api.models.v1.privatemarkets.PrivateMarketGetCompanyByIdParams
import com.clearstreet.api.models.v1.privatemarkets.PrivateMarketGetSpvByIdParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PrivateMarketServiceTest {

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
}
