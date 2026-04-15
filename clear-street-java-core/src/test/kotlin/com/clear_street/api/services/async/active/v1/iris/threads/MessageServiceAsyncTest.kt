// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.active.v1.iris.threads

import com.clear_street.api.client.okhttp.ClearStreetOkHttpClientAsync
import com.clear_street.api.models.active.v1.iris.threads.messages.MessageListMessagesDeprecatedParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class MessageServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun listMessagesDeprecated() {
        val client = ClearStreetOkHttpClientAsync.builder().apiKey("My API Key").build()
        val messageServiceAsync = client.active().v1().iris().threads().messages()

        val responseFuture =
            messageServiceAsync.listMessagesDeprecated(
                MessageListMessagesDeprecatedParams.builder()
                    .threadId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .accountId("account_id")
                    .afterSeq(0L)
                    .pageSize(0)
                    .pageToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
