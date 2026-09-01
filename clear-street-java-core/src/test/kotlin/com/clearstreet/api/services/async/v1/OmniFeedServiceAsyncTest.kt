// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.services.async.v1

import com.clearstreet.api.TestServerExtension
import com.clearstreet.api.client.okhttp.ClearStreetOkHttpClientAsync
import com.clearstreet.api.models.v1.omnifeed.OmniFeedGetFeedParams
import com.clearstreet.api.models.v1.omnifeed.OmniFeedPostFeedEventParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class OmniFeedServiceAsyncTest {

    @Test
    fun getFeed() {
        val client =
            ClearStreetOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val omniFeedServiceAsync = client.v1().omniFeed()

        val responseFuture =
            omniFeedServiceAsync.getFeed(
                OmniFeedGetFeedParams.builder()
                    .accountId(0L)
                    .cursor("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .limit(0L)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun postFeedEvent() {
        val client =
            ClearStreetOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val omniFeedServiceAsync = client.v1().omniFeed()

        val future =
            omniFeedServiceAsync.postFeedEvent(
                OmniFeedPostFeedEventParams.builder()
                    .event(
                        OmniFeedPostFeedEventParams.Event.builder()
                            .itemId("0198f3a2-4b3d-7c1e-9f2a-3b4c5d6e7f80")
                            .type(OmniFeedPostFeedEventParams.Event.Type.SEEN)
                            .build()
                    )
                    .build()
            )

        val response = future.get()
    }
}
