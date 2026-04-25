// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.active.v1

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
import com.clear_street.api.models.active.v1.instruments.InstrumentGetInstrumentByIdParams
import com.clear_street.api.models.active.v1.instruments.InstrumentGetInstrumentByIdResponse
import com.clear_street.api.models.active.v1.instruments.InstrumentGetInstrumentsParams
import com.clear_street.api.models.active.v1.instruments.InstrumentGetInstrumentsResponse
import com.clear_street.api.services.blocking.active.v1.instruments.AnalystReportingService
import com.clear_street.api.services.blocking.active.v1.instruments.AnalystReportingServiceImpl
import com.clear_street.api.services.blocking.active.v1.instruments.EventService
import com.clear_street.api.services.blocking.active.v1.instruments.EventServiceImpl
import com.clear_street.api.services.blocking.active.v1.instruments.FundamentalService
import com.clear_street.api.services.blocking.active.v1.instruments.FundamentalServiceImpl
import com.clear_street.api.services.blocking.active.v1.instruments.OptionService
import com.clear_street.api.services.blocking.active.v1.instruments.OptionServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Retrieve details and lists of tradable instruments. */
class InstrumentServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    InstrumentService {

    private val withRawResponse: InstrumentService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val analystReporting: AnalystReportingService by lazy {
        AnalystReportingServiceImpl(clientOptions)
    }

    private val events: EventService by lazy { EventServiceImpl(clientOptions) }

    private val fundamentals: FundamentalService by lazy { FundamentalServiceImpl(clientOptions) }

    private val options: OptionService by lazy { OptionServiceImpl(clientOptions) }

    override fun withRawResponse(): InstrumentService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): InstrumentService =
        InstrumentServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** Retrieve details and lists of tradable instruments. */
    override fun analystReporting(): AnalystReportingService = analystReporting

    /** Retrieve details and lists of tradable instruments. */
    override fun events(): EventService = events

    /** Retrieve details and lists of tradable instruments. */
    override fun fundamentals(): FundamentalService = fundamentals

    override fun options(): OptionService = options

    override fun getInstrumentById(
        params: InstrumentGetInstrumentByIdParams,
        requestOptions: RequestOptions,
    ): InstrumentGetInstrumentByIdResponse =
        // get /active/v1/instruments/{security_id_source}/{security_id}
        withRawResponse().getInstrumentById(params, requestOptions).parse()

    override fun getInstruments(
        params: InstrumentGetInstrumentsParams,
        requestOptions: RequestOptions,
    ): InstrumentGetInstrumentsResponse =
        // get /active/v1/instruments
        withRawResponse().getInstruments(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        InstrumentService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val analystReporting: AnalystReportingService.WithRawResponse by lazy {
            AnalystReportingServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val events: EventService.WithRawResponse by lazy {
            EventServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val fundamentals: FundamentalService.WithRawResponse by lazy {
            FundamentalServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val options: OptionService.WithRawResponse by lazy {
            OptionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): InstrumentService.WithRawResponse =
            InstrumentServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** Retrieve details and lists of tradable instruments. */
        override fun analystReporting(): AnalystReportingService.WithRawResponse = analystReporting

        /** Retrieve details and lists of tradable instruments. */
        override fun events(): EventService.WithRawResponse = events

        /** Retrieve details and lists of tradable instruments. */
        override fun fundamentals(): FundamentalService.WithRawResponse = fundamentals

        override fun options(): OptionService.WithRawResponse = options

        private val getInstrumentByIdHandler: Handler<InstrumentGetInstrumentByIdResponse> =
            jsonHandler<InstrumentGetInstrumentByIdResponse>(clientOptions.jsonMapper)

        override fun getInstrumentById(
            params: InstrumentGetInstrumentByIdParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InstrumentGetInstrumentByIdResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getInstrumentByIdHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getInstrumentsHandler: Handler<InstrumentGetInstrumentsResponse> =
            jsonHandler<InstrumentGetInstrumentsResponse>(clientOptions.jsonMapper)

        override fun getInstruments(
            params: InstrumentGetInstrumentsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InstrumentGetInstrumentsResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("active", "v1", "instruments")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
