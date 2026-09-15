// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.services.blocking.v1.instrumentdata

import com.clearstreet.api.core.ClientOptions
import com.clearstreet.api.core.RequestOptions
import com.clearstreet.api.core.http.HttpResponseFor
import com.clearstreet.api.models.v1.instrumentdata.marketdata.MarketDataGetDailySummariesParams
import com.clearstreet.api.models.v1.instrumentdata.marketdata.MarketDataGetDailySummariesResponse
import com.clearstreet.api.models.v1.instrumentdata.marketdata.MarketDataGetSnapshotsParams
import com.clearstreet.api.models.v1.instrumentdata.marketdata.MarketDataGetSnapshotsResponse
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

/** Retrieve instrument analytics, market data, news, and related reference data. */
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

    /**
     * **Deprecated**: use `GET /market-data/snapshot` instead, which now reports the same
     * open/high/low/volume/open-interest fields under `session` and top-level `open_interest`.
     *
     * Returns the most recent open, high, low, volume (OHLV) and current price for the requested
     * instruments.
     *
     * Response contract: every request returns one row per **unique** resolved `instrument_id`, in
     * first-seen request order. Resolvable ids with no available data come back with `symbol`
     * populated but market-data fields `null`. Ids that fail to resolve are omitted from `data` and
     * reported in `error` instead (see the 207/404 responses below).
     */
    @Deprecated("deprecated")
    fun getDailySummaries(
        params: MarketDataGetDailySummariesParams
    ): MarketDataGetDailySummariesResponse = getDailySummaries(params, RequestOptions.none())

    /** @see getDailySummaries */
    @Deprecated("deprecated")
    fun getDailySummaries(
        params: MarketDataGetDailySummariesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MarketDataGetDailySummariesResponse

    /** Get market data snapshots for one or more securities. */
    fun getSnapshots(): MarketDataGetSnapshotsResponse =
        getSnapshots(MarketDataGetSnapshotsParams.none())

    /** @see getSnapshots */
    fun getSnapshots(
        params: MarketDataGetSnapshotsParams = MarketDataGetSnapshotsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MarketDataGetSnapshotsResponse

    /** @see getSnapshots */
    fun getSnapshots(
        params: MarketDataGetSnapshotsParams = MarketDataGetSnapshotsParams.none()
    ): MarketDataGetSnapshotsResponse = getSnapshots(params, RequestOptions.none())

    /** @see getSnapshots */
    fun getSnapshots(requestOptions: RequestOptions): MarketDataGetSnapshotsResponse =
        getSnapshots(MarketDataGetSnapshotsParams.none(), requestOptions)

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

        /**
         * Returns a raw HTTP response for `get /v1/market-data/daily-summary`, but is otherwise the
         * same as [MarketDataService.getDailySummaries].
         */
        @Deprecated("deprecated")
        @MustBeClosed
        fun getDailySummaries(
            params: MarketDataGetDailySummariesParams
        ): HttpResponseFor<MarketDataGetDailySummariesResponse> =
            getDailySummaries(params, RequestOptions.none())

        /** @see getDailySummaries */
        @Deprecated("deprecated")
        @MustBeClosed
        fun getDailySummaries(
            params: MarketDataGetDailySummariesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MarketDataGetDailySummariesResponse>

        /**
         * Returns a raw HTTP response for `get /v1/market-data/snapshot`, but is otherwise the same
         * as [MarketDataService.getSnapshots].
         */
        @MustBeClosed
        fun getSnapshots(): HttpResponseFor<MarketDataGetSnapshotsResponse> =
            getSnapshots(MarketDataGetSnapshotsParams.none())

        /** @see getSnapshots */
        @MustBeClosed
        fun getSnapshots(
            params: MarketDataGetSnapshotsParams = MarketDataGetSnapshotsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MarketDataGetSnapshotsResponse>

        /** @see getSnapshots */
        @MustBeClosed
        fun getSnapshots(
            params: MarketDataGetSnapshotsParams = MarketDataGetSnapshotsParams.none()
        ): HttpResponseFor<MarketDataGetSnapshotsResponse> =
            getSnapshots(params, RequestOptions.none())

        /** @see getSnapshots */
        @MustBeClosed
        fun getSnapshots(
            requestOptions: RequestOptions
        ): HttpResponseFor<MarketDataGetSnapshotsResponse> =
            getSnapshots(MarketDataGetSnapshotsParams.none(), requestOptions)
    }
}
