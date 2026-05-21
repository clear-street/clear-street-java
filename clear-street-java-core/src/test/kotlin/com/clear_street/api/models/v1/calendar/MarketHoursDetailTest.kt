// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.calendar

import com.clear_street.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MarketHoursDetailTest {

    @Test
    fun create() {
        val marketHoursDetail =
            MarketHoursDetail.builder()
                .currentTime(OffsetDateTime.parse("2025-10-15T14:30:00-04:00"))
                .date(LocalDate.parse("2025-10-15"))
                .market(MarketType.US_EQUITIES)
                .marketName("US Equities")
                .nextSessions(
                    TradingSessions.builder()
                        .afterHours(
                            SessionSchedule.builder()
                                .close(OffsetDateTime.parse("2025-10-16T20:00:00-04:00"))
                                .open(OffsetDateTime.parse("2025-10-16T16:00:00-04:00"))
                                .timeUntilClose("PT1H30M")
                                .timeUntilOpen(null)
                                .build()
                        )
                        .preMarket(
                            SessionSchedule.builder()
                                .close(OffsetDateTime.parse("2025-10-16T09:30:00-04:00"))
                                .open(OffsetDateTime.parse("2025-10-16T04:00:00-04:00"))
                                .timeUntilClose("PT1H30M")
                                .timeUntilOpen(null)
                                .build()
                        )
                        .regular(
                            SessionSchedule.builder()
                                .close(OffsetDateTime.parse("2025-10-16T16:00:00-04:00"))
                                .open(OffsetDateTime.parse("2025-10-16T09:30:00-04:00"))
                                .timeUntilClose("PT1H30M")
                                .timeUntilOpen(null)
                                .build()
                        )
                        .build()
                )
                .status(
                    MarketStatus.builder()
                        .dayType(DayType.TRADING_DAY)
                        .isOpen(true)
                        .currentSession(MarketSessionType.REGULAR)
                        .build()
                )
                .timezone("America/New_York")
                .todaySessions(
                    TradingSessions.builder()
                        .afterHours(
                            SessionSchedule.builder()
                                .close(OffsetDateTime.parse("2025-10-15T20:00:00-04:00"))
                                .open(OffsetDateTime.parse("2025-10-15T16:00:00-04:00"))
                                .timeUntilClose("PT1H30M")
                                .timeUntilOpen("PT1H30M")
                                .build()
                        )
                        .preMarket(
                            SessionSchedule.builder()
                                .close(OffsetDateTime.parse("2025-10-15T09:30:00-04:00"))
                                .open(OffsetDateTime.parse("2025-10-15T04:00:00-04:00"))
                                .timeUntilClose("PT1H30M")
                                .timeUntilOpen(null)
                                .build()
                        )
                        .regular(
                            SessionSchedule.builder()
                                .close(OffsetDateTime.parse("2025-10-15T16:00:00-04:00"))
                                .open(OffsetDateTime.parse("2025-10-15T09:30:00-04:00"))
                                .timeUntilClose("PT1H30M")
                                .timeUntilOpen(null)
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(marketHoursDetail.currentTime())
            .isEqualTo(OffsetDateTime.parse("2025-10-15T14:30:00-04:00"))
        assertThat(marketHoursDetail.date()).isEqualTo(LocalDate.parse("2025-10-15"))
        assertThat(marketHoursDetail.market()).isEqualTo(MarketType.US_EQUITIES)
        assertThat(marketHoursDetail.marketName()).isEqualTo("US Equities")
        assertThat(marketHoursDetail.nextSessions())
            .isEqualTo(
                TradingSessions.builder()
                    .afterHours(
                        SessionSchedule.builder()
                            .close(OffsetDateTime.parse("2025-10-16T20:00:00-04:00"))
                            .open(OffsetDateTime.parse("2025-10-16T16:00:00-04:00"))
                            .timeUntilClose("PT1H30M")
                            .timeUntilOpen(null)
                            .build()
                    )
                    .preMarket(
                        SessionSchedule.builder()
                            .close(OffsetDateTime.parse("2025-10-16T09:30:00-04:00"))
                            .open(OffsetDateTime.parse("2025-10-16T04:00:00-04:00"))
                            .timeUntilClose("PT1H30M")
                            .timeUntilOpen(null)
                            .build()
                    )
                    .regular(
                        SessionSchedule.builder()
                            .close(OffsetDateTime.parse("2025-10-16T16:00:00-04:00"))
                            .open(OffsetDateTime.parse("2025-10-16T09:30:00-04:00"))
                            .timeUntilClose("PT1H30M")
                            .timeUntilOpen(null)
                            .build()
                    )
                    .build()
            )
        assertThat(marketHoursDetail.status())
            .isEqualTo(
                MarketStatus.builder()
                    .dayType(DayType.TRADING_DAY)
                    .isOpen(true)
                    .currentSession(MarketSessionType.REGULAR)
                    .build()
            )
        assertThat(marketHoursDetail.timezone()).isEqualTo("America/New_York")
        assertThat(marketHoursDetail.todaySessions())
            .isEqualTo(
                TradingSessions.builder()
                    .afterHours(
                        SessionSchedule.builder()
                            .close(OffsetDateTime.parse("2025-10-15T20:00:00-04:00"))
                            .open(OffsetDateTime.parse("2025-10-15T16:00:00-04:00"))
                            .timeUntilClose("PT1H30M")
                            .timeUntilOpen("PT1H30M")
                            .build()
                    )
                    .preMarket(
                        SessionSchedule.builder()
                            .close(OffsetDateTime.parse("2025-10-15T09:30:00-04:00"))
                            .open(OffsetDateTime.parse("2025-10-15T04:00:00-04:00"))
                            .timeUntilClose("PT1H30M")
                            .timeUntilOpen(null)
                            .build()
                    )
                    .regular(
                        SessionSchedule.builder()
                            .close(OffsetDateTime.parse("2025-10-15T16:00:00-04:00"))
                            .open(OffsetDateTime.parse("2025-10-15T09:30:00-04:00"))
                            .timeUntilClose("PT1H30M")
                            .timeUntilOpen(null)
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val marketHoursDetail =
            MarketHoursDetail.builder()
                .currentTime(OffsetDateTime.parse("2025-10-15T14:30:00-04:00"))
                .date(LocalDate.parse("2025-10-15"))
                .market(MarketType.US_EQUITIES)
                .marketName("US Equities")
                .nextSessions(
                    TradingSessions.builder()
                        .afterHours(
                            SessionSchedule.builder()
                                .close(OffsetDateTime.parse("2025-10-16T20:00:00-04:00"))
                                .open(OffsetDateTime.parse("2025-10-16T16:00:00-04:00"))
                                .timeUntilClose("PT1H30M")
                                .timeUntilOpen(null)
                                .build()
                        )
                        .preMarket(
                            SessionSchedule.builder()
                                .close(OffsetDateTime.parse("2025-10-16T09:30:00-04:00"))
                                .open(OffsetDateTime.parse("2025-10-16T04:00:00-04:00"))
                                .timeUntilClose("PT1H30M")
                                .timeUntilOpen(null)
                                .build()
                        )
                        .regular(
                            SessionSchedule.builder()
                                .close(OffsetDateTime.parse("2025-10-16T16:00:00-04:00"))
                                .open(OffsetDateTime.parse("2025-10-16T09:30:00-04:00"))
                                .timeUntilClose("PT1H30M")
                                .timeUntilOpen(null)
                                .build()
                        )
                        .build()
                )
                .status(
                    MarketStatus.builder()
                        .dayType(DayType.TRADING_DAY)
                        .isOpen(true)
                        .currentSession(MarketSessionType.REGULAR)
                        .build()
                )
                .timezone("America/New_York")
                .todaySessions(
                    TradingSessions.builder()
                        .afterHours(
                            SessionSchedule.builder()
                                .close(OffsetDateTime.parse("2025-10-15T20:00:00-04:00"))
                                .open(OffsetDateTime.parse("2025-10-15T16:00:00-04:00"))
                                .timeUntilClose("PT1H30M")
                                .timeUntilOpen("PT1H30M")
                                .build()
                        )
                        .preMarket(
                            SessionSchedule.builder()
                                .close(OffsetDateTime.parse("2025-10-15T09:30:00-04:00"))
                                .open(OffsetDateTime.parse("2025-10-15T04:00:00-04:00"))
                                .timeUntilClose("PT1H30M")
                                .timeUntilOpen(null)
                                .build()
                        )
                        .regular(
                            SessionSchedule.builder()
                                .close(OffsetDateTime.parse("2025-10-15T16:00:00-04:00"))
                                .open(OffsetDateTime.parse("2025-10-15T09:30:00-04:00"))
                                .timeUntilClose("PT1H30M")
                                .timeUntilOpen(null)
                                .build()
                        )
                        .build()
                )
                .build()

        val roundtrippedMarketHoursDetail =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(marketHoursDetail),
                jacksonTypeRef<MarketHoursDetail>(),
            )

        assertThat(roundtrippedMarketHoursDetail).isEqualTo(marketHoursDetail)
    }
}
