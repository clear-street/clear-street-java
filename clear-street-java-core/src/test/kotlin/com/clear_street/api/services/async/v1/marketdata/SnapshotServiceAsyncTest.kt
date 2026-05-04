// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.v1.marketdata

import com.clear_street.api.client.okhttp.ClearStreetOkHttpClientAsync
import com.clear_street.api.models.v1.marketdata.snapshot.SnapshotGetSnapshotsParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class SnapshotServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun getSnapshots() {
        val client = ClearStreetOkHttpClientAsync.builder().apiKey("My API Key").build()
        val snapshotServiceAsync = client.v1().marketData().snapshot()

        val responseFuture =
            snapshotServiceAsync.getSnapshots(
                SnapshotGetSnapshotsParams.builder()
                    .addInstrumentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
