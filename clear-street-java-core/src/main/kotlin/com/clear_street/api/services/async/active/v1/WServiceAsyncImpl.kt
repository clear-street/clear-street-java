// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.active.v1

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.core.RequestOptions
import com.clear_street.api.core.handlers.emptyHandler
import com.clear_street.api.core.handlers.errorBodyHandler
import com.clear_street.api.core.handlers.errorHandler
import com.clear_street.api.core.http.HttpMethod
import com.clear_street.api.core.http.HttpRequest
import com.clear_street.api.core.http.HttpResponse
import com.clear_street.api.core.http.HttpResponse.Handler
import com.clear_street.api.core.http.parseable
import com.clear_street.api.core.prepareAsync
import com.clear_street.api.models.active.v1.ws.WWebsocketHandlerParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Active Websocket. */
class WServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    WServiceAsync {

    private val withRawResponse: WServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): WServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): WServiceAsync =
        WServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun websocketHandler(
        params: WWebsocketHandlerParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // get /active/v1/ws
        withRawResponse().websocketHandler(params, requestOptions).thenAccept {}

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        WServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): WServiceAsync.WithRawResponse =
            WServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val websocketHandlerHandler: Handler<Void?> = emptyHandler()

        override fun websocketHandler(
            params: WWebsocketHandlerParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("active", "v1", "ws")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { websocketHandlerHandler.handle(it) }
                    }
                }
        }
    }
}
