// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.v1

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.core.RequestOptions
import com.clear_street.api.core.http.HttpResponseFor
import com.clear_street.api.models.v1.calendar.CalendarGetClockParams
import com.clear_street.api.models.v1.calendar.CalendarGetClockResponse
import com.clear_street.api.models.v1.calendar.CalendarGetMarketHoursCalendarParams
import com.clear_street.api.models.v1.calendar.CalendarGetMarketHoursCalendarResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Access clocks and financial calendars for market sessions and events. */
interface CalendarServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CalendarServiceAsync

    /** Returns the current server time in UTC. */
    fun getClock(): CompletableFuture<CalendarGetClockResponse> =
        getClock(CalendarGetClockParams.none())

    /** @see getClock */
    fun getClock(
        params: CalendarGetClockParams = CalendarGetClockParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CalendarGetClockResponse>

    /** @see getClock */
    fun getClock(
        params: CalendarGetClockParams = CalendarGetClockParams.none()
    ): CompletableFuture<CalendarGetClockResponse> = getClock(params, RequestOptions.none())

    /** @see getClock */
    fun getClock(requestOptions: RequestOptions): CompletableFuture<CalendarGetClockResponse> =
        getClock(CalendarGetClockParams.none(), requestOptions)

    /**
     * Retrieves comprehensive trading hours including pre-market, regular, and after-hours
     * sessions. Returns market status, session times, and next session schedules.
     */
    fun getMarketHoursCalendar(
        params: CalendarGetMarketHoursCalendarParams
    ): CompletableFuture<CalendarGetMarketHoursCalendarResponse> =
        getMarketHoursCalendar(params, RequestOptions.none())

    /** @see getMarketHoursCalendar */
    fun getMarketHoursCalendar(
        params: CalendarGetMarketHoursCalendarParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CalendarGetMarketHoursCalendarResponse>

    /**
     * A view of [CalendarServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CalendarServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/clock`, but is otherwise the same as
         * [CalendarServiceAsync.getClock].
         */
        fun getClock(): CompletableFuture<HttpResponseFor<CalendarGetClockResponse>> =
            getClock(CalendarGetClockParams.none())

        /** @see getClock */
        fun getClock(
            params: CalendarGetClockParams = CalendarGetClockParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CalendarGetClockResponse>>

        /** @see getClock */
        fun getClock(
            params: CalendarGetClockParams = CalendarGetClockParams.none()
        ): CompletableFuture<HttpResponseFor<CalendarGetClockResponse>> =
            getClock(params, RequestOptions.none())

        /** @see getClock */
        fun getClock(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CalendarGetClockResponse>> =
            getClock(CalendarGetClockParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/calendars/market-hours`, but is otherwise the
         * same as [CalendarServiceAsync.getMarketHoursCalendar].
         */
        fun getMarketHoursCalendar(
            params: CalendarGetMarketHoursCalendarParams
        ): CompletableFuture<HttpResponseFor<CalendarGetMarketHoursCalendarResponse>> =
            getMarketHoursCalendar(params, RequestOptions.none())

        /** @see getMarketHoursCalendar */
        fun getMarketHoursCalendar(
            params: CalendarGetMarketHoursCalendarParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CalendarGetMarketHoursCalendarResponse>>
    }
}
