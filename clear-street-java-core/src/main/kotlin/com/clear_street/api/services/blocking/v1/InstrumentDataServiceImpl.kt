// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.v1

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
import com.clear_street.api.services.blocking.v1.instrumentdata.MarketDataService
import com.clear_street.api.services.blocking.v1.instrumentdata.MarketDataServiceImpl
import com.clear_street.api.services.blocking.v1.instrumentdata.NewsService
import com.clear_street.api.services.blocking.v1.instrumentdata.NewsServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Retrieve instrument analytics, market data, news, and related reference data. */
class InstrumentDataServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    InstrumentDataService {

    private val withRawResponse: InstrumentDataService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val marketData: MarketDataService by lazy { MarketDataServiceImpl(clientOptions) }

    private val news: NewsService by lazy { NewsServiceImpl(clientOptions) }

    override fun withRawResponse(): InstrumentDataService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): InstrumentDataService =
        InstrumentDataServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** Retrieve instrument analytics, market data, news, and related reference data. */
    override fun marketData(): MarketDataService = marketData

    /** Retrieve instrument analytics, market data, news, and related reference data. */
    override fun news(): NewsService = news

    override fun getAllInstrumentEvents(
        params: InstrumentDataGetAllInstrumentEventsParams,
        requestOptions: RequestOptions,
    ): InstrumentDataGetAllInstrumentEventsResponse =
        // get /v1/instruments/events
        withRawResponse().getAllInstrumentEvents(params, requestOptions).parse()

    override fun getInstrumentAnalystConsensus(
        params: InstrumentDataGetInstrumentAnalystConsensusParams,
        requestOptions: RequestOptions,
    ): InstrumentDataGetInstrumentAnalystConsensusResponse =
        // get /v1/instruments/{instrument_id}/analyst-reporting
        withRawResponse().getInstrumentAnalystConsensus(params, requestOptions).parse()

    override fun getInstrumentBalanceSheetStatements(
        params: InstrumentDataGetInstrumentBalanceSheetStatementsParams,
        requestOptions: RequestOptions,
    ): InstrumentDataGetInstrumentBalanceSheetStatementsResponse =
        // get /v1/instruments/{instrument_id}/balance-sheets
        withRawResponse().getInstrumentBalanceSheetStatements(params, requestOptions).parse()

    override fun getInstrumentCashFlowStatements(
        params: InstrumentDataGetInstrumentCashFlowStatementsParams,
        requestOptions: RequestOptions,
    ): InstrumentDataGetInstrumentCashFlowStatementsResponse =
        // get /v1/instruments/{instrument_id}/cash-flow-statements
        withRawResponse().getInstrumentCashFlowStatements(params, requestOptions).parse()

    override fun getInstrumentEvents(
        params: InstrumentDataGetInstrumentEventsParams,
        requestOptions: RequestOptions,
    ): InstrumentDataGetInstrumentEventsResponse =
        // get /v1/instruments/{instrument_id}/events
        withRawResponse().getInstrumentEvents(params, requestOptions).parse()

    override fun getInstrumentFundamentals(
        params: InstrumentDataGetInstrumentFundamentalsParams,
        requestOptions: RequestOptions,
    ): InstrumentDataGetInstrumentFundamentalsResponse =
        // get /v1/instruments/{instrument_id}/fundamentals
        withRawResponse().getInstrumentFundamentals(params, requestOptions).parse()

    override fun getInstrumentIncomeStatements(
        params: InstrumentDataGetInstrumentIncomeStatementsParams,
        requestOptions: RequestOptions,
    ): InstrumentDataGetInstrumentIncomeStatementsResponse =
        // get /v1/instruments/{instrument_id}/income-statements
        withRawResponse().getInstrumentIncomeStatements(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        InstrumentDataService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val marketData: MarketDataService.WithRawResponse by lazy {
            MarketDataServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val news: NewsService.WithRawResponse by lazy {
            NewsServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): InstrumentDataService.WithRawResponse =
            InstrumentDataServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** Retrieve instrument analytics, market data, news, and related reference data. */
        override fun marketData(): MarketDataService.WithRawResponse = marketData

        /** Retrieve instrument analytics, market data, news, and related reference data. */
        override fun news(): NewsService.WithRawResponse = news

        private val getAllInstrumentEventsHandler:
            Handler<InstrumentDataGetAllInstrumentEventsResponse> =
            jsonHandler<InstrumentDataGetAllInstrumentEventsResponse>(clientOptions.jsonMapper)

        override fun getAllInstrumentEvents(
            params: InstrumentDataGetAllInstrumentEventsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InstrumentDataGetAllInstrumentEventsResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "instruments", "events")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getAllInstrumentEventsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
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
        ): HttpResponseFor<InstrumentDataGetInstrumentAnalystConsensusResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("instrumentId", params.instrumentId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "instruments", params._pathParam(0), "analyst-reporting")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getInstrumentAnalystConsensusHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
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
        ): HttpResponseFor<InstrumentDataGetInstrumentBalanceSheetStatementsResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("instrumentId", params.instrumentId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "instruments", params._pathParam(0), "balance-sheets")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getInstrumentBalanceSheetStatementsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
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
        ): HttpResponseFor<InstrumentDataGetInstrumentCashFlowStatementsResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getInstrumentCashFlowStatementsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getInstrumentEventsHandler: Handler<InstrumentDataGetInstrumentEventsResponse> =
            jsonHandler<InstrumentDataGetInstrumentEventsResponse>(clientOptions.jsonMapper)

        override fun getInstrumentEvents(
            params: InstrumentDataGetInstrumentEventsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InstrumentDataGetInstrumentEventsResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("instrumentId", params.instrumentId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "instruments", params._pathParam(0), "events")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getInstrumentEventsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
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
        ): HttpResponseFor<InstrumentDataGetInstrumentFundamentalsResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("instrumentId", params.instrumentId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "instruments", params._pathParam(0), "fundamentals")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getInstrumentFundamentalsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
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
        ): HttpResponseFor<InstrumentDataGetInstrumentIncomeStatementsResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("instrumentId", params.instrumentId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "instruments", params._pathParam(0), "income-statements")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
