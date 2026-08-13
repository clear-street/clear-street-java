// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.orders

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
 * Request to replace (modify) an existing order
 *
 * At least one field must be provided.
 */
class ReplaceOrderRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val limitOffset: JsonField<String>,
    private val limitPrice: JsonField<String>,
    private val quantity: JsonField<String>,
    private val stopPrice: JsonField<String>,
    private val trailingOffset: JsonField<String>,
    private val trailingOffsetType: JsonField<TrailingOffsetType>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("limit_offset")
        @ExcludeMissing
        limitOffset: JsonField<String> = JsonMissing.of(),
        @JsonProperty("limit_price")
        @ExcludeMissing
        limitPrice: JsonField<String> = JsonMissing.of(),
        @JsonProperty("quantity") @ExcludeMissing quantity: JsonField<String> = JsonMissing.of(),
        @JsonProperty("stop_price") @ExcludeMissing stopPrice: JsonField<String> = JsonMissing.of(),
        @JsonProperty("trailing_offset")
        @ExcludeMissing
        trailingOffset: JsonField<String> = JsonMissing.of(),
        @JsonProperty("trailing_offset_type")
        @ExcludeMissing
        trailingOffsetType: JsonField<TrailingOffsetType> = JsonMissing.of(),
    ) : this(
        limitOffset,
        limitPrice,
        quantity,
        stopPrice,
        trailingOffset,
        trailingOffsetType,
        mutableMapOf(),
    )

    /**
     * New limit offset for trailing stop-limit orders (signed)
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun limitOffset(): Optional<String> = limitOffset.getOptional("limit_offset")

    /**
     * New limit price for the order
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun limitPrice(): Optional<String> = limitPrice.getOptional("limit_price")

    /**
     * New quantity for the order
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun quantity(): Optional<String> = quantity.getOptional("quantity")

    /**
     * New stop price for the order
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun stopPrice(): Optional<String> = stopPrice.getOptional("stop_price")

    /**
     * New trailing offset for trailing orders
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun trailingOffset(): Optional<String> = trailingOffset.getOptional("trailing_offset")

    /**
     * New trailing offset type (PRICE or BPS)
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun trailingOffsetType(): Optional<TrailingOffsetType> =
        trailingOffsetType.getOptional("trailing_offset_type")

    /**
     * Returns the raw JSON value of [limitOffset].
     *
     * Unlike [limitOffset], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("limit_offset")
    @ExcludeMissing
    fun _limitOffset(): JsonField<String> = limitOffset

    /**
     * Returns the raw JSON value of [limitPrice].
     *
     * Unlike [limitPrice], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("limit_price") @ExcludeMissing fun _limitPrice(): JsonField<String> = limitPrice

    /**
     * Returns the raw JSON value of [quantity].
     *
     * Unlike [quantity], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("quantity") @ExcludeMissing fun _quantity(): JsonField<String> = quantity

    /**
     * Returns the raw JSON value of [stopPrice].
     *
     * Unlike [stopPrice], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("stop_price") @ExcludeMissing fun _stopPrice(): JsonField<String> = stopPrice

    /**
     * Returns the raw JSON value of [trailingOffset].
     *
     * Unlike [trailingOffset], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("trailing_offset")
    @ExcludeMissing
    fun _trailingOffset(): JsonField<String> = trailingOffset

    /**
     * Returns the raw JSON value of [trailingOffsetType].
     *
     * Unlike [trailingOffsetType], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("trailing_offset_type")
    @ExcludeMissing
    fun _trailingOffsetType(): JsonField<TrailingOffsetType> = trailingOffsetType

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

        /** Returns a mutable builder for constructing an instance of [ReplaceOrderRequest]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ReplaceOrderRequest]. */
    class Builder internal constructor() {

        private var limitOffset: JsonField<String> = JsonMissing.of()
        private var limitPrice: JsonField<String> = JsonMissing.of()
        private var quantity: JsonField<String> = JsonMissing.of()
        private var stopPrice: JsonField<String> = JsonMissing.of()
        private var trailingOffset: JsonField<String> = JsonMissing.of()
        private var trailingOffsetType: JsonField<TrailingOffsetType> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(replaceOrderRequest: ReplaceOrderRequest) = apply {
            limitOffset = replaceOrderRequest.limitOffset
            limitPrice = replaceOrderRequest.limitPrice
            quantity = replaceOrderRequest.quantity
            stopPrice = replaceOrderRequest.stopPrice
            trailingOffset = replaceOrderRequest.trailingOffset
            trailingOffsetType = replaceOrderRequest.trailingOffsetType
            additionalProperties = replaceOrderRequest.additionalProperties.toMutableMap()
        }

        /** New limit offset for trailing stop-limit orders (signed) */
        fun limitOffset(limitOffset: String?) = limitOffset(JsonField.ofNullable(limitOffset))

        /** Alias for calling [Builder.limitOffset] with `limitOffset.orElse(null)`. */
        fun limitOffset(limitOffset: Optional<String>) = limitOffset(limitOffset.getOrNull())

        /**
         * Sets [Builder.limitOffset] to an arbitrary JSON value.
         *
         * You should usually call [Builder.limitOffset] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun limitOffset(limitOffset: JsonField<String>) = apply { this.limitOffset = limitOffset }

        /** New limit price for the order */
        fun limitPrice(limitPrice: String?) = limitPrice(JsonField.ofNullable(limitPrice))

        /** Alias for calling [Builder.limitPrice] with `limitPrice.orElse(null)`. */
        fun limitPrice(limitPrice: Optional<String>) = limitPrice(limitPrice.getOrNull())

        /**
         * Sets [Builder.limitPrice] to an arbitrary JSON value.
         *
         * You should usually call [Builder.limitPrice] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun limitPrice(limitPrice: JsonField<String>) = apply { this.limitPrice = limitPrice }

        /** New quantity for the order */
        fun quantity(quantity: String?) = quantity(JsonField.ofNullable(quantity))

        /** Alias for calling [Builder.quantity] with `quantity.orElse(null)`. */
        fun quantity(quantity: Optional<String>) = quantity(quantity.getOrNull())

        /**
         * Sets [Builder.quantity] to an arbitrary JSON value.
         *
         * You should usually call [Builder.quantity] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun quantity(quantity: JsonField<String>) = apply { this.quantity = quantity }

        /** New stop price for the order */
        fun stopPrice(stopPrice: String?) = stopPrice(JsonField.ofNullable(stopPrice))

        /** Alias for calling [Builder.stopPrice] with `stopPrice.orElse(null)`. */
        fun stopPrice(stopPrice: Optional<String>) = stopPrice(stopPrice.getOrNull())

        /**
         * Sets [Builder.stopPrice] to an arbitrary JSON value.
         *
         * You should usually call [Builder.stopPrice] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun stopPrice(stopPrice: JsonField<String>) = apply { this.stopPrice = stopPrice }

        /** New trailing offset for trailing orders */
        fun trailingOffset(trailingOffset: String?) =
            trailingOffset(JsonField.ofNullable(trailingOffset))

        /** Alias for calling [Builder.trailingOffset] with `trailingOffset.orElse(null)`. */
        fun trailingOffset(trailingOffset: Optional<String>) =
            trailingOffset(trailingOffset.getOrNull())

        /**
         * Sets [Builder.trailingOffset] to an arbitrary JSON value.
         *
         * You should usually call [Builder.trailingOffset] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun trailingOffset(trailingOffset: JsonField<String>) = apply {
            this.trailingOffset = trailingOffset
        }

        /** New trailing offset type (PRICE or BPS) */
        fun trailingOffsetType(trailingOffsetType: TrailingOffsetType?) =
            trailingOffsetType(JsonField.ofNullable(trailingOffsetType))

        /**
         * Alias for calling [Builder.trailingOffsetType] with `trailingOffsetType.orElse(null)`.
         */
        fun trailingOffsetType(trailingOffsetType: Optional<TrailingOffsetType>) =
            trailingOffsetType(trailingOffsetType.getOrNull())

        /**
         * Sets [Builder.trailingOffsetType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.trailingOffsetType] with a well-typed
         * [TrailingOffsetType] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun trailingOffsetType(trailingOffsetType: JsonField<TrailingOffsetType>) = apply {
            this.trailingOffsetType = trailingOffsetType
        }

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
         * Returns an immutable instance of [ReplaceOrderRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ReplaceOrderRequest =
            ReplaceOrderRequest(
                limitOffset,
                limitPrice,
                quantity,
                stopPrice,
                trailingOffset,
                trailingOffsetType,
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
    fun validate(): ReplaceOrderRequest = apply {
        if (validated) {
            return@apply
        }

        limitOffset()
        limitPrice()
        quantity()
        stopPrice()
        trailingOffset()
        trailingOffsetType().ifPresent { it.validate() }
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
        (if (limitOffset.asKnown().isPresent) 1 else 0) +
            (if (limitPrice.asKnown().isPresent) 1 else 0) +
            (if (quantity.asKnown().isPresent) 1 else 0) +
            (if (stopPrice.asKnown().isPresent) 1 else 0) +
            (if (trailingOffset.asKnown().isPresent) 1 else 0) +
            (trailingOffsetType.asKnown().getOrNull()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ReplaceOrderRequest &&
            limitOffset == other.limitOffset &&
            limitPrice == other.limitPrice &&
            quantity == other.quantity &&
            stopPrice == other.stopPrice &&
            trailingOffset == other.trailingOffset &&
            trailingOffsetType == other.trailingOffsetType &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            limitOffset,
            limitPrice,
            quantity,
            stopPrice,
            trailingOffset,
            trailingOffsetType,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ReplaceOrderRequest{limitOffset=$limitOffset, limitPrice=$limitPrice, quantity=$quantity, stopPrice=$stopPrice, trailingOffset=$trailingOffset, trailingOffsetType=$trailingOffsetType, additionalProperties=$additionalProperties}"
}
