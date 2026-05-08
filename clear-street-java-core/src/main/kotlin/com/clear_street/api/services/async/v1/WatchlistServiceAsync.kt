// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.v1

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.core.RequestOptions
import com.clear_street.api.core.http.HttpResponseFor
import com.clear_street.api.models.v1.watchlist.WatchlistAddWatchlistItemParams
import com.clear_street.api.models.v1.watchlist.WatchlistAddWatchlistItemResponse
import com.clear_street.api.models.v1.watchlist.WatchlistCreateWatchlistParams
import com.clear_street.api.models.v1.watchlist.WatchlistCreateWatchlistResponse
import com.clear_street.api.models.v1.watchlist.WatchlistDeleteWatchlistItemParams
import com.clear_street.api.models.v1.watchlist.WatchlistDeleteWatchlistItemResponse
import com.clear_street.api.models.v1.watchlist.WatchlistDeleteWatchlistParams
import com.clear_street.api.models.v1.watchlist.WatchlistDeleteWatchlistResponse
import com.clear_street.api.models.v1.watchlist.WatchlistGetWatchlistByIdParams
import com.clear_street.api.models.v1.watchlist.WatchlistGetWatchlistByIdResponse
import com.clear_street.api.models.v1.watchlist.WatchlistGetWatchlistsParams
import com.clear_street.api.models.v1.watchlist.WatchlistGetWatchlistsResponse
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

    /** Add an instrument to a watchlist */
    fun addWatchlistItem(
        watchlistId: String,
        params: WatchlistAddWatchlistItemParams,
    ): CompletableFuture<WatchlistAddWatchlistItemResponse> =
        addWatchlistItem(watchlistId, params, RequestOptions.none())

    /** @see addWatchlistItem */
    fun addWatchlistItem(
        watchlistId: String,
        params: WatchlistAddWatchlistItemParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WatchlistAddWatchlistItemResponse> =
        addWatchlistItem(params.toBuilder().watchlistId(watchlistId).build(), requestOptions)

    /** @see addWatchlistItem */
    fun addWatchlistItem(
        params: WatchlistAddWatchlistItemParams
    ): CompletableFuture<WatchlistAddWatchlistItemResponse> =
        addWatchlistItem(params, RequestOptions.none())

    /** @see addWatchlistItem */
    fun addWatchlistItem(
        params: WatchlistAddWatchlistItemParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WatchlistAddWatchlistItemResponse>

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
    fun deleteWatchlist(watchlistId: String): CompletableFuture<WatchlistDeleteWatchlistResponse> =
        deleteWatchlist(watchlistId, WatchlistDeleteWatchlistParams.none())

    /** @see deleteWatchlist */
    fun deleteWatchlist(
        watchlistId: String,
        params: WatchlistDeleteWatchlistParams = WatchlistDeleteWatchlistParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WatchlistDeleteWatchlistResponse> =
        deleteWatchlist(params.toBuilder().watchlistId(watchlistId).build(), requestOptions)

    /** @see deleteWatchlist */
    fun deleteWatchlist(
        watchlistId: String,
        params: WatchlistDeleteWatchlistParams = WatchlistDeleteWatchlistParams.none(),
    ): CompletableFuture<WatchlistDeleteWatchlistResponse> =
        deleteWatchlist(watchlistId, params, RequestOptions.none())

    /** @see deleteWatchlist */
    fun deleteWatchlist(
        params: WatchlistDeleteWatchlistParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WatchlistDeleteWatchlistResponse>

    /** @see deleteWatchlist */
    fun deleteWatchlist(
        params: WatchlistDeleteWatchlistParams
    ): CompletableFuture<WatchlistDeleteWatchlistResponse> =
        deleteWatchlist(params, RequestOptions.none())

    /** @see deleteWatchlist */
    fun deleteWatchlist(
        watchlistId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<WatchlistDeleteWatchlistResponse> =
        deleteWatchlist(watchlistId, WatchlistDeleteWatchlistParams.none(), requestOptions)

    /** Delete an instrument from a watchlist */
    fun deleteWatchlistItem(
        itemId: String,
        params: WatchlistDeleteWatchlistItemParams,
    ): CompletableFuture<WatchlistDeleteWatchlistItemResponse> =
        deleteWatchlistItem(itemId, params, RequestOptions.none())

    /** @see deleteWatchlistItem */
    fun deleteWatchlistItem(
        itemId: String,
        params: WatchlistDeleteWatchlistItemParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WatchlistDeleteWatchlistItemResponse> =
        deleteWatchlistItem(params.toBuilder().itemId(itemId).build(), requestOptions)

    /** @see deleteWatchlistItem */
    fun deleteWatchlistItem(
        params: WatchlistDeleteWatchlistItemParams
    ): CompletableFuture<WatchlistDeleteWatchlistItemResponse> =
        deleteWatchlistItem(params, RequestOptions.none())

    /** @see deleteWatchlistItem */
    fun deleteWatchlistItem(
        params: WatchlistDeleteWatchlistItemParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WatchlistDeleteWatchlistItemResponse>

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

        /**
         * Returns a raw HTTP response for `post /v1/watchlists/{watchlist_id}/items`, but is
         * otherwise the same as [WatchlistServiceAsync.addWatchlistItem].
         */
        fun addWatchlistItem(
            watchlistId: String,
            params: WatchlistAddWatchlistItemParams,
        ): CompletableFuture<HttpResponseFor<WatchlistAddWatchlistItemResponse>> =
            addWatchlistItem(watchlistId, params, RequestOptions.none())

        /** @see addWatchlistItem */
        fun addWatchlistItem(
            watchlistId: String,
            params: WatchlistAddWatchlistItemParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WatchlistAddWatchlistItemResponse>> =
            addWatchlistItem(params.toBuilder().watchlistId(watchlistId).build(), requestOptions)

        /** @see addWatchlistItem */
        fun addWatchlistItem(
            params: WatchlistAddWatchlistItemParams
        ): CompletableFuture<HttpResponseFor<WatchlistAddWatchlistItemResponse>> =
            addWatchlistItem(params, RequestOptions.none())

        /** @see addWatchlistItem */
        fun addWatchlistItem(
            params: WatchlistAddWatchlistItemParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WatchlistAddWatchlistItemResponse>>

        /**
         * Returns a raw HTTP response for `post /v1/watchlists`, but is otherwise the same as
         * [WatchlistServiceAsync.createWatchlist].
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
         * Returns a raw HTTP response for `delete /v1/watchlists/{watchlist_id}`, but is otherwise
         * the same as [WatchlistServiceAsync.deleteWatchlist].
         */
        fun deleteWatchlist(
            watchlistId: String
        ): CompletableFuture<HttpResponseFor<WatchlistDeleteWatchlistResponse>> =
            deleteWatchlist(watchlistId, WatchlistDeleteWatchlistParams.none())

        /** @see deleteWatchlist */
        fun deleteWatchlist(
            watchlistId: String,
            params: WatchlistDeleteWatchlistParams = WatchlistDeleteWatchlistParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WatchlistDeleteWatchlistResponse>> =
            deleteWatchlist(params.toBuilder().watchlistId(watchlistId).build(), requestOptions)

        /** @see deleteWatchlist */
        fun deleteWatchlist(
            watchlistId: String,
            params: WatchlistDeleteWatchlistParams = WatchlistDeleteWatchlistParams.none(),
        ): CompletableFuture<HttpResponseFor<WatchlistDeleteWatchlistResponse>> =
            deleteWatchlist(watchlistId, params, RequestOptions.none())

        /** @see deleteWatchlist */
        fun deleteWatchlist(
            params: WatchlistDeleteWatchlistParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WatchlistDeleteWatchlistResponse>>

        /** @see deleteWatchlist */
        fun deleteWatchlist(
            params: WatchlistDeleteWatchlistParams
        ): CompletableFuture<HttpResponseFor<WatchlistDeleteWatchlistResponse>> =
            deleteWatchlist(params, RequestOptions.none())

        /** @see deleteWatchlist */
        fun deleteWatchlist(
            watchlistId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<WatchlistDeleteWatchlistResponse>> =
            deleteWatchlist(watchlistId, WatchlistDeleteWatchlistParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/watchlists/{watchlist_id}/items/{item_id}`,
         * but is otherwise the same as [WatchlistServiceAsync.deleteWatchlistItem].
         */
        fun deleteWatchlistItem(
            itemId: String,
            params: WatchlistDeleteWatchlistItemParams,
        ): CompletableFuture<HttpResponseFor<WatchlistDeleteWatchlistItemResponse>> =
            deleteWatchlistItem(itemId, params, RequestOptions.none())

        /** @see deleteWatchlistItem */
        fun deleteWatchlistItem(
            itemId: String,
            params: WatchlistDeleteWatchlistItemParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WatchlistDeleteWatchlistItemResponse>> =
            deleteWatchlistItem(params.toBuilder().itemId(itemId).build(), requestOptions)

        /** @see deleteWatchlistItem */
        fun deleteWatchlistItem(
            params: WatchlistDeleteWatchlistItemParams
        ): CompletableFuture<HttpResponseFor<WatchlistDeleteWatchlistItemResponse>> =
            deleteWatchlistItem(params, RequestOptions.none())

        /** @see deleteWatchlistItem */
        fun deleteWatchlistItem(
            params: WatchlistDeleteWatchlistItemParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WatchlistDeleteWatchlistItemResponse>>

        /**
         * Returns a raw HTTP response for `get /v1/watchlists/{watchlist_id}`, but is otherwise the
         * same as [WatchlistServiceAsync.getWatchlistById].
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
         * Returns a raw HTTP response for `get /v1/watchlists`, but is otherwise the same as
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
