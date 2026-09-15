// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.instrumentdata.marketdata

import com.clearstreet.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SnapshotSessionTest {

    @Test
    fun create() {
        val snapshotSession =
            SnapshotSession.builder()
                .ohlvApplicable(true)
                .change("change")
                .changePercent("change_percent")
                .cumulativeVolume(0L)
                .high("high")
                .low("low")
                .ohlvDate(LocalDate.parse("2019-12-27"))
                .open("open")
                .previousClose("previous_close")
                .previousCloseUnadjusted("previous_close_unadjusted")
                .build()

        assertThat(snapshotSession.ohlvApplicable()).isEqualTo(true)
        assertThat(snapshotSession.change()).contains("change")
        assertThat(snapshotSession.changePercent()).contains("change_percent")
        assertThat(snapshotSession.cumulativeVolume()).contains(0L)
        assertThat(snapshotSession.high()).contains("high")
        assertThat(snapshotSession.low()).contains("low")
        assertThat(snapshotSession.ohlvDate()).contains(LocalDate.parse("2019-12-27"))
        assertThat(snapshotSession.open()).contains("open")
        assertThat(snapshotSession.previousClose()).contains("previous_close")
        assertThat(snapshotSession.previousCloseUnadjusted()).contains("previous_close_unadjusted")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val snapshotSession =
            SnapshotSession.builder()
                .ohlvApplicable(true)
                .change("change")
                .changePercent("change_percent")
                .cumulativeVolume(0L)
                .high("high")
                .low("low")
                .ohlvDate(LocalDate.parse("2019-12-27"))
                .open("open")
                .previousClose("previous_close")
                .previousCloseUnadjusted("previous_close_unadjusted")
                .build()

        val roundtrippedSnapshotSession =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(snapshotSession),
                jacksonTypeRef<SnapshotSession>(),
            )

        assertThat(roundtrippedSnapshotSession).isEqualTo(snapshotSession)
    }
}
