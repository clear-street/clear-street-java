// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.active.v1.iris

import com.clear_street.api.client.okhttp.ClearStreetOkHttpClient
import com.clear_street.api.models.active.v1.iris.runs.RunCancelRunDeprecatedParams
import com.clear_street.api.models.active.v1.iris.runs.RunGetRunDeprecatedParams
import com.clear_street.api.models.active.v1.iris.runs.RunStartRunDeprecatedParams
import com.clear_street.api.models.active.v1.omniai.Capability
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class RunServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun cancelRunDeprecated() {
        val client = ClearStreetOkHttpClient.builder().apiKey("My API Key").build()
        val runService = client.active().v1().iris().runs()

        val response =
            runService.cancelRunDeprecated(
                RunCancelRunDeprecatedParams.builder()
                    .runId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .accountId("account_id")
                    .reason("reason")
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getRunDeprecated() {
        val client = ClearStreetOkHttpClient.builder().apiKey("My API Key").build()
        val runService = client.active().v1().iris().runs()

        val response =
            runService.getRunDeprecated(
                RunGetRunDeprecatedParams.builder()
                    .runId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .accountId("account_id")
                    .pageSize(0)
                    .pageToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun startRunDeprecated() {
        val client = ClearStreetOkHttpClient.builder().apiKey("My API Key").build()
        val runService = client.active().v1().iris().runs()

        val response =
            runService.startRunDeprecated(
                RunStartRunDeprecatedParams.builder()
                    .accountId("account_id")
                    .commandText("command_text")
                    .addCapability(Capability.NAVIGATE)
                    .threadId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .threadTitle("thread_title")
                    .build()
            )

        response.validate()
    }
}
