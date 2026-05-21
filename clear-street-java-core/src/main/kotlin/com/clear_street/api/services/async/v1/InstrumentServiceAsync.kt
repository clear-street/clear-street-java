// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.v1

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.core.RequestOptions
import com.clear_street.api.core.http.HttpResponseFor
import com.clear_street.api.models.v1.instruments.InstrumentGetInstrumentByIdParams
import com.clear_street.api.models.v1.instruments.InstrumentGetInstrumentByIdResponse
import com.clear_street.api.models.v1.instruments.InstrumentGetInstrumentsParams
import com.clear_street.api.models.v1.instruments.InstrumentGetInstrumentsResponse
import com.clear_street.api.models.v1.instruments.InstrumentGetOptionContractsParams
import com.clear_street.api.models.v1.instruments.InstrumentGetOptionContractsResponse
import com.clear_street.api.models.v1.instruments.InstrumentSearchInstrumentsParams
import com.clear_street.api.models.v1.instruments.InstrumentSearchInstrumentsResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Retrieve core details and discovery endpoints for tradable instruments. */
interface InstrumentServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): InstrumentServiceAsync

    /** Retrieves detailed information for a specific instrument. */
    fun getInstrumentById(
        instrumentId: String
    ): CompletableFuture<InstrumentGetInstrumentByIdResponse> =
        getInstrumentById(instrumentId, InstrumentGetInstrumentByIdParams.none())

    /** @see getInstrumentById */
    fun getInstrumentById(
        instrumentId: String,
        params: InstrumentGetInstrumentByIdParams = InstrumentGetInstrumentByIdParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InstrumentGetInstrumentByIdResponse> =
        getInstrumentById(params.toBuilder().instrumentId(instrumentId).build(), requestOptions)

    /** @see getInstrumentById */
    fun getInstrumentById(
        instrumentId: String,
        params: InstrumentGetInstrumentByIdParams = InstrumentGetInstrumentByIdParams.none(),
    ): CompletableFuture<InstrumentGetInstrumentByIdResponse> =
        getInstrumentById(instrumentId, params, RequestOptions.none())

    /** @see getInstrumentById */
    fun getInstrumentById(
        params: InstrumentGetInstrumentByIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InstrumentGetInstrumentByIdResponse>

    /** @see getInstrumentById */
    fun getInstrumentById(
        params: InstrumentGetInstrumentByIdParams
    ): CompletableFuture<InstrumentGetInstrumentByIdResponse> =
        getInstrumentById(params, RequestOptions.none())

    /** @see getInstrumentById */
    fun getInstrumentById(
        instrumentId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<InstrumentGetInstrumentByIdResponse> =
        getInstrumentById(instrumentId, InstrumentGetInstrumentByIdParams.none(), requestOptions)

    /** Retrieves a list of tradeable instruments. */
    fun getInstruments(): CompletableFuture<InstrumentGetInstrumentsResponse> =
        getInstruments(InstrumentGetInstrumentsParams.none())

    /** @see getInstruments */
    fun getInstruments(
        params: InstrumentGetInstrumentsParams = InstrumentGetInstrumentsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InstrumentGetInstrumentsResponse>

    /** @see getInstruments */
    fun getInstruments(
        params: InstrumentGetInstrumentsParams = InstrumentGetInstrumentsParams.none()
    ): CompletableFuture<InstrumentGetInstrumentsResponse> =
        getInstruments(params, RequestOptions.none())

    /** @see getInstruments */
    fun getInstruments(
        requestOptions: RequestOptions
    ): CompletableFuture<InstrumentGetInstrumentsResponse> =
        getInstruments(InstrumentGetInstrumentsParams.none(), requestOptions)

    /**
     * List options contracts.
     *
     * Returns options contracts for a given underlier with options-specific metadata. Exactly one
     * underlier identifier must be provided.
     */
    fun getOptionContracts(): CompletableFuture<InstrumentGetOptionContractsResponse> =
        getOptionContracts(InstrumentGetOptionContractsParams.none())

    /** @see getOptionContracts */
    fun getOptionContracts(
        params: InstrumentGetOptionContractsParams = InstrumentGetOptionContractsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InstrumentGetOptionContractsResponse>

    /** @see getOptionContracts */
    fun getOptionContracts(
        params: InstrumentGetOptionContractsParams = InstrumentGetOptionContractsParams.none()
    ): CompletableFuture<InstrumentGetOptionContractsResponse> =
        getOptionContracts(params, RequestOptions.none())

    /** @see getOptionContracts */
    fun getOptionContracts(
        requestOptions: RequestOptions
    ): CompletableFuture<InstrumentGetOptionContractsResponse> =
        getOptionContracts(InstrumentGetOptionContractsParams.none(), requestOptions)

    /**
     * Search instruments by symbol, alternate identifier, or company name.
     *
     * The `q` parameter is case-insensitive and supports ticker symbols, alternate identifiers such
     * as CUSIP, ISIN, OPRA root, and CMS identifiers, and company names for non-option instruments.
     * Results are ranked by match quality plus instrument quality signals including log-scaled ADV,
     * listing status, marginability, easy-to-borrow status, and OTC, restricted, and
     * liquidation-only penalties. Defaults to the `EQUITY` asset class (common stocks, preferred
     * shares, ADRs, ETFs, and exchange-traded mutual funds). Pass `asset_class=OPTION` to search
     * option contracts by symbol or alternate identifier.
     */
    fun searchInstruments(
        params: InstrumentSearchInstrumentsParams
    ): CompletableFuture<InstrumentSearchInstrumentsResponse> =
        searchInstruments(params, RequestOptions.none())

    /** @see searchInstruments */
    fun searchInstruments(
        params: InstrumentSearchInstrumentsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InstrumentSearchInstrumentsResponse>

    /**
     * A view of [InstrumentServiceAsync] that provides access to raw HTTP responses for each
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
        ): InstrumentServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/instruments/{instrument_id}`, but is otherwise
         * the same as [InstrumentServiceAsync.getInstrumentById].
         */
        fun getInstrumentById(
            instrumentId: String
        ): CompletableFuture<HttpResponseFor<InstrumentGetInstrumentByIdResponse>> =
            getInstrumentById(instrumentId, InstrumentGetInstrumentByIdParams.none())

        /** @see getInstrumentById */
        fun getInstrumentById(
            instrumentId: String,
            params: InstrumentGetInstrumentByIdParams = InstrumentGetInstrumentByIdParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InstrumentGetInstrumentByIdResponse>> =
            getInstrumentById(params.toBuilder().instrumentId(instrumentId).build(), requestOptions)

        /** @see getInstrumentById */
        fun getInstrumentById(
            instrumentId: String,
            params: InstrumentGetInstrumentByIdParams = InstrumentGetInstrumentByIdParams.none(),
        ): CompletableFuture<HttpResponseFor<InstrumentGetInstrumentByIdResponse>> =
            getInstrumentById(instrumentId, params, RequestOptions.none())

        /** @see getInstrumentById */
        fun getInstrumentById(
            params: InstrumentGetInstrumentByIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InstrumentGetInstrumentByIdResponse>>

        /** @see getInstrumentById */
        fun getInstrumentById(
            params: InstrumentGetInstrumentByIdParams
        ): CompletableFuture<HttpResponseFor<InstrumentGetInstrumentByIdResponse>> =
            getInstrumentById(params, RequestOptions.none())

        /** @see getInstrumentById */
        fun getInstrumentById(
            instrumentId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InstrumentGetInstrumentByIdResponse>> =
            getInstrumentById(
                instrumentId,
                InstrumentGetInstrumentByIdParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /v1/instruments`, but is otherwise the same as
         * [InstrumentServiceAsync.getInstruments].
         */
        fun getInstruments(): CompletableFuture<HttpResponseFor<InstrumentGetInstrumentsResponse>> =
            getInstruments(InstrumentGetInstrumentsParams.none())

        /** @see getInstruments */
        fun getInstruments(
            params: InstrumentGetInstrumentsParams = InstrumentGetInstrumentsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InstrumentGetInstrumentsResponse>>

        /** @see getInstruments */
        fun getInstruments(
            params: InstrumentGetInstrumentsParams = InstrumentGetInstrumentsParams.none()
        ): CompletableFuture<HttpResponseFor<InstrumentGetInstrumentsResponse>> =
            getInstruments(params, RequestOptions.none())

        /** @see getInstruments */
        fun getInstruments(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<InstrumentGetInstrumentsResponse>> =
            getInstruments(InstrumentGetInstrumentsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/instruments/options/contracts`, but is otherwise
         * the same as [InstrumentServiceAsync.getOptionContracts].
         */
        fun getOptionContracts():
            CompletableFuture<HttpResponseFor<InstrumentGetOptionContractsResponse>> =
            getOptionContracts(InstrumentGetOptionContractsParams.none())

        /** @see getOptionContracts */
        fun getOptionContracts(
            params: InstrumentGetOptionContractsParams = InstrumentGetOptionContractsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InstrumentGetOptionContractsResponse>>

        /** @see getOptionContracts */
        fun getOptionContracts(
            params: InstrumentGetOptionContractsParams = InstrumentGetOptionContractsParams.none()
        ): CompletableFuture<HttpResponseFor<InstrumentGetOptionContractsResponse>> =
            getOptionContracts(params, RequestOptions.none())

        /** @see getOptionContracts */
        fun getOptionContracts(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<InstrumentGetOptionContractsResponse>> =
            getOptionContracts(InstrumentGetOptionContractsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/instruments/search`, but is otherwise the same
         * as [InstrumentServiceAsync.searchInstruments].
         */
        fun searchInstruments(
            params: InstrumentSearchInstrumentsParams
        ): CompletableFuture<HttpResponseFor<InstrumentSearchInstrumentsResponse>> =
            searchInstruments(params, RequestOptions.none())

        /** @see searchInstruments */
        fun searchInstruments(
            params: InstrumentSearchInstrumentsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InstrumentSearchInstrumentsResponse>>
    }
}
