// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.instruments

import com.clear_street.api.core.jsonMapper
import com.clear_street.api.models.active.v1.SecurityIdSource
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InstrumentSecurityIdTest {

    @Test
    fun create() {
        val instrumentSecurityId =
            InstrumentSecurityId.builder()
                .securityId("AAPL")
                .securityIdSource(SecurityIdSource.CMS)
                .build()

        assertThat(instrumentSecurityId.securityId()).isEqualTo("AAPL")
        assertThat(instrumentSecurityId.securityIdSource()).isEqualTo(SecurityIdSource.CMS)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val instrumentSecurityId =
            InstrumentSecurityId.builder()
                .securityId("AAPL")
                .securityIdSource(SecurityIdSource.CMS)
                .build()

        val roundtrippedInstrumentSecurityId =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(instrumentSecurityId),
                jacksonTypeRef<InstrumentSecurityId>(),
            )

        assertThat(roundtrippedInstrumentSecurityId).isEqualTo(instrumentSecurityId)
    }
}
