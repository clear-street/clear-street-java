// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.v1.instruments

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.core.RequestOptions
import com.clear_street.api.core.http.HttpResponseFor
import com.clear_street.api.models.v1.instruments.analystreporting.AnalystReportingGetInstrumentAnalystConsensusParams
import com.clear_street.api.models.v1.instruments.analystreporting.AnalystReportingGetInstrumentAnalystConsensusResponse
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

/** Retrieve details and lists of tradable instruments. */
interface AnalystReportingService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AnalystReportingService

    /** Retrieves analyst ratings and price targets for an instrument. */
    fun getInstrumentAnalystConsensus(
        instrumentId: String
    ): AnalystReportingGetInstrumentAnalystConsensusResponse =
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
    ): AnalystReportingGetInstrumentAnalystConsensusResponse =
        getInstrumentAnalystConsensus(
            params.toBuilder().instrumentId(instrumentId).build(),
            requestOptions,
        )

    /** @see getInstrumentAnalystConsensus */
    fun getInstrumentAnalystConsensus(
        instrumentId: String,
        params: AnalystReportingGetInstrumentAnalystConsensusParams =
            AnalystReportingGetInstrumentAnalystConsensusParams.none(),
    ): AnalystReportingGetInstrumentAnalystConsensusResponse =
        getInstrumentAnalystConsensus(instrumentId, params, RequestOptions.none())

    /** @see getInstrumentAnalystConsensus */
    fun getInstrumentAnalystConsensus(
        params: AnalystReportingGetInstrumentAnalystConsensusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AnalystReportingGetInstrumentAnalystConsensusResponse

    /** @see getInstrumentAnalystConsensus */
    fun getInstrumentAnalystConsensus(
        params: AnalystReportingGetInstrumentAnalystConsensusParams
    ): AnalystReportingGetInstrumentAnalystConsensusResponse =
        getInstrumentAnalystConsensus(params, RequestOptions.none())

    /** @see getInstrumentAnalystConsensus */
    fun getInstrumentAnalystConsensus(
        instrumentId: String,
        requestOptions: RequestOptions,
    ): AnalystReportingGetInstrumentAnalystConsensusResponse =
        getInstrumentAnalystConsensus(
            instrumentId,
            AnalystReportingGetInstrumentAnalystConsensusParams.none(),
            requestOptions,
        )

    /**
     * A view of [AnalystReportingService] that provides access to raw HTTP responses for each
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
        ): AnalystReportingService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/instruments/{instrument_id}/analyst-reporting`,
         * but is otherwise the same as [AnalystReportingService.getInstrumentAnalystConsensus].
         */
        @MustBeClosed
        fun getInstrumentAnalystConsensus(
            instrumentId: String
        ): HttpResponseFor<AnalystReportingGetInstrumentAnalystConsensusResponse> =
            getInstrumentAnalystConsensus(
                instrumentId,
                AnalystReportingGetInstrumentAnalystConsensusParams.none(),
            )

        /** @see getInstrumentAnalystConsensus */
        @MustBeClosed
        fun getInstrumentAnalystConsensus(
            instrumentId: String,
            params: AnalystReportingGetInstrumentAnalystConsensusParams =
                AnalystReportingGetInstrumentAnalystConsensusParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AnalystReportingGetInstrumentAnalystConsensusResponse> =
            getInstrumentAnalystConsensus(
                params.toBuilder().instrumentId(instrumentId).build(),
                requestOptions,
            )

        /** @see getInstrumentAnalystConsensus */
        @MustBeClosed
        fun getInstrumentAnalystConsensus(
            instrumentId: String,
            params: AnalystReportingGetInstrumentAnalystConsensusParams =
                AnalystReportingGetInstrumentAnalystConsensusParams.none(),
        ): HttpResponseFor<AnalystReportingGetInstrumentAnalystConsensusResponse> =
            getInstrumentAnalystConsensus(instrumentId, params, RequestOptions.none())

        /** @see getInstrumentAnalystConsensus */
        @MustBeClosed
        fun getInstrumentAnalystConsensus(
            params: AnalystReportingGetInstrumentAnalystConsensusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AnalystReportingGetInstrumentAnalystConsensusResponse>

        /** @see getInstrumentAnalystConsensus */
        @MustBeClosed
        fun getInstrumentAnalystConsensus(
            params: AnalystReportingGetInstrumentAnalystConsensusParams
        ): HttpResponseFor<AnalystReportingGetInstrumentAnalystConsensusResponse> =
            getInstrumentAnalystConsensus(params, RequestOptions.none())

        /** @see getInstrumentAnalystConsensus */
        @MustBeClosed
        fun getInstrumentAnalystConsensus(
            instrumentId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AnalystReportingGetInstrumentAnalystConsensusResponse> =
            getInstrumentAnalystConsensus(
                instrumentId,
                AnalystReportingGetInstrumentAnalystConsensusParams.none(),
                requestOptions,
            )
    }
}
