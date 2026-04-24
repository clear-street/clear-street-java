// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.active.v1

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.core.RequestOptions
import com.clear_street.api.core.http.HttpResponse
import com.clear_street.api.core.http.HttpResponseFor
import com.clear_street.api.models.active.v1.watchlists.WatchlistCreateWatchlistParams
import com.clear_street.api.models.active.v1.watchlists.WatchlistCreateWatchlistResponse
import com.clear_street.api.models.active.v1.watchlists.WatchlistDeleteWatchlistParams
import com.clear_street.api.models.active.v1.watchlists.WatchlistGetWatchlistByIdParams
import com.clear_street.api.models.active.v1.watchlists.WatchlistGetWatchlistByIdResponse
import com.clear_street.api.models.active.v1.watchlists.WatchlistGetWatchlistsParams
import com.clear_street.api.models.active.v1.watchlists.WatchlistGetWatchlistsResponse
import com.clear_street.api.services.async.active.v1.watchlists.ItemServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Create and manage watchlists. */
interface WatchlistServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): WatchlistServiceAsync

    /** Create and manage watchlists. */
    fun items(): ItemServiceAsync

    /** Create Watchlist */
    fun createWatchlist(
        params: WatchlistCreateWatchlistParams
    ): CompletableFuture<WatchlistCreateWatchlistResponse> =
        createWatchlist(params, RequestOptions.none())

    /** @see createWatchlist */
    fun createWatchlist(
        params: WatchlistCreateWatchlistParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WatchlistCreateWatchlistResponse>

    /** Delete a watchlist and all its items */
    fun deleteWatchlist(watchlistId: String): CompletableFuture<Void?> =
        deleteWatchlist(watchlistId, WatchlistDeleteWatchlistParams.none())

    /** @see deleteWatchlist */
    fun deleteWatchlist(
        watchlistId: String,
        params: WatchlistDeleteWatchlistParams = WatchlistDeleteWatchlistParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        deleteWatchlist(params.toBuilder().watchlistId(watchlistId).build(), requestOptions)

    /** @see deleteWatchlist */
    fun deleteWatchlist(
        watchlistId: String,
        params: WatchlistDeleteWatchlistParams = WatchlistDeleteWatchlistParams.none(),
    ): CompletableFuture<Void?> = deleteWatchlist(watchlistId, params, RequestOptions.none())

    /** @see deleteWatchlist */
    fun deleteWatchlist(
        params: WatchlistDeleteWatchlistParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see deleteWatchlist */
    fun deleteWatchlist(params: WatchlistDeleteWatchlistParams): CompletableFuture<Void?> =
        deleteWatchlist(params, RequestOptions.none())

    /** @see deleteWatchlist */
    fun deleteWatchlist(
        watchlistId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        deleteWatchlist(watchlistId, WatchlistDeleteWatchlistParams.none(), requestOptions)

    /** Get a watchlist by ID with all its items */
    fun getWatchlistById(
        watchlistId: String
    ): CompletableFuture<WatchlistGetWatchlistByIdResponse> =
        getWatchlistById(watchlistId, WatchlistGetWatchlistByIdParams.none())

    /** @see getWatchlistById */
    fun getWatchlistById(
        watchlistId: String,
        params: WatchlistGetWatchlistByIdParams = WatchlistGetWatchlistByIdParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WatchlistGetWatchlistByIdResponse> =
        getWatchlistById(params.toBuilder().watchlistId(watchlistId).build(), requestOptions)

    /** @see getWatchlistById */
    fun getWatchlistById(
        watchlistId: String,
        params: WatchlistGetWatchlistByIdParams = WatchlistGetWatchlistByIdParams.none(),
    ): CompletableFuture<WatchlistGetWatchlistByIdResponse> =
        getWatchlistById(watchlistId, params, RequestOptions.none())

    /** @see getWatchlistById */
    fun getWatchlistById(
        params: WatchlistGetWatchlistByIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WatchlistGetWatchlistByIdResponse>

    /** @see getWatchlistById */
    fun getWatchlistById(
        params: WatchlistGetWatchlistByIdParams
    ): CompletableFuture<WatchlistGetWatchlistByIdResponse> =
        getWatchlistById(params, RequestOptions.none())

    /** @see getWatchlistById */
    fun getWatchlistById(
        watchlistId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<WatchlistGetWatchlistByIdResponse> =
        getWatchlistById(watchlistId, WatchlistGetWatchlistByIdParams.none(), requestOptions)

    /** List watchlists for the authenticated user */
    fun getWatchlists(): CompletableFuture<WatchlistGetWatchlistsResponse> =
        getWatchlists(WatchlistGetWatchlistsParams.none())

    /** @see getWatchlists */
    fun getWatchlists(
        params: WatchlistGetWatchlistsParams = WatchlistGetWatchlistsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WatchlistGetWatchlistsResponse>

    /** @see getWatchlists */
    fun getWatchlists(
        params: WatchlistGetWatchlistsParams = WatchlistGetWatchlistsParams.none()
    ): CompletableFuture<WatchlistGetWatchlistsResponse> =
        getWatchlists(params, RequestOptions.none())

    /** @see getWatchlists */
    fun getWatchlists(
        requestOptions: RequestOptions
    ): CompletableFuture<WatchlistGetWatchlistsResponse> =
        getWatchlists(WatchlistGetWatchlistsParams.none(), requestOptions)

    /**
     * A view of [WatchlistServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): WatchlistServiceAsync.WithRawResponse

        /** Create and manage watchlists. */
        fun items(): ItemServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /active/v1/watchlists`, but is otherwise the same
         * as [WatchlistServiceAsync.createWatchlist].
         */
        fun createWatchlist(
            params: WatchlistCreateWatchlistParams
        ): CompletableFuture<HttpResponseFor<WatchlistCreateWatchlistResponse>> =
            createWatchlist(params, RequestOptions.none())

        /** @see createWatchlist */
        fun createWatchlist(
            params: WatchlistCreateWatchlistParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WatchlistCreateWatchlistResponse>>

        /**
         * Returns a raw HTTP response for `delete /active/v1/watchlists/{watchlist_id}`, but is
         * otherwise the same as [WatchlistServiceAsync.deleteWatchlist].
         */
        fun deleteWatchlist(watchlistId: String): CompletableFuture<HttpResponse> =
            deleteWatchlist(watchlistId, WatchlistDeleteWatchlistParams.none())

        /** @see deleteWatchlist */
        fun deleteWatchlist(
            watchlistId: String,
            params: WatchlistDeleteWatchlistParams = WatchlistDeleteWatchlistParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            deleteWatchlist(params.toBuilder().watchlistId(watchlistId).build(), requestOptions)

        /** @see deleteWatchlist */
        fun deleteWatchlist(
            watchlistId: String,
            params: WatchlistDeleteWatchlistParams = WatchlistDeleteWatchlistParams.none(),
        ): CompletableFuture<HttpResponse> =
            deleteWatchlist(watchlistId, params, RequestOptions.none())

        /** @see deleteWatchlist */
        fun deleteWatchlist(
            params: WatchlistDeleteWatchlistParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see deleteWatchlist */
        fun deleteWatchlist(
            params: WatchlistDeleteWatchlistParams
        ): CompletableFuture<HttpResponse> = deleteWatchlist(params, RequestOptions.none())

        /** @see deleteWatchlist */
        fun deleteWatchlist(
            watchlistId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            deleteWatchlist(watchlistId, WatchlistDeleteWatchlistParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /active/v1/watchlists/{watchlist_id}`, but is
         * otherwise the same as [WatchlistServiceAsync.getWatchlistById].
         */
        fun getWatchlistById(
            watchlistId: String
        ): CompletableFuture<HttpResponseFor<WatchlistGetWatchlistByIdResponse>> =
            getWatchlistById(watchlistId, WatchlistGetWatchlistByIdParams.none())

        /** @see getWatchlistById */
        fun getWatchlistById(
            watchlistId: String,
            params: WatchlistGetWatchlistByIdParams = WatchlistGetWatchlistByIdParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WatchlistGetWatchlistByIdResponse>> =
            getWatchlistById(params.toBuilder().watchlistId(watchlistId).build(), requestOptions)

        /** @see getWatchlistById */
        fun getWatchlistById(
            watchlistId: String,
            params: WatchlistGetWatchlistByIdParams = WatchlistGetWatchlistByIdParams.none(),
        ): CompletableFuture<HttpResponseFor<WatchlistGetWatchlistByIdResponse>> =
            getWatchlistById(watchlistId, params, RequestOptions.none())

        /** @see getWatchlistById */
        fun getWatchlistById(
            params: WatchlistGetWatchlistByIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WatchlistGetWatchlistByIdResponse>>

        /** @see getWatchlistById */
        fun getWatchlistById(
            params: WatchlistGetWatchlistByIdParams
        ): CompletableFuture<HttpResponseFor<WatchlistGetWatchlistByIdResponse>> =
            getWatchlistById(params, RequestOptions.none())

        /** @see getWatchlistById */
        fun getWatchlistById(
            watchlistId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<WatchlistGetWatchlistByIdResponse>> =
            getWatchlistById(watchlistId, WatchlistGetWatchlistByIdParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /active/v1/watchlists`, but is otherwise the same as
         * [WatchlistServiceAsync.getWatchlists].
         */
        fun getWatchlists(): CompletableFuture<HttpResponseFor<WatchlistGetWatchlistsResponse>> =
            getWatchlists(WatchlistGetWatchlistsParams.none())

        /** @see getWatchlists */
        fun getWatchlists(
            params: WatchlistGetWatchlistsParams = WatchlistGetWatchlistsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WatchlistGetWatchlistsResponse>>

        /** @see getWatchlists */
        fun getWatchlists(
            params: WatchlistGetWatchlistsParams = WatchlistGetWatchlistsParams.none()
        ): CompletableFuture<HttpResponseFor<WatchlistGetWatchlistsResponse>> =
            getWatchlists(params, RequestOptions.none())

        /** @see getWatchlists */
        fun getWatchlists(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<WatchlistGetWatchlistsResponse>> =
            getWatchlists(WatchlistGetWatchlistsParams.none(), requestOptions)
    }
}
