// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.active.v1.accounts

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
import com.clear_street.api.core.prepare
import com.clear_street.api.models.active.v1.accounts.portfoliohistory.PortfolioHistoryGetPortfolioHistoryParams
import com.clear_street.api.models.active.v1.accounts.portfoliohistory.PortfolioHistoryGetPortfolioHistoryResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Manage trading accounts and view balances. */
class PortfolioHistoryServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    PortfolioHistoryService {

    private val withRawResponse: PortfolioHistoryService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PortfolioHistoryService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): PortfolioHistoryService =
        PortfolioHistoryServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun getPortfolioHistory(
        params: PortfolioHistoryGetPortfolioHistoryParams,
        requestOptions: RequestOptions,
    ): PortfolioHistoryGetPortfolioHistoryResponse =
        // get /active/v1/accounts/{account_id}/portfolio-history
        withRawResponse().getPortfolioHistory(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PortfolioHistoryService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PortfolioHistoryService.WithRawResponse =
            PortfolioHistoryServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val getPortfolioHistoryHandler:
            Handler<PortfolioHistoryGetPortfolioHistoryResponse> =
            jsonHandler<PortfolioHistoryGetPortfolioHistoryResponse>(clientOptions.jsonMapper)

        override fun getPortfolioHistory(
            params: PortfolioHistoryGetPortfolioHistoryParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PortfolioHistoryGetPortfolioHistoryResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
