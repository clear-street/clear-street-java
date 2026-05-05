// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.core.RequestOptions
import com.clear_street.api.core.http.HttpResponse
import com.clear_street.api.models.v1.V1WebsocketHandlerParams
import com.clear_street.api.services.async.v1.AccountServiceAsync
import com.clear_street.api.services.async.v1.CalendarServiceAsync
import com.clear_street.api.services.async.v1.ClockServiceAsync
import com.clear_street.api.services.async.v1.InstrumentServiceAsync
import com.clear_street.api.services.async.v1.MarketDataServiceAsync
import com.clear_street.api.services.async.v1.NewsServiceAsync
import com.clear_street.api.services.async.v1.OmniAiServiceAsync
import com.clear_street.api.services.async.v1.SavedScreenerServiceAsync
import com.clear_street.api.services.async.v1.ScreenerServiceAsync
import com.clear_street.api.services.async.v1.VersionServiceAsync
import com.clear_street.api.services.async.v1.WatchlistServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Active Websocket. */
interface V1ServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1ServiceAsync

    /** Manage trading accounts, balances, and portfolio history. */
    fun accounts(): AccountServiceAsync

    fun calendars(): CalendarServiceAsync

    /** Access financial calendars for events like earnings, dividends, and splits. */
    fun clock(): ClockServiceAsync

    /** Retrieve details and lists of tradable instruments. */
    fun instruments(): InstrumentServiceAsync

    fun marketData(): MarketDataServiceAsync

    /** Retrieve market news and related instrument metadata. */
    fun news(): NewsServiceAsync

    fun omniAi(): OmniAiServiceAsync

    /** Search and manage saved screeners. */
    fun savedScreeners(): SavedScreenerServiceAsync

    /** Search and manage saved screeners. */
    fun screener(): ScreenerServiceAsync

    /** Endpoints for API service metadata. */
    fun version(): VersionServiceAsync

    /** Create and manage watchlists. */
    fun watchlists(): WatchlistServiceAsync

    /** Upgrade the HTTP connection to a WebSocket and echo incoming messages. */
    fun websocketHandler(): CompletableFuture<Void?> =
        websocketHandler(V1WebsocketHandlerParams.none())

    /** @see websocketHandler */
    fun websocketHandler(
        params: V1WebsocketHandlerParams = V1WebsocketHandlerParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see websocketHandler */
    fun websocketHandler(
        params: V1WebsocketHandlerParams = V1WebsocketHandlerParams.none()
    ): CompletableFuture<Void?> = websocketHandler(params, RequestOptions.none())

    /** @see websocketHandler */
    fun websocketHandler(requestOptions: RequestOptions): CompletableFuture<Void?> =
        websocketHandler(V1WebsocketHandlerParams.none(), requestOptions)

    /** A view of [V1ServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1ServiceAsync.WithRawResponse

        /** Manage trading accounts, balances, and portfolio history. */
        fun accounts(): AccountServiceAsync.WithRawResponse

        fun calendars(): CalendarServiceAsync.WithRawResponse

        /** Access financial calendars for events like earnings, dividends, and splits. */
        fun clock(): ClockServiceAsync.WithRawResponse

        /** Retrieve details and lists of tradable instruments. */
        fun instruments(): InstrumentServiceAsync.WithRawResponse

        fun marketData(): MarketDataServiceAsync.WithRawResponse

        /** Retrieve market news and related instrument metadata. */
        fun news(): NewsServiceAsync.WithRawResponse

        fun omniAi(): OmniAiServiceAsync.WithRawResponse

        /** Search and manage saved screeners. */
        fun savedScreeners(): SavedScreenerServiceAsync.WithRawResponse

        /** Search and manage saved screeners. */
        fun screener(): ScreenerServiceAsync.WithRawResponse

        /** Endpoints for API service metadata. */
        fun version(): VersionServiceAsync.WithRawResponse

        /** Create and manage watchlists. */
        fun watchlists(): WatchlistServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/ws`, but is otherwise the same as
         * [V1ServiceAsync.websocketHandler].
         */
        fun websocketHandler(): CompletableFuture<HttpResponse> =
            websocketHandler(V1WebsocketHandlerParams.none())

        /** @see websocketHandler */
        fun websocketHandler(
            params: V1WebsocketHandlerParams = V1WebsocketHandlerParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see websocketHandler */
        fun websocketHandler(
            params: V1WebsocketHandlerParams = V1WebsocketHandlerParams.none()
        ): CompletableFuture<HttpResponse> = websocketHandler(params, RequestOptions.none())

        /** @see websocketHandler */
        fun websocketHandler(requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            websocketHandler(V1WebsocketHandlerParams.none(), requestOptions)
    }
}
