// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.active

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.core.RequestOptions
import com.clear_street.api.core.handlers.emptyHandler
import com.clear_street.api.core.handlers.errorBodyHandler
import com.clear_street.api.core.handlers.errorHandler
import com.clear_street.api.core.http.HttpMethod
import com.clear_street.api.core.http.HttpRequest
import com.clear_street.api.core.http.HttpResponse
import com.clear_street.api.core.http.HttpResponse.Handler
import com.clear_street.api.core.http.parseable
import com.clear_street.api.core.prepareAsync
import com.clear_street.api.models.active.v1.V1WsParams
import com.clear_street.api.services.async.active.v1.AccountServiceAsync
import com.clear_street.api.services.async.active.v1.AccountServiceAsyncImpl
import com.clear_street.api.services.async.active.v1.ApiKeyServiceAsync
import com.clear_street.api.services.async.active.v1.ApiKeyServiceAsyncImpl
import com.clear_street.api.services.async.active.v1.CalendarServiceAsync
import com.clear_street.api.services.async.active.v1.CalendarServiceAsyncImpl
import com.clear_street.api.services.async.active.v1.ClockServiceAsync
import com.clear_street.api.services.async.active.v1.ClockServiceAsyncImpl
import com.clear_street.api.services.async.active.v1.InstrumentServiceAsync
import com.clear_street.api.services.async.active.v1.InstrumentServiceAsyncImpl
import com.clear_street.api.services.async.active.v1.MarketDataServiceAsync
import com.clear_street.api.services.async.active.v1.MarketDataServiceAsyncImpl
import com.clear_street.api.services.async.active.v1.NewsServiceAsync
import com.clear_street.api.services.async.active.v1.NewsServiceAsyncImpl
import com.clear_street.api.services.async.active.v1.OmniAiServiceAsync
import com.clear_street.api.services.async.active.v1.OmniAiServiceAsyncImpl
import com.clear_street.api.services.async.active.v1.SavedScreenerServiceAsync
import com.clear_street.api.services.async.active.v1.SavedScreenerServiceAsyncImpl
import com.clear_street.api.services.async.active.v1.ScreenerServiceAsync
import com.clear_street.api.services.async.active.v1.ScreenerServiceAsyncImpl
import com.clear_street.api.services.async.active.v1.VersionServiceAsync
import com.clear_street.api.services.async.active.v1.VersionServiceAsyncImpl
import com.clear_street.api.services.async.active.v1.WatchlistServiceAsync
import com.clear_street.api.services.async.active.v1.WatchlistServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Active Websocket. */
class V1ServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    V1ServiceAsync {

    private val withRawResponse: V1ServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val accounts: AccountServiceAsync by lazy { AccountServiceAsyncImpl(clientOptions) }

    private val apiKeys: ApiKeyServiceAsync by lazy { ApiKeyServiceAsyncImpl(clientOptions) }

    private val calendars: CalendarServiceAsync by lazy { CalendarServiceAsyncImpl(clientOptions) }

    private val clock: ClockServiceAsync by lazy { ClockServiceAsyncImpl(clientOptions) }

    private val instruments: InstrumentServiceAsync by lazy {
        InstrumentServiceAsyncImpl(clientOptions)
    }

    private val marketData: MarketDataServiceAsync by lazy {
        MarketDataServiceAsyncImpl(clientOptions)
    }

    private val news: NewsServiceAsync by lazy { NewsServiceAsyncImpl(clientOptions) }

    private val omniAi: OmniAiServiceAsync by lazy { OmniAiServiceAsyncImpl(clientOptions) }

    private val savedScreeners: SavedScreenerServiceAsync by lazy {
        SavedScreenerServiceAsyncImpl(clientOptions)
    }

    private val screener: ScreenerServiceAsync by lazy { ScreenerServiceAsyncImpl(clientOptions) }

    private val version: VersionServiceAsync by lazy { VersionServiceAsyncImpl(clientOptions) }

    private val watchlists: WatchlistServiceAsync by lazy {
        WatchlistServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): V1ServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1ServiceAsync =
        V1ServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** Manage trading accounts, balances, and portfolio history. */
    override fun accounts(): AccountServiceAsync = accounts

