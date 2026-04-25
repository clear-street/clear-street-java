// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.active.v1

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
import com.clear_street.api.models.active.v1.instruments.InstrumentGetInstrumentByIdParams
import com.clear_street.api.models.active.v1.instruments.InstrumentGetInstrumentByIdResponse
import com.clear_street.api.models.active.v1.instruments.InstrumentGetInstrumentsParams
import com.clear_street.api.models.active.v1.instruments.InstrumentGetInstrumentsResponse
import com.clear_street.api.services.async.active.v1.instruments.AnalystReportingServiceAsync
import com.clear_street.api.services.async.active.v1.instruments.AnalystReportingServiceAsyncImpl
import com.clear_street.api.services.async.active.v1.instruments.EventServiceAsync
import com.clear_street.api.services.async.active.v1.instruments.EventServiceAsyncImpl
import com.clear_street.api.services.async.active.v1.instruments.FundamentalServiceAsync
import com.clear_street.api.services.async.active.v1.instruments.FundamentalServiceAsyncImpl
import com.clear_street.api.services.async.active.v1.instruments.OptionServiceAsync
import com.clear_street.api.services.async.active.v1.instruments.OptionServiceAsyncImpl
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

    private val events: EventServiceAsync by lazy { EventServiceAsyncImpl(clientOptions) }

    private val fundamentals: FundamentalServiceAsync by lazy {
        FundamentalServiceAsyncImpl(clientOptions)
    }

    private val options: OptionServiceAsync by lazy { OptionServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): InstrumentServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): InstrumentServiceAsync =
        InstrumentServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** Retrieve details and lists of tradable instruments. */
    override fun analystReporting(): AnalystReportingServiceAsync = analystReporting

    /** Retrieve details and lists of tradable instruments. */
    override fun events(): EventServiceAsync = events

    /** Retrieve details and lists of tradable instruments. */
    override fun fundamentals(): FundamentalServiceAsync = fundamentals

    override fun options(): OptionServiceAsync = options

    override fun getInstrumentById(
        params: InstrumentGetInstrumentByIdParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<InstrumentGetInstrumentByIdResponse> =
        // get /active/v1/instruments/{security_id_source}/{security_id}
        withRawResponse().getInstrumentById(params, requestOptions).thenApply { it.parse() }

    override fun getInstruments(
        params: InstrumentGetInstrumentsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<InstrumentGetInstrumentsResponse> =
        // get /active/v1/instruments
        withRawResponse().getInstruments(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        InstrumentServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val analystReporting: AnalystReportingServiceAsync.WithRawResponse by lazy {
            AnalystReportingServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val events: EventServiceAsync.WithRawResponse by lazy {
            EventServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val fundamentals: FundamentalServiceAsync.WithRawResponse by lazy {
            FundamentalServiceAsyncImpl.WithRawResponseImpl(clientOptions)
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
        override fun events(): EventServiceAsync.WithRawResponse = events

        /** Retrieve details and lists of tradable instruments. */
        override fun fundamentals(): FundamentalServiceAsync.WithRawResponse = fundamentals

        override fun options(): OptionServiceAsync.WithRawResponse = options

        private val getInstrumentByIdHandler: Handler<InstrumentGetInstrumentByIdResponse> =
            jsonHandler<InstrumentGetInstrumentByIdResponse>(clientOptions.jsonMapper)

        override fun getInstrumentById(
            params: InstrumentGetInstrumentByIdParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InstrumentGetInstrumentByIdResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("securityId", params.securityId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "active",
                        "v1",
                        "instruments",
                        params._pathParam(0),
                        params._pathParam(1),
                    )
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
                    .addPathSegments("active", "v1", "instruments")
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
    }
}
