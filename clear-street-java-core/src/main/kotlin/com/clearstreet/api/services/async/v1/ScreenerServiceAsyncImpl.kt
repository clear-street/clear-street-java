// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.services.async.v1

import com.clearstreet.api.core.ClientOptions
import com.clearstreet.api.core.RequestOptions
import com.clearstreet.api.core.checkRequired
import com.clearstreet.api.core.handlers.emptyHandler
import com.clearstreet.api.core.handlers.errorBodyHandler
import com.clearstreet.api.core.handlers.errorHandler
import com.clearstreet.api.core.handlers.jsonHandler
import com.clearstreet.api.core.http.HttpMethod
import com.clearstreet.api.core.http.HttpRequest
import com.clearstreet.api.core.http.HttpResponse
import com.clearstreet.api.core.http.HttpResponse.Handler
import com.clearstreet.api.core.http.HttpResponseFor
import com.clearstreet.api.core.http.json
import com.clearstreet.api.core.http.parseable
import com.clearstreet.api.core.prepareAsync
import com.clearstreet.api.models.v1.screener.ScreenerCreateScreenerParams
import com.clearstreet.api.models.v1.screener.ScreenerCreateScreenerResponse
import com.clearstreet.api.models.v1.screener.ScreenerDeleteScreenerParams
import com.clearstreet.api.models.v1.screener.ScreenerGetScreenerByIdParams
import com.clearstreet.api.models.v1.screener.ScreenerGetScreenerByIdResponse
import com.clearstreet.api.models.v1.screener.ScreenerGetScreenersParams
import com.clearstreet.api.models.v1.screener.ScreenerGetScreenersResponse
import com.clearstreet.api.models.v1.screener.ScreenerReplaceScreenerParams
import com.clearstreet.api.models.v1.screener.ScreenerReplaceScreenerResponse
import com.clearstreet.api.models.v1.screener.ScreenerSearchScreenerParams
import com.clearstreet.api.models.v1.screener.ScreenerSearchScreenerResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Search instruments and manage saved screeners. */
class ScreenerServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ScreenerServiceAsync {

    private val withRawResponse: ScreenerServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ScreenerServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ScreenerServiceAsync =
        ScreenerServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun createScreener(
        params: ScreenerCreateScreenerParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ScreenerCreateScreenerResponse> =
        // post /v1/saved-screeners
        withRawResponse().createScreener(params, requestOptions).thenApply { it.parse() }

    override fun deleteScreener(
        params: ScreenerDeleteScreenerParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /v1/saved-screeners/{screener_id}
        withRawResponse().deleteScreener(params, requestOptions).thenAccept {}

    override fun getScreenerById(
        params: ScreenerGetScreenerByIdParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ScreenerGetScreenerByIdResponse> =
        // get /v1/saved-screeners/{screener_id}
        withRawResponse().getScreenerById(params, requestOptions).thenApply { it.parse() }

    override fun getScreeners(
        params: ScreenerGetScreenersParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ScreenerGetScreenersResponse> =
        // get /v1/saved-screeners
        withRawResponse().getScreeners(params, requestOptions).thenApply { it.parse() }

    override fun replaceScreener(
        params: ScreenerReplaceScreenerParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ScreenerReplaceScreenerResponse> =
        // put /v1/saved-screeners/{screener_id}
        withRawResponse().replaceScreener(params, requestOptions).thenApply { it.parse() }

    override fun searchScreener(
        params: ScreenerSearchScreenerParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ScreenerSearchScreenerResponse> =
        // post /v1/screener
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

        private val createScreenerHandler: Handler<ScreenerCreateScreenerResponse> =
            jsonHandler<ScreenerCreateScreenerResponse>(clientOptions.jsonMapper)

        override fun createScreener(
            params: ScreenerCreateScreenerParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ScreenerCreateScreenerResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "saved-screeners")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createScreenerHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val deleteScreenerHandler: Handler<Void?> = emptyHandler()

        override fun deleteScreener(
            params: ScreenerDeleteScreenerParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("screenerId", params.screenerId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "saved-screeners", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { deleteScreenerHandler.handle(it) }
                    }
                }
        }

        private val getScreenerByIdHandler: Handler<ScreenerGetScreenerByIdResponse> =
            jsonHandler<ScreenerGetScreenerByIdResponse>(clientOptions.jsonMapper)

        override fun getScreenerById(
            params: ScreenerGetScreenerByIdParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ScreenerGetScreenerByIdResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("screenerId", params.screenerId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "saved-screeners", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getScreenerByIdHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getScreenersHandler: Handler<ScreenerGetScreenersResponse> =
            jsonHandler<ScreenerGetScreenersResponse>(clientOptions.jsonMapper)

        override fun getScreeners(
            params: ScreenerGetScreenersParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ScreenerGetScreenersResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "saved-screeners")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getScreenersHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val replaceScreenerHandler: Handler<ScreenerReplaceScreenerResponse> =
            jsonHandler<ScreenerReplaceScreenerResponse>(clientOptions.jsonMapper)

        override fun replaceScreener(
            params: ScreenerReplaceScreenerParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ScreenerReplaceScreenerResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("screenerId", params.screenerId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "saved-screeners", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { replaceScreenerHandler.handle(it) }
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
                    .addPathSegments("v1", "screener")
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
