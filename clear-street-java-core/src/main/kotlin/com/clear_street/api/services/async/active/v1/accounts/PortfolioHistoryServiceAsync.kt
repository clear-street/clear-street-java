// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.active.v1.accounts

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.core.RequestOptions
import com.clear_street.api.core.http.HttpResponseFor
import com.clear_street.api.models.active.v1.accounts.portfoliohistory.PortfolioHistoryGetPortfolioHistoryParams
import com.clear_street.api.models.active.v1.accounts.portfoliohistory.PortfolioHistoryGetPortfolioHistoryResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Manage trading accounts and view balances. */
interface PortfolioHistoryServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PortfolioHistoryServiceAsync

    /** Retrieves daily portfolio history for the specified account. */
    fun getPortfolioHistory(
        accountId: Long,
        params: PortfolioHistoryGetPortfolioHistoryParams,
    ): CompletableFuture<PortfolioHistoryGetPortfolioHistoryResponse> =
        getPortfolioHistory(accountId, params, RequestOptions.none())

    /** @see getPortfolioHistory */
    fun getPortfolioHistory(
        accountId: Long,
        params: PortfolioHistoryGetPortfolioHistoryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PortfolioHistoryGetPortfolioHistoryResponse> =
        getPortfolioHistory(params.toBuilder().accountId(accountId).build(), requestOptions)

    /** @see getPortfolioHistory */
    fun getPortfolioHistory(
        params: PortfolioHistoryGetPortfolioHistoryParams
    ): CompletableFuture<PortfolioHistoryGetPortfolioHistoryResponse> =
        getPortfolioHistory(params, RequestOptions.none())

    /** @see getPortfolioHistory */
    fun getPortfolioHistory(
        params: PortfolioHistoryGetPortfolioHistoryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PortfolioHistoryGetPortfolioHistoryResponse>

    /**
     * A view of [PortfolioHistoryServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PortfolioHistoryServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /active/v1/accounts/{account_id}/portfolio-history`,
         * but is otherwise the same as [PortfolioHistoryServiceAsync.getPortfolioHistory].
         */
        fun getPortfolioHistory(
            accountId: Long,
            params: PortfolioHistoryGetPortfolioHistoryParams,
        ): CompletableFuture<HttpResponseFor<PortfolioHistoryGetPortfolioHistoryResponse>> =
            getPortfolioHistory(accountId, params, RequestOptions.none())

        /** @see getPortfolioHistory */
        fun getPortfolioHistory(
            accountId: Long,
            params: PortfolioHistoryGetPortfolioHistoryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PortfolioHistoryGetPortfolioHistoryResponse>> =
            getPortfolioHistory(params.toBuilder().accountId(accountId).build(), requestOptions)

        /** @see getPortfolioHistory */
        fun getPortfolioHistory(
            params: PortfolioHistoryGetPortfolioHistoryParams
        ): CompletableFuture<HttpResponseFor<PortfolioHistoryGetPortfolioHistoryResponse>> =
            getPortfolioHistory(params, RequestOptions.none())

        /** @see getPortfolioHistory */
        fun getPortfolioHistory(
            params: PortfolioHistoryGetPortfolioHistoryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PortfolioHistoryGetPortfolioHistoryResponse>>
    }
}
