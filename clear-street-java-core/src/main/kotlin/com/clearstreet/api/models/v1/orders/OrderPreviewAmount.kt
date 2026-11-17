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

/** Monetary size of the previewed order. */
class OrderPreviewAmount
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val grossAmount: JsonField<String>,
    private val netAmount: JsonField<String>,
    private val fees: JsonField<Fees>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("gross_amount")
        @ExcludeMissing
        grossAmount: JsonField<String> = JsonMissing.of(),
        @JsonProperty("net_amount") @ExcludeMissing netAmount: JsonField<String> = JsonMissing.of(),
        @JsonProperty("fees") @ExcludeMissing fees: JsonField<Fees> = JsonMissing.of(),
    ) : this(grossAmount, netAmount, fees, mutableMapOf())

    /**
     * Total cash impact of the order before estimated fees and commissions.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun grossAmount(): String = grossAmount.getRequired("gross_amount")

    /**
     * Total cash impact of the order after estimated fees and commissions: `gross_amount` with
     * `fees.total` applied.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun netAmount(): String = netAmount.getRequired("net_amount")

    /**
     * Fees charged to the account, broken out by kind.
     *
     * Amounts are in the instrument's currency, at the full precision the venue reports. Statements
     * round each fill's fee to the cent, so they can differ by a fraction of a cent. A positive
     * amount is charged to the account; a negative amount is a rebate. New kinds of fee are added
     * as new optional fields, and `total` always includes them.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun fees(): Optional<Fees> = fees.getOptional("fees")

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

    /**
     * Returns the raw JSON value of [fees].
     *
     * Unlike [fees], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("fees") @ExcludeMissing fun _fees(): JsonField<Fees> = fees

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
        private var fees: JsonField<Fees> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(orderPreviewAmount: OrderPreviewAmount) = apply {
            grossAmount = orderPreviewAmount.grossAmount
            netAmount = orderPreviewAmount.netAmount
            fees = orderPreviewAmount.fees
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

        /**
         * Total cash impact of the order after estimated fees and commissions: `gross_amount` with
         * `fees.total` applied.
         */
        fun netAmount(netAmount: String) = netAmount(JsonField.of(netAmount))

        /**
         * Sets [Builder.netAmount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.netAmount] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun netAmount(netAmount: JsonField<String>) = apply { this.netAmount = netAmount }

        /**
         * Fees charged to the account, broken out by kind.
         *
         * Amounts are in the instrument's currency, at the full precision the venue reports.
         * Statements round each fill's fee to the cent, so they can differ by a fraction of a cent.
         * A positive amount is charged to the account; a negative amount is a rebate. New kinds of
         * fee are added as new optional fields, and `total` always includes them.
         */
        fun fees(fees: Fees) = fees(JsonField.of(fees))

        /**
         * Sets [Builder.fees] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fees] with a well-typed [Fees] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun fees(fees: JsonField<Fees>) = apply { this.fees = fees }

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
                fees,
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
        fees().ifPresent { it.validate() }
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
            (if (netAmount.asKnown().isPresent) 1 else 0) +
            (fees.asKnown().getOrNull()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is OrderPreviewAmount &&
            grossAmount == other.grossAmount &&
            netAmount == other.netAmount &&
            fees == other.fees &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(grossAmount, netAmount, fees, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "OrderPreviewAmount{grossAmount=$grossAmount, netAmount=$netAmount, fees=$fees, additionalProperties=$additionalProperties}"
}
