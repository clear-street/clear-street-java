// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.instrumentdata.marketdata

import com.clearstreet.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SnapshotQuoteTest {

    @Test
    fun create() {
        val snapshotQuote =
            SnapshotQuote.builder()
                .ask("ask")
                .askSize(0)
                .askTimestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .askVenue("ask_venue")
                .bid("bid")
                .bidSize(0)
                .bidTimestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .bidVenue("bid_venue")
                .midpoint("midpoint")
                .build()

        assertThat(snapshotQuote.ask()).contains("ask")
        assertThat(snapshotQuote.askSize()).contains(0)
        assertThat(snapshotQuote.askTimestamp())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(snapshotQuote.askVenue()).contains("ask_venue")
        assertThat(snapshotQuote.bid()).contains("bid")
        assertThat(snapshotQuote.bidSize()).contains(0)
        assertThat(snapshotQuote.bidTimestamp())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(snapshotQuote.bidVenue()).contains("bid_venue")
        assertThat(snapshotQuote.midpoint()).contains("midpoint")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val snapshotQuote =
            SnapshotQuote.builder()
                .ask("ask")
                .askSize(0)
                .askTimestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .askVenue("ask_venue")
                .bid("bid")
                .bidSize(0)
                .bidTimestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .bidVenue("bid_venue")
                .midpoint("midpoint")
                .build()

        val roundtrippedSnapshotQuote =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(snapshotQuote),
                jacksonTypeRef<SnapshotQuote>(),
            )

        assertThat(roundtrippedSnapshotQuote).isEqualTo(snapshotQuote)
    }
}
