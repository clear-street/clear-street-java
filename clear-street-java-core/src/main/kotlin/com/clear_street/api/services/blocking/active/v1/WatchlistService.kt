// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.active.v1

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
import com.clear_street.api.services.blocking.active.v1.watchlists.ItemService
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

/** Retrieve details and lists of tradable instruments. */
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

    /** Retrieve details and lists of tradable instruments. */
    fun items(): ItemService

    /** Create a new watchlist */
    fun createWatchlist(params: WatchlistCreateWatchlistParams): WatchlistCreateWatchlistResponse =
        createWatchlist(params, RequestOptions.none())

    /** @see createWatchlist */
    fun createWatchlist(
        params: WatchlistCreateWatchlistParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WatchlistCreateWatchlistResponse

    /** Delete a watchlist and all its items */
    fun deleteWatchlist(watchlistId: String) =
        deleteWatchlist(watchlistId, WatchlistDeleteWatchlistParams.none())

    /** @see deleteWatchlist */
    fun deleteWatchlist(
        watchlistId: String,
        params: WatchlistDeleteWatchlistParams = WatchlistDeleteWatchlistParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = deleteWatchlist(params.toBuilder().watchlistId(watchlistId).build(), requestOptions)

    /** @see deleteWatchlist */
    fun deleteWatchlist(
        watchlistId: String,
        params: WatchlistDeleteWatchlistParams = WatchlistDeleteWatchlistParams.none(),
    ) = deleteWatchlist(watchlistId, params, RequestOptions.none())

    /** @see deleteWatchlist */
    fun deleteWatchlist(
        params: WatchlistDeleteWatchlistParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see deleteWatchlist */
    fun deleteWatchlist(params: WatchlistDeleteWatchlistParams) =
        deleteWatchlist(params, RequestOptions.none())

    /** @see deleteWatchlist */
    fun deleteWatchlist(watchlistId: String, requestOptions: RequestOptions) =
        deleteWatchlist(watchlistId, WatchlistDeleteWatchlistParams.none(), requestOptions)

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

        /** Retrieve details and lists of tradable instruments. */
        fun items(): ItemService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /active/v1/watchlists`, but is otherwise the same
         * as [WatchlistService.createWatchlist].
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
         * Returns a raw HTTP response for `delete /active/v1/watchlists/{watchlist_id}`, but is
         * otherwise the same as [WatchlistService.deleteWatchlist].
         */
        @MustBeClosed
        fun deleteWatchlist(watchlistId: String): HttpResponse =
            deleteWatchlist(watchlistId, WatchlistDeleteWatchlistParams.none())

        /** @see deleteWatchlist */
        @MustBeClosed
        fun deleteWatchlist(
            watchlistId: String,
            params: WatchlistDeleteWatchlistParams = WatchlistDeleteWatchlistParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            deleteWatchlist(params.toBuilder().watchlistId(watchlistId).build(), requestOptions)

        /** @see deleteWatchlist */
        @MustBeClosed
        fun deleteWatchlist(
            watchlistId: String,
            params: WatchlistDeleteWatchlistParams = WatchlistDeleteWatchlistParams.none(),
        ): HttpResponse = deleteWatchlist(watchlistId, params, RequestOptions.none())

        /** @see deleteWatchlist */
        @MustBeClosed
        fun deleteWatchlist(
            params: WatchlistDeleteWatchlistParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see deleteWatchlist */
        @MustBeClosed
        fun deleteWatchlist(params: WatchlistDeleteWatchlistParams): HttpResponse =
            deleteWatchlist(params, RequestOptions.none())

        /** @see deleteWatchlist */
        @MustBeClosed
        fun deleteWatchlist(watchlistId: String, requestOptions: RequestOptions): HttpResponse =
            deleteWatchlist(watchlistId, WatchlistDeleteWatchlistParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /active/v1/watchlists/{watchlist_id}`, but is
         * otherwise the same as [WatchlistService.getWatchlistById].
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
         * Returns a raw HTTP response for `get /active/v1/watchlists`, but is otherwise the same as
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
