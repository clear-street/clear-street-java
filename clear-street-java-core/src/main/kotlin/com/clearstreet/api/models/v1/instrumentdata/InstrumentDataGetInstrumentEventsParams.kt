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
 * Retrieves corporate events (earnings, dividends, splits, IPO) for an instrument, grouped by event
 * type. Filter to specific types via `event_types`.
 *
 * Date range defaults:
 * - `from_date`: today - 365 days
 * - `to_date`: today + 60 days
 */
class InstrumentDataGetInstrumentEventsParams
private constructor(
    private val instrumentId: String?,
    private val eventTypes: List<AllEventsEventType>?,
    private val fromDate: String?,
    private val toDate: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Instrument identifier: either an instrument UUID or a symbol (symbol for equities, OSI for
     * options). Non-UUID inputs are resolved server-side.
     */
    fun instrumentId(): Optional<String> = Optional.ofNullable(instrumentId)

    /** Filter by event type(s). Comma-delimited list. Example: `event_types=EARNINGS,IPO`. */
    fun eventTypes(): Optional<List<AllEventsEventType>> = Optional.ofNullable(eventTypes)

    /** The start date for the query range, inclusive (YYYY-MM-DD). */
    fun fromDate(): Optional<String> = Optional.ofNullable(fromDate)

    /** The end date for the query range, inclusive (YYYY-MM-DD). */
    fun toDate(): Optional<String> = Optional.ofNullable(toDate)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): InstrumentDataGetInstrumentEventsParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [InstrumentDataGetInstrumentEventsParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [InstrumentDataGetInstrumentEventsParams]. */
    class Builder internal constructor() {

        private var instrumentId: String? = null
        private var eventTypes: MutableList<AllEventsEventType>? = null
        private var fromDate: String? = null
        private var toDate: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            instrumentDataGetInstrumentEventsParams: InstrumentDataGetInstrumentEventsParams
        ) = apply {
            instrumentId = instrumentDataGetInstrumentEventsParams.instrumentId
            eventTypes = instrumentDataGetInstrumentEventsParams.eventTypes?.toMutableList()
            fromDate = instrumentDataGetInstrumentEventsParams.fromDate
            toDate = instrumentDataGetInstrumentEventsParams.toDate
            additionalHeaders =
                instrumentDataGetInstrumentEventsParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                instrumentDataGetInstrumentEventsParams.additionalQueryParams.toBuilder()
        }

        /**
         * Instrument identifier: either an instrument UUID or a symbol (symbol for equities, OSI
         * for options). Non-UUID inputs are resolved server-side.
         */
        fun instrumentId(instrumentId: String?) = apply { this.instrumentId = instrumentId }

        /** Alias for calling [Builder.instrumentId] with `instrumentId.orElse(null)`. */
        fun instrumentId(instrumentId: Optional<String>) = instrumentId(instrumentId.getOrNull())

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
         * Returns an immutable instance of [InstrumentDataGetInstrumentEventsParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): InstrumentDataGetInstrumentEventsParams =
            InstrumentDataGetInstrumentEventsParams(
                instrumentId,
                eventTypes?.toImmutable(),
                fromDate,
                toDate,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> instrumentId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                eventTypes?.let { put("event_types", it.joinToString(",") { it.toString() }) }
                fromDate?.let { put("from_date", it) }
                toDate?.let { put("to_date", it) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InstrumentDataGetInstrumentEventsParams &&
            instrumentId == other.instrumentId &&
            eventTypes == other.eventTypes &&
            fromDate == other.fromDate &&
            toDate == other.toDate &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            instrumentId,
            eventTypes,
            fromDate,
            toDate,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "InstrumentDataGetInstrumentEventsParams{instrumentId=$instrumentId, eventTypes=$eventTypes, fromDate=$fromDate, toDate=$toDate, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
