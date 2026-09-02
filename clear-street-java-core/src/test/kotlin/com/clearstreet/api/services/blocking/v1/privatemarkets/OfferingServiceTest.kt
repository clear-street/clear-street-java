// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.services.blocking.v1.privatemarkets

import com.clearstreet.api.TestServerExtension
import com.clearstreet.api.client.okhttp.ClearStreetOkHttpClient
import com.clearstreet.api.models.v1.privatemarkets.offerings.OfferingGetOfferingByIdParams
import com.clearstreet.api.models.v1.privatemarkets.offerings.OfferingGetOfferingsParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class OfferingServiceTest {

    @Test
    fun getOfferingById() {
        val client =
            ClearStreetOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val offeringService = client.v1().privateMarkets().offerings()

        val response =
            offeringService.getOfferingById(
                OfferingGetOfferingByIdParams.builder()
                    .offeringId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .accountId(0L)
                    .build()
            )

        response.validate()
    }

    @Test
    fun getOfferings() {
        val client =
            ClearStreetOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val offeringService = client.v1().privateMarkets().offerings()

        val response =
            offeringService.getOfferings(OfferingGetOfferingsParams.builder().accountId(0L).build())

        response.validate()
    }
}
