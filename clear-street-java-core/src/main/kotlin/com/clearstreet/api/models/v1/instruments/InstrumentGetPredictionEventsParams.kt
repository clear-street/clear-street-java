// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.instruments

import com.clearstreet.api.core.Enum
import com.clearstreet.api.core.JsonField
import com.clearstreet.api.core.Params
import com.clearstreet.api.core.http.Headers
import com.clearstreet.api.core.http.QueryParams
import com.clearstreet.api.errors.ClearStreetInvalidDataException
import com.fasterxml.jackson.annotation.JsonCreator
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * > **Alpha** — this endpoint is experimental and may change or be removed at any time.
 *
 * Lists the prediction market events that have at least one market that can currently be listed:
 * initialized or active and not yet closed. A market that is paused does not count, so an event
 * whose markets are all paused is not listed.
 *
 * Events are ordered by code unless `sort_by` names another key or `search` is set; ties break on
 * code ascending. `series_codes` and `categories` keep events of those series or with a listable
 * market in those categories, ignoring case.
 *
 * `search` keeps events whose code, series code, or a market's question or title contains every
 * word of the text. Words match by prefix and English stem, ignoring case and punctuation; text
 * with no searchable word, such as `the`, matches nothing. A word of four or more letters that
 * matches nothing is replaced by up to three close spellings. Without `sort_by`, the best match
 * comes first, closest spellings first. Search covers listable events unless
 * `include_settled=true`.
 *
 * With `include_settled=true`, settled and expired events are listed too: every market counts as
 * listable for `categories`, `title`, `open_at.*`, `close_at.*`, `search`, and `sort_by`. Such a
 * request that takes longer than 30 seconds fails with `504`; narrow `search` or the filters and
 * try again.
 *
 * `open_at.*` and `close_at.*` bound an event's open and close time, which are the earliest across
 * its listable markets, and `sort_by` uses the same times.
 *
 * An event's `title` is the question of its first listable market by symbol, and its `categories`
 * are those of its listable markets.
 *
 * With `include_markets=true`, each event carries `markets`: a summary of every market of the
 * event, ordered by symbol, in any status. This includes paused markets of a listed event and
 * settled markets. Pages carry no totals: follow `next_page_token` until it is absent.
 *
 * `market_ids` (1-100 market ids or tickers, in any status) keeps the events those markets belong
 * to, each once, and the other filters still apply. Ids that match no market are reported: `207`
 * with the events found and the missing ids in `error.details`, or `404` when none matched.
 */
