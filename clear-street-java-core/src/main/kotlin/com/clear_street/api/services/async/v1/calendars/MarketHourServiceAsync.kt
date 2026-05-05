// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.v1.calendars

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.core.RequestOptions
import com.clear_street.api.core.http.HttpResponseFor
import com.clear_street.api.models.v1.calendars.markethours.MarketHourGetMarketHoursCalendarParams
import com.clear_street.api.models.v1.calendars.markethours.MarketHourGetMarketHoursCalendarResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Access financial calendars for events like earnings, dividends, and splits. */
interface MarketHourServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MarketHourServiceAsync

    /**
     * Retrieves comprehensive trading hours including pre-market, regular, and after-hours
     * sessions. Returns market status, session times, and next session schedules.
     */
    fun getMarketHoursCalendar(
        params: MarketHourGetMarketHoursCalendarParams
    ): CompletableFuture<MarketHourGetMarketHoursCalendarResponse> =
        getMarketHoursCalendar(params, RequestOptions.none())

    /** @see getMarketHoursCalendar */
    fun getMarketHoursCalendar(
        params: MarketHourGetMarketHoursCalendarParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MarketHourGetMarketHoursCalendarResponse>

    /**
     * A view of [MarketHourServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MarketHourServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/calendars/market-hours`, but is otherwise the
         * same as [MarketHourServiceAsync.getMarketHoursCalendar].
         */
        fun getMarketHoursCalendar(
            params: MarketHourGetMarketHoursCalendarParams
        ): CompletableFuture<HttpResponseFor<MarketHourGetMarketHoursCalendarResponse>> =
            getMarketHoursCalendar(params, RequestOptions.none())

        /** @see getMarketHoursCalendar */
        fun getMarketHoursCalendar(
            params: MarketHourGetMarketHoursCalendarParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MarketHourGetMarketHoursCalendarResponse>>
    }
}
