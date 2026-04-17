// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.active.v1.iris

import com.clear_street.api.client.okhttp.ClearStreetOkHttpClient
import com.clear_street.api.models.active.v1.iris.threads.ThreadGetThreadDeprecatedParams
import com.clear_street.api.models.active.v1.iris.threads.ThreadListThreadsDeprecatedParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ThreadServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun getThreadDeprecated() {
        val client = ClearStreetOkHttpClient.builder().apiKey("My API Key").build()
        val threadService = client.active().v1().iris().threads()

        val response =
            threadService.getThreadDeprecated(
                ThreadGetThreadDeprecatedParams.builder()
                    .threadId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .accountId("account_id")
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listThreadsDeprecated() {
        val client = ClearStreetOkHttpClient.builder().apiKey("My API Key").build()
        val threadService = client.active().v1().iris().threads()

        val response =
            threadService.listThreadsDeprecated(
                ThreadListThreadsDeprecatedParams.builder()
                    .accountId("account_id")
                    .pageSize(0)
                    .pageToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        response.validate()
    }
}
