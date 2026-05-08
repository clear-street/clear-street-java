// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.accounts

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

class MarginDetailsUsage
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val total: JsonField<String>,
    private val used: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("total") @ExcludeMissing total: JsonField<String> = JsonMissing.of(),
        @JsonProperty("used") @ExcludeMissing used: JsonField<String> = JsonMissing.of(),
    ) : this(total, used, mutableMapOf())

    /**
     * The total margin available in the current model.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun total(): String = total.getRequired("total")

    /**
     * The amount of margin that is currently being utilized.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun used(): String = used.getRequired("used")

    /**
     * Returns the raw JSON value of [total].
     *
     * Unlike [total], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("total") @ExcludeMissing fun _total(): JsonField<String> = total

    /**
     * Returns the raw JSON value of [used].
     *
     * Unlike [used], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("used") @ExcludeMissing fun _used(): JsonField<String> = used

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
         * Returns a mutable builder for constructing an instance of [MarginDetailsUsage].
         *
         * The following fields are required:
         * ```java
         * .total()
         * .used()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MarginDetailsUsage]. */
    class Builder internal constructor() {

        private var total: JsonField<String>? = null
        private var used: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(marginDetailsUsage: MarginDetailsUsage) = apply {
            total = marginDetailsUsage.total
            used = marginDetailsUsage.used
            additionalProperties = marginDetailsUsage.additionalProperties.toMutableMap()
        }

        /** The total margin available in the current model. */
        fun total(total: String) = total(JsonField.of(total))

        /**
         * Sets [Builder.total] to an arbitrary JSON value.
         *
         * You should usually call [Builder.total] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun total(total: JsonField<String>) = apply { this.total = total }

        /** The amount of margin that is currently being utilized. */
        fun used(used: String) = used(JsonField.of(used))

        /**
         * Sets [Builder.used] to an arbitrary JSON value.
         *
         * You should usually call [Builder.used] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun used(used: JsonField<String>) = apply { this.used = used }

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
         * Returns an immutable instance of [MarginDetailsUsage].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .total()
         * .used()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): MarginDetailsUsage =
            MarginDetailsUsage(
                checkRequired("total", total),
                checkRequired("used", used),
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
    fun validate(): MarginDetailsUsage = apply {
        if (validated) {
            return@apply
        }

        total()
        used()
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
        (if (total.asKnown().isPresent) 1 else 0) + (if (used.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MarginDetailsUsage &&
            total == other.total &&
            used == other.used &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(total, used, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "MarginDetailsUsage{total=$total, used=$used, additionalProperties=$additionalProperties}"
}
