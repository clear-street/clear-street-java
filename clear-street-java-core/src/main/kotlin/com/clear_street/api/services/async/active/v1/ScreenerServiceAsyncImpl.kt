// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.active.v1

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
import com.clear_street.api.core.http.json
import com.clear_street.api.core.http.parseable
import com.clear_street.api.core.prepareAsync
import com.clear_street.api.models.active.v1.screener.ScreenerGetScreenerParams
import com.clear_street.api.models.active.v1.screener.ScreenerGetScreenerResponse
import com.clear_street.api.models.active.v1.screener.ScreenerSearchScreenerParams
import com.clear_street.api.models.active.v1.screener.ScreenerSearchScreenerResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Search and manage saved screeners. */
class ScreenerServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ScreenerServiceAsync {

    private val withRawResponse: ScreenerServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ScreenerServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ScreenerServiceAsync =
        ScreenerServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun getScreener(
        params: ScreenerGetScreenerParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ScreenerGetScreenerResponse> =
        // get /active/v1/screener
        withRawResponse().getScreener(params, requestOptions).thenApply { it.parse() }

    override fun searchScreener(
        params: ScreenerSearchScreenerParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ScreenerSearchScreenerResponse> =
        // post /active/v1/screener
        withRawResponse().searchScreener(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ScreenerServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ScreenerServiceAsync.WithRawResponse =
            ScreenerServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val getScreenerHandler: Handler<ScreenerGetScreenerResponse> =
            jsonHandler<ScreenerGetScreenerResponse>(clientOptions.jsonMapper)

        override fun getScreener(
            params: ScreenerGetScreenerParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ScreenerGetScreenerResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("active", "v1", "screener")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getScreenerHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val searchScreenerHandler: Handler<ScreenerSearchScreenerResponse> =
            jsonHandler<ScreenerSearchScreenerResponse>(clientOptions.jsonMapper)

        override fun searchScreener(
            params: ScreenerSearchScreenerParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ScreenerSearchScreenerResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("active", "v1", "screener")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { searchScreenerHandler.handle(it) }
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
