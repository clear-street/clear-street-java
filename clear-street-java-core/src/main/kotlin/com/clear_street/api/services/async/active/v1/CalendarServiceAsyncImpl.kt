// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.active.v1

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.services.async.active.v1.calendars.DividendServiceAsync
import com.clear_street.api.services.async.active.v1.calendars.DividendServiceAsyncImpl
import com.clear_street.api.services.async.active.v1.calendars.EarningServiceAsync
import com.clear_street.api.services.async.active.v1.calendars.EarningServiceAsyncImpl
import com.clear_street.api.services.async.active.v1.calendars.EconomicServiceAsync
import com.clear_street.api.services.async.active.v1.calendars.EconomicServiceAsyncImpl
import com.clear_street.api.services.async.active.v1.calendars.MarketHourServiceAsync
import com.clear_street.api.services.async.active.v1.calendars.MarketHourServiceAsyncImpl
import com.clear_street.api.services.async.active.v1.calendars.MergersAcquisitionServiceAsync
import com.clear_street.api.services.async.active.v1.calendars.MergersAcquisitionServiceAsyncImpl
import com.clear_street.api.services.async.active.v1.calendars.SplitServiceAsync
import com.clear_street.api.services.async.active.v1.calendars.SplitServiceAsyncImpl
import com.clear_street.api.services.async.active.v1.calendars.SummaryServiceAsync
import com.clear_street.api.services.async.active.v1.calendars.SummaryServiceAsyncImpl
import java.util.function.Consumer

class CalendarServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    CalendarServiceAsync {

    private val withRawResponse: CalendarServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val dividends: DividendServiceAsync by lazy { DividendServiceAsyncImpl(clientOptions) }

    private val earnings: EarningServiceAsync by lazy { EarningServiceAsyncImpl(clientOptions) }

    private val economic: EconomicServiceAsync by lazy { EconomicServiceAsyncImpl(clientOptions) }

    private val marketHours: MarketHourServiceAsync by lazy {
        MarketHourServiceAsyncImpl(clientOptions)
    }

    private val mergersAcquisitions: MergersAcquisitionServiceAsync by lazy {
        MergersAcquisitionServiceAsyncImpl(clientOptions)
    }

    private val splits: SplitServiceAsync by lazy { SplitServiceAsyncImpl(clientOptions) }

    private val summary: SummaryServiceAsync by lazy { SummaryServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): CalendarServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CalendarServiceAsync =
        CalendarServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** Access financial calendars for events like earnings, dividends, and splits. */
    override fun dividends(): DividendServiceAsync = dividends

    /** Access financial calendars for events like earnings, dividends, and splits. */
    override fun earnings(): EarningServiceAsync = earnings

    /** Access financial calendars for events like earnings, dividends, and splits. */
    override fun economic(): EconomicServiceAsync = economic

    /** Access financial calendars for events like earnings, dividends, and splits. */
    override fun marketHours(): MarketHourServiceAsync = marketHours

    /** Access financial calendars for events like earnings, dividends, and splits. */
    override fun mergersAcquisitions(): MergersAcquisitionServiceAsync = mergersAcquisitions

    /** Access financial calendars for events like earnings, dividends, and splits. */
    override fun splits(): SplitServiceAsync = splits

    /** Access financial calendars for events like earnings, dividends, and splits. */
    override fun summary(): SummaryServiceAsync = summary

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CalendarServiceAsync.WithRawResponse {

        private val dividends: DividendServiceAsync.WithRawResponse by lazy {
            DividendServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val earnings: EarningServiceAsync.WithRawResponse by lazy {
            EarningServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val economic: EconomicServiceAsync.WithRawResponse by lazy {
            EconomicServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val marketHours: MarketHourServiceAsync.WithRawResponse by lazy {
            MarketHourServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val mergersAcquisitions: MergersAcquisitionServiceAsync.WithRawResponse by lazy {
            MergersAcquisitionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val splits: SplitServiceAsync.WithRawResponse by lazy {
            SplitServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val summary: SummaryServiceAsync.WithRawResponse by lazy {
            SummaryServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CalendarServiceAsync.WithRawResponse =
            CalendarServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** Access financial calendars for events like earnings, dividends, and splits. */
        override fun dividends(): DividendServiceAsync.WithRawResponse = dividends

        /** Access financial calendars for events like earnings, dividends, and splits. */
        override fun earnings(): EarningServiceAsync.WithRawResponse = earnings

        /** Access financial calendars for events like earnings, dividends, and splits. */
        override fun economic(): EconomicServiceAsync.WithRawResponse = economic

        /** Access financial calendars for events like earnings, dividends, and splits. */
        override fun marketHours(): MarketHourServiceAsync.WithRawResponse = marketHours

        /** Access financial calendars for events like earnings, dividends, and splits. */
        override fun mergersAcquisitions(): MergersAcquisitionServiceAsync.WithRawResponse =
            mergersAcquisitions

        /** Access financial calendars for events like earnings, dividends, and splits. */
        override fun splits(): SplitServiceAsync.WithRawResponse = splits

        /** Access financial calendars for events like earnings, dividends, and splits. */
        override fun summary(): SummaryServiceAsync.WithRawResponse = summary
    }
}
