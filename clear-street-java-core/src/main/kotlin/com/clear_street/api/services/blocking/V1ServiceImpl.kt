// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking

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
import com.clear_street.api.core.prepare
import com.clear_street.api.models.v1.V1WsParams
import com.clear_street.api.services.blocking.v1.AccountService
import com.clear_street.api.services.blocking.v1.AccountServiceImpl
import com.clear_street.api.services.blocking.v1.CalendarService
import com.clear_street.api.services.blocking.v1.CalendarServiceImpl
import com.clear_street.api.services.blocking.v1.ClockService
import com.clear_street.api.services.blocking.v1.ClockServiceImpl
import com.clear_street.api.services.blocking.v1.InstrumentService
import com.clear_street.api.services.blocking.v1.InstrumentServiceImpl
import com.clear_street.api.services.blocking.v1.MarketDataService
import com.clear_street.api.services.blocking.v1.MarketDataServiceImpl
import com.clear_street.api.services.blocking.v1.NewsService
import com.clear_street.api.services.blocking.v1.NewsServiceImpl
import com.clear_street.api.services.blocking.v1.OmniAiService
import com.clear_street.api.services.blocking.v1.OmniAiServiceImpl
import com.clear_street.api.services.blocking.v1.SavedScreenerService
import com.clear_street.api.services.blocking.v1.SavedScreenerServiceImpl
import com.clear_street.api.services.blocking.v1.ScreenerService
import com.clear_street.api.services.blocking.v1.ScreenerServiceImpl
import com.clear_street.api.services.blocking.v1.VersionService
import com.clear_street.api.services.blocking.v1.VersionServiceImpl
import com.clear_street.api.services.blocking.v1.WatchlistService
import com.clear_street.api.services.blocking.v1.WatchlistServiceImpl
import java.util.function.Consumer

/** Active Websocket. */
class V1ServiceImpl internal constructor(private val clientOptions: ClientOptions) : V1Service {

    private val withRawResponse: V1Service.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val accounts: AccountService by lazy { AccountServiceImpl(clientOptions) }

    private val calendars: CalendarService by lazy { CalendarServiceImpl(clientOptions) }

    private val clock: ClockService by lazy { ClockServiceImpl(clientOptions) }

    private val instruments: InstrumentService by lazy { InstrumentServiceImpl(clientOptions) }

    private val marketData: MarketDataService by lazy { MarketDataServiceImpl(clientOptions) }

    private val news: NewsService by lazy { NewsServiceImpl(clientOptions) }

    private val omniAi: OmniAiService by lazy { OmniAiServiceImpl(clientOptions) }

    private val savedScreeners: SavedScreenerService by lazy {
        SavedScreenerServiceImpl(clientOptions)
    }

    private val screener: ScreenerService by lazy { ScreenerServiceImpl(clientOptions) }

    private val version: VersionService by lazy { VersionServiceImpl(clientOptions) }

    private val watchlists: WatchlistService by lazy { WatchlistServiceImpl(clientOptions) }

    override fun withRawResponse(): V1Service.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1Service =
        V1ServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** Manage trading accounts, balances, and portfolio history. */
    override fun accounts(): AccountService = accounts

    override fun calendars(): CalendarService = calendars

    /** Access financial calendars for events like earnings, dividends, and splits. */
    override fun clock(): ClockService = clock

    /** Retrieve details and lists of tradable instruments. */
    override fun instruments(): InstrumentService = instruments

    override fun marketData(): MarketDataService = marketData

    /** Retrieve market news and related instrument metadata. */
    override fun news(): NewsService = news

    override fun omniAi(): OmniAiService = omniAi

    /** Search and manage saved screeners. */
    override fun savedScreeners(): SavedScreenerService = savedScreeners

    /** Search and manage saved screeners. */
    override fun screener(): ScreenerService = screener

    /** Endpoints for API service metadata. */
    override fun version(): VersionService = version

    /** Create and manage watchlists. */
    override fun watchlists(): WatchlistService = watchlists

    override fun ws(params: V1WsParams, requestOptions: RequestOptions) {
        // get /v1/ws
        withRawResponse().ws(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        V1Service.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val accounts: AccountService.WithRawResponse by lazy {
            AccountServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val calendars: CalendarService.WithRawResponse by lazy {
            CalendarServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val clock: ClockService.WithRawResponse by lazy {
            ClockServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val instruments: InstrumentService.WithRawResponse by lazy {
            InstrumentServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val marketData: MarketDataService.WithRawResponse by lazy {
            MarketDataServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val news: NewsService.WithRawResponse by lazy {
            NewsServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val omniAi: OmniAiService.WithRawResponse by lazy {
            OmniAiServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val savedScreeners: SavedScreenerService.WithRawResponse by lazy {
            SavedScreenerServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val screener: ScreenerService.WithRawResponse by lazy {
            ScreenerServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val version: VersionService.WithRawResponse by lazy {
            VersionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val watchlists: WatchlistService.WithRawResponse by lazy {
            WatchlistServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): V1Service.WithRawResponse =
            V1ServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** Manage trading accounts, balances, and portfolio history. */
        override fun accounts(): AccountService.WithRawResponse = accounts

        override fun calendars(): CalendarService.WithRawResponse = calendars

        /** Access financial calendars for events like earnings, dividends, and splits. */
        override fun clock(): ClockService.WithRawResponse = clock

        /** Retrieve details and lists of tradable instruments. */
        override fun instruments(): InstrumentService.WithRawResponse = instruments

        override fun marketData(): MarketDataService.WithRawResponse = marketData

        /** Retrieve market news and related instrument metadata. */
        override fun news(): NewsService.WithRawResponse = news

        override fun omniAi(): OmniAiService.WithRawResponse = omniAi

        /** Search and manage saved screeners. */
        override fun savedScreeners(): SavedScreenerService.WithRawResponse = savedScreeners

        /** Search and manage saved screeners. */
        override fun screener(): ScreenerService.WithRawResponse = screener

        /** Endpoints for API service metadata. */
        override fun version(): VersionService.WithRawResponse = version

        /** Create and manage watchlists. */
        override fun watchlists(): WatchlistService.WithRawResponse = watchlists

        private val wsHandler: Handler<Void?> = emptyHandler()

        override fun ws(params: V1WsParams, requestOptions: RequestOptions): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "ws")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable { response.use { wsHandler.handle(it) } }
        }
    }
}
