// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.v1.marketdata

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.core.RequestOptions
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
import com.clear_street.api.models.v1.marketdata.dailysummary.DailySummaryGetDailySummariesParams
import com.clear_street.api.models.v1.marketdata.dailysummary.DailySummaryGetDailySummariesResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Real-time market data snapshots. */
class DailySummaryServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    DailySummaryServiceAsync {

    private val withRawResponse: DailySummaryServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): DailySummaryServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): DailySummaryServiceAsync =
        DailySummaryServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun getDailySummaries(
        params: DailySummaryGetDailySummariesParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<DailySummaryGetDailySummariesResponse> =
        // get /v1/market-data/daily-summary
        withRawResponse().getDailySummaries(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DailySummaryServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DailySummaryServiceAsync.WithRawResponse =
            DailySummaryServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val getDailySummariesHandler: Handler<DailySummaryGetDailySummariesResponse> =
            jsonHandler<DailySummaryGetDailySummariesResponse>(clientOptions.jsonMapper)

        override fun getDailySummaries(
            params: DailySummaryGetDailySummariesParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DailySummaryGetDailySummariesResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "market-data", "daily-summary")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getDailySummariesHandler.handle(it) }
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
