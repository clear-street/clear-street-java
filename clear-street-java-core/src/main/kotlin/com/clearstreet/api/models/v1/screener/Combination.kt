// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.screener

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

/**
 * A single combination, expressed with the API's own parameter names.
 *
 * At most one of `period` / `lookback` is set; a combination with neither selects the field's
 * current or most recent value.
 */
class Combination
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val lookback: JsonField<String>,
    private val period: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("lookback") @ExcludeMissing lookback: JsonField<String> = JsonMissing.of(),
        @JsonProperty("period") @ExcludeMissing period: JsonField<String> = JsonMissing.of(),
    ) : this(lookback, period, mutableMapOf())

    /**
     * The lookback, a member of `enums.lookback`.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lookback(): Optional<String> = lookback.getOptional("lookback")

    /**
     * The period, a member of `enums.period`.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun period(): Optional<String> = period.getOptional("period")

    /**
     * Returns the raw JSON value of [lookback].
     *
     * Unlike [lookback], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lookback") @ExcludeMissing fun _lookback(): JsonField<String> = lookback

    /**
     * Returns the raw JSON value of [period].
     *
     * Unlike [period], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("period") @ExcludeMissing fun _period(): JsonField<String> = period

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

        /** Returns a mutable builder for constructing an instance of [Combination]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Combination]. */
    class Builder internal constructor() {

        private var lookback: JsonField<String> = JsonMissing.of()
        private var period: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(combination: Combination) = apply {
            lookback = combination.lookback
            period = combination.period
            additionalProperties = combination.additionalProperties.toMutableMap()
        }

        /** The lookback, a member of `enums.lookback`. */
        fun lookback(lookback: String?) = lookback(JsonField.ofNullable(lookback))

        /** Alias for calling [Builder.lookback] with `lookback.orElse(null)`. */
        fun lookback(lookback: Optional<String>) = lookback(lookback.getOrNull())

        /**
         * Sets [Builder.lookback] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lookback] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun lookback(lookback: JsonField<String>) = apply { this.lookback = lookback }

        /** The period, a member of `enums.period`. */
        fun period(period: String?) = period(JsonField.ofNullable(period))

        /** Alias for calling [Builder.period] with `period.orElse(null)`. */
        fun period(period: Optional<String>) = period(period.getOrNull())

        /**
         * Sets [Builder.period] to an arbitrary JSON value.
         *
         * You should usually call [Builder.period] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun period(period: JsonField<String>) = apply { this.period = period }

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
         * Returns an immutable instance of [Combination].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): Combination =
            Combination(lookback, period, additionalProperties.toMutableMap())
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
    fun validate(): Combination = apply {
        if (validated) {
            return@apply
        }

        lookback()
        period()
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
        (if (lookback.asKnown().isPresent) 1 else 0) + (if (period.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Combination &&
            lookback == other.lookback &&
            period == other.period &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(lookback, period, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Combination{lookback=$lookback, period=$period, additionalProperties=$additionalProperties}"
}
