// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.instrumentdata

import com.clearstreet.api.core.Params
import com.clearstreet.api.core.http.Headers
import com.clearstreet.api.core.http.QueryParams
import com.clearstreet.api.core.toImmutable
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * List instrument events across all securities, grouped by date. Results are paginated via
 * `page_size` / `page_token`; a date's events may span two pages.
 *
 * Date range defaults (anchored on the current trading day, or the next trading day if today is a
 * weekend or US market holiday):
 * - Unfiltered (no `instrument_ids`): a single trading day (`from_date` = `to_date` = anchor). If
 *   only one bound is given, the other defaults to 6 days from it; there is no maximum span once
 *   both bounds are given.
 * - Filtered (with `instrument_ids`): a 30-day lookback ending on the anchor (`from_date` = anchor
 *   − 30 days, `to_date` = anchor).
 */
class InstrumentDataGetAllInstrumentEventsParams
private constructor(
    private val eventTypes: List<AllEventsEventType>?,
    private val fromDate: String?,
    private val instrumentIds: List<String>?,
    private val pageSize: Long?,
    private val pageToken: String?,
    private val toDate: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Filter by event type(s). Comma-delimited list. Example: `event_types=EARNINGS,IPO`. */
    fun eventTypes(): Optional<List<AllEventsEventType>> = Optional.ofNullable(eventTypes)

    /** The start date for the query range, inclusive (YYYY-MM-DD). */
    fun fromDate(): Optional<String> = Optional.ofNullable(fromDate)

    /**
     * Filter by instrument. Comma-separated instrument IDs (UUID) or symbols (equity tickers or OSI
     * option symbols). Example: `instrument_ids=550e8400-e29b-41d4-a716-446655440000,AAPL`.
     */
    fun instrumentIds(): Optional<List<String>> = Optional.ofNullable(instrumentIds)

    /** The number of items to return per page. Only used when page_token is not provided. */
    fun pageSize(): Optional<Long> = Optional.ofNullable(pageSize)

    /**
     * Token for retrieving the next or previous page of results. Contains encoded pagination state;
     * when provided, page_size is ignored.
     */
    fun pageToken(): Optional<String> = Optional.ofNullable(pageToken)

    /** The end date for the query range, inclusive (YYYY-MM-DD). */
    fun toDate(): Optional<String> = Optional.ofNullable(toDate)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): InstrumentDataGetAllInstrumentEventsParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [InstrumentDataGetAllInstrumentEventsParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [InstrumentDataGetAllInstrumentEventsParams]. */
    class Builder internal constructor() {

        private var eventTypes: MutableList<AllEventsEventType>? = null
        private var fromDate: String? = null
        private var instrumentIds: MutableList<String>? = null
        private var pageSize: Long? = null
        private var pageToken: String? = null
        private var toDate: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            instrumentDataGetAllInstrumentEventsParams: InstrumentDataGetAllInstrumentEventsParams
        ) = apply {
            eventTypes = instrumentDataGetAllInstrumentEventsParams.eventTypes?.toMutableList()
            fromDate = instrumentDataGetAllInstrumentEventsParams.fromDate
            instrumentIds =
                instrumentDataGetAllInstrumentEventsParams.instrumentIds?.toMutableList()
            pageSize = instrumentDataGetAllInstrumentEventsParams.pageSize
            pageToken = instrumentDataGetAllInstrumentEventsParams.pageToken
            toDate = instrumentDataGetAllInstrumentEventsParams.toDate
            additionalHeaders =
                instrumentDataGetAllInstrumentEventsParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                instrumentDataGetAllInstrumentEventsParams.additionalQueryParams.toBuilder()
        }

        /** Filter by event type(s). Comma-delimited list. Example: `event_types=EARNINGS,IPO`. */
        fun eventTypes(eventTypes: List<AllEventsEventType>?) = apply {
            this.eventTypes = eventTypes?.toMutableList()
        }

        /** Alias for calling [Builder.eventTypes] with `eventTypes.orElse(null)`. */
        fun eventTypes(eventTypes: Optional<List<AllEventsEventType>>) =
            eventTypes(eventTypes.getOrNull())

        /**
         * Adds a single [AllEventsEventType] to [eventTypes].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addEventType(eventType: AllEventsEventType) = apply {
            eventTypes = (eventTypes ?: mutableListOf()).apply { add(eventType) }
        }

        /** The start date for the query range, inclusive (YYYY-MM-DD). */
        fun fromDate(fromDate: String?) = apply { this.fromDate = fromDate }

        /** Alias for calling [Builder.fromDate] with `fromDate.orElse(null)`. */
        fun fromDate(fromDate: Optional<String>) = fromDate(fromDate.getOrNull())

        /**
         * Filter by instrument. Comma-separated instrument IDs (UUID) or symbols (equity tickers or
         * OSI option symbols). Example: `instrument_ids=550e8400-e29b-41d4-a716-446655440000,AAPL`.
         */
        fun instrumentIds(instrumentIds: List<String>?) = apply {
            this.instrumentIds = instrumentIds?.toMutableList()
        }

        /** Alias for calling [Builder.instrumentIds] with `instrumentIds.orElse(null)`. */
        fun instrumentIds(instrumentIds: Optional<List<String>>) =
            instrumentIds(instrumentIds.getOrNull())

        /**
         * Adds a single [String] to [instrumentIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addInstrumentId(instrumentId: String) = apply {
            instrumentIds = (instrumentIds ?: mutableListOf()).apply { add(instrumentId) }
        }

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

        /** The end date for the query range, inclusive (YYYY-MM-DD). */
        fun toDate(toDate: String?) = apply { this.toDate = toDate }

        /** Alias for calling [Builder.toDate] with `toDate.orElse(null)`. */
        fun toDate(toDate: Optional<String>) = toDate(toDate.getOrNull())

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
         * Returns an immutable instance of [InstrumentDataGetAllInstrumentEventsParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): InstrumentDataGetAllInstrumentEventsParams =
            InstrumentDataGetAllInstrumentEventsParams(
                eventTypes?.toImmutable(),
                fromDate,
                instrumentIds?.toImmutable(),
                pageSize,
                pageToken,
                toDate,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                eventTypes?.let { put("event_types", it.joinToString(",") { it.toString() }) }
                fromDate?.let { put("from_date", it) }
                instrumentIds?.let { put("instrument_ids", it.joinToString(",")) }
                pageSize?.let { put("page_size", it.toString()) }
                pageToken?.let { put("page_token", it) }
                toDate?.let { put("to_date", it) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InstrumentDataGetAllInstrumentEventsParams &&
            eventTypes == other.eventTypes &&
            fromDate == other.fromDate &&
            instrumentIds == other.instrumentIds &&
            pageSize == other.pageSize &&
            pageToken == other.pageToken &&
            toDate == other.toDate &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            eventTypes,
            fromDate,
            instrumentIds,
            pageSize,
            pageToken,
            toDate,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "InstrumentDataGetAllInstrumentEventsParams{eventTypes=$eventTypes, fromDate=$fromDate, instrumentIds=$instrumentIds, pageSize=$pageSize, pageToken=$pageToken, toDate=$toDate, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
