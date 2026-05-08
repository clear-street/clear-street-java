// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.v1

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
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

/** Manage trading accounts, balances, and portfolio history. */
interface AccountService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AccountService

    /** Fetch account balance information */
    fun getAccountBalances(accountId: Long): AccountGetAccountBalancesResponse =
        getAccountBalances(accountId, AccountGetAccountBalancesParams.none())

    /** @see getAccountBalances */
    fun getAccountBalances(
        accountId: Long,
        params: AccountGetAccountBalancesParams = AccountGetAccountBalancesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountGetAccountBalancesResponse =
        getAccountBalances(params.toBuilder().accountId(accountId).build(), requestOptions)

    /** @see getAccountBalances */
    fun getAccountBalances(
        accountId: Long,
        params: AccountGetAccountBalancesParams = AccountGetAccountBalancesParams.none(),
    ): AccountGetAccountBalancesResponse =
        getAccountBalances(accountId, params, RequestOptions.none())

    /** @see getAccountBalances */
    fun getAccountBalances(
        params: AccountGetAccountBalancesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountGetAccountBalancesResponse

    /** @see getAccountBalances */
    fun getAccountBalances(
        params: AccountGetAccountBalancesParams
    ): AccountGetAccountBalancesResponse = getAccountBalances(params, RequestOptions.none())

    /** @see getAccountBalances */
    fun getAccountBalances(
        accountId: Long,
        requestOptions: RequestOptions,
    ): AccountGetAccountBalancesResponse =
        getAccountBalances(accountId, AccountGetAccountBalancesParams.none(), requestOptions)

    /** Fetch account details by ID */
    fun getAccountById(accountId: Long): AccountGetAccountByIdResponse =
        getAccountById(accountId, AccountGetAccountByIdParams.none())

    /** @see getAccountById */
    fun getAccountById(
        accountId: Long,
        params: AccountGetAccountByIdParams = AccountGetAccountByIdParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountGetAccountByIdResponse =
        getAccountById(params.toBuilder().accountId(accountId).build(), requestOptions)

    /** @see getAccountById */
    fun getAccountById(
        accountId: Long,
        params: AccountGetAccountByIdParams = AccountGetAccountByIdParams.none(),
    ): AccountGetAccountByIdResponse = getAccountById(accountId, params, RequestOptions.none())

    /** @see getAccountById */
    fun getAccountById(
        params: AccountGetAccountByIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountGetAccountByIdResponse

    /** @see getAccountById */
    fun getAccountById(params: AccountGetAccountByIdParams): AccountGetAccountByIdResponse =
        getAccountById(params, RequestOptions.none())

    /** @see getAccountById */
    fun getAccountById(
        accountId: Long,
        requestOptions: RequestOptions,
    ): AccountGetAccountByIdResponse =
        getAccountById(accountId, AccountGetAccountByIdParams.none(), requestOptions)

    /** List accounts the authenticated user has permission to access */
    fun getAccounts(): AccountGetAccountsResponse = getAccounts(AccountGetAccountsParams.none())

    /** @see getAccounts */
    fun getAccounts(
        params: AccountGetAccountsParams = AccountGetAccountsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountGetAccountsResponse

    /** @see getAccounts */
    fun getAccounts(
        params: AccountGetAccountsParams = AccountGetAccountsParams.none()
    ): AccountGetAccountsResponse = getAccounts(params, RequestOptions.none())

    /** @see getAccounts */
    fun getAccounts(requestOptions: RequestOptions): AccountGetAccountsResponse =
        getAccounts(AccountGetAccountsParams.none(), requestOptions)

    /** Retrieves daily portfolio history for the specified account. */
    fun getPortfolioHistory(
        accountId: Long,
        params: AccountGetPortfolioHistoryParams,
    ): AccountGetPortfolioHistoryResponse =
        getPortfolioHistory(accountId, params, RequestOptions.none())

    /** @see getPortfolioHistory */
    fun getPortfolioHistory(
        accountId: Long,
        params: AccountGetPortfolioHistoryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountGetPortfolioHistoryResponse =
        getPortfolioHistory(params.toBuilder().accountId(accountId).build(), requestOptions)

    /** @see getPortfolioHistory */
    fun getPortfolioHistory(
        params: AccountGetPortfolioHistoryParams
    ): AccountGetPortfolioHistoryResponse = getPortfolioHistory(params, RequestOptions.none())

    /** @see getPortfolioHistory */
    fun getPortfolioHistory(
        params: AccountGetPortfolioHistoryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountGetPortfolioHistoryResponse

    /** Update account risk settings */
    fun patchAccountById(accountId: Long): AccountPatchAccountByIdResponse =
        patchAccountById(accountId, AccountPatchAccountByIdParams.none())

    /** @see patchAccountById */
    fun patchAccountById(
        accountId: Long,
        params: AccountPatchAccountByIdParams = AccountPatchAccountByIdParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountPatchAccountByIdResponse =
        patchAccountById(params.toBuilder().accountId(accountId).build(), requestOptions)

    /** @see patchAccountById */
    fun patchAccountById(
        accountId: Long,
        params: AccountPatchAccountByIdParams = AccountPatchAccountByIdParams.none(),
    ): AccountPatchAccountByIdResponse = patchAccountById(accountId, params, RequestOptions.none())

    /** @see patchAccountById */
    fun patchAccountById(
        params: AccountPatchAccountByIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountPatchAccountByIdResponse

    /** @see patchAccountById */
    fun patchAccountById(params: AccountPatchAccountByIdParams): AccountPatchAccountByIdResponse =
        patchAccountById(params, RequestOptions.none())

    /** @see patchAccountById */
    fun patchAccountById(
        accountId: Long,
        requestOptions: RequestOptions,
    ): AccountPatchAccountByIdResponse =
        patchAccountById(accountId, AccountPatchAccountByIdParams.none(), requestOptions)

    /** A view of [AccountService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): AccountService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/accounts/{account_id}/balances`, but is
         * otherwise the same as [AccountService.getAccountBalances].
         */
        @MustBeClosed
        fun getAccountBalances(
            accountId: Long
        ): HttpResponseFor<AccountGetAccountBalancesResponse> =
            getAccountBalances(accountId, AccountGetAccountBalancesParams.none())

        /** @see getAccountBalances */
        @MustBeClosed
        fun getAccountBalances(
            accountId: Long,
            params: AccountGetAccountBalancesParams = AccountGetAccountBalancesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountGetAccountBalancesResponse> =
            getAccountBalances(params.toBuilder().accountId(accountId).build(), requestOptions)

        /** @see getAccountBalances */
        @MustBeClosed
        fun getAccountBalances(
            accountId: Long,
            params: AccountGetAccountBalancesParams = AccountGetAccountBalancesParams.none(),
        ): HttpResponseFor<AccountGetAccountBalancesResponse> =
            getAccountBalances(accountId, params, RequestOptions.none())

        /** @see getAccountBalances */
        @MustBeClosed
        fun getAccountBalances(
            params: AccountGetAccountBalancesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountGetAccountBalancesResponse>

        /** @see getAccountBalances */
        @MustBeClosed
        fun getAccountBalances(
            params: AccountGetAccountBalancesParams
        ): HttpResponseFor<AccountGetAccountBalancesResponse> =
            getAccountBalances(params, RequestOptions.none())

        /** @see getAccountBalances */
        @MustBeClosed
        fun getAccountBalances(
            accountId: Long,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AccountGetAccountBalancesResponse> =
            getAccountBalances(accountId, AccountGetAccountBalancesParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/accounts/{account_id}`, but is otherwise the
         * same as [AccountService.getAccountById].
         */
        @MustBeClosed
        fun getAccountById(accountId: Long): HttpResponseFor<AccountGetAccountByIdResponse> =
            getAccountById(accountId, AccountGetAccountByIdParams.none())

        /** @see getAccountById */
        @MustBeClosed
        fun getAccountById(
            accountId: Long,
            params: AccountGetAccountByIdParams = AccountGetAccountByIdParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountGetAccountByIdResponse> =
            getAccountById(params.toBuilder().accountId(accountId).build(), requestOptions)

        /** @see getAccountById */
        @MustBeClosed
        fun getAccountById(
            accountId: Long,
            params: AccountGetAccountByIdParams = AccountGetAccountByIdParams.none(),
        ): HttpResponseFor<AccountGetAccountByIdResponse> =
            getAccountById(accountId, params, RequestOptions.none())

        /** @see getAccountById */
        @MustBeClosed
        fun getAccountById(
            params: AccountGetAccountByIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountGetAccountByIdResponse>

        /** @see getAccountById */
        @MustBeClosed
        fun getAccountById(
            params: AccountGetAccountByIdParams
        ): HttpResponseFor<AccountGetAccountByIdResponse> =
            getAccountById(params, RequestOptions.none())

        /** @see getAccountById */
        @MustBeClosed
        fun getAccountById(
            accountId: Long,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AccountGetAccountByIdResponse> =
            getAccountById(accountId, AccountGetAccountByIdParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/accounts`, but is otherwise the same as
         * [AccountService.getAccounts].
         */
        @MustBeClosed
        fun getAccounts(): HttpResponseFor<AccountGetAccountsResponse> =
            getAccounts(AccountGetAccountsParams.none())

        /** @see getAccounts */
        @MustBeClosed
        fun getAccounts(
            params: AccountGetAccountsParams = AccountGetAccountsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountGetAccountsResponse>

        /** @see getAccounts */
        @MustBeClosed
        fun getAccounts(
            params: AccountGetAccountsParams = AccountGetAccountsParams.none()
        ): HttpResponseFor<AccountGetAccountsResponse> = getAccounts(params, RequestOptions.none())

        /** @see getAccounts */
        @MustBeClosed
        fun getAccounts(
            requestOptions: RequestOptions
        ): HttpResponseFor<AccountGetAccountsResponse> =
            getAccounts(AccountGetAccountsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/accounts/{account_id}/portfolio-history`, but is
         * otherwise the same as [AccountService.getPortfolioHistory].
         */
        @MustBeClosed
        fun getPortfolioHistory(
            accountId: Long,
            params: AccountGetPortfolioHistoryParams,
        ): HttpResponseFor<AccountGetPortfolioHistoryResponse> =
            getPortfolioHistory(accountId, params, RequestOptions.none())

        /** @see getPortfolioHistory */
        @MustBeClosed
        fun getPortfolioHistory(
            accountId: Long,
            params: AccountGetPortfolioHistoryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountGetPortfolioHistoryResponse> =
            getPortfolioHistory(params.toBuilder().accountId(accountId).build(), requestOptions)

        /** @see getPortfolioHistory */
        @MustBeClosed
        fun getPortfolioHistory(
            params: AccountGetPortfolioHistoryParams
        ): HttpResponseFor<AccountGetPortfolioHistoryResponse> =
            getPortfolioHistory(params, RequestOptions.none())

        /** @see getPortfolioHistory */
        @MustBeClosed
        fun getPortfolioHistory(
            params: AccountGetPortfolioHistoryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountGetPortfolioHistoryResponse>

        /**
         * Returns a raw HTTP response for `patch /v1/accounts/{account_id}`, but is otherwise the
         * same as [AccountService.patchAccountById].
         */
        @MustBeClosed
        fun patchAccountById(accountId: Long): HttpResponseFor<AccountPatchAccountByIdResponse> =
            patchAccountById(accountId, AccountPatchAccountByIdParams.none())

        /** @see patchAccountById */
        @MustBeClosed
        fun patchAccountById(
            accountId: Long,
            params: AccountPatchAccountByIdParams = AccountPatchAccountByIdParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountPatchAccountByIdResponse> =
            patchAccountById(params.toBuilder().accountId(accountId).build(), requestOptions)

        /** @see patchAccountById */
        @MustBeClosed
        fun patchAccountById(
            accountId: Long,
            params: AccountPatchAccountByIdParams = AccountPatchAccountByIdParams.none(),
        ): HttpResponseFor<AccountPatchAccountByIdResponse> =
            patchAccountById(accountId, params, RequestOptions.none())

        /** @see patchAccountById */
        @MustBeClosed
        fun patchAccountById(
            params: AccountPatchAccountByIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountPatchAccountByIdResponse>

        /** @see patchAccountById */
        @MustBeClosed
        fun patchAccountById(
            params: AccountPatchAccountByIdParams
        ): HttpResponseFor<AccountPatchAccountByIdResponse> =
            patchAccountById(params, RequestOptions.none())

        /** @see patchAccountById */
        @MustBeClosed
        fun patchAccountById(
            accountId: Long,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AccountPatchAccountByIdResponse> =
            patchAccountById(accountId, AccountPatchAccountByIdParams.none(), requestOptions)
    }
}
