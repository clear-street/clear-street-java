// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.active.v1

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.services.async.active.v1.calendars.MarketHourServiceAsync
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
    fun marketHours(): MarketHourServiceAsync

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
        fun marketHours(): MarketHourServiceAsync.WithRawResponse
    }
}
