// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.accounts

import com.clearstreet.api.core.ExcludeMissing
import com.clearstreet.api.core.JsonField
import com.clearstreet.api.core.JsonMissing
import com.clearstreet.api.core.JsonValue
import com.clearstreet.api.core.checkRequired
import com.clearstreet.api.errors.ClearStreetInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects

/** Prediction-market buying power in the same currency as the account balances. */
class PredictionMarketBalances
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val buyingPower: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("buying_power")
        @ExcludeMissing
        buyingPower: JsonField<String> = JsonMissing.of()
    ) : this(buyingPower, mutableMapOf())

    /**
     * Unlevered prediction-market buying power from the shared cash pool, after order and
     * withdrawal holds. This draws on the same funds as Securities buying power; the two values
     * must not be added together.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun buyingPower(): String = buyingPower.getRequired("buying_power")

    /**
     * Returns the raw JSON value of [buyingPower].
     *
     * Unlike [buyingPower], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("buying_power")
    @ExcludeMissing
    fun _buyingPower(): JsonField<String> = buyingPower

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
         * Returns a mutable builder for constructing an instance of [PredictionMarketBalances].
         *
         * The following fields are required:
         * ```java
         * .buyingPower()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PredictionMarketBalances]. */
    class Builder internal constructor() {

        private var buyingPower: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(predictionMarketBalances: PredictionMarketBalances) = apply {
            buyingPower = predictionMarketBalances.buyingPower
            additionalProperties = predictionMarketBalances.additionalProperties.toMutableMap()
        }

        /**
         * Unlevered prediction-market buying power from the shared cash pool, after order and
         * withdrawal holds. This draws on the same funds as Securities buying power; the two values
         * must not be added together.
         */
        fun buyingPower(buyingPower: String) = buyingPower(JsonField.of(buyingPower))

        /**
         * Sets [Builder.buyingPower] to an arbitrary JSON value.
         *
         * You should usually call [Builder.buyingPower] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun buyingPower(buyingPower: JsonField<String>) = apply { this.buyingPower = buyingPower }

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
         * Returns an immutable instance of [PredictionMarketBalances].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .buyingPower()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PredictionMarketBalances =
            PredictionMarketBalances(
                checkRequired("buyingPower", buyingPower),
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
    fun validate(): PredictionMarketBalances = apply {
        if (validated) {
            return@apply
        }

        buyingPower()
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
    @JvmSynthetic internal fun validity(): Int = (if (buyingPower.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PredictionMarketBalances &&
            buyingPower == other.buyingPower &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(buyingPower, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PredictionMarketBalances{buyingPower=$buyingPower, additionalProperties=$additionalProperties}"
}
