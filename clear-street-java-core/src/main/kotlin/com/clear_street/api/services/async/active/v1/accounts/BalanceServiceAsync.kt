// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.active.v1.accounts

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.core.RequestOptions
import com.clear_street.api.core.http.HttpResponseFor
import com.clear_street.api.models.active.v1.accounts.balances.BalanceGetAccountBalancesParams
import com.clear_street.api.models.active.v1.accounts.balances.BalanceGetAccountBalancesResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Manage trading accounts, balances, and portfolio history. */
interface BalanceServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BalanceServiceAsync

    /** Fetch account balance information */
    fun getAccountBalances(accountId: Long): CompletableFuture<BalanceGetAccountBalancesResponse> =
        getAccountBalances(accountId, BalanceGetAccountBalancesParams.none())

    /** @see getAccountBalances */
    fun getAccountBalances(
        accountId: Long,
        params: BalanceGetAccountBalancesParams = BalanceGetAccountBalancesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BalanceGetAccountBalancesResponse> =
        getAccountBalances(params.toBuilder().accountId(accountId).build(), requestOptions)

    /** @see getAccountBalances */
    fun getAccountBalances(
        accountId: Long,
        params: BalanceGetAccountBalancesParams = BalanceGetAccountBalancesParams.none(),
    ): CompletableFuture<BalanceGetAccountBalancesResponse> =
        getAccountBalances(accountId, params, RequestOptions.none())

    /** @see getAccountBalances */
    fun getAccountBalances(
        params: BalanceGetAccountBalancesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BalanceGetAccountBalancesResponse>

    /** @see getAccountBalances */
    fun getAccountBalances(
        params: BalanceGetAccountBalancesParams
    ): CompletableFuture<BalanceGetAccountBalancesResponse> =
        getAccountBalances(params, RequestOptions.none())

    /** @see getAccountBalances */
    fun getAccountBalances(
        accountId: Long,
        requestOptions: RequestOptions,
    ): CompletableFuture<BalanceGetAccountBalancesResponse> =
        getAccountBalances(accountId, BalanceGetAccountBalancesParams.none(), requestOptions)

    /**
     * A view of [BalanceServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BalanceServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /active/v1/accounts/{account_id}/balances`, but is
         * otherwise the same as [BalanceServiceAsync.getAccountBalances].
         */
        fun getAccountBalances(
            accountId: Long
        ): CompletableFuture<HttpResponseFor<BalanceGetAccountBalancesResponse>> =
            getAccountBalances(accountId, BalanceGetAccountBalancesParams.none())

        /** @see getAccountBalances */
        fun getAccountBalances(
            accountId: Long,
            params: BalanceGetAccountBalancesParams = BalanceGetAccountBalancesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BalanceGetAccountBalancesResponse>> =
            getAccountBalances(params.toBuilder().accountId(accountId).build(), requestOptions)

        /** @see getAccountBalances */
        fun getAccountBalances(
            accountId: Long,
            params: BalanceGetAccountBalancesParams = BalanceGetAccountBalancesParams.none(),
        ): CompletableFuture<HttpResponseFor<BalanceGetAccountBalancesResponse>> =
            getAccountBalances(accountId, params, RequestOptions.none())

        /** @see getAccountBalances */
        fun getAccountBalances(
            params: BalanceGetAccountBalancesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BalanceGetAccountBalancesResponse>>

        /** @see getAccountBalances */
        fun getAccountBalances(
            params: BalanceGetAccountBalancesParams
        ): CompletableFuture<HttpResponseFor<BalanceGetAccountBalancesResponse>> =
            getAccountBalances(params, RequestOptions.none())

        /** @see getAccountBalances */
        fun getAccountBalances(
            accountId: Long,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BalanceGetAccountBalancesResponse>> =
            getAccountBalances(accountId, BalanceGetAccountBalancesParams.none(), requestOptions)
    }
}
