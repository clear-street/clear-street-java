// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.active.v1.calendars

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.core.RequestOptions
import com.clear_street.api.core.http.HttpResponseFor
import com.clear_street.api.models.active.v1.calendars.dividends.DividendGetDividendsCalendarParams
import com.clear_street.api.models.active.v1.calendars.dividends.DividendGetDividendsCalendarResponse
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

/** Access financial calendars for events like earnings, dividends, and splits. */
interface DividendService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DividendService

    /** Retrieves upcoming dividend payments. */
    fun getDividendsCalendar(): DividendGetDividendsCalendarResponse =
        getDividendsCalendar(DividendGetDividendsCalendarParams.none())

    /** @see getDividendsCalendar */
    fun getDividendsCalendar(
        params: DividendGetDividendsCalendarParams = DividendGetDividendsCalendarParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DividendGetDividendsCalendarResponse

    /** @see getDividendsCalendar */
    fun getDividendsCalendar(
        params: DividendGetDividendsCalendarParams = DividendGetDividendsCalendarParams.none()
    ): DividendGetDividendsCalendarResponse = getDividendsCalendar(params, RequestOptions.none())

    /** @see getDividendsCalendar */
    fun getDividendsCalendar(requestOptions: RequestOptions): DividendGetDividendsCalendarResponse =
        getDividendsCalendar(DividendGetDividendsCalendarParams.none(), requestOptions)

    /** A view of [DividendService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): DividendService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /active/v1/calendars/dividends`, but is otherwise
         * the same as [DividendService.getDividendsCalendar].
         */
        @MustBeClosed
        fun getDividendsCalendar(): HttpResponseFor<DividendGetDividendsCalendarResponse> =
            getDividendsCalendar(DividendGetDividendsCalendarParams.none())

        /** @see getDividendsCalendar */
        @MustBeClosed
        fun getDividendsCalendar(
            params: DividendGetDividendsCalendarParams = DividendGetDividendsCalendarParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DividendGetDividendsCalendarResponse>

        /** @see getDividendsCalendar */
        @MustBeClosed
        fun getDividendsCalendar(
            params: DividendGetDividendsCalendarParams = DividendGetDividendsCalendarParams.none()
        ): HttpResponseFor<DividendGetDividendsCalendarResponse> =
            getDividendsCalendar(params, RequestOptions.none())

        /** @see getDividendsCalendar */
        @MustBeClosed
        fun getDividendsCalendar(
            requestOptions: RequestOptions
        ): HttpResponseFor<DividendGetDividendsCalendarResponse> =
            getDividendsCalendar(DividendGetDividendsCalendarParams.none(), requestOptions)
    }
}
