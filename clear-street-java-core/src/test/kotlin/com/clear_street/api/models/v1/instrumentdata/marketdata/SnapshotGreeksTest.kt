// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.instrumentdata.marketdata

import com.clear_street.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SnapshotGreeksTest {

    @Test
    fun create() {
        val snapshotGreeks =
            SnapshotGreeks.builder()
                .delta("delta")
                .gamma("gamma")
                .iv("iv")
                .rho("rho")
                .theoPrice("theo_price")
                .theta("theta")
                .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .vega("vega")
                .build()

        assertThat(snapshotGreeks.delta()).isEqualTo("delta")
        assertThat(snapshotGreeks.gamma()).isEqualTo("gamma")
        assertThat(snapshotGreeks.iv()).isEqualTo("iv")
        assertThat(snapshotGreeks.rho()).isEqualTo("rho")
        assertThat(snapshotGreeks.theoPrice()).isEqualTo("theo_price")
        assertThat(snapshotGreeks.theta()).isEqualTo("theta")
        assertThat(snapshotGreeks.timestamp())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(snapshotGreeks.vega()).isEqualTo("vega")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val snapshotGreeks =
            SnapshotGreeks.builder()
                .delta("delta")
                .gamma("gamma")
                .iv("iv")
                .rho("rho")
                .theoPrice("theo_price")
                .theta("theta")
                .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .vega("vega")
                .build()

        val roundtrippedSnapshotGreeks =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(snapshotGreeks),
                jacksonTypeRef<SnapshotGreeks>(),
            )

        assertThat(roundtrippedSnapshotGreeks).isEqualTo(snapshotGreeks)
    }
}
