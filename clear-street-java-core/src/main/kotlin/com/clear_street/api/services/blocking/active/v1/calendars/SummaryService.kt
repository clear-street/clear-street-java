// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.active.v1.calendars

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.core.RequestOptions
import com.clear_street.api.core.http.HttpResponseFor
import com.clear_street.api.models.active.v1.calendars.summary.SummaryGetCalendarSummaryParams
import com.clear_street.api.models.active.v1.calendars.summary.SummaryGetCalendarSummaryResponse
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

/** Access financial calendars for events like earnings, dividends, and splits. */
interface SummaryService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SummaryService

    /** Retrieves a consolidated view of all calendar events. */
    fun getCalendarSummary(): SummaryGetCalendarSummaryResponse =
        getCalendarSummary(SummaryGetCalendarSummaryParams.none())

    /** @see getCalendarSummary */
    fun getCalendarSummary(
        params: SummaryGetCalendarSummaryParams = SummaryGetCalendarSummaryParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SummaryGetCalendarSummaryResponse

    /** @see getCalendarSummary */
    fun getCalendarSummary(
        params: SummaryGetCalendarSummaryParams = SummaryGetCalendarSummaryParams.none()
    ): SummaryGetCalendarSummaryResponse = getCalendarSummary(params, RequestOptions.none())

    /** @see getCalendarSummary */
    fun getCalendarSummary(requestOptions: RequestOptions): SummaryGetCalendarSummaryResponse =
        getCalendarSummary(SummaryGetCalendarSummaryParams.none(), requestOptions)

    /** A view of [SummaryService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): SummaryService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /active/v1/calendars/summary`, but is otherwise the
         * same as [SummaryService.getCalendarSummary].
         */
        @MustBeClosed
        fun getCalendarSummary(): HttpResponseFor<SummaryGetCalendarSummaryResponse> =
            getCalendarSummary(SummaryGetCalendarSummaryParams.none())

        /** @see getCalendarSummary */
        @MustBeClosed
        fun getCalendarSummary(
            params: SummaryGetCalendarSummaryParams = SummaryGetCalendarSummaryParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SummaryGetCalendarSummaryResponse>

        /** @see getCalendarSummary */
        @MustBeClosed
        fun getCalendarSummary(
            params: SummaryGetCalendarSummaryParams = SummaryGetCalendarSummaryParams.none()
        ): HttpResponseFor<SummaryGetCalendarSummaryResponse> =
            getCalendarSummary(params, RequestOptions.none())

        /** @see getCalendarSummary */
        @MustBeClosed
        fun getCalendarSummary(
            requestOptions: RequestOptions
        ): HttpResponseFor<SummaryGetCalendarSummaryResponse> =
            getCalendarSummary(SummaryGetCalendarSummaryParams.none(), requestOptions)
    }
}