class InstrumentGetPredictionEventsParams
private constructor(
    private val categories: String?,
    private val closeAt: CloseAt?,
    private val includeMarkets: Boolean?,
    private val includeSettled: Boolean?,
    private val marketIds: String?,
    private val openAt: OpenAt?,
    private val pageSize: Long?,
    private val pageToken: String?,
    private val search: String?,
    private val seriesCodes: String?,
    private val sortBy: SortBy?,
    private val sortDirection: SortDirection?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Comma-separated categories. Keeps events with a listable market in any of them, ignoring
     * case.
     */
    fun categories(): Optional<String> = Optional.ofNullable(categories)

    fun closeAt(): Optional<CloseAt> = Optional.ofNullable(closeAt)

    /** Embed a summary of every market of each event, in any status. Default false. */
    fun includeMarkets(): Optional<Boolean> = Optional.ofNullable(includeMarkets)

    /**
     * Also list settled and expired events, not only events with a listable market. Every market
     * then counts as listable for the other filters, `title`, `categories`, and the open and close
     * times. Default false. A request that takes longer than 30 seconds fails with `504`; narrow
     * `search` or the filters and try again.
     */
    fun includeSettled(): Optional<Boolean> = Optional.ofNullable(includeSettled)

    /**
     * Comma-separated market ids (UUID) or tickers, 1-100. Keeps events of those markets, in any
     * status; the other filters still apply. Ids that match no market are reported: `207`, or `404`
     * when none match.
     */
    fun marketIds(): Optional<String> = Optional.ofNullable(marketIds)

    fun openAt(): Optional<OpenAt> = Optional.ofNullable(openAt)

    /** The number of items to return per page. Only used when page_token is not provided. */
    fun pageSize(): Optional<Long> = Optional.ofNullable(pageSize)

    /**
     * Token for retrieving the next or previous page of results. Contains encoded pagination state;
     * when provided, page_size is ignored.
     */
    fun pageToken(): Optional<String> = Optional.ofNullable(pageToken)

    /**
     * Keeps events whose code, series code, or a market's question or title contains every word,
     * matched by prefix and English stem, ignoring case. Searches listable events, or every event
     * with `include_settled`. A word of four or more letters that matches nothing is replaced by up
     * to three close spellings. Without `sort_by`, orders by relevance, closest spellings first.
     */
    fun search(): Optional<String> = Optional.ofNullable(search)

    /** Comma-separated series codes. Keeps events of those series, ignoring case. */
    fun seriesCodes(): Optional<String> = Optional.ofNullable(seriesCodes)

    /**
     * Sort key. Defaults to relevance when `search` is set, else the event code. Ties break on
     * event code ascending.
     */
    fun sortBy(): Optional<SortBy> = Optional.ofNullable(sortBy)

    /** Sort direction. Defaults to ascending. Ignored when sorting by relevance. */
    fun sortDirection(): Optional<SortDirection> = Optional.ofNullable(sortDirection)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): InstrumentGetPredictionEventsParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [InstrumentGetPredictionEventsParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [InstrumentGetPredictionEventsParams]. */
    class Builder internal constructor() {

        private var categories: String? = null
        private var closeAt: CloseAt? = null
        private var includeMarkets: Boolean? = null
        private var includeSettled: Boolean? = null
        private var marketIds: String? = null
        private var openAt: OpenAt? = null
        private var pageSize: Long? = null
        private var pageToken: String? = null
        private var search: String? = null
        private var seriesCodes: String? = null
        private var sortBy: SortBy? = null
        private var sortDirection: SortDirection? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            instrumentGetPredictionEventsParams: InstrumentGetPredictionEventsParams
        ) = apply {
            categories = instrumentGetPredictionEventsParams.categories
            closeAt = instrumentGetPredictionEventsParams.closeAt
            includeMarkets = instrumentGetPredictionEventsParams.includeMarkets
            includeSettled = instrumentGetPredictionEventsParams.includeSettled
            marketIds = instrumentGetPredictionEventsParams.marketIds
            openAt = instrumentGetPredictionEventsParams.openAt
            pageSize = instrumentGetPredictionEventsParams.pageSize
            pageToken = instrumentGetPredictionEventsParams.pageToken
            search = instrumentGetPredictionEventsParams.search
            seriesCodes = instrumentGetPredictionEventsParams.seriesCodes
            sortBy = instrumentGetPredictionEventsParams.sortBy
            sortDirection = instrumentGetPredictionEventsParams.sortDirection
            additionalHeaders = instrumentGetPredictionEventsParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                instrumentGetPredictionEventsParams.additionalQueryParams.toBuilder()
        }

        /**
         * Comma-separated categories. Keeps events with a listable market in any of them, ignoring
         * case.
         */
        fun categories(categories: String?) = apply { this.categories = categories }

        /** Alias for calling [Builder.categories] with `categories.orElse(null)`. */
        fun categories(categories: Optional<String>) = categories(categories.getOrNull())

        fun closeAt(closeAt: CloseAt?) = apply { this.closeAt = closeAt }

        /** Alias for calling [Builder.closeAt] with `closeAt.orElse(null)`. */
        fun closeAt(closeAt: Optional<CloseAt>) = closeAt(closeAt.getOrNull())

        /** Embed a summary of every market of each event, in any status. Default false. */
        fun includeMarkets(includeMarkets: Boolean?) = apply {
            this.includeMarkets = includeMarkets
        }

        /**
         * Alias for [Builder.includeMarkets].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun includeMarkets(includeMarkets: Boolean) = includeMarkets(includeMarkets as Boolean?)

        /** Alias for calling [Builder.includeMarkets] with `includeMarkets.orElse(null)`. */
        fun includeMarkets(includeMarkets: Optional<Boolean>) =
            includeMarkets(includeMarkets.getOrNull())

        /**
         * Also list settled and expired events, not only events with a listable market. Every
         * market then counts as listable for the other filters, `title`, `categories`, and the open
         * and close times. Default false. A request that takes longer than 30 seconds fails with
         * `504`; narrow `search` or the filters and try again.
         */
        fun includeSettled(includeSettled: Boolean?) = apply {
            this.includeSettled = includeSettled
        }

        /**
         * Alias for [Builder.includeSettled].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun includeSettled(includeSettled: Boolean) = includeSettled(includeSettled as Boolean?)

        /** Alias for calling [Builder.includeSettled] with `includeSettled.orElse(null)`. */
        fun includeSettled(includeSettled: Optional<Boolean>) =
            includeSettled(includeSettled.getOrNull())

        /**
         * Comma-separated market ids (UUID) or tickers, 1-100. Keeps events of those markets, in
         * any status; the other filters still apply. Ids that match no market are reported: `207`,
         * or `404` when none match.
         */
        fun marketIds(marketIds: String?) = apply { this.marketIds = marketIds }

        /** Alias for calling [Builder.marketIds] with `marketIds.orElse(null)`. */
        fun marketIds(marketIds: Optional<String>) = marketIds(marketIds.getOrNull())

        fun openAt(openAt: OpenAt?) = apply { this.openAt = openAt }

        /** Alias for calling [Builder.openAt] with `openAt.orElse(null)`. */
        fun openAt(openAt: Optional<OpenAt>) = openAt(openAt.getOrNull())

        /** The number of items to return per page. Only used when page_token is not provided. */
        fun pageSize(pageSize: Long?) = apply { this.pageSize = pageSize }

        /**
         * Alias for [Builder.pageSize].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun pageSize(pageSize: Long) = pageSize(pageSize as Long?)

        /** Alias for calling [Builder.pageSize] with `pageSize.orElse(null)`. */
        fun pageSize(pageSize: Optional<Long>) = pageSize(pageSize.getOrNull())

        /**
         * Token for retrieving the next or previous page of results. Contains encoded pagination
         * state; when provided, page_size is ignored.
         */
        fun pageToken(pageToken: String?) = apply { this.pageToken = pageToken }

        /** Alias for calling [Builder.pageToken] with `pageToken.orElse(null)`. */
        fun pageToken(pageToken: Optional<String>) = pageToken(pageToken.getOrNull())

        /**
         * Keeps events whose code, series code, or a market's question or title contains every
         * word, matched by prefix and English stem, ignoring case. Searches listable events, or
         * every event with `include_settled`. A word of four or more letters that matches nothing
         * is replaced by up to three close spellings. Without `sort_by`, orders by relevance,
         * closest spellings first.
         */
        fun search(search: String?) = apply { this.search = search }

        /** Alias for calling [Builder.search] with `search.orElse(null)`. */
        fun search(search: Optional<String>) = search(search.getOrNull())

        /** Comma-separated series codes. Keeps events of those series, ignoring case. */
        fun seriesCodes(seriesCodes: String?) = apply { this.seriesCodes = seriesCodes }

        /** Alias for calling [Builder.seriesCodes] with `seriesCodes.orElse(null)`. */
        fun seriesCodes(seriesCodes: Optional<String>) = seriesCodes(seriesCodes.getOrNull())

        /**
         * Sort key. Defaults to relevance when `search` is set, else the event code. Ties break on
         * event code ascending.
         */
        fun sortBy(sortBy: SortBy?) = apply { this.sortBy = sortBy }

        /** Alias for calling [Builder.sortBy] with `sortBy.orElse(null)`. */
        fun sortBy(sortBy: Optional<SortBy>) = sortBy(sortBy.getOrNull())

        /** Sort direction. Defaults to ascending. Ignored when sorting by relevance. */
        fun sortDirection(sortDirection: SortDirection?) = apply {
            this.sortDirection = sortDirection
        }

        /** Alias for calling [Builder.sortDirection] with `sortDirection.orElse(null)`. */
        fun sortDirection(sortDirection: Optional<SortDirection>) =
            sortDirection(sortDirection.getOrNull())

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [InstrumentGetPredictionEventsParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): InstrumentGetPredictionEventsParams =
            InstrumentGetPredictionEventsParams(
                categories,
                closeAt,
                includeMarkets,
                includeSettled,
                marketIds,
                openAt,
                pageSize,
                pageToken,
                search,
                seriesCodes,
                sortBy,
                sortDirection,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                categories?.let { put("categories", it) }
                closeAt?.let {
                    it.gt().ifPresent { put("close_at[gt]", it) }
                    it.gte().ifPresent { put("close_at[gte]", it) }
                    it.lt().ifPresent { put("close_at[lt]", it) }
                    it.lte().ifPresent { put("close_at[lte]", it) }
                    it._additionalProperties().keys().forEach { key ->
                        it._additionalProperties().values(key).forEach { value ->
                            put("close_at[$key]", value)
                        }
                    }
                }
                includeMarkets?.let { put("include_markets", it.toString()) }
                includeSettled?.let { put("include_settled", it.toString()) }
                marketIds?.let { put("market_ids", it) }
                openAt?.let {
                    it.gt().ifPresent { put("open_at[gt]", it) }
                    it.gte().ifPresent { put("open_at[gte]", it) }
                    it.lt().ifPresent { put("open_at[lt]", it) }
                    it.lte().ifPresent { put("open_at[lte]", it) }
                    it._additionalProperties().keys().forEach { key ->
                        it._additionalProperties().values(key).forEach { value ->
                            put("open_at[$key]", value)
                        }
                    }
                }
                pageSize?.let { put("page_size", it.toString()) }
                pageToken?.let { put("page_token", it) }
                search?.let { put("search", it) }
                seriesCodes?.let { put("series_codes", it) }
                sortBy?.let { put("sort_by", it.toString()) }
                sortDirection?.let { put("sort_direction", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    class CloseAt
    private constructor(
        private val gt: String?,
        private val gte: String?,
        private val lt: String?,
        private val lte: String?,
        private val additionalProperties: QueryParams,
    ) {

        /**
         * Return only rows where `close_at` is strictly after the given value. A bare `YYYY-MM-DD`
         * date expands to the end of that day (UTC), so this matches from the start of the
         * following day. See
         * [Range filters](https://docs.clearstreet.com/guides/api-fundamentals#range-filters) for
         * accepted formats, bare-date expansion, and combining bounds. Returns 400 if the resulting
         * range is inverted.
         */
        fun gt(): Optional<String> = Optional.ofNullable(gt)

        /**
         * Return only rows where `close_at` is on or after the given value. A bare `YYYY-MM-DD`
         * date expands to the start of that day (UTC). See
         * [Range filters](https://docs.clearstreet.com/guides/api-fundamentals#range-filters) for
         * accepted formats, bare-date expansion, and combining bounds. Returns 400 if the resulting
         * range is inverted.
         */
        fun gte(): Optional<String> = Optional.ofNullable(gte)

        /**
         * Return only rows where `close_at` is strictly before the given value. A bare `YYYY-MM-DD`
         * date expands to the start of that day (UTC). See
         * [Range filters](https://docs.clearstreet.com/guides/api-fundamentals#range-filters) for
         * accepted formats, bare-date expansion, and combining bounds. Returns 400 if the resulting
         * range is inverted.
         */
        fun lt(): Optional<String> = Optional.ofNullable(lt)

        /**
         * Return only rows where `close_at` is on or before the given value. A bare `YYYY-MM-DD`
         * date expands to the end of that day (UTC), so this matches through the end of that day.
         * See [Range filters](https://docs.clearstreet.com/guides/api-fundamentals#range-filters)
         * for accepted formats, bare-date expansion, and combining bounds. Returns 400 if the
         * resulting range is inverted.
         */
        fun lte(): Optional<String> = Optional.ofNullable(lte)

        /** Query params to send with the request. */
        fun _additionalProperties(): QueryParams = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [CloseAt]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [CloseAt]. */
        class Builder internal constructor() {

            private var gt: String? = null
            private var gte: String? = null
            private var lt: String? = null
            private var lte: String? = null
            private var additionalProperties: QueryParams.Builder = QueryParams.builder()

            @JvmSynthetic
            internal fun from(closeAt: CloseAt) = apply {
                gt = closeAt.gt
                gte = closeAt.gte
                lt = closeAt.lt
                lte = closeAt.lte
                additionalProperties = closeAt.additionalProperties.toBuilder()
            }

            /**
             * Return only rows where `close_at` is strictly after the given value. A bare
             * `YYYY-MM-DD` date expands to the end of that day (UTC), so this matches from the
             * start of the following day. See
             * [Range filters](https://docs.clearstreet.com/guides/api-fundamentals#range-filters)
             * for accepted formats, bare-date expansion, and combining bounds. Returns 400 if the
             * resulting range is inverted.
             */
            fun gt(gt: String?) = apply { this.gt = gt }

            /** Alias for calling [Builder.gt] with `gt.orElse(null)`. */
            fun gt(gt: Optional<String>) = gt(gt.getOrNull())

            /**
             * Return only rows where `close_at` is on or after the given value. A bare `YYYY-MM-DD`
             * date expands to the start of that day (UTC). See
             * [Range filters](https://docs.clearstreet.com/guides/api-fundamentals#range-filters)
             * for accepted formats, bare-date expansion, and combining bounds. Returns 400 if the
             * resulting range is inverted.
             */
            fun gte(gte: String?) = apply { this.gte = gte }

            /** Alias for calling [Builder.gte] with `gte.orElse(null)`. */
            fun gte(gte: Optional<String>) = gte(gte.getOrNull())

            /**
             * Return only rows where `close_at` is strictly before the given value. A bare
             * `YYYY-MM-DD` date expands to the start of that day (UTC). See
             * [Range filters](https://docs.clearstreet.com/guides/api-fundamentals#range-filters)
             * for accepted formats, bare-date expansion, and combining bounds. Returns 400 if the
             * resulting range is inverted.
             */
            fun lt(lt: String?) = apply { this.lt = lt }

            /** Alias for calling [Builder.lt] with `lt.orElse(null)`. */
            fun lt(lt: Optional<String>) = lt(lt.getOrNull())

            /**
             * Return only rows where `close_at` is on or before the given value. A bare
             * `YYYY-MM-DD` date expands to the end of that day (UTC), so this matches through the
             * end of that day. See
             * [Range filters](https://docs.clearstreet.com/guides/api-fundamentals#range-filters)
             * for accepted formats, bare-date expansion, and combining bounds. Returns 400 if the
             * resulting range is inverted.
             */
            fun lte(lte: String?) = apply { this.lte = lte }

            /** Alias for calling [Builder.lte] with `lte.orElse(null)`. */
            fun lte(lte: Optional<String>) = lte(lte.getOrNull())

            fun additionalProperties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun additionalProperties(additionalProperties: Map<String, Iterable<String>>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: String) = apply {
                additionalProperties.put(key, value)
            }

            fun putAdditionalProperties(key: String, values: Iterable<String>) = apply {
                additionalProperties.put(key, values)
            }

            fun putAllAdditionalProperties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, Iterable<String>>) =
                apply {
                    this.additionalProperties.putAll(additionalProperties)
                }

            fun replaceAdditionalProperties(key: String, value: String) = apply {
                additionalProperties.replace(key, value)
            }

            fun replaceAdditionalProperties(key: String, values: Iterable<String>) = apply {
                additionalProperties.replace(key, values)
            }

            fun replaceAllAdditionalProperties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.replaceAll(additionalProperties)
            }

            fun replaceAllAdditionalProperties(
                additionalProperties: Map<String, Iterable<String>>
            ) = apply { this.additionalProperties.replaceAll(additionalProperties) }

            fun removeAdditionalProperties(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                additionalProperties.removeAll(keys)
            }

            /**
             * Returns an immutable instance of [CloseAt].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): CloseAt = CloseAt(gt, gte, lt, lte, additionalProperties.build())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CloseAt &&
                gt == other.gt &&
                gte == other.gte &&
                lt == other.lt &&
                lte == other.lte &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(gt, gte, lt, lte, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CloseAt{gt=$gt, gte=$gte, lt=$lt, lte=$lte, additionalProperties=$additionalProperties}"
    }

    class OpenAt
    private constructor(
        private val gt: String?,
        private val gte: String?,
        private val lt: String?,
        private val lte: String?,
        private val additionalProperties: QueryParams,
    ) {

        /**
         * Return only rows where `open_at` is strictly after the given value. A bare `YYYY-MM-DD`
         * date expands to the end of that day (UTC), so this matches from the start of the
         * following day. See
         * [Range filters](https://docs.clearstreet.com/guides/api-fundamentals#range-filters) for
         * accepted formats, bare-date expansion, and combining bounds. Returns 400 if the resulting
         * range is inverted.
         */
        fun gt(): Optional<String> = Optional.ofNullable(gt)

        /**
         * Return only rows where `open_at` is on or after the given value. A bare `YYYY-MM-DD` date
         * expands to the start of that day (UTC). See
         * [Range filters](https://docs.clearstreet.com/guides/api-fundamentals#range-filters) for
         * accepted formats, bare-date expansion, and combining bounds. Returns 400 if the resulting
         * range is inverted.
         */
        fun gte(): Optional<String> = Optional.ofNullable(gte)

        /**
         * Return only rows where `open_at` is strictly before the given value. A bare `YYYY-MM-DD`
         * date expands to the start of that day (UTC). See
         * [Range filters](https://docs.clearstreet.com/guides/api-fundamentals#range-filters) for
         * accepted formats, bare-date expansion, and combining bounds. Returns 400 if the resulting
         * range is inverted.
         */
        fun lt(): Optional<String> = Optional.ofNullable(lt)

        /**
         * Return only rows where `open_at` is on or before the given value. A bare `YYYY-MM-DD`
         * date expands to the end of that day (UTC), so this matches through the end of that day.
         * See [Range filters](https://docs.clearstreet.com/guides/api-fundamentals#range-filters)
         * for accepted formats, bare-date expansion, and combining bounds. Returns 400 if the
         * resulting range is inverted.
         */
        fun lte(): Optional<String> = Optional.ofNullable(lte)

        /** Query params to send with the request. */
        fun _additionalProperties(): QueryParams = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [OpenAt]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [OpenAt]. */
        class Builder internal constructor() {

            private var gt: String? = null
            private var gte: String? = null
            private var lt: String? = null
            private var lte: String? = null
            private var additionalProperties: QueryParams.Builder = QueryParams.builder()

            @JvmSynthetic
            internal fun from(openAt: OpenAt) = apply {
                gt = openAt.gt
                gte = openAt.gte
                lt = openAt.lt
                lte = openAt.lte
                additionalProperties = openAt.additionalProperties.toBuilder()
            }

            /**
             * Return only rows where `open_at` is strictly after the given value. A bare
             * `YYYY-MM-DD` date expands to the end of that day (UTC), so this matches from the
             * start of the following day. See
             * [Range filters](https://docs.clearstreet.com/guides/api-fundamentals#range-filters)
             * for accepted formats, bare-date expansion, and combining bounds. Returns 400 if the
             * resulting range is inverted.
             */
            fun gt(gt: String?) = apply { this.gt = gt }

            /** Alias for calling [Builder.gt] with `gt.orElse(null)`. */
            fun gt(gt: Optional<String>) = gt(gt.getOrNull())

            /**
             * Return only rows where `open_at` is on or after the given value. A bare `YYYY-MM-DD`
             * date expands to the start of that day (UTC). See
             * [Range filters](https://docs.clearstreet.com/guides/api-fundamentals#range-filters)
             * for accepted formats, bare-date expansion, and combining bounds. Returns 400 if the
             * resulting range is inverted.
             */
            fun gte(gte: String?) = apply { this.gte = gte }

            /** Alias for calling [Builder.gte] with `gte.orElse(null)`. */
            fun gte(gte: Optional<String>) = gte(gte.getOrNull())

            /**
             * Return only rows where `open_at` is strictly before the given value. A bare
             * `YYYY-MM-DD` date expands to the start of that day (UTC). See
             * [Range filters](https://docs.clearstreet.com/guides/api-fundamentals#range-filters)
             * for accepted formats, bare-date expansion, and combining bounds. Returns 400 if the
             * resulting range is inverted.
             */
            fun lt(lt: String?) = apply { this.lt = lt }

            /** Alias for calling [Builder.lt] with `lt.orElse(null)`. */
            fun lt(lt: Optional<String>) = lt(lt.getOrNull())

            /**
             * Return only rows where `open_at` is on or before the given value. A bare `YYYY-MM-DD`
             * date expands to the end of that day (UTC), so this matches through the end of that
             * day. See
             * [Range filters](https://docs.clearstreet.com/guides/api-fundamentals#range-filters)
             * for accepted formats, bare-date expansion, and combining bounds. Returns 400 if the
             * resulting range is inverted.
             */
            fun lte(lte: String?) = apply { this.lte = lte }

            /** Alias for calling [Builder.lte] with `lte.orElse(null)`. */
            fun lte(lte: Optional<String>) = lte(lte.getOrNull())

            fun additionalProperties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun additionalProperties(additionalProperties: Map<String, Iterable<String>>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: String) = apply {
                additionalProperties.put(key, value)
            }

            fun putAdditionalProperties(key: String, values: Iterable<String>) = apply {
                additionalProperties.put(key, values)
            }

            fun putAllAdditionalProperties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, Iterable<String>>) =
                apply {
                    this.additionalProperties.putAll(additionalProperties)
                }

            fun replaceAdditionalProperties(key: String, value: String) = apply {
                additionalProperties.replace(key, value)
            }

            fun replaceAdditionalProperties(key: String, values: Iterable<String>) = apply {
                additionalProperties.replace(key, values)
            }

            fun replaceAllAdditionalProperties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.replaceAll(additionalProperties)
            }

            fun replaceAllAdditionalProperties(
                additionalProperties: Map<String, Iterable<String>>
            ) = apply { this.additionalProperties.replaceAll(additionalProperties) }

            fun removeAdditionalProperties(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                additionalProperties.removeAll(keys)
            }

            /**
             * Returns an immutable instance of [OpenAt].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): OpenAt = OpenAt(gt, gte, lt, lte, additionalProperties.build())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is OpenAt &&
                gt == other.gt &&
                gte == other.gte &&
                lt == other.lt &&
                lte == other.lte &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(gt, gte, lt, lte, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "OpenAt{gt=$gt, gte=$gte, lt=$lt, lte=$lte, additionalProperties=$additionalProperties}"
    }

    /**
     * Sort key. Defaults to relevance when `search` is set, else the event code. Ties break on
     * event code ascending.
     */
    class SortBy @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val OPEN_AT = of("OPEN_AT")

            @JvmField val CLOSE_AT = of("CLOSE_AT")

            @JvmStatic fun of(value: String) = SortBy(JsonField.of(value))
        }

        /** An enum containing [SortBy]'s known values. */
        enum class Known {
            OPEN_AT,
            CLOSE_AT,
        }

        /**
         * An enum containing [SortBy]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [SortBy] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            OPEN_AT,
            CLOSE_AT,
            /** An enum member indicating that [SortBy] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                OPEN_AT -> Value.OPEN_AT
                CLOSE_AT -> Value.CLOSE_AT
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws ClearStreetInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                OPEN_AT -> Known.OPEN_AT
                CLOSE_AT -> Known.CLOSE_AT
                else -> throw ClearStreetInvalidDataException("Unknown SortBy: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws ClearStreetInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow {
                ClearStreetInvalidDataException("Value is not a String")
            }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws ClearStreetInvalidDataException if any value type in this object doesn't match
         *   its expected type.
         */
        fun validate(): SortBy = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: ClearStreetInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is SortBy && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Sort direction. Defaults to ascending. Ignored when sorting by relevance. */
    class SortDirection @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val ASC = of("ASC")

            @JvmField val DESC = of("DESC")

            @JvmStatic fun of(value: String) = SortDirection(JsonField.of(value))
        }

        /** An enum containing [SortDirection]'s known values. */
        enum class Known {
            ASC,
            DESC,
        }

        /**
         * An enum containing [SortDirection]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [SortDirection] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ASC,
            DESC,
            /**
             * An enum member indicating that [SortDirection] was instantiated with an unknown
             * value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                ASC -> Value.ASC
                DESC -> Value.DESC
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws ClearStreetInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                ASC -> Known.ASC
                DESC -> Known.DESC
                else -> throw ClearStreetInvalidDataException("Unknown SortDirection: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws ClearStreetInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow {
                ClearStreetInvalidDataException("Value is not a String")
            }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws ClearStreetInvalidDataException if any value type in this object doesn't match
         *   its expected type.
         */
        fun validate(): SortDirection = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: ClearStreetInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is SortDirection && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InstrumentGetPredictionEventsParams &&
            categories == other.categories &&
            closeAt == other.closeAt &&
            includeMarkets == other.includeMarkets &&
            includeSettled == other.includeSettled &&
            marketIds == other.marketIds &&
            openAt == other.openAt &&
            pageSize == other.pageSize &&
            pageToken == other.pageToken &&
            search == other.search &&
            seriesCodes == other.seriesCodes &&
            sortBy == other.sortBy &&
            sortDirection == other.sortDirection &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            categories,
            closeAt,
            includeMarkets,
            includeSettled,
            marketIds,
            openAt,
            pageSize,
            pageToken,
            search,
            seriesCodes,
            sortBy,
            sortDirection,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "InstrumentGetPredictionEventsParams{categories=$categories, closeAt=$closeAt, includeMarkets=$includeMarkets, includeSettled=$includeSettled, marketIds=$marketIds, openAt=$openAt, pageSize=$pageSize, pageToken=$pageToken, search=$search, seriesCodes=$seriesCodes, sortBy=$sortBy, sortDirection=$sortDirection, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
