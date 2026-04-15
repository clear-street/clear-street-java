// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.calendars.markethours

import com.clear_street.api.core.JsonValue
import com.clear_street.api.core.jsonMapper
import com.clear_street.api.models.ApiError
import com.clear_street.api.models.ResponseMetadata
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MarketHourGetMarketHoursCalendarResponseTest {

    @Test
    fun create() {
        val marketHourGetMarketHoursCalendarResponse =
            MarketHourGetMarketHoursCalendarResponse.builder()
                .metadata(
                    ResponseMetadata.builder()
                        .requestId("request_id")
                        .nextPageToken("U3RhaW5sZXNzIHJvY2tz")
                        .pageNumber(0)
                        .previousPageToken("U3RhaW5sZXNzIHJvY2tz")
                        .totalItems(0L)
                        .totalPages(0)
                        .build()
                )
                .error(
                    ApiError.builder()
                        .code(400)
                        .message("Order quantity must be greater than zero")
                        .addDetail(
                            ApiError.Detail.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .build()
                )
                .addData(
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
                )
                .build()

        assertThat(marketHourGetMarketHoursCalendarResponse.metadata())
            .isEqualTo(
                ResponseMetadata.builder()
                    .requestId("request_id")
                    .nextPageToken("U3RhaW5sZXNzIHJvY2tz")
                    .pageNumber(0)
                    .previousPageToken("U3RhaW5sZXNzIHJvY2tz")
                    .totalItems(0L)
                    .totalPages(0)
                    .build()
            )
        assertThat(marketHourGetMarketHoursCalendarResponse.error())
            .contains(
                ApiError.builder()
                    .code(400)
                    .message("Order quantity must be greater than zero")
                    .addDetail(
                        ApiError.Detail.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .build()
            )
        assertThat(marketHourGetMarketHoursCalendarResponse.data())
            .containsExactly(
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
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val marketHourGetMarketHoursCalendarResponse =
            MarketHourGetMarketHoursCalendarResponse.builder()
                .metadata(
                    ResponseMetadata.builder()
                        .requestId("request_id")
                        .nextPageToken("U3RhaW5sZXNzIHJvY2tz")
                        .pageNumber(0)
                        .previousPageToken("U3RhaW5sZXNzIHJvY2tz")
                        .totalItems(0L)
                        .totalPages(0)
                        .build()
                )
                .error(
                    ApiError.builder()
                        .code(400)
                        .message("Order quantity must be greater than zero")
                        .addDetail(
                            ApiError.Detail.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .build()
                )
                .addData(
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
                )
                .build()

        val roundtrippedMarketHourGetMarketHoursCalendarResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(marketHourGetMarketHoursCalendarResponse),
                jacksonTypeRef<MarketHourGetMarketHoursCalendarResponse>(),
            )

        assertThat(roundtrippedMarketHourGetMarketHoursCalendarResponse)
            .isEqualTo(marketHourGetMarketHoursCalendarResponse)
    }
}
