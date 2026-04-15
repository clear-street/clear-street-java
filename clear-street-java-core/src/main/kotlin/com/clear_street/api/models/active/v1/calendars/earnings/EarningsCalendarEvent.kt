// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.calendars.earnings

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
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Represents a single earnings announcement event */
class EarningsCalendarEvent
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val date: JsonField<LocalDate>,
    private val lastUpdated: JsonField<LocalDate>,
    private val symbol: JsonField<String>,
    private val epsActual: JsonField<String>,
    private val epsEstimated: JsonField<String>,
    private val revenueActual: JsonField<String>,
    private val revenueEstimated: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("date") @ExcludeMissing date: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("last_updated")
        @ExcludeMissing
        lastUpdated: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("symbol") @ExcludeMissing symbol: JsonField<String> = JsonMissing.of(),
        @JsonProperty("eps_actual") @ExcludeMissing epsActual: JsonField<String> = JsonMissing.of(),
        @JsonProperty("eps_estimated")
        @ExcludeMissing
        epsEstimated: JsonField<String> = JsonMissing.of(),
        @JsonProperty("revenue_actual")
        @ExcludeMissing
        revenueActual: JsonField<String> = JsonMissing.of(),
        @JsonProperty("revenue_estimated")
        @ExcludeMissing
        revenueEstimated: JsonField<String> = JsonMissing.of(),
    ) : this(
        date,
        lastUpdated,
        symbol,
        epsActual,
        epsEstimated,
        revenueActual,
        revenueEstimated,
        mutableMapOf(),
    )

    /**
     * The date of the earnings announcement
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun date(): LocalDate = date.getRequired("date")

    /**
     * The date of the last update to this event
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun lastUpdated(): LocalDate = lastUpdated.getRequired("last_updated")

    /**
     * The symbol for the instrument
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun symbol(): String = symbol.getRequired("symbol")

    /**
     * The actual reported earnings per share
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun epsActual(): Optional<String> = epsActual.getOptional("eps_actual")

    /**
     * The consensus estimated earnings per share
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun epsEstimated(): Optional<String> = epsEstimated.getOptional("eps_estimated")

    /**
     * The actual reported revenue
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun revenueActual(): Optional<String> = revenueActual.getOptional("revenue_actual")

    /**
     * The consensus estimated revenue
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun revenueEstimated(): Optional<String> = revenueEstimated.getOptional("revenue_estimated")

    /**
     * Returns the raw JSON value of [date].
     *
     * Unlike [date], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("date") @ExcludeMissing fun _date(): JsonField<LocalDate> = date

    /**
     * Returns the raw JSON value of [lastUpdated].
     *
     * Unlike [lastUpdated], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("last_updated")
    @ExcludeMissing
    fun _lastUpdated(): JsonField<LocalDate> = lastUpdated

    /**
     * Returns the raw JSON value of [symbol].
     *
     * Unlike [symbol], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("symbol") @ExcludeMissing fun _symbol(): JsonField<String> = symbol

    /**
     * Returns the raw JSON value of [epsActual].
     *
     * Unlike [epsActual], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("eps_actual") @ExcludeMissing fun _epsActual(): JsonField<String> = epsActual

    /**
     * Returns the raw JSON value of [epsEstimated].
     *
     * Unlike [epsEstimated], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("eps_estimated")
    @ExcludeMissing
    fun _epsEstimated(): JsonField<String> = epsEstimated

    /**
     * Returns the raw JSON value of [revenueActual].
     *
     * Unlike [revenueActual], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("revenue_actual")
    @ExcludeMissing
    fun _revenueActual(): JsonField<String> = revenueActual

    /**
     * Returns the raw JSON value of [revenueEstimated].
     *
     * Unlike [revenueEstimated], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("revenue_estimated")
    @ExcludeMissing
    fun _revenueEstimated(): JsonField<String> = revenueEstimated

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
         * Returns a mutable builder for constructing an instance of [EarningsCalendarEvent].
         *
         * The following fields are required:
         * ```java
         * .date()
         * .lastUpdated()
         * .symbol()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [EarningsCalendarEvent]. */
    class Builder internal constructor() {

        private var date: JsonField<LocalDate>? = null
        private var lastUpdated: JsonField<LocalDate>? = null
        private var symbol: JsonField<String>? = null
        private var epsActual: JsonField<String> = JsonMissing.of()
        private var epsEstimated: JsonField<String> = JsonMissing.of()
        private var revenueActual: JsonField<String> = JsonMissing.of()
        private var revenueEstimated: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(earningsCalendarEvent: EarningsCalendarEvent) = apply {
            date = earningsCalendarEvent.date
            lastUpdated = earningsCalendarEvent.lastUpdated
            symbol = earningsCalendarEvent.symbol
            epsActual = earningsCalendarEvent.epsActual
            epsEstimated = earningsCalendarEvent.epsEstimated
            revenueActual = earningsCalendarEvent.revenueActual
            revenueEstimated = earningsCalendarEvent.revenueEstimated
            additionalProperties = earningsCalendarEvent.additionalProperties.toMutableMap()
        }

        /** The date of the earnings announcement */
        fun date(date: LocalDate) = date(JsonField.of(date))

        /**
         * Sets [Builder.date] to an arbitrary JSON value.
         *
         * You should usually call [Builder.date] with a well-typed [LocalDate] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun date(date: JsonField<LocalDate>) = apply { this.date = date }

        /** The date of the last update to this event */
        fun lastUpdated(lastUpdated: LocalDate) = lastUpdated(JsonField.of(lastUpdated))

        /**
         * Sets [Builder.lastUpdated] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lastUpdated] with a well-typed [LocalDate] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun lastUpdated(lastUpdated: JsonField<LocalDate>) = apply {
            this.lastUpdated = lastUpdated
        }

        /** The symbol for the instrument */
        fun symbol(symbol: String) = symbol(JsonField.of(symbol))

        /**
         * Sets [Builder.symbol] to an arbitrary JSON value.
         *
         * You should usually call [Builder.symbol] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun symbol(symbol: JsonField<String>) = apply { this.symbol = symbol }

        /** The actual reported earnings per share */
        fun epsActual(epsActual: String?) = epsActual(JsonField.ofNullable(epsActual))

        /** Alias for calling [Builder.epsActual] with `epsActual.orElse(null)`. */
        fun epsActual(epsActual: Optional<String>) = epsActual(epsActual.getOrNull())

        /**
         * Sets [Builder.epsActual] to an arbitrary JSON value.
         *
         * You should usually call [Builder.epsActual] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun epsActual(epsActual: JsonField<String>) = apply { this.epsActual = epsActual }

        /** The consensus estimated earnings per share */
        fun epsEstimated(epsEstimated: String?) = epsEstimated(JsonField.ofNullable(epsEstimated))

        /** Alias for calling [Builder.epsEstimated] with `epsEstimated.orElse(null)`. */
        fun epsEstimated(epsEstimated: Optional<String>) = epsEstimated(epsEstimated.getOrNull())

        /**
         * Sets [Builder.epsEstimated] to an arbitrary JSON value.
         *
         * You should usually call [Builder.epsEstimated] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun epsEstimated(epsEstimated: JsonField<String>) = apply {
            this.epsEstimated = epsEstimated
        }

        /** The actual reported revenue */
        fun revenueActual(revenueActual: String?) =
            revenueActual(JsonField.ofNullable(revenueActual))

        /** Alias for calling [Builder.revenueActual] with `revenueActual.orElse(null)`. */
        fun revenueActual(revenueActual: Optional<String>) =
            revenueActual(revenueActual.getOrNull())

        /**
         * Sets [Builder.revenueActual] to an arbitrary JSON value.
         *
         * You should usually call [Builder.revenueActual] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun revenueActual(revenueActual: JsonField<String>) = apply {
            this.revenueActual = revenueActual
        }

        /** The consensus estimated revenue */
        fun revenueEstimated(revenueEstimated: String?) =
            revenueEstimated(JsonField.ofNullable(revenueEstimated))

        /** Alias for calling [Builder.revenueEstimated] with `revenueEstimated.orElse(null)`. */
        fun revenueEstimated(revenueEstimated: Optional<String>) =
            revenueEstimated(revenueEstimated.getOrNull())

        /**
         * Sets [Builder.revenueEstimated] to an arbitrary JSON value.
         *
         * You should usually call [Builder.revenueEstimated] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun revenueEstimated(revenueEstimated: JsonField<String>) = apply {
            this.revenueEstimated = revenueEstimated
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
         * Returns an immutable instance of [EarningsCalendarEvent].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .date()
         * .lastUpdated()
         * .symbol()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): EarningsCalendarEvent =
            EarningsCalendarEvent(
                checkRequired("date", date),
                checkRequired("lastUpdated", lastUpdated),
                checkRequired("symbol", symbol),
                epsActual,
                epsEstimated,
                revenueActual,
                revenueEstimated,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): EarningsCalendarEvent = apply {
        if (validated) {
            return@apply
        }

        date()
        lastUpdated()
        symbol()
        epsActual()
        epsEstimated()
        revenueActual()
        revenueEstimated()
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
            (if (lastUpdated.asKnown().isPresent) 1 else 0) +
            (if (symbol.asKnown().isPresent) 1 else 0) +
            (if (epsActual.asKnown().isPresent) 1 else 0) +
            (if (epsEstimated.asKnown().isPresent) 1 else 0) +
            (if (revenueActual.asKnown().isPresent) 1 else 0) +
            (if (revenueEstimated.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EarningsCalendarEvent &&
            date == other.date &&
            lastUpdated == other.lastUpdated &&
            symbol == other.symbol &&
            epsActual == other.epsActual &&
            epsEstimated == other.epsEstimated &&
            revenueActual == other.revenueActual &&
            revenueEstimated == other.revenueEstimated &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            date,
            lastUpdated,
            symbol,
            epsActual,
            epsEstimated,
            revenueActual,
            revenueEstimated,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "EarningsCalendarEvent{date=$date, lastUpdated=$lastUpdated, symbol=$symbol, epsActual=$epsActual, epsEstimated=$epsEstimated, revenueActual=$revenueActual, revenueEstimated=$revenueEstimated, additionalProperties=$additionalProperties}"
}
