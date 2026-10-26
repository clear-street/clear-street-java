// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.orders

import com.clearstreet.api.core.ExcludeMissing
import com.clearstreet.api.core.JsonField
import com.clearstreet.api.core.JsonMissing
import com.clearstreet.api.core.JsonValue
import com.clearstreet.api.core.checkKnown
import com.clearstreet.api.core.checkRequired
import com.clearstreet.api.core.toImmutable
import com.clearstreet.api.errors.ClearStreetInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

/** The projected impact of an order, as if it were submitted and fully filled. */
class OrderPreview
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val accountId: JsonField<Long>,
    private val amount: JsonField<OrderPreviewAmount>,
    private val buyingPower: JsonField<OrderPreviewDelta>,
    private val currency: JsonField<String>,
    private val equity: JsonField<OrderPreviewDelta>,
    private val errors: JsonField<List<OrderPreviewError>>,
    private val marginDetails: JsonField<OrderPreviewMarginDetails>,
    private val positions: JsonField<List<OrderPreviewPosition>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("account_id") @ExcludeMissing accountId: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("amount")
        @ExcludeMissing
        amount: JsonField<OrderPreviewAmount> = JsonMissing.of(),
        @JsonProperty("buying_power")
        @ExcludeMissing
        buyingPower: JsonField<OrderPreviewDelta> = JsonMissing.of(),
        @JsonProperty("currency") @ExcludeMissing currency: JsonField<String> = JsonMissing.of(),
        @JsonProperty("equity")
        @ExcludeMissing
        equity: JsonField<OrderPreviewDelta> = JsonMissing.of(),
        @JsonProperty("errors")
        @ExcludeMissing
        errors: JsonField<List<OrderPreviewError>> = JsonMissing.of(),
        @JsonProperty("margin_details")
        @ExcludeMissing
        marginDetails: JsonField<OrderPreviewMarginDetails> = JsonMissing.of(),
        @JsonProperty("positions")
        @ExcludeMissing
        positions: JsonField<List<OrderPreviewPosition>> = JsonMissing.of(),
    ) : this(
        accountId,
        amount,
        buyingPower,
        currency,
        equity,
        errors,
        marginDetails,
        positions,
        mutableMapOf(),
    )

    /**
     * The account the order was previewed for.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun accountId(): Long = accountId.getRequired("account_id")

    /**
     * Monetary size of the previewed order.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun amount(): OrderPreviewAmount = amount.getRequired("amount")

    /**
     * Buying power before and after the order.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun buyingPower(): OrderPreviewDelta = buyingPower.getRequired("buying_power")

    /**
     * Currency for all monetary values.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun currency(): String = currency.getRequired("currency")

    /**
     * Account equity before and after the order.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun equity(): OrderPreviewDelta = equity.getRequired("equity")

    /**
     * Risk-check errors that would prevent the order from being accepted. Empty when the order
     * would pass every pre-trade risk check.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun errors(): List<OrderPreviewError> = errors.getRequired("errors")

    /**
     * Margin requirements and excess before and after the order.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun marginDetails(): OrderPreviewMarginDetails = marginDetails.getRequired("margin_details")

    /**
     * Positions in the traded instruments before and after the order.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun positions(): List<OrderPreviewPosition> = positions.getRequired("positions")

    /**
     * Returns the raw JSON value of [accountId].
     *
     * Unlike [accountId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("account_id") @ExcludeMissing fun _accountId(): JsonField<Long> = accountId

    /**
     * Returns the raw JSON value of [amount].
     *
     * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<OrderPreviewAmount> = amount

    /**
     * Returns the raw JSON value of [buyingPower].
     *
     * Unlike [buyingPower], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("buying_power")
    @ExcludeMissing
    fun _buyingPower(): JsonField<OrderPreviewDelta> = buyingPower

    /**
     * Returns the raw JSON value of [currency].
     *
     * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

    /**
     * Returns the raw JSON value of [equity].
     *
     * Unlike [equity], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("equity") @ExcludeMissing fun _equity(): JsonField<OrderPreviewDelta> = equity

    /**
     * Returns the raw JSON value of [errors].
     *
     * Unlike [errors], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("errors")
    @ExcludeMissing
    fun _errors(): JsonField<List<OrderPreviewError>> = errors

    /**
     * Returns the raw JSON value of [marginDetails].
     *
     * Unlike [marginDetails], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("margin_details")
    @ExcludeMissing
    fun _marginDetails(): JsonField<OrderPreviewMarginDetails> = marginDetails

    /**
     * Returns the raw JSON value of [positions].
     *
     * Unlike [positions], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("positions")
    @ExcludeMissing
    fun _positions(): JsonField<List<OrderPreviewPosition>> = positions

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
         * Returns a mutable builder for constructing an instance of [OrderPreview].
         *
         * The following fields are required:
         * ```java
         * .accountId()
         * .amount()
         * .buyingPower()
         * .currency()
         * .equity()
         * .errors()
         * .marginDetails()
         * .positions()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [OrderPreview]. */
    class Builder internal constructor() {

        private var accountId: JsonField<Long>? = null
        private var amount: JsonField<OrderPreviewAmount>? = null
        private var buyingPower: JsonField<OrderPreviewDelta>? = null
        private var currency: JsonField<String>? = null
        private var equity: JsonField<OrderPreviewDelta>? = null
        private var errors: JsonField<MutableList<OrderPreviewError>>? = null
        private var marginDetails: JsonField<OrderPreviewMarginDetails>? = null
        private var positions: JsonField<MutableList<OrderPreviewPosition>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(orderPreview: OrderPreview) = apply {
            accountId = orderPreview.accountId
            amount = orderPreview.amount
            buyingPower = orderPreview.buyingPower
            currency = orderPreview.currency
            equity = orderPreview.equity
            errors = orderPreview.errors.map { it.toMutableList() }
            marginDetails = orderPreview.marginDetails
            positions = orderPreview.positions.map { it.toMutableList() }
            additionalProperties = orderPreview.additionalProperties.toMutableMap()
        }

        /** The account the order was previewed for. */
        fun accountId(accountId: Long) = accountId(JsonField.of(accountId))

        /**
         * Sets [Builder.accountId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountId] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun accountId(accountId: JsonField<Long>) = apply { this.accountId = accountId }

        /** Monetary size of the previewed order. */
        fun amount(amount: OrderPreviewAmount) = amount(JsonField.of(amount))

        /**
         * Sets [Builder.amount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amount] with a well-typed [OrderPreviewAmount] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun amount(amount: JsonField<OrderPreviewAmount>) = apply { this.amount = amount }

        /** Buying power before and after the order. */
        fun buyingPower(buyingPower: OrderPreviewDelta) = buyingPower(JsonField.of(buyingPower))

        /**
         * Sets [Builder.buyingPower] to an arbitrary JSON value.
         *
         * You should usually call [Builder.buyingPower] with a well-typed [OrderPreviewDelta] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun buyingPower(buyingPower: JsonField<OrderPreviewDelta>) = apply {
            this.buyingPower = buyingPower
        }

        /** Currency for all monetary values. */
        fun currency(currency: String) = currency(JsonField.of(currency))

        /**
         * Sets [Builder.currency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currency] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun currency(currency: JsonField<String>) = apply { this.currency = currency }

        /** Account equity before and after the order. */
        fun equity(equity: OrderPreviewDelta) = equity(JsonField.of(equity))

        /**
         * Sets [Builder.equity] to an arbitrary JSON value.
         *
         * You should usually call [Builder.equity] with a well-typed [OrderPreviewDelta] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun equity(equity: JsonField<OrderPreviewDelta>) = apply { this.equity = equity }

        /**
         * Risk-check errors that would prevent the order from being accepted. Empty when the order
         * would pass every pre-trade risk check.
         */
        fun errors(errors: List<OrderPreviewError>) = errors(JsonField.of(errors))

        /**
         * Sets [Builder.errors] to an arbitrary JSON value.
         *
         * You should usually call [Builder.errors] with a well-typed `List<OrderPreviewError>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun errors(errors: JsonField<List<OrderPreviewError>>) = apply {
            this.errors = errors.map { it.toMutableList() }
        }

        /**
         * Adds a single [OrderPreviewError] to [errors].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addError(error: OrderPreviewError) = apply {
            errors =
                (errors ?: JsonField.of(mutableListOf())).also {
                    checkKnown("errors", it).add(error)
                }
        }

        /** Margin requirements and excess before and after the order. */
        fun marginDetails(marginDetails: OrderPreviewMarginDetails) =
            marginDetails(JsonField.of(marginDetails))

        /**
         * Sets [Builder.marginDetails] to an arbitrary JSON value.
         *
         * You should usually call [Builder.marginDetails] with a well-typed
         * [OrderPreviewMarginDetails] value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun marginDetails(marginDetails: JsonField<OrderPreviewMarginDetails>) = apply {
            this.marginDetails = marginDetails
        }

        /** Positions in the traded instruments before and after the order. */
        fun positions(positions: List<OrderPreviewPosition>) = positions(JsonField.of(positions))

        /**
         * Sets [Builder.positions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.positions] with a well-typed
         * `List<OrderPreviewPosition>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun positions(positions: JsonField<List<OrderPreviewPosition>>) = apply {
            this.positions = positions.map { it.toMutableList() }
        }

        /**
         * Adds a single [OrderPreviewPosition] to [positions].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPosition(position: OrderPreviewPosition) = apply {
            positions =
                (positions ?: JsonField.of(mutableListOf())).also {
                    checkKnown("positions", it).add(position)
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
         * Returns an immutable instance of [OrderPreview].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .accountId()
         * .amount()
         * .buyingPower()
         * .currency()
         * .equity()
         * .errors()
         * .marginDetails()
         * .positions()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): OrderPreview =
            OrderPreview(
                checkRequired("accountId", accountId),
                checkRequired("amount", amount),
                checkRequired("buyingPower", buyingPower),
                checkRequired("currency", currency),
                checkRequired("equity", equity),
                checkRequired("errors", errors).map { it.toImmutable() },
                checkRequired("marginDetails", marginDetails),
                checkRequired("positions", positions).map { it.toImmutable() },
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
    fun validate(): OrderPreview = apply {
        if (validated) {
            return@apply
        }

        accountId()
        amount().validate()
        buyingPower().validate()
        currency()
        equity().validate()
        errors().forEach { it.validate() }
        marginDetails().validate()
        positions().forEach { it.validate() }
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
        (if (accountId.asKnown().isPresent) 1 else 0) +
            (amount.asKnown().getOrNull()?.validity() ?: 0) +
            (buyingPower.asKnown().getOrNull()?.validity() ?: 0) +
            (if (currency.asKnown().isPresent) 1 else 0) +
            (equity.asKnown().getOrNull()?.validity() ?: 0) +
            (errors.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (marginDetails.asKnown().getOrNull()?.validity() ?: 0) +
            (positions.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is OrderPreview &&
            accountId == other.accountId &&
            amount == other.amount &&
            buyingPower == other.buyingPower &&
            currency == other.currency &&
            equity == other.equity &&
            errors == other.errors &&
            marginDetails == other.marginDetails &&
            positions == other.positions &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            accountId,
            amount,
            buyingPower,
            currency,
            equity,
            errors,
            marginDetails,
            positions,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "OrderPreview{accountId=$accountId, amount=$amount, buyingPower=$buyingPower, currency=$currency, equity=$equity, errors=$errors, marginDetails=$marginDetails, positions=$positions, additionalProperties=$additionalProperties}"
}
