// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.orders

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
 * Effective action from the recorded order classification, with NO-relative prices. Existing
 * top-level side and prices retain their YES-based meaning.
 */
class EventContractOrder
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val action: JsonField<Side>,
    private val contractSide: JsonField<EventContractSide>,
    private val noAverageFillPrice: JsonField<String>,
    private val noLimitPrice: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("action") @ExcludeMissing action: JsonField<Side> = JsonMissing.of(),
        @JsonProperty("contract_side")
        @ExcludeMissing
        contractSide: JsonField<EventContractSide> = JsonMissing.of(),
        @JsonProperty("no_average_fill_price")
        @ExcludeMissing
        noAverageFillPrice: JsonField<String> = JsonMissing.of(),
        @JsonProperty("no_limit_price")
        @ExcludeMissing
        noLimitPrice: JsonField<String> = JsonMissing.of(),
    ) : this(action, contractSide, noAverageFillPrice, noLimitPrice, mutableMapOf())

    /**
     * BUY or SELL of `contract_side`, recorded when the order was classified.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun action(): Side = action.getRequired("action")

    /**
     * Contract the effective action buys or sells.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun contractSide(): EventContractSide = contractSide.getRequired("contract_side")

    /**
     * Contract payout minus the existing YES average fill price. Omitted before any fill or when
     * payout data is unavailable. When a null/undefined value is observed, it indicates that there
     * is no available data.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun noAverageFillPrice(): Optional<String> =
        noAverageFillPrice.getOptional("no_average_fill_price")

    /**
     * Contract payout minus the existing YES limit price. Omitted for market orders or when payout
     * data is unavailable. When a null/undefined value is observed, it indicates that there is no
     * available data.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun noLimitPrice(): Optional<String> = noLimitPrice.getOptional("no_limit_price")

    /**
     * Returns the raw JSON value of [action].
     *
     * Unlike [action], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("action") @ExcludeMissing fun _action(): JsonField<Side> = action

    /**
     * Returns the raw JSON value of [contractSide].
     *
     * Unlike [contractSide], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("contract_side")
    @ExcludeMissing
    fun _contractSide(): JsonField<EventContractSide> = contractSide

    /**
     * Returns the raw JSON value of [noAverageFillPrice].
     *
     * Unlike [noAverageFillPrice], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("no_average_fill_price")
    @ExcludeMissing
    fun _noAverageFillPrice(): JsonField<String> = noAverageFillPrice

    /**
     * Returns the raw JSON value of [noLimitPrice].
     *
     * Unlike [noLimitPrice], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("no_limit_price")
    @ExcludeMissing
    fun _noLimitPrice(): JsonField<String> = noLimitPrice

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
         * Returns a mutable builder for constructing an instance of [EventContractOrder].
         *
         * The following fields are required:
         * ```java
         * .action()
         * .contractSide()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [EventContractOrder]. */
    class Builder internal constructor() {

        private var action: JsonField<Side>? = null
        private var contractSide: JsonField<EventContractSide>? = null
        private var noAverageFillPrice: JsonField<String> = JsonMissing.of()
        private var noLimitPrice: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(eventContractOrder: EventContractOrder) = apply {
            action = eventContractOrder.action
            contractSide = eventContractOrder.contractSide
            noAverageFillPrice = eventContractOrder.noAverageFillPrice
            noLimitPrice = eventContractOrder.noLimitPrice
            additionalProperties = eventContractOrder.additionalProperties.toMutableMap()
        }

        /** BUY or SELL of `contract_side`, recorded when the order was classified. */
        fun action(action: Side) = action(JsonField.of(action))

        /**
         * Sets [Builder.action] to an arbitrary JSON value.
         *
         * You should usually call [Builder.action] with a well-typed [Side] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun action(action: JsonField<Side>) = apply { this.action = action }

        /** Contract the effective action buys or sells. */
        fun contractSide(contractSide: EventContractSide) = contractSide(JsonField.of(contractSide))

        /**
         * Sets [Builder.contractSide] to an arbitrary JSON value.
         *
         * You should usually call [Builder.contractSide] with a well-typed [EventContractSide]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun contractSide(contractSide: JsonField<EventContractSide>) = apply {
            this.contractSide = contractSide
        }

        /**
         * Contract payout minus the existing YES average fill price. Omitted before any fill or
         * when payout data is unavailable. When a null/undefined value is observed, it indicates
         * that there is no available data.
         */
        fun noAverageFillPrice(noAverageFillPrice: String?) =
            noAverageFillPrice(JsonField.ofNullable(noAverageFillPrice))

        /**
         * Alias for calling [Builder.noAverageFillPrice] with `noAverageFillPrice.orElse(null)`.
         */
        fun noAverageFillPrice(noAverageFillPrice: Optional<String>) =
            noAverageFillPrice(noAverageFillPrice.getOrNull())

        /**
         * Sets [Builder.noAverageFillPrice] to an arbitrary JSON value.
         *
         * You should usually call [Builder.noAverageFillPrice] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun noAverageFillPrice(noAverageFillPrice: JsonField<String>) = apply {
            this.noAverageFillPrice = noAverageFillPrice
        }

        /**
         * Contract payout minus the existing YES limit price. Omitted for market orders or when
         * payout data is unavailable. When a null/undefined value is observed, it indicates that
         * there is no available data.
         */
        fun noLimitPrice(noLimitPrice: String?) = noLimitPrice(JsonField.ofNullable(noLimitPrice))

        /** Alias for calling [Builder.noLimitPrice] with `noLimitPrice.orElse(null)`. */
        fun noLimitPrice(noLimitPrice: Optional<String>) = noLimitPrice(noLimitPrice.getOrNull())

        /**
         * Sets [Builder.noLimitPrice] to an arbitrary JSON value.
         *
         * You should usually call [Builder.noLimitPrice] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun noLimitPrice(noLimitPrice: JsonField<String>) = apply {
            this.noLimitPrice = noLimitPrice
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
         * Returns an immutable instance of [EventContractOrder].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .action()
         * .contractSide()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): EventContractOrder =
            EventContractOrder(
                checkRequired("action", action),
                checkRequired("contractSide", contractSide),
                noAverageFillPrice,
                noLimitPrice,
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
    fun validate(): EventContractOrder = apply {
        if (validated) {
            return@apply
        }

        action().validate()
        contractSide().validate()
        noAverageFillPrice()
        noLimitPrice()
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
        (action.asKnown().getOrNull()?.validity() ?: 0) +
            (contractSide.asKnown().getOrNull()?.validity() ?: 0) +
            (if (noAverageFillPrice.asKnown().isPresent) 1 else 0) +
            (if (noLimitPrice.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EventContractOrder &&
            action == other.action &&
            contractSide == other.contractSide &&
            noAverageFillPrice == other.noAverageFillPrice &&
            noLimitPrice == other.noLimitPrice &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(action, contractSide, noAverageFillPrice, noLimitPrice, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "EventContractOrder{action=$action, contractSide=$contractSide, noAverageFillPrice=$noAverageFillPrice, noLimitPrice=$noLimitPrice, additionalProperties=$additionalProperties}"
}
