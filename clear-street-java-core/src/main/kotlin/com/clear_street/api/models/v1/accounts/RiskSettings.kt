// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.accounts

import com.clear_street.api.core.ExcludeMissing
import com.clear_street.api.core.JsonField
import com.clear_street.api.core.JsonMissing
import com.clear_street.api.core.JsonValue
import com.clear_street.api.errors.ClearStreetInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Risk settings for an account */
class RiskSettings
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val maxNotional: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("max_notional")
        @ExcludeMissing
        maxNotional: JsonField<String> = JsonMissing.of()
    ) : this(maxNotional, mutableMapOf())

    /**
     * The maximum notional value available to the account
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun maxNotional(): Optional<String> = maxNotional.getOptional("max_notional")

    /**
     * Returns the raw JSON value of [maxNotional].
     *
     * Unlike [maxNotional], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("max_notional")
    @ExcludeMissing
    fun _maxNotional(): JsonField<String> = maxNotional

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

        /** Returns a mutable builder for constructing an instance of [RiskSettings]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RiskSettings]. */
    class Builder internal constructor() {

        private var maxNotional: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(riskSettings: RiskSettings) = apply {
            maxNotional = riskSettings.maxNotional
            additionalProperties = riskSettings.additionalProperties.toMutableMap()
        }

        /** The maximum notional value available to the account */
        fun maxNotional(maxNotional: String?) = maxNotional(JsonField.ofNullable(maxNotional))

        /** Alias for calling [Builder.maxNotional] with `maxNotional.orElse(null)`. */
        fun maxNotional(maxNotional: Optional<String>) = maxNotional(maxNotional.getOrNull())

        /**
         * Sets [Builder.maxNotional] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxNotional] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun maxNotional(maxNotional: JsonField<String>) = apply { this.maxNotional = maxNotional }

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
         * Returns an immutable instance of [RiskSettings].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): RiskSettings = RiskSettings(maxNotional, additionalProperties.toMutableMap())
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
    fun validate(): RiskSettings = apply {
        if (validated) {
            return@apply
        }

        maxNotional()
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
    @JvmSynthetic internal fun validity(): Int = (if (maxNotional.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RiskSettings &&
            maxNotional == other.maxNotional &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(maxNotional, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "RiskSettings{maxNotional=$maxNotional, additionalProperties=$additionalProperties}"
}
