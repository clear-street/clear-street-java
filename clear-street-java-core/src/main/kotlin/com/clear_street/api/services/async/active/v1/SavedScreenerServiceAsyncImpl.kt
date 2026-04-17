// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.active.v1

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.core.RequestOptions
import com.clear_street.api.core.checkRequired
import com.clear_street.api.core.handlers.emptyHandler
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
import com.clear_street.api.models.active.v1.savedscreeners.SavedScreenerCreateScreenerParams
import com.clear_street.api.models.active.v1.savedscreeners.SavedScreenerCreateScreenerResponse
import com.clear_street.api.models.active.v1.savedscreeners.SavedScreenerDeleteScreenerParams
import com.clear_street.api.models.active.v1.savedscreeners.SavedScreenerGetScreenerByIdParams
import com.clear_street.api.models.active.v1.savedscreeners.SavedScreenerGetScreenerByIdResponse
import com.clear_street.api.models.active.v1.savedscreeners.SavedScreenerGetScreenersParams
import com.clear_street.api.models.active.v1.savedscreeners.SavedScreenerGetScreenersResponse
import com.clear_street.api.models.active.v1.savedscreeners.SavedScreenerReplaceScreenerParams
import com.clear_street.api.models.active.v1.savedscreeners.SavedScreenerReplaceScreenerResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Retrieve details and lists of tradable instruments. */
class SavedScreenerServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    SavedScreenerServiceAsync {

    private val withRawResponse: SavedScreenerServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SavedScreenerServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SavedScreenerServiceAsync =
        SavedScreenerServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun createScreener(
        params: SavedScreenerCreateScreenerParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SavedScreenerCreateScreenerResponse> =
        // post /active/v1/saved-screeners
        withRawResponse().createScreener(params, requestOptions).thenApply { it.parse() }

    override fun deleteScreener(
        params: SavedScreenerDeleteScreenerParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /active/v1/saved-screeners/{screener_id}
        withRawResponse().deleteScreener(params, requestOptions).thenAccept {}

    override fun getScreenerById(
        params: SavedScreenerGetScreenerByIdParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SavedScreenerGetScreenerByIdResponse> =
        // get /active/v1/saved-screeners/{screener_id}
        withRawResponse().getScreenerById(params, requestOptions).thenApply { it.parse() }

    override fun getScreeners(
        params: SavedScreenerGetScreenersParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SavedScreenerGetScreenersResponse> =
        // get /active/v1/saved-screeners
        withRawResponse().getScreeners(params, requestOptions).thenApply { it.parse() }

    override fun replaceScreener(
        params: SavedScreenerReplaceScreenerParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SavedScreenerReplaceScreenerResponse> =
        // put /active/v1/saved-screeners/{screener_id}
        withRawResponse().replaceScreener(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SavedScreenerServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SavedScreenerServiceAsync.WithRawResponse =
            SavedScreenerServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createScreenerHandler: Handler<SavedScreenerCreateScreenerResponse> =
            jsonHandler<SavedScreenerCreateScreenerResponse>(clientOptions.jsonMapper)

        override fun createScreener(
            params: SavedScreenerCreateScreenerParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SavedScreenerCreateScreenerResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("active", "v1", "saved-screeners")
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
            params: SavedScreenerDeleteScreenerParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("screenerId", params.screenerId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("active", "v1", "saved-screeners", params._pathParam(0))
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

        private val getScreenerByIdHandler: Handler<SavedScreenerGetScreenerByIdResponse> =
            jsonHandler<SavedScreenerGetScreenerByIdResponse>(clientOptions.jsonMapper)

        override fun getScreenerById(
            params: SavedScreenerGetScreenerByIdParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SavedScreenerGetScreenerByIdResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("screenerId", params.screenerId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("active", "v1", "saved-screeners", params._pathParam(0))
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

        private val getScreenersHandler: Handler<SavedScreenerGetScreenersResponse> =
            jsonHandler<SavedScreenerGetScreenersResponse>(clientOptions.jsonMapper)

        override fun getScreeners(
            params: SavedScreenerGetScreenersParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SavedScreenerGetScreenersResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("active", "v1", "saved-screeners")
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

        private val replaceScreenerHandler: Handler<SavedScreenerReplaceScreenerResponse> =
            jsonHandler<SavedScreenerReplaceScreenerResponse>(clientOptions.jsonMapper)

        override fun replaceScreener(
            params: SavedScreenerReplaceScreenerParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SavedScreenerReplaceScreenerResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("screenerId", params.screenerId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("active", "v1", "saved-screeners", params._pathParam(0))
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
    }
}
