// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.active.v1.omniai

import com.clear_street.api.client.okhttp.ClearStreetOkHttpClient
import com.clear_street.api.models.active.v1.omniai.Capability
import com.clear_street.api.models.active.v1.omniai.runs.RunCancelRunParams
import com.clear_street.api.models.active.v1.omniai.runs.RunGetRunParams
import com.clear_street.api.models.active.v1.omniai.runs.RunStartRunParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class RunServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun cancelRun() {
        val client = ClearStreetOkHttpClient.builder().apiKey("My API Key").build()
        val runService = client.active().v1().omniAi().runs()

        val response =
            runService.cancelRun(
                RunCancelRunParams.builder()
                    .runId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .accountId("account_id")
                    .reason("reason")
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getRun() {
        val client = ClearStreetOkHttpClient.builder().apiKey("My API Key").build()
        val runService = client.active().v1().omniAi().runs()

        val response =
            runService.getRun(
                RunGetRunParams.builder()
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
    fun startRun() {
        val client = ClearStreetOkHttpClient.builder().apiKey("My API Key").build()
        val runService = client.active().v1().omniAi().runs()

        val response =
            runService.startRun(
                RunStartRunParams.builder()
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
