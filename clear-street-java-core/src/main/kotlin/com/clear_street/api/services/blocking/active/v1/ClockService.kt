// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.active.v1

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.core.RequestOptions
import com.clear_street.api.core.http.HttpResponseFor
import com.clear_street.api.models.active.v1.clock.ClockGetClockParams
import com.clear_street.api.models.active.v1.clock.ClockGetClockResponse
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

/** Access financial calendars for events like earnings, dividends, and splits. */
interface ClockService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ClockService

    /** Returns the current server time in UTC. */
    fun getClock(): ClockGetClockResponse = getClock(ClockGetClockParams.none())

    /** @see getClock */
    fun getClock(
        params: ClockGetClockParams = ClockGetClockParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ClockGetClockResponse

    /** @see getClock */
    fun getClock(params: ClockGetClockParams = ClockGetClockParams.none()): ClockGetClockResponse =
        getClock(params, RequestOptions.none())

    /** @see getClock */
    fun getClock(requestOptions: RequestOptions): ClockGetClockResponse =
        getClock(ClockGetClockParams.none(), requestOptions)

    /** A view of [ClockService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ClockService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /active/v1/clock`, but is otherwise the same as
         * [ClockService.getClock].
         */
        @MustBeClosed
        fun getClock(): HttpResponseFor<ClockGetClockResponse> =
            getClock(ClockGetClockParams.none())

        /** @see getClock */
        @MustBeClosed
        fun getClock(
            params: ClockGetClockParams = ClockGetClockParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ClockGetClockResponse>

        /** @see getClock */
        @MustBeClosed
        fun getClock(
            params: ClockGetClockParams = ClockGetClockParams.none()
        ): HttpResponseFor<ClockGetClockResponse> = getClock(params, RequestOptions.none())

        /** @see getClock */
        @MustBeClosed
        fun getClock(requestOptions: RequestOptions): HttpResponseFor<ClockGetClockResponse> =
            getClock(ClockGetClockParams.none(), requestOptions)
    }
}
