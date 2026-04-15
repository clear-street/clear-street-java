// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.active.v1.calendars

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.core.RequestOptions
import com.clear_street.api.core.http.HttpResponseFor
import com.clear_street.api.models.active.v1.calendars.markethours.MarketHourGetMarketHoursCalendarParams
import com.clear_street.api.models.active.v1.calendars.markethours.MarketHourGetMarketHoursCalendarResponse
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

/** Access financial calendars for events like earnings, dividends, and splits. */
interface MarketHourService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MarketHourService

    /**
     * Retrieves comprehensive trading hours including pre-market, regular, and after-hours
     * sessions. Returns market status, session times, and next session schedules.
     */
    fun getMarketHoursCalendar(
        params: MarketHourGetMarketHoursCalendarParams
    ): MarketHourGetMarketHoursCalendarResponse =
        getMarketHoursCalendar(params, RequestOptions.none())

    /** @see getMarketHoursCalendar */
    fun getMarketHoursCalendar(
        params: MarketHourGetMarketHoursCalendarParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MarketHourGetMarketHoursCalendarResponse

    /** A view of [MarketHourService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MarketHourService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /active/v1/calendars/market-hours`, but is otherwise
         * the same as [MarketHourService.getMarketHoursCalendar].
         */
        @MustBeClosed
        fun getMarketHoursCalendar(
            params: MarketHourGetMarketHoursCalendarParams
        ): HttpResponseFor<MarketHourGetMarketHoursCalendarResponse> =
            getMarketHoursCalendar(params, RequestOptions.none())

        /** @see getMarketHoursCalendar */
        @MustBeClosed
        fun getMarketHoursCalendar(
            params: MarketHourGetMarketHoursCalendarParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MarketHourGetMarketHoursCalendarResponse>
    }
}
