// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.instrumentdata

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
import java.util.Collections
import java.util.Objects

/** Analyst price target statistics */
class PriceTarget
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val average: JsonField<String>,
    private val currency: JsonField<String>,
    private val high: JsonField<String>,
    private val low: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("average") @ExcludeMissing average: JsonField<String> = JsonMissing.of(),
        @JsonProperty("currency") @ExcludeMissing currency: JsonField<String> = JsonMissing.of(),
        @JsonProperty("high") @ExcludeMissing high: JsonField<String> = JsonMissing.of(),
        @JsonProperty("low") @ExcludeMissing low: JsonField<String> = JsonMissing.of(),
    ) : this(average, currency, high, low, mutableMapOf())

    /**
     * Average analyst price target
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun average(): String = average.getRequired("average")

    /**
     * ISO 4217 currency code of the price targets
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun currency(): String = currency.getRequired("currency")

    /**
     * Highest analyst price target
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun high(): String = high.getRequired("high")

    /**
     * Lowest analyst price target
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun low(): String = low.getRequired("low")

    /**
     * Returns the raw JSON value of [average].
     *
     * Unlike [average], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("average") @ExcludeMissing fun _average(): JsonField<String> = average

    /**
     * Returns the raw JSON value of [currency].
     *
     * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

    /**
     * Returns the raw JSON value of [high].
     *
     * Unlike [high], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("high") @ExcludeMissing fun _high(): JsonField<String> = high

    /**
     * Returns the raw JSON value of [low].
     *
     * Unlike [low], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("low") @ExcludeMissing fun _low(): JsonField<String> = low

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
         * Returns a mutable builder for constructing an instance of [PriceTarget].
         *
         * The following fields are required:
         * ```java
         * .average()
         * .currency()
         * .high()
         * .low()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PriceTarget]. */
    class Builder internal constructor() {

        private var average: JsonField<String>? = null
        private var currency: JsonField<String>? = null
        private var high: JsonField<String>? = null
        private var low: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(priceTarget: PriceTarget) = apply {
            average = priceTarget.average
            currency = priceTarget.currency
            high = priceTarget.high
            low = priceTarget.low
            additionalProperties = priceTarget.additionalProperties.toMutableMap()
        }

        /** Average analyst price target */
        fun average(average: String) = average(JsonField.of(average))

        /**
         * Sets [Builder.average] to an arbitrary JSON value.
         *
         * You should usually call [Builder.average] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun average(average: JsonField<String>) = apply { this.average = average }

        /** ISO 4217 currency code of the price targets */
        fun currency(currency: String) = currency(JsonField.of(currency))

        /**
         * Sets [Builder.currency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currency] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun currency(currency: JsonField<String>) = apply { this.currency = currency }

        /** Highest analyst price target */
        fun high(high: String) = high(JsonField.of(high))

        /**
         * Sets [Builder.high] to an arbitrary JSON value.
         *
         * You should usually call [Builder.high] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun high(high: JsonField<String>) = apply { this.high = high }

        /** Lowest analyst price target */
        fun low(low: String) = low(JsonField.of(low))

        /**
         * Sets [Builder.low] to an arbitrary JSON value.
         *
         * You should usually call [Builder.low] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun low(low: JsonField<String>) = apply { this.low = low }

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
         * Returns an immutable instance of [PriceTarget].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .average()
         * .currency()
         * .high()
         * .low()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PriceTarget =
            PriceTarget(
                checkRequired("average", average),
                checkRequired("currency", currency),
                checkRequired("high", high),
                checkRequired("low", low),
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
    fun validate(): PriceTarget = apply {
        if (validated) {
            return@apply
        }

        average()
        currency()
        high()
        low()
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
        (if (average.asKnown().isPresent) 1 else 0) +
            (if (currency.asKnown().isPresent) 1 else 0) +
            (if (high.asKnown().isPresent) 1 else 0) +
            (if (low.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PriceTarget &&
            average == other.average &&
            currency == other.currency &&
            high == other.high &&
            low == other.low &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(average, currency, high, low, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PriceTarget{average=$average, currency=$currency, high=$high, low=$low, additionalProperties=$additionalProperties}"
}
