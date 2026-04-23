// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.active.v1.calendars

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.core.RequestOptions
import com.clear_street.api.core.http.HttpResponseFor
import com.clear_street.api.models.active.v1.calendars.splits.SplitGetSplitsCalendarParams
import com.clear_street.api.models.active.v1.calendars.splits.SplitGetSplitsCalendarResponse
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

/** Access financial calendars for events like earnings, dividends, and splits. */
interface SplitService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SplitService

    /** Retrieves upcoming stock splits. */
    fun getSplitsCalendar(): SplitGetSplitsCalendarResponse =
        getSplitsCalendar(SplitGetSplitsCalendarParams.none())

    /** @see getSplitsCalendar */
    fun getSplitsCalendar(
        params: SplitGetSplitsCalendarParams = SplitGetSplitsCalendarParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SplitGetSplitsCalendarResponse

    /** @see getSplitsCalendar */
    fun getSplitsCalendar(
        params: SplitGetSplitsCalendarParams = SplitGetSplitsCalendarParams.none()
    ): SplitGetSplitsCalendarResponse = getSplitsCalendar(params, RequestOptions.none())

    /** @see getSplitsCalendar */
    fun getSplitsCalendar(requestOptions: RequestOptions): SplitGetSplitsCalendarResponse =
        getSplitsCalendar(SplitGetSplitsCalendarParams.none(), requestOptions)

    /** A view of [SplitService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): SplitService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /active/v1/calendars/splits`, but is otherwise the
         * same as [SplitService.getSplitsCalendar].
         */
        @MustBeClosed
        fun getSplitsCalendar(): HttpResponseFor<SplitGetSplitsCalendarResponse> =
            getSplitsCalendar(SplitGetSplitsCalendarParams.none())

        /** @see getSplitsCalendar */
        @MustBeClosed
        fun getSplitsCalendar(
            params: SplitGetSplitsCalendarParams = SplitGetSplitsCalendarParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SplitGetSplitsCalendarResponse>

        /** @see getSplitsCalendar */
        @MustBeClosed
        fun getSplitsCalendar(
            params: SplitGetSplitsCalendarParams = SplitGetSplitsCalendarParams.none()
        ): HttpResponseFor<SplitGetSplitsCalendarResponse> =
            getSplitsCalendar(params, RequestOptions.none())

        /** @see getSplitsCalendar */
        @MustBeClosed
        fun getSplitsCalendar(
            requestOptions: RequestOptions
        ): HttpResponseFor<SplitGetSplitsCalendarResponse> =
            getSplitsCalendar(SplitGetSplitsCalendarParams.none(), requestOptions)
    }
}
