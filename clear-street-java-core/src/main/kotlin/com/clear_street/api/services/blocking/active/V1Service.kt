// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.active

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.services.blocking.active.v1.AccountService
import com.clear_street.api.services.blocking.active.v1.ApiKeyService
import com.clear_street.api.services.blocking.active.v1.CalendarService
import com.clear_street.api.services.blocking.active.v1.ClockService
import com.clear_street.api.services.blocking.active.v1.InstrumentService
import com.clear_street.api.services.blocking.active.v1.IrisService
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

    /** Manage trading accounts and view balances. */
    fun accounts(): AccountService

    /** Manage API keys for authentication. */
    fun apiKeys(): ApiKeyService

    fun calendars(): CalendarService

    /** Access financial calendars for events like earnings, dividends, and splits. */
    fun clock(): ClockService

    /** Retrieve details and lists of tradable instruments. */
    fun instruments(): InstrumentService

    fun iris(): IrisService

    fun marketData(): MarketDataService

    /** Retrieve details and lists of tradable instruments. */
    fun news(): NewsService

    fun omniAi(): OmniAiService

    /** Retrieve details and lists of tradable instruments. */
    fun savedScreeners(): SavedScreenerService

    /** Retrieve details and lists of tradable instruments. */
    fun screener(): ScreenerService

    /** Endpoints for API service metadata. */
    fun version(): VersionService

    /** Retrieve details and lists of tradable instruments. */
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

        /** Manage trading accounts and view balances. */
        fun accounts(): AccountService.WithRawResponse

        /** Manage API keys for authentication. */
        fun apiKeys(): ApiKeyService.WithRawResponse

        fun calendars(): CalendarService.WithRawResponse

        /** Access financial calendars for events like earnings, dividends, and splits. */
        fun clock(): ClockService.WithRawResponse

        /** Retrieve details and lists of tradable instruments. */
        fun instruments(): InstrumentService.WithRawResponse

        fun iris(): IrisService.WithRawResponse

        fun marketData(): MarketDataService.WithRawResponse

        /** Retrieve details and lists of tradable instruments. */
        fun news(): NewsService.WithRawResponse

        fun omniAi(): OmniAiService.WithRawResponse

        /** Retrieve details and lists of tradable instruments. */
        fun savedScreeners(): SavedScreenerService.WithRawResponse

        /** Retrieve details and lists of tradable instruments. */
        fun screener(): ScreenerService.WithRawResponse

        /** Endpoints for API service metadata. */
        fun version(): VersionService.WithRawResponse

        /** Retrieve details and lists of tradable instruments. */
        fun watchlists(): WatchlistService.WithRawResponse

        /** Active Websocket. */
        fun ws(): WService.WithRawResponse
    }
}
