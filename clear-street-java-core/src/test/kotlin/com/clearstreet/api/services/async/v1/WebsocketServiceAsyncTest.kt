// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.services.async.v1

import com.clearstreet.api.TestServerExtension
import com.clearstreet.api.client.okhttp.ClearStreetOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class WebsocketServiceAsyncTest {

    @Disabled("websocket upgrade endpoint is currently not modeled correctly for stainless")
    @Test
    fun websocketHandler() {
        val client =
            ClearStreetOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val websocketServiceAsync = client.v1().websocket()

        val future = websocketServiceAsync.websocketHandler()

        val response = future.get()
    }
}
