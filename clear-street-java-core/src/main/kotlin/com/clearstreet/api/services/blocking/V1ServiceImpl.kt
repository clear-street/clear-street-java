// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.services.blocking

import com.clearstreet.api.core.ClientOptions
import com.clearstreet.api.services.blocking.v1.AccountService
import com.clearstreet.api.services.blocking.v1.AccountServiceImpl
import com.clearstreet.api.services.blocking.v1.AlertService
import com.clearstreet.api.services.blocking.v1.AlertServiceImpl
import com.clearstreet.api.services.blocking.v1.ApiVersionService
import com.clearstreet.api.services.blocking.v1.ApiVersionServiceImpl
import com.clearstreet.api.services.blocking.v1.CalendarService
import com.clearstreet.api.services.blocking.v1.CalendarServiceImpl
import com.clearstreet.api.services.blocking.v1.InstrumentDataService
import com.clearstreet.api.services.blocking.v1.InstrumentDataServiceImpl
import com.clearstreet.api.services.blocking.v1.InstrumentService
import com.clearstreet.api.services.blocking.v1.InstrumentServiceImpl
import com.clearstreet.api.services.blocking.v1.OmniAiService
import com.clearstreet.api.services.blocking.v1.OmniAiServiceImpl
import com.clearstreet.api.services.blocking.v1.OrderService
import com.clearstreet.api.services.blocking.v1.OrderServiceImpl
import com.clearstreet.api.services.blocking.v1.PositionService
import com.clearstreet.api.services.blocking.v1.PositionServiceImpl
import com.clearstreet.api.services.blocking.v1.ScreenerService
import com.clearstreet.api.services.blocking.v1.ScreenerServiceImpl
import com.clearstreet.api.services.blocking.v1.WatchlistService
import com.clearstreet.api.services.blocking.v1.WatchlistServiceImpl
import java.util.function.Consumer

class V1ServiceImpl internal constructor(private val clientOptions: ClientOptions) : V1Service {

    private val withRawResponse: V1Service.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val accounts: AccountService by lazy { AccountServiceImpl(clientOptions) }

    private val alerts: AlertService by lazy { AlertServiceImpl(clientOptions) }

    private val apiVersion: ApiVersionService by lazy { ApiVersionServiceImpl(clientOptions) }

    private val calendar: CalendarService by lazy { CalendarServiceImpl(clientOptions) }

    private val instrumentData: InstrumentDataService by lazy {
        InstrumentDataServiceImpl(clientOptions)
    }

    private val instruments: InstrumentService by lazy { InstrumentServiceImpl(clientOptions) }

    private val omniAi: OmniAiService by lazy { OmniAiServiceImpl(clientOptions) }

    private val orders: OrderService by lazy { OrderServiceImpl(clientOptions) }

    private val positions: PositionService by lazy { PositionServiceImpl(clientOptions) }

    private val screener: ScreenerService by lazy { ScreenerServiceImpl(clientOptions) }

    private val watchlist: WatchlistService by lazy { WatchlistServiceImpl(clientOptions) }

    override fun withRawResponse(): V1Service.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1Service =
        V1ServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** Manage trading accounts, balances, and portfolio history. */
    override fun accounts(): AccountService = accounts

    /**
     * Create and manage alerts that watch market and portfolio conditions on an account and notify
     * when they trigger.
     */
    override fun alerts(): AlertService = alerts

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

    /** Search instruments and manage saved screeners. */
    override fun screener(): ScreenerService = screener

    /** Create and manage watchlists. */
    override fun watchlist(): WatchlistService = watchlist

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        V1Service.WithRawResponse {

        private val accounts: AccountService.WithRawResponse by lazy {
            AccountServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val alerts: AlertService.WithRawResponse by lazy {
            AlertServiceImpl.WithRawResponseImpl(clientOptions)
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

        private val screener: ScreenerService.WithRawResponse by lazy {
            ScreenerServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val watchlist: WatchlistService.WithRawResponse by lazy {
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

        /**
         * Create and manage alerts that watch market and portfolio conditions on an account and
         * notify when they trigger.
         */
        override fun alerts(): AlertService.WithRawResponse = alerts

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

        /** Search instruments and manage saved screeners. */
        override fun screener(): ScreenerService.WithRawResponse = screener

        /** Create and manage watchlists. */
        override fun watchlist(): WatchlistService.WithRawResponse = watchlist
    }
}
