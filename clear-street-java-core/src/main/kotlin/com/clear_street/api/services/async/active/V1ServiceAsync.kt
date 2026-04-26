// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.active

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.core.RequestOptions
import com.clear_street.api.core.http.HttpResponse
import com.clear_street.api.models.active.v1.V1WsParams
import com.clear_street.api.services.async.active.v1.AccountServiceAsync
import com.clear_street.api.services.async.active.v1.ApiKeyServiceAsync
import com.clear_street.api.services.async.active.v1.CalendarServiceAsync
import com.clear_street.api.services.async.active.v1.ClockServiceAsync
import com.clear_street.api.services.async.active.v1.InstrumentServiceAsync
import com.clear_street.api.services.async.active.v1.MarketDataServiceAsync
import com.clear_street.api.services.async.active.v1.NewsServiceAsync
import com.clear_street.api.services.async.active.v1.OmniAiServiceAsync
import com.clear_street.api.services.async.active.v1.SavedScreenerServiceAsync
import com.clear_street.api.services.async.active.v1.ScreenerServiceAsync
import com.clear_street.api.services.async.active.v1.VersionServiceAsync
import com.clear_street.api.services.async.active.v1.WatchlistServiceAsync
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

    /** Manage API keys for authentication. */
    fun apiKeys(): ApiKeyServiceAsync

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
    fun ws(): CompletableFuture<Void?> = ws(V1WsParams.none())

    /** @see ws */
    fun ws(
        params: V1WsParams = V1WsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see ws */
    fun ws(params: V1WsParams = V1WsParams.none()): CompletableFuture<Void?> =
        ws(params, RequestOptions.none())

    /** @see ws */
    fun ws(requestOptions: RequestOptions): CompletableFuture<Void?> =
        ws(V1WsParams.none(), requestOptions)

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

        /** Manage API keys for authentication. */
        fun apiKeys(): ApiKeyServiceAsync.WithRawResponse

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
         * Returns a raw HTTP response for `get /active/v1/ws`, but is otherwise the same as
         * [V1ServiceAsync.ws].
         */
        fun ws(): CompletableFuture<HttpResponse> = ws(V1WsParams.none())

        /** @see ws */
        fun ws(
            params: V1WsParams = V1WsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see ws */
        fun ws(params: V1WsParams = V1WsParams.none()): CompletableFuture<HttpResponse> =
            ws(params, RequestOptions.none())

        /** @see ws */
        fun ws(requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            ws(V1WsParams.none(), requestOptions)
    }
}
