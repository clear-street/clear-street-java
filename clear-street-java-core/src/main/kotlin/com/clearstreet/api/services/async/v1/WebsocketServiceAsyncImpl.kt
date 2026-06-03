// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.services.async.v1

import com.clearstreet.api.core.ClientOptions
import com.clearstreet.api.core.RequestOptions
import com.clearstreet.api.core.handlers.emptyHandler
import com.clearstreet.api.core.handlers.errorBodyHandler
import com.clearstreet.api.core.handlers.errorHandler
import com.clearstreet.api.core.http.HttpMethod
import com.clearstreet.api.core.http.HttpRequest
import com.clearstreet.api.core.http.HttpResponse
import com.clearstreet.api.core.http.HttpResponse.Handler
import com.clearstreet.api.core.http.parseable
import com.clearstreet.api.core.prepareAsync
import com.clearstreet.api.models.v1.websocket.WebsocketWebsocketHandlerParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Active Websocket. */
class WebsocketServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    WebsocketServiceAsync {

    private val withRawResponse: WebsocketServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): WebsocketServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): WebsocketServiceAsync =
        WebsocketServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun websocketHandler(
        params: WebsocketWebsocketHandlerParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // get /v1/ws
        withRawResponse().websocketHandler(params, requestOptions).thenAccept {}

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        WebsocketServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): WebsocketServiceAsync.WithRawResponse =
            WebsocketServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val websocketHandlerHandler: Handler<Void?> = emptyHandler()

        override fun websocketHandler(
            params: WebsocketWebsocketHandlerParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "ws")
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
