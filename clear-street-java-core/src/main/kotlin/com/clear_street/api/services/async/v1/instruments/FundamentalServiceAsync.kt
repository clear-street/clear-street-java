// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.v1.instruments

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.core.RequestOptions
import com.clear_street.api.core.http.HttpResponseFor
import com.clear_street.api.models.v1.instruments.fundamentals.FundamentalGetInstrumentFundamentalsParams
import com.clear_street.api.models.v1.instruments.fundamentals.FundamentalGetInstrumentFundamentalsResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Retrieve details and lists of tradable instruments. */
interface FundamentalServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): FundamentalServiceAsync

    /** Retrieves supplemental fundamentals and company profile data for an instrument. */
    fun getInstrumentFundamentals(
        instrumentId: String
    ): CompletableFuture<FundamentalGetInstrumentFundamentalsResponse> =
        getInstrumentFundamentals(instrumentId, FundamentalGetInstrumentFundamentalsParams.none())

    /** @see getInstrumentFundamentals */
    fun getInstrumentFundamentals(
        instrumentId: String,
        params: FundamentalGetInstrumentFundamentalsParams =
            FundamentalGetInstrumentFundamentalsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FundamentalGetInstrumentFundamentalsResponse> =
        getInstrumentFundamentals(
            params.toBuilder().instrumentId(instrumentId).build(),
            requestOptions,
        )

    /** @see getInstrumentFundamentals */
    fun getInstrumentFundamentals(
        instrumentId: String,
        params: FundamentalGetInstrumentFundamentalsParams =
            FundamentalGetInstrumentFundamentalsParams.none(),
    ): CompletableFuture<FundamentalGetInstrumentFundamentalsResponse> =
        getInstrumentFundamentals(instrumentId, params, RequestOptions.none())

    /** @see getInstrumentFundamentals */
    fun getInstrumentFundamentals(
        params: FundamentalGetInstrumentFundamentalsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FundamentalGetInstrumentFundamentalsResponse>

    /** @see getInstrumentFundamentals */
    fun getInstrumentFundamentals(
        params: FundamentalGetInstrumentFundamentalsParams
    ): CompletableFuture<FundamentalGetInstrumentFundamentalsResponse> =
        getInstrumentFundamentals(params, RequestOptions.none())

    /** @see getInstrumentFundamentals */
    fun getInstrumentFundamentals(
        instrumentId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<FundamentalGetInstrumentFundamentalsResponse> =
        getInstrumentFundamentals(
            instrumentId,
            FundamentalGetInstrumentFundamentalsParams.none(),
            requestOptions,
        )

    /**
     * A view of [FundamentalServiceAsync] that provides access to raw HTTP responses for each
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
        ): FundamentalServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/instruments/{instrument_id}/fundamentals`, but
         * is otherwise the same as [FundamentalServiceAsync.getInstrumentFundamentals].
         */
        fun getInstrumentFundamentals(
            instrumentId: String
        ): CompletableFuture<HttpResponseFor<FundamentalGetInstrumentFundamentalsResponse>> =
            getInstrumentFundamentals(
                instrumentId,
                FundamentalGetInstrumentFundamentalsParams.none(),
            )

        /** @see getInstrumentFundamentals */
        fun getInstrumentFundamentals(
            instrumentId: String,
            params: FundamentalGetInstrumentFundamentalsParams =
                FundamentalGetInstrumentFundamentalsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FundamentalGetInstrumentFundamentalsResponse>> =
            getInstrumentFundamentals(
                params.toBuilder().instrumentId(instrumentId).build(),
                requestOptions,
            )

        /** @see getInstrumentFundamentals */
        fun getInstrumentFundamentals(
            instrumentId: String,
            params: FundamentalGetInstrumentFundamentalsParams =
                FundamentalGetInstrumentFundamentalsParams.none(),
        ): CompletableFuture<HttpResponseFor<FundamentalGetInstrumentFundamentalsResponse>> =
            getInstrumentFundamentals(instrumentId, params, RequestOptions.none())

        /** @see getInstrumentFundamentals */
        fun getInstrumentFundamentals(
            params: FundamentalGetInstrumentFundamentalsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FundamentalGetInstrumentFundamentalsResponse>>

        /** @see getInstrumentFundamentals */
        fun getInstrumentFundamentals(
            params: FundamentalGetInstrumentFundamentalsParams
        ): CompletableFuture<HttpResponseFor<FundamentalGetInstrumentFundamentalsResponse>> =
            getInstrumentFundamentals(params, RequestOptions.none())

        /** @see getInstrumentFundamentals */
        fun getInstrumentFundamentals(
            instrumentId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FundamentalGetInstrumentFundamentalsResponse>> =
            getInstrumentFundamentals(
                instrumentId,
                FundamentalGetInstrumentFundamentalsParams.none(),
                requestOptions,
            )
    }
}
