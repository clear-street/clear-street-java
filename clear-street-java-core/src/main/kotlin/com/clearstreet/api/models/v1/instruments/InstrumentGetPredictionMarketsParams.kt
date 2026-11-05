// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.instruments

import com.clearstreet.api.core.Params
import com.clearstreet.api.core.http.Headers
import com.clearstreet.api.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * > **Alpha** — this endpoint is experimental and may change or be removed at any time.
 *
 * Looks up prediction markets in any status, by `market_ids` (1-100 market ids or tickers) or by
 * `event_code`. Exactly one of the two is required. Markets are ordered by symbol.
 *
 * `statuses` keeps markets in any listed status. It defaults to `OPEN` with `event_code` and to
 * every status with `market_ids`.
 *
 * With `event_code`, pages carry no totals: follow `next_page_token` until it is absent.
 * `market_ids` lookups are not paginated and ignore page parameters.
 *
 * With `market_ids`, ids that match no market are reported: `207` with the markets found and the
 * missing ids in `error.details`, or `404` when none matched. A market removed only by `statuses`
 * is not reported as missing.
 *
 * Each market trades one YES-denominated instrument; there is no NO instrument. Prices, including
 * those from `/market-data/snapshot`, are YES prices in dollars, and `no_price = 1 - yes_price`. A
 * negative position quantity is NO exposure.
 */
class InstrumentGetPredictionMarketsParams
private constructor(
    private val eventCode: String?,
    private val marketIds: String?,
    private val pageSize: Long?,
    private val pageToken: String?,
    private val statuses: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Event code; returns the markets of the event. Mutually exclusive with `market_ids`. */
    fun eventCode(): Optional<String> = Optional.ofNullable(eventCode)

    /**
     * Comma-separated market ids (UUID) or tickers, 1-100, in any status. Mutually exclusive with
     * `event_code`.
     */
    fun marketIds(): Optional<String> = Optional.ofNullable(marketIds)

    /** The number of items to return per page. Only used when page_token is not provided. */
    fun pageSize(): Optional<Long> = Optional.ofNullable(pageSize)

    /**
     * Token for retrieving the next or previous page of results. Contains encoded pagination state;
     * when provided, page_size is ignored.
     */
    fun pageToken(): Optional<String> = Optional.ofNullable(pageToken)

    /**
     * Comma-separated statuses to keep: `OPEN`, `UNOPENED`, `PAUSED`, `CLOSED`, `SETTLED`. Defaults
     * to `OPEN` with `event_code` and to every status with `market_ids`. Unrecognized values are
     * ignored.
     */
    fun statuses(): Optional<String> = Optional.ofNullable(statuses)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): InstrumentGetPredictionMarketsParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [InstrumentGetPredictionMarketsParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [InstrumentGetPredictionMarketsParams]. */
    class Builder internal constructor() {

        private var eventCode: String? = null
        private var marketIds: String? = null
        private var pageSize: Long? = null
        private var pageToken: String? = null
        private var statuses: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            instrumentGetPredictionMarketsParams: InstrumentGetPredictionMarketsParams
        ) = apply {
            eventCode = instrumentGetPredictionMarketsParams.eventCode
            marketIds = instrumentGetPredictionMarketsParams.marketIds
            pageSize = instrumentGetPredictionMarketsParams.pageSize
            pageToken = instrumentGetPredictionMarketsParams.pageToken
            statuses = instrumentGetPredictionMarketsParams.statuses
            additionalHeaders = instrumentGetPredictionMarketsParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                instrumentGetPredictionMarketsParams.additionalQueryParams.toBuilder()
        }

        /** Event code; returns the markets of the event. Mutually exclusive with `market_ids`. */
        fun eventCode(eventCode: String?) = apply { this.eventCode = eventCode }

        /** Alias for calling [Builder.eventCode] with `eventCode.orElse(null)`. */
        fun eventCode(eventCode: Optional<String>) = eventCode(eventCode.getOrNull())

        /**
         * Comma-separated market ids (UUID) or tickers, 1-100, in any status. Mutually exclusive
         * with `event_code`.
         */
        fun marketIds(marketIds: String?) = apply { this.marketIds = marketIds }

        /** Alias for calling [Builder.marketIds] with `marketIds.orElse(null)`. */
        fun marketIds(marketIds: Optional<String>) = marketIds(marketIds.getOrNull())

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
         * Comma-separated statuses to keep: `OPEN`, `UNOPENED`, `PAUSED`, `CLOSED`, `SETTLED`.
         * Defaults to `OPEN` with `event_code` and to every status with `market_ids`. Unrecognized
         * values are ignored.
         */
        fun statuses(statuses: String?) = apply { this.statuses = statuses }

        /** Alias for calling [Builder.statuses] with `statuses.orElse(null)`. */
        fun statuses(statuses: Optional<String>) = statuses(statuses.getOrNull())

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
         * Returns an immutable instance of [InstrumentGetPredictionMarketsParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): InstrumentGetPredictionMarketsParams =
            InstrumentGetPredictionMarketsParams(
                eventCode,
                marketIds,
                pageSize,
                pageToken,
                statuses,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                eventCode?.let { put("event_code", it) }
                marketIds?.let { put("market_ids", it) }
                pageSize?.let { put("page_size", it.toString()) }
                pageToken?.let { put("page_token", it) }
                statuses?.let { put("statuses", it) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InstrumentGetPredictionMarketsParams &&
            eventCode == other.eventCode &&
            marketIds == other.marketIds &&
            pageSize == other.pageSize &&
            pageToken == other.pageToken &&
            statuses == other.statuses &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            eventCode,
            marketIds,
            pageSize,
            pageToken,
            statuses,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "InstrumentGetPredictionMarketsParams{eventCode=$eventCode, marketIds=$marketIds, pageSize=$pageSize, pageToken=$pageToken, statuses=$statuses, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
