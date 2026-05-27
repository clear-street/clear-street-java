// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.services.blocking.v1.AccountService
import com.clear_street.api.services.blocking.v1.AccountServiceImpl
import com.clear_street.api.services.blocking.v1.ApiVersionService
import com.clear_street.api.services.blocking.v1.ApiVersionServiceImpl
import com.clear_street.api.services.blocking.v1.CalendarService
import com.clear_street.api.services.blocking.v1.CalendarServiceImpl
import com.clear_street.api.services.blocking.v1.InstrumentDataService
import com.clear_street.api.services.blocking.v1.InstrumentDataServiceImpl
import com.clear_street.api.services.blocking.v1.InstrumentService
import com.clear_street.api.services.blocking.v1.InstrumentServiceImpl
import com.clear_street.api.services.blocking.v1.OmniAiService
import com.clear_street.api.services.blocking.v1.OmniAiServiceImpl
import com.clear_street.api.services.blocking.v1.OrderService
import com.clear_street.api.services.blocking.v1.OrderServiceImpl
import com.clear_street.api.services.blocking.v1.PositionService
import com.clear_street.api.services.blocking.v1.PositionServiceImpl
import com.clear_street.api.services.blocking.v1.WatchlistService
import com.clear_street.api.services.blocking.v1.WatchlistServiceImpl
import com.clear_street.api.services.blocking.v1.WebsocketService
import com.clear_street.api.services.blocking.v1.WebsocketServiceImpl
import java.util.function.Consumer

class V1ServiceImpl internal constructor(private val clientOptions: ClientOptions) : V1Service {

    private val withRawResponse: V1Service.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val accounts: AccountService by lazy { AccountServiceImpl(clientOptions) }

    private val apiVersion: ApiVersionService by lazy { ApiVersionServiceImpl(clientOptions) }

    private val calendar: CalendarService by lazy { CalendarServiceImpl(clientOptions) }

    private val instrumentData: InstrumentDataService by lazy {
        InstrumentDataServiceImpl(clientOptions)
    }

    private val instruments: InstrumentService by lazy { InstrumentServiceImpl(clientOptions) }

    private val omniAi: OmniAiService by lazy { OmniAiServiceImpl(clientOptions) }

    private val orders: OrderService by lazy { OrderServiceImpl(clientOptions) }

    private val positions: PositionService by lazy { PositionServiceImpl(clientOptions) }

    private val watchlist: WatchlistService by lazy { WatchlistServiceImpl(clientOptions) }

    private val websocket: WebsocketService by lazy { WebsocketServiceImpl(clientOptions) }

    override fun withRawResponse(): V1Service.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1Service =
        V1ServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** Manage trading accounts, balances, and portfolio history. */
    override fun accounts(): AccountService = accounts

    /** Endpoints for API service metadata. */
    override fun apiVersion(): ApiVersionService = apiVersion

    /** Access clocks and financial calendars for market sessions and events. */
    override fun calendar(): CalendarService = calendar

    /** Retrieve instrument analytics, market data, news, and related reference data. */
    override fun instrumentData(): InstrumentDataService = instrumentData

    /** Retrieve core details and discovery endpoints for tradable instruments. */
    override fun instruments(): InstrumentService = instruments

    override fun omniAi(): OmniAiService = omniAi

    /** Place, monitor, and manage trading orders. */
    override fun orders(): OrderService = orders

    /** View positions and manage position instructions. */
    override fun positions(): PositionService = positions

    /** Create and manage watchlists. */
    override fun watchlist(): WatchlistService = watchlist

    /** Active Websocket. */
    override fun websocket(): WebsocketService = websocket

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        V1Service.WithRawResponse {

        private val accounts: AccountService.WithRawResponse by lazy {
            AccountServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val apiVersion: ApiVersionService.WithRawResponse by lazy {
            ApiVersionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val calendar: CalendarService.WithRawResponse by lazy {
            CalendarServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val instrumentData: InstrumentDataService.WithRawResponse by lazy {
            InstrumentDataServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val instruments: InstrumentService.WithRawResponse by lazy {
            InstrumentServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val omniAi: OmniAiService.WithRawResponse by lazy {
            OmniAiServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val orders: OrderService.WithRawResponse by lazy {
            OrderServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val positions: PositionService.WithRawResponse by lazy {
            PositionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val watchlist: WatchlistService.WithRawResponse by lazy {
            WatchlistServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val websocket: WebsocketService.WithRawResponse by lazy {
            WebsocketServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): V1Service.WithRawResponse =
            V1ServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** Manage trading accounts, balances, and portfolio history. */
        override fun accounts(): AccountService.WithRawResponse = accounts

        /** Endpoints for API service metadata. */
        override fun apiVersion(): ApiVersionService.WithRawResponse = apiVersion

        /** Access clocks and financial calendars for market sessions and events. */
        override fun calendar(): CalendarService.WithRawResponse = calendar

        /** Retrieve instrument analytics, market data, news, and related reference data. */
        override fun instrumentData(): InstrumentDataService.WithRawResponse = instrumentData

        /** Retrieve core details and discovery endpoints for tradable instruments. */
        override fun instruments(): InstrumentService.WithRawResponse = instruments

        override fun omniAi(): OmniAiService.WithRawResponse = omniAi

        /** Place, monitor, and manage trading orders. */
        override fun orders(): OrderService.WithRawResponse = orders

        /** View positions and manage position instructions. */
        override fun positions(): PositionService.WithRawResponse = positions

        /** Create and manage watchlists. */
        override fun watchlist(): WatchlistService.WithRawResponse = watchlist

        /** Active Websocket. */
        override fun websocket(): WebsocketService.WithRawResponse = websocket
    }
}
