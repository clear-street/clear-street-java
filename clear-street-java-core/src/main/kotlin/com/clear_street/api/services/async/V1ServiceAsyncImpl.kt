// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.services.async.v1.AccountServiceAsync
import com.clear_street.api.services.async.v1.AccountServiceAsyncImpl
import com.clear_street.api.services.async.v1.ApiVersionServiceAsync
import com.clear_street.api.services.async.v1.ApiVersionServiceAsyncImpl
import com.clear_street.api.services.async.v1.CalendarServiceAsync
import com.clear_street.api.services.async.v1.CalendarServiceAsyncImpl
import com.clear_street.api.services.async.v1.InstrumentDataServiceAsync
import com.clear_street.api.services.async.v1.InstrumentDataServiceAsyncImpl
import com.clear_street.api.services.async.v1.InstrumentServiceAsync
import com.clear_street.api.services.async.v1.InstrumentServiceAsyncImpl
import com.clear_street.api.services.async.v1.OmniAiServiceAsync
import com.clear_street.api.services.async.v1.OmniAiServiceAsyncImpl
import com.clear_street.api.services.async.v1.OrderServiceAsync
import com.clear_street.api.services.async.v1.OrderServiceAsyncImpl
import com.clear_street.api.services.async.v1.PositionServiceAsync
import com.clear_street.api.services.async.v1.PositionServiceAsyncImpl
import com.clear_street.api.services.async.v1.WatchlistServiceAsync
import com.clear_street.api.services.async.v1.WatchlistServiceAsyncImpl
import com.clear_street.api.services.async.v1.WebsocketServiceAsync
import com.clear_street.api.services.async.v1.WebsocketServiceAsyncImpl
import java.util.function.Consumer

class V1ServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    V1ServiceAsync {

    private val withRawResponse: V1ServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val accounts: AccountServiceAsync by lazy { AccountServiceAsyncImpl(clientOptions) }

    private val apiVersion: ApiVersionServiceAsync by lazy {
        ApiVersionServiceAsyncImpl(clientOptions)
    }

    private val calendar: CalendarServiceAsync by lazy { CalendarServiceAsyncImpl(clientOptions) }

    private val instrumentData: InstrumentDataServiceAsync by lazy {
        InstrumentDataServiceAsyncImpl(clientOptions)
    }

    private val instruments: InstrumentServiceAsync by lazy {
        InstrumentServiceAsyncImpl(clientOptions)
    }

    private val omniAi: OmniAiServiceAsync by lazy { OmniAiServiceAsyncImpl(clientOptions) }

    private val orders: OrderServiceAsync by lazy { OrderServiceAsyncImpl(clientOptions) }

    private val positions: PositionServiceAsync by lazy { PositionServiceAsyncImpl(clientOptions) }

    private val watchlist: WatchlistServiceAsync by lazy {
        WatchlistServiceAsyncImpl(clientOptions)
    }

    private val websocket: WebsocketServiceAsync by lazy {
        WebsocketServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): V1ServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1ServiceAsync =
        V1ServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** Manage trading accounts, balances, and portfolio history. */
    override fun accounts(): AccountServiceAsync = accounts

    /** Endpoints for API service metadata. */
    override fun apiVersion(): ApiVersionServiceAsync = apiVersion

    /** Access clocks and financial calendars for market sessions and events. */
    override fun calendar(): CalendarServiceAsync = calendar

    /** Retrieve instrument analytics, market data, news, and related reference data. */
    override fun instrumentData(): InstrumentDataServiceAsync = instrumentData

    /** Retrieve core details and discovery endpoints for tradable instruments. */
    override fun instruments(): InstrumentServiceAsync = instruments

    override fun omniAi(): OmniAiServiceAsync = omniAi

    /** Place, monitor, and manage trading orders. */
    override fun orders(): OrderServiceAsync = orders

    /** View positions and manage position instructions. */
    override fun positions(): PositionServiceAsync = positions

    /** Create and manage watchlists. */
    override fun watchlist(): WatchlistServiceAsync = watchlist

    /** Active Websocket. */
    override fun websocket(): WebsocketServiceAsync = websocket

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        V1ServiceAsync.WithRawResponse {

        private val accounts: AccountServiceAsync.WithRawResponse by lazy {
            AccountServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val apiVersion: ApiVersionServiceAsync.WithRawResponse by lazy {
            ApiVersionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val calendar: CalendarServiceAsync.WithRawResponse by lazy {
            CalendarServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val instrumentData: InstrumentDataServiceAsync.WithRawResponse by lazy {
            InstrumentDataServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val instruments: InstrumentServiceAsync.WithRawResponse by lazy {
            InstrumentServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val omniAi: OmniAiServiceAsync.WithRawResponse by lazy {
            OmniAiServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val orders: OrderServiceAsync.WithRawResponse by lazy {
            OrderServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val positions: PositionServiceAsync.WithRawResponse by lazy {
            PositionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val watchlist: WatchlistServiceAsync.WithRawResponse by lazy {
            WatchlistServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val websocket: WebsocketServiceAsync.WithRawResponse by lazy {
            WebsocketServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): V1ServiceAsync.WithRawResponse =
            V1ServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** Manage trading accounts, balances, and portfolio history. */
        override fun accounts(): AccountServiceAsync.WithRawResponse = accounts

        /** Endpoints for API service metadata. */
        override fun apiVersion(): ApiVersionServiceAsync.WithRawResponse = apiVersion

        /** Access clocks and financial calendars for market sessions and events. */
        override fun calendar(): CalendarServiceAsync.WithRawResponse = calendar

        /** Retrieve instrument analytics, market data, news, and related reference data. */
        override fun instrumentData(): InstrumentDataServiceAsync.WithRawResponse = instrumentData

        /** Retrieve core details and discovery endpoints for tradable instruments. */
        override fun instruments(): InstrumentServiceAsync.WithRawResponse = instruments

        override fun omniAi(): OmniAiServiceAsync.WithRawResponse = omniAi

        /** Place, monitor, and manage trading orders. */
        override fun orders(): OrderServiceAsync.WithRawResponse = orders

        /** View positions and manage position instructions. */
        override fun positions(): PositionServiceAsync.WithRawResponse = positions

        /** Create and manage watchlists. */
        override fun watchlist(): WatchlistServiceAsync.WithRawResponse = watchlist

        /** Active Websocket. */
        override fun websocket(): WebsocketServiceAsync.WithRawResponse = websocket
    }
}
