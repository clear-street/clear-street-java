// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.active.v1.watchlists

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.core.RequestOptions
import com.clear_street.api.core.http.HttpResponse
import com.clear_street.api.core.http.HttpResponseFor
import com.clear_street.api.models.active.v1.watchlists.items.ItemAddWatchlistItemParams
import com.clear_street.api.models.active.v1.watchlists.items.ItemAddWatchlistItemResponse
import com.clear_street.api.models.active.v1.watchlists.items.ItemDeleteWatchlistItemParams
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

/** Retrieve details and lists of tradable instruments. */
interface ItemService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ItemService

    /** Add an instrument to a watchlist */
    fun addWatchlistItem(watchlistId: String): ItemAddWatchlistItemResponse =
        addWatchlistItem(watchlistId, ItemAddWatchlistItemParams.none())

    /** @see addWatchlistItem */
    fun addWatchlistItem(
        watchlistId: String,
        params: ItemAddWatchlistItemParams = ItemAddWatchlistItemParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ItemAddWatchlistItemResponse =
        addWatchlistItem(params.toBuilder().watchlistId(watchlistId).build(), requestOptions)

    /** @see addWatchlistItem */
    fun addWatchlistItem(
        watchlistId: String,
        params: ItemAddWatchlistItemParams = ItemAddWatchlistItemParams.none(),
    ): ItemAddWatchlistItemResponse = addWatchlistItem(watchlistId, params, RequestOptions.none())

    /** @see addWatchlistItem */
    fun addWatchlistItem(
        params: ItemAddWatchlistItemParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ItemAddWatchlistItemResponse

    /** @see addWatchlistItem */
    fun addWatchlistItem(params: ItemAddWatchlistItemParams): ItemAddWatchlistItemResponse =
        addWatchlistItem(params, RequestOptions.none())

    /** @see addWatchlistItem */
    fun addWatchlistItem(
        watchlistId: String,
        requestOptions: RequestOptions,
    ): ItemAddWatchlistItemResponse =
        addWatchlistItem(watchlistId, ItemAddWatchlistItemParams.none(), requestOptions)

    /** Delete an instrument from a watchlist */
    fun deleteWatchlistItem(itemId: String, params: ItemDeleteWatchlistItemParams) =
        deleteWatchlistItem(itemId, params, RequestOptions.none())

    /** @see deleteWatchlistItem */
    fun deleteWatchlistItem(
        itemId: String,
        params: ItemDeleteWatchlistItemParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = deleteWatchlistItem(params.toBuilder().itemId(itemId).build(), requestOptions)

    /** @see deleteWatchlistItem */
    fun deleteWatchlistItem(params: ItemDeleteWatchlistItemParams) =
        deleteWatchlistItem(params, RequestOptions.none())

    /** @see deleteWatchlistItem */
    fun deleteWatchlistItem(
        params: ItemDeleteWatchlistItemParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** A view of [ItemService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ItemService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /active/v1/watchlists/{watchlist_id}/items`, but is
         * otherwise the same as [ItemService.addWatchlistItem].
         */
        @MustBeClosed
        fun addWatchlistItem(watchlistId: String): HttpResponseFor<ItemAddWatchlistItemResponse> =
            addWatchlistItem(watchlistId, ItemAddWatchlistItemParams.none())

        /** @see addWatchlistItem */
        @MustBeClosed
        fun addWatchlistItem(
            watchlistId: String,
            params: ItemAddWatchlistItemParams = ItemAddWatchlistItemParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ItemAddWatchlistItemResponse> =
            addWatchlistItem(params.toBuilder().watchlistId(watchlistId).build(), requestOptions)

        /** @see addWatchlistItem */
        @MustBeClosed
        fun addWatchlistItem(
            watchlistId: String,
            params: ItemAddWatchlistItemParams = ItemAddWatchlistItemParams.none(),
        ): HttpResponseFor<ItemAddWatchlistItemResponse> =
            addWatchlistItem(watchlistId, params, RequestOptions.none())

        /** @see addWatchlistItem */
        @MustBeClosed
        fun addWatchlistItem(
            params: ItemAddWatchlistItemParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ItemAddWatchlistItemResponse>

        /** @see addWatchlistItem */
        @MustBeClosed
        fun addWatchlistItem(
            params: ItemAddWatchlistItemParams
        ): HttpResponseFor<ItemAddWatchlistItemResponse> =
            addWatchlistItem(params, RequestOptions.none())

        /** @see addWatchlistItem */
        @MustBeClosed
        fun addWatchlistItem(
            watchlistId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ItemAddWatchlistItemResponse> =
            addWatchlistItem(watchlistId, ItemAddWatchlistItemParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /active/v1/watchlists/{watchlist_id}/items/{item_id}`, but is otherwise the same as
         * [ItemService.deleteWatchlistItem].
         */
        @MustBeClosed
        fun deleteWatchlistItem(
            itemId: String,
            params: ItemDeleteWatchlistItemParams,
        ): HttpResponse = deleteWatchlistItem(itemId, params, RequestOptions.none())

        /** @see deleteWatchlistItem */
        @MustBeClosed
        fun deleteWatchlistItem(
            itemId: String,
            params: ItemDeleteWatchlistItemParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            deleteWatchlistItem(params.toBuilder().itemId(itemId).build(), requestOptions)

        /** @see deleteWatchlistItem */
        @MustBeClosed
        fun deleteWatchlistItem(params: ItemDeleteWatchlistItemParams): HttpResponse =
            deleteWatchlistItem(params, RequestOptions.none())

        /** @see deleteWatchlistItem */
        @MustBeClosed
        fun deleteWatchlistItem(
            params: ItemDeleteWatchlistItemParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
