// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.active.v1.calendars

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.core.RequestOptions
import com.clear_street.api.core.http.HttpResponseFor
import com.clear_street.api.models.active.v1.calendars.dividends.DividendGetDividendsCalendarParams
import com.clear_street.api.models.active.v1.calendars.dividends.DividendGetDividendsCalendarResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Access financial calendars for events like earnings, dividends, and splits. */
interface DividendServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DividendServiceAsync

    /** Retrieves upcoming dividend payments. */
    fun getDividendsCalendar(): CompletableFuture<DividendGetDividendsCalendarResponse> =
        getDividendsCalendar(DividendGetDividendsCalendarParams.none())

    /** @see getDividendsCalendar */
    fun getDividendsCalendar(
        params: DividendGetDividendsCalendarParams = DividendGetDividendsCalendarParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DividendGetDividendsCalendarResponse>

    /** @see getDividendsCalendar */
    fun getDividendsCalendar(
        params: DividendGetDividendsCalendarParams = DividendGetDividendsCalendarParams.none()
    ): CompletableFuture<DividendGetDividendsCalendarResponse> =
        getDividendsCalendar(params, RequestOptions.none())

    /** @see getDividendsCalendar */
    fun getDividendsCalendar(
        requestOptions: RequestOptions
    ): CompletableFuture<DividendGetDividendsCalendarResponse> =
        getDividendsCalendar(DividendGetDividendsCalendarParams.none(), requestOptions)

    /**
     * A view of [DividendServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DividendServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /active/v1/calendars/dividends`, but is otherwise
         * the same as [DividendServiceAsync.getDividendsCalendar].
         */
        fun getDividendsCalendar():
            CompletableFuture<HttpResponseFor<DividendGetDividendsCalendarResponse>> =
            getDividendsCalendar(DividendGetDividendsCalendarParams.none())

        /** @see getDividendsCalendar */
        fun getDividendsCalendar(
            params: DividendGetDividendsCalendarParams = DividendGetDividendsCalendarParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DividendGetDividendsCalendarResponse>>

        /** @see getDividendsCalendar */
        fun getDividendsCalendar(
            params: DividendGetDividendsCalendarParams = DividendGetDividendsCalendarParams.none()
        ): CompletableFuture<HttpResponseFor<DividendGetDividendsCalendarResponse>> =
            getDividendsCalendar(params, RequestOptions.none())

        /** @see getDividendsCalendar */
        fun getDividendsCalendar(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<DividendGetDividendsCalendarResponse>> =
            getDividendsCalendar(DividendGetDividendsCalendarParams.none(), requestOptions)
    }
}
