// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.active.v1

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.core.RequestOptions
import com.clear_street.api.core.http.HttpResponseFor
import com.clear_street.api.models.active.v1.screener.ScreenerGetScreenerParams
import com.clear_street.api.models.active.v1.screener.ScreenerGetScreenerResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Retrieve details and lists of tradable instruments. */
interface ScreenerServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ScreenerServiceAsync

    /** Searches for instruments matching specified criteria. */
    fun getScreener(): CompletableFuture<ScreenerGetScreenerResponse> =
        getScreener(ScreenerGetScreenerParams.none())

    /** @see getScreener */
    fun getScreener(
        params: ScreenerGetScreenerParams = ScreenerGetScreenerParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ScreenerGetScreenerResponse>

    /** @see getScreener */
    fun getScreener(
        params: ScreenerGetScreenerParams = ScreenerGetScreenerParams.none()
    ): CompletableFuture<ScreenerGetScreenerResponse> = getScreener(params, RequestOptions.none())

    /** @see getScreener */
    fun getScreener(
        requestOptions: RequestOptions
    ): CompletableFuture<ScreenerGetScreenerResponse> =
        getScreener(ScreenerGetScreenerParams.none(), requestOptions)

    /**
     * A view of [ScreenerServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ScreenerServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /active/v1/screener`, but is otherwise the same as
         * [ScreenerServiceAsync.getScreener].
         */
        fun getScreener(): CompletableFuture<HttpResponseFor<ScreenerGetScreenerResponse>> =
            getScreener(ScreenerGetScreenerParams.none())

        /** @see getScreener */
        fun getScreener(
            params: ScreenerGetScreenerParams = ScreenerGetScreenerParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ScreenerGetScreenerResponse>>

        /** @see getScreener */
        fun getScreener(
            params: ScreenerGetScreenerParams = ScreenerGetScreenerParams.none()
        ): CompletableFuture<HttpResponseFor<ScreenerGetScreenerResponse>> =
            getScreener(params, RequestOptions.none())

        /** @see getScreener */
        fun getScreener(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ScreenerGetScreenerResponse>> =
            getScreener(ScreenerGetScreenerParams.none(), requestOptions)
    }
}
