// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.v1

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
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

/** Create and manage watchlists. */
interface WatchlistService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): WatchlistService

    /** Add an instrument to a watchlist */
    fun addWatchlistItem(
        watchlistId: String,
        params: WatchlistAddWatchlistItemParams,
    ): WatchlistAddWatchlistItemResponse =
        addWatchlistItem(watchlistId, params, RequestOptions.none())

    /** @see addWatchlistItem */
    fun addWatchlistItem(
        watchlistId: String,
        params: WatchlistAddWatchlistItemParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WatchlistAddWatchlistItemResponse =
        addWatchlistItem(params.toBuilder().watchlistId(watchlistId).build(), requestOptions)

    /** @see addWatchlistItem */
    fun addWatchlistItem(
        params: WatchlistAddWatchlistItemParams
    ): WatchlistAddWatchlistItemResponse = addWatchlistItem(params, RequestOptions.none())

    /** @see addWatchlistItem */
    fun addWatchlistItem(
        params: WatchlistAddWatchlistItemParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WatchlistAddWatchlistItemResponse

    /** Create Watchlist */
    fun createWatchlist(params: WatchlistCreateWatchlistParams): WatchlistCreateWatchlistResponse =
        createWatchlist(params, RequestOptions.none())

    /** @see createWatchlist */
    fun createWatchlist(
        params: WatchlistCreateWatchlistParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WatchlistCreateWatchlistResponse

    /** Delete a watchlist and all its items */
    fun deleteWatchlist(watchlistId: String): WatchlistDeleteWatchlistResponse =
        deleteWatchlist(watchlistId, WatchlistDeleteWatchlistParams.none())

    /** @see deleteWatchlist */
    fun deleteWatchlist(
        watchlistId: String,
        params: WatchlistDeleteWatchlistParams = WatchlistDeleteWatchlistParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WatchlistDeleteWatchlistResponse =
        deleteWatchlist(params.toBuilder().watchlistId(watchlistId).build(), requestOptions)

    /** @see deleteWatchlist */
    fun deleteWatchlist(
        watchlistId: String,
        params: WatchlistDeleteWatchlistParams = WatchlistDeleteWatchlistParams.none(),
    ): WatchlistDeleteWatchlistResponse =
        deleteWatchlist(watchlistId, params, RequestOptions.none())

    /** @see deleteWatchlist */
    fun deleteWatchlist(
        params: WatchlistDeleteWatchlistParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WatchlistDeleteWatchlistResponse

    /** @see deleteWatchlist */
    fun deleteWatchlist(params: WatchlistDeleteWatchlistParams): WatchlistDeleteWatchlistResponse =
        deleteWatchlist(params, RequestOptions.none())

    /** @see deleteWatchlist */
    fun deleteWatchlist(
        watchlistId: String,
        requestOptions: RequestOptions,
    ): WatchlistDeleteWatchlistResponse =
        deleteWatchlist(watchlistId, WatchlistDeleteWatchlistParams.none(), requestOptions)

    /** Delete an instrument from a watchlist */
    fun deleteWatchlistItem(
        itemId: String,
        params: WatchlistDeleteWatchlistItemParams,
    ): WatchlistDeleteWatchlistItemResponse =
        deleteWatchlistItem(itemId, params, RequestOptions.none())

    /** @see deleteWatchlistItem */
    fun deleteWatchlistItem(
        itemId: String,
        params: WatchlistDeleteWatchlistItemParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WatchlistDeleteWatchlistItemResponse =
        deleteWatchlistItem(params.toBuilder().itemId(itemId).build(), requestOptions)

    /** @see deleteWatchlistItem */
    fun deleteWatchlistItem(
        params: WatchlistDeleteWatchlistItemParams
    ): WatchlistDeleteWatchlistItemResponse = deleteWatchlistItem(params, RequestOptions.none())

    /** @see deleteWatchlistItem */
    fun deleteWatchlistItem(
        params: WatchlistDeleteWatchlistItemParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WatchlistDeleteWatchlistItemResponse

    /** Get a watchlist by ID with all its items */
    fun getWatchlistById(watchlistId: String): WatchlistGetWatchlistByIdResponse =
        getWatchlistById(watchlistId, WatchlistGetWatchlistByIdParams.none())

    /** @see getWatchlistById */
    fun getWatchlistById(
        watchlistId: String,
        params: WatchlistGetWatchlistByIdParams = WatchlistGetWatchlistByIdParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WatchlistGetWatchlistByIdResponse =
        getWatchlistById(params.toBuilder().watchlistId(watchlistId).build(), requestOptions)

    /** @see getWatchlistById */
    fun getWatchlistById(
        watchlistId: String,
        params: WatchlistGetWatchlistByIdParams = WatchlistGetWatchlistByIdParams.none(),
    ): WatchlistGetWatchlistByIdResponse =
        getWatchlistById(watchlistId, params, RequestOptions.none())

    /** @see getWatchlistById */
    fun getWatchlistById(
        params: WatchlistGetWatchlistByIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WatchlistGetWatchlistByIdResponse

    /** @see getWatchlistById */
    fun getWatchlistById(
        params: WatchlistGetWatchlistByIdParams
    ): WatchlistGetWatchlistByIdResponse = getWatchlistById(params, RequestOptions.none())

    /** @see getWatchlistById */
    fun getWatchlistById(
        watchlistId: String,
        requestOptions: RequestOptions,
    ): WatchlistGetWatchlistByIdResponse =
        getWatchlistById(watchlistId, WatchlistGetWatchlistByIdParams.none(), requestOptions)

    /** List watchlists for the authenticated user */
    fun getWatchlists(): WatchlistGetWatchlistsResponse =
        getWatchlists(WatchlistGetWatchlistsParams.none())

    /** @see getWatchlists */
    fun getWatchlists(
        params: WatchlistGetWatchlistsParams = WatchlistGetWatchlistsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WatchlistGetWatchlistsResponse

    /** @see getWatchlists */
    fun getWatchlists(
        params: WatchlistGetWatchlistsParams = WatchlistGetWatchlistsParams.none()
    ): WatchlistGetWatchlistsResponse = getWatchlists(params, RequestOptions.none())

    /** @see getWatchlists */
    fun getWatchlists(requestOptions: RequestOptions): WatchlistGetWatchlistsResponse =
        getWatchlists(WatchlistGetWatchlistsParams.none(), requestOptions)

    /** A view of [WatchlistService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): WatchlistService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/watchlists/{watchlist_id}/items`, but is
         * otherwise the same as [WatchlistService.addWatchlistItem].
         */
        @MustBeClosed
        fun addWatchlistItem(
            watchlistId: String,
            params: WatchlistAddWatchlistItemParams,
        ): HttpResponseFor<WatchlistAddWatchlistItemResponse> =
            addWatchlistItem(watchlistId, params, RequestOptions.none())

        /** @see addWatchlistItem */
        @MustBeClosed
        fun addWatchlistItem(
            watchlistId: String,
            params: WatchlistAddWatchlistItemParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WatchlistAddWatchlistItemResponse> =
            addWatchlistItem(params.toBuilder().watchlistId(watchlistId).build(), requestOptions)

        /** @see addWatchlistItem */
        @MustBeClosed
        fun addWatchlistItem(
            params: WatchlistAddWatchlistItemParams
        ): HttpResponseFor<WatchlistAddWatchlistItemResponse> =
            addWatchlistItem(params, RequestOptions.none())

        /** @see addWatchlistItem */
        @MustBeClosed
        fun addWatchlistItem(
            params: WatchlistAddWatchlistItemParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WatchlistAddWatchlistItemResponse>

        /**
         * Returns a raw HTTP response for `post /v1/watchlists`, but is otherwise the same as
         * [WatchlistService.createWatchlist].
         */
        @MustBeClosed
        fun createWatchlist(
            params: WatchlistCreateWatchlistParams
        ): HttpResponseFor<WatchlistCreateWatchlistResponse> =
            createWatchlist(params, RequestOptions.none())

        /** @see createWatchlist */
        @MustBeClosed
        fun createWatchlist(
            params: WatchlistCreateWatchlistParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WatchlistCreateWatchlistResponse>

        /**
         * Returns a raw HTTP response for `delete /v1/watchlists/{watchlist_id}`, but is otherwise
         * the same as [WatchlistService.deleteWatchlist].
         */
        @MustBeClosed
        fun deleteWatchlist(
            watchlistId: String
        ): HttpResponseFor<WatchlistDeleteWatchlistResponse> =
            deleteWatchlist(watchlistId, WatchlistDeleteWatchlistParams.none())

        /** @see deleteWatchlist */
        @MustBeClosed
        fun deleteWatchlist(
            watchlistId: String,
            params: WatchlistDeleteWatchlistParams = WatchlistDeleteWatchlistParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WatchlistDeleteWatchlistResponse> =
            deleteWatchlist(params.toBuilder().watchlistId(watchlistId).build(), requestOptions)

        /** @see deleteWatchlist */
        @MustBeClosed
        fun deleteWatchlist(
            watchlistId: String,
            params: WatchlistDeleteWatchlistParams = WatchlistDeleteWatchlistParams.none(),
        ): HttpResponseFor<WatchlistDeleteWatchlistResponse> =
            deleteWatchlist(watchlistId, params, RequestOptions.none())

        /** @see deleteWatchlist */
        @MustBeClosed
        fun deleteWatchlist(
            params: WatchlistDeleteWatchlistParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WatchlistDeleteWatchlistResponse>

        /** @see deleteWatchlist */
        @MustBeClosed
        fun deleteWatchlist(
            params: WatchlistDeleteWatchlistParams
        ): HttpResponseFor<WatchlistDeleteWatchlistResponse> =
            deleteWatchlist(params, RequestOptions.none())

        /** @see deleteWatchlist */
        @MustBeClosed
        fun deleteWatchlist(
            watchlistId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<WatchlistDeleteWatchlistResponse> =
            deleteWatchlist(watchlistId, WatchlistDeleteWatchlistParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/watchlists/{watchlist_id}/items/{item_id}`,
         * but is otherwise the same as [WatchlistService.deleteWatchlistItem].
         */
        @MustBeClosed
        fun deleteWatchlistItem(
            itemId: String,
            params: WatchlistDeleteWatchlistItemParams,
        ): HttpResponseFor<WatchlistDeleteWatchlistItemResponse> =
            deleteWatchlistItem(itemId, params, RequestOptions.none())

        /** @see deleteWatchlistItem */
        @MustBeClosed
        fun deleteWatchlistItem(
            itemId: String,
            params: WatchlistDeleteWatchlistItemParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WatchlistDeleteWatchlistItemResponse> =
            deleteWatchlistItem(params.toBuilder().itemId(itemId).build(), requestOptions)

        /** @see deleteWatchlistItem */
        @MustBeClosed
        fun deleteWatchlistItem(
            params: WatchlistDeleteWatchlistItemParams
        ): HttpResponseFor<WatchlistDeleteWatchlistItemResponse> =
            deleteWatchlistItem(params, RequestOptions.none())

        /** @see deleteWatchlistItem */
        @MustBeClosed
        fun deleteWatchlistItem(
            params: WatchlistDeleteWatchlistItemParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WatchlistDeleteWatchlistItemResponse>

        /**
         * Returns a raw HTTP response for `get /v1/watchlists/{watchlist_id}`, but is otherwise the
         * same as [WatchlistService.getWatchlistById].
         */
        @MustBeClosed
        fun getWatchlistById(
            watchlistId: String
        ): HttpResponseFor<WatchlistGetWatchlistByIdResponse> =
            getWatchlistById(watchlistId, WatchlistGetWatchlistByIdParams.none())

        /** @see getWatchlistById */
        @MustBeClosed
        fun getWatchlistById(
            watchlistId: String,
            params: WatchlistGetWatchlistByIdParams = WatchlistGetWatchlistByIdParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WatchlistGetWatchlistByIdResponse> =
            getWatchlistById(params.toBuilder().watchlistId(watchlistId).build(), requestOptions)

        /** @see getWatchlistById */
        @MustBeClosed
        fun getWatchlistById(
            watchlistId: String,
            params: WatchlistGetWatchlistByIdParams = WatchlistGetWatchlistByIdParams.none(),
        ): HttpResponseFor<WatchlistGetWatchlistByIdResponse> =
            getWatchlistById(watchlistId, params, RequestOptions.none())

        /** @see getWatchlistById */
        @MustBeClosed
        fun getWatchlistById(
            params: WatchlistGetWatchlistByIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WatchlistGetWatchlistByIdResponse>

        /** @see getWatchlistById */
        @MustBeClosed
        fun getWatchlistById(
            params: WatchlistGetWatchlistByIdParams
        ): HttpResponseFor<WatchlistGetWatchlistByIdResponse> =
            getWatchlistById(params, RequestOptions.none())

        /** @see getWatchlistById */
        @MustBeClosed
        fun getWatchlistById(
            watchlistId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<WatchlistGetWatchlistByIdResponse> =
            getWatchlistById(watchlistId, WatchlistGetWatchlistByIdParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/watchlists`, but is otherwise the same as
         * [WatchlistService.getWatchlists].
         */
        @MustBeClosed
        fun getWatchlists(): HttpResponseFor<WatchlistGetWatchlistsResponse> =
            getWatchlists(WatchlistGetWatchlistsParams.none())

        /** @see getWatchlists */
        @MustBeClosed
        fun getWatchlists(
            params: WatchlistGetWatchlistsParams = WatchlistGetWatchlistsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WatchlistGetWatchlistsResponse>

        /** @see getWatchlists */
        @MustBeClosed
        fun getWatchlists(
            params: WatchlistGetWatchlistsParams = WatchlistGetWatchlistsParams.none()
        ): HttpResponseFor<WatchlistGetWatchlistsResponse> =
            getWatchlists(params, RequestOptions.none())

        /** @see getWatchlists */
        @MustBeClosed
        fun getWatchlists(
            requestOptions: RequestOptions
        ): HttpResponseFor<WatchlistGetWatchlistsResponse> =
            getWatchlists(WatchlistGetWatchlistsParams.none(), requestOptions)
    }
}
