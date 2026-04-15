// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.marketdata.snapshot

import com.clear_street.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SnapshotGetSnapshotsParamsTest {

    @Test
    fun create() {
        SnapshotGetSnapshotsParams.builder()
            .ids("ids")
            .addSecurityId("string")
            .addSecurityIdSource("string")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            SnapshotGetSnapshotsParams.builder()
                .ids("ids")
                .addSecurityId("string")
                .addSecurityIdSource("string")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("ids", "ids")
                    .put("security_id[0]", "string")
                    .put("security_id_source[0]", "string")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = SnapshotGetSnapshotsParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
