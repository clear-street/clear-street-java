// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.v1

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.core.RequestOptions
import com.clear_street.api.core.http.HttpResponseFor
import com.clear_street.api.models.v1.accounts.AccountGetAccountBalancesParams
import com.clear_street.api.models.v1.accounts.AccountGetAccountBalancesResponse
import com.clear_street.api.models.v1.accounts.AccountGetAccountByIdParams
import com.clear_street.api.models.v1.accounts.AccountGetAccountByIdResponse
import com.clear_street.api.models.v1.accounts.AccountGetAccountsParams
import com.clear_street.api.models.v1.accounts.AccountGetAccountsResponse
import com.clear_street.api.models.v1.accounts.AccountGetPortfolioHistoryParams
import com.clear_street.api.models.v1.accounts.AccountGetPortfolioHistoryResponse
import com.clear_street.api.models.v1.accounts.AccountPatchAccountByIdParams
import com.clear_street.api.models.v1.accounts.AccountPatchAccountByIdResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Manage trading accounts, balances, and portfolio history. */
interface AccountServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AccountServiceAsync

    /** Fetch account balance information */
    fun getAccountBalances(accountId: Long): CompletableFuture<AccountGetAccountBalancesResponse> =
        getAccountBalances(accountId, AccountGetAccountBalancesParams.none())

    /** @see getAccountBalances */
    fun getAccountBalances(
        accountId: Long,
        params: AccountGetAccountBalancesParams = AccountGetAccountBalancesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccountGetAccountBalancesResponse> =
        getAccountBalances(params.toBuilder().accountId(accountId).build(), requestOptions)

    /** @see getAccountBalances */
    fun getAccountBalances(
        accountId: Long,
        params: AccountGetAccountBalancesParams = AccountGetAccountBalancesParams.none(),
    ): CompletableFuture<AccountGetAccountBalancesResponse> =
        getAccountBalances(accountId, params, RequestOptions.none())

    /** @see getAccountBalances */
    fun getAccountBalances(
        params: AccountGetAccountBalancesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccountGetAccountBalancesResponse>

    /** @see getAccountBalances */
    fun getAccountBalances(
        params: AccountGetAccountBalancesParams
    ): CompletableFuture<AccountGetAccountBalancesResponse> =
        getAccountBalances(params, RequestOptions.none())

    /** @see getAccountBalances */
    fun getAccountBalances(
        accountId: Long,
        requestOptions: RequestOptions,
    ): CompletableFuture<AccountGetAccountBalancesResponse> =
        getAccountBalances(accountId, AccountGetAccountBalancesParams.none(), requestOptions)

    /** Fetch account details by ID */
    fun getAccountById(accountId: Long): CompletableFuture<AccountGetAccountByIdResponse> =
        getAccountById(accountId, AccountGetAccountByIdParams.none())

    /** @see getAccountById */
    fun getAccountById(
        accountId: Long,
        params: AccountGetAccountByIdParams = AccountGetAccountByIdParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccountGetAccountByIdResponse> =
        getAccountById(params.toBuilder().accountId(accountId).build(), requestOptions)

    /** @see getAccountById */
    fun getAccountById(
        accountId: Long,
        params: AccountGetAccountByIdParams = AccountGetAccountByIdParams.none(),
    ): CompletableFuture<AccountGetAccountByIdResponse> =
        getAccountById(accountId, params, RequestOptions.none())

    /** @see getAccountById */
    fun getAccountById(
        params: AccountGetAccountByIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccountGetAccountByIdResponse>

    /** @see getAccountById */
    fun getAccountById(
        params: AccountGetAccountByIdParams
    ): CompletableFuture<AccountGetAccountByIdResponse> =
        getAccountById(params, RequestOptions.none())

    /** @see getAccountById */
    fun getAccountById(
        accountId: Long,
        requestOptions: RequestOptions,
    ): CompletableFuture<AccountGetAccountByIdResponse> =
        getAccountById(accountId, AccountGetAccountByIdParams.none(), requestOptions)

    /** List accounts the authenticated user has permission to access */
    fun getAccounts(): CompletableFuture<AccountGetAccountsResponse> =
        getAccounts(AccountGetAccountsParams.none())

    /** @see getAccounts */
    fun getAccounts(
        params: AccountGetAccountsParams = AccountGetAccountsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccountGetAccountsResponse>

    /** @see getAccounts */
    fun getAccounts(
        params: AccountGetAccountsParams = AccountGetAccountsParams.none()
    ): CompletableFuture<AccountGetAccountsResponse> = getAccounts(params, RequestOptions.none())

    /** @see getAccounts */
    fun getAccounts(requestOptions: RequestOptions): CompletableFuture<AccountGetAccountsResponse> =
        getAccounts(AccountGetAccountsParams.none(), requestOptions)

    /** Retrieves daily portfolio history for the specified account. */
    fun getPortfolioHistory(
        accountId: Long,
        params: AccountGetPortfolioHistoryParams,
    ): CompletableFuture<AccountGetPortfolioHistoryResponse> =
        getPortfolioHistory(accountId, params, RequestOptions.none())

    /** @see getPortfolioHistory */
    fun getPortfolioHistory(
        accountId: Long,
        params: AccountGetPortfolioHistoryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccountGetPortfolioHistoryResponse> =
        getPortfolioHistory(params.toBuilder().accountId(accountId).build(), requestOptions)

    /** @see getPortfolioHistory */
    fun getPortfolioHistory(
        params: AccountGetPortfolioHistoryParams
    ): CompletableFuture<AccountGetPortfolioHistoryResponse> =
        getPortfolioHistory(params, RequestOptions.none())

    /** @see getPortfolioHistory */
    fun getPortfolioHistory(
        params: AccountGetPortfolioHistoryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccountGetPortfolioHistoryResponse>

    /** Update account risk settings */
    fun patchAccountById(accountId: Long): CompletableFuture<AccountPatchAccountByIdResponse> =
        patchAccountById(accountId, AccountPatchAccountByIdParams.none())

    /** @see patchAccountById */
    fun patchAccountById(
        accountId: Long,
        params: AccountPatchAccountByIdParams = AccountPatchAccountByIdParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccountPatchAccountByIdResponse> =
        patchAccountById(params.toBuilder().accountId(accountId).build(), requestOptions)

    /** @see patchAccountById */
    fun patchAccountById(
        accountId: Long,
        params: AccountPatchAccountByIdParams = AccountPatchAccountByIdParams.none(),
    ): CompletableFuture<AccountPatchAccountByIdResponse> =
        patchAccountById(accountId, params, RequestOptions.none())

    /** @see patchAccountById */
    fun patchAccountById(
        params: AccountPatchAccountByIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccountPatchAccountByIdResponse>

    /** @see patchAccountById */
    fun patchAccountById(
        params: AccountPatchAccountByIdParams
    ): CompletableFuture<AccountPatchAccountByIdResponse> =
        patchAccountById(params, RequestOptions.none())

    /** @see patchAccountById */
    fun patchAccountById(
        accountId: Long,
        requestOptions: RequestOptions,
    ): CompletableFuture<AccountPatchAccountByIdResponse> =
        patchAccountById(accountId, AccountPatchAccountByIdParams.none(), requestOptions)

    /**
     * A view of [AccountServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AccountServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/accounts/{account_id}/balances`, but is
         * otherwise the same as [AccountServiceAsync.getAccountBalances].
         */
        fun getAccountBalances(
            accountId: Long
        ): CompletableFuture<HttpResponseFor<AccountGetAccountBalancesResponse>> =
            getAccountBalances(accountId, AccountGetAccountBalancesParams.none())

        /** @see getAccountBalances */
        fun getAccountBalances(
            accountId: Long,
            params: AccountGetAccountBalancesParams = AccountGetAccountBalancesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccountGetAccountBalancesResponse>> =
            getAccountBalances(params.toBuilder().accountId(accountId).build(), requestOptions)

        /** @see getAccountBalances */
        fun getAccountBalances(
            accountId: Long,
            params: AccountGetAccountBalancesParams = AccountGetAccountBalancesParams.none(),
        ): CompletableFuture<HttpResponseFor<AccountGetAccountBalancesResponse>> =
            getAccountBalances(accountId, params, RequestOptions.none())

        /** @see getAccountBalances */
        fun getAccountBalances(
            params: AccountGetAccountBalancesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccountGetAccountBalancesResponse>>

        /** @see getAccountBalances */
        fun getAccountBalances(
            params: AccountGetAccountBalancesParams
        ): CompletableFuture<HttpResponseFor<AccountGetAccountBalancesResponse>> =
            getAccountBalances(params, RequestOptions.none())

        /** @see getAccountBalances */
        fun getAccountBalances(
            accountId: Long,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AccountGetAccountBalancesResponse>> =
            getAccountBalances(accountId, AccountGetAccountBalancesParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/accounts/{account_id}`, but is otherwise the
         * same as [AccountServiceAsync.getAccountById].
         */
        fun getAccountById(
            accountId: Long
        ): CompletableFuture<HttpResponseFor<AccountGetAccountByIdResponse>> =
            getAccountById(accountId, AccountGetAccountByIdParams.none())

        /** @see getAccountById */
        fun getAccountById(
            accountId: Long,
            params: AccountGetAccountByIdParams = AccountGetAccountByIdParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccountGetAccountByIdResponse>> =
            getAccountById(params.toBuilder().accountId(accountId).build(), requestOptions)

        /** @see getAccountById */
        fun getAccountById(
            accountId: Long,
            params: AccountGetAccountByIdParams = AccountGetAccountByIdParams.none(),
        ): CompletableFuture<HttpResponseFor<AccountGetAccountByIdResponse>> =
            getAccountById(accountId, params, RequestOptions.none())

        /** @see getAccountById */
        fun getAccountById(
            params: AccountGetAccountByIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccountGetAccountByIdResponse>>

        /** @see getAccountById */
        fun getAccountById(
            params: AccountGetAccountByIdParams
        ): CompletableFuture<HttpResponseFor<AccountGetAccountByIdResponse>> =
            getAccountById(params, RequestOptions.none())

        /** @see getAccountById */
        fun getAccountById(
            accountId: Long,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AccountGetAccountByIdResponse>> =
            getAccountById(accountId, AccountGetAccountByIdParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/accounts`, but is otherwise the same as
         * [AccountServiceAsync.getAccounts].
         */
        fun getAccounts(): CompletableFuture<HttpResponseFor<AccountGetAccountsResponse>> =
            getAccounts(AccountGetAccountsParams.none())

        /** @see getAccounts */
        fun getAccounts(
            params: AccountGetAccountsParams = AccountGetAccountsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccountGetAccountsResponse>>

        /** @see getAccounts */
        fun getAccounts(
            params: AccountGetAccountsParams = AccountGetAccountsParams.none()
        ): CompletableFuture<HttpResponseFor<AccountGetAccountsResponse>> =
            getAccounts(params, RequestOptions.none())

        /** @see getAccounts */
        fun getAccounts(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<AccountGetAccountsResponse>> =
            getAccounts(AccountGetAccountsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/accounts/{account_id}/portfolio-history`, but is
         * otherwise the same as [AccountServiceAsync.getPortfolioHistory].
         */
        fun getPortfolioHistory(
            accountId: Long,
            params: AccountGetPortfolioHistoryParams,
        ): CompletableFuture<HttpResponseFor<AccountGetPortfolioHistoryResponse>> =
            getPortfolioHistory(accountId, params, RequestOptions.none())

        /** @see getPortfolioHistory */
        fun getPortfolioHistory(
            accountId: Long,
            params: AccountGetPortfolioHistoryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccountGetPortfolioHistoryResponse>> =
            getPortfolioHistory(params.toBuilder().accountId(accountId).build(), requestOptions)

        /** @see getPortfolioHistory */
        fun getPortfolioHistory(
            params: AccountGetPortfolioHistoryParams
        ): CompletableFuture<HttpResponseFor<AccountGetPortfolioHistoryResponse>> =
            getPortfolioHistory(params, RequestOptions.none())

        /** @see getPortfolioHistory */
        fun getPortfolioHistory(
            params: AccountGetPortfolioHistoryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccountGetPortfolioHistoryResponse>>

        /**
         * Returns a raw HTTP response for `patch /v1/accounts/{account_id}`, but is otherwise the
         * same as [AccountServiceAsync.patchAccountById].
         */
        fun patchAccountById(
            accountId: Long
        ): CompletableFuture<HttpResponseFor<AccountPatchAccountByIdResponse>> =
            patchAccountById(accountId, AccountPatchAccountByIdParams.none())

        /** @see patchAccountById */
        fun patchAccountById(
            accountId: Long,
            params: AccountPatchAccountByIdParams = AccountPatchAccountByIdParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccountPatchAccountByIdResponse>> =
            patchAccountById(params.toBuilder().accountId(accountId).build(), requestOptions)

        /** @see patchAccountById */
        fun patchAccountById(
            accountId: Long,
            params: AccountPatchAccountByIdParams = AccountPatchAccountByIdParams.none(),
        ): CompletableFuture<HttpResponseFor<AccountPatchAccountByIdResponse>> =
            patchAccountById(accountId, params, RequestOptions.none())

        /** @see patchAccountById */
        fun patchAccountById(
            params: AccountPatchAccountByIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccountPatchAccountByIdResponse>>

        /** @see patchAccountById */
        fun patchAccountById(
            params: AccountPatchAccountByIdParams
        ): CompletableFuture<HttpResponseFor<AccountPatchAccountByIdResponse>> =
            patchAccountById(params, RequestOptions.none())

        /** @see patchAccountById */
        fun patchAccountById(
            accountId: Long,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AccountPatchAccountByIdResponse>> =
            patchAccountById(accountId, AccountPatchAccountByIdParams.none(), requestOptions)
    }
}
