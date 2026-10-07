// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.services.async.v1

import com.clearstreet.api.core.ClientOptions
import com.clearstreet.api.core.RequestOptions
import com.clearstreet.api.core.checkRequired
import com.clearstreet.api.core.handlers.errorBodyHandler
import com.clearstreet.api.core.handlers.errorHandler
import com.clearstreet.api.core.handlers.jsonHandler
import com.clearstreet.api.core.http.HttpMethod
import com.clearstreet.api.core.http.HttpRequest
import com.clearstreet.api.core.http.HttpResponse
import com.clearstreet.api.core.http.HttpResponse.Handler
import com.clearstreet.api.core.http.HttpResponseFor
import com.clearstreet.api.core.http.parseable
import com.clearstreet.api.core.prepareAsync
import com.clearstreet.api.models.v1.locates.LocateGetLocateRateByIdParams
import com.clearstreet.api.models.v1.locates.LocateGetLocateRateByIdResponse
import com.clearstreet.api.models.v1.locates.LocateGetLocateRatesParams
import com.clearstreet.api.models.v1.locates.LocateGetLocateRatesResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Query locate requests, granted locates, and cached locate borrow rates. */
class LocateServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    LocateServiceAsync {

    private val withRawResponse: LocateServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): LocateServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): LocateServiceAsync =
        LocateServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun getLocateRateById(
        params: LocateGetLocateRateByIdParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<LocateGetLocateRateByIdResponse> =
        // get /v1/locates/rates/{instrument_id}
        withRawResponse().getLocateRateById(params, requestOptions).thenApply { it.parse() }

    override fun getLocateRates(
        params: LocateGetLocateRatesParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<LocateGetLocateRatesResponse> =
        // get /v1/locates/rates
        withRawResponse().getLocateRates(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        LocateServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): LocateServiceAsync.WithRawResponse =
            LocateServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val getLocateRateByIdHandler: Handler<LocateGetLocateRateByIdResponse> =
            jsonHandler<LocateGetLocateRateByIdResponse>(clientOptions.jsonMapper)

        override fun getLocateRateById(
            params: LocateGetLocateRateByIdParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LocateGetLocateRateByIdResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("instrumentId", params.instrumentId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "locates", "rates", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getLocateRateByIdHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getLocateRatesHandler: Handler<LocateGetLocateRatesResponse> =
            jsonHandler<LocateGetLocateRatesResponse>(clientOptions.jsonMapper)

        override fun getLocateRates(
            params: LocateGetLocateRatesParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LocateGetLocateRatesResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "locates", "rates")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getLocateRatesHandler.handle(it) }
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
