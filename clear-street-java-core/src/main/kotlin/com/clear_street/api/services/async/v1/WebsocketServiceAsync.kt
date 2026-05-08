// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.v1

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.core.RequestOptions
import com.clear_street.api.core.http.HttpResponse
import com.clear_street.api.models.v1.websocket.WebsocketWebsocketHandlerParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Active Websocket. */
interface WebsocketServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): WebsocketServiceAsync

    /** Upgrade the HTTP connection to a WebSocket and echo incoming messages. */
    fun websocketHandler(): CompletableFuture<Void?> =
        websocketHandler(WebsocketWebsocketHandlerParams.none())

    /** @see websocketHandler */
    fun websocketHandler(
        params: WebsocketWebsocketHandlerParams = WebsocketWebsocketHandlerParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see websocketHandler */
    fun websocketHandler(
        params: WebsocketWebsocketHandlerParams = WebsocketWebsocketHandlerParams.none()
    ): CompletableFuture<Void?> = websocketHandler(params, RequestOptions.none())

    /** @see websocketHandler */
    fun websocketHandler(requestOptions: RequestOptions): CompletableFuture<Void?> =
        websocketHandler(WebsocketWebsocketHandlerParams.none(), requestOptions)

    /**
     * A view of [WebsocketServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): WebsocketServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/ws`, but is otherwise the same as
         * [WebsocketServiceAsync.websocketHandler].
         */
        fun websocketHandler(): CompletableFuture<HttpResponse> =
            websocketHandler(WebsocketWebsocketHandlerParams.none())

        /** @see websocketHandler */
        fun websocketHandler(
            params: WebsocketWebsocketHandlerParams = WebsocketWebsocketHandlerParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see websocketHandler */
        fun websocketHandler(
            params: WebsocketWebsocketHandlerParams = WebsocketWebsocketHandlerParams.none()
        ): CompletableFuture<HttpResponse> = websocketHandler(params, RequestOptions.none())

        /** @see websocketHandler */
        fun websocketHandler(requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            websocketHandler(WebsocketWebsocketHandlerParams.none(), requestOptions)
    }
}
