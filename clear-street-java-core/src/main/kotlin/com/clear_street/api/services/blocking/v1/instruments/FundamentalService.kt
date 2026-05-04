// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.v1.instruments

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.core.RequestOptions
import com.clear_street.api.core.http.HttpResponseFor
import com.clear_street.api.models.v1.instruments.fundamentals.FundamentalGetInstrumentFundamentalsParams
import com.clear_street.api.models.v1.instruments.fundamentals.FundamentalGetInstrumentFundamentalsResponse
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

/** Retrieve details and lists of tradable instruments. */
interface FundamentalService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): FundamentalService

    /** Retrieves supplemental fundamentals and company profile data for an instrument. */
    fun getInstrumentFundamentals(
        instrumentId: String
    ): FundamentalGetInstrumentFundamentalsResponse =
        getInstrumentFundamentals(instrumentId, FundamentalGetInstrumentFundamentalsParams.none())

    /** @see getInstrumentFundamentals */
    fun getInstrumentFundamentals(
        instrumentId: String,
        params: FundamentalGetInstrumentFundamentalsParams =
            FundamentalGetInstrumentFundamentalsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FundamentalGetInstrumentFundamentalsResponse =
        getInstrumentFundamentals(
            params.toBuilder().instrumentId(instrumentId).build(),
            requestOptions,
        )

    /** @see getInstrumentFundamentals */
    fun getInstrumentFundamentals(
        instrumentId: String,
        params: FundamentalGetInstrumentFundamentalsParams =
            FundamentalGetInstrumentFundamentalsParams.none(),
    ): FundamentalGetInstrumentFundamentalsResponse =
        getInstrumentFundamentals(instrumentId, params, RequestOptions.none())

    /** @see getInstrumentFundamentals */
    fun getInstrumentFundamentals(
        params: FundamentalGetInstrumentFundamentalsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FundamentalGetInstrumentFundamentalsResponse

    /** @see getInstrumentFundamentals */
    fun getInstrumentFundamentals(
        params: FundamentalGetInstrumentFundamentalsParams
    ): FundamentalGetInstrumentFundamentalsResponse =
        getInstrumentFundamentals(params, RequestOptions.none())

    /** @see getInstrumentFundamentals */
    fun getInstrumentFundamentals(
        instrumentId: String,
        requestOptions: RequestOptions,
    ): FundamentalGetInstrumentFundamentalsResponse =
        getInstrumentFundamentals(
            instrumentId,
            FundamentalGetInstrumentFundamentalsParams.none(),
            requestOptions,
        )

    /**
     * A view of [FundamentalService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): FundamentalService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/instruments/{instrument_id}/fundamentals`, but
         * is otherwise the same as [FundamentalService.getInstrumentFundamentals].
         */
        @MustBeClosed
        fun getInstrumentFundamentals(
            instrumentId: String
        ): HttpResponseFor<FundamentalGetInstrumentFundamentalsResponse> =
            getInstrumentFundamentals(
                instrumentId,
                FundamentalGetInstrumentFundamentalsParams.none(),
            )

        /** @see getInstrumentFundamentals */
        @MustBeClosed
        fun getInstrumentFundamentals(
            instrumentId: String,
            params: FundamentalGetInstrumentFundamentalsParams =
                FundamentalGetInstrumentFundamentalsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FundamentalGetInstrumentFundamentalsResponse> =
            getInstrumentFundamentals(
                params.toBuilder().instrumentId(instrumentId).build(),
                requestOptions,
            )

        /** @see getInstrumentFundamentals */
        @MustBeClosed
        fun getInstrumentFundamentals(
            instrumentId: String,
            params: FundamentalGetInstrumentFundamentalsParams =
                FundamentalGetInstrumentFundamentalsParams.none(),
        ): HttpResponseFor<FundamentalGetInstrumentFundamentalsResponse> =
            getInstrumentFundamentals(instrumentId, params, RequestOptions.none())

        /** @see getInstrumentFundamentals */
        @MustBeClosed
        fun getInstrumentFundamentals(
            params: FundamentalGetInstrumentFundamentalsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FundamentalGetInstrumentFundamentalsResponse>

        /** @see getInstrumentFundamentals */
        @MustBeClosed
        fun getInstrumentFundamentals(
            params: FundamentalGetInstrumentFundamentalsParams
        ): HttpResponseFor<FundamentalGetInstrumentFundamentalsResponse> =
            getInstrumentFundamentals(params, RequestOptions.none())

        /** @see getInstrumentFundamentals */
        @MustBeClosed
        fun getInstrumentFundamentals(
            instrumentId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FundamentalGetInstrumentFundamentalsResponse> =
            getInstrumentFundamentals(
                instrumentId,
                FundamentalGetInstrumentFundamentalsParams.none(),
                requestOptions,
            )
    }
}