    /** Manage API keys for authentication. */
    override fun apiKeys(): ApiKeyServiceAsync = apiKeys

    override fun calendars(): CalendarServiceAsync = calendars

    /** Access financial calendars for events like earnings, dividends, and splits. */
    override fun clock(): ClockServiceAsync = clock

    /** Retrieve details and lists of tradable instruments. */
    override fun instruments(): InstrumentServiceAsync = instruments

    override fun marketData(): MarketDataServiceAsync = marketData

    /** Retrieve market news and related instrument metadata. */
    override fun news(): NewsServiceAsync = news

    override fun omniAi(): OmniAiServiceAsync = omniAi

    /** Search and manage saved screeners. */
    override fun savedScreeners(): SavedScreenerServiceAsync = savedScreeners

    /** Search and manage saved screeners. */
    override fun screener(): ScreenerServiceAsync = screener

    /** Endpoints for API service metadata. */
    override fun version(): VersionServiceAsync = version

    /** Create and manage watchlists. */
    override fun watchlists(): WatchlistServiceAsync = watchlists

    override fun ws(params: V1WsParams, requestOptions: RequestOptions): CompletableFuture<Void?> =
        // get /active/v1/ws
        withRawResponse().ws(params, requestOptions).thenAccept {}

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        V1ServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val accounts: AccountServiceAsync.WithRawResponse by lazy {
            AccountServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val apiKeys: ApiKeyServiceAsync.WithRawResponse by lazy {
            ApiKeyServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val calendars: CalendarServiceAsync.WithRawResponse by lazy {
            CalendarServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val clock: ClockServiceAsync.WithRawResponse by lazy {
            ClockServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val instruments: InstrumentServiceAsync.WithRawResponse by lazy {
            InstrumentServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val marketData: MarketDataServiceAsync.WithRawResponse by lazy {
            MarketDataServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val news: NewsServiceAsync.WithRawResponse by lazy {
            NewsServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val omniAi: OmniAiServiceAsync.WithRawResponse by lazy {
            OmniAiServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val savedScreeners: SavedScreenerServiceAsync.WithRawResponse by lazy {
            SavedScreenerServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val screener: ScreenerServiceAsync.WithRawResponse by lazy {
            ScreenerServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val version: VersionServiceAsync.WithRawResponse by lazy {
            VersionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val watchlists: WatchlistServiceAsync.WithRawResponse by lazy {
            WatchlistServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): V1ServiceAsync.WithRawResponse =
            V1ServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** Manage trading accounts, balances, and portfolio history. */
        override fun accounts(): AccountServiceAsync.WithRawResponse = accounts

        /** Manage API keys for authentication. */
        override fun apiKeys(): ApiKeyServiceAsync.WithRawResponse = apiKeys

        override fun calendars(): CalendarServiceAsync.WithRawResponse = calendars

        /** Access financial calendars for events like earnings, dividends, and splits. */
        override fun clock(): ClockServiceAsync.WithRawResponse = clock

        /** Retrieve details and lists of tradable instruments. */
        override fun instruments(): InstrumentServiceAsync.WithRawResponse = instruments

        override fun marketData(): MarketDataServiceAsync.WithRawResponse = marketData

        /** Retrieve market news and related instrument metadata. */
        override fun news(): NewsServiceAsync.WithRawResponse = news

        override fun omniAi(): OmniAiServiceAsync.WithRawResponse = omniAi

        /** Search and manage saved screeners. */
        override fun savedScreeners(): SavedScreenerServiceAsync.WithRawResponse = savedScreeners

        /** Search and manage saved screeners. */
        override fun screener(): ScreenerServiceAsync.WithRawResponse = screener

        /** Endpoints for API service metadata. */
        override fun version(): VersionServiceAsync.WithRawResponse = version

        /** Create and manage watchlists. */
        override fun watchlists(): WatchlistServiceAsync.WithRawResponse = watchlists

        private val wsHandler: Handler<Void?> = emptyHandler()

        override fun ws(
            params: V1WsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("active", "v1", "ws")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { wsHandler.handle(it) }
                    }
                }
        }
    }
}
