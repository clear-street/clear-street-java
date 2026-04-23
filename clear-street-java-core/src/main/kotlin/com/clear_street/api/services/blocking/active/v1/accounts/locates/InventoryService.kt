// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.active.v1.accounts.locates

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.core.RequestOptions
import com.clear_street.api.core.http.HttpResponseFor
import com.clear_street.api.models.active.v1.accounts.locates.inventory.InventoryGetLocateInventoryParams
import com.clear_street.api.models.active.v1.accounts.locates.inventory.InventoryGetLocateInventoryResponse
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

/** Manage locate requests for short selling. */
interface InventoryService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): InventoryService

    /** Retrieves available inventory for short stock locates. */
    fun getLocateInventory(
        accountId: Long,
        params: InventoryGetLocateInventoryParams,
    ): InventoryGetLocateInventoryResponse =
        getLocateInventory(accountId, params, RequestOptions.none())

    /** @see getLocateInventory */
    fun getLocateInventory(
        accountId: Long,
        params: InventoryGetLocateInventoryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InventoryGetLocateInventoryResponse =
        getLocateInventory(params.toBuilder().accountId(accountId).build(), requestOptions)

    /** @see getLocateInventory */
    fun getLocateInventory(
        params: InventoryGetLocateInventoryParams
    ): InventoryGetLocateInventoryResponse = getLocateInventory(params, RequestOptions.none())

    /** @see getLocateInventory */
    fun getLocateInventory(
        params: InventoryGetLocateInventoryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InventoryGetLocateInventoryResponse

    /** A view of [InventoryService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): InventoryService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /active/v1/accounts/{account_id}/locates/inventory`,
         * but is otherwise the same as [InventoryService.getLocateInventory].
         */
        @MustBeClosed
        fun getLocateInventory(
            accountId: Long,
            params: InventoryGetLocateInventoryParams,
        ): HttpResponseFor<InventoryGetLocateInventoryResponse> =
            getLocateInventory(accountId, params, RequestOptions.none())

        /** @see getLocateInventory */
        @MustBeClosed
        fun getLocateInventory(
            accountId: Long,
            params: InventoryGetLocateInventoryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InventoryGetLocateInventoryResponse> =
            getLocateInventory(params.toBuilder().accountId(accountId).build(), requestOptions)

        /** @see getLocateInventory */
        @MustBeClosed
        fun getLocateInventory(
            params: InventoryGetLocateInventoryParams
        ): HttpResponseFor<InventoryGetLocateInventoryResponse> =
            getLocateInventory(params, RequestOptions.none())

        /** @see getLocateInventory */
        @MustBeClosed
        fun getLocateInventory(
            params: InventoryGetLocateInventoryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InventoryGetLocateInventoryResponse>
    }
}
