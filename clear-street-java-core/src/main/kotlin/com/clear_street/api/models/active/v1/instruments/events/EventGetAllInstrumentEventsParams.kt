// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.instruments.events

import com.clear_street.api.core.Params
import com.clear_street.api.core.http.Headers
import com.clear_street.api.core.http.QueryParams
import com.clear_street.api.core.toImmutable
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Retrieves all instrument events grouped by date. */
class EventGetAllInstrumentEventsParams
private constructor(
    private val eventTypes: List<AllEventsEventType>?,
    private val fromDate: String?,
    private val instrumentIds: List<String>?,
    private val securityId: List<String>?,
    private val securityIdSource: List<String>?,
    private val toDate: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Filter by event type(s). Comma-delimited list. Example: `event_types=EARNINGS,IPO`. */
    fun eventTypes(): Optional<List<AllEventsEventType>> = Optional.ofNullable(eventTypes)

    /** The start date for the query range, inclusive (YYYY-MM-DD). */
    fun fromDate(): Optional<String> = Optional.ofNullable(fromDate)

    /**
     * Filter by OEMS instrument ID(s). Comma-delimited list of UUIDs. Example:
     * `instrument_ids=550e8400-e29b-41d4-a716-446655440000`.
     */
    fun instrumentIds(): Optional<List<String>> = Optional.ofNullable(instrumentIds)

    /**
     * Filter by security ID(s). Accepts single value or indexed array.
     *
     * Examples:
     * - Single: `security_id=037833100`
     * - Multiple: `security_id[0]=037833100&security_id[1]=594918104`
     */
    fun securityId(): Optional<List<String>> = Optional.ofNullable(securityId)

    /**
     * Source(s) for the security ID filter. Must match the count and order of security_id.
     *
     * Examples:
     * - Single: `security_id_source=CUSIP`
     * - Multiple: `security_id_source[0]=CUSIP&security_id_source[1]=FIGI`
     */
    fun securityIdSource(): Optional<List<String>> = Optional.ofNullable(securityIdSource)

    /** The end date for the query range, inclusive (YYYY-MM-DD). */
    fun toDate(): Optional<String> = Optional.ofNullable(toDate)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): EventGetAllInstrumentEventsParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [EventGetAllInstrumentEventsParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [EventGetAllInstrumentEventsParams]. */
    class Builder internal constructor() {

        private var eventTypes: MutableList<AllEventsEventType>? = null
        private var fromDate: String? = null
        private var instrumentIds: MutableList<String>? = null
        private var securityId: MutableList<String>? = null
        private var securityIdSource: MutableList<String>? = null
        private var toDate: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(eventGetAllInstrumentEventsParams: EventGetAllInstrumentEventsParams) =
            apply {
                eventTypes = eventGetAllInstrumentEventsParams.eventTypes?.toMutableList()
                fromDate = eventGetAllInstrumentEventsParams.fromDate
                instrumentIds = eventGetAllInstrumentEventsParams.instrumentIds?.toMutableList()
                securityId = eventGetAllInstrumentEventsParams.securityId?.toMutableList()
                securityIdSource =
                    eventGetAllInstrumentEventsParams.securityIdSource?.toMutableList()
                toDate = eventGetAllInstrumentEventsParams.toDate
                additionalHeaders = eventGetAllInstrumentEventsParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    eventGetAllInstrumentEventsParams.additionalQueryParams.toBuilder()
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
         * Filter by OEMS instrument ID(s). Comma-delimited list of UUIDs. Example:
         * `instrument_ids=550e8400-e29b-41d4-a716-446655440000`.
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

        /**
         * Filter by security ID(s). Accepts single value or indexed array.
         *
         * Examples:
         * - Single: `security_id=037833100`
         * - Multiple: `security_id[0]=037833100&security_id[1]=594918104`
         */
        fun securityId(securityId: List<String>?) = apply {
            this.securityId = securityId?.toMutableList()
        }

        /** Alias for calling [Builder.securityId] with `securityId.orElse(null)`. */
        fun securityId(securityId: Optional<List<String>>) = securityId(securityId.getOrNull())

        /**
         * Adds a single [String] to [Builder.securityId].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSecurityId(securityId: String) = apply {
            this.securityId = (this.securityId ?: mutableListOf()).apply { add(securityId) }
        }

        /**
         * Source(s) for the security ID filter. Must match the count and order of security_id.
         *
         * Examples:
         * - Single: `security_id_source=CUSIP`
         * - Multiple: `security_id_source[0]=CUSIP&security_id_source[1]=FIGI`
         */
        fun securityIdSource(securityIdSource: List<String>?) = apply {
            this.securityIdSource = securityIdSource?.toMutableList()
        }

        /** Alias for calling [Builder.securityIdSource] with `securityIdSource.orElse(null)`. */
        fun securityIdSource(securityIdSource: Optional<List<String>>) =
            securityIdSource(securityIdSource.getOrNull())

        /**
         * Adds a single [String] to [Builder.securityIdSource].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSecurityIdSource(securityIdSource: String) = apply {
            this.securityIdSource =
                (this.securityIdSource ?: mutableListOf()).apply { add(securityIdSource) }
        }

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
         * Returns an immutable instance of [EventGetAllInstrumentEventsParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): EventGetAllInstrumentEventsParams =
            EventGetAllInstrumentEventsParams(
                eventTypes?.toImmutable(),
                fromDate,
                instrumentIds?.toImmutable(),
                securityId?.toImmutable(),
                securityIdSource?.toImmutable(),
                toDate,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                eventTypes?.forEachIndexed { index, it ->
                    put("event_types[$index]", it.toString())
                }
                fromDate?.let { put("from_date", it) }
                instrumentIds?.forEachIndexed { index, it -> put("instrument_ids[$index]", it) }
                securityId?.forEachIndexed { index, it -> put("security_id[$index]", it) }
                securityIdSource?.forEachIndexed { index, it ->
                    put("security_id_source[$index]", it)
                }
                toDate?.let { put("to_date", it) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EventGetAllInstrumentEventsParams &&
            eventTypes == other.eventTypes &&
            fromDate == other.fromDate &&
            instrumentIds == other.instrumentIds &&
            securityId == other.securityId &&
            securityIdSource == other.securityIdSource &&
            toDate == other.toDate &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            eventTypes,
            fromDate,
            instrumentIds,
            securityId,
            securityIdSource,
            toDate,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "EventGetAllInstrumentEventsParams{eventTypes=$eventTypes, fromDate=$fromDate, instrumentIds=$instrumentIds, securityId=$securityId, securityIdSource=$securityIdSource, toDate=$toDate, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
