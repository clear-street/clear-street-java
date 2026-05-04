// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.v1.accounts

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.core.RequestOptions
import com.clear_street.api.core.http.HttpResponseFor
import com.clear_street.api.models.v1.accounts.portfoliohistory.PortfolioHistoryGetPortfolioHistoryParams
import com.clear_street.api.models.v1.accounts.portfoliohistory.PortfolioHistoryGetPortfolioHistoryResponse
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

/** Manage trading accounts, balances, and portfolio history. */
interface PortfolioHistoryService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PortfolioHistoryService

    /** Retrieves daily portfolio history for the specified account. */
    fun getPortfolioHistory(
        accountId: Long,
        params: PortfolioHistoryGetPortfolioHistoryParams,
    ): PortfolioHistoryGetPortfolioHistoryResponse =
        getPortfolioHistory(accountId, params, RequestOptions.none())

    /** @see getPortfolioHistory */
    fun getPortfolioHistory(
        accountId: Long,
        params: PortfolioHistoryGetPortfolioHistoryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PortfolioHistoryGetPortfolioHistoryResponse =
        getPortfolioHistory(params.toBuilder().accountId(accountId).build(), requestOptions)

    /** @see getPortfolioHistory */
    fun getPortfolioHistory(
        params: PortfolioHistoryGetPortfolioHistoryParams
    ): PortfolioHistoryGetPortfolioHistoryResponse =
        getPortfolioHistory(params, RequestOptions.none())

    /** @see getPortfolioHistory */
    fun getPortfolioHistory(
        params: PortfolioHistoryGetPortfolioHistoryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PortfolioHistoryGetPortfolioHistoryResponse

    /**
     * A view of [PortfolioHistoryService] that provides access to raw HTTP responses for each
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
        ): PortfolioHistoryService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/accounts/{account_id}/portfolio-history`, but is
         * otherwise the same as [PortfolioHistoryService.getPortfolioHistory].
         */
        @MustBeClosed
        fun getPortfolioHistory(
            accountId: Long,
            params: PortfolioHistoryGetPortfolioHistoryParams,
        ): HttpResponseFor<PortfolioHistoryGetPortfolioHistoryResponse> =
            getPortfolioHistory(accountId, params, RequestOptions.none())

        /** @see getPortfolioHistory */
        @MustBeClosed
        fun getPortfolioHistory(
            accountId: Long,
            params: PortfolioHistoryGetPortfolioHistoryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PortfolioHistoryGetPortfolioHistoryResponse> =
            getPortfolioHistory(params.toBuilder().accountId(accountId).build(), requestOptions)

        /** @see getPortfolioHistory */
        @MustBeClosed
        fun getPortfolioHistory(
            params: PortfolioHistoryGetPortfolioHistoryParams
        ): HttpResponseFor<PortfolioHistoryGetPortfolioHistoryResponse> =
            getPortfolioHistory(params, RequestOptions.none())

        /** @see getPortfolioHistory */
        @MustBeClosed
        fun getPortfolioHistory(
            params: PortfolioHistoryGetPortfolioHistoryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PortfolioHistoryGetPortfolioHistoryResponse>
    }
}
