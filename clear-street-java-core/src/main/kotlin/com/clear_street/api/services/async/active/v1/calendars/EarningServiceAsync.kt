// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.active.v1.calendars

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.core.RequestOptions
import com.clear_street.api.core.http.HttpResponseFor
import com.clear_street.api.models.active.v1.calendars.earnings.EarningGetEarningsCalendarParams
import com.clear_street.api.models.active.v1.calendars.earnings.EarningGetEarningsCalendarResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Access financial calendars for events like earnings, dividends, and splits. */
interface EarningServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): EarningServiceAsync

    /** Retrieves upcoming earnings announcements. */
    fun getEarningsCalendar(): CompletableFuture<EarningGetEarningsCalendarResponse> =
        getEarningsCalendar(EarningGetEarningsCalendarParams.none())

    /** @see getEarningsCalendar */
    fun getEarningsCalendar(
        params: EarningGetEarningsCalendarParams = EarningGetEarningsCalendarParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EarningGetEarningsCalendarResponse>

    /** @see getEarningsCalendar */
    fun getEarningsCalendar(
        params: EarningGetEarningsCalendarParams = EarningGetEarningsCalendarParams.none()
    ): CompletableFuture<EarningGetEarningsCalendarResponse> =
        getEarningsCalendar(params, RequestOptions.none())

    /** @see getEarningsCalendar */
    fun getEarningsCalendar(
        requestOptions: RequestOptions
    ): CompletableFuture<EarningGetEarningsCalendarResponse> =
        getEarningsCalendar(EarningGetEarningsCalendarParams.none(), requestOptions)

    /**
     * A view of [EarningServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): EarningServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /active/v1/calendars/earnings`, but is otherwise the
         * same as [EarningServiceAsync.getEarningsCalendar].
         */
        fun getEarningsCalendar():
            CompletableFuture<HttpResponseFor<EarningGetEarningsCalendarResponse>> =
            getEarningsCalendar(EarningGetEarningsCalendarParams.none())

        /** @see getEarningsCalendar */
        fun getEarningsCalendar(
            params: EarningGetEarningsCalendarParams = EarningGetEarningsCalendarParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EarningGetEarningsCalendarResponse>>

        /** @see getEarningsCalendar */
        fun getEarningsCalendar(
            params: EarningGetEarningsCalendarParams = EarningGetEarningsCalendarParams.none()
        ): CompletableFuture<HttpResponseFor<EarningGetEarningsCalendarResponse>> =
            getEarningsCalendar(params, RequestOptions.none())

        /** @see getEarningsCalendar */
        fun getEarningsCalendar(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<EarningGetEarningsCalendarResponse>> =
            getEarningsCalendar(EarningGetEarningsCalendarParams.none(), requestOptions)
    }
}
