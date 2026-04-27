// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.active.v1.watchlists

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.core.RequestOptions
import com.clear_street.api.core.http.HttpResponseFor
import com.clear_street.api.models.active.v1.watchlists.items.ItemAddWatchlistItemParams
import com.clear_street.api.models.active.v1.watchlists.items.ItemAddWatchlistItemResponse
import com.clear_street.api.models.active.v1.watchlists.items.ItemDeleteWatchlistItemParams
import com.clear_street.api.models.active.v1.watchlists.items.ItemDeleteWatchlistItemResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Create and manage watchlists. */
interface ItemServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ItemServiceAsync

    /** Add an instrument to a watchlist */
    fun addWatchlistItem(watchlistId: String): CompletableFuture<ItemAddWatchlistItemResponse> =
        addWatchlistItem(watchlistId, ItemAddWatchlistItemParams.none())

    /** @see addWatchlistItem */
    fun addWatchlistItem(
        watchlistId: String,
        params: ItemAddWatchlistItemParams = ItemAddWatchlistItemParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ItemAddWatchlistItemResponse> =
        addWatchlistItem(params.toBuilder().watchlistId(watchlistId).build(), requestOptions)

    /** @see addWatchlistItem */
    fun addWatchlistItem(
        watchlistId: String,
        params: ItemAddWatchlistItemParams = ItemAddWatchlistItemParams.none(),
    ): CompletableFuture<ItemAddWatchlistItemResponse> =
        addWatchlistItem(watchlistId, params, RequestOptions.none())

    /** @see addWatchlistItem */
    fun addWatchlistItem(
        params: ItemAddWatchlistItemParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ItemAddWatchlistItemResponse>

    /** @see addWatchlistItem */
    fun addWatchlistItem(
        params: ItemAddWatchlistItemParams
    ): CompletableFuture<ItemAddWatchlistItemResponse> =
        addWatchlistItem(params, RequestOptions.none())

    /** @see addWatchlistItem */
    fun addWatchlistItem(
        watchlistId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ItemAddWatchlistItemResponse> =
        addWatchlistItem(watchlistId, ItemAddWatchlistItemParams.none(), requestOptions)

    /** Delete an instrument from a watchlist */
    fun deleteWatchlistItem(
        itemId: String,
        params: ItemDeleteWatchlistItemParams,
    ): CompletableFuture<ItemDeleteWatchlistItemResponse> =
        deleteWatchlistItem(itemId, params, RequestOptions.none())

    /** @see deleteWatchlistItem */
    fun deleteWatchlistItem(
        itemId: String,
        params: ItemDeleteWatchlistItemParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ItemDeleteWatchlistItemResponse> =
        deleteWatchlistItem(params.toBuilder().itemId(itemId).build(), requestOptions)

    /** @see deleteWatchlistItem */
    fun deleteWatchlistItem(
        params: ItemDeleteWatchlistItemParams
    ): CompletableFuture<ItemDeleteWatchlistItemResponse> =
        deleteWatchlistItem(params, RequestOptions.none())

    /** @see deleteWatchlistItem */
    fun deleteWatchlistItem(
        params: ItemDeleteWatchlistItemParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ItemDeleteWatchlistItemResponse>

    /** A view of [ItemServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ItemServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /active/v1/watchlists/{watchlist_id}/items`, but is
         * otherwise the same as [ItemServiceAsync.addWatchlistItem].
         */
        fun addWatchlistItem(
            watchlistId: String
        ): CompletableFuture<HttpResponseFor<ItemAddWatchlistItemResponse>> =
            addWatchlistItem(watchlistId, ItemAddWatchlistItemParams.none())

        /** @see addWatchlistItem */
        fun addWatchlistItem(
            watchlistId: String,
            params: ItemAddWatchlistItemParams = ItemAddWatchlistItemParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ItemAddWatchlistItemResponse>> =
            addWatchlistItem(params.toBuilder().watchlistId(watchlistId).build(), requestOptions)

        /** @see addWatchlistItem */
        fun addWatchlistItem(
            watchlistId: String,
            params: ItemAddWatchlistItemParams = ItemAddWatchlistItemParams.none(),
        ): CompletableFuture<HttpResponseFor<ItemAddWatchlistItemResponse>> =
            addWatchlistItem(watchlistId, params, RequestOptions.none())

        /** @see addWatchlistItem */
        fun addWatchlistItem(
            params: ItemAddWatchlistItemParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ItemAddWatchlistItemResponse>>

        /** @see addWatchlistItem */
        fun addWatchlistItem(
            params: ItemAddWatchlistItemParams
        ): CompletableFuture<HttpResponseFor<ItemAddWatchlistItemResponse>> =
            addWatchlistItem(params, RequestOptions.none())

        /** @see addWatchlistItem */
        fun addWatchlistItem(
            watchlistId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ItemAddWatchlistItemResponse>> =
            addWatchlistItem(watchlistId, ItemAddWatchlistItemParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /active/v1/watchlists/{watchlist_id}/items/{item_id}`, but is otherwise the same as
         * [ItemServiceAsync.deleteWatchlistItem].
         */
        fun deleteWatchlistItem(
            itemId: String,
            params: ItemDeleteWatchlistItemParams,
        ): CompletableFuture<HttpResponseFor<ItemDeleteWatchlistItemResponse>> =
            deleteWatchlistItem(itemId, params, RequestOptions.none())

        /** @see deleteWatchlistItem */
        fun deleteWatchlistItem(
            itemId: String,
            params: ItemDeleteWatchlistItemParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ItemDeleteWatchlistItemResponse>> =
            deleteWatchlistItem(params.toBuilder().itemId(itemId).build(), requestOptions)

        /** @see deleteWatchlistItem */
        fun deleteWatchlistItem(
            params: ItemDeleteWatchlistItemParams
        ): CompletableFuture<HttpResponseFor<ItemDeleteWatchlistItemResponse>> =
            deleteWatchlistItem(params, RequestOptions.none())

        /** @see deleteWatchlistItem */
        fun deleteWatchlistItem(
            params: ItemDeleteWatchlistItemParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ItemDeleteWatchlistItemResponse>>
    }
}
