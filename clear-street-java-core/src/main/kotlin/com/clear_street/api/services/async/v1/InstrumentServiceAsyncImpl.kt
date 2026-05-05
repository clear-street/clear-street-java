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
import com.clear_street.api.models.v1.instruments.InstrumentGetInstrumentByIdParams
import com.clear_street.api.models.v1.instruments.InstrumentGetInstrumentByIdResponse
import com.clear_street.api.models.v1.instruments.InstrumentGetInstrumentsParams
import com.clear_street.api.models.v1.instruments.InstrumentGetInstrumentsResponse
import com.clear_street.api.models.v1.instruments.InstrumentSearchInstrumentsParams
import com.clear_street.api.models.v1.instruments.InstrumentSearchInstrumentsResponse
import com.clear_street.api.services.async.v1.instruments.AnalystReportingServiceAsync
import com.clear_street.api.services.async.v1.instruments.AnalystReportingServiceAsyncImpl
import com.clear_street.api.services.async.v1.instruments.BalanceSheetServiceAsync
import com.clear_street.api.services.async.v1.instruments.BalanceSheetServiceAsyncImpl
import com.clear_street.api.services.async.v1.instruments.CashFlowStatementServiceAsync
import com.clear_street.api.services.async.v1.instruments.CashFlowStatementServiceAsyncImpl
import com.clear_street.api.services.async.v1.instruments.EventServiceAsync
import com.clear_street.api.services.async.v1.instruments.EventServiceAsyncImpl
import com.clear_street.api.services.async.v1.instruments.FundamentalServiceAsync
import com.clear_street.api.services.async.v1.instruments.FundamentalServiceAsyncImpl
import com.clear_street.api.services.async.v1.instruments.IncomeStatementServiceAsync
import com.clear_street.api.services.async.v1.instruments.IncomeStatementServiceAsyncImpl
import com.clear_street.api.services.async.v1.instruments.OptionServiceAsync
import com.clear_street.api.services.async.v1.instruments.OptionServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Retrieve details and lists of tradable instruments. */
class InstrumentServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    InstrumentServiceAsync {

    private val withRawResponse: InstrumentServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val analystReporting: AnalystReportingServiceAsync by lazy {
        AnalystReportingServiceAsyncImpl(clientOptions)
    }

    private val balanceSheets: BalanceSheetServiceAsync by lazy {
        BalanceSheetServiceAsyncImpl(clientOptions)
    }

    private val cashFlowStatements: CashFlowStatementServiceAsync by lazy {
        CashFlowStatementServiceAsyncImpl(clientOptions)
    }

    private val events: EventServiceAsync by lazy { EventServiceAsyncImpl(clientOptions) }

    private val fundamentals: FundamentalServiceAsync by lazy {
        FundamentalServiceAsyncImpl(clientOptions)
    }

    private val incomeStatements: IncomeStatementServiceAsync by lazy {
        IncomeStatementServiceAsyncImpl(clientOptions)
    }

    private val options: OptionServiceAsync by lazy { OptionServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): InstrumentServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): InstrumentServiceAsync =
        InstrumentServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** Retrieve details and lists of tradable instruments. */
    override fun analystReporting(): AnalystReportingServiceAsync = analystReporting

    /** Retrieve details and lists of tradable instruments. */
    override fun balanceSheets(): BalanceSheetServiceAsync = balanceSheets

    /** Retrieve details and lists of tradable instruments. */
    override fun cashFlowStatements(): CashFlowStatementServiceAsync = cashFlowStatements

    /** Retrieve details and lists of tradable instruments. */
    override fun events(): EventServiceAsync = events

    /** Retrieve details and lists of tradable instruments. */
    override fun fundamentals(): FundamentalServiceAsync = fundamentals

    /** Retrieve details and lists of tradable instruments. */
    override fun incomeStatements(): IncomeStatementServiceAsync = incomeStatements

    /** Retrieve details and lists of tradable instruments. */
    override fun options(): OptionServiceAsync = options

    override fun getInstrumentById(
        params: InstrumentGetInstrumentByIdParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<InstrumentGetInstrumentByIdResponse> =
        // get /v1/instruments/{instrument_id}
        withRawResponse().getInstrumentById(params, requestOptions).thenApply { it.parse() }

    override fun getInstruments(
        params: InstrumentGetInstrumentsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<InstrumentGetInstrumentsResponse> =
        // get /v1/instruments
        withRawResponse().getInstruments(params, requestOptions).thenApply { it.parse() }

    override fun searchInstruments(
        params: InstrumentSearchInstrumentsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<InstrumentSearchInstrumentsResponse> =
        // get /v1/instruments/search
        withRawResponse().searchInstruments(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        InstrumentServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val analystReporting: AnalystReportingServiceAsync.WithRawResponse by lazy {
            AnalystReportingServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val balanceSheets: BalanceSheetServiceAsync.WithRawResponse by lazy {
            BalanceSheetServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val cashFlowStatements: CashFlowStatementServiceAsync.WithRawResponse by lazy {
            CashFlowStatementServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val events: EventServiceAsync.WithRawResponse by lazy {
            EventServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val fundamentals: FundamentalServiceAsync.WithRawResponse by lazy {
            FundamentalServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val incomeStatements: IncomeStatementServiceAsync.WithRawResponse by lazy {
            IncomeStatementServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val options: OptionServiceAsync.WithRawResponse by lazy {
            OptionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): InstrumentServiceAsync.WithRawResponse =
            InstrumentServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** Retrieve details and lists of tradable instruments. */
        override fun analystReporting(): AnalystReportingServiceAsync.WithRawResponse =
            analystReporting

        /** Retrieve details and lists of tradable instruments. */
        override fun balanceSheets(): BalanceSheetServiceAsync.WithRawResponse = balanceSheets

        /** Retrieve details and lists of tradable instruments. */
        override fun cashFlowStatements(): CashFlowStatementServiceAsync.WithRawResponse =
            cashFlowStatements

        /** Retrieve details and lists of tradable instruments. */
        override fun events(): EventServiceAsync.WithRawResponse = events

        /** Retrieve details and lists of tradable instruments. */
        override fun fundamentals(): FundamentalServiceAsync.WithRawResponse = fundamentals

        /** Retrieve details and lists of tradable instruments. */
        override fun incomeStatements(): IncomeStatementServiceAsync.WithRawResponse =
            incomeStatements

        /** Retrieve details and lists of tradable instruments. */
        override fun options(): OptionServiceAsync.WithRawResponse = options

        private val getInstrumentByIdHandler: Handler<InstrumentGetInstrumentByIdResponse> =
            jsonHandler<InstrumentGetInstrumentByIdResponse>(clientOptions.jsonMapper)

        override fun getInstrumentById(
            params: InstrumentGetInstrumentByIdParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InstrumentGetInstrumentByIdResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("instrumentId", params.instrumentId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "instruments", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getInstrumentByIdHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getInstrumentsHandler: Handler<InstrumentGetInstrumentsResponse> =
            jsonHandler<InstrumentGetInstrumentsResponse>(clientOptions.jsonMapper)

        override fun getInstruments(
            params: InstrumentGetInstrumentsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InstrumentGetInstrumentsResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "instruments")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getInstrumentsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val searchInstrumentsHandler: Handler<InstrumentSearchInstrumentsResponse> =
            jsonHandler<InstrumentSearchInstrumentsResponse>(clientOptions.jsonMapper)

        override fun searchInstruments(
            params: InstrumentSearchInstrumentsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InstrumentSearchInstrumentsResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "instruments", "search")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { searchInstrumentsHandler.handle(it) }
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
