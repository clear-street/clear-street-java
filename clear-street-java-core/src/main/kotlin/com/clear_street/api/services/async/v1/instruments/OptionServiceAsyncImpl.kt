// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.v1.instruments

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
import com.clear_street.api.core.prepareAsync
import com.clear_street.api.models.v1.instruments.options.OptionGetOptionContractsParams
import com.clear_street.api.models.v1.instruments.options.OptionGetOptionContractsResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Retrieve details and lists of tradable instruments. */
class OptionServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    OptionServiceAsync {

    private val withRawResponse: OptionServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): OptionServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): OptionServiceAsync =
        OptionServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun getOptionContracts(
        params: OptionGetOptionContractsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<OptionGetOptionContractsResponse> =
        // get /v1/instruments/options/contracts
        withRawResponse().getOptionContracts(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        OptionServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): OptionServiceAsync.WithRawResponse =
            OptionServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val getOptionContractsHandler: Handler<OptionGetOptionContractsResponse> =
            jsonHandler<OptionGetOptionContractsResponse>(clientOptions.jsonMapper)

        override fun getOptionContracts(
            params: OptionGetOptionContractsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<OptionGetOptionContractsResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "instruments", "options", "contracts")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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
}
