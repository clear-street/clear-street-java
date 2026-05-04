// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.v1.instruments

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
import com.clear_street.api.models.v1.instruments.fundamentals.FundamentalGetInstrumentFundamentalsParams
import com.clear_street.api.models.v1.instruments.fundamentals.FundamentalGetInstrumentFundamentalsResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Retrieve details and lists of tradable instruments. */
class FundamentalServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    FundamentalService {

    private val withRawResponse: FundamentalService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): FundamentalService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): FundamentalService =
        FundamentalServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun getInstrumentFundamentals(
        params: FundamentalGetInstrumentFundamentalsParams,
        requestOptions: RequestOptions,
    ): FundamentalGetInstrumentFundamentalsResponse =
        // get /v1/instruments/{instrument_id}/fundamentals
        withRawResponse().getInstrumentFundamentals(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        FundamentalService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): FundamentalService.WithRawResponse =
            FundamentalServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val getInstrumentFundamentalsHandler:
            Handler<FundamentalGetInstrumentFundamentalsResponse> =
            jsonHandler<FundamentalGetInstrumentFundamentalsResponse>(clientOptions.jsonMapper)

        override fun getInstrumentFundamentals(
            params: FundamentalGetInstrumentFundamentalsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FundamentalGetInstrumentFundamentalsResponse> {
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
    }
}
