// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.calendars.splits

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

/** Represents a stock split event */
class StockSplitEvent
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val date: JsonField<LocalDate>,
    private val denominator: JsonField<Long>,
    private val numerator: JsonField<Long>,
    private val symbol: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("date") @ExcludeMissing date: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("denominator")
        @ExcludeMissing
        denominator: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("numerator") @ExcludeMissing numerator: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("symbol") @ExcludeMissing symbol: JsonField<String> = JsonMissing.of(),
    ) : this(date, denominator, numerator, symbol, mutableMapOf())

    /**
     * The date the split will occur
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun date(): LocalDate = date.getRequired("date")

    /**
     * The pre-split number of shares
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun denominator(): Long = denominator.getRequired("denominator")

    /**
     * The post-split number of shares for every 'denominator' pre-split shares
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun numerator(): Long = numerator.getRequired("numerator")

    /**
     * The symbol for the instrument
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun symbol(): String = symbol.getRequired("symbol")

    /**
     * Returns the raw JSON value of [date].
     *
     * Unlike [date], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("date") @ExcludeMissing fun _date(): JsonField<LocalDate> = date

    /**
     * Returns the raw JSON value of [denominator].
     *
     * Unlike [denominator], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("denominator") @ExcludeMissing fun _denominator(): JsonField<Long> = denominator

    /**
     * Returns the raw JSON value of [numerator].
     *
     * Unlike [numerator], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("numerator") @ExcludeMissing fun _numerator(): JsonField<Long> = numerator

    /**
     * Returns the raw JSON value of [symbol].
     *
     * Unlike [symbol], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("symbol") @ExcludeMissing fun _symbol(): JsonField<String> = symbol

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
         * Returns a mutable builder for constructing an instance of [StockSplitEvent].
         *
         * The following fields are required:
         * ```java
         * .date()
         * .denominator()
         * .numerator()
         * .symbol()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [StockSplitEvent]. */
    class Builder internal constructor() {

        private var date: JsonField<LocalDate>? = null
        private var denominator: JsonField<Long>? = null
        private var numerator: JsonField<Long>? = null
        private var symbol: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(stockSplitEvent: StockSplitEvent) = apply {
            date = stockSplitEvent.date
            denominator = stockSplitEvent.denominator
            numerator = stockSplitEvent.numerator
            symbol = stockSplitEvent.symbol
            additionalProperties = stockSplitEvent.additionalProperties.toMutableMap()
        }

        /** The date the split will occur */
        fun date(date: LocalDate) = date(JsonField.of(date))

        /**
         * Sets [Builder.date] to an arbitrary JSON value.
         *
         * You should usually call [Builder.date] with a well-typed [LocalDate] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun date(date: JsonField<LocalDate>) = apply { this.date = date }

        /** The pre-split number of shares */
        fun denominator(denominator: Long) = denominator(JsonField.of(denominator))

        /**
         * Sets [Builder.denominator] to an arbitrary JSON value.
         *
         * You should usually call [Builder.denominator] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun denominator(denominator: JsonField<Long>) = apply { this.denominator = denominator }

        /** The post-split number of shares for every 'denominator' pre-split shares */
        fun numerator(numerator: Long) = numerator(JsonField.of(numerator))

        /**
         * Sets [Builder.numerator] to an arbitrary JSON value.
         *
         * You should usually call [Builder.numerator] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun numerator(numerator: JsonField<Long>) = apply { this.numerator = numerator }

        /** The symbol for the instrument */
        fun symbol(symbol: String) = symbol(JsonField.of(symbol))

        /**
         * Sets [Builder.symbol] to an arbitrary JSON value.
         *
         * You should usually call [Builder.symbol] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun symbol(symbol: JsonField<String>) = apply { this.symbol = symbol }

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
         * Returns an immutable instance of [StockSplitEvent].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .date()
         * .denominator()
         * .numerator()
         * .symbol()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): StockSplitEvent =
            StockSplitEvent(
                checkRequired("date", date),
                checkRequired("denominator", denominator),
                checkRequired("numerator", numerator),
                checkRequired("symbol", symbol),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): StockSplitEvent = apply {
        if (validated) {
            return@apply
        }

        date()
        denominator()
        numerator()
        symbol()
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
            (if (denominator.asKnown().isPresent) 1 else 0) +
            (if (numerator.asKnown().isPresent) 1 else 0) +
            (if (symbol.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is StockSplitEvent &&
            date == other.date &&
            denominator == other.denominator &&
            numerator == other.numerator &&
            symbol == other.symbol &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(date, denominator, numerator, symbol, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "StockSplitEvent{date=$date, denominator=$denominator, numerator=$numerator, symbol=$symbol, additionalProperties=$additionalProperties}"
}
