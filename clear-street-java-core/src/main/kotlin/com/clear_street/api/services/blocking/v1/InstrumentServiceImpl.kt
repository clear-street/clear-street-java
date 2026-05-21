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
import com.clear_street.api.models.v1.instruments.InstrumentGetInstrumentByIdParams
import com.clear_street.api.models.v1.instruments.InstrumentGetInstrumentByIdResponse
import com.clear_street.api.models.v1.instruments.InstrumentGetInstrumentsParams
import com.clear_street.api.models.v1.instruments.InstrumentGetInstrumentsResponse
import com.clear_street.api.models.v1.instruments.InstrumentGetOptionContractsParams
import com.clear_street.api.models.v1.instruments.InstrumentGetOptionContractsResponse
import com.clear_street.api.models.v1.instruments.InstrumentSearchInstrumentsParams
import com.clear_street.api.models.v1.instruments.InstrumentSearchInstrumentsResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Retrieve core details and discovery endpoints for tradable instruments. */
class InstrumentServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    InstrumentService {

    private val withRawResponse: InstrumentService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): InstrumentService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): InstrumentService =
        InstrumentServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun getInstrumentById(
        params: InstrumentGetInstrumentByIdParams,
        requestOptions: RequestOptions,
    ): InstrumentGetInstrumentByIdResponse =
        // get /v1/instruments/{instrument_id}
        withRawResponse().getInstrumentById(params, requestOptions).parse()

    override fun getInstruments(
        params: InstrumentGetInstrumentsParams,
        requestOptions: RequestOptions,
    ): InstrumentGetInstrumentsResponse =
        // get /v1/instruments
        withRawResponse().getInstruments(params, requestOptions).parse()

    override fun getOptionContracts(
        params: InstrumentGetOptionContractsParams,
        requestOptions: RequestOptions,
    ): InstrumentGetOptionContractsResponse =
        // get /v1/instruments/options/contracts
        withRawResponse().getOptionContracts(params, requestOptions).parse()

    override fun searchInstruments(
        params: InstrumentSearchInstrumentsParams,
        requestOptions: RequestOptions,
    ): InstrumentSearchInstrumentsResponse =
        // get /v1/instruments/search
        withRawResponse().searchInstruments(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        InstrumentService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): InstrumentService.WithRawResponse =
            InstrumentServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val getInstrumentByIdHandler: Handler<InstrumentGetInstrumentByIdResponse> =
            jsonHandler<InstrumentGetInstrumentByIdResponse>(clientOptions.jsonMapper)

        override fun getInstrumentById(
            params: InstrumentGetInstrumentByIdParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InstrumentGetInstrumentByIdResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("instrumentId", params.instrumentId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "instruments", params._pathParam(0))
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
                    .addPathSegments("v1", "instruments")
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

        private val getOptionContractsHandler: Handler<InstrumentGetOptionContractsResponse> =
            jsonHandler<InstrumentGetOptionContractsResponse>(clientOptions.jsonMapper)

        override fun getOptionContracts(
            params: InstrumentGetOptionContractsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InstrumentGetOptionContractsResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "instruments", "options", "contracts")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getOptionContractsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val searchInstrumentsHandler: Handler<InstrumentSearchInstrumentsResponse> =
            jsonHandler<InstrumentSearchInstrumentsResponse>(clientOptions.jsonMapper)

        override fun searchInstruments(
            params: InstrumentSearchInstrumentsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InstrumentSearchInstrumentsResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "instruments", "search")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
