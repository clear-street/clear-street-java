// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.v1.watchlists

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.core.RequestOptions
import com.clear_street.api.core.http.HttpResponseFor
import com.clear_street.api.models.v1.watchlists.items.ItemAddWatchlistItemParams
import com.clear_street.api.models.v1.watchlists.items.ItemAddWatchlistItemResponse
import com.clear_street.api.models.v1.watchlists.items.ItemDeleteWatchlistItemParams
import com.clear_street.api.models.v1.watchlists.items.ItemDeleteWatchlistItemResponse
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

/** Create and manage watchlists. */
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
    fun addWatchlistItem(
        watchlistId: String,
        params: ItemAddWatchlistItemParams,
    ): ItemAddWatchlistItemResponse = addWatchlistItem(watchlistId, params, RequestOptions.none())

    /** @see addWatchlistItem */
    fun addWatchlistItem(
        watchlistId: String,
        params: ItemAddWatchlistItemParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ItemAddWatchlistItemResponse =
        addWatchlistItem(params.toBuilder().watchlistId(watchlistId).build(), requestOptions)

    /** @see addWatchlistItem */
    fun addWatchlistItem(params: ItemAddWatchlistItemParams): ItemAddWatchlistItemResponse =
        addWatchlistItem(params, RequestOptions.none())

    /** @see addWatchlistItem */
    fun addWatchlistItem(
        params: ItemAddWatchlistItemParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ItemAddWatchlistItemResponse

    /** Delete an instrument from a watchlist */
    fun deleteWatchlistItem(
        itemId: String,
        params: ItemDeleteWatchlistItemParams,
    ): ItemDeleteWatchlistItemResponse = deleteWatchlistItem(itemId, params, RequestOptions.none())

    /** @see deleteWatchlistItem */
    fun deleteWatchlistItem(
        itemId: String,
        params: ItemDeleteWatchlistItemParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ItemDeleteWatchlistItemResponse =
        deleteWatchlistItem(params.toBuilder().itemId(itemId).build(), requestOptions)

    /** @see deleteWatchlistItem */
    fun deleteWatchlistItem(
        params: ItemDeleteWatchlistItemParams
    ): ItemDeleteWatchlistItemResponse = deleteWatchlistItem(params, RequestOptions.none())

    /** @see deleteWatchlistItem */
    fun deleteWatchlistItem(
        params: ItemDeleteWatchlistItemParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ItemDeleteWatchlistItemResponse

    /** A view of [ItemService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ItemService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/watchlists/{watchlist_id}/items`, but is
         * otherwise the same as [ItemService.addWatchlistItem].
         */
        @MustBeClosed
        fun addWatchlistItem(
            watchlistId: String,
            params: ItemAddWatchlistItemParams,
        ): HttpResponseFor<ItemAddWatchlistItemResponse> =
            addWatchlistItem(watchlistId, params, RequestOptions.none())

        /** @see addWatchlistItem */
        @MustBeClosed
        fun addWatchlistItem(
            watchlistId: String,
            params: ItemAddWatchlistItemParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ItemAddWatchlistItemResponse> =
            addWatchlistItem(params.toBuilder().watchlistId(watchlistId).build(), requestOptions)

        /** @see addWatchlistItem */
        @MustBeClosed
        fun addWatchlistItem(
            params: ItemAddWatchlistItemParams
        ): HttpResponseFor<ItemAddWatchlistItemResponse> =
            addWatchlistItem(params, RequestOptions.none())

        /** @see addWatchlistItem */
        @MustBeClosed
        fun addWatchlistItem(
            params: ItemAddWatchlistItemParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ItemAddWatchlistItemResponse>

        /**
         * Returns a raw HTTP response for `delete /v1/watchlists/{watchlist_id}/items/{item_id}`,
         * but is otherwise the same as [ItemService.deleteWatchlistItem].
         */
        @MustBeClosed
        fun deleteWatchlistItem(
            itemId: String,
            params: ItemDeleteWatchlistItemParams,
        ): HttpResponseFor<ItemDeleteWatchlistItemResponse> =
            deleteWatchlistItem(itemId, params, RequestOptions.none())

        /** @see deleteWatchlistItem */
        @MustBeClosed
        fun deleteWatchlistItem(
            itemId: String,
            params: ItemDeleteWatchlistItemParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ItemDeleteWatchlistItemResponse> =
            deleteWatchlistItem(params.toBuilder().itemId(itemId).build(), requestOptions)

        /** @see deleteWatchlistItem */
        @MustBeClosed
        fun deleteWatchlistItem(
            params: ItemDeleteWatchlistItemParams
        ): HttpResponseFor<ItemDeleteWatchlistItemResponse> =
            deleteWatchlistItem(params, RequestOptions.none())

        /** @see deleteWatchlistItem */
        @MustBeClosed
        fun deleteWatchlistItem(
            params: ItemDeleteWatchlistItemParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ItemDeleteWatchlistItemResponse>
    }
}
