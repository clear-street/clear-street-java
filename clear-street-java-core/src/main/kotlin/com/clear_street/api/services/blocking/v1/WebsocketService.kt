// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.v1

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.core.RequestOptions
import com.clear_street.api.core.http.HttpResponse
import com.clear_street.api.models.v1.websocket.WebsocketWebsocketHandlerParams
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

/** Active Websocket. */
interface WebsocketService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): WebsocketService

    /** Upgrade the HTTP connection to a WebSocket and echo incoming messages. */
    fun websocketHandler() = websocketHandler(WebsocketWebsocketHandlerParams.none())

    /** @see websocketHandler */
    fun websocketHandler(
        params: WebsocketWebsocketHandlerParams = WebsocketWebsocketHandlerParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see websocketHandler */
    fun websocketHandler(
        params: WebsocketWebsocketHandlerParams = WebsocketWebsocketHandlerParams.none()
    ) = websocketHandler(params, RequestOptions.none())

    /** @see websocketHandler */
    fun websocketHandler(requestOptions: RequestOptions) =
        websocketHandler(WebsocketWebsocketHandlerParams.none(), requestOptions)

    /** A view of [WebsocketService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): WebsocketService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/ws`, but is otherwise the same as
         * [WebsocketService.websocketHandler].
         */
        @MustBeClosed
        fun websocketHandler(): HttpResponse =
            websocketHandler(WebsocketWebsocketHandlerParams.none())

        /** @see websocketHandler */
        @MustBeClosed
        fun websocketHandler(
            params: WebsocketWebsocketHandlerParams = WebsocketWebsocketHandlerParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see websocketHandler */
        @MustBeClosed
        fun websocketHandler(
            params: WebsocketWebsocketHandlerParams = WebsocketWebsocketHandlerParams.none()
        ): HttpResponse = websocketHandler(params, RequestOptions.none())

        /** @see websocketHandler */
        @MustBeClosed
        fun websocketHandler(requestOptions: RequestOptions): HttpResponse =
            websocketHandler(WebsocketWebsocketHandlerParams.none(), requestOptions)
    }
}
