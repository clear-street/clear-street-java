// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.active

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.services.blocking.active.v1.AccountService
import com.clear_street.api.services.blocking.active.v1.ApiKeyService
import com.clear_street.api.services.blocking.active.v1.CalendarService
import com.clear_street.api.services.blocking.active.v1.ClockService
import com.clear_street.api.services.blocking.active.v1.InstrumentService
import com.clear_street.api.services.blocking.active.v1.MarketDataService
import com.clear_street.api.services.blocking.active.v1.NewsService
import com.clear_street.api.services.blocking.active.v1.OmniAiService
import com.clear_street.api.services.blocking.active.v1.SavedScreenerService
import com.clear_street.api.services.blocking.active.v1.ScreenerService
import com.clear_street.api.services.blocking.active.v1.VersionService
import com.clear_street.api.services.blocking.active.v1.WService
import com.clear_street.api.services.blocking.active.v1.WatchlistService
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

    /** Manage API keys for authentication. */
    fun apiKeys(): ApiKeyService

    fun calendars(): CalendarService

    /** Access financial calendars for events like earnings, dividends, and splits. */
    fun clock(): ClockService

    /** Retrieve details and lists of tradable instruments. */
    fun instruments(): InstrumentService

    fun marketData(): MarketDataService

    /** Retrieve market news and related instrument metadata. */
    fun news(): NewsService

    fun omniAi(): OmniAiService

    /** Search and manage saved screeners. */
    fun savedScreeners(): SavedScreenerService

    /** Search and manage saved screeners. */
    fun screener(): ScreenerService

    /** Endpoints for API service metadata. */
    fun version(): VersionService

    /** Create and manage watchlists. */
    fun watchlists(): WatchlistService

    /** Active Websocket. */
    fun ws(): WService

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

        /** Manage API keys for authentication. */
        fun apiKeys(): ApiKeyService.WithRawResponse

        fun calendars(): CalendarService.WithRawResponse

        /** Access financial calendars for events like earnings, dividends, and splits. */
        fun clock(): ClockService.WithRawResponse

        /** Retrieve details and lists of tradable instruments. */
        fun instruments(): InstrumentService.WithRawResponse

        fun marketData(): MarketDataService.WithRawResponse

        /** Retrieve market news and related instrument metadata. */
        fun news(): NewsService.WithRawResponse

        fun omniAi(): OmniAiService.WithRawResponse

        /** Search and manage saved screeners. */
        fun savedScreeners(): SavedScreenerService.WithRawResponse

        /** Search and manage saved screeners. */
        fun screener(): ScreenerService.WithRawResponse

        /** Endpoints for API service metadata. */
        fun version(): VersionService.WithRawResponse

        /** Create and manage watchlists. */
        fun watchlists(): WatchlistService.WithRawResponse

        /** Active Websocket. */
        fun ws(): WService.WithRawResponse
    }
}
