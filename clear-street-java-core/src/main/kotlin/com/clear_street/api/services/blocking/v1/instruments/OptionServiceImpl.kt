// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.v1.instruments

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
import com.clear_street.api.models.v1.instruments.options.OptionGetOptionContractsParams
import com.clear_street.api.models.v1.instruments.options.OptionGetOptionContractsResponse
import java.util.function.Consumer

/** Retrieve details and lists of tradable instruments. */
class OptionServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    OptionService {

    private val withRawResponse: OptionService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): OptionService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): OptionService =
        OptionServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun getOptionContracts(
        params: OptionGetOptionContractsParams,
        requestOptions: RequestOptions,
    ): OptionGetOptionContractsResponse =
        // get /v1/instruments/options/contracts
        withRawResponse().getOptionContracts(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        OptionService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): OptionService.WithRawResponse =
            OptionServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val getOptionContractsHandler: Handler<OptionGetOptionContractsResponse> =
            jsonHandler<OptionGetOptionContractsResponse>(clientOptions.jsonMapper)

        override fun getOptionContracts(
            params: OptionGetOptionContractsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<OptionGetOptionContractsResponse> {
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
    }
}
