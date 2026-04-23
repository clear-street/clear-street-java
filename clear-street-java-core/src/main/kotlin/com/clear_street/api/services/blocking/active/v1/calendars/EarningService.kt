// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.active.v1.calendars

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.core.RequestOptions
import com.clear_street.api.core.http.HttpResponseFor
import com.clear_street.api.models.active.v1.calendars.earnings.EarningGetEarningsCalendarParams
import com.clear_street.api.models.active.v1.calendars.earnings.EarningGetEarningsCalendarResponse
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

/** Access financial calendars for events like earnings, dividends, and splits. */
interface EarningService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): EarningService

    /** Retrieves upcoming earnings announcements. */
    fun getEarningsCalendar(): EarningGetEarningsCalendarResponse =
        getEarningsCalendar(EarningGetEarningsCalendarParams.none())

    /** @see getEarningsCalendar */
    fun getEarningsCalendar(
        params: EarningGetEarningsCalendarParams = EarningGetEarningsCalendarParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EarningGetEarningsCalendarResponse

    /** @see getEarningsCalendar */
    fun getEarningsCalendar(
        params: EarningGetEarningsCalendarParams = EarningGetEarningsCalendarParams.none()
    ): EarningGetEarningsCalendarResponse = getEarningsCalendar(params, RequestOptions.none())

    /** @see getEarningsCalendar */
    fun getEarningsCalendar(requestOptions: RequestOptions): EarningGetEarningsCalendarResponse =
        getEarningsCalendar(EarningGetEarningsCalendarParams.none(), requestOptions)

    /** A view of [EarningService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): EarningService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /active/v1/calendars/earnings`, but is otherwise the
         * same as [EarningService.getEarningsCalendar].
         */
        @MustBeClosed
        fun getEarningsCalendar(): HttpResponseFor<EarningGetEarningsCalendarResponse> =
            getEarningsCalendar(EarningGetEarningsCalendarParams.none())

        /** @see getEarningsCalendar */
        @MustBeClosed
        fun getEarningsCalendar(
            params: EarningGetEarningsCalendarParams = EarningGetEarningsCalendarParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EarningGetEarningsCalendarResponse>

        /** @see getEarningsCalendar */
        @MustBeClosed
        fun getEarningsCalendar(
            params: EarningGetEarningsCalendarParams = EarningGetEarningsCalendarParams.none()
        ): HttpResponseFor<EarningGetEarningsCalendarResponse> =
            getEarningsCalendar(params, RequestOptions.none())

        /** @see getEarningsCalendar */
        @MustBeClosed
        fun getEarningsCalendar(
            requestOptions: RequestOptions
        ): HttpResponseFor<EarningGetEarningsCalendarResponse> =
            getEarningsCalendar(EarningGetEarningsCalendarParams.none(), requestOptions)
    }
}
