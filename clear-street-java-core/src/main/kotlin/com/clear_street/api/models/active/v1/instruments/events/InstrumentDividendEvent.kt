// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.instruments.events

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

/** Represents a dividend event for an instrument */
class InstrumentDividendEvent
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val adjustedDividendAmount: JsonField<String>,
    private val exDate: JsonField<LocalDate>,
    private val declarationDate: JsonField<LocalDate>,
    private val dividendAmount: JsonField<String>,
    private val dividendYield: JsonField<String>,
    private val frequency: JsonField<String>,
    private val paymentDate: JsonField<LocalDate>,
    private val recordDate: JsonField<LocalDate>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("adjusted_dividend_amount")
        @ExcludeMissing
        adjustedDividendAmount: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ex_date") @ExcludeMissing exDate: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("declaration_date")
        @ExcludeMissing
        declarationDate: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("dividend_amount")
        @ExcludeMissing
        dividendAmount: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dividend_yield")
        @ExcludeMissing
        dividendYield: JsonField<String> = JsonMissing.of(),
        @JsonProperty("frequency") @ExcludeMissing frequency: JsonField<String> = JsonMissing.of(),
        @JsonProperty("payment_date")
        @ExcludeMissing
        paymentDate: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("record_date")
        @ExcludeMissing
        recordDate: JsonField<LocalDate> = JsonMissing.of(),
    ) : this(
        adjustedDividendAmount,
        exDate,
        declarationDate,
        dividendAmount,
        dividendYield,
        frequency,
        paymentDate,
        recordDate,
        mutableMapOf(),
    )

    /**
     * The adjusted dividend amount accounting for any splits.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun adjustedDividendAmount(): String =
        adjustedDividendAmount.getRequired("adjusted_dividend_amount")

    /**
     * The day the stock starts trading without the right to receive that dividend.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun exDate(): LocalDate = exDate.getRequired("ex_date")

    /**
     * The declaration date of the dividend
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun declarationDate(): Optional<LocalDate> = declarationDate.getOptional("declaration_date")

    /**
     * The dividend amount per share.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dividendAmount(): Optional<String> = dividendAmount.getOptional("dividend_amount")

    /**
     * The dividend yield as a percentage of the stock price.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dividendYield(): Optional<String> = dividendYield.getOptional("dividend_yield")

    /**
     * The frequency of the dividend payments (e.g., "Quarterly", "Annual").
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun frequency(): Optional<String> = frequency.getOptional("frequency")

    /**
     * The payment date is the date on which a declared stock dividend is scheduled to be paid.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun paymentDate(): Optional<LocalDate> = paymentDate.getOptional("payment_date")

    /**
     * The record date, set by a company's board of directors, is when a company compiles a list of
     * shareholders of the stock for which it has declared a dividend.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun recordDate(): Optional<LocalDate> = recordDate.getOptional("record_date")

    /**
     * Returns the raw JSON value of [adjustedDividendAmount].
     *
     * Unlike [adjustedDividendAmount], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("adjusted_dividend_amount")
    @ExcludeMissing
    fun _adjustedDividendAmount(): JsonField<String> = adjustedDividendAmount

    /**
     * Returns the raw JSON value of [exDate].
     *
     * Unlike [exDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ex_date") @ExcludeMissing fun _exDate(): JsonField<LocalDate> = exDate

    /**
     * Returns the raw JSON value of [declarationDate].
     *
     * Unlike [declarationDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("declaration_date")
    @ExcludeMissing
    fun _declarationDate(): JsonField<LocalDate> = declarationDate

    /**
     * Returns the raw JSON value of [dividendAmount].
     *
     * Unlike [dividendAmount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dividend_amount")
    @ExcludeMissing
    fun _dividendAmount(): JsonField<String> = dividendAmount

    /**
     * Returns the raw JSON value of [dividendYield].
     *
     * Unlike [dividendYield], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dividend_yield")
    @ExcludeMissing
    fun _dividendYield(): JsonField<String> = dividendYield

    /**
     * Returns the raw JSON value of [frequency].
     *
     * Unlike [frequency], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("frequency") @ExcludeMissing fun _frequency(): JsonField<String> = frequency

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
         * Returns a mutable builder for constructing an instance of [InstrumentDividendEvent].
         *
         * The following fields are required:
         * ```java
         * .adjustedDividendAmount()
         * .exDate()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [InstrumentDividendEvent]. */
    class Builder internal constructor() {

        private var adjustedDividendAmount: JsonField<String>? = null
        private var exDate: JsonField<LocalDate>? = null
        private var declarationDate: JsonField<LocalDate> = JsonMissing.of()
        private var dividendAmount: JsonField<String> = JsonMissing.of()
        private var dividendYield: JsonField<String> = JsonMissing.of()
        private var frequency: JsonField<String> = JsonMissing.of()
        private var paymentDate: JsonField<LocalDate> = JsonMissing.of()
        private var recordDate: JsonField<LocalDate> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(instrumentDividendEvent: InstrumentDividendEvent) = apply {
            adjustedDividendAmount = instrumentDividendEvent.adjustedDividendAmount
            exDate = instrumentDividendEvent.exDate
            declarationDate = instrumentDividendEvent.declarationDate
            dividendAmount = instrumentDividendEvent.dividendAmount
            dividendYield = instrumentDividendEvent.dividendYield
            frequency = instrumentDividendEvent.frequency
            paymentDate = instrumentDividendEvent.paymentDate
            recordDate = instrumentDividendEvent.recordDate
            additionalProperties = instrumentDividendEvent.additionalProperties.toMutableMap()
        }

        /** The adjusted dividend amount accounting for any splits. */
        fun adjustedDividendAmount(adjustedDividendAmount: String) =
            adjustedDividendAmount(JsonField.of(adjustedDividendAmount))

        /**
         * Sets [Builder.adjustedDividendAmount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.adjustedDividendAmount] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun adjustedDividendAmount(adjustedDividendAmount: JsonField<String>) = apply {
            this.adjustedDividendAmount = adjustedDividendAmount
        }

        /** The day the stock starts trading without the right to receive that dividend. */
        fun exDate(exDate: LocalDate) = exDate(JsonField.of(exDate))

        /**
         * Sets [Builder.exDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.exDate] with a well-typed [LocalDate] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun exDate(exDate: JsonField<LocalDate>) = apply { this.exDate = exDate }

        /** The declaration date of the dividend */
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

        /** The dividend amount per share. */
        fun dividendAmount(dividendAmount: String?) =
            dividendAmount(JsonField.ofNullable(dividendAmount))

        /** Alias for calling [Builder.dividendAmount] with `dividendAmount.orElse(null)`. */
        fun dividendAmount(dividendAmount: Optional<String>) =
            dividendAmount(dividendAmount.getOrNull())

        /**
         * Sets [Builder.dividendAmount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dividendAmount] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun dividendAmount(dividendAmount: JsonField<String>) = apply {
            this.dividendAmount = dividendAmount
        }

        /** The dividend yield as a percentage of the stock price. */
        fun dividendYield(dividendYield: String?) =
            dividendYield(JsonField.ofNullable(dividendYield))

        /** Alias for calling [Builder.dividendYield] with `dividendYield.orElse(null)`. */
        fun dividendYield(dividendYield: Optional<String>) =
            dividendYield(dividendYield.getOrNull())

        /**
         * Sets [Builder.dividendYield] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dividendYield] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun dividendYield(dividendYield: JsonField<String>) = apply {
            this.dividendYield = dividendYield
        }

        /** The frequency of the dividend payments (e.g., "Quarterly", "Annual"). */
        fun frequency(frequency: String?) = frequency(JsonField.ofNullable(frequency))

        /** Alias for calling [Builder.frequency] with `frequency.orElse(null)`. */
        fun frequency(frequency: Optional<String>) = frequency(frequency.getOrNull())

        /**
         * Sets [Builder.frequency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.frequency] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun frequency(frequency: JsonField<String>) = apply { this.frequency = frequency }

        /**
         * The payment date is the date on which a declared stock dividend is scheduled to be paid.
         */
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

        /**
         * The record date, set by a company's board of directors, is when a company compiles a list
         * of shareholders of the stock for which it has declared a dividend.
         */
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
         * Returns an immutable instance of [InstrumentDividendEvent].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .adjustedDividendAmount()
         * .exDate()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): InstrumentDividendEvent =
            InstrumentDividendEvent(
                checkRequired("adjustedDividendAmount", adjustedDividendAmount),
                checkRequired("exDate", exDate),
                declarationDate,
                dividendAmount,
                dividendYield,
                frequency,
                paymentDate,
                recordDate,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): InstrumentDividendEvent = apply {
        if (validated) {
            return@apply
        }

        adjustedDividendAmount()
        exDate()
        declarationDate()
        dividendAmount()
        dividendYield()
        frequency()
        paymentDate()
        recordDate()
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
        (if (adjustedDividendAmount.asKnown().isPresent) 1 else 0) +
            (if (exDate.asKnown().isPresent) 1 else 0) +
            (if (declarationDate.asKnown().isPresent) 1 else 0) +
            (if (dividendAmount.asKnown().isPresent) 1 else 0) +
            (if (dividendYield.asKnown().isPresent) 1 else 0) +
            (if (frequency.asKnown().isPresent) 1 else 0) +
            (if (paymentDate.asKnown().isPresent) 1 else 0) +
            (if (recordDate.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InstrumentDividendEvent &&
            adjustedDividendAmount == other.adjustedDividendAmount &&
            exDate == other.exDate &&
            declarationDate == other.declarationDate &&
            dividendAmount == other.dividendAmount &&
            dividendYield == other.dividendYield &&
            frequency == other.frequency &&
            paymentDate == other.paymentDate &&
            recordDate == other.recordDate &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            adjustedDividendAmount,
            exDate,
            declarationDate,
            dividendAmount,
            dividendYield,
            frequency,
            paymentDate,
            recordDate,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "InstrumentDividendEvent{adjustedDividendAmount=$adjustedDividendAmount, exDate=$exDate, declarationDate=$declarationDate, dividendAmount=$dividendAmount, dividendYield=$dividendYield, frequency=$frequency, paymentDate=$paymentDate, recordDate=$recordDate, additionalProperties=$additionalProperties}"
}
