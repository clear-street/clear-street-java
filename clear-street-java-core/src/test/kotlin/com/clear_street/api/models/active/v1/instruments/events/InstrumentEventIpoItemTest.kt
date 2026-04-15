// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.instruments.events

import com.clear_street.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InstrumentEventIpoItemTest {

    @Test
    fun create() {
        val instrumentEventIpoItem =
            InstrumentEventIpoItem.builder()
                .actions("actions")
                .announcedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .company("company")
                .exchange("exchange")
                .marketCap("market_cap")
                .priceRange("price_range")
                .shares("shares")
                .build()

        assertThat(instrumentEventIpoItem.actions()).contains("actions")
        assertThat(instrumentEventIpoItem.announcedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(instrumentEventIpoItem.company()).contains("company")
        assertThat(instrumentEventIpoItem.exchange()).contains("exchange")
        assertThat(instrumentEventIpoItem.marketCap()).contains("market_cap")
        assertThat(instrumentEventIpoItem.priceRange()).contains("price_range")
        assertThat(instrumentEventIpoItem.shares()).contains("shares")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val instrumentEventIpoItem =
            InstrumentEventIpoItem.builder()
                .actions("actions")
                .announcedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .company("company")
                .exchange("exchange")
                .marketCap("market_cap")
                .priceRange("price_range")
                .shares("shares")
                .build()

        val roundtrippedInstrumentEventIpoItem =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(instrumentEventIpoItem),
                jacksonTypeRef<InstrumentEventIpoItem>(),
            )

        assertThat(roundtrippedInstrumentEventIpoItem).isEqualTo(instrumentEventIpoItem)
    }
}
