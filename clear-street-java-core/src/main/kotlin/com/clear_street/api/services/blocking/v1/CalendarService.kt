// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.v1

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.core.RequestOptions
import com.clear_street.api.core.http.HttpResponseFor
import com.clear_street.api.models.v1.calendar.CalendarGetClockParams
import com.clear_street.api.models.v1.calendar.CalendarGetClockResponse
import com.clear_street.api.models.v1.calendar.CalendarGetMarketHoursCalendarParams
import com.clear_street.api.models.v1.calendar.CalendarGetMarketHoursCalendarResponse
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
     * Retrieves comprehensive trading hours including pre-market, regular, and after-hours
     * sessions. Returns market status, session times, and next session schedules.
     */
    fun getMarketHoursCalendar(
        params: CalendarGetMarketHoursCalendarParams
    ): CalendarGetMarketHoursCalendarResponse =
        getMarketHoursCalendar(params, RequestOptions.none())

    /** @see getMarketHoursCalendar */
    fun getMarketHoursCalendar(
        params: CalendarGetMarketHoursCalendarParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CalendarGetMarketHoursCalendarResponse

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
         * Returns a raw HTTP response for `get /v1/calendars/market-hours`, but is otherwise the
         * same as [CalendarService.getMarketHoursCalendar].
         */
        @MustBeClosed
        fun getMarketHoursCalendar(
            params: CalendarGetMarketHoursCalendarParams
        ): HttpResponseFor<CalendarGetMarketHoursCalendarResponse> =
            getMarketHoursCalendar(params, RequestOptions.none())

        /** @see getMarketHoursCalendar */
        @MustBeClosed
        fun getMarketHoursCalendar(
            params: CalendarGetMarketHoursCalendarParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CalendarGetMarketHoursCalendarResponse>
    }
}
