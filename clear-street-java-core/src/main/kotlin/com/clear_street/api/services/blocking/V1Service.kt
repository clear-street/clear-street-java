// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.services.blocking.v1.AccountService
import com.clear_street.api.services.blocking.v1.ApiVersionService
import com.clear_street.api.services.blocking.v1.CalendarService
import com.clear_street.api.services.blocking.v1.InstrumentDataService
import com.clear_street.api.services.blocking.v1.InstrumentService
import com.clear_street.api.services.blocking.v1.OmniAiService
import com.clear_street.api.services.blocking.v1.OrderService
import com.clear_street.api.services.blocking.v1.PositionService
import com.clear_street.api.services.blocking.v1.WatchlistService
import com.clear_street.api.services.blocking.v1.WebsocketService
import java.util.function.Consumer

interface V1Service {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1Service

    /** Manage trading accounts, balances, and portfolio history. */
    fun accounts(): AccountService

    /** Endpoints for API service metadata. */
    fun apiVersion(): ApiVersionService

    /** Access clocks and financial calendars for market sessions and events. */
    fun calendar(): CalendarService

    /** Retrieve instrument analytics, market data, news, and related reference data. */
    fun instrumentData(): InstrumentDataService

    /** Retrieve core details and discovery endpoints for tradable instruments. */
    fun instruments(): InstrumentService

    fun omniAi(): OmniAiService

    /** Place, monitor, and manage trading orders. */
    fun orders(): OrderService

    /** View positions and manage position instructions. */
    fun positions(): PositionService

    /** Create and manage watchlists. */
    fun watchlist(): WatchlistService

    /** Active Websocket. */
    fun websocket(): WebsocketService

    /** A view of [V1Service] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1Service.WithRawResponse

        /** Manage trading accounts, balances, and portfolio history. */
        fun accounts(): AccountService.WithRawResponse

        /** Endpoints for API service metadata. */
        fun apiVersion(): ApiVersionService.WithRawResponse

        /** Access clocks and financial calendars for market sessions and events. */
        fun calendar(): CalendarService.WithRawResponse

        /** Retrieve instrument analytics, market data, news, and related reference data. */
        fun instrumentData(): InstrumentDataService.WithRawResponse

        /** Retrieve core details and discovery endpoints for tradable instruments. */
        fun instruments(): InstrumentService.WithRawResponse

        fun omniAi(): OmniAiService.WithRawResponse

        /** Place, monitor, and manage trading orders. */
        fun orders(): OrderService.WithRawResponse

        /** View positions and manage position instructions. */
        fun positions(): PositionService.WithRawResponse

        /** Create and manage watchlists. */
        fun watchlist(): WatchlistService.WithRawResponse

        /** Active Websocket. */
        fun websocket(): WebsocketService.WithRawResponse
    }
}
