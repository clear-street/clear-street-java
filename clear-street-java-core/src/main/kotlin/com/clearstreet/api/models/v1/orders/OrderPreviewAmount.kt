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

/** Monetary size of the previewed order. */
class OrderPreviewAmount
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val grossAmount: JsonField<String>,
    private val netAmount: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("gross_amount")
        @ExcludeMissing
        grossAmount: JsonField<String> = JsonMissing.of(),
        @JsonProperty("net_amount") @ExcludeMissing netAmount: JsonField<String> = JsonMissing.of(),
    ) : this(grossAmount, netAmount, mutableMapOf())

    /**
     * Total cash impact of the order before estimated fees and commissions.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun grossAmount(): String = grossAmount.getRequired("gross_amount")

    /**
     * Total cash impact of the order after estimated fees and commissions.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun netAmount(): String = netAmount.getRequired("net_amount")

    /**
     * Returns the raw JSON value of [grossAmount].
     *
     * Unlike [grossAmount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("gross_amount")
    @ExcludeMissing
    fun _grossAmount(): JsonField<String> = grossAmount

    /**
     * Returns the raw JSON value of [netAmount].
     *
     * Unlike [netAmount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("net_amount") @ExcludeMissing fun _netAmount(): JsonField<String> = netAmount

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
         * Returns a mutable builder for constructing an instance of [OrderPreviewAmount].
         *
         * The following fields are required:
         * ```java
         * .grossAmount()
         * .netAmount()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [OrderPreviewAmount]. */
    class Builder internal constructor() {

        private var grossAmount: JsonField<String>? = null
        private var netAmount: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(orderPreviewAmount: OrderPreviewAmount) = apply {
            grossAmount = orderPreviewAmount.grossAmount
            netAmount = orderPreviewAmount.netAmount
            additionalProperties = orderPreviewAmount.additionalProperties.toMutableMap()
        }

        /** Total cash impact of the order before estimated fees and commissions. */
        fun grossAmount(grossAmount: String) = grossAmount(JsonField.of(grossAmount))

        /**
         * Sets [Builder.grossAmount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.grossAmount] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun grossAmount(grossAmount: JsonField<String>) = apply { this.grossAmount = grossAmount }

        /** Total cash impact of the order after estimated fees and commissions. */
        fun netAmount(netAmount: String) = netAmount(JsonField.of(netAmount))

        /**
         * Sets [Builder.netAmount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.netAmount] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun netAmount(netAmount: JsonField<String>) = apply { this.netAmount = netAmount }

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
         * Returns an immutable instance of [OrderPreviewAmount].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .grossAmount()
         * .netAmount()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): OrderPreviewAmount =
            OrderPreviewAmount(
                checkRequired("grossAmount", grossAmount),
                checkRequired("netAmount", netAmount),
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
    fun validate(): OrderPreviewAmount = apply {
        if (validated) {
            return@apply
        }

        grossAmount()
        netAmount()
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
        (if (grossAmount.asKnown().isPresent) 1 else 0) +
            (if (netAmount.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is OrderPreviewAmount &&
            grossAmount == other.grossAmount &&
            netAmount == other.netAmount &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(grossAmount, netAmount, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "OrderPreviewAmount{grossAmount=$grossAmount, netAmount=$netAmount, additionalProperties=$additionalProperties}"
}
