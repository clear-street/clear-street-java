// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.instrumentdata.marketdata

import com.clear_street.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SnapshotSessionTest {

    @Test
    fun create() {
        val snapshotSession =
            SnapshotSession.builder()
                .change("change")
                .changePercent("change_percent")
                .previousClose("previous_close")
                .build()

        assertThat(snapshotSession.change()).isEqualTo("change")
        assertThat(snapshotSession.changePercent()).isEqualTo("change_percent")
        assertThat(snapshotSession.previousClose()).isEqualTo("previous_close")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val snapshotSession =
            SnapshotSession.builder()
                .change("change")
                .changePercent("change_percent")
                .previousClose("previous_close")
                .build()

        val roundtrippedSnapshotSession =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(snapshotSession),
                jacksonTypeRef<SnapshotSession>(),
            )

        assertThat(roundtrippedSnapshotSession).isEqualTo(snapshotSession)
    }
}
