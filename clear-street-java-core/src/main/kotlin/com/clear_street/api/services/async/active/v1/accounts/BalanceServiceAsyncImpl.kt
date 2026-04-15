// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.active.v1.accounts

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
import com.clear_street.api.core.http.parseable
import com.clear_street.api.core.prepareAsync
import com.clear_street.api.models.active.v1.accounts.balances.BalanceGetAccountBalancesParams
import com.clear_street.api.models.active.v1.accounts.balances.BalanceGetAccountBalancesResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Manage trading accounts and view balances. */
class BalanceServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    BalanceServiceAsync {

    private val withRawResponse: BalanceServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): BalanceServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): BalanceServiceAsync =
        BalanceServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun getAccountBalances(
        params: BalanceGetAccountBalancesParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BalanceGetAccountBalancesResponse> =
        // get /active/v1/accounts/{account_id}/balances
        withRawResponse().getAccountBalances(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BalanceServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BalanceServiceAsync.WithRawResponse =
            BalanceServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val getAccountBalancesHandler: Handler<BalanceGetAccountBalancesResponse> =
            jsonHandler<BalanceGetAccountBalancesResponse>(clientOptions.jsonMapper)

        override fun getAccountBalances(
            params: BalanceGetAccountBalancesParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BalanceGetAccountBalancesResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("accountId", params.accountId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("active", "v1", "accounts", params._pathParam(0), "balances")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getAccountBalancesHandler.handle(it) }
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
