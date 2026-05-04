// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.v1.instruments

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.core.RequestOptions
import com.clear_street.api.core.http.HttpResponseFor
import com.clear_street.api.models.v1.instruments.analystreporting.AnalystReportingGetInstrumentAnalystConsensusParams
import com.clear_street.api.models.v1.instruments.analystreporting.AnalystReportingGetInstrumentAnalystConsensusResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Retrieve details and lists of tradable instruments. */
interface AnalystReportingServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AnalystReportingServiceAsync

    /** Retrieves analyst ratings and price targets for an instrument. */
    fun getInstrumentAnalystConsensus(
        instrumentId: String
    ): CompletableFuture<AnalystReportingGetInstrumentAnalystConsensusResponse> =
        getInstrumentAnalystConsensus(
            instrumentId,
            AnalystReportingGetInstrumentAnalystConsensusParams.none(),
        )

    /** @see getInstrumentAnalystConsensus */
    fun getInstrumentAnalystConsensus(
        instrumentId: String,
        params: AnalystReportingGetInstrumentAnalystConsensusParams =
            AnalystReportingGetInstrumentAnalystConsensusParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AnalystReportingGetInstrumentAnalystConsensusResponse> =
        getInstrumentAnalystConsensus(
            params.toBuilder().instrumentId(instrumentId).build(),
            requestOptions,
        )

    /** @see getInstrumentAnalystConsensus */
    fun getInstrumentAnalystConsensus(
        instrumentId: String,
        params: AnalystReportingGetInstrumentAnalystConsensusParams =
            AnalystReportingGetInstrumentAnalystConsensusParams.none(),
    ): CompletableFuture<AnalystReportingGetInstrumentAnalystConsensusResponse> =
        getInstrumentAnalystConsensus(instrumentId, params, RequestOptions.none())

    /** @see getInstrumentAnalystConsensus */
    fun getInstrumentAnalystConsensus(
        params: AnalystReportingGetInstrumentAnalystConsensusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AnalystReportingGetInstrumentAnalystConsensusResponse>

    /** @see getInstrumentAnalystConsensus */
    fun getInstrumentAnalystConsensus(
        params: AnalystReportingGetInstrumentAnalystConsensusParams
    ): CompletableFuture<AnalystReportingGetInstrumentAnalystConsensusResponse> =
        getInstrumentAnalystConsensus(params, RequestOptions.none())

    /** @see getInstrumentAnalystConsensus */
    fun getInstrumentAnalystConsensus(
        instrumentId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<AnalystReportingGetInstrumentAnalystConsensusResponse> =
        getInstrumentAnalystConsensus(
            instrumentId,
            AnalystReportingGetInstrumentAnalystConsensusParams.none(),
            requestOptions,
        )

    /**
     * A view of [AnalystReportingServiceAsync] that provides access to raw HTTP responses for each
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
        ): AnalystReportingServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/instruments/{instrument_id}/analyst-reporting`,
         * but is otherwise the same as
         * [AnalystReportingServiceAsync.getInstrumentAnalystConsensus].
         */
        fun getInstrumentAnalystConsensus(
            instrumentId: String
        ): CompletableFuture<
            HttpResponseFor<AnalystReportingGetInstrumentAnalystConsensusResponse>
        > =
            getInstrumentAnalystConsensus(
                instrumentId,
                AnalystReportingGetInstrumentAnalystConsensusParams.none(),
            )

        /** @see getInstrumentAnalystConsensus */
        fun getInstrumentAnalystConsensus(
            instrumentId: String,
            params: AnalystReportingGetInstrumentAnalystConsensusParams =
                AnalystReportingGetInstrumentAnalystConsensusParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<
            HttpResponseFor<AnalystReportingGetInstrumentAnalystConsensusResponse>
        > =
            getInstrumentAnalystConsensus(
                params.toBuilder().instrumentId(instrumentId).build(),
                requestOptions,
            )

        /** @see getInstrumentAnalystConsensus */
        fun getInstrumentAnalystConsensus(
            instrumentId: String,
            params: AnalystReportingGetInstrumentAnalystConsensusParams =
                AnalystReportingGetInstrumentAnalystConsensusParams.none(),
        ): CompletableFuture<
            HttpResponseFor<AnalystReportingGetInstrumentAnalystConsensusResponse>
        > = getInstrumentAnalystConsensus(instrumentId, params, RequestOptions.none())

        /** @see getInstrumentAnalystConsensus */
        fun getInstrumentAnalystConsensus(
            params: AnalystReportingGetInstrumentAnalystConsensusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AnalystReportingGetInstrumentAnalystConsensusResponse>>

        /** @see getInstrumentAnalystConsensus */
        fun getInstrumentAnalystConsensus(
            params: AnalystReportingGetInstrumentAnalystConsensusParams
        ): CompletableFuture<
            HttpResponseFor<AnalystReportingGetInstrumentAnalystConsensusResponse>
        > = getInstrumentAnalystConsensus(params, RequestOptions.none())

        /** @see getInstrumentAnalystConsensus */
        fun getInstrumentAnalystConsensus(
            instrumentId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<
            HttpResponseFor<AnalystReportingGetInstrumentAnalystConsensusResponse>
        > =
            getInstrumentAnalystConsensus(
                instrumentId,
                AnalystReportingGetInstrumentAnalystConsensusParams.none(),
                requestOptions,
            )
    }
}
