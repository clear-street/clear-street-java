// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.active.v1.marketdata

import com.clear_street.api.client.okhttp.ClearStreetOkHttpClientAsync
import com.clear_street.api.models.active.v1.marketdata.snapshot.SnapshotGetSnapshotsParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class SnapshotServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun getSnapshots() {
        val client = ClearStreetOkHttpClientAsync.builder().apiKey("My API Key").build()
        val snapshotServiceAsync = client.active().v1().marketData().snapshot()

        val responseFuture =
            snapshotServiceAsync.getSnapshots(
                SnapshotGetSnapshotsParams.builder()
                    .ids("ids")
                    .addSecurityId("string")
                    .addSecurityIdSource("string")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
