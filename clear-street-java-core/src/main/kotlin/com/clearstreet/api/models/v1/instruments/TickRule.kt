// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.instruments

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

/**
 * One band of an instrument's tick schedule. A price in the band is valid only if it is a whole
 * multiple of `tick_size`. Bands describe the instrument itself: on an equity they say nothing
 * about that equity's option chain.
 */
class TickRule
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val startPrice: JsonField<String>,
    private val tickSize: JsonField<String>,
    private val endPrice: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("start_price")
        @ExcludeMissing
        startPrice: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tick_size") @ExcludeMissing tickSize: JsonField<String> = JsonMissing.of(),
        @JsonProperty("end_price") @ExcludeMissing endPrice: JsonField<String> = JsonMissing.of(),
    ) : this(startPrice, tickSize, endPrice, mutableMapOf())

    /**
     * Lowest price in the band, inclusive.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun startPrice(): String = startPrice.getRequired("start_price")

    /**
     * Minimum price increment within the band.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun tickSize(): String = tickSize.getRequired("tick_size")

    /**
     * Upper bound of the band, exclusive. Absent on the last band, which runs to infinity. When a
     * null/undefined value is observed, it indicates it does not apply.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun endPrice(): Optional<String> = endPrice.getOptional("end_price")

    /**
     * Returns the raw JSON value of [startPrice].
     *
     * Unlike [startPrice], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("start_price") @ExcludeMissing fun _startPrice(): JsonField<String> = startPrice

    /**
     * Returns the raw JSON value of [tickSize].
     *
     * Unlike [tickSize], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tick_size") @ExcludeMissing fun _tickSize(): JsonField<String> = tickSize

    /**
     * Returns the raw JSON value of [endPrice].
     *
     * Unlike [endPrice], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("end_price") @ExcludeMissing fun _endPrice(): JsonField<String> = endPrice

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
         * Returns a mutable builder for constructing an instance of [TickRule].
         *
         * The following fields are required:
         * ```java
         * .startPrice()
         * .tickSize()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TickRule]. */
    class Builder internal constructor() {

        private var startPrice: JsonField<String>? = null
        private var tickSize: JsonField<String>? = null
        private var endPrice: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(tickRule: TickRule) = apply {
            startPrice = tickRule.startPrice
            tickSize = tickRule.tickSize
            endPrice = tickRule.endPrice
            additionalProperties = tickRule.additionalProperties.toMutableMap()
        }

        /** Lowest price in the band, inclusive. */
        fun startPrice(startPrice: String) = startPrice(JsonField.of(startPrice))

        /**
         * Sets [Builder.startPrice] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startPrice] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun startPrice(startPrice: JsonField<String>) = apply { this.startPrice = startPrice }

        /** Minimum price increment within the band. */
        fun tickSize(tickSize: String) = tickSize(JsonField.of(tickSize))

        /**
         * Sets [Builder.tickSize] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tickSize] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun tickSize(tickSize: JsonField<String>) = apply { this.tickSize = tickSize }

        /**
         * Upper bound of the band, exclusive. Absent on the last band, which runs to infinity. When
         * a null/undefined value is observed, it indicates it does not apply.
         */
        fun endPrice(endPrice: String?) = endPrice(JsonField.ofNullable(endPrice))

        /** Alias for calling [Builder.endPrice] with `endPrice.orElse(null)`. */
        fun endPrice(endPrice: Optional<String>) = endPrice(endPrice.getOrNull())

        /**
         * Sets [Builder.endPrice] to an arbitrary JSON value.
         *
         * You should usually call [Builder.endPrice] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun endPrice(endPrice: JsonField<String>) = apply { this.endPrice = endPrice }

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
         * Returns an immutable instance of [TickRule].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .startPrice()
         * .tickSize()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): TickRule =
            TickRule(
                checkRequired("startPrice", startPrice),
                checkRequired("tickSize", tickSize),
                endPrice,
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
    fun validate(): TickRule = apply {
        if (validated) {
            return@apply
        }

        startPrice()
        tickSize()
        endPrice()
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
        (if (startPrice.asKnown().isPresent) 1 else 0) +
            (if (tickSize.asKnown().isPresent) 1 else 0) +
            (if (endPrice.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TickRule &&
            startPrice == other.startPrice &&
            tickSize == other.tickSize &&
            endPrice == other.endPrice &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(startPrice, tickSize, endPrice, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TickRule{startPrice=$startPrice, tickSize=$tickSize, endPrice=$endPrice, additionalProperties=$additionalProperties}"
}
