// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.accounts

import com.clearstreet.api.core.ExcludeMissing
import com.clearstreet.api.core.JsonField
import com.clearstreet.api.core.JsonMissing
import com.clearstreet.api.core.JsonValue
import com.clearstreet.api.errors.ClearStreetInvalidDataException
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
    private val marginMultiplier: JsonField<MarginMultiplier>,
    private val maxNotional: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("margin_multiplier")
        @ExcludeMissing
        marginMultiplier: JsonField<MarginMultiplier> = JsonMissing.of(),
        @JsonProperty("max_notional")
        @ExcludeMissing
        maxNotional: JsonField<String> = JsonMissing.of(),
    ) : this(marginMultiplier, maxNotional, mutableMapOf())

    /**
     * When a null/undefined value is observed, it indicates that there is no available data.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun marginMultiplier(): Optional<MarginMultiplier> =
        marginMultiplier.getOptional("margin_multiplier")

    /**
     * The maximum notional value available to the account. On update, a value must be 0 or greater,
     * `null` clears the limit, and omitting the field leaves the limit unchanged. When a
     * null/undefined value is observed, it indicates that there is no available data.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun maxNotional(): Optional<String> = maxNotional.getOptional("max_notional")

    /**
     * Returns the raw JSON value of [marginMultiplier].
     *
     * Unlike [marginMultiplier], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("margin_multiplier")
    @ExcludeMissing
    fun _marginMultiplier(): JsonField<MarginMultiplier> = marginMultiplier

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

        private var marginMultiplier: JsonField<MarginMultiplier> = JsonMissing.of()
        private var maxNotional: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(riskSettings: RiskSettings) = apply {
            marginMultiplier = riskSettings.marginMultiplier
            maxNotional = riskSettings.maxNotional
            additionalProperties = riskSettings.additionalProperties.toMutableMap()
        }

        /**
         * When a null/undefined value is observed, it indicates that there is no available data.
         */
        fun marginMultiplier(marginMultiplier: MarginMultiplier?) =
            marginMultiplier(JsonField.ofNullable(marginMultiplier))

        /** Alias for calling [Builder.marginMultiplier] with `marginMultiplier.orElse(null)`. */
        fun marginMultiplier(marginMultiplier: Optional<MarginMultiplier>) =
            marginMultiplier(marginMultiplier.getOrNull())

        /**
         * Sets [Builder.marginMultiplier] to an arbitrary JSON value.
         *
         * You should usually call [Builder.marginMultiplier] with a well-typed [MarginMultiplier]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun marginMultiplier(marginMultiplier: JsonField<MarginMultiplier>) = apply {
            this.marginMultiplier = marginMultiplier
        }

        /**
         * The maximum notional value available to the account. On update, a value must be 0 or
         * greater, `null` clears the limit, and omitting the field leaves the limit unchanged. When
         * a null/undefined value is observed, it indicates that there is no available data.
         */
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
        fun build(): RiskSettings =
            RiskSettings(marginMultiplier, maxNotional, additionalProperties.toMutableMap())
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

        marginMultiplier().ifPresent { it.validate() }
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
    @JvmSynthetic
    internal fun validity(): Int =
        (marginMultiplier.asKnown().getOrNull()?.validity() ?: 0) +
            (if (maxNotional.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RiskSettings &&
            marginMultiplier == other.marginMultiplier &&
            maxNotional == other.maxNotional &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(marginMultiplier, maxNotional, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "RiskSettings{marginMultiplier=$marginMultiplier, maxNotional=$maxNotional, additionalProperties=$additionalProperties}"
}
