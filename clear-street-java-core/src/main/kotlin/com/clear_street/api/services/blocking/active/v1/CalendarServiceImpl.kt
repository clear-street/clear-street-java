// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.active.v1

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.services.blocking.active.v1.calendars.DividendService
import com.clear_street.api.services.blocking.active.v1.calendars.DividendServiceImpl
import com.clear_street.api.services.blocking.active.v1.calendars.EarningService
import com.clear_street.api.services.blocking.active.v1.calendars.EarningServiceImpl
import com.clear_street.api.services.blocking.active.v1.calendars.EconomicService
import com.clear_street.api.services.blocking.active.v1.calendars.EconomicServiceImpl
import com.clear_street.api.services.blocking.active.v1.calendars.MarketHourService
import com.clear_street.api.services.blocking.active.v1.calendars.MarketHourServiceImpl
import com.clear_street.api.services.blocking.active.v1.calendars.MergersAcquisitionService
import com.clear_street.api.services.blocking.active.v1.calendars.MergersAcquisitionServiceImpl
import com.clear_street.api.services.blocking.active.v1.calendars.SplitService
import com.clear_street.api.services.blocking.active.v1.calendars.SplitServiceImpl
import com.clear_street.api.services.blocking.active.v1.calendars.SummaryService
import com.clear_street.api.services.blocking.active.v1.calendars.SummaryServiceImpl
import java.util.function.Consumer

class CalendarServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    CalendarService {

    private val withRawResponse: CalendarService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val dividends: DividendService by lazy { DividendServiceImpl(clientOptions) }

    private val earnings: EarningService by lazy { EarningServiceImpl(clientOptions) }

    private val economic: EconomicService by lazy { EconomicServiceImpl(clientOptions) }

    private val marketHours: MarketHourService by lazy { MarketHourServiceImpl(clientOptions) }

    private val mergersAcquisitions: MergersAcquisitionService by lazy {
        MergersAcquisitionServiceImpl(clientOptions)
    }

    private val splits: SplitService by lazy { SplitServiceImpl(clientOptions) }

    private val summary: SummaryService by lazy { SummaryServiceImpl(clientOptions) }

    override fun withRawResponse(): CalendarService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CalendarService =
        CalendarServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** Access financial calendars for events like earnings, dividends, and splits. */
    override fun dividends(): DividendService = dividends

    /** Access financial calendars for events like earnings, dividends, and splits. */
    override fun earnings(): EarningService = earnings

    /** Access financial calendars for events like earnings, dividends, and splits. */
    override fun economic(): EconomicService = economic

    /** Access financial calendars for events like earnings, dividends, and splits. */
    override fun marketHours(): MarketHourService = marketHours

    /** Access financial calendars for events like earnings, dividends, and splits. */
    override fun mergersAcquisitions(): MergersAcquisitionService = mergersAcquisitions

    /** Access financial calendars for events like earnings, dividends, and splits. */
    override fun splits(): SplitService = splits

    /** Access financial calendars for events like earnings, dividends, and splits. */
    override fun summary(): SummaryService = summary

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CalendarService.WithRawResponse {

        private val dividends: DividendService.WithRawResponse by lazy {
            DividendServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val earnings: EarningService.WithRawResponse by lazy {
            EarningServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val economic: EconomicService.WithRawResponse by lazy {
            EconomicServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val marketHours: MarketHourService.WithRawResponse by lazy {
            MarketHourServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val mergersAcquisitions: MergersAcquisitionService.WithRawResponse by lazy {
            MergersAcquisitionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val splits: SplitService.WithRawResponse by lazy {
            SplitServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val summary: SummaryService.WithRawResponse by lazy {
            SummaryServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CalendarService.WithRawResponse =
            CalendarServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** Access financial calendars for events like earnings, dividends, and splits. */
        override fun dividends(): DividendService.WithRawResponse = dividends

        /** Access financial calendars for events like earnings, dividends, and splits. */
        override fun earnings(): EarningService.WithRawResponse = earnings

        /** Access financial calendars for events like earnings, dividends, and splits. */
        override fun economic(): EconomicService.WithRawResponse = economic

        /** Access financial calendars for events like earnings, dividends, and splits. */
        override fun marketHours(): MarketHourService.WithRawResponse = marketHours

        /** Access financial calendars for events like earnings, dividends, and splits. */
        override fun mergersAcquisitions(): MergersAcquisitionService.WithRawResponse =
            mergersAcquisitions

        /** Access financial calendars for events like earnings, dividends, and splits. */
        override fun splits(): SplitService.WithRawResponse = splits

        /** Access financial calendars for events like earnings, dividends, and splits. */
        override fun summary(): SummaryService.WithRawResponse = summary
    }
}
