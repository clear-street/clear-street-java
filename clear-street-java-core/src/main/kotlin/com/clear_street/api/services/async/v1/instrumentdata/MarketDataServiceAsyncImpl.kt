// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.v1.instrumentdata

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
import com.clear_street.api.models.v1.instrumentdata.marketdata.MarketDataGetDailySummariesParams
import com.clear_street.api.models.v1.instrumentdata.marketdata.MarketDataGetDailySummariesResponse
import com.clear_street.api.models.v1.instrumentdata.marketdata.MarketDataGetSnapshotsParams
import com.clear_street.api.models.v1.instrumentdata.marketdata.MarketDataGetSnapshotsResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Retrieve instrument analytics, market data, news, and related reference data. */
class MarketDataServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    MarketDataServiceAsync {

    private val withRawResponse: MarketDataServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): MarketDataServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): MarketDataServiceAsync =
        MarketDataServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun getDailySummaries(
        params: MarketDataGetDailySummariesParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<MarketDataGetDailySummariesResponse> =
        // get /v1/market-data/daily-summary
        withRawResponse().getDailySummaries(params, requestOptions).thenApply { it.parse() }

    override fun getSnapshots(
        params: MarketDataGetSnapshotsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<MarketDataGetSnapshotsResponse> =
        // get /v1/market-data/snapshot
        withRawResponse().getSnapshots(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        MarketDataServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MarketDataServiceAsync.WithRawResponse =
            MarketDataServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val getDailySummariesHandler: Handler<MarketDataGetDailySummariesResponse> =
            jsonHandler<MarketDataGetDailySummariesResponse>(clientOptions.jsonMapper)

        override fun getDailySummaries(
            params: MarketDataGetDailySummariesParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MarketDataGetDailySummariesResponse>> {
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

        private val getSnapshotsHandler: Handler<MarketDataGetSnapshotsResponse> =
            jsonHandler<MarketDataGetSnapshotsResponse>(clientOptions.jsonMapper)

        override fun getSnapshots(
            params: MarketDataGetSnapshotsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MarketDataGetSnapshotsResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "market-data", "snapshot")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getSnapshotsHandler.handle(it) }
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
