// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.v1.instrumentdata

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
import com.clear_street.api.core.prepare
import com.clear_street.api.models.v1.instrumentdata.marketdata.MarketDataGetDailySummariesParams
import com.clear_street.api.models.v1.instrumentdata.marketdata.MarketDataGetDailySummariesResponse
import com.clear_street.api.models.v1.instrumentdata.marketdata.MarketDataGetSnapshotsParams
import com.clear_street.api.models.v1.instrumentdata.marketdata.MarketDataGetSnapshotsResponse
import java.util.function.Consumer

/** Retrieve instrument analytics, market data, news, and related reference data. */
class MarketDataServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    MarketDataService {

    private val withRawResponse: MarketDataService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): MarketDataService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): MarketDataService =
        MarketDataServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun getDailySummaries(
        params: MarketDataGetDailySummariesParams,
        requestOptions: RequestOptions,
    ): MarketDataGetDailySummariesResponse =
        // get /v1/market-data/daily-summary
        withRawResponse().getDailySummaries(params, requestOptions).parse()

    override fun getSnapshots(
        params: MarketDataGetSnapshotsParams,
        requestOptions: RequestOptions,
    ): MarketDataGetSnapshotsResponse =
        // get /v1/market-data/snapshot
        withRawResponse().getSnapshots(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        MarketDataService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MarketDataService.WithRawResponse =
            MarketDataServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val getDailySummariesHandler: Handler<MarketDataGetDailySummariesResponse> =
            jsonHandler<MarketDataGetDailySummariesResponse>(clientOptions.jsonMapper)

        override fun getDailySummaries(
            params: MarketDataGetDailySummariesParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MarketDataGetDailySummariesResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "market-data", "daily-summary")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getDailySummariesHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getSnapshotsHandler: Handler<MarketDataGetSnapshotsResponse> =
            jsonHandler<MarketDataGetSnapshotsResponse>(clientOptions.jsonMapper)

        override fun getSnapshots(
            params: MarketDataGetSnapshotsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MarketDataGetSnapshotsResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "market-data", "snapshot")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
