// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.omniai

import com.clear_street.api.core.ExcludeMissing
import com.clear_street.api.core.JsonField
import com.clear_street.api.core.JsonMissing
import com.clear_street.api.core.JsonValue
import com.clear_street.api.core.checkKnown
import com.clear_street.api.core.checkRequired
import com.clear_street.api.core.toImmutable
import com.clear_street.api.errors.ClearStreetInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Action to prefill order details for user confirmation.
 *
 * The user must review and authorize the order before submission to the trading API. This action
 * provides parsed order data that can be used to prefill an order ticket UI or submitted directly
 * via the orders API after user confirmation.
 */
class PrefillOrderAction
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val orders: JsonField<List<OrderPayload>>,
    private val accountId: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("orders")
        @ExcludeMissing
        orders: JsonField<List<OrderPayload>> = JsonMissing.of(),
        @JsonProperty("account_id") @ExcludeMissing accountId: JsonField<Long> = JsonMissing.of(),
    ) : this(orders, accountId, mutableMapOf())

    /**
     * The orders to prefill
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun orders(): List<OrderPayload> = orders.getRequired("orders")

    /**
     * Account to prefill for (if known from context)
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun accountId(): Optional<Long> = accountId.getOptional("account_id")

    /**
     * Returns the raw JSON value of [orders].
     *
     * Unlike [orders], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("orders") @ExcludeMissing fun _orders(): JsonField<List<OrderPayload>> = orders

    /**
     * Returns the raw JSON value of [accountId].
     *
     * Unlike [accountId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("account_id") @ExcludeMissing fun _accountId(): JsonField<Long> = accountId

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
         * Returns a mutable builder for constructing an instance of [PrefillOrderAction].
         *
         * The following fields are required:
         * ```java
         * .orders()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PrefillOrderAction]. */
    class Builder internal constructor() {

        private var orders: JsonField<MutableList<OrderPayload>>? = null
        private var accountId: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(prefillOrderAction: PrefillOrderAction) = apply {
            orders = prefillOrderAction.orders.map { it.toMutableList() }
            accountId = prefillOrderAction.accountId
            additionalProperties = prefillOrderAction.additionalProperties.toMutableMap()
        }

        /** The orders to prefill */
        fun orders(orders: List<OrderPayload>) = orders(JsonField.of(orders))

        /**
         * Sets [Builder.orders] to an arbitrary JSON value.
         *
         * You should usually call [Builder.orders] with a well-typed `List<OrderPayload>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun orders(orders: JsonField<List<OrderPayload>>) = apply {
            this.orders = orders.map { it.toMutableList() }
        }

        /**
         * Adds a single [OrderPayload] to [orders].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addOrder(order: OrderPayload) = apply {
            orders =
                (orders ?: JsonField.of(mutableListOf())).also {
                    checkKnown("orders", it).add(order)
                }
        }

        /** Account to prefill for (if known from context) */
        fun accountId(accountId: Long?) = accountId(JsonField.ofNullable(accountId))

        /**
         * Alias for [Builder.accountId].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun accountId(accountId: Long) = accountId(accountId as Long?)

        /** Alias for calling [Builder.accountId] with `accountId.orElse(null)`. */
        fun accountId(accountId: Optional<Long>) = accountId(accountId.getOrNull())

        /**
         * Sets [Builder.accountId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountId] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun accountId(accountId: JsonField<Long>) = apply { this.accountId = accountId }

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
         * Returns an immutable instance of [PrefillOrderAction].
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
        fun build(): PrefillOrderAction =
            PrefillOrderAction(
                checkRequired("orders", orders).map { it.toImmutable() },
                accountId,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PrefillOrderAction = apply {
        if (validated) {
            return@apply
        }

        orders().forEach { it.validate() }
        accountId()
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
        (orders.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (accountId.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PrefillOrderAction &&
            orders == other.orders &&
            accountId == other.accountId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(orders, accountId, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PrefillOrderAction{orders=$orders, accountId=$accountId, additionalProperties=$additionalProperties}"
}
