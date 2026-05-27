// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.services.async.v1.AccountServiceAsync
import com.clear_street.api.services.async.v1.ApiVersionServiceAsync
import com.clear_street.api.services.async.v1.CalendarServiceAsync
import com.clear_street.api.services.async.v1.InstrumentDataServiceAsync
import com.clear_street.api.services.async.v1.InstrumentServiceAsync
import com.clear_street.api.services.async.v1.OmniAiServiceAsync
import com.clear_street.api.services.async.v1.OrderServiceAsync
import com.clear_street.api.services.async.v1.PositionServiceAsync
import com.clear_street.api.services.async.v1.WatchlistServiceAsync
import com.clear_street.api.services.async.v1.WebsocketServiceAsync
import java.util.function.Consumer

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

    /** Endpoints for API service metadata. */
    fun apiVersion(): ApiVersionServiceAsync

    /** Access clocks and financial calendars for market sessions and events. */
    fun calendar(): CalendarServiceAsync

    /** Retrieve instrument analytics, market data, news, and related reference data. */
    fun instrumentData(): InstrumentDataServiceAsync

    /** Retrieve core details and discovery endpoints for tradable instruments. */
    fun instruments(): InstrumentServiceAsync

    fun omniAi(): OmniAiServiceAsync

    /** Place, monitor, and manage trading orders. */
    fun orders(): OrderServiceAsync

    /** View positions and manage position instructions. */
    fun positions(): PositionServiceAsync

    /** Create and manage watchlists. */
    fun watchlist(): WatchlistServiceAsync

    /** Active Websocket. */
    fun websocket(): WebsocketServiceAsync

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

        /** Endpoints for API service metadata. */
        fun apiVersion(): ApiVersionServiceAsync.WithRawResponse

        /** Access clocks and financial calendars for market sessions and events. */
        fun calendar(): CalendarServiceAsync.WithRawResponse

        /** Retrieve instrument analytics, market data, news, and related reference data. */
        fun instrumentData(): InstrumentDataServiceAsync.WithRawResponse

        /** Retrieve core details and discovery endpoints for tradable instruments. */
        fun instruments(): InstrumentServiceAsync.WithRawResponse

        fun omniAi(): OmniAiServiceAsync.WithRawResponse

        /** Place, monitor, and manage trading orders. */
        fun orders(): OrderServiceAsync.WithRawResponse

        /** View positions and manage position instructions. */
        fun positions(): PositionServiceAsync.WithRawResponse

        /** Create and manage watchlists. */
        fun watchlist(): WatchlistServiceAsync.WithRawResponse

        /** Active Websocket. */
        fun websocket(): WebsocketServiceAsync.WithRawResponse
    }
}
