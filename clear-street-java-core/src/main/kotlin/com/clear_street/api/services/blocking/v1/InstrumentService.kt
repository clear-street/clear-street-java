// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.v1

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
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

/** Retrieve core details and discovery endpoints for tradable instruments. */
interface InstrumentService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): InstrumentService

    /** Retrieves detailed information for a specific instrument. */
    fun getInstrumentById(instrumentId: String): InstrumentGetInstrumentByIdResponse =
        getInstrumentById(instrumentId, InstrumentGetInstrumentByIdParams.none())

    /** @see getInstrumentById */
    fun getInstrumentById(
        instrumentId: String,
        params: InstrumentGetInstrumentByIdParams = InstrumentGetInstrumentByIdParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InstrumentGetInstrumentByIdResponse =
        getInstrumentById(params.toBuilder().instrumentId(instrumentId).build(), requestOptions)

    /** @see getInstrumentById */
    fun getInstrumentById(
        instrumentId: String,
        params: InstrumentGetInstrumentByIdParams = InstrumentGetInstrumentByIdParams.none(),
    ): InstrumentGetInstrumentByIdResponse =
        getInstrumentById(instrumentId, params, RequestOptions.none())

    /** @see getInstrumentById */
    fun getInstrumentById(
        params: InstrumentGetInstrumentByIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InstrumentGetInstrumentByIdResponse

    /** @see getInstrumentById */
    fun getInstrumentById(
        params: InstrumentGetInstrumentByIdParams
    ): InstrumentGetInstrumentByIdResponse = getInstrumentById(params, RequestOptions.none())

    /** @see getInstrumentById */
    fun getInstrumentById(
        instrumentId: String,
        requestOptions: RequestOptions,
    ): InstrumentGetInstrumentByIdResponse =
        getInstrumentById(instrumentId, InstrumentGetInstrumentByIdParams.none(), requestOptions)

    /** Retrieves a list of tradeable instruments. */
    fun getInstruments(): InstrumentGetInstrumentsResponse =
        getInstruments(InstrumentGetInstrumentsParams.none())

    /** @see getInstruments */
    fun getInstruments(
        params: InstrumentGetInstrumentsParams = InstrumentGetInstrumentsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InstrumentGetInstrumentsResponse

    /** @see getInstruments */
    fun getInstruments(
        params: InstrumentGetInstrumentsParams = InstrumentGetInstrumentsParams.none()
    ): InstrumentGetInstrumentsResponse = getInstruments(params, RequestOptions.none())

    /** @see getInstruments */
    fun getInstruments(requestOptions: RequestOptions): InstrumentGetInstrumentsResponse =
        getInstruments(InstrumentGetInstrumentsParams.none(), requestOptions)

    /**
     * List options contracts.
     *
     * Returns options contracts for a given underlier with options-specific metadata. Exactly one
     * underlier identifier must be provided.
     */
    fun getOptionContracts(): InstrumentGetOptionContractsResponse =
        getOptionContracts(InstrumentGetOptionContractsParams.none())

    /** @see getOptionContracts */
    fun getOptionContracts(
        params: InstrumentGetOptionContractsParams = InstrumentGetOptionContractsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InstrumentGetOptionContractsResponse

    /** @see getOptionContracts */
    fun getOptionContracts(
        params: InstrumentGetOptionContractsParams = InstrumentGetOptionContractsParams.none()
    ): InstrumentGetOptionContractsResponse = getOptionContracts(params, RequestOptions.none())

    /** @see getOptionContracts */
    fun getOptionContracts(requestOptions: RequestOptions): InstrumentGetOptionContractsResponse =
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
    ): InstrumentSearchInstrumentsResponse = searchInstruments(params, RequestOptions.none())

    /** @see searchInstruments */
    fun searchInstruments(
        params: InstrumentSearchInstrumentsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InstrumentSearchInstrumentsResponse

    /** A view of [InstrumentService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): InstrumentService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/instruments/{instrument_id}`, but is otherwise
         * the same as [InstrumentService.getInstrumentById].
         */
        @MustBeClosed
        fun getInstrumentById(
            instrumentId: String
        ): HttpResponseFor<InstrumentGetInstrumentByIdResponse> =
            getInstrumentById(instrumentId, InstrumentGetInstrumentByIdParams.none())

        /** @see getInstrumentById */
        @MustBeClosed
        fun getInstrumentById(
            instrumentId: String,
            params: InstrumentGetInstrumentByIdParams = InstrumentGetInstrumentByIdParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InstrumentGetInstrumentByIdResponse> =
            getInstrumentById(params.toBuilder().instrumentId(instrumentId).build(), requestOptions)

        /** @see getInstrumentById */
        @MustBeClosed
        fun getInstrumentById(
            instrumentId: String,
            params: InstrumentGetInstrumentByIdParams = InstrumentGetInstrumentByIdParams.none(),
        ): HttpResponseFor<InstrumentGetInstrumentByIdResponse> =
            getInstrumentById(instrumentId, params, RequestOptions.none())

        /** @see getInstrumentById */
        @MustBeClosed
        fun getInstrumentById(
            params: InstrumentGetInstrumentByIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InstrumentGetInstrumentByIdResponse>

        /** @see getInstrumentById */
        @MustBeClosed
        fun getInstrumentById(
            params: InstrumentGetInstrumentByIdParams
        ): HttpResponseFor<InstrumentGetInstrumentByIdResponse> =
            getInstrumentById(params, RequestOptions.none())

        /** @see getInstrumentById */
        @MustBeClosed
        fun getInstrumentById(
            instrumentId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InstrumentGetInstrumentByIdResponse> =
            getInstrumentById(
                instrumentId,
                InstrumentGetInstrumentByIdParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /v1/instruments`, but is otherwise the same as
         * [InstrumentService.getInstruments].
         */
        @MustBeClosed
        fun getInstruments(): HttpResponseFor<InstrumentGetInstrumentsResponse> =
            getInstruments(InstrumentGetInstrumentsParams.none())

        /** @see getInstruments */
        @MustBeClosed
        fun getInstruments(
            params: InstrumentGetInstrumentsParams = InstrumentGetInstrumentsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InstrumentGetInstrumentsResponse>

        /** @see getInstruments */
        @MustBeClosed
        fun getInstruments(
            params: InstrumentGetInstrumentsParams = InstrumentGetInstrumentsParams.none()
        ): HttpResponseFor<InstrumentGetInstrumentsResponse> =
            getInstruments(params, RequestOptions.none())

        /** @see getInstruments */
        @MustBeClosed
        fun getInstruments(
            requestOptions: RequestOptions
        ): HttpResponseFor<InstrumentGetInstrumentsResponse> =
            getInstruments(InstrumentGetInstrumentsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/instruments/options/contracts`, but is otherwise
         * the same as [InstrumentService.getOptionContracts].
         */
        @MustBeClosed
        fun getOptionContracts(): HttpResponseFor<InstrumentGetOptionContractsResponse> =
            getOptionContracts(InstrumentGetOptionContractsParams.none())

        /** @see getOptionContracts */
        @MustBeClosed
        fun getOptionContracts(
            params: InstrumentGetOptionContractsParams = InstrumentGetOptionContractsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InstrumentGetOptionContractsResponse>

        /** @see getOptionContracts */
        @MustBeClosed
        fun getOptionContracts(
            params: InstrumentGetOptionContractsParams = InstrumentGetOptionContractsParams.none()
        ): HttpResponseFor<InstrumentGetOptionContractsResponse> =
            getOptionContracts(params, RequestOptions.none())

        /** @see getOptionContracts */
        @MustBeClosed
        fun getOptionContracts(
            requestOptions: RequestOptions
        ): HttpResponseFor<InstrumentGetOptionContractsResponse> =
            getOptionContracts(InstrumentGetOptionContractsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/instruments/search`, but is otherwise the same
         * as [InstrumentService.searchInstruments].
         */
        @MustBeClosed
        fun searchInstruments(
            params: InstrumentSearchInstrumentsParams
        ): HttpResponseFor<InstrumentSearchInstrumentsResponse> =
            searchInstruments(params, RequestOptions.none())

        /** @see searchInstruments */
        @MustBeClosed
        fun searchInstruments(
            params: InstrumentSearchInstrumentsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InstrumentSearchInstrumentsResponse>
    }
}
