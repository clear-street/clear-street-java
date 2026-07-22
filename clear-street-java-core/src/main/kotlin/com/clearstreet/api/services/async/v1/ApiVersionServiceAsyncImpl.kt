// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.services.async.v1

import com.clearstreet.api.core.ClientOptions
import com.clearstreet.api.core.RequestOptions
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
import com.clearstreet.api.models.v1.apiversion.ApiVersionGetVersionParams
import com.clearstreet.api.models.v1.apiversion.ApiVersionGetVersionResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Endpoints for API service metadata. */
class ApiVersionServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ApiVersionServiceAsync {

    private val withRawResponse: ApiVersionServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ApiVersionServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ApiVersionServiceAsync =
        ApiVersionServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun getVersion(
        params: ApiVersionGetVersionParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ApiVersionGetVersionResponse> =
        // get /v1/version
        withRawResponse().getVersion(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ApiVersionServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ApiVersionServiceAsync.WithRawResponse =
            ApiVersionServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val getVersionHandler: Handler<ApiVersionGetVersionResponse> =
            jsonHandler<ApiVersionGetVersionResponse>(clientOptions.jsonMapper)

        override fun getVersion(
            params: ApiVersionGetVersionParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ApiVersionGetVersionResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "version")
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
    }
}
