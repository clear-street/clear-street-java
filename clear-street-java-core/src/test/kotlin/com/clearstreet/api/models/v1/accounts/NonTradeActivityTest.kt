// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.accounts

import com.clearstreet.api.core.jsonMapper
import com.clearstreet.api.models.v1.SecurityType
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NonTradeActivityTest {

    @Test
    fun create() {
        val nonTradeActivity =
            NonTradeActivity.builder()
                .id("01a08544-f495-77f4-9718-5a470a0d7b56")
                .accountId("122503")
                .activitySubtype("ach_transfer")
                .activityType(ActivityType.MONEY_MOVEMENT)
                .amount("42")
                .createdAt(OffsetDateTime.parse("2026-09-09T14:30:00.000000000Z"))
                .currency("USD")
                .effectiveDate(LocalDate.parse("2026-09-09"))
                .instrumentType(SecurityType.COMMON_STOCK)
                .memo("FUNDS WIRED IN")
                .qty("100")
                .state(ActivityState.SETTLED)
                .cancelledReferenceId("01M22XQP8S93CZ19F1HNPXHBE7")
                .instrumentId("f47ac10b-58cc-4372-a567-0e02b2c3d479")
                .referenceId("01M22XQP8S93CZ19F1HNPXHBE7")
                .symbol("AAPL")
                .build()

        assertThat(nonTradeActivity.id()).isEqualTo("01a08544-f495-77f4-9718-5a470a0d7b56")
        assertThat(nonTradeActivity.accountId()).isEqualTo("122503")
        assertThat(nonTradeActivity.activitySubtype()).isEqualTo("ach_transfer")
        assertThat(nonTradeActivity.activityType()).isEqualTo(ActivityType.MONEY_MOVEMENT)
        assertThat(nonTradeActivity.amount()).isEqualTo("42")
        assertThat(nonTradeActivity.createdAt())
            .isEqualTo(OffsetDateTime.parse("2026-09-09T14:30:00.000000000Z"))
        assertThat(nonTradeActivity.currency()).isEqualTo("USD")
        assertThat(nonTradeActivity.effectiveDate()).isEqualTo(LocalDate.parse("2026-09-09"))
        assertThat(nonTradeActivity.instrumentType()).isEqualTo(SecurityType.COMMON_STOCK)
        assertThat(nonTradeActivity.memo()).isEqualTo("FUNDS WIRED IN")
        assertThat(nonTradeActivity.qty()).isEqualTo("100")
        assertThat(nonTradeActivity.state()).isEqualTo(ActivityState.SETTLED)
        assertThat(nonTradeActivity.cancelledReferenceId()).contains("01M22XQP8S93CZ19F1HNPXHBE7")
        assertThat(nonTradeActivity.instrumentId()).contains("f47ac10b-58cc-4372-a567-0e02b2c3d479")
        assertThat(nonTradeActivity.referenceId()).contains("01M22XQP8S93CZ19F1HNPXHBE7")
        assertThat(nonTradeActivity.symbol()).contains("AAPL")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val nonTradeActivity =
            NonTradeActivity.builder()
                .id("01a08544-f495-77f4-9718-5a470a0d7b56")
                .accountId("122503")
                .activitySubtype("ach_transfer")
                .activityType(ActivityType.MONEY_MOVEMENT)
                .amount("42")
                .createdAt(OffsetDateTime.parse("2026-09-09T14:30:00.000000000Z"))
                .currency("USD")
                .effectiveDate(LocalDate.parse("2026-09-09"))
                .instrumentType(SecurityType.COMMON_STOCK)
                .memo("FUNDS WIRED IN")
                .qty("100")
                .state(ActivityState.SETTLED)
                .cancelledReferenceId("01M22XQP8S93CZ19F1HNPXHBE7")
                .instrumentId("f47ac10b-58cc-4372-a567-0e02b2c3d479")
                .referenceId("01M22XQP8S93CZ19F1HNPXHBE7")
                .symbol("AAPL")
                .build()

        val roundtrippedNonTradeActivity =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(nonTradeActivity),
                jacksonTypeRef<NonTradeActivity>(),
            )

        assertThat(roundtrippedNonTradeActivity).isEqualTo(nonTradeActivity)
    }
}
