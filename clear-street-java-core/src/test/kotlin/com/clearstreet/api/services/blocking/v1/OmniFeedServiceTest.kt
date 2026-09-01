// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.services.blocking.v1

import com.clearstreet.api.TestServerExtension
import com.clearstreet.api.client.okhttp.ClearStreetOkHttpClient
import com.clearstreet.api.models.v1.omnifeed.OmniFeedGetFeedParams
import com.clearstreet.api.models.v1.omnifeed.OmniFeedPostFeedEventParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class OmniFeedServiceTest {

    @Test
    fun getFeed() {
        val client =
            ClearStreetOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val omniFeedService = client.v1().omniFeed()

        val response =
            omniFeedService.getFeed(
                OmniFeedGetFeedParams.builder()
                    .accountId(0L)
                    .cursor("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .limit(0L)
                    .build()
            )

        response.validate()
    }

    @Test
    fun postFeedEvent() {
        val client =
            ClearStreetOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val omniFeedService = client.v1().omniFeed()

        omniFeedService.postFeedEvent(
            OmniFeedPostFeedEventParams.builder()
                .event(
                    OmniFeedPostFeedEventParams.Event.builder()
                        .itemId("0198f3a2-4b3d-7c1e-9f2a-3b4c5d6e7f80")
                        .type(OmniFeedPostFeedEventParams.Event.Type.SEEN)
                        .build()
                )
                .build()
        )
    }
}
