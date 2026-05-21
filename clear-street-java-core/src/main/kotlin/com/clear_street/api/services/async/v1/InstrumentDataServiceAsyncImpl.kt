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
import com.clear_street.api.core.http.parseable
import com.clear_street.api.core.prepareAsync
import com.clear_street.api.models.v1.instrumentdata.InstrumentDataGetAllInstrumentEventsParams
import com.clear_street.api.models.v1.instrumentdata.InstrumentDataGetAllInstrumentEventsResponse
import com.clear_street.api.models.v1.instrumentdata.InstrumentDataGetInstrumentAnalystConsensusParams
import com.clear_street.api.models.v1.instrumentdata.InstrumentDataGetInstrumentAnalystConsensusResponse
import com.clear_street.api.models.v1.instrumentdata.InstrumentDataGetInstrumentBalanceSheetStatementsParams
import com.clear_street.api.models.v1.instrumentdata.InstrumentDataGetInstrumentBalanceSheetStatementsResponse
import com.clear_street.api.models.v1.instrumentdata.InstrumentDataGetInstrumentCashFlowStatementsParams
import com.clear_street.api.models.v1.instrumentdata.InstrumentDataGetInstrumentCashFlowStatementsResponse
import com.clear_street.api.models.v1.instrumentdata.InstrumentDataGetInstrumentEventsParams
import com.clear_street.api.models.v1.instrumentdata.InstrumentDataGetInstrumentEventsResponse
import com.clear_street.api.models.v1.instrumentdata.InstrumentDataGetInstrumentFundamentalsParams
import com.clear_street.api.models.v1.instrumentdata.InstrumentDataGetInstrumentFundamentalsResponse
import com.clear_street.api.models.v1.instrumentdata.InstrumentDataGetInstrumentIncomeStatementsParams
import com.clear_street.api.models.v1.instrumentdata.InstrumentDataGetInstrumentIncomeStatementsResponse
import com.clear_street.api.services.async.v1.instrumentdata.MarketDataServiceAsync
import com.clear_street.api.services.async.v1.instrumentdata.MarketDataServiceAsyncImpl
import com.clear_street.api.services.async.v1.instrumentdata.NewsServiceAsync
import com.clear_street.api.services.async.v1.instrumentdata.NewsServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Retrieve instrument analytics, market data, news, and related reference data. */
class InstrumentDataServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : InstrumentDataServiceAsync {

    private val withRawResponse: InstrumentDataServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val marketData: MarketDataServiceAsync by lazy {
        MarketDataServiceAsyncImpl(clientOptions)
    }

