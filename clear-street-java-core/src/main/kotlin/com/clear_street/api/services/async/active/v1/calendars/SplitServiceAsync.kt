// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.active.v1.calendars

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.core.RequestOptions
import com.clear_street.api.core.http.HttpResponseFor
import com.clear_street.api.models.active.v1.calendars.splits.SplitGetSplitsCalendarParams
import com.clear_street.api.models.active.v1.calendars.splits.SplitGetSplitsCalendarResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Access financial calendars for events like earnings, dividends, and splits. */
interface SplitServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SplitServiceAsync

    /** Retrieves upcoming stock splits. */
    fun getSplitsCalendar(): CompletableFuture<SplitGetSplitsCalendarResponse> =
        getSplitsCalendar(SplitGetSplitsCalendarParams.none())

    /** @see getSplitsCalendar */
    fun getSplitsCalendar(
        params: SplitGetSplitsCalendarParams = SplitGetSplitsCalendarParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SplitGetSplitsCalendarResponse>

    /** @see getSplitsCalendar */
    fun getSplitsCalendar(
        params: SplitGetSplitsCalendarParams = SplitGetSplitsCalendarParams.none()
    ): CompletableFuture<SplitGetSplitsCalendarResponse> =
        getSplitsCalendar(params, RequestOptions.none())

    /** @see getSplitsCalendar */
    fun getSplitsCalendar(
        requestOptions: RequestOptions
    ): CompletableFuture<SplitGetSplitsCalendarResponse> =
        getSplitsCalendar(SplitGetSplitsCalendarParams.none(), requestOptions)

    /** A view of [SplitServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SplitServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /active/v1/calendars/splits`, but is otherwise the
         * same as [SplitServiceAsync.getSplitsCalendar].
         */
        fun getSplitsCalendar():
            CompletableFuture<HttpResponseFor<SplitGetSplitsCalendarResponse>> =
            getSplitsCalendar(SplitGetSplitsCalendarParams.none())

        /** @see getSplitsCalendar */
        fun getSplitsCalendar(
            params: SplitGetSplitsCalendarParams = SplitGetSplitsCalendarParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SplitGetSplitsCalendarResponse>>

        /** @see getSplitsCalendar */
        fun getSplitsCalendar(
            params: SplitGetSplitsCalendarParams = SplitGetSplitsCalendarParams.none()
        ): CompletableFuture<HttpResponseFor<SplitGetSplitsCalendarResponse>> =
            getSplitsCalendar(params, RequestOptions.none())

        /** @see getSplitsCalendar */
        fun getSplitsCalendar(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<SplitGetSplitsCalendarResponse>> =
            getSplitsCalendar(SplitGetSplitsCalendarParams.none(), requestOptions)
    }
}
