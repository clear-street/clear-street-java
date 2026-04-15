// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.active.v1.instruments

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.core.RequestOptions
import com.clear_street.api.core.http.HttpResponseFor
import com.clear_street.api.models.active.v1.instruments.analystreporting.AnalystReportingGetInstrumentAnalystConsensusParams
import com.clear_street.api.models.active.v1.instruments.analystreporting.AnalystReportingGetInstrumentAnalystConsensusResponse
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
        securityId: String,
        params: AnalystReportingGetInstrumentAnalystConsensusParams,
    ): CompletableFuture<AnalystReportingGetInstrumentAnalystConsensusResponse> =
        getInstrumentAnalystConsensus(securityId, params, RequestOptions.none())

    /** @see getInstrumentAnalystConsensus */
    fun getInstrumentAnalystConsensus(
        securityId: String,
        params: AnalystReportingGetInstrumentAnalystConsensusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AnalystReportingGetInstrumentAnalystConsensusResponse> =
        getInstrumentAnalystConsensus(
            params.toBuilder().securityId(securityId).build(),
            requestOptions,
        )

    /** @see getInstrumentAnalystConsensus */
    fun getInstrumentAnalystConsensus(
        params: AnalystReportingGetInstrumentAnalystConsensusParams
    ): CompletableFuture<AnalystReportingGetInstrumentAnalystConsensusResponse> =
        getInstrumentAnalystConsensus(params, RequestOptions.none())

    /** @see getInstrumentAnalystConsensus */
    fun getInstrumentAnalystConsensus(
        params: AnalystReportingGetInstrumentAnalystConsensusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AnalystReportingGetInstrumentAnalystConsensusResponse>

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
         * Returns a raw HTTP response for `get
         * /active/v1/instruments/{security_id_source}/{security_id}/analyst-reporting`, but is
         * otherwise the same as [AnalystReportingServiceAsync.getInstrumentAnalystConsensus].
         */
        fun getInstrumentAnalystConsensus(
            securityId: String,
            params: AnalystReportingGetInstrumentAnalystConsensusParams,
        ): CompletableFuture<
            HttpResponseFor<AnalystReportingGetInstrumentAnalystConsensusResponse>
        > = getInstrumentAnalystConsensus(securityId, params, RequestOptions.none())

        /** @see getInstrumentAnalystConsensus */
        fun getInstrumentAnalystConsensus(
            securityId: String,
            params: AnalystReportingGetInstrumentAnalystConsensusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<
            HttpResponseFor<AnalystReportingGetInstrumentAnalystConsensusResponse>
        > =
            getInstrumentAnalystConsensus(
                params.toBuilder().securityId(securityId).build(),
                requestOptions,
            )

        /** @see getInstrumentAnalystConsensus */
        fun getInstrumentAnalystConsensus(
            params: AnalystReportingGetInstrumentAnalystConsensusParams
        ): CompletableFuture<
            HttpResponseFor<AnalystReportingGetInstrumentAnalystConsensusResponse>
        > = getInstrumentAnalystConsensus(params, RequestOptions.none())

        /** @see getInstrumentAnalystConsensus */
        fun getInstrumentAnalystConsensus(
            params: AnalystReportingGetInstrumentAnalystConsensusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AnalystReportingGetInstrumentAnalystConsensusResponse>>
    }
}
