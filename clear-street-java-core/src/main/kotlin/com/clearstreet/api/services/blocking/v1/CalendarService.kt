// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.services.blocking.v1

import com.clearstreet.api.core.ClientOptions
import com.clearstreet.api.core.RequestOptions
import com.clearstreet.api.core.http.HttpResponseFor
import com.clearstreet.api.models.v1.calendar.CalendarGetClockParams
import com.clearstreet.api.models.v1.calendar.CalendarGetClockResponse
import com.clearstreet.api.models.v1.calendar.CalendarGetEconomicEventsCalendarParams
import com.clearstreet.api.models.v1.calendar.CalendarGetEconomicEventsCalendarResponse
import com.clearstreet.api.models.v1.calendar.CalendarGetMarketHoursCalendarParams
import com.clearstreet.api.models.v1.calendar.CalendarGetMarketHoursCalendarResponse
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

/** Access clocks and financial calendars for market sessions and events. */
interface CalendarService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CalendarService

    /** Returns the current server time in UTC. */
    fun getClock(): CalendarGetClockResponse = getClock(CalendarGetClockParams.none())

    /** @see getClock */
    fun getClock(
        params: CalendarGetClockParams = CalendarGetClockParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CalendarGetClockResponse

    /** @see getClock */
    fun getClock(
        params: CalendarGetClockParams = CalendarGetClockParams.none()
    ): CalendarGetClockResponse = getClock(params, RequestOptions.none())

    /** @see getClock */
    fun getClock(requestOptions: RequestOptions): CalendarGetClockResponse =
        getClock(CalendarGetClockParams.none(), requestOptions)

    /**
     * Retrieves macroeconomic calendar events (e.g. CPI, jobs reports, central bank rate
     * decisions), optionally filtered by country, impact, and event time range.
     *
     * Absent a `timestamp` lower bound, results default to events from the start of the previous
     * trading day (America/New_York); absent an upper bound, results default through 7 days from
     * today (America/New_York).
     */
    fun getEconomicEventsCalendar(): CalendarGetEconomicEventsCalendarResponse =
        getEconomicEventsCalendar(CalendarGetEconomicEventsCalendarParams.none())

    /** @see getEconomicEventsCalendar */
    fun getEconomicEventsCalendar(
        params: CalendarGetEconomicEventsCalendarParams =
            CalendarGetEconomicEventsCalendarParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CalendarGetEconomicEventsCalendarResponse

    /** @see getEconomicEventsCalendar */
    fun getEconomicEventsCalendar(
        params: CalendarGetEconomicEventsCalendarParams =
            CalendarGetEconomicEventsCalendarParams.none()
    ): CalendarGetEconomicEventsCalendarResponse =
        getEconomicEventsCalendar(params, RequestOptions.none())

    /** @see getEconomicEventsCalendar */
    fun getEconomicEventsCalendar(
        requestOptions: RequestOptions
    ): CalendarGetEconomicEventsCalendarResponse =
        getEconomicEventsCalendar(CalendarGetEconomicEventsCalendarParams.none(), requestOptions)

    /**
     * Retrieves comprehensive trading hours including pre-market, regular, and after-hours
     * sessions. Returns market status, session times, and next session schedules.
     */
    fun getMarketHoursCalendar(): CalendarGetMarketHoursCalendarResponse =
        getMarketHoursCalendar(CalendarGetMarketHoursCalendarParams.none())

    /** @see getMarketHoursCalendar */
    fun getMarketHoursCalendar(
        params: CalendarGetMarketHoursCalendarParams = CalendarGetMarketHoursCalendarParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CalendarGetMarketHoursCalendarResponse

    /** @see getMarketHoursCalendar */
    fun getMarketHoursCalendar(
        params: CalendarGetMarketHoursCalendarParams = CalendarGetMarketHoursCalendarParams.none()
    ): CalendarGetMarketHoursCalendarResponse =
        getMarketHoursCalendar(params, RequestOptions.none())

    /** @see getMarketHoursCalendar */
    fun getMarketHoursCalendar(
        requestOptions: RequestOptions
    ): CalendarGetMarketHoursCalendarResponse =
        getMarketHoursCalendar(CalendarGetMarketHoursCalendarParams.none(), requestOptions)

    /** A view of [CalendarService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): CalendarService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/clock`, but is otherwise the same as
         * [CalendarService.getClock].
         */
        @MustBeClosed
        fun getClock(): HttpResponseFor<CalendarGetClockResponse> =
            getClock(CalendarGetClockParams.none())

        /** @see getClock */
        @MustBeClosed
        fun getClock(
            params: CalendarGetClockParams = CalendarGetClockParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CalendarGetClockResponse>

        /** @see getClock */
        @MustBeClosed
        fun getClock(
            params: CalendarGetClockParams = CalendarGetClockParams.none()
        ): HttpResponseFor<CalendarGetClockResponse> = getClock(params, RequestOptions.none())

        /** @see getClock */
        @MustBeClosed
        fun getClock(requestOptions: RequestOptions): HttpResponseFor<CalendarGetClockResponse> =
            getClock(CalendarGetClockParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/calendars/economic-events`, but is otherwise the
         * same as [CalendarService.getEconomicEventsCalendar].
         */
        @MustBeClosed
        fun getEconomicEventsCalendar():
            HttpResponseFor<CalendarGetEconomicEventsCalendarResponse> =
            getEconomicEventsCalendar(CalendarGetEconomicEventsCalendarParams.none())

        /** @see getEconomicEventsCalendar */
        @MustBeClosed
        fun getEconomicEventsCalendar(
            params: CalendarGetEconomicEventsCalendarParams =
                CalendarGetEconomicEventsCalendarParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CalendarGetEconomicEventsCalendarResponse>

        /** @see getEconomicEventsCalendar */
        @MustBeClosed
        fun getEconomicEventsCalendar(
            params: CalendarGetEconomicEventsCalendarParams =
                CalendarGetEconomicEventsCalendarParams.none()
        ): HttpResponseFor<CalendarGetEconomicEventsCalendarResponse> =
            getEconomicEventsCalendar(params, RequestOptions.none())

        /** @see getEconomicEventsCalendar */
        @MustBeClosed
        fun getEconomicEventsCalendar(
            requestOptions: RequestOptions
        ): HttpResponseFor<CalendarGetEconomicEventsCalendarResponse> =
            getEconomicEventsCalendar(
                CalendarGetEconomicEventsCalendarParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /v1/calendars/market-hours`, but is otherwise the
         * same as [CalendarService.getMarketHoursCalendar].
         */
        @MustBeClosed
        fun getMarketHoursCalendar(): HttpResponseFor<CalendarGetMarketHoursCalendarResponse> =
            getMarketHoursCalendar(CalendarGetMarketHoursCalendarParams.none())

        /** @see getMarketHoursCalendar */
        @MustBeClosed
        fun getMarketHoursCalendar(
            params: CalendarGetMarketHoursCalendarParams =
                CalendarGetMarketHoursCalendarParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CalendarGetMarketHoursCalendarResponse>

        /** @see getMarketHoursCalendar */
        @MustBeClosed
        fun getMarketHoursCalendar(
            params: CalendarGetMarketHoursCalendarParams =
                CalendarGetMarketHoursCalendarParams.none()
        ): HttpResponseFor<CalendarGetMarketHoursCalendarResponse> =
            getMarketHoursCalendar(params, RequestOptions.none())

        /** @see getMarketHoursCalendar */
        @MustBeClosed
        fun getMarketHoursCalendar(
            requestOptions: RequestOptions
        ): HttpResponseFor<CalendarGetMarketHoursCalendarResponse> =
            getMarketHoursCalendar(CalendarGetMarketHoursCalendarParams.none(), requestOptions)
    }
}
