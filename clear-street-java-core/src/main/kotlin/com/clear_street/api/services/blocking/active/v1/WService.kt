// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.active.v1

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.core.RequestOptions
import com.clear_street.api.core.http.HttpResponse
import com.clear_street.api.models.active.v1.ws.WWebsocketHandlerParams
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

/** Active Websocket. */
interface WService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): WService

    /** Upgrade the HTTP connection to a WebSocket and echo incoming messages. */
    fun websocketHandler() = websocketHandler(WWebsocketHandlerParams.none())

    /** @see websocketHandler */
    fun websocketHandler(
        params: WWebsocketHandlerParams = WWebsocketHandlerParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see websocketHandler */
    fun websocketHandler(params: WWebsocketHandlerParams = WWebsocketHandlerParams.none()) =
        websocketHandler(params, RequestOptions.none())

    /** @see websocketHandler */
    fun websocketHandler(requestOptions: RequestOptions) =
        websocketHandler(WWebsocketHandlerParams.none(), requestOptions)

    /** A view of [WService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): WService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /active/v1/ws`, but is otherwise the same as
         * [WService.websocketHandler].
         */
        @MustBeClosed
        fun websocketHandler(): HttpResponse = websocketHandler(WWebsocketHandlerParams.none())

        /** @see websocketHandler */
        @MustBeClosed
        fun websocketHandler(
            params: WWebsocketHandlerParams = WWebsocketHandlerParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see websocketHandler */
        @MustBeClosed
        fun websocketHandler(
            params: WWebsocketHandlerParams = WWebsocketHandlerParams.none()
        ): HttpResponse = websocketHandler(params, RequestOptions.none())

        /** @see websocketHandler */
        @MustBeClosed
        fun websocketHandler(requestOptions: RequestOptions): HttpResponse =
            websocketHandler(WWebsocketHandlerParams.none(), requestOptions)
    }
}
