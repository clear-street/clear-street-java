// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.services.blocking

import com.clearstreet.api.core.ClientOptions
import com.clearstreet.api.services.blocking.v1.AccountService
import com.clearstreet.api.services.blocking.v1.AlertService
import com.clearstreet.api.services.blocking.v1.ApiVersionService
import com.clearstreet.api.services.blocking.v1.CalendarService
import com.clearstreet.api.services.blocking.v1.InstrumentDataService
import com.clearstreet.api.services.blocking.v1.InstrumentService
import com.clearstreet.api.services.blocking.v1.OmniAiService
import com.clearstreet.api.services.blocking.v1.OrderService
import com.clearstreet.api.services.blocking.v1.PositionService
import com.clearstreet.api.services.blocking.v1.ScreenerService
import com.clearstreet.api.services.blocking.v1.WatchlistService
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

    /**
     * Create and manage alerts that watch market and portfolio conditions on an account and notify
     * when they trigger.
     */
    fun alerts(): AlertService

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

    /** Search instruments and manage saved screeners. */
    fun screener(): ScreenerService

    /** Create and manage watchlists. */
    fun watchlist(): WatchlistService

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

        /**
         * Create and manage alerts that watch market and portfolio conditions on an account and
         * notify when they trigger.
         */
        fun alerts(): AlertService.WithRawResponse

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

        /** Search instruments and manage saved screeners. */
        fun screener(): ScreenerService.WithRawResponse

        /** Create and manage watchlists. */
        fun watchlist(): WatchlistService.WithRawResponse
    }
}
