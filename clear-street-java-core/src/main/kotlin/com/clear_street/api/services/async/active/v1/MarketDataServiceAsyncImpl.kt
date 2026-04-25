// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.active.v1

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.services.async.active.v1.marketdata.DailySummaryServiceAsync
import com.clear_street.api.services.async.active.v1.marketdata.DailySummaryServiceAsyncImpl
import com.clear_street.api.services.async.active.v1.marketdata.SnapshotServiceAsync
import com.clear_street.api.services.async.active.v1.marketdata.SnapshotServiceAsyncImpl
import java.util.function.Consumer

class MarketDataServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    MarketDataServiceAsync {

    private val withRawResponse: MarketDataServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val dailySummary: DailySummaryServiceAsync by lazy {
        DailySummaryServiceAsyncImpl(clientOptions)
    }

    private val snapshot: SnapshotServiceAsync by lazy { SnapshotServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): MarketDataServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): MarketDataServiceAsync =
        MarketDataServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** Real-time market data snapshots. */
    override fun dailySummary(): DailySummaryServiceAsync = dailySummary

    /** Real-time market data snapshots. */
    override fun snapshot(): SnapshotServiceAsync = snapshot

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        MarketDataServiceAsync.WithRawResponse {

        private val dailySummary: DailySummaryServiceAsync.WithRawResponse by lazy {
            DailySummaryServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val snapshot: SnapshotServiceAsync.WithRawResponse by lazy {
            SnapshotServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MarketDataServiceAsync.WithRawResponse =
            MarketDataServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** Real-time market data snapshots. */
        override fun dailySummary(): DailySummaryServiceAsync.WithRawResponse = dailySummary

        /** Real-time market data snapshots. */
        override fun snapshot(): SnapshotServiceAsync.WithRawResponse = snapshot
    }
}
