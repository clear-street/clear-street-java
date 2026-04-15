// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.active.v1.instruments

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.core.RequestOptions
import com.clear_street.api.core.http.HttpResponseFor
import com.clear_street.api.models.active.v1.instruments.analystreporting.AnalystReportingGetInstrumentAnalystConsensusParams
import com.clear_street.api.models.active.v1.instruments.analystreporting.AnalystReportingGetInstrumentAnalystConsensusResponse
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
        securityId: String,
        params: AnalystReportingGetInstrumentAnalystConsensusParams,
    ): AnalystReportingGetInstrumentAnalystConsensusResponse =
        getInstrumentAnalystConsensus(securityId, params, RequestOptions.none())

    /** @see getInstrumentAnalystConsensus */
    fun getInstrumentAnalystConsensus(
        securityId: String,
        params: AnalystReportingGetInstrumentAnalystConsensusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AnalystReportingGetInstrumentAnalystConsensusResponse =
        getInstrumentAnalystConsensus(
            params.toBuilder().securityId(securityId).build(),
            requestOptions,
        )

    /** @see getInstrumentAnalystConsensus */
    fun getInstrumentAnalystConsensus(
        params: AnalystReportingGetInstrumentAnalystConsensusParams
    ): AnalystReportingGetInstrumentAnalystConsensusResponse =
        getInstrumentAnalystConsensus(params, RequestOptions.none())

    /** @see getInstrumentAnalystConsensus */
    fun getInstrumentAnalystConsensus(
        params: AnalystReportingGetInstrumentAnalystConsensusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AnalystReportingGetInstrumentAnalystConsensusResponse

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
         * Returns a raw HTTP response for `get
         * /active/v1/instruments/{security_id_source}/{security_id}/analyst-reporting`, but is
         * otherwise the same as [AnalystReportingService.getInstrumentAnalystConsensus].
         */
        @MustBeClosed
        fun getInstrumentAnalystConsensus(
            securityId: String,
            params: AnalystReportingGetInstrumentAnalystConsensusParams,
        ): HttpResponseFor<AnalystReportingGetInstrumentAnalystConsensusResponse> =
            getInstrumentAnalystConsensus(securityId, params, RequestOptions.none())

        /** @see getInstrumentAnalystConsensus */
        @MustBeClosed
        fun getInstrumentAnalystConsensus(
            securityId: String,
            params: AnalystReportingGetInstrumentAnalystConsensusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AnalystReportingGetInstrumentAnalystConsensusResponse> =
            getInstrumentAnalystConsensus(
                params.toBuilder().securityId(securityId).build(),
                requestOptions,
            )

        /** @see getInstrumentAnalystConsensus */
        @MustBeClosed
        fun getInstrumentAnalystConsensus(
            params: AnalystReportingGetInstrumentAnalystConsensusParams
        ): HttpResponseFor<AnalystReportingGetInstrumentAnalystConsensusResponse> =
            getInstrumentAnalystConsensus(params, RequestOptions.none())

        /** @see getInstrumentAnalystConsensus */
        @MustBeClosed
        fun getInstrumentAnalystConsensus(
            params: AnalystReportingGetInstrumentAnalystConsensusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AnalystReportingGetInstrumentAnalystConsensusResponse>
    }
}
