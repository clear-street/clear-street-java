// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.locates

import com.clearstreet.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LocateRateTest {

    @Test
    fun create() {
        val locateRate =
            LocateRate.builder()
                .instrumentId("528ec5c3-cdbf-447c-b995-ec6c83cfbc02")
                .rate("0.037012")
                .asOf(OffsetDateTime.parse("2026-09-10T14:33:07.107683Z"))
                .build()

        assertThat(locateRate.instrumentId()).isEqualTo("528ec5c3-cdbf-447c-b995-ec6c83cfbc02")
        assertThat(locateRate.rate()).isEqualTo("0.037012")
        assertThat(locateRate.asOf()).contains(OffsetDateTime.parse("2026-09-10T14:33:07.107683Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val locateRate =
            LocateRate.builder()
                .instrumentId("528ec5c3-cdbf-447c-b995-ec6c83cfbc02")
                .rate("0.037012")
                .asOf(OffsetDateTime.parse("2026-09-10T14:33:07.107683Z"))
                .build()

        val roundtrippedLocateRate =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(locateRate),
                jacksonTypeRef<LocateRate>(),
            )

        assertThat(roundtrippedLocateRate).isEqualTo(locateRate)
    }
}
