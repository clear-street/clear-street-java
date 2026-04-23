// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.calendars.mergersacquisitions

import com.clear_street.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MergersAcquisitionsEventTest {

    @Test
    fun create() {
        val mergersAcquisitionsEvent =
            MergersAcquisitionsEvent.builder()
                .acquirerSymbol("AMZN")
                .targetSymbol("ZM")
                .transactionDate(LocalDate.parse("2025-07-15"))
                .acceptedAt(OffsetDateTime.parse("2025-10-31T00:00:00.000000000Z"))
                .acquirerCik("0001018724")
                .acquirerName("Amazon.com, Inc.")
                .link(
                    "https://www.sec.gov/Archives/edgar/data/849399/000114036125002752/ny20039778x6_s4.htm"
                )
                .targetCik("0001585521")
                .build()

        assertThat(mergersAcquisitionsEvent.acquirerSymbol()).isEqualTo("AMZN")
        assertThat(mergersAcquisitionsEvent.targetSymbol()).isEqualTo("ZM")
        assertThat(mergersAcquisitionsEvent.transactionDate())
            .isEqualTo(LocalDate.parse("2025-07-15"))
        assertThat(mergersAcquisitionsEvent.acceptedAt())
            .contains(OffsetDateTime.parse("2025-10-31T00:00:00.000000000Z"))
        assertThat(mergersAcquisitionsEvent.acquirerCik()).contains("0001018724")
        assertThat(mergersAcquisitionsEvent.acquirerName()).contains("Amazon.com, Inc.")
        assertThat(mergersAcquisitionsEvent.link())
            .contains(
                "https://www.sec.gov/Archives/edgar/data/849399/000114036125002752/ny20039778x6_s4.htm"
            )
        assertThat(mergersAcquisitionsEvent.targetCik()).contains("0001585521")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val mergersAcquisitionsEvent =
            MergersAcquisitionsEvent.builder()
                .acquirerSymbol("AMZN")
                .targetSymbol("ZM")
                .transactionDate(LocalDate.parse("2025-07-15"))
                .acceptedAt(OffsetDateTime.parse("2025-10-31T00:00:00.000000000Z"))
                .acquirerCik("0001018724")
                .acquirerName("Amazon.com, Inc.")
                .link(
                    "https://www.sec.gov/Archives/edgar/data/849399/000114036125002752/ny20039778x6_s4.htm"
                )
                .targetCik("0001585521")
                .build()

        val roundtrippedMergersAcquisitionsEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(mergersAcquisitionsEvent),
                jacksonTypeRef<MergersAcquisitionsEvent>(),
            )

        assertThat(roundtrippedMergersAcquisitionsEvent).isEqualTo(mergersAcquisitionsEvent)
    }
}
