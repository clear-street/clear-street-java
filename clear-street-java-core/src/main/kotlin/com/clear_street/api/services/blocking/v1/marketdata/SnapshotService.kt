// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.v1.marketdata

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.core.RequestOptions
import com.clear_street.api.core.http.HttpResponseFor
import com.clear_street.api.models.v1.marketdata.snapshot.SnapshotGetSnapshotsParams
import com.clear_street.api.models.v1.marketdata.snapshot.SnapshotGetSnapshotsResponse
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

/** Real-time market data snapshots. */
interface SnapshotService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SnapshotService

    /** Get market data snapshots for one or more securities. */
    fun getSnapshots(): SnapshotGetSnapshotsResponse =
        getSnapshots(SnapshotGetSnapshotsParams.none())

    /** @see getSnapshots */
    fun getSnapshots(
        params: SnapshotGetSnapshotsParams = SnapshotGetSnapshotsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SnapshotGetSnapshotsResponse

    /** @see getSnapshots */
    fun getSnapshots(
        params: SnapshotGetSnapshotsParams = SnapshotGetSnapshotsParams.none()
    ): SnapshotGetSnapshotsResponse = getSnapshots(params, RequestOptions.none())

    /** @see getSnapshots */
    fun getSnapshots(requestOptions: RequestOptions): SnapshotGetSnapshotsResponse =
        getSnapshots(SnapshotGetSnapshotsParams.none(), requestOptions)

    /** A view of [SnapshotService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): SnapshotService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/market-data/snapshot`, but is otherwise the same
         * as [SnapshotService.getSnapshots].
         */
        @MustBeClosed
        fun getSnapshots(): HttpResponseFor<SnapshotGetSnapshotsResponse> =
            getSnapshots(SnapshotGetSnapshotsParams.none())

        /** @see getSnapshots */
        @MustBeClosed
        fun getSnapshots(
            params: SnapshotGetSnapshotsParams = SnapshotGetSnapshotsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SnapshotGetSnapshotsResponse>

        /** @see getSnapshots */
        @MustBeClosed
        fun getSnapshots(
            params: SnapshotGetSnapshotsParams = SnapshotGetSnapshotsParams.none()
        ): HttpResponseFor<SnapshotGetSnapshotsResponse> =
            getSnapshots(params, RequestOptions.none())

        /** @see getSnapshots */
        @MustBeClosed
        fun getSnapshots(
            requestOptions: RequestOptions
        ): HttpResponseFor<SnapshotGetSnapshotsResponse> =
            getSnapshots(SnapshotGetSnapshotsParams.none(), requestOptions)
    }
}
