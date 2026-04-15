// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.active.v1

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.services.blocking.active.v1.marketdata.SnapshotService
import com.clear_street.api.services.blocking.active.v1.marketdata.SnapshotServiceImpl
import java.util.function.Consumer

class MarketDataServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    MarketDataService {

    private val withRawResponse: MarketDataService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val snapshot: SnapshotService by lazy { SnapshotServiceImpl(clientOptions) }

    override fun withRawResponse(): MarketDataService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): MarketDataService =
        MarketDataServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** Real-time market data snapshots. */
    override fun snapshot(): SnapshotService = snapshot

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        MarketDataService.WithRawResponse {

        private val snapshot: SnapshotService.WithRawResponse by lazy {
            SnapshotServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MarketDataService.WithRawResponse =
            MarketDataServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** Real-time market data snapshots. */
        override fun snapshot(): SnapshotService.WithRawResponse = snapshot
    }
}
