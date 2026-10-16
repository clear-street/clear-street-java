// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.instrumentdata

import com.clearstreet.api.core.Enum
import com.clearstreet.api.core.JsonField
import com.clearstreet.api.core.Params
import com.clearstreet.api.core.http.Headers
import com.clearstreet.api.core.http.QueryParams
import com.clearstreet.api.errors.ClearStreetInvalidDataException
import com.fasterxml.jackson.annotation.JsonCreator
import java.time.LocalDate
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Retrieves earnings call transcripts for a specific instrument, newest fiscal period first.
 *
 * Defaults: `page_size` is 1 and is capped at 5, because each transcript is large. Send
 * `event_date` with the `date` of an earnings event from the events endpoints to fetch that event's
 * transcript. The `date.gt`, `date.gte`, `date.lt`, and `date.lte` filters compare the call date
 * itself. An instrument without transcripts returns an empty list.
 *
 * Pagination metadata does not include `total_items` or `total_pages` for this endpoint. Use
 * `next_page_token` to detect whether more results exist. The token does not carry filters: send
 * the same filters with every page request.
 */
class InstrumentDataGetInstrumentEarningsTranscriptsParams
private constructor(
    private val instrumentId: String?,
    private val date: Date?,
    private val eventDate: LocalDate?,
    private val pageSize: Long?,
    private val pageToken: String?,
    private val period: Period?,
    private val year: Int?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Instrument identifier: either an instrument UUID or a symbol (symbol for equities, OSI for
     * options). Non-UUID inputs are resolved server-side.
     */
    fun instrumentId(): Optional<String> = Optional.ofNullable(instrumentId)

    fun date(): Optional<Date> = Optional.ofNullable(date)

    /**
     * Return only transcripts whose call date is within one day of this earnings event date
     * (`YYYY-MM-DD`). Use an event's `date` to fetch that event's transcript.
     */
    fun eventDate(): Optional<LocalDate> = Optional.ofNullable(eventDate)

    /** The number of items to return per page. Only used when page_token is not provided. */
    fun pageSize(): Optional<Long> = Optional.ofNullable(pageSize)

    /**
     * Token for retrieving the next or previous page of results. Contains encoded pagination state;
     * when provided, page_size is ignored.
     */
    fun pageToken(): Optional<String> = Optional.ofNullable(pageToken)

    /** Only return the transcript for this fiscal quarter. */
    fun period(): Optional<Period> = Optional.ofNullable(period)

    /** Only return the transcript for this fiscal year. */
    fun year(): Optional<Int> = Optional.ofNullable(year)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic
        fun none(): InstrumentDataGetInstrumentEarningsTranscriptsParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [InstrumentDataGetInstrumentEarningsTranscriptsParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [InstrumentDataGetInstrumentEarningsTranscriptsParams]. */
    class Builder internal constructor() {

        private var instrumentId: String? = null
        private var date: Date? = null
        private var eventDate: LocalDate? = null
        private var pageSize: Long? = null
        private var pageToken: String? = null
        private var period: Period? = null
        private var year: Int? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            instrumentDataGetInstrumentEarningsTranscriptsParams:
                InstrumentDataGetInstrumentEarningsTranscriptsParams
        ) = apply {
            instrumentId = instrumentDataGetInstrumentEarningsTranscriptsParams.instrumentId
            date = instrumentDataGetInstrumentEarningsTranscriptsParams.date
            eventDate = instrumentDataGetInstrumentEarningsTranscriptsParams.eventDate
            pageSize = instrumentDataGetInstrumentEarningsTranscriptsParams.pageSize
            pageToken = instrumentDataGetInstrumentEarningsTranscriptsParams.pageToken
            period = instrumentDataGetInstrumentEarningsTranscriptsParams.period
            year = instrumentDataGetInstrumentEarningsTranscriptsParams.year
            additionalHeaders =
                instrumentDataGetInstrumentEarningsTranscriptsParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                instrumentDataGetInstrumentEarningsTranscriptsParams.additionalQueryParams
                    .toBuilder()
        }

        /**
         * Instrument identifier: either an instrument UUID or a symbol (symbol for equities, OSI
         * for options). Non-UUID inputs are resolved server-side.
         */
        fun instrumentId(instrumentId: String?) = apply { this.instrumentId = instrumentId }

        /** Alias for calling [Builder.instrumentId] with `instrumentId.orElse(null)`. */
        fun instrumentId(instrumentId: Optional<String>) = instrumentId(instrumentId.getOrNull())

        fun date(date: Date?) = apply { this.date = date }

        /** Alias for calling [Builder.date] with `date.orElse(null)`. */
        fun date(date: Optional<Date>) = date(date.getOrNull())

        /**
         * Return only transcripts whose call date is within one day of this earnings event date
         * (`YYYY-MM-DD`). Use an event's `date` to fetch that event's transcript.
         */
        fun eventDate(eventDate: LocalDate?) = apply { this.eventDate = eventDate }

        /** Alias for calling [Builder.eventDate] with `eventDate.orElse(null)`. */
        fun eventDate(eventDate: Optional<LocalDate>) = eventDate(eventDate.getOrNull())

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

        /** Only return the transcript for this fiscal quarter. */
        fun period(period: Period?) = apply { this.period = period }

        /** Alias for calling [Builder.period] with `period.orElse(null)`. */
        fun period(period: Optional<Period>) = period(period.getOrNull())

        /** Only return the transcript for this fiscal year. */
        fun year(year: Int?) = apply { this.year = year }

        /**
         * Alias for [Builder.year].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun year(year: Int) = year(year as Int?)

        /** Alias for calling [Builder.year] with `year.orElse(null)`. */
        fun year(year: Optional<Int>) = year(year.getOrNull())

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
         * Returns an immutable instance of [InstrumentDataGetInstrumentEarningsTranscriptsParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): InstrumentDataGetInstrumentEarningsTranscriptsParams =
            InstrumentDataGetInstrumentEarningsTranscriptsParams(
                instrumentId,
                date,
                eventDate,
                pageSize,
                pageToken,
                period,
                year,
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
                date?.let {
                    it.gt().ifPresent { put("date[gt]", it) }
                    it.gte().ifPresent { put("date[gte]", it) }
                    it.lt().ifPresent { put("date[lt]", it) }
                    it.lte().ifPresent { put("date[lte]", it) }
                    it._additionalProperties().keys().forEach { key ->
                        it._additionalProperties().values(key).forEach { value ->
                            put("date[$key]", value)
                        }
                    }
                }
                eventDate?.let { put("event_date", it.toString()) }
                pageSize?.let { put("page_size", it.toString()) }
                pageToken?.let { put("page_token", it) }
                period?.let { put("period", it.toString()) }
                year?.let { put("year", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    class Date
    private constructor(
        private val gt: String?,
        private val gte: String?,
        private val lt: String?,
        private val lte: String?,
        private val additionalProperties: QueryParams,
    ) {

        /**
         * Return only rows where `date` is strictly after the given value. A bare `YYYY-MM-DD` date
         * expands to the end of that day (UTC), so this matches from the start of the following
         * day. See
         * [Range filters](https://docs.clearstreet.com/guides/api-fundamentals#range-filters) for
         * accepted formats, bare-date expansion, and combining bounds. Returns 400 if the resulting
         * range is inverted.
         */
        fun gt(): Optional<String> = Optional.ofNullable(gt)

        /**
         * Return only rows where `date` is on or after the given value. A bare `YYYY-MM-DD` date
         * expands to the start of that day (UTC). See
         * [Range filters](https://docs.clearstreet.com/guides/api-fundamentals#range-filters) for
         * accepted formats, bare-date expansion, and combining bounds. Returns 400 if the resulting
         * range is inverted.
         */
        fun gte(): Optional<String> = Optional.ofNullable(gte)

        /**
         * Return only rows where `date` is strictly before the given value. A bare `YYYY-MM-DD`
         * date expands to the start of that day (UTC). See
         * [Range filters](https://docs.clearstreet.com/guides/api-fundamentals#range-filters) for
         * accepted formats, bare-date expansion, and combining bounds. Returns 400 if the resulting
         * range is inverted.
         */
        fun lt(): Optional<String> = Optional.ofNullable(lt)

        /**
         * Return only rows where `date` is on or before the given value. A bare `YYYY-MM-DD` date
         * expands to the end of that day (UTC), so this matches through the end of that day. See
         * [Range filters](https://docs.clearstreet.com/guides/api-fundamentals#range-filters) for
         * accepted formats, bare-date expansion, and combining bounds. Returns 400 if the resulting
         * range is inverted.
         */
        fun lte(): Optional<String> = Optional.ofNullable(lte)

        /** Query params to send with the request. */
        fun _additionalProperties(): QueryParams = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Date]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Date]. */
        class Builder internal constructor() {

            private var gt: String? = null
            private var gte: String? = null
            private var lt: String? = null
            private var lte: String? = null
            private var additionalProperties: QueryParams.Builder = QueryParams.builder()

            @JvmSynthetic
            internal fun from(date: Date) = apply {
                gt = date.gt
                gte = date.gte
                lt = date.lt
                lte = date.lte
                additionalProperties = date.additionalProperties.toBuilder()
            }

            /**
             * Return only rows where `date` is strictly after the given value. A bare `YYYY-MM-DD`
             * date expands to the end of that day (UTC), so this matches from the start of the
             * following day. See
             * [Range filters](https://docs.clearstreet.com/guides/api-fundamentals#range-filters)
             * for accepted formats, bare-date expansion, and combining bounds. Returns 400 if the
             * resulting range is inverted.
             */
            fun gt(gt: String?) = apply { this.gt = gt }

            /** Alias for calling [Builder.gt] with `gt.orElse(null)`. */
            fun gt(gt: Optional<String>) = gt(gt.getOrNull())

            /**
             * Return only rows where `date` is on or after the given value. A bare `YYYY-MM-DD`
             * date expands to the start of that day (UTC). See
             * [Range filters](https://docs.clearstreet.com/guides/api-fundamentals#range-filters)
             * for accepted formats, bare-date expansion, and combining bounds. Returns 400 if the
             * resulting range is inverted.
             */
            fun gte(gte: String?) = apply { this.gte = gte }

            /** Alias for calling [Builder.gte] with `gte.orElse(null)`. */
            fun gte(gte: Optional<String>) = gte(gte.getOrNull())

            /**
             * Return only rows where `date` is strictly before the given value. A bare `YYYY-MM-DD`
             * date expands to the start of that day (UTC). See
             * [Range filters](https://docs.clearstreet.com/guides/api-fundamentals#range-filters)
             * for accepted formats, bare-date expansion, and combining bounds. Returns 400 if the
             * resulting range is inverted.
             */
            fun lt(lt: String?) = apply { this.lt = lt }

            /** Alias for calling [Builder.lt] with `lt.orElse(null)`. */
            fun lt(lt: Optional<String>) = lt(lt.getOrNull())

            /**
             * Return only rows where `date` is on or before the given value. A bare `YYYY-MM-DD`
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
             * Returns an immutable instance of [Date].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Date = Date(gt, gte, lt, lte, additionalProperties.build())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Date &&
                gt == other.gt &&
                gte == other.gte &&
                lt == other.lt &&
                lte == other.lte &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(gt, gte, lt, lte, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Date{gt=$gt, gte=$gte, lt=$lt, lte=$lte, additionalProperties=$additionalProperties}"
    }

    /** Only return the transcript for this fiscal quarter. */
    class Period @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val Q1 = of("Q1")

            @JvmField val Q2 = of("Q2")

            @JvmField val Q3 = of("Q3")

            @JvmField val Q4 = of("Q4")

            @JvmStatic fun of(value: String) = Period(JsonField.of(value))
        }

        /** An enum containing [Period]'s known values. */
        enum class Known {
            Q1,
            Q2,
            Q3,
            Q4,
        }

        /**
         * An enum containing [Period]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Period] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            Q1,
            Q2,
            Q3,
            Q4,
            /** An enum member indicating that [Period] was instantiated with an unknown value. */
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
                Q1 -> Value.Q1
                Q2 -> Value.Q2
                Q3 -> Value.Q3
                Q4 -> Value.Q4
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
                Q1 -> Known.Q1
                Q2 -> Known.Q2
                Q3 -> Known.Q3
                Q4 -> Known.Q4
                else -> throw ClearStreetInvalidDataException("Unknown Period: $value")
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
        fun validate(): Period = apply {
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

            return other is Period && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InstrumentDataGetInstrumentEarningsTranscriptsParams &&
            instrumentId == other.instrumentId &&
            date == other.date &&
            eventDate == other.eventDate &&
            pageSize == other.pageSize &&
            pageToken == other.pageToken &&
            period == other.period &&
            year == other.year &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            instrumentId,
            date,
            eventDate,
            pageSize,
            pageToken,
            period,
            year,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "InstrumentDataGetInstrumentEarningsTranscriptsParams{instrumentId=$instrumentId, date=$date, eventDate=$eventDate, pageSize=$pageSize, pageToken=$pageToken, period=$period, year=$year, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
