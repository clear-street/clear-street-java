// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.v1.marketdata

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.core.RequestOptions
import com.clear_street.api.core.http.HttpResponseFor
import com.clear_street.api.models.v1.marketdata.snapshot.SnapshotGetSnapshotsParams
import com.clear_street.api.models.v1.marketdata.snapshot.SnapshotGetSnapshotsResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Real-time market data snapshots. */
interface SnapshotServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SnapshotServiceAsync

    /** Get market data snapshots for one or more securities. */
    fun getSnapshots(): CompletableFuture<SnapshotGetSnapshotsResponse> =
        getSnapshots(SnapshotGetSnapshotsParams.none())

    /** @see getSnapshots */
    fun getSnapshots(
        params: SnapshotGetSnapshotsParams = SnapshotGetSnapshotsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SnapshotGetSnapshotsResponse>

    /** @see getSnapshots */
    fun getSnapshots(
        params: SnapshotGetSnapshotsParams = SnapshotGetSnapshotsParams.none()
    ): CompletableFuture<SnapshotGetSnapshotsResponse> = getSnapshots(params, RequestOptions.none())

    /** @see getSnapshots */
    fun getSnapshots(
        requestOptions: RequestOptions
    ): CompletableFuture<SnapshotGetSnapshotsResponse> =
        getSnapshots(SnapshotGetSnapshotsParams.none(), requestOptions)

    /**
     * A view of [SnapshotServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SnapshotServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/market-data/snapshot`, but is otherwise the same
         * as [SnapshotServiceAsync.getSnapshots].
         */
        fun getSnapshots(): CompletableFuture<HttpResponseFor<SnapshotGetSnapshotsResponse>> =
            getSnapshots(SnapshotGetSnapshotsParams.none())

        /** @see getSnapshots */
        fun getSnapshots(
            params: SnapshotGetSnapshotsParams = SnapshotGetSnapshotsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SnapshotGetSnapshotsResponse>>

        /** @see getSnapshots */
        fun getSnapshots(
            params: SnapshotGetSnapshotsParams = SnapshotGetSnapshotsParams.none()
        ): CompletableFuture<HttpResponseFor<SnapshotGetSnapshotsResponse>> =
            getSnapshots(params, RequestOptions.none())

        /** @see getSnapshots */
        fun getSnapshots(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<SnapshotGetSnapshotsResponse>> =
            getSnapshots(SnapshotGetSnapshotsParams.none(), requestOptions)
    }
}
