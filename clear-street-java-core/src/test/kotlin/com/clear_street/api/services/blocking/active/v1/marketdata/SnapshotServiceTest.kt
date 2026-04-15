// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.active.v1.marketdata

import com.clear_street.api.client.okhttp.ClearStreetOkHttpClient
import com.clear_street.api.models.active.v1.marketdata.snapshot.SnapshotGetSnapshotsParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class SnapshotServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun getSnapshots() {
        val client = ClearStreetOkHttpClient.builder().apiKey("My API Key").build()
        val snapshotService = client.active().v1().marketData().snapshot()

        val response =
            snapshotService.getSnapshots(
                SnapshotGetSnapshotsParams.builder()
                    .ids("ids")
                    .addSecurityId("string")
                    .addSecurityIdSource("string")
                    .build()
            )

        response.validate()
    }
}
