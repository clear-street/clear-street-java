// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.active.v1.marketdata

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.core.RequestOptions
import com.clear_street.api.core.http.HttpResponseFor
import com.clear_street.api.models.active.v1.marketdata.dailysummary.DailySummaryGetDailySummariesParams
import com.clear_street.api.models.active.v1.marketdata.dailysummary.DailySummaryGetDailySummariesResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Real-time market data snapshots. */
interface DailySummaryServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DailySummaryServiceAsync

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
        params: DailySummaryGetDailySummariesParams
    ): CompletableFuture<DailySummaryGetDailySummariesResponse> =
        getDailySummaries(params, RequestOptions.none())

    /** @see getDailySummaries */
    fun getDailySummaries(
        params: DailySummaryGetDailySummariesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DailySummaryGetDailySummariesResponse>

    /**
     * A view of [DailySummaryServiceAsync] that provides access to raw HTTP responses for each
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
        ): DailySummaryServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /active/v1/market-data/daily-summary`, but is
         * otherwise the same as [DailySummaryServiceAsync.getDailySummaries].
         */
        fun getDailySummaries(
            params: DailySummaryGetDailySummariesParams
        ): CompletableFuture<HttpResponseFor<DailySummaryGetDailySummariesResponse>> =
            getDailySummaries(params, RequestOptions.none())

        /** @see getDailySummaries */
        fun getDailySummaries(
            params: DailySummaryGetDailySummariesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DailySummaryGetDailySummariesResponse>>
    }
}
