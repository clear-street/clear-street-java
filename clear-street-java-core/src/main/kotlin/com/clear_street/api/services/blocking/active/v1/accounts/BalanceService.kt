// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.active.v1.accounts

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.core.RequestOptions
import com.clear_street.api.core.http.HttpResponseFor
import com.clear_street.api.models.active.v1.accounts.balances.BalanceGetAccountBalancesParams
import com.clear_street.api.models.active.v1.accounts.balances.BalanceGetAccountBalancesResponse
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

/** Manage trading accounts, balances, and portfolio history. */
interface BalanceService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BalanceService

    /** Fetch account balance information */
    fun getAccountBalances(accountId: Long): BalanceGetAccountBalancesResponse =
        getAccountBalances(accountId, BalanceGetAccountBalancesParams.none())

    /** @see getAccountBalances */
    fun getAccountBalances(
        accountId: Long,
        params: BalanceGetAccountBalancesParams = BalanceGetAccountBalancesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BalanceGetAccountBalancesResponse =
        getAccountBalances(params.toBuilder().accountId(accountId).build(), requestOptions)

    /** @see getAccountBalances */
    fun getAccountBalances(
        accountId: Long,
        params: BalanceGetAccountBalancesParams = BalanceGetAccountBalancesParams.none(),
    ): BalanceGetAccountBalancesResponse =
        getAccountBalances(accountId, params, RequestOptions.none())

    /** @see getAccountBalances */
    fun getAccountBalances(
        params: BalanceGetAccountBalancesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BalanceGetAccountBalancesResponse

    /** @see getAccountBalances */
    fun getAccountBalances(
        params: BalanceGetAccountBalancesParams
    ): BalanceGetAccountBalancesResponse = getAccountBalances(params, RequestOptions.none())

    /** @see getAccountBalances */
    fun getAccountBalances(
        accountId: Long,
        requestOptions: RequestOptions,
    ): BalanceGetAccountBalancesResponse =
        getAccountBalances(accountId, BalanceGetAccountBalancesParams.none(), requestOptions)

    /** A view of [BalanceService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): BalanceService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /active/v1/accounts/{account_id}/balances`, but is
         * otherwise the same as [BalanceService.getAccountBalances].
         */
        @MustBeClosed
        fun getAccountBalances(
            accountId: Long
        ): HttpResponseFor<BalanceGetAccountBalancesResponse> =
            getAccountBalances(accountId, BalanceGetAccountBalancesParams.none())

        /** @see getAccountBalances */
        @MustBeClosed
        fun getAccountBalances(
            accountId: Long,
            params: BalanceGetAccountBalancesParams = BalanceGetAccountBalancesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BalanceGetAccountBalancesResponse> =
            getAccountBalances(params.toBuilder().accountId(accountId).build(), requestOptions)

        /** @see getAccountBalances */
        @MustBeClosed
        fun getAccountBalances(
            accountId: Long,
            params: BalanceGetAccountBalancesParams = BalanceGetAccountBalancesParams.none(),
        ): HttpResponseFor<BalanceGetAccountBalancesResponse> =
            getAccountBalances(accountId, params, RequestOptions.none())

        /** @see getAccountBalances */
        @MustBeClosed
        fun getAccountBalances(
            params: BalanceGetAccountBalancesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BalanceGetAccountBalancesResponse>

        /** @see getAccountBalances */
        @MustBeClosed
        fun getAccountBalances(
            params: BalanceGetAccountBalancesParams
        ): HttpResponseFor<BalanceGetAccountBalancesResponse> =
            getAccountBalances(params, RequestOptions.none())

        /** @see getAccountBalances */
        @MustBeClosed
        fun getAccountBalances(
            accountId: Long,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BalanceGetAccountBalancesResponse> =
            getAccountBalances(accountId, BalanceGetAccountBalancesParams.none(), requestOptions)
    }
}
