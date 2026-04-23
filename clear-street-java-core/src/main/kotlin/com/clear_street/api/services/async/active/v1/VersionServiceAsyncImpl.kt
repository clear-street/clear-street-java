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
import com.clear_street.api.models.active.v1.version.VersionGetVersionParams
import com.clear_street.api.models.active.v1.version.VersionGetVersionResponse
import com.clear_street.api.models.active.v1.version.VersionUpdateVersionParams
import com.clear_street.api.models.active.v1.version.VersionUpdateVersionResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Endpoints for API service metadata. */
class VersionServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    VersionServiceAsync {

    private val withRawResponse: VersionServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): VersionServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): VersionServiceAsync =
        VersionServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun getVersion(
        params: VersionGetVersionParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<VersionGetVersionResponse> =
        // get /active/v1/version
        withRawResponse().getVersion(params, requestOptions).thenApply { it.parse() }

    override fun updateVersion(
        params: VersionUpdateVersionParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<VersionUpdateVersionResponse> =
        // patch /active/v1/version
        withRawResponse().updateVersion(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        VersionServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): VersionServiceAsync.WithRawResponse =
            VersionServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val getVersionHandler: Handler<VersionGetVersionResponse> =
            jsonHandler<VersionGetVersionResponse>(clientOptions.jsonMapper)

        override fun getVersion(
            params: VersionGetVersionParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<VersionGetVersionResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("active", "v1", "version")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getVersionHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val updateVersionHandler: Handler<VersionUpdateVersionResponse> =
            jsonHandler<VersionUpdateVersionResponse>(clientOptions.jsonMapper)

        override fun updateVersion(
            params: VersionUpdateVersionParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<VersionUpdateVersionResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("active", "v1", "version")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { updateVersionHandler.handle(it) }
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
