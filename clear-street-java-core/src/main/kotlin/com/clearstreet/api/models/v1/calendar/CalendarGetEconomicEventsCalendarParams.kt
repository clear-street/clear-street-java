// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.calendar

import com.clearstreet.api.core.Enum
import com.clearstreet.api.core.JsonField
import com.clearstreet.api.core.Params
import com.clearstreet.api.core.http.Headers
import com.clearstreet.api.core.http.QueryParams
import com.clearstreet.api.core.toImmutable
import com.clearstreet.api.errors.ClearStreetInvalidDataException
import com.fasterxml.jackson.annotation.JsonCreator
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Retrieves macroeconomic calendar events (e.g. CPI, jobs reports, central bank rate decisions),
 * optionally filtered by country, impact, and event time range.
 *
 * Absent a `timestamp` lower bound, results default to events from the start of the previous
 * trading day (America/New_York); absent an upper bound, results default through 7 days from today
 * (America/New_York).
 */
class CalendarGetEconomicEventsCalendarParams
private constructor(
    private val country: String?,
    private val impact: List<Impact>?,
    private val pageSize: Long?,
    private val pageToken: String?,
    private val timestamp: Timestamp?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Comma-separated ISO 3166-1 alpha-2 country codes (or `EU`) to filter by. Defaults to `US`
     * when omitted.
     */
    fun country(): Optional<String> = Optional.ofNullable(country)

    /** Comma-separated impact levels to filter by. */
    fun impact(): Optional<List<Impact>> = Optional.ofNullable(impact)

    /** The number of items to return per page. Only used when page_token is not provided. */
    fun pageSize(): Optional<Long> = Optional.ofNullable(pageSize)

    /**
     * Token for retrieving the next or previous page of results. Contains encoded pagination state;
     * when provided, page_size is ignored.
     */
    fun pageToken(): Optional<String> = Optional.ofNullable(pageToken)

    fun timestamp(): Optional<Timestamp> = Optional.ofNullable(timestamp)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): CalendarGetEconomicEventsCalendarParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [CalendarGetEconomicEventsCalendarParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CalendarGetEconomicEventsCalendarParams]. */
    class Builder internal constructor() {

        private var country: String? = null
        private var impact: MutableList<Impact>? = null
        private var pageSize: Long? = null
        private var pageToken: String? = null
        private var timestamp: Timestamp? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            calendarGetEconomicEventsCalendarParams: CalendarGetEconomicEventsCalendarParams
        ) = apply {
            country = calendarGetEconomicEventsCalendarParams.country
            impact = calendarGetEconomicEventsCalendarParams.impact?.toMutableList()
            pageSize = calendarGetEconomicEventsCalendarParams.pageSize
            pageToken = calendarGetEconomicEventsCalendarParams.pageToken
            timestamp = calendarGetEconomicEventsCalendarParams.timestamp
            additionalHeaders =
                calendarGetEconomicEventsCalendarParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                calendarGetEconomicEventsCalendarParams.additionalQueryParams.toBuilder()
        }

        /**
         * Comma-separated ISO 3166-1 alpha-2 country codes (or `EU`) to filter by. Defaults to `US`
         * when omitted.
         */
        fun country(country: String?) = apply { this.country = country }

        /** Alias for calling [Builder.country] with `country.orElse(null)`. */
        fun country(country: Optional<String>) = country(country.getOrNull())

        /** Comma-separated impact levels to filter by. */
        fun impact(impact: List<Impact>?) = apply { this.impact = impact?.toMutableList() }

        /** Alias for calling [Builder.impact] with `impact.orElse(null)`. */
        fun impact(impact: Optional<List<Impact>>) = impact(impact.getOrNull())

        /**
         * Adds a single [Impact] to [Builder.impact].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addImpact(impact: Impact) = apply {
            this.impact = (this.impact ?: mutableListOf()).apply { add(impact) }
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

        fun timestamp(timestamp: Timestamp?) = apply { this.timestamp = timestamp }

        /** Alias for calling [Builder.timestamp] with `timestamp.orElse(null)`. */
        fun timestamp(timestamp: Optional<Timestamp>) = timestamp(timestamp.getOrNull())

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
         * Returns an immutable instance of [CalendarGetEconomicEventsCalendarParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): CalendarGetEconomicEventsCalendarParams =
            CalendarGetEconomicEventsCalendarParams(
                country,
                impact?.toImmutable(),
                pageSize,
                pageToken,
                timestamp,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                country?.let { put("country", it) }
                impact?.let { put("impact", it.joinToString(",") { it.toString() }) }
                pageSize?.let { put("page_size", it.toString()) }
                pageToken?.let { put("page_token", it) }
                timestamp?.let {
                    it.gt().ifPresent { put("timestamp[gt]", it) }
                    it.gte().ifPresent { put("timestamp[gte]", it) }
                    it.lt().ifPresent { put("timestamp[lt]", it) }
                    it.lte().ifPresent { put("timestamp[lte]", it) }
                    it._additionalProperties().keys().forEach { key ->
                        it._additionalProperties().values(key).forEach { value ->
                            put("timestamp[$key]", value)
                        }
                    }
                }
                putAll(additionalQueryParams)
            }
            .build()

    /** Market impact of an economic calendar event. */
    class Impact @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val NONE = of("NONE")

            @JvmField val LOW = of("LOW")

            @JvmField val MEDIUM = of("MEDIUM")

            @JvmField val HIGH = of("HIGH")

            @JvmStatic fun of(value: String) = Impact(JsonField.of(value))
        }

        /** An enum containing [Impact]'s known values. */
        enum class Known {
            NONE,
            LOW,
            MEDIUM,
            HIGH,
        }

        /**
         * An enum containing [Impact]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Impact] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            NONE,
            LOW,
            MEDIUM,
            HIGH,
            /** An enum member indicating that [Impact] was instantiated with an unknown value. */
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
                NONE -> Value.NONE
                LOW -> Value.LOW
                MEDIUM -> Value.MEDIUM
                HIGH -> Value.HIGH
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
                NONE -> Known.NONE
                LOW -> Known.LOW
                MEDIUM -> Known.MEDIUM
                HIGH -> Known.HIGH
                else -> throw ClearStreetInvalidDataException("Unknown Impact: $value")
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
        fun validate(): Impact = apply {
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

            return other is Impact && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class Timestamp
    private constructor(
        private val gt: String?,
        private val gte: String?,
        private val lt: String?,
        private val lte: String?,
        private val additionalProperties: QueryParams,
    ) {

        /**
         * Return only rows where `timestamp` is strictly after the given value. A bare `YYYY-MM-DD`
         * date expands to the end of that day (UTC), so this matches from the start of the
         * following day. See
         * [Range filters](https://docs.clearstreet.com/guides/api-fundamentals#range-filters) for
         * accepted formats, bare-date expansion, and combining bounds. Returns 400 if the resulting
         * range is inverted.
         */
        fun gt(): Optional<String> = Optional.ofNullable(gt)

        /**
         * Return only rows where `timestamp` is on or after the given value. A bare `YYYY-MM-DD`
         * date expands to the start of that day (UTC). See
         * [Range filters](https://docs.clearstreet.com/guides/api-fundamentals#range-filters) for
         * accepted formats, bare-date expansion, and combining bounds. Returns 400 if the resulting
         * range is inverted.
         */
        fun gte(): Optional<String> = Optional.ofNullable(gte)

        /**
         * Return only rows where `timestamp` is strictly before the given value. A bare
         * `YYYY-MM-DD` date expands to the start of that day (UTC). See
         * [Range filters](https://docs.clearstreet.com/guides/api-fundamentals#range-filters) for
         * accepted formats, bare-date expansion, and combining bounds. Returns 400 if the resulting
         * range is inverted.
         */
        fun lt(): Optional<String> = Optional.ofNullable(lt)

        /**
         * Return only rows where `timestamp` is on or before the given value. A bare `YYYY-MM-DD`
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

            /** Returns a mutable builder for constructing an instance of [Timestamp]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Timestamp]. */
        class Builder internal constructor() {

            private var gt: String? = null
            private var gte: String? = null
            private var lt: String? = null
            private var lte: String? = null
            private var additionalProperties: QueryParams.Builder = QueryParams.builder()

            @JvmSynthetic
            internal fun from(timestamp: Timestamp) = apply {
                gt = timestamp.gt
                gte = timestamp.gte
                lt = timestamp.lt
                lte = timestamp.lte
                additionalProperties = timestamp.additionalProperties.toBuilder()
            }

            /**
             * Return only rows where `timestamp` is strictly after the given value. A bare
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
             * Return only rows where `timestamp` is on or after the given value. A bare
             * `YYYY-MM-DD` date expands to the start of that day (UTC). See
             * [Range filters](https://docs.clearstreet.com/guides/api-fundamentals#range-filters)
             * for accepted formats, bare-date expansion, and combining bounds. Returns 400 if the
             * resulting range is inverted.
             */
            fun gte(gte: String?) = apply { this.gte = gte }

            /** Alias for calling [Builder.gte] with `gte.orElse(null)`. */
            fun gte(gte: Optional<String>) = gte(gte.getOrNull())

            /**
             * Return only rows where `timestamp` is strictly before the given value. A bare
             * `YYYY-MM-DD` date expands to the start of that day (UTC). See
             * [Range filters](https://docs.clearstreet.com/guides/api-fundamentals#range-filters)
             * for accepted formats, bare-date expansion, and combining bounds. Returns 400 if the
             * resulting range is inverted.
             */
            fun lt(lt: String?) = apply { this.lt = lt }

            /** Alias for calling [Builder.lt] with `lt.orElse(null)`. */
            fun lt(lt: Optional<String>) = lt(lt.getOrNull())

            /**
             * Return only rows where `timestamp` is on or before the given value. A bare
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
             * Returns an immutable instance of [Timestamp].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Timestamp = Timestamp(gt, gte, lt, lte, additionalProperties.build())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Timestamp &&
                gt == other.gt &&
                gte == other.gte &&
                lt == other.lt &&
                lte == other.lte &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(gt, gte, lt, lte, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Timestamp{gt=$gt, gte=$gte, lt=$lt, lte=$lte, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CalendarGetEconomicEventsCalendarParams &&
            country == other.country &&
            impact == other.impact &&
            pageSize == other.pageSize &&
            pageToken == other.pageToken &&
            timestamp == other.timestamp &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            country,
            impact,
            pageSize,
            pageToken,
            timestamp,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "CalendarGetEconomicEventsCalendarParams{country=$country, impact=$impact, pageSize=$pageSize, pageToken=$pageToken, timestamp=$timestamp, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
