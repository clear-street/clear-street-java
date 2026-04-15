// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.active.v1

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.core.RequestOptions
import com.clear_street.api.core.http.HttpResponseFor
import com.clear_street.api.models.active.v1.clock.ClockGetClockParams
import com.clear_street.api.models.active.v1.clock.ClockGetClockResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Access financial calendars for events like earnings, dividends, and splits. */
interface ClockServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ClockServiceAsync

    /** Returns the current server time in UTC. */
    fun getClock(): CompletableFuture<ClockGetClockResponse> = getClock(ClockGetClockParams.none())

    /** @see getClock */
    fun getClock(
        params: ClockGetClockParams = ClockGetClockParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ClockGetClockResponse>

    /** @see getClock */
    fun getClock(
        params: ClockGetClockParams = ClockGetClockParams.none()
    ): CompletableFuture<ClockGetClockResponse> = getClock(params, RequestOptions.none())

    /** @see getClock */
    fun getClock(requestOptions: RequestOptions): CompletableFuture<ClockGetClockResponse> =
        getClock(ClockGetClockParams.none(), requestOptions)

    /** A view of [ClockServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ClockServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /active/v1/clock`, but is otherwise the same as
         * [ClockServiceAsync.getClock].
         */
        fun getClock(): CompletableFuture<HttpResponseFor<ClockGetClockResponse>> =
            getClock(ClockGetClockParams.none())

        /** @see getClock */
        fun getClock(
            params: ClockGetClockParams = ClockGetClockParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ClockGetClockResponse>>

        /** @see getClock */
        fun getClock(
            params: ClockGetClockParams = ClockGetClockParams.none()
        ): CompletableFuture<HttpResponseFor<ClockGetClockResponse>> =
            getClock(params, RequestOptions.none())

        /** @see getClock */
        fun getClock(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ClockGetClockResponse>> =
            getClock(ClockGetClockParams.none(), requestOptions)
    }
}
