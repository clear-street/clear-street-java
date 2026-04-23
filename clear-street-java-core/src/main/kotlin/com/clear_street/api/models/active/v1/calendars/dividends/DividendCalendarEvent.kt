// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.calendars.dividends

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

/** Represents a single dividend event */
class DividendCalendarEvent
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val adjustedDividend: JsonField<String>,
    private val date: JsonField<LocalDate>,
    private val dividend: JsonField<String>,
    private val symbol: JsonField<String>,
    private val declarationDate: JsonField<LocalDate>,
    private val frequency: JsonField<DividendFrequency>,
    private val paymentDate: JsonField<LocalDate>,
    private val recordDate: JsonField<LocalDate>,
    private val yield: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("adjusted_dividend")
        @ExcludeMissing
        adjustedDividend: JsonField<String> = JsonMissing.of(),
        @JsonProperty("date") @ExcludeMissing date: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("dividend") @ExcludeMissing dividend: JsonField<String> = JsonMissing.of(),
        @JsonProperty("symbol") @ExcludeMissing symbol: JsonField<String> = JsonMissing.of(),
        @JsonProperty("declaration_date")
        @ExcludeMissing
        declarationDate: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("frequency")
        @ExcludeMissing
        frequency: JsonField<DividendFrequency> = JsonMissing.of(),
        @JsonProperty("payment_date")
        @ExcludeMissing
        paymentDate: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("record_date")
        @ExcludeMissing
        recordDate: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("yield") @ExcludeMissing yield: JsonField<String> = JsonMissing.of(),
    ) : this(
        adjustedDividend,
        date,
        dividend,
        symbol,
        declarationDate,
        frequency,
        paymentDate,
        recordDate,
        yield,
        mutableMapOf(),
    )

    /**
     * The dividend amount adjusted for any stock splits
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun adjustedDividend(): String = adjustedDividend.getRequired("adjusted_dividend")

    /**
     * The ex-dividend date
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun date(): LocalDate = date.getRequired("date")

    /**
     * The dividend amount per share
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun dividend(): String = dividend.getRequired("dividend")

    /**
     * The symbol for the instrument
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun symbol(): String = symbol.getRequired("symbol")

    /**
     * The date the dividend was declared
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun declarationDate(): Optional<LocalDate> = declarationDate.getOptional("declaration_date")

    /**
     * The frequency of the dividend payment
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun frequency(): Optional<DividendFrequency> = frequency.getOptional("frequency")

    /**
     * The payment date for the dividend
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun paymentDate(): Optional<LocalDate> = paymentDate.getOptional("payment_date")

    /**
     * The record date for the dividend
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun recordDate(): Optional<LocalDate> = recordDate.getOptional("record_date")

    /**
     * The dividend yield as a percentage decimal
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun yield(): Optional<String> = yield.getOptional("yield")

    /**
     * Returns the raw JSON value of [adjustedDividend].
     *
     * Unlike [adjustedDividend], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("adjusted_dividend")
    @ExcludeMissing
    fun _adjustedDividend(): JsonField<String> = adjustedDividend

    /**
     * Returns the raw JSON value of [date].
     *
     * Unlike [date], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("date") @ExcludeMissing fun _date(): JsonField<LocalDate> = date

    /**
     * Returns the raw JSON value of [dividend].
     *
     * Unlike [dividend], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dividend") @ExcludeMissing fun _dividend(): JsonField<String> = dividend

    /**
     * Returns the raw JSON value of [symbol].
     *
     * Unlike [symbol], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("symbol") @ExcludeMissing fun _symbol(): JsonField<String> = symbol

    /**
     * Returns the raw JSON value of [declarationDate].
     *
     * Unlike [declarationDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("declaration_date")
    @ExcludeMissing
    fun _declarationDate(): JsonField<LocalDate> = declarationDate

    /**
     * Returns the raw JSON value of [frequency].
     *
     * Unlike [frequency], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("frequency")
    @ExcludeMissing
    fun _frequency(): JsonField<DividendFrequency> = frequency

    /**
     * Returns the raw JSON value of [paymentDate].
     *
     * Unlike [paymentDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("payment_date")
    @ExcludeMissing
    fun _paymentDate(): JsonField<LocalDate> = paymentDate

    /**
     * Returns the raw JSON value of [recordDate].
     *
     * Unlike [recordDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("record_date")
    @ExcludeMissing
    fun _recordDate(): JsonField<LocalDate> = recordDate

    /**
     * Returns the raw JSON value of [yield].
     *
     * Unlike [yield], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("yield") @ExcludeMissing fun _yield(): JsonField<String> = yield

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
         * Returns a mutable builder for constructing an instance of [DividendCalendarEvent].
         *
         * The following fields are required:
         * ```java
         * .adjustedDividend()
         * .date()
         * .dividend()
         * .symbol()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DividendCalendarEvent]. */
    class Builder internal constructor() {

        private var adjustedDividend: JsonField<String>? = null
        private var date: JsonField<LocalDate>? = null
        private var dividend: JsonField<String>? = null
        private var symbol: JsonField<String>? = null
        private var declarationDate: JsonField<LocalDate> = JsonMissing.of()
        private var frequency: JsonField<DividendFrequency> = JsonMissing.of()
        private var paymentDate: JsonField<LocalDate> = JsonMissing.of()
        private var recordDate: JsonField<LocalDate> = JsonMissing.of()
        private var yield: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(dividendCalendarEvent: DividendCalendarEvent) = apply {
            adjustedDividend = dividendCalendarEvent.adjustedDividend
            date = dividendCalendarEvent.date
            dividend = dividendCalendarEvent.dividend
            symbol = dividendCalendarEvent.symbol
            declarationDate = dividendCalendarEvent.declarationDate
            frequency = dividendCalendarEvent.frequency
            paymentDate = dividendCalendarEvent.paymentDate
            recordDate = dividendCalendarEvent.recordDate
            yield = dividendCalendarEvent.yield
            additionalProperties = dividendCalendarEvent.additionalProperties.toMutableMap()
        }

        /** The dividend amount adjusted for any stock splits */
        fun adjustedDividend(adjustedDividend: String) =
            adjustedDividend(JsonField.of(adjustedDividend))

        /**
         * Sets [Builder.adjustedDividend] to an arbitrary JSON value.
         *
         * You should usually call [Builder.adjustedDividend] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun adjustedDividend(adjustedDividend: JsonField<String>) = apply {
            this.adjustedDividend = adjustedDividend
        }

        /** The ex-dividend date */
        fun date(date: LocalDate) = date(JsonField.of(date))

        /**
         * Sets [Builder.date] to an arbitrary JSON value.
         *
         * You should usually call [Builder.date] with a well-typed [LocalDate] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun date(date: JsonField<LocalDate>) = apply { this.date = date }

        /** The dividend amount per share */
        fun dividend(dividend: String) = dividend(JsonField.of(dividend))

        /**
         * Sets [Builder.dividend] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dividend] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun dividend(dividend: JsonField<String>) = apply { this.dividend = dividend }

        /** The symbol for the instrument */
        fun symbol(symbol: String) = symbol(JsonField.of(symbol))

        /**
         * Sets [Builder.symbol] to an arbitrary JSON value.
         *
         * You should usually call [Builder.symbol] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun symbol(symbol: JsonField<String>) = apply { this.symbol = symbol }

        /** The date the dividend was declared */
        fun declarationDate(declarationDate: LocalDate?) =
            declarationDate(JsonField.ofNullable(declarationDate))

        /** Alias for calling [Builder.declarationDate] with `declarationDate.orElse(null)`. */
        fun declarationDate(declarationDate: Optional<LocalDate>) =
            declarationDate(declarationDate.getOrNull())

        /**
         * Sets [Builder.declarationDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.declarationDate] with a well-typed [LocalDate] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun declarationDate(declarationDate: JsonField<LocalDate>) = apply {
            this.declarationDate = declarationDate
        }

        /** The frequency of the dividend payment */
        fun frequency(frequency: DividendFrequency?) = frequency(JsonField.ofNullable(frequency))

        /** Alias for calling [Builder.frequency] with `frequency.orElse(null)`. */
        fun frequency(frequency: Optional<DividendFrequency>) = frequency(frequency.getOrNull())

        /**
         * Sets [Builder.frequency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.frequency] with a well-typed [DividendFrequency] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun frequency(frequency: JsonField<DividendFrequency>) = apply {
            this.frequency = frequency
        }

        /** The payment date for the dividend */
        fun paymentDate(paymentDate: LocalDate?) = paymentDate(JsonField.ofNullable(paymentDate))

        /** Alias for calling [Builder.paymentDate] with `paymentDate.orElse(null)`. */
        fun paymentDate(paymentDate: Optional<LocalDate>) = paymentDate(paymentDate.getOrNull())

        /**
         * Sets [Builder.paymentDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.paymentDate] with a well-typed [LocalDate] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun paymentDate(paymentDate: JsonField<LocalDate>) = apply {
            this.paymentDate = paymentDate
        }

        /** The record date for the dividend */
        fun recordDate(recordDate: LocalDate?) = recordDate(JsonField.ofNullable(recordDate))

        /** Alias for calling [Builder.recordDate] with `recordDate.orElse(null)`. */
        fun recordDate(recordDate: Optional<LocalDate>) = recordDate(recordDate.getOrNull())

        /**
         * Sets [Builder.recordDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recordDate] with a well-typed [LocalDate] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun recordDate(recordDate: JsonField<LocalDate>) = apply { this.recordDate = recordDate }

        /** The dividend yield as a percentage decimal */
        fun yield(yield: String?) = yield(JsonField.ofNullable(yield))

        /** Alias for calling [Builder.yield] with `yield.orElse(null)`. */
        fun yield(yield: Optional<String>) = yield(yield.getOrNull())

        /**
         * Sets [Builder.yield] to an arbitrary JSON value.
         *
         * You should usually call [Builder.yield] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun yield(yield: JsonField<String>) = apply { this.yield = yield }

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
         * Returns an immutable instance of [DividendCalendarEvent].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .adjustedDividend()
         * .date()
         * .dividend()
         * .symbol()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): DividendCalendarEvent =
            DividendCalendarEvent(
                checkRequired("adjustedDividend", adjustedDividend),
                checkRequired("date", date),
                checkRequired("dividend", dividend),
                checkRequired("symbol", symbol),
                declarationDate,
                frequency,
                paymentDate,
                recordDate,
                yield,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): DividendCalendarEvent = apply {
        if (validated) {
            return@apply
        }

        adjustedDividend()
        date()
        dividend()
        symbol()
        declarationDate()
        frequency().ifPresent { it.validate() }
        paymentDate()
        recordDate()
        yield()
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
        (if (adjustedDividend.asKnown().isPresent) 1 else 0) +
            (if (date.asKnown().isPresent) 1 else 0) +
            (if (dividend.asKnown().isPresent) 1 else 0) +
            (if (symbol.asKnown().isPresent) 1 else 0) +
            (if (declarationDate.asKnown().isPresent) 1 else 0) +
            (frequency.asKnown().getOrNull()?.validity() ?: 0) +
            (if (paymentDate.asKnown().isPresent) 1 else 0) +
            (if (recordDate.asKnown().isPresent) 1 else 0) +
            (if (yield.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DividendCalendarEvent &&
            adjustedDividend == other.adjustedDividend &&
            date == other.date &&
            dividend == other.dividend &&
            symbol == other.symbol &&
            declarationDate == other.declarationDate &&
            frequency == other.frequency &&
            paymentDate == other.paymentDate &&
            recordDate == other.recordDate &&
            yield == other.yield &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            adjustedDividend,
            date,
            dividend,
            symbol,
            declarationDate,
            frequency,
            paymentDate,
            recordDate,
            yield,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "DividendCalendarEvent{adjustedDividend=$adjustedDividend, date=$date, dividend=$dividend, symbol=$symbol, declarationDate=$declarationDate, frequency=$frequency, paymentDate=$paymentDate, recordDate=$recordDate, yield=$yield, additionalProperties=$additionalProperties}"
}
