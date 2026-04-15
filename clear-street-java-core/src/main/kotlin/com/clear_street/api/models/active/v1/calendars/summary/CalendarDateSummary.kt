// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.calendars.summary

import com.clear_street.api.core.ExcludeMissing
import com.clear_street.api.core.JsonField
import com.clear_street.api.core.JsonMissing
import com.clear_street.api.core.JsonValue
import com.clear_street.api.core.checkRequired
import com.clear_street.api.errors.ClearStreetInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.LocalDate
import java.util.Collections
import java.util.Objects

/** Summary of events for a specific date */
class CalendarDateSummary
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val date: JsonField<LocalDate>,
    private val dividendsCount: JsonField<Long>,
    private val earningsCount: JsonField<Long>,
    private val economicEventsCount: JsonField<Long>,
    private val mergersAcquisitionsCount: JsonField<Long>,
    private val stockSplitsCount: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("date") @ExcludeMissing date: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("dividends_count")
        @ExcludeMissing
        dividendsCount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("earnings_count")
        @ExcludeMissing
        earningsCount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("economic_events_count")
        @ExcludeMissing
        economicEventsCount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("mergers_acquisitions_count")
        @ExcludeMissing
        mergersAcquisitionsCount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("stock_splits_count")
        @ExcludeMissing
        stockSplitsCount: JsonField<Long> = JsonMissing.of(),
    ) : this(
        date,
        dividendsCount,
        earningsCount,
        economicEventsCount,
        mergersAcquisitionsCount,
        stockSplitsCount,
        mutableMapOf(),
    )

    /**
     * The date of the events
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun date(): LocalDate = date.getRequired("date")

    /**
     * The number of dividend events on this date
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun dividendsCount(): Long = dividendsCount.getRequired("dividends_count")

    /**
     * The number of earnings announcements on this date
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun earningsCount(): Long = earningsCount.getRequired("earnings_count")

    /**
     * The number of economic events on this date
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun economicEventsCount(): Long = economicEventsCount.getRequired("economic_events_count")

    /**
     * The number of mergers and acquisitions on this date
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun mergersAcquisitionsCount(): Long =
        mergersAcquisitionsCount.getRequired("mergers_acquisitions_count")

    /**
     * The number of stock split events on this date
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun stockSplitsCount(): Long = stockSplitsCount.getRequired("stock_splits_count")

    /**
     * Returns the raw JSON value of [date].
     *
     * Unlike [date], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("date") @ExcludeMissing fun _date(): JsonField<LocalDate> = date

    /**
     * Returns the raw JSON value of [dividendsCount].
     *
     * Unlike [dividendsCount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dividends_count")
    @ExcludeMissing
    fun _dividendsCount(): JsonField<Long> = dividendsCount

    /**
     * Returns the raw JSON value of [earningsCount].
     *
     * Unlike [earningsCount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("earnings_count")
    @ExcludeMissing
    fun _earningsCount(): JsonField<Long> = earningsCount

    /**
     * Returns the raw JSON value of [economicEventsCount].
     *
     * Unlike [economicEventsCount], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("economic_events_count")
    @ExcludeMissing
    fun _economicEventsCount(): JsonField<Long> = economicEventsCount

    /**
     * Returns the raw JSON value of [mergersAcquisitionsCount].
     *
     * Unlike [mergersAcquisitionsCount], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("mergers_acquisitions_count")
    @ExcludeMissing
    fun _mergersAcquisitionsCount(): JsonField<Long> = mergersAcquisitionsCount

    /**
     * Returns the raw JSON value of [stockSplitsCount].
     *
     * Unlike [stockSplitsCount], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("stock_splits_count")
    @ExcludeMissing
    fun _stockSplitsCount(): JsonField<Long> = stockSplitsCount

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
        additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> =
        Collections.unmodifiableMap(additionalProperties)

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CalendarDateSummary].
         *
         * The following fields are required:
         * ```java
         * .date()
         * .dividendsCount()
         * .earningsCount()
         * .economicEventsCount()
         * .mergersAcquisitionsCount()
         * .stockSplitsCount()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CalendarDateSummary]. */
    class Builder internal constructor() {

        private var date: JsonField<LocalDate>? = null
        private var dividendsCount: JsonField<Long>? = null
        private var earningsCount: JsonField<Long>? = null
        private var economicEventsCount: JsonField<Long>? = null
        private var mergersAcquisitionsCount: JsonField<Long>? = null
        private var stockSplitsCount: JsonField<Long>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(calendarDateSummary: CalendarDateSummary) = apply {
            date = calendarDateSummary.date
            dividendsCount = calendarDateSummary.dividendsCount
            earningsCount = calendarDateSummary.earningsCount
            economicEventsCount = calendarDateSummary.economicEventsCount
            mergersAcquisitionsCount = calendarDateSummary.mergersAcquisitionsCount
            stockSplitsCount = calendarDateSummary.stockSplitsCount
            additionalProperties = calendarDateSummary.additionalProperties.toMutableMap()
        }

        /** The date of the events */
        fun date(date: LocalDate) = date(JsonField.of(date))

        /**
         * Sets [Builder.date] to an arbitrary JSON value.
         *
         * You should usually call [Builder.date] with a well-typed [LocalDate] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun date(date: JsonField<LocalDate>) = apply { this.date = date }

        /** The number of dividend events on this date */
        fun dividendsCount(dividendsCount: Long) = dividendsCount(JsonField.of(dividendsCount))

        /**
         * Sets [Builder.dividendsCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dividendsCount] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun dividendsCount(dividendsCount: JsonField<Long>) = apply {
            this.dividendsCount = dividendsCount
        }

        /** The number of earnings announcements on this date */
        fun earningsCount(earningsCount: Long) = earningsCount(JsonField.of(earningsCount))

        /**
         * Sets [Builder.earningsCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.earningsCount] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun earningsCount(earningsCount: JsonField<Long>) = apply {
            this.earningsCount = earningsCount
        }

        /** The number of economic events on this date */
        fun economicEventsCount(economicEventsCount: Long) =
            economicEventsCount(JsonField.of(economicEventsCount))

        /**
         * Sets [Builder.economicEventsCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.economicEventsCount] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun economicEventsCount(economicEventsCount: JsonField<Long>) = apply {
            this.economicEventsCount = economicEventsCount
        }

        /** The number of mergers and acquisitions on this date */
        fun mergersAcquisitionsCount(mergersAcquisitionsCount: Long) =
            mergersAcquisitionsCount(JsonField.of(mergersAcquisitionsCount))

        /**
         * Sets [Builder.mergersAcquisitionsCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mergersAcquisitionsCount] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun mergersAcquisitionsCount(mergersAcquisitionsCount: JsonField<Long>) = apply {
            this.mergersAcquisitionsCount = mergersAcquisitionsCount
        }

        /** The number of stock split events on this date */
        fun stockSplitsCount(stockSplitsCount: Long) =
            stockSplitsCount(JsonField.of(stockSplitsCount))

        /**
         * Sets [Builder.stockSplitsCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.stockSplitsCount] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun stockSplitsCount(stockSplitsCount: JsonField<Long>) = apply {
            this.stockSplitsCount = stockSplitsCount
        }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAllAdditionalProperties(additionalProperties)
        }

        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalProperty)
        }

        /**
         * Returns an immutable instance of [CalendarDateSummary].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .date()
         * .dividendsCount()
         * .earningsCount()
         * .economicEventsCount()
         * .mergersAcquisitionsCount()
         * .stockSplitsCount()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CalendarDateSummary =
            CalendarDateSummary(
                checkRequired("date", date),
                checkRequired("dividendsCount", dividendsCount),
                checkRequired("earningsCount", earningsCount),
                checkRequired("economicEventsCount", economicEventsCount),
                checkRequired("mergersAcquisitionsCount", mergersAcquisitionsCount),
                checkRequired("stockSplitsCount", stockSplitsCount),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): CalendarDateSummary = apply {
        if (validated) {
            return@apply
        }

        date()
        dividendsCount()
        earningsCount()
        economicEventsCount()
        mergersAcquisitionsCount()
        stockSplitsCount()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (date.asKnown().isPresent) 1 else 0) +
            (if (dividendsCount.asKnown().isPresent) 1 else 0) +
            (if (earningsCount.asKnown().isPresent) 1 else 0) +
            (if (economicEventsCount.asKnown().isPresent) 1 else 0) +
            (if (mergersAcquisitionsCount.asKnown().isPresent) 1 else 0) +
            (if (stockSplitsCount.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CalendarDateSummary &&
            date == other.date &&
            dividendsCount == other.dividendsCount &&
            earningsCount == other.earningsCount &&
            economicEventsCount == other.economicEventsCount &&
            mergersAcquisitionsCount == other.mergersAcquisitionsCount &&
            stockSplitsCount == other.stockSplitsCount &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            date,
            dividendsCount,
            earningsCount,
            economicEventsCount,
            mergersAcquisitionsCount,
            stockSplitsCount,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CalendarDateSummary{date=$date, dividendsCount=$dividendsCount, earningsCount=$earningsCount, economicEventsCount=$economicEventsCount, mergersAcquisitionsCount=$mergersAcquisitionsCount, stockSplitsCount=$stockSplitsCount, additionalProperties=$additionalProperties}"
}
