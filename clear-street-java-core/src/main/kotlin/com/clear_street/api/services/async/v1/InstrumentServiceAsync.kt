// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.v1

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.core.RequestOptions
import com.clear_street.api.core.http.HttpResponseFor
import com.clear_street.api.models.v1.instruments.InstrumentGetInstrumentByIdParams
import com.clear_street.api.models.v1.instruments.InstrumentGetInstrumentByIdResponse
import com.clear_street.api.models.v1.instruments.InstrumentGetInstrumentsParams
import com.clear_street.api.models.v1.instruments.InstrumentGetInstrumentsResponse
import com.clear_street.api.models.v1.instruments.InstrumentSearchParams
import com.clear_street.api.models.v1.instruments.InstrumentSearchResponse
import com.clear_street.api.services.async.v1.instruments.AnalystReportingServiceAsync
import com.clear_street.api.services.async.v1.instruments.BalanceSheetServiceAsync
import com.clear_street.api.services.async.v1.instruments.CashFlowStatementServiceAsync
import com.clear_street.api.services.async.v1.instruments.EventServiceAsync
import com.clear_street.api.services.async.v1.instruments.FundamentalServiceAsync
import com.clear_street.api.services.async.v1.instruments.IncomeStatementServiceAsync
import com.clear_street.api.services.async.v1.instruments.OptionServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Retrieve details and lists of tradable instruments. */
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

    /** Retrieve details and lists of tradable instruments. */
    fun analystReporting(): AnalystReportingServiceAsync

    /** Retrieve details and lists of tradable instruments. */
    fun balanceSheets(): BalanceSheetServiceAsync

    /** Retrieve details and lists of tradable instruments. */
    fun cashFlowStatements(): CashFlowStatementServiceAsync

    /** Retrieve details and lists of tradable instruments. */
    fun events(): EventServiceAsync

    /** Retrieve details and lists of tradable instruments. */
    fun fundamentals(): FundamentalServiceAsync

    /** Retrieve details and lists of tradable instruments. */
    fun incomeStatements(): IncomeStatementServiceAsync

    /** Retrieve details and lists of tradable instruments. */
    fun options(): OptionServiceAsync

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
     * Fast in-memory typeahead search over the loaded instrument universe.
     *
     * Supports three independent match dimensions in a single `q` parameter: ticker symbol (exact >
     * prefix > substring), alt-id exact (CUSIP / ISIN / OPRA root / CMS), and company name (token +
     * character-trigram). Results are ranked by a composite score that includes ADV (log-scaled),
     * listing status, marginable / ETB flags, and OTC / restricted / liquidation-only penalties.
     * Defaults to the `EQUITY` asset class (common stock + ETFs + exchange-traded mutual funds);
     * pass `asset_class=OPTION` for option chains.
     */
    fun search(params: InstrumentSearchParams): CompletableFuture<InstrumentSearchResponse> =
        search(params, RequestOptions.none())

    /** @see search */
    fun search(
        params: InstrumentSearchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InstrumentSearchResponse>

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

        /** Retrieve details and lists of tradable instruments. */
        fun analystReporting(): AnalystReportingServiceAsync.WithRawResponse

        /** Retrieve details and lists of tradable instruments. */
        fun balanceSheets(): BalanceSheetServiceAsync.WithRawResponse

        /** Retrieve details and lists of tradable instruments. */
        fun cashFlowStatements(): CashFlowStatementServiceAsync.WithRawResponse

        /** Retrieve details and lists of tradable instruments. */
        fun events(): EventServiceAsync.WithRawResponse

        /** Retrieve details and lists of tradable instruments. */
        fun fundamentals(): FundamentalServiceAsync.WithRawResponse

        /** Retrieve details and lists of tradable instruments. */
        fun incomeStatements(): IncomeStatementServiceAsync.WithRawResponse

        /** Retrieve details and lists of tradable instruments. */
        fun options(): OptionServiceAsync.WithRawResponse

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
         * Returns a raw HTTP response for `get /v1/instruments/search`, but is otherwise the same
         * as [InstrumentServiceAsync.search].
         */
        fun search(
            params: InstrumentSearchParams
        ): CompletableFuture<HttpResponseFor<InstrumentSearchResponse>> =
            search(params, RequestOptions.none())

        /** @see search */
        fun search(
            params: InstrumentSearchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InstrumentSearchResponse>>
    }
}
