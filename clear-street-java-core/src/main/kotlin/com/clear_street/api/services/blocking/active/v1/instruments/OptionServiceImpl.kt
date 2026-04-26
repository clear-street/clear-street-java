// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.active.v1.instruments

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
import com.clear_street.api.models.active.v1.instruments.options.OptionContractsParams
import com.clear_street.api.models.active.v1.instruments.options.OptionContractsResponse
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

    override fun contracts(
        params: OptionContractsParams,
        requestOptions: RequestOptions,
    ): OptionContractsResponse =
        // get /active/v1/instruments/options/contracts
        withRawResponse().contracts(params, requestOptions).parse()

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

        private val contractsHandler: Handler<OptionContractsResponse> =
            jsonHandler<OptionContractsResponse>(clientOptions.jsonMapper)

        override fun contracts(
            params: OptionContractsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<OptionContractsResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("active", "v1", "instruments", "options", "contracts")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { contractsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
