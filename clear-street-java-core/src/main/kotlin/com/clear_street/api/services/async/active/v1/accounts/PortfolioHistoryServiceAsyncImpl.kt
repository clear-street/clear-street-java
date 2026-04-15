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
import com.clear_street.api.models.active.v1.accounts.portfoliohistory.PortfolioHistoryGetPortfolioHistoryParams
import com.clear_street.api.models.active.v1.accounts.portfoliohistory.PortfolioHistoryGetPortfolioHistoryResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Manage trading accounts and view balances. */
class PortfolioHistoryServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : PortfolioHistoryServiceAsync {

    private val withRawResponse: PortfolioHistoryServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PortfolioHistoryServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): PortfolioHistoryServiceAsync =
        PortfolioHistoryServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun getPortfolioHistory(
        params: PortfolioHistoryGetPortfolioHistoryParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PortfolioHistoryGetPortfolioHistoryResponse> =
        // get /active/v1/accounts/{account_id}/portfolio-history
        withRawResponse().getPortfolioHistory(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PortfolioHistoryServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PortfolioHistoryServiceAsync.WithRawResponse =
            PortfolioHistoryServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val getPortfolioHistoryHandler:
            Handler<PortfolioHistoryGetPortfolioHistoryResponse> =
            jsonHandler<PortfolioHistoryGetPortfolioHistoryResponse>(clientOptions.jsonMapper)

        override fun getPortfolioHistory(
            params: PortfolioHistoryGetPortfolioHistoryParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PortfolioHistoryGetPortfolioHistoryResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("accountId", params.accountId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "active",
                        "v1",
                        "accounts",
                        params._pathParam(0),
                        "portfolio-history",
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getPortfolioHistoryHandler.handle(it) }
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
