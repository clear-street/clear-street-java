// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.active.v1.instruments

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.core.RequestOptions
import com.clear_street.api.core.http.HttpResponseFor
import com.clear_street.api.models.active.v1.instruments.fundamentals.FundamentalGetInstrumentFundamentalsParams
import com.clear_street.api.models.active.v1.instruments.fundamentals.FundamentalGetInstrumentFundamentalsResponse
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
    fun getInstrumentFundamentals(id: String): FundamentalGetInstrumentFundamentalsResponse =
        getInstrumentFundamentals(id, FundamentalGetInstrumentFundamentalsParams.none())

    /** @see getInstrumentFundamentals */
    fun getInstrumentFundamentals(
        id: String,
        params: FundamentalGetInstrumentFundamentalsParams =
            FundamentalGetInstrumentFundamentalsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FundamentalGetInstrumentFundamentalsResponse =
        getInstrumentFundamentals(params.toBuilder().id(id).build(), requestOptions)

    /** @see getInstrumentFundamentals */
    fun getInstrumentFundamentals(
        id: String,
        params: FundamentalGetInstrumentFundamentalsParams =
            FundamentalGetInstrumentFundamentalsParams.none(),
    ): FundamentalGetInstrumentFundamentalsResponse =
        getInstrumentFundamentals(id, params, RequestOptions.none())

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
        id: String,
        requestOptions: RequestOptions,
    ): FundamentalGetInstrumentFundamentalsResponse =
        getInstrumentFundamentals(
            id,
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
         * Returns a raw HTTP response for `get /active/v1/instruments/{id}/fundamentals`, but is
         * otherwise the same as [FundamentalService.getInstrumentFundamentals].
         */
        @MustBeClosed
        fun getInstrumentFundamentals(
            id: String
        ): HttpResponseFor<FundamentalGetInstrumentFundamentalsResponse> =
            getInstrumentFundamentals(id, FundamentalGetInstrumentFundamentalsParams.none())

        /** @see getInstrumentFundamentals */
        @MustBeClosed
        fun getInstrumentFundamentals(
            id: String,
            params: FundamentalGetInstrumentFundamentalsParams =
                FundamentalGetInstrumentFundamentalsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FundamentalGetInstrumentFundamentalsResponse> =
            getInstrumentFundamentals(params.toBuilder().id(id).build(), requestOptions)

        /** @see getInstrumentFundamentals */
        @MustBeClosed
        fun getInstrumentFundamentals(
            id: String,
            params: FundamentalGetInstrumentFundamentalsParams =
                FundamentalGetInstrumentFundamentalsParams.none(),
        ): HttpResponseFor<FundamentalGetInstrumentFundamentalsResponse> =
            getInstrumentFundamentals(id, params, RequestOptions.none())

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
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FundamentalGetInstrumentFundamentalsResponse> =
            getInstrumentFundamentals(
                id,
                FundamentalGetInstrumentFundamentalsParams.none(),
                requestOptions,
            )
    }
}
