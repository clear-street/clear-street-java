// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.active.v1

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.services.blocking.active.v1.calendars.DividendService
import com.clear_street.api.services.blocking.active.v1.calendars.EarningService
import com.clear_street.api.services.blocking.active.v1.calendars.EconomicService
import com.clear_street.api.services.blocking.active.v1.calendars.MarketHourService
import com.clear_street.api.services.blocking.active.v1.calendars.MergersAcquisitionService
import com.clear_street.api.services.blocking.active.v1.calendars.SplitService
import com.clear_street.api.services.blocking.active.v1.calendars.SummaryService
import java.util.function.Consumer

interface CalendarService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CalendarService

    /** Access financial calendars for events like earnings, dividends, and splits. */
    fun dividends(): DividendService

    /** Access financial calendars for events like earnings, dividends, and splits. */
    fun earnings(): EarningService

    /** Access financial calendars for events like earnings, dividends, and splits. */
    fun economic(): EconomicService

    /** Access financial calendars for events like earnings, dividends, and splits. */
    fun marketHours(): MarketHourService

    /** Access financial calendars for events like earnings, dividends, and splits. */
    fun mergersAcquisitions(): MergersAcquisitionService

    /** Access financial calendars for events like earnings, dividends, and splits. */
    fun splits(): SplitService

    /** Access financial calendars for events like earnings, dividends, and splits. */
    fun summary(): SummaryService

    /** A view of [CalendarService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): CalendarService.WithRawResponse

        /** Access financial calendars for events like earnings, dividends, and splits. */
        fun dividends(): DividendService.WithRawResponse

        /** Access financial calendars for events like earnings, dividends, and splits. */
        fun earnings(): EarningService.WithRawResponse

        /** Access financial calendars for events like earnings, dividends, and splits. */
        fun economic(): EconomicService.WithRawResponse

        /** Access financial calendars for events like earnings, dividends, and splits. */
        fun marketHours(): MarketHourService.WithRawResponse

        /** Access financial calendars for events like earnings, dividends, and splits. */
        fun mergersAcquisitions(): MergersAcquisitionService.WithRawResponse

        /** Access financial calendars for events like earnings, dividends, and splits. */
        fun splits(): SplitService.WithRawResponse

        /** Access financial calendars for events like earnings, dividends, and splits. */
        fun summary(): SummaryService.WithRawResponse
    }
}
