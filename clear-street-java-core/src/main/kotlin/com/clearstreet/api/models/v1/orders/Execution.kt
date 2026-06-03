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
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

/** Represents a single fill of an order for an account. */
class Execution
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val instrumentId: JsonField<String>,
    private val orderId: JsonField<String>,
    private val price: JsonField<String>,
    private val quantity: JsonField<String>,
    private val side: JsonField<Side>,
    private val symbol: JsonField<String>,
    private val transactionTime: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("instrument_id")
        @ExcludeMissing
        instrumentId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("order_id") @ExcludeMissing orderId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("price") @ExcludeMissing price: JsonField<String> = JsonMissing.of(),
        @JsonProperty("quantity") @ExcludeMissing quantity: JsonField<String> = JsonMissing.of(),
        @JsonProperty("side") @ExcludeMissing side: JsonField<Side> = JsonMissing.of(),
        @JsonProperty("symbol") @ExcludeMissing symbol: JsonField<String> = JsonMissing.of(),
        @JsonProperty("transaction_time")
        @ExcludeMissing
        transactionTime: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(
        id,
        instrumentId,
        orderId,
        price,
        quantity,
        side,
        symbol,
        transactionTime,
        mutableMapOf(),
    )

    /**
     * Unique identifier for this execution report.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * OEMS instrument identifier.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun instrumentId(): String = instrumentId.getRequired("instrument_id")

    /**
     * Identifier of the order this execution belongs to.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun orderId(): String = orderId.getRequired("order_id")

    /**
     * Fill price.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun price(): String = price.getRequired("price")

    /**
     * Filled quantity.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun quantity(): String = quantity.getRequired("quantity")

    /**
     * Side of the fill.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun side(): Side = side.getRequired("side")

    /**
     * Trading symbol.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun symbol(): String = symbol.getRequired("symbol")

    /**
     * Transaction timestamp in nanosecond precision (UTC).
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun transactionTime(): OffsetDateTime = transactionTime.getRequired("transaction_time")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [instrumentId].
     *
     * Unlike [instrumentId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("instrument_id")
    @ExcludeMissing
    fun _instrumentId(): JsonField<String> = instrumentId

    /**
     * Returns the raw JSON value of [orderId].
     *
     * Unlike [orderId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("order_id") @ExcludeMissing fun _orderId(): JsonField<String> = orderId

    /**
     * Returns the raw JSON value of [price].
     *
     * Unlike [price], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("price") @ExcludeMissing fun _price(): JsonField<String> = price

    /**
     * Returns the raw JSON value of [quantity].
     *
     * Unlike [quantity], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("quantity") @ExcludeMissing fun _quantity(): JsonField<String> = quantity

    /**
     * Returns the raw JSON value of [side].
     *
     * Unlike [side], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("side") @ExcludeMissing fun _side(): JsonField<Side> = side

    /**
     * Returns the raw JSON value of [symbol].
     *
     * Unlike [symbol], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("symbol") @ExcludeMissing fun _symbol(): JsonField<String> = symbol

    /**
     * Returns the raw JSON value of [transactionTime].
     *
     * Unlike [transactionTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("transaction_time")
    @ExcludeMissing
    fun _transactionTime(): JsonField<OffsetDateTime> = transactionTime

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
         * Returns a mutable builder for constructing an instance of [Execution].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .instrumentId()
         * .orderId()
         * .price()
         * .quantity()
         * .side()
         * .symbol()
         * .transactionTime()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Execution]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var instrumentId: JsonField<String>? = null
        private var orderId: JsonField<String>? = null
        private var price: JsonField<String>? = null
        private var quantity: JsonField<String>? = null
        private var side: JsonField<Side>? = null
        private var symbol: JsonField<String>? = null
        private var transactionTime: JsonField<OffsetDateTime>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(execution: Execution) = apply {
            id = execution.id
            instrumentId = execution.instrumentId
            orderId = execution.orderId
            price = execution.price
            quantity = execution.quantity
            side = execution.side
            symbol = execution.symbol
            transactionTime = execution.transactionTime
            additionalProperties = execution.additionalProperties.toMutableMap()
        }

        /** Unique identifier for this execution report. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** OEMS instrument identifier. */
        fun instrumentId(instrumentId: String) = instrumentId(JsonField.of(instrumentId))

        /**
         * Sets [Builder.instrumentId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.instrumentId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun instrumentId(instrumentId: JsonField<String>) = apply {
            this.instrumentId = instrumentId
        }

        /** Identifier of the order this execution belongs to. */
        fun orderId(orderId: String) = orderId(JsonField.of(orderId))

        /**
         * Sets [Builder.orderId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.orderId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun orderId(orderId: JsonField<String>) = apply { this.orderId = orderId }

        /** Fill price. */
        fun price(price: String) = price(JsonField.of(price))

        /**
         * Sets [Builder.price] to an arbitrary JSON value.
         *
         * You should usually call [Builder.price] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun price(price: JsonField<String>) = apply { this.price = price }

        /** Filled quantity. */
        fun quantity(quantity: String) = quantity(JsonField.of(quantity))

        /**
         * Sets [Builder.quantity] to an arbitrary JSON value.
         *
         * You should usually call [Builder.quantity] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun quantity(quantity: JsonField<String>) = apply { this.quantity = quantity }

        /** Side of the fill. */
        fun side(side: Side) = side(JsonField.of(side))

        /**
         * Sets [Builder.side] to an arbitrary JSON value.
         *
         * You should usually call [Builder.side] with a well-typed [Side] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun side(side: JsonField<Side>) = apply { this.side = side }

        /** Trading symbol. */
        fun symbol(symbol: String) = symbol(JsonField.of(symbol))

        /**
         * Sets [Builder.symbol] to an arbitrary JSON value.
         *
         * You should usually call [Builder.symbol] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun symbol(symbol: JsonField<String>) = apply { this.symbol = symbol }

        /** Transaction timestamp in nanosecond precision (UTC). */
        fun transactionTime(transactionTime: OffsetDateTime) =
            transactionTime(JsonField.of(transactionTime))

        /**
         * Sets [Builder.transactionTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.transactionTime] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun transactionTime(transactionTime: JsonField<OffsetDateTime>) = apply {
            this.transactionTime = transactionTime
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
         * Returns an immutable instance of [Execution].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .instrumentId()
         * .orderId()
         * .price()
         * .quantity()
         * .side()
         * .symbol()
         * .transactionTime()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): Execution =
            Execution(
                checkRequired("id", id),
                checkRequired("instrumentId", instrumentId),
                checkRequired("orderId", orderId),
                checkRequired("price", price),
                checkRequired("quantity", quantity),
                checkRequired("side", side),
                checkRequired("symbol", symbol),
                checkRequired("transactionTime", transactionTime),
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
    fun validate(): Execution = apply {
        if (validated) {
            return@apply
        }

        id()
        instrumentId()
        orderId()
        price()
        quantity()
        side().validate()
        symbol()
        transactionTime()
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
        (if (id.asKnown().isPresent) 1 else 0) +
            (if (instrumentId.asKnown().isPresent) 1 else 0) +
            (if (orderId.asKnown().isPresent) 1 else 0) +
            (if (price.asKnown().isPresent) 1 else 0) +
            (if (quantity.asKnown().isPresent) 1 else 0) +
            (side.asKnown().getOrNull()?.validity() ?: 0) +
            (if (symbol.asKnown().isPresent) 1 else 0) +
            (if (transactionTime.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Execution &&
            id == other.id &&
            instrumentId == other.instrumentId &&
            orderId == other.orderId &&
            price == other.price &&
            quantity == other.quantity &&
            side == other.side &&
            symbol == other.symbol &&
            transactionTime == other.transactionTime &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            instrumentId,
            orderId,
            price,
            quantity,
            side,
            symbol,
            transactionTime,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Execution{id=$id, instrumentId=$instrumentId, orderId=$orderId, price=$price, quantity=$quantity, side=$side, symbol=$symbol, transactionTime=$transactionTime, additionalProperties=$additionalProperties}"
}
