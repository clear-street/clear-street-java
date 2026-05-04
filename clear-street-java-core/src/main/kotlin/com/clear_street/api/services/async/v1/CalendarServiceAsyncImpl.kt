// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.v1

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.services.async.v1.calendars.MarketHourServiceAsync
import com.clear_street.api.services.async.v1.calendars.MarketHourServiceAsyncImpl
import java.util.function.Consumer

class CalendarServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    CalendarServiceAsync {

    private val withRawResponse: CalendarServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val marketHours: MarketHourServiceAsync by lazy {
        MarketHourServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): CalendarServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CalendarServiceAsync =
        CalendarServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** Access financial calendars for events like earnings, dividends, and splits. */
    override fun marketHours(): MarketHourServiceAsync = marketHours

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CalendarServiceAsync.WithRawResponse {

        private val marketHours: MarketHourServiceAsync.WithRawResponse by lazy {
            MarketHourServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CalendarServiceAsync.WithRawResponse =
            CalendarServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** Access financial calendars for events like earnings, dividends, and splits. */
        override fun marketHours(): MarketHourServiceAsync.WithRawResponse = marketHours
    }
}
