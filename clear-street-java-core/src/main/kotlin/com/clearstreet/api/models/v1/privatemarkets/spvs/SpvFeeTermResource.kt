// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.privatemarkets.spvs

import com.clearstreet.api.core.ExcludeMissing
import com.clearstreet.api.core.JsonField
import com.clearstreet.api.core.JsonMissing
import com.clearstreet.api.core.JsonValue
import com.clearstreet.api.core.checkRequired
import com.clearstreet.api.errors.ClearStreetInvalidDataException
import com.clearstreet.api.models.v1.privatemarkets.offerings.Currency
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** One typed SPV fee term. */
class SpvFeeTermResource
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val chargedBy: JsonField<ChargedBy>,
    private val currency: JsonField<Currency>,
    private val description: JsonField<String>,
    private val feeType: JsonField<FeeType>,
    private val frequency: JsonField<FeeFrequency>,
    private val amount: JsonField<String>,
    private val durationYears: JsonField<String>,
    private val hurdleRate: JsonField<String>,
    private val rate: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("charged_by")
        @ExcludeMissing
        chargedBy: JsonField<ChargedBy> = JsonMissing.of(),
        @JsonProperty("currency") @ExcludeMissing currency: JsonField<Currency> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("fee_type") @ExcludeMissing feeType: JsonField<FeeType> = JsonMissing.of(),
        @JsonProperty("frequency")
        @ExcludeMissing
        frequency: JsonField<FeeFrequency> = JsonMissing.of(),
        @JsonProperty("amount") @ExcludeMissing amount: JsonField<String> = JsonMissing.of(),
        @JsonProperty("duration_years")
        @ExcludeMissing
        durationYears: JsonField<String> = JsonMissing.of(),
        @JsonProperty("hurdle_rate")
        @ExcludeMissing
        hurdleRate: JsonField<String> = JsonMissing.of(),
        @JsonProperty("rate") @ExcludeMissing rate: JsonField<String> = JsonMissing.of(),
    ) : this(
        chargedBy,
        currency,
        description,
        feeType,
        frequency,
        amount,
        durationYears,
        hurdleRate,
        rate,
        mutableMapOf(),
    )

    /**
     * Charging party.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun chargedBy(): ChargedBy = chargedBy.getRequired("charged_by")

    /**
     * Terms currency.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun currency(): Currency = currency.getRequired("currency")

    /**
     * Plain-text fee disclosure.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun description(): String = description.getRequired("description")

    /**
     * Fee kind.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun feeType(): FeeType = feeType.getRequired("fee_type")

    /**
     * Timing/cadence.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun frequency(): FeeFrequency = frequency.getRequired("frequency")

    /**
     * Exact fixed amount, when amount-based.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun amount(): Optional<String> = amount.getOptional("amount")

    /**
     * Charge duration in years, when specified.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun durationYears(): Optional<String> = durationYears.getOptional("duration_years")

    /**
     * Carry hurdle as a decimal fraction, when specified.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun hurdleRate(): Optional<String> = hurdleRate.getOptional("hurdle_rate")

    /**
     * Decimal fraction between zero and one, when percentage-based.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun rate(): Optional<String> = rate.getOptional("rate")

    /**
     * Returns the raw JSON value of [chargedBy].
     *
     * Unlike [chargedBy], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("charged_by") @ExcludeMissing fun _chargedBy(): JsonField<ChargedBy> = chargedBy

    /**
     * Returns the raw JSON value of [currency].
     *
     * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<Currency> = currency

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Returns the raw JSON value of [feeType].
     *
     * Unlike [feeType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("fee_type") @ExcludeMissing fun _feeType(): JsonField<FeeType> = feeType

    /**
     * Returns the raw JSON value of [frequency].
     *
     * Unlike [frequency], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("frequency") @ExcludeMissing fun _frequency(): JsonField<FeeFrequency> = frequency

    /**
     * Returns the raw JSON value of [amount].
     *
     * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<String> = amount

    /**
     * Returns the raw JSON value of [durationYears].
     *
     * Unlike [durationYears], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("duration_years")
    @ExcludeMissing
    fun _durationYears(): JsonField<String> = durationYears

    /**
     * Returns the raw JSON value of [hurdleRate].
     *
     * Unlike [hurdleRate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("hurdle_rate") @ExcludeMissing fun _hurdleRate(): JsonField<String> = hurdleRate

    /**
     * Returns the raw JSON value of [rate].
     *
     * Unlike [rate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rate") @ExcludeMissing fun _rate(): JsonField<String> = rate

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
         * Returns a mutable builder for constructing an instance of [SpvFeeTermResource].
         *
         * The following fields are required:
         * ```java
         * .chargedBy()
         * .currency()
         * .description()
         * .feeType()
         * .frequency()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SpvFeeTermResource]. */
    class Builder internal constructor() {

        private var chargedBy: JsonField<ChargedBy>? = null
        private var currency: JsonField<Currency>? = null
        private var description: JsonField<String>? = null
        private var feeType: JsonField<FeeType>? = null
        private var frequency: JsonField<FeeFrequency>? = null
        private var amount: JsonField<String> = JsonMissing.of()
        private var durationYears: JsonField<String> = JsonMissing.of()
        private var hurdleRate: JsonField<String> = JsonMissing.of()
        private var rate: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(spvFeeTermResource: SpvFeeTermResource) = apply {
            chargedBy = spvFeeTermResource.chargedBy
            currency = spvFeeTermResource.currency
            description = spvFeeTermResource.description
            feeType = spvFeeTermResource.feeType
            frequency = spvFeeTermResource.frequency
            amount = spvFeeTermResource.amount
            durationYears = spvFeeTermResource.durationYears
            hurdleRate = spvFeeTermResource.hurdleRate
            rate = spvFeeTermResource.rate
            additionalProperties = spvFeeTermResource.additionalProperties.toMutableMap()
        }

        /** Charging party. */
        fun chargedBy(chargedBy: ChargedBy) = chargedBy(JsonField.of(chargedBy))

        /**
         * Sets [Builder.chargedBy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.chargedBy] with a well-typed [ChargedBy] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun chargedBy(chargedBy: JsonField<ChargedBy>) = apply { this.chargedBy = chargedBy }

        /** Terms currency. */
        fun currency(currency: Currency) = currency(JsonField.of(currency))

        /**
         * Sets [Builder.currency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currency] with a well-typed [Currency] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

        /** Plain-text fee disclosure. */
        fun description(description: String) = description(JsonField.of(description))

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

        /** Fee kind. */
        fun feeType(feeType: FeeType) = feeType(JsonField.of(feeType))

        /**
         * Sets [Builder.feeType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.feeType] with a well-typed [FeeType] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun feeType(feeType: JsonField<FeeType>) = apply { this.feeType = feeType }

        /** Timing/cadence. */
        fun frequency(frequency: FeeFrequency) = frequency(JsonField.of(frequency))

        /**
         * Sets [Builder.frequency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.frequency] with a well-typed [FeeFrequency] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun frequency(frequency: JsonField<FeeFrequency>) = apply { this.frequency = frequency }

        /** Exact fixed amount, when amount-based. */
        fun amount(amount: String?) = amount(JsonField.ofNullable(amount))

        /** Alias for calling [Builder.amount] with `amount.orElse(null)`. */
        fun amount(amount: Optional<String>) = amount(amount.getOrNull())

        /**
         * Sets [Builder.amount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amount] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun amount(amount: JsonField<String>) = apply { this.amount = amount }

        /** Charge duration in years, when specified. */
        fun durationYears(durationYears: String?) =
            durationYears(JsonField.ofNullable(durationYears))

        /** Alias for calling [Builder.durationYears] with `durationYears.orElse(null)`. */
        fun durationYears(durationYears: Optional<String>) =
            durationYears(durationYears.getOrNull())

        /**
         * Sets [Builder.durationYears] to an arbitrary JSON value.
         *
         * You should usually call [Builder.durationYears] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun durationYears(durationYears: JsonField<String>) = apply {
            this.durationYears = durationYears
        }

        /** Carry hurdle as a decimal fraction, when specified. */
        fun hurdleRate(hurdleRate: String?) = hurdleRate(JsonField.ofNullable(hurdleRate))

        /** Alias for calling [Builder.hurdleRate] with `hurdleRate.orElse(null)`. */
        fun hurdleRate(hurdleRate: Optional<String>) = hurdleRate(hurdleRate.getOrNull())

        /**
         * Sets [Builder.hurdleRate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hurdleRate] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun hurdleRate(hurdleRate: JsonField<String>) = apply { this.hurdleRate = hurdleRate }

        /** Decimal fraction between zero and one, when percentage-based. */
        fun rate(rate: String?) = rate(JsonField.ofNullable(rate))

        /** Alias for calling [Builder.rate] with `rate.orElse(null)`. */
        fun rate(rate: Optional<String>) = rate(rate.getOrNull())

        /**
         * Sets [Builder.rate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rate] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun rate(rate: JsonField<String>) = apply { this.rate = rate }

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
         * Returns an immutable instance of [SpvFeeTermResource].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .chargedBy()
         * .currency()
         * .description()
         * .feeType()
         * .frequency()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SpvFeeTermResource =
            SpvFeeTermResource(
                checkRequired("chargedBy", chargedBy),
                checkRequired("currency", currency),
                checkRequired("description", description),
                checkRequired("feeType", feeType),
                checkRequired("frequency", frequency),
                amount,
                durationYears,
                hurdleRate,
                rate,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws ClearStreetInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): SpvFeeTermResource = apply {
        if (validated) {
            return@apply
        }

        chargedBy().validate()
        currency().validate()
        description()
        feeType().validate()
        frequency().validate()
        amount()
        durationYears()
        hurdleRate()
        rate()
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
        (chargedBy.asKnown().getOrNull()?.validity() ?: 0) +
            (currency.asKnown().getOrNull()?.validity() ?: 0) +
            (if (description.asKnown().isPresent) 1 else 0) +
            (feeType.asKnown().getOrNull()?.validity() ?: 0) +
            (frequency.asKnown().getOrNull()?.validity() ?: 0) +
            (if (amount.asKnown().isPresent) 1 else 0) +
            (if (durationYears.asKnown().isPresent) 1 else 0) +
            (if (hurdleRate.asKnown().isPresent) 1 else 0) +
            (if (rate.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SpvFeeTermResource &&
            chargedBy == other.chargedBy &&
            currency == other.currency &&
            description == other.description &&
            feeType == other.feeType &&
            frequency == other.frequency &&
            amount == other.amount &&
            durationYears == other.durationYears &&
            hurdleRate == other.hurdleRate &&
            rate == other.rate &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            chargedBy,
            currency,
            description,
            feeType,
            frequency,
            amount,
            durationYears,
            hurdleRate,
            rate,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SpvFeeTermResource{chargedBy=$chargedBy, currency=$currency, description=$description, feeType=$feeType, frequency=$frequency, amount=$amount, durationYears=$durationYears, hurdleRate=$hurdleRate, rate=$rate, additionalProperties=$additionalProperties}"
}
