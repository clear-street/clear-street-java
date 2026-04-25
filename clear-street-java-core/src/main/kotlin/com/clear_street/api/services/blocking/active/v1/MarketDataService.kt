// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.active.v1

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.services.blocking.active.v1.marketdata.DailySummaryService
import com.clear_street.api.services.blocking.active.v1.marketdata.SnapshotService
import java.util.function.Consumer

interface MarketDataService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MarketDataService

    /** Real-time market data snapshots. */
    fun dailySummary(): DailySummaryService

    /** Real-time market data snapshots. */
    fun snapshot(): SnapshotService

    /** A view of [MarketDataService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MarketDataService.WithRawResponse

        /** Real-time market data snapshots. */
        fun dailySummary(): DailySummaryService.WithRawResponse

        /** Real-time market data snapshots. */
        fun snapshot(): SnapshotService.WithRawResponse
    }
}
