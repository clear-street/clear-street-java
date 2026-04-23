// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.active.v1

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.services.blocking.active.v1.calendars.MarketHourService
import com.clear_street.api.services.blocking.active.v1.calendars.MarketHourServiceImpl
import java.util.function.Consumer

class CalendarServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    CalendarService {

    private val withRawResponse: CalendarService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val marketHours: MarketHourService by lazy { MarketHourServiceImpl(clientOptions) }

    override fun withRawResponse(): CalendarService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CalendarService =
        CalendarServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** Access financial calendars for events like earnings, dividends, and splits. */
    override fun marketHours(): MarketHourService = marketHours

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CalendarService.WithRawResponse {

        private val marketHours: MarketHourService.WithRawResponse by lazy {
            MarketHourServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CalendarService.WithRawResponse =
            CalendarServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** Access financial calendars for events like earnings, dividends, and splits. */
        override fun marketHours(): MarketHourService.WithRawResponse = marketHours
    }
}
