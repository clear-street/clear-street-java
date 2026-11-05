// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.services.async.v1

import com.clearstreet.api.core.ClientOptions
import com.clearstreet.api.core.RequestOptions
import com.clearstreet.api.core.http.HttpResponseFor
import com.clearstreet.api.models.v1.instruments.InstrumentGetInstrumentByIdParams
import com.clearstreet.api.models.v1.instruments.InstrumentGetInstrumentByIdResponse
import com.clearstreet.api.models.v1.instruments.InstrumentGetInstrumentsParams
import com.clearstreet.api.models.v1.instruments.InstrumentGetInstrumentsResponse
import com.clearstreet.api.models.v1.instruments.InstrumentGetOptionContractsParams
import com.clearstreet.api.models.v1.instruments.InstrumentGetOptionContractsResponse
import com.clearstreet.api.models.v1.instruments.InstrumentGetPredictionCategoriesParams
import com.clearstreet.api.models.v1.instruments.InstrumentGetPredictionCategoriesResponse
import com.clearstreet.api.models.v1.instruments.InstrumentGetPredictionEventsParams
import com.clearstreet.api.models.v1.instruments.InstrumentGetPredictionEventsResponse
import com.clearstreet.api.models.v1.instruments.InstrumentGetPredictionMarketsParams
import com.clearstreet.api.models.v1.instruments.InstrumentGetPredictionMarketsResponse
import com.clearstreet.api.models.v1.instruments.InstrumentGetPredictionSeriesParams
import com.clearstreet.api.models.v1.instruments.InstrumentGetPredictionSeriesResponse
import com.clearstreet.api.models.v1.instruments.InstrumentSearchInstrumentsParams
import com.clearstreet.api.models.v1.instruments.InstrumentSearchInstrumentsResponse
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
     * Returns options contracts with options-specific metadata. Exactly one identifier must be
     * provided: `root`/`underlying_instrument_id` (list all contracts for that underlier) or
     * `contract_ids` (look up specific contracts directly). `expiry`/`contract_type` apply as
     * filters in either case.
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
     * > **Alpha** — this endpoint is experimental and may change or be removed at any time.
     *
     * Lists the distinct categories, sorted alphabetically, of every prediction market contract
     * that can currently be listed: contracts that are initialized or active and have not yet
     * closed.
     *
     * The list refreshes every 15 minutes. Returns `503` until the categories first load after a
     * restart.
     */
    fun getPredictionCategories(): CompletableFuture<InstrumentGetPredictionCategoriesResponse> =
        getPredictionCategories(InstrumentGetPredictionCategoriesParams.none())

    /** @see getPredictionCategories */
    fun getPredictionCategories(
        params: InstrumentGetPredictionCategoriesParams =
            InstrumentGetPredictionCategoriesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InstrumentGetPredictionCategoriesResponse>

    /** @see getPredictionCategories */
    fun getPredictionCategories(
        params: InstrumentGetPredictionCategoriesParams =
            InstrumentGetPredictionCategoriesParams.none()
    ): CompletableFuture<InstrumentGetPredictionCategoriesResponse> =
        getPredictionCategories(params, RequestOptions.none())

    /** @see getPredictionCategories */
    fun getPredictionCategories(
        requestOptions: RequestOptions
    ): CompletableFuture<InstrumentGetPredictionCategoriesResponse> =
        getPredictionCategories(InstrumentGetPredictionCategoriesParams.none(), requestOptions)

    /**
     * > **Alpha** — this endpoint is experimental and may change or be removed at any time.
     *
     * Lists the prediction market events that have at least one market that can currently be
     * listed: initialized or active and not yet closed. A market that is paused does not count, so
     * an event whose markets are all paused is not listed.
     *
     * Events are ordered by code unless `sort_by` names another key or `search` is set; ties break
     * on code ascending. `series_codes` and `categories` keep events of those series or with a
     * listable market in those categories, ignoring case.
     *
     * `search` keeps events whose code, series code, or a market's question or title contains every
     * word of the text. Words match by prefix and English stem, ignoring case and punctuation; text
     * with no searchable word, such as `the`, matches nothing. A word of four or more letters that
     * matches nothing is replaced by up to three close spellings. Without `sort_by`, the best match
     * comes first, closest spellings first. Search covers listable events unless
     * `include_settled=true`.
     *
     * With `include_settled=true`, settled and expired events are listed too: every market counts
     * as listable for `categories`, `title`, `open_at.*`, `close_at.*`, `search`, and `sort_by`.
     * Such a request that takes longer than 30 seconds fails with `504`; narrow `search` or the
     * filters and try again.
     *
     * `open_at.*` and `close_at.*` bound an event's open and close time, which are the earliest
     * across its listable markets, and `sort_by` uses the same times.
     *
     * An event's `title` is the question of its first listable market by symbol, and its
     * `categories` are those of its listable markets.
     *
     * With `include_markets=true`, each event carries `markets`: a summary of every market of the
     * event, ordered by symbol, in any status. This includes paused markets of a listed event and
     * settled markets. Pages carry no totals: follow `next_page_token` until it is absent.
     *
     * `market_ids` (1-100 market ids or tickers, in any status) keeps the events those markets
     * belong to, each once, and the other filters still apply. Ids that match no market are
     * reported: `207` with the events found and the missing ids in `error.details`, or `404` when
     * none matched.
     */
    fun getPredictionEvents(): CompletableFuture<InstrumentGetPredictionEventsResponse> =
        getPredictionEvents(InstrumentGetPredictionEventsParams.none())

    /** @see getPredictionEvents */
    fun getPredictionEvents(
        params: InstrumentGetPredictionEventsParams = InstrumentGetPredictionEventsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InstrumentGetPredictionEventsResponse>

    /** @see getPredictionEvents */
    fun getPredictionEvents(
        params: InstrumentGetPredictionEventsParams = InstrumentGetPredictionEventsParams.none()
    ): CompletableFuture<InstrumentGetPredictionEventsResponse> =
        getPredictionEvents(params, RequestOptions.none())

    /** @see getPredictionEvents */
    fun getPredictionEvents(
        requestOptions: RequestOptions
    ): CompletableFuture<InstrumentGetPredictionEventsResponse> =
        getPredictionEvents(InstrumentGetPredictionEventsParams.none(), requestOptions)

    /**
     * > **Alpha** — this endpoint is experimental and may change or be removed at any time.
     *
     * Looks up prediction markets in any status, by `market_ids` (1-100 market ids or tickers) or
     * by `event_code`. Exactly one of the two is required. Markets are ordered by symbol.
     *
     * `statuses` keeps markets in any listed status. It defaults to `OPEN` with `event_code` and to
     * every status with `market_ids`.
     *
     * With `event_code`, pages carry no totals: follow `next_page_token` until it is absent.
     * `market_ids` lookups are not paginated and ignore page parameters.
     *
     * With `market_ids`, ids that match no market are reported: `207` with the markets found and
     * the missing ids in `error.details`, or `404` when none matched. A market removed only by
     * `statuses` is not reported as missing.
     *
     * Each market trades one YES-denominated instrument; there is no NO instrument. Prices,
     * including those from `/market-data/snapshot`, are YES prices in dollars, and `no_price = 1 -
     * yes_price`. A negative position quantity is NO exposure.
     */
    fun getPredictionMarkets(): CompletableFuture<InstrumentGetPredictionMarketsResponse> =
        getPredictionMarkets(InstrumentGetPredictionMarketsParams.none())

    /** @see getPredictionMarkets */
    fun getPredictionMarkets(
        params: InstrumentGetPredictionMarketsParams = InstrumentGetPredictionMarketsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InstrumentGetPredictionMarketsResponse>

    /** @see getPredictionMarkets */
    fun getPredictionMarkets(
        params: InstrumentGetPredictionMarketsParams = InstrumentGetPredictionMarketsParams.none()
    ): CompletableFuture<InstrumentGetPredictionMarketsResponse> =
        getPredictionMarkets(params, RequestOptions.none())

    /** @see getPredictionMarkets */
    fun getPredictionMarkets(
        requestOptions: RequestOptions
    ): CompletableFuture<InstrumentGetPredictionMarketsResponse> =
        getPredictionMarkets(InstrumentGetPredictionMarketsParams.none(), requestOptions)

    /**
     * > **Alpha** — this endpoint is experimental and may change or be removed at any time.
     *
     * Lists the distinct series codes of prediction markets that can currently be listed: markets
     * that are initialized or active and have not yet closed. Series are ordered by code.
     *
     * `categories` keeps series with a market in any listed category, ignoring case. Pages carry no
     * totals: follow `next_page_token` until it is absent.
     */
    fun getPredictionSeries(): CompletableFuture<InstrumentGetPredictionSeriesResponse> =
        getPredictionSeries(InstrumentGetPredictionSeriesParams.none())

    /** @see getPredictionSeries */
    fun getPredictionSeries(
        params: InstrumentGetPredictionSeriesParams = InstrumentGetPredictionSeriesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InstrumentGetPredictionSeriesResponse>

    /** @see getPredictionSeries */
    fun getPredictionSeries(
        params: InstrumentGetPredictionSeriesParams = InstrumentGetPredictionSeriesParams.none()
    ): CompletableFuture<InstrumentGetPredictionSeriesResponse> =
        getPredictionSeries(params, RequestOptions.none())

    /** @see getPredictionSeries */
    fun getPredictionSeries(
        requestOptions: RequestOptions
    ): CompletableFuture<InstrumentGetPredictionSeriesResponse> =
        getPredictionSeries(InstrumentGetPredictionSeriesParams.none(), requestOptions)

    /**
     * Search instruments by symbol, alternate identifier, or company name.
     *
     * The `q` parameter is case-insensitive and supports ticker symbols, alternate identifiers such
     * as CUSIP, ISIN, and OPRA root, and company names for non-option instruments. Results are
     * ranked by match quality plus instrument quality signals and relevance. Defaults to the
     * `EQUITY` asset class (common stocks, preferred shares, ADRs, ETFs, and exchange-traded mutual
     * funds). Pass `asset_class=OPTION` to search option contracts: by full OSI symbol, by an OSI
     * prefix (root + `YYMMDD` expiry, e.g. `AAPL 261217`), or by a root-scoped phrase such as `AAPL
     * Dec 250 call`.
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
         * Returns a raw HTTP response for `get /v1/instruments/predictions/categories`, but is
         * otherwise the same as [InstrumentServiceAsync.getPredictionCategories].
         */
        fun getPredictionCategories():
            CompletableFuture<HttpResponseFor<InstrumentGetPredictionCategoriesResponse>> =
            getPredictionCategories(InstrumentGetPredictionCategoriesParams.none())

        /** @see getPredictionCategories */
        fun getPredictionCategories(
            params: InstrumentGetPredictionCategoriesParams =
                InstrumentGetPredictionCategoriesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InstrumentGetPredictionCategoriesResponse>>

        /** @see getPredictionCategories */
        fun getPredictionCategories(
            params: InstrumentGetPredictionCategoriesParams =
                InstrumentGetPredictionCategoriesParams.none()
        ): CompletableFuture<HttpResponseFor<InstrumentGetPredictionCategoriesResponse>> =
            getPredictionCategories(params, RequestOptions.none())

        /** @see getPredictionCategories */
        fun getPredictionCategories(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<InstrumentGetPredictionCategoriesResponse>> =
            getPredictionCategories(InstrumentGetPredictionCategoriesParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/instruments/predictions/events`, but is
         * otherwise the same as [InstrumentServiceAsync.getPredictionEvents].
         */
        fun getPredictionEvents():
            CompletableFuture<HttpResponseFor<InstrumentGetPredictionEventsResponse>> =
            getPredictionEvents(InstrumentGetPredictionEventsParams.none())

        /** @see getPredictionEvents */
        fun getPredictionEvents(
            params: InstrumentGetPredictionEventsParams =
                InstrumentGetPredictionEventsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InstrumentGetPredictionEventsResponse>>

        /** @see getPredictionEvents */
        fun getPredictionEvents(
            params: InstrumentGetPredictionEventsParams = InstrumentGetPredictionEventsParams.none()
        ): CompletableFuture<HttpResponseFor<InstrumentGetPredictionEventsResponse>> =
            getPredictionEvents(params, RequestOptions.none())

        /** @see getPredictionEvents */
        fun getPredictionEvents(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<InstrumentGetPredictionEventsResponse>> =
            getPredictionEvents(InstrumentGetPredictionEventsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/instruments/predictions/markets`, but is
         * otherwise the same as [InstrumentServiceAsync.getPredictionMarkets].
         */
        fun getPredictionMarkets():
            CompletableFuture<HttpResponseFor<InstrumentGetPredictionMarketsResponse>> =
            getPredictionMarkets(InstrumentGetPredictionMarketsParams.none())

        /** @see getPredictionMarkets */
        fun getPredictionMarkets(
            params: InstrumentGetPredictionMarketsParams =
                InstrumentGetPredictionMarketsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InstrumentGetPredictionMarketsResponse>>

        /** @see getPredictionMarkets */
        fun getPredictionMarkets(
            params: InstrumentGetPredictionMarketsParams =
                InstrumentGetPredictionMarketsParams.none()
        ): CompletableFuture<HttpResponseFor<InstrumentGetPredictionMarketsResponse>> =
            getPredictionMarkets(params, RequestOptions.none())

        /** @see getPredictionMarkets */
        fun getPredictionMarkets(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<InstrumentGetPredictionMarketsResponse>> =
            getPredictionMarkets(InstrumentGetPredictionMarketsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/instruments/predictions/series`, but is
         * otherwise the same as [InstrumentServiceAsync.getPredictionSeries].
         */
        fun getPredictionSeries():
            CompletableFuture<HttpResponseFor<InstrumentGetPredictionSeriesResponse>> =
            getPredictionSeries(InstrumentGetPredictionSeriesParams.none())

        /** @see getPredictionSeries */
        fun getPredictionSeries(
            params: InstrumentGetPredictionSeriesParams =
                InstrumentGetPredictionSeriesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InstrumentGetPredictionSeriesResponse>>

        /** @see getPredictionSeries */
        fun getPredictionSeries(
            params: InstrumentGetPredictionSeriesParams = InstrumentGetPredictionSeriesParams.none()
        ): CompletableFuture<HttpResponseFor<InstrumentGetPredictionSeriesResponse>> =
            getPredictionSeries(params, RequestOptions.none())

        /** @see getPredictionSeries */
        fun getPredictionSeries(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<InstrumentGetPredictionSeriesResponse>> =
            getPredictionSeries(InstrumentGetPredictionSeriesParams.none(), requestOptions)

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
