// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.omniai

import com.clear_street.api.core.ExcludeMissing
import com.clear_street.api.core.JsonField
import com.clear_street.api.core.JsonMissing
import com.clear_street.api.core.JsonValue
import com.clear_street.api.core.checkKnown
import com.clear_street.api.core.checkRequired
import com.clear_street.api.core.toImmutable
import com.clear_street.api.errors.ClearStreetInvalidDataException
import com.clear_street.api.models.v1.orders.NewOrderRequest
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

/** New-order prefill action. */
class PrefillNewOrderAction
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val orders: JsonField<List<NewOrderRequest>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("orders")
        @ExcludeMissing
        orders: JsonField<List<NewOrderRequest>> = JsonMissing.of()
    ) : this(orders, mutableMapOf())

    /**
     * Orders to prefill using the same shape accepted by the orders API.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun orders(): List<NewOrderRequest> = orders.getRequired("orders")

    /**
     * Returns the raw JSON value of [orders].
     *
     * Unlike [orders], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("orders") @ExcludeMissing fun _orders(): JsonField<List<NewOrderRequest>> = orders

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
         * Returns a mutable builder for constructing an instance of [PrefillNewOrderAction].
         *
         * The following fields are required:
         * ```java
         * .orders()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PrefillNewOrderAction]. */
    class Builder internal constructor() {

        private var orders: JsonField<MutableList<NewOrderRequest>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(prefillNewOrderAction: PrefillNewOrderAction) = apply {
            orders = prefillNewOrderAction.orders.map { it.toMutableList() }
            additionalProperties = prefillNewOrderAction.additionalProperties.toMutableMap()
        }

        /** Orders to prefill using the same shape accepted by the orders API. */
        fun orders(orders: List<NewOrderRequest>) = orders(JsonField.of(orders))

        /**
         * Sets [Builder.orders] to an arbitrary JSON value.
         *
         * You should usually call [Builder.orders] with a well-typed `List<NewOrderRequest>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun orders(orders: JsonField<List<NewOrderRequest>>) = apply {
            this.orders = orders.map { it.toMutableList() }
        }

        /**
         * Adds a single [NewOrderRequest] to [orders].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addOrder(order: NewOrderRequest) = apply {
            orders =
                (orders ?: JsonField.of(mutableListOf())).also {
                    checkKnown("orders", it).add(order)
                }
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
         * Returns an immutable instance of [PrefillNewOrderAction].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .orders()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PrefillNewOrderAction =
            PrefillNewOrderAction(
                checkRequired("orders", orders).map { it.toImmutable() },
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
    fun validate(): PrefillNewOrderAction = apply {
        if (validated) {
            return@apply
        }

        orders().forEach { it.validate() }
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
        (orders.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PrefillNewOrderAction &&
            orders == other.orders &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(orders, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PrefillNewOrderAction{orders=$orders, additionalProperties=$additionalProperties}"
}