    private val news: NewsServiceAsync by lazy { NewsServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): InstrumentDataServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): InstrumentDataServiceAsync =
        InstrumentDataServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** Retrieve instrument analytics, market data, news, and related reference data. */
    override fun marketData(): MarketDataServiceAsync = marketData

    /** Retrieve instrument analytics, market data, news, and related reference data. */
    override fun news(): NewsServiceAsync = news

    override fun getAllInstrumentEvents(
        params: InstrumentDataGetAllInstrumentEventsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<InstrumentDataGetAllInstrumentEventsResponse> =
        // get /v1/instruments/events
        withRawResponse().getAllInstrumentEvents(params, requestOptions).thenApply { it.parse() }

    override fun getInstrumentAnalystConsensus(
        params: InstrumentDataGetInstrumentAnalystConsensusParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<InstrumentDataGetInstrumentAnalystConsensusResponse> =
        // get /v1/instruments/{instrument_id}/analyst-reporting
        withRawResponse().getInstrumentAnalystConsensus(params, requestOptions).thenApply {
            it.parse()
        }

    override fun getInstrumentBalanceSheetStatements(
        params: InstrumentDataGetInstrumentBalanceSheetStatementsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<InstrumentDataGetInstrumentBalanceSheetStatementsResponse> =
        // get /v1/instruments/{instrument_id}/balance-sheets
        withRawResponse().getInstrumentBalanceSheetStatements(params, requestOptions).thenApply {
            it.parse()
        }

    override fun getInstrumentCashFlowStatements(
        params: InstrumentDataGetInstrumentCashFlowStatementsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<InstrumentDataGetInstrumentCashFlowStatementsResponse> =
        // get /v1/instruments/{instrument_id}/cash-flow-statements
        withRawResponse().getInstrumentCashFlowStatements(params, requestOptions).thenApply {
            it.parse()
        }

    override fun getInstrumentEvents(
        params: InstrumentDataGetInstrumentEventsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<InstrumentDataGetInstrumentEventsResponse> =
        // get /v1/instruments/{instrument_id}/events
        withRawResponse().getInstrumentEvents(params, requestOptions).thenApply { it.parse() }

    override fun getInstrumentFundamentals(
        params: InstrumentDataGetInstrumentFundamentalsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<InstrumentDataGetInstrumentFundamentalsResponse> =
        // get /v1/instruments/{instrument_id}/fundamentals
        withRawResponse().getInstrumentFundamentals(params, requestOptions).thenApply { it.parse() }

    override fun getInstrumentIncomeStatements(
        params: InstrumentDataGetInstrumentIncomeStatementsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<InstrumentDataGetInstrumentIncomeStatementsResponse> =
        // get /v1/instruments/{instrument_id}/income-statements
        withRawResponse().getInstrumentIncomeStatements(params, requestOptions).thenApply {
            it.parse()
        }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        InstrumentDataServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val marketData: MarketDataServiceAsync.WithRawResponse by lazy {
            MarketDataServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val news: NewsServiceAsync.WithRawResponse by lazy {
            NewsServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): InstrumentDataServiceAsync.WithRawResponse =
            InstrumentDataServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** Retrieve instrument analytics, market data, news, and related reference data. */
        override fun marketData(): MarketDataServiceAsync.WithRawResponse = marketData

        /** Retrieve instrument analytics, market data, news, and related reference data. */
        override fun news(): NewsServiceAsync.WithRawResponse = news

        private val getAllInstrumentEventsHandler:
            Handler<InstrumentDataGetAllInstrumentEventsResponse> =
            jsonHandler<InstrumentDataGetAllInstrumentEventsResponse>(clientOptions.jsonMapper)

        override fun getAllInstrumentEvents(
            params: InstrumentDataGetAllInstrumentEventsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InstrumentDataGetAllInstrumentEventsResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "instruments", "events")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getAllInstrumentEventsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getInstrumentAnalystConsensusHandler:
            Handler<InstrumentDataGetInstrumentAnalystConsensusResponse> =
            jsonHandler<InstrumentDataGetInstrumentAnalystConsensusResponse>(
                clientOptions.jsonMapper
            )

        override fun getInstrumentAnalystConsensus(
            params: InstrumentDataGetInstrumentAnalystConsensusParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InstrumentDataGetInstrumentAnalystConsensusResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("instrumentId", params.instrumentId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "instruments", params._pathParam(0), "analyst-reporting")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getInstrumentAnalystConsensusHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getInstrumentBalanceSheetStatementsHandler:
            Handler<InstrumentDataGetInstrumentBalanceSheetStatementsResponse> =
            jsonHandler<InstrumentDataGetInstrumentBalanceSheetStatementsResponse>(
                clientOptions.jsonMapper
            )

        override fun getInstrumentBalanceSheetStatements(
            params: InstrumentDataGetInstrumentBalanceSheetStatementsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<
            HttpResponseFor<InstrumentDataGetInstrumentBalanceSheetStatementsResponse>
        > {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("instrumentId", params.instrumentId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "instruments", params._pathParam(0), "balance-sheets")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getInstrumentBalanceSheetStatementsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getInstrumentCashFlowStatementsHandler:
            Handler<InstrumentDataGetInstrumentCashFlowStatementsResponse> =
            jsonHandler<InstrumentDataGetInstrumentCashFlowStatementsResponse>(
                clientOptions.jsonMapper
            )

        override fun getInstrumentCashFlowStatements(
            params: InstrumentDataGetInstrumentCashFlowStatementsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<
            HttpResponseFor<InstrumentDataGetInstrumentCashFlowStatementsResponse>
        > {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("instrumentId", params.instrumentId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "v1",
                        "instruments",
                        params._pathParam(0),
                        "cash-flow-statements",
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getInstrumentCashFlowStatementsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getInstrumentEventsHandler: Handler<InstrumentDataGetInstrumentEventsResponse> =
            jsonHandler<InstrumentDataGetInstrumentEventsResponse>(clientOptions.jsonMapper)

        override fun getInstrumentEvents(
            params: InstrumentDataGetInstrumentEventsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InstrumentDataGetInstrumentEventsResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("instrumentId", params.instrumentId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "instruments", params._pathParam(0), "events")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getInstrumentEventsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getInstrumentFundamentalsHandler:
            Handler<InstrumentDataGetInstrumentFundamentalsResponse> =
            jsonHandler<InstrumentDataGetInstrumentFundamentalsResponse>(clientOptions.jsonMapper)

        override fun getInstrumentFundamentals(
            params: InstrumentDataGetInstrumentFundamentalsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InstrumentDataGetInstrumentFundamentalsResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("instrumentId", params.instrumentId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "instruments", params._pathParam(0), "fundamentals")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getInstrumentFundamentalsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getInstrumentIncomeStatementsHandler:
            Handler<InstrumentDataGetInstrumentIncomeStatementsResponse> =
            jsonHandler<InstrumentDataGetInstrumentIncomeStatementsResponse>(
                clientOptions.jsonMapper
            )

        override fun getInstrumentIncomeStatements(
            params: InstrumentDataGetInstrumentIncomeStatementsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InstrumentDataGetInstrumentIncomeStatementsResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("instrumentId", params.instrumentId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "instruments", params._pathParam(0), "income-statements")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getInstrumentIncomeStatementsHandler.handle(it) }
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
