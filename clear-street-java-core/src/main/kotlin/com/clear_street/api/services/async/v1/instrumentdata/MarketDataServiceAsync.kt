// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.v1.instrumentdata

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.core.RequestOptions
import com.clear_street.api.core.http.HttpResponseFor
import com.clear_street.api.models.v1.instrumentdata.marketdata.MarketDataGetDailySummariesParams
import com.clear_street.api.models.v1.instrumentdata.marketdata.MarketDataGetDailySummariesResponse
import com.clear_street.api.models.v1.instrumentdata.marketdata.MarketDataGetSnapshotsParams
import com.clear_street.api.models.v1.instrumentdata.marketdata.MarketDataGetSnapshotsResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Retrieve instrument analytics, market data, news, and related reference data. */
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

    /**
     * Returns the most recent OHLV and current price for the requested OEMS instruments. Backed by
     * the in-memory Polygon snapshot cache.
     *
     * Response contract: every request returns one row per **unique** `instrument_id`, in
     * first-seen request order. Unresolvable IDs come back with `symbol = null` and every
     * market-data field `null`; resolvable IDs with no cache entry come back with `symbol`
     * populated but market-data fields `null`.
     *
     * **Note (temporary):** ID resolution currently goes through the supplemental screener (OEMS
     * instrument_id → FMP fmp_symbol → metadata_id → realtime cache). Removed when the market-data
     * service serves daily aggregates directly, or when Polygon symbology is loaded into the
     * instrument cache.
     */
    fun getDailySummaries(
        params: MarketDataGetDailySummariesParams
    ): CompletableFuture<MarketDataGetDailySummariesResponse> =
        getDailySummaries(params, RequestOptions.none())

    /** @see getDailySummaries */
    fun getDailySummaries(
        params: MarketDataGetDailySummariesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MarketDataGetDailySummariesResponse>

    /** Get market data snapshots for one or more securities. */
    fun getSnapshots(): CompletableFuture<MarketDataGetSnapshotsResponse> =
        getSnapshots(MarketDataGetSnapshotsParams.none())

    /** @see getSnapshots */
    fun getSnapshots(
        params: MarketDataGetSnapshotsParams = MarketDataGetSnapshotsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MarketDataGetSnapshotsResponse>

    /** @see getSnapshots */
    fun getSnapshots(
        params: MarketDataGetSnapshotsParams = MarketDataGetSnapshotsParams.none()
    ): CompletableFuture<MarketDataGetSnapshotsResponse> =
        getSnapshots(params, RequestOptions.none())

    /** @see getSnapshots */
    fun getSnapshots(
        requestOptions: RequestOptions
    ): CompletableFuture<MarketDataGetSnapshotsResponse> =
        getSnapshots(MarketDataGetSnapshotsParams.none(), requestOptions)

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

        /**
         * Returns a raw HTTP response for `get /v1/market-data/daily-summary`, but is otherwise the
         * same as [MarketDataServiceAsync.getDailySummaries].
         */
        fun getDailySummaries(
            params: MarketDataGetDailySummariesParams
        ): CompletableFuture<HttpResponseFor<MarketDataGetDailySummariesResponse>> =
            getDailySummaries(params, RequestOptions.none())

        /** @see getDailySummaries */
        fun getDailySummaries(
            params: MarketDataGetDailySummariesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MarketDataGetDailySummariesResponse>>

        /**
         * Returns a raw HTTP response for `get /v1/market-data/snapshot`, but is otherwise the same
         * as [MarketDataServiceAsync.getSnapshots].
         */
        fun getSnapshots(): CompletableFuture<HttpResponseFor<MarketDataGetSnapshotsResponse>> =
            getSnapshots(MarketDataGetSnapshotsParams.none())

        /** @see getSnapshots */
        fun getSnapshots(
            params: MarketDataGetSnapshotsParams = MarketDataGetSnapshotsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MarketDataGetSnapshotsResponse>>

        /** @see getSnapshots */
        fun getSnapshots(
            params: MarketDataGetSnapshotsParams = MarketDataGetSnapshotsParams.none()
        ): CompletableFuture<HttpResponseFor<MarketDataGetSnapshotsResponse>> =
            getSnapshots(params, RequestOptions.none())

        /** @see getSnapshots */
        fun getSnapshots(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<MarketDataGetSnapshotsResponse>> =
            getSnapshots(MarketDataGetSnapshotsParams.none(), requestOptions)
    }
}
