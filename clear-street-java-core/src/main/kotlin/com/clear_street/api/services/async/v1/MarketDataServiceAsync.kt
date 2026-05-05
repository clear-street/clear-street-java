// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.v1

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.services.async.v1.marketdata.DailySummaryServiceAsync
import com.clear_street.api.services.async.v1.marketdata.SnapshotServiceAsync
import java.util.function.Consumer

interface MarketDataServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MarketDataServiceAsync

    /** Real-time market data snapshots. */
    fun dailySummary(): DailySummaryServiceAsync

    /** Real-time market data snapshots. */
    fun snapshot(): SnapshotServiceAsync

    /**
     * A view of [MarketDataServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MarketDataServiceAsync.WithRawResponse

        /** Real-time market data snapshots. */
        fun dailySummary(): DailySummaryServiceAsync.WithRawResponse

        /** Real-time market data snapshots. */
        fun snapshot(): SnapshotServiceAsync.WithRawResponse
    }
}
