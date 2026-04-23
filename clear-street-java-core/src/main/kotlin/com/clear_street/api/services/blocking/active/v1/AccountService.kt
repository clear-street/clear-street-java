// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.active.v1

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.core.RequestOptions
import com.clear_street.api.core.http.HttpResponseFor
import com.clear_street.api.models.active.v1.accounts.AccountGetAccountByIdParams
import com.clear_street.api.models.active.v1.accounts.AccountGetAccountByIdResponse
import com.clear_street.api.models.active.v1.accounts.AccountGetAccountsParams
import com.clear_street.api.models.active.v1.accounts.AccountGetAccountsResponse
import com.clear_street.api.models.active.v1.accounts.AccountPatchAccountByIdParams
import com.clear_street.api.models.active.v1.accounts.AccountPatchAccountByIdResponse
import com.clear_street.api.services.blocking.active.v1.accounts.BalanceService
import com.clear_street.api.services.blocking.active.v1.accounts.LocateService
import com.clear_street.api.services.blocking.active.v1.accounts.OrderService
import com.clear_street.api.services.blocking.active.v1.accounts.PortfolioHistoryService
import com.clear_street.api.services.blocking.active.v1.accounts.PositionService
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

/** Manage trading accounts and view balances. */
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

    /** Manage trading accounts and view balances. */
    fun balances(): BalanceService

    /** Manage locate requests for short selling. */
    fun locates(): LocateService

    /** Place, monitor, and manage trading orders. */
    fun orders(): OrderService

    /** Manage trading accounts and view balances. */
    fun portfolioHistory(): PortfolioHistoryService

    /** View account positions. */
    fun positions(): PositionService

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

        /** Manage trading accounts and view balances. */
        fun balances(): BalanceService.WithRawResponse

        /** Manage locate requests for short selling. */
        fun locates(): LocateService.WithRawResponse

        /** Place, monitor, and manage trading orders. */
        fun orders(): OrderService.WithRawResponse

        /** Manage trading accounts and view balances. */
        fun portfolioHistory(): PortfolioHistoryService.WithRawResponse

        /** View account positions. */
        fun positions(): PositionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /active/v1/accounts/{account_id}`, but is otherwise
         * the same as [AccountService.getAccountById].
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
         * Returns a raw HTTP response for `get /active/v1/accounts`, but is otherwise the same as
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
         * Returns a raw HTTP response for `patch /active/v1/accounts/{account_id}`, but is
         * otherwise the same as [AccountService.patchAccountById].
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
