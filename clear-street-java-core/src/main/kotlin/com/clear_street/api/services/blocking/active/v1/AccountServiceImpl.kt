// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.active.v1

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
import com.clear_street.api.core.prepare
import com.clear_street.api.models.active.v1.accounts.AccountGetAccountByIdParams
import com.clear_street.api.models.active.v1.accounts.AccountGetAccountByIdResponse
import com.clear_street.api.models.active.v1.accounts.AccountGetAccountsParams
import com.clear_street.api.models.active.v1.accounts.AccountGetAccountsResponse
import com.clear_street.api.models.active.v1.accounts.AccountPatchAccountByIdParams
import com.clear_street.api.models.active.v1.accounts.AccountPatchAccountByIdResponse
import com.clear_street.api.services.blocking.active.v1.accounts.BalanceService
import com.clear_street.api.services.blocking.active.v1.accounts.BalanceServiceImpl
import com.clear_street.api.services.blocking.active.v1.accounts.OrderService
import com.clear_street.api.services.blocking.active.v1.accounts.OrderServiceImpl
import com.clear_street.api.services.blocking.active.v1.accounts.PortfolioHistoryService
import com.clear_street.api.services.blocking.active.v1.accounts.PortfolioHistoryServiceImpl
import com.clear_street.api.services.blocking.active.v1.accounts.PositionService
import com.clear_street.api.services.blocking.active.v1.accounts.PositionServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Manage trading accounts, balances, and portfolio history. */
class AccountServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    AccountService {

    private val withRawResponse: AccountService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val balances: BalanceService by lazy { BalanceServiceImpl(clientOptions) }

    private val orders: OrderService by lazy { OrderServiceImpl(clientOptions) }

    private val portfolioHistory: PortfolioHistoryService by lazy {
        PortfolioHistoryServiceImpl(clientOptions)
    }

    private val positions: PositionService by lazy { PositionServiceImpl(clientOptions) }

    override fun withRawResponse(): AccountService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AccountService =
        AccountServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** Manage trading accounts, balances, and portfolio history. */
    override fun balances(): BalanceService = balances

    /** Place, monitor, and manage trading orders. */
    override fun orders(): OrderService = orders

    /** Manage trading accounts, balances, and portfolio history. */
    override fun portfolioHistory(): PortfolioHistoryService = portfolioHistory

    /** View account positions. */
    override fun positions(): PositionService = positions

    override fun getAccountById(
        params: AccountGetAccountByIdParams,
        requestOptions: RequestOptions,
    ): AccountGetAccountByIdResponse =
        // get /active/v1/accounts/{account_id}
        withRawResponse().getAccountById(params, requestOptions).parse()

    override fun getAccounts(
        params: AccountGetAccountsParams,
        requestOptions: RequestOptions,
    ): AccountGetAccountsResponse =
        // get /active/v1/accounts
        withRawResponse().getAccounts(params, requestOptions).parse()

    override fun patchAccountById(
        params: AccountPatchAccountByIdParams,
        requestOptions: RequestOptions,
    ): AccountPatchAccountByIdResponse =
        // patch /active/v1/accounts/{account_id}
        withRawResponse().patchAccountById(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AccountService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val balances: BalanceService.WithRawResponse by lazy {
            BalanceServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val orders: OrderService.WithRawResponse by lazy {
            OrderServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val portfolioHistory: PortfolioHistoryService.WithRawResponse by lazy {
            PortfolioHistoryServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val positions: PositionService.WithRawResponse by lazy {
            PositionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AccountService.WithRawResponse =
            AccountServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** Manage trading accounts, balances, and portfolio history. */
        override fun balances(): BalanceService.WithRawResponse = balances

        /** Place, monitor, and manage trading orders. */
        override fun orders(): OrderService.WithRawResponse = orders

        /** Manage trading accounts, balances, and portfolio history. */
        override fun portfolioHistory(): PortfolioHistoryService.WithRawResponse = portfolioHistory

        /** View account positions. */
        override fun positions(): PositionService.WithRawResponse = positions

        private val getAccountByIdHandler: Handler<AccountGetAccountByIdResponse> =
            jsonHandler<AccountGetAccountByIdResponse>(clientOptions.jsonMapper)

        override fun getAccountById(
            params: AccountGetAccountByIdParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AccountGetAccountByIdResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("accountId", params.accountId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("active", "v1", "accounts", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getAccountByIdHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getAccountsHandler: Handler<AccountGetAccountsResponse> =
            jsonHandler<AccountGetAccountsResponse>(clientOptions.jsonMapper)

        override fun getAccounts(
            params: AccountGetAccountsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AccountGetAccountsResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("active", "v1", "accounts")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getAccountsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val patchAccountByIdHandler: Handler<AccountPatchAccountByIdResponse> =
            jsonHandler<AccountPatchAccountByIdResponse>(clientOptions.jsonMapper)

        override fun patchAccountById(
            params: AccountPatchAccountByIdParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AccountPatchAccountByIdResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("accountId", params.accountId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("active", "v1", "accounts", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
