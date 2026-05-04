// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.core.RequestOptions
import com.clear_street.api.core.http.HttpResponse
import com.clear_street.api.models.v1.V1WsParams
import com.clear_street.api.services.blocking.v1.AccountService
import com.clear_street.api.services.blocking.v1.CalendarService
import com.clear_street.api.services.blocking.v1.ClockService
import com.clear_street.api.services.blocking.v1.InstrumentService
import com.clear_street.api.services.blocking.v1.MarketDataService
import com.clear_street.api.services.blocking.v1.NewsService
import com.clear_street.api.services.blocking.v1.OmniAiService
import com.clear_street.api.services.blocking.v1.SavedScreenerService
import com.clear_street.api.services.blocking.v1.ScreenerService
import com.clear_street.api.services.blocking.v1.VersionService
import com.clear_street.api.services.blocking.v1.WatchlistService
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

/** Active Websocket. */
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

    /** Upgrade the HTTP connection to a WebSocket and echo incoming messages. */
    fun ws() = ws(V1WsParams.none())

    /** @see ws */
    fun ws(
        params: V1WsParams = V1WsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see ws */
    fun ws(params: V1WsParams = V1WsParams.none()) = ws(params, RequestOptions.none())

    /** @see ws */
    fun ws(requestOptions: RequestOptions) = ws(V1WsParams.none(), requestOptions)

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

        /**
         * Returns a raw HTTP response for `get /v1/ws`, but is otherwise the same as
         * [V1Service.ws].
         */
        @MustBeClosed fun ws(): HttpResponse = ws(V1WsParams.none())

        /** @see ws */
        @MustBeClosed
        fun ws(
            params: V1WsParams = V1WsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see ws */
        @MustBeClosed
        fun ws(params: V1WsParams = V1WsParams.none()): HttpResponse =
            ws(params, RequestOptions.none())

        /** @see ws */
        @MustBeClosed
        fun ws(requestOptions: RequestOptions): HttpResponse = ws(V1WsParams.none(), requestOptions)
    }
}
