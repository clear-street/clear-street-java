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
 * Effective action inherited from the parent order, with a NO-relative fill price. This is the
 * order's classification, not a per-fill open/close accounting attribution.
 */
class EventContractExecution
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val action: JsonField<Side>,
    private val contractSide: JsonField<EventContractSide>,
    private val noPrice: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("action") @ExcludeMissing action: JsonField<Side> = JsonMissing.of(),
        @JsonProperty("contract_side")
        @ExcludeMissing
        contractSide: JsonField<EventContractSide> = JsonMissing.of(),
        @JsonProperty("no_price") @ExcludeMissing noPrice: JsonField<String> = JsonMissing.of(),
    ) : this(action, contractSide, noPrice, mutableMapOf())

    /**
     * BUY or SELL of `contract_side`, inherited from the parent classification.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun action(): Side = action.getRequired("action")

    /**
     * Contract the parent order's effective action buys or sells.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun contractSide(): EventContractSide = contractSide.getRequired("contract_side")

    /**
     * Contract payout minus the existing YES fill price. Omitted when payout data is unavailable.
     * When a null/undefined value is observed, it indicates that there is no available data.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun noPrice(): Optional<String> = noPrice.getOptional("no_price")

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
     * Returns the raw JSON value of [noPrice].
     *
     * Unlike [noPrice], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("no_price") @ExcludeMissing fun _noPrice(): JsonField<String> = noPrice

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
         * Returns a mutable builder for constructing an instance of [EventContractExecution].
         *
         * The following fields are required:
         * ```java
         * .action()
         * .contractSide()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [EventContractExecution]. */
    class Builder internal constructor() {

        private var action: JsonField<Side>? = null
        private var contractSide: JsonField<EventContractSide>? = null
        private var noPrice: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(eventContractExecution: EventContractExecution) = apply {
            action = eventContractExecution.action
            contractSide = eventContractExecution.contractSide
            noPrice = eventContractExecution.noPrice
            additionalProperties = eventContractExecution.additionalProperties.toMutableMap()
        }

        /** BUY or SELL of `contract_side`, inherited from the parent classification. */
        fun action(action: Side) = action(JsonField.of(action))

        /**
         * Sets [Builder.action] to an arbitrary JSON value.
         *
         * You should usually call [Builder.action] with a well-typed [Side] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun action(action: JsonField<Side>) = apply { this.action = action }

        /** Contract the parent order's effective action buys or sells. */
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
         * Contract payout minus the existing YES fill price. Omitted when payout data is
         * unavailable. When a null/undefined value is observed, it indicates that there is no
         * available data.
         */
        fun noPrice(noPrice: String?) = noPrice(JsonField.ofNullable(noPrice))

        /** Alias for calling [Builder.noPrice] with `noPrice.orElse(null)`. */
        fun noPrice(noPrice: Optional<String>) = noPrice(noPrice.getOrNull())

        /**
         * Sets [Builder.noPrice] to an arbitrary JSON value.
         *
         * You should usually call [Builder.noPrice] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun noPrice(noPrice: JsonField<String>) = apply { this.noPrice = noPrice }

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
         * Returns an immutable instance of [EventContractExecution].
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
        fun build(): EventContractExecution =
            EventContractExecution(
                checkRequired("action", action),
                checkRequired("contractSide", contractSide),
                noPrice,
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
    fun validate(): EventContractExecution = apply {
        if (validated) {
            return@apply
        }

        action().validate()
        contractSide().validate()
        noPrice()
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
            (if (noPrice.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EventContractExecution &&
            action == other.action &&
            contractSide == other.contractSide &&
            noPrice == other.noPrice &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(action, contractSide, noPrice, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "EventContractExecution{action=$action, contractSide=$contractSide, noPrice=$noPrice, additionalProperties=$additionalProperties}"
}
