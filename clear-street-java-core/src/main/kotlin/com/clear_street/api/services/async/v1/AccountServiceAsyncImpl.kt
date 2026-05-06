// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.v1

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.core.RequestOptions
import com.clear_street.api.core.checkRequired
import com.clear_street.api.core.handlers.errorBodyHandler
import com.clear_street.api.core.handlers.errorHandler
import com.clear_street.api.core.handlers.jsonHandler
import com.clear_street.api.core.http.HttpMethod
import com.clear_street.api.core.http.HttpRequest
import com.clear_street.api.core.http.HttpResponse
import com.clear_street.api.core.http.HttpResponse.Handler
import com.clear_street.api.core.http.HttpResponseFor
import com.clear_street.api.core.http.json
import com.clear_street.api.core.http.parseable
import com.clear_street.api.core.prepareAsync
import com.clear_street.api.models.v1.accounts.AccountGetAccountByIdParams
import com.clear_street.api.models.v1.accounts.AccountGetAccountByIdResponse
import com.clear_street.api.models.v1.accounts.AccountGetAccountsParams
import com.clear_street.api.models.v1.accounts.AccountGetAccountsResponse
import com.clear_street.api.models.v1.accounts.AccountPatchAccountByIdParams
import com.clear_street.api.models.v1.accounts.AccountPatchAccountByIdResponse
import com.clear_street.api.services.async.v1.accounts.BalanceServiceAsync
import com.clear_street.api.services.async.v1.accounts.BalanceServiceAsyncImpl
import com.clear_street.api.services.async.v1.accounts.ExerciseServiceAsync
import com.clear_street.api.services.async.v1.accounts.ExerciseServiceAsyncImpl
import com.clear_street.api.services.async.v1.accounts.OrderServiceAsync
import com.clear_street.api.services.async.v1.accounts.OrderServiceAsyncImpl
import com.clear_street.api.services.async.v1.accounts.PortfolioHistoryServiceAsync
import com.clear_street.api.services.async.v1.accounts.PortfolioHistoryServiceAsyncImpl
import com.clear_street.api.services.async.v1.accounts.PositionServiceAsync
import com.clear_street.api.services.async.v1.accounts.PositionServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Manage trading accounts, balances, and portfolio history. */
class AccountServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    AccountServiceAsync {

    private val withRawResponse: AccountServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val balances: BalanceServiceAsync by lazy { BalanceServiceAsyncImpl(clientOptions) }

    private val exercises: ExerciseServiceAsync by lazy { ExerciseServiceAsyncImpl(clientOptions) }

    private val orders: OrderServiceAsync by lazy { OrderServiceAsyncImpl(clientOptions) }

    private val portfolioHistory: PortfolioHistoryServiceAsync by lazy {
        PortfolioHistoryServiceAsyncImpl(clientOptions)
    }

    private val positions: PositionServiceAsync by lazy { PositionServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): AccountServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AccountServiceAsync =
        AccountServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** Manage trading accounts, balances, and portfolio history. */
    override fun balances(): BalanceServiceAsync = balances

    /** Submit and monitor option exercise, DNE, CEA, and cancel instructions. */
    override fun exercises(): ExerciseServiceAsync = exercises

    /** Place, monitor, and manage trading orders. */
    override fun orders(): OrderServiceAsync = orders

    /** Manage trading accounts, balances, and portfolio history. */
    override fun portfolioHistory(): PortfolioHistoryServiceAsync = portfolioHistory

    /** View account positions. */
    override fun positions(): PositionServiceAsync = positions

    override fun getAccountById(
        params: AccountGetAccountByIdParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AccountGetAccountByIdResponse> =
        // get /v1/accounts/{account_id}
        withRawResponse().getAccountById(params, requestOptions).thenApply { it.parse() }

    override fun getAccounts(
        params: AccountGetAccountsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AccountGetAccountsResponse> =
        // get /v1/accounts
        withRawResponse().getAccounts(params, requestOptions).thenApply { it.parse() }

    override fun patchAccountById(
        params: AccountPatchAccountByIdParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AccountPatchAccountByIdResponse> =
        // patch /v1/accounts/{account_id}
        withRawResponse().patchAccountById(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AccountServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val balances: BalanceServiceAsync.WithRawResponse by lazy {
            BalanceServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val exercises: ExerciseServiceAsync.WithRawResponse by lazy {
            ExerciseServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val orders: OrderServiceAsync.WithRawResponse by lazy {
            OrderServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val portfolioHistory: PortfolioHistoryServiceAsync.WithRawResponse by lazy {
            PortfolioHistoryServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val positions: PositionServiceAsync.WithRawResponse by lazy {
            PositionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AccountServiceAsync.WithRawResponse =
            AccountServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** Manage trading accounts, balances, and portfolio history. */
        override fun balances(): BalanceServiceAsync.WithRawResponse = balances

        /** Submit and monitor option exercise, DNE, CEA, and cancel instructions. */
        override fun exercises(): ExerciseServiceAsync.WithRawResponse = exercises

        /** Place, monitor, and manage trading orders. */
        override fun orders(): OrderServiceAsync.WithRawResponse = orders

        /** Manage trading accounts, balances, and portfolio history. */
        override fun portfolioHistory(): PortfolioHistoryServiceAsync.WithRawResponse =
            portfolioHistory

        /** View account positions. */
        override fun positions(): PositionServiceAsync.WithRawResponse = positions

        private val getAccountByIdHandler: Handler<AccountGetAccountByIdResponse> =
            jsonHandler<AccountGetAccountByIdResponse>(clientOptions.jsonMapper)

        override fun getAccountById(
            params: AccountGetAccountByIdParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AccountGetAccountByIdResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("accountId", params.accountId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "accounts", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getAccountByIdHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getAccountsHandler: Handler<AccountGetAccountsResponse> =
            jsonHandler<AccountGetAccountsResponse>(clientOptions.jsonMapper)

        override fun getAccounts(
            params: AccountGetAccountsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AccountGetAccountsResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "accounts")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getAccountsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val patchAccountByIdHandler: Handler<AccountPatchAccountByIdResponse> =
            jsonHandler<AccountPatchAccountByIdResponse>(clientOptions.jsonMapper)

        override fun patchAccountById(
            params: AccountPatchAccountByIdParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AccountPatchAccountByIdResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("accountId", params.accountId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "accounts", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { patchAccountByIdHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }
    }
}
