// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.active.v1

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.core.RequestOptions
import com.clear_street.api.core.http.HttpResponseFor
import com.clear_street.api.models.active.v1.screener.ScreenerGetScreenerParams
import com.clear_street.api.models.active.v1.screener.ScreenerGetScreenerResponse
import com.clear_street.api.models.active.v1.screener.ScreenerSearchScreenerParams
import com.clear_street.api.models.active.v1.screener.ScreenerSearchScreenerResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Search and manage saved screeners. */
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

    /**
     * Screen instruments.
     *
     * Searches for instruments matching specified criteria.
     */
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
     * Search instruments using structured filters.
     *
     * Returns a columnar response where each row is an array of column objects. Each column
     * contains a human-readable name, a field reference, an optional type hint (e.g. `CURR_USD`,
     * `PERCENT`), and the value.
     *
     * Use `field_filter` to select which columns appear in each row. When omitted, the default
     * field set is returned.
     */
    fun searchScreener(): CompletableFuture<ScreenerSearchScreenerResponse> =
        searchScreener(ScreenerSearchScreenerParams.none())

    /** @see searchScreener */
    fun searchScreener(
        params: ScreenerSearchScreenerParams = ScreenerSearchScreenerParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ScreenerSearchScreenerResponse>

    /** @see searchScreener */
    fun searchScreener(
        params: ScreenerSearchScreenerParams = ScreenerSearchScreenerParams.none()
    ): CompletableFuture<ScreenerSearchScreenerResponse> =
        searchScreener(params, RequestOptions.none())

    /** @see searchScreener */
    fun searchScreener(
        requestOptions: RequestOptions
    ): CompletableFuture<ScreenerSearchScreenerResponse> =
        searchScreener(ScreenerSearchScreenerParams.none(), requestOptions)

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

        /**
         * Returns a raw HTTP response for `post /active/v1/screener`, but is otherwise the same as
         * [ScreenerServiceAsync.searchScreener].
         */
        fun searchScreener(): CompletableFuture<HttpResponseFor<ScreenerSearchScreenerResponse>> =
            searchScreener(ScreenerSearchScreenerParams.none())

        /** @see searchScreener */
        fun searchScreener(
            params: ScreenerSearchScreenerParams = ScreenerSearchScreenerParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ScreenerSearchScreenerResponse>>

        /** @see searchScreener */
        fun searchScreener(
            params: ScreenerSearchScreenerParams = ScreenerSearchScreenerParams.none()
        ): CompletableFuture<HttpResponseFor<ScreenerSearchScreenerResponse>> =
            searchScreener(params, RequestOptions.none())

        /** @see searchScreener */
        fun searchScreener(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ScreenerSearchScreenerResponse>> =
            searchScreener(ScreenerSearchScreenerParams.none(), requestOptions)
    }
}
