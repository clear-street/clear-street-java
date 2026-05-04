// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.v1.marketdata

import com.clear_street.api.client.okhttp.ClearStreetOkHttpClient
import com.clear_street.api.models.v1.marketdata.snapshot.SnapshotGetSnapshotsParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class SnapshotServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun getSnapshots() {
        val client = ClearStreetOkHttpClient.builder().apiKey("My API Key").build()
        val snapshotService = client.v1().marketData().snapshot()

        val response =
            snapshotService.getSnapshots(
                SnapshotGetSnapshotsParams.builder()
                    .addInstrumentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        response.validate()
    }
}
