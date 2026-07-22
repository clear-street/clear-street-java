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
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class MarginSessionDetails
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val buyingPower: JsonField<String>,
    private val multiplier: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("buying_power")
        @ExcludeMissing
        buyingPower: JsonField<String> = JsonMissing.of(),
        @JsonProperty("multiplier") @ExcludeMissing multiplier: JsonField<String> = JsonMissing.of(),
    ) : this(buyingPower, multiplier, mutableMapOf())

    /**
     * Maximum buying power available in the account during the session.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun buyingPower(): String = buyingPower.getRequired("buying_power")

    /**
     * Effective multiplier for margin calculations during the session.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun multiplier(): Optional<String> = multiplier.getOptional("multiplier")

    /**
     * Returns the raw JSON value of [buyingPower].
     *
     * Unlike [buyingPower], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("buying_power")
    @ExcludeMissing
    fun _buyingPower(): JsonField<String> = buyingPower

    /**
     * Returns the raw JSON value of [multiplier].
     *
     * Unlike [multiplier], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("multiplier") @ExcludeMissing fun _multiplier(): JsonField<String> = multiplier

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
         * Returns a mutable builder for constructing an instance of [MarginSessionDetails].
         *
         * The following fields are required:
         * ```java
         * .buyingPower()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MarginSessionDetails]. */
    class Builder internal constructor() {

        private var buyingPower: JsonField<String>? = null
        private var multiplier: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(marginSessionDetails: MarginSessionDetails) = apply {
            buyingPower = marginSessionDetails.buyingPower
            multiplier = marginSessionDetails.multiplier
            additionalProperties = marginSessionDetails.additionalProperties.toMutableMap()
        }

        /** Maximum buying power available in the account during the session. */
        fun buyingPower(buyingPower: String) = buyingPower(JsonField.of(buyingPower))

        /**
         * Sets [Builder.buyingPower] to an arbitrary JSON value.
         *
         * You should usually call [Builder.buyingPower] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun buyingPower(buyingPower: JsonField<String>) = apply { this.buyingPower = buyingPower }

        /** Effective multiplier for margin calculations during the session. */
        fun multiplier(multiplier: String?) = multiplier(JsonField.ofNullable(multiplier))

        /** Alias for calling [Builder.multiplier] with `multiplier.orElse(null)`. */
        fun multiplier(multiplier: Optional<String>) = multiplier(multiplier.getOrNull())

        /**
         * Sets [Builder.multiplier] to an arbitrary JSON value.
         *
         * You should usually call [Builder.multiplier] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun multiplier(multiplier: JsonField<String>) = apply { this.multiplier = multiplier }

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
         * Returns an immutable instance of [MarginSessionDetails].
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
        fun build(): MarginSessionDetails =
            MarginSessionDetails(
                checkRequired("buyingPower", buyingPower),
                multiplier,
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
    fun validate(): MarginSessionDetails = apply {
        if (validated) {
            return@apply
        }

        buyingPower()
        multiplier()
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
        (if (buyingPower.asKnown().isPresent) 1 else 0) +
            (if (multiplier.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MarginSessionDetails &&
            buyingPower == other.buyingPower &&
            multiplier == other.multiplier &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(buyingPower, multiplier, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "MarginSessionDetails{buyingPower=$buyingPower, multiplier=$multiplier, additionalProperties=$additionalProperties}"
}
