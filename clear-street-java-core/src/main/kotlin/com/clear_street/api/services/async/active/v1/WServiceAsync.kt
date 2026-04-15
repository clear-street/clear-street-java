// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.active.v1

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.core.RequestOptions
import com.clear_street.api.core.http.HttpResponse
import com.clear_street.api.models.active.v1.ws.WWebsocketHandlerParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Active Websocket. */
interface WServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): WServiceAsync

    /** Upgrade the HTTP connection to a WebSocket and echo incoming messages. */
    fun websocketHandler(): CompletableFuture<Void?> =
        websocketHandler(WWebsocketHandlerParams.none())

    /** @see websocketHandler */
    fun websocketHandler(
        params: WWebsocketHandlerParams = WWebsocketHandlerParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see websocketHandler */
    fun websocketHandler(
        params: WWebsocketHandlerParams = WWebsocketHandlerParams.none()
    ): CompletableFuture<Void?> = websocketHandler(params, RequestOptions.none())

    /** @see websocketHandler */
    fun websocketHandler(requestOptions: RequestOptions): CompletableFuture<Void?> =
        websocketHandler(WWebsocketHandlerParams.none(), requestOptions)

    /** A view of [WServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): WServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /active/v1/ws`, but is otherwise the same as
         * [WServiceAsync.websocketHandler].
         */
        fun websocketHandler(): CompletableFuture<HttpResponse> =
            websocketHandler(WWebsocketHandlerParams.none())

        /** @see websocketHandler */
        fun websocketHandler(
            params: WWebsocketHandlerParams = WWebsocketHandlerParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see websocketHandler */
        fun websocketHandler(
            params: WWebsocketHandlerParams = WWebsocketHandlerParams.none()
        ): CompletableFuture<HttpResponse> = websocketHandler(params, RequestOptions.none())

        /** @see websocketHandler */
        fun websocketHandler(requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            websocketHandler(WWebsocketHandlerParams.none(), requestOptions)
    }
}
