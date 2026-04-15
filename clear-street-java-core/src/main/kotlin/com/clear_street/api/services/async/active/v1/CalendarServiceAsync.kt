// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.active.v1

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.services.async.active.v1.calendars.DividendServiceAsync
import com.clear_street.api.services.async.active.v1.calendars.EarningServiceAsync
import com.clear_street.api.services.async.active.v1.calendars.EconomicServiceAsync
import com.clear_street.api.services.async.active.v1.calendars.MarketHourServiceAsync
import com.clear_street.api.services.async.active.v1.calendars.MergersAcquisitionServiceAsync
import com.clear_street.api.services.async.active.v1.calendars.SplitServiceAsync
import com.clear_street.api.services.async.active.v1.calendars.SummaryServiceAsync
import java.util.function.Consumer

interface CalendarServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CalendarServiceAsync

    /** Access financial calendars for events like earnings, dividends, and splits. */
    fun dividends(): DividendServiceAsync

    /** Access financial calendars for events like earnings, dividends, and splits. */
    fun earnings(): EarningServiceAsync

    /** Access financial calendars for events like earnings, dividends, and splits. */
    fun economic(): EconomicServiceAsync

    /** Access financial calendars for events like earnings, dividends, and splits. */
    fun marketHours(): MarketHourServiceAsync

    /** Access financial calendars for events like earnings, dividends, and splits. */
    fun mergersAcquisitions(): MergersAcquisitionServiceAsync

    /** Access financial calendars for events like earnings, dividends, and splits. */
    fun splits(): SplitServiceAsync

    /** Access financial calendars for events like earnings, dividends, and splits. */
    fun summary(): SummaryServiceAsync

    /**
     * A view of [CalendarServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CalendarServiceAsync.WithRawResponse

        /** Access financial calendars for events like earnings, dividends, and splits. */
        fun dividends(): DividendServiceAsync.WithRawResponse

        /** Access financial calendars for events like earnings, dividends, and splits. */
        fun earnings(): EarningServiceAsync.WithRawResponse

        /** Access financial calendars for events like earnings, dividends, and splits. */
        fun economic(): EconomicServiceAsync.WithRawResponse

        /** Access financial calendars for events like earnings, dividends, and splits. */
        fun marketHours(): MarketHourServiceAsync.WithRawResponse

        /** Access financial calendars for events like earnings, dividends, and splits. */
        fun mergersAcquisitions(): MergersAcquisitionServiceAsync.WithRawResponse

        /** Access financial calendars for events like earnings, dividends, and splits. */
        fun splits(): SplitServiceAsync.WithRawResponse

        /** Access financial calendars for events like earnings, dividends, and splits. */
        fun summary(): SummaryServiceAsync.WithRawResponse
    }
}
