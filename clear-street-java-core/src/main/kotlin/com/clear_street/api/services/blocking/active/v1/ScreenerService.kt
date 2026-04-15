// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.active.v1

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.core.RequestOptions
import com.clear_street.api.core.http.HttpResponseFor
import com.clear_street.api.models.active.v1.screener.ScreenerGetScreenerParams
import com.clear_street.api.models.active.v1.screener.ScreenerGetScreenerResponse
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

/** Retrieve details and lists of tradable instruments. */
interface ScreenerService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ScreenerService

    /** Searches for instruments matching specified criteria. */
    fun getScreener(): ScreenerGetScreenerResponse = getScreener(ScreenerGetScreenerParams.none())

    /** @see getScreener */
    fun getScreener(
        params: ScreenerGetScreenerParams = ScreenerGetScreenerParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ScreenerGetScreenerResponse

    /** @see getScreener */
    fun getScreener(
        params: ScreenerGetScreenerParams = ScreenerGetScreenerParams.none()
    ): ScreenerGetScreenerResponse = getScreener(params, RequestOptions.none())

    /** @see getScreener */
    fun getScreener(requestOptions: RequestOptions): ScreenerGetScreenerResponse =
        getScreener(ScreenerGetScreenerParams.none(), requestOptions)

    /** A view of [ScreenerService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ScreenerService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /active/v1/screener`, but is otherwise the same as
         * [ScreenerService.getScreener].
         */
        @MustBeClosed
        fun getScreener(): HttpResponseFor<ScreenerGetScreenerResponse> =
            getScreener(ScreenerGetScreenerParams.none())

        /** @see getScreener */
        @MustBeClosed
        fun getScreener(
            params: ScreenerGetScreenerParams = ScreenerGetScreenerParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ScreenerGetScreenerResponse>

        /** @see getScreener */
        @MustBeClosed
        fun getScreener(
            params: ScreenerGetScreenerParams = ScreenerGetScreenerParams.none()
        ): HttpResponseFor<ScreenerGetScreenerResponse> = getScreener(params, RequestOptions.none())

        /** @see getScreener */
        @MustBeClosed
        fun getScreener(
            requestOptions: RequestOptions
        ): HttpResponseFor<ScreenerGetScreenerResponse> =
            getScreener(ScreenerGetScreenerParams.none(), requestOptions)
    }
}
