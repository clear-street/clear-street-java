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
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Represents a single fill of an order for an account. */
class Execution
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val orderId: JsonField<String>,
    private val quantity: JsonField<String>,
    private val side: JsonField<Side>,
    private val transactionTime: JsonField<OffsetDateTime>,
    private val instrumentId: JsonField<String>,
    private val price: JsonField<String>,
    private val symbol: JsonField<String>,
    private val underlyingInstrumentId: JsonField<String>,
    private val venue: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("order_id") @ExcludeMissing orderId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("quantity") @ExcludeMissing quantity: JsonField<String> = JsonMissing.of(),
        @JsonProperty("side") @ExcludeMissing side: JsonField<Side> = JsonMissing.of(),
        @JsonProperty("transaction_time")
        @ExcludeMissing
        transactionTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("instrument_id")
        @ExcludeMissing
        instrumentId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("price") @ExcludeMissing price: JsonField<String> = JsonMissing.of(),
        @JsonProperty("symbol") @ExcludeMissing symbol: JsonField<String> = JsonMissing.of(),
        @JsonProperty("underlying_instrument_id")
        @ExcludeMissing
        underlyingInstrumentId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("venue") @ExcludeMissing venue: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        orderId,
        quantity,
        side,
        transactionTime,
        instrumentId,
        price,
        symbol,
        underlyingInstrumentId,
        venue,
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
     * Identifier of the order this execution belongs to.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun orderId(): String = orderId.getRequired("order_id")

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
     * Transaction timestamp in nanosecond precision (UTC).
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun transactionTime(): OffsetDateTime = transactionTime.getRequired("transaction_time")

    /**
     * Unique instrument identifier. `null` when this fill has no single resolvable instrument. When
     * a null/undefined value is observed, it indicates it does not apply.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun instrumentId(): Optional<String> = instrumentId.getOptional("instrument_id")

    /**
     * Fill price. `null` for multileg fills, whose price lives only at the leg level. When a
     * null/undefined value is observed, it indicates it does not apply.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun price(): Optional<String> = price.getOptional("price")

    /**
     * Trading symbol. `null` when this fill has no single resolvable instrument. When a
     * null/undefined value is observed, it indicates it does not apply.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun symbol(): Optional<String> = symbol.getOptional("symbol")

    /**
     * Underlying instrument identifier for a derivative fill. `null` for a non-derivative fill,
     * when the underlier could not be resolved, or when a multileg fill's legs resolve to different
     * underliers. When a null/undefined value is observed, it indicates it does not apply.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun underlyingInstrumentId(): Optional<String> =
        underlyingInstrumentId.getOptional("underlying_instrument_id")

    /**
     * Venue where this fill occurred, as reported by that venue. Distinct from an order's `venue`,
     * which is the routing destination. Codes are not normalized, so the format varies by venue.
     * When a null/undefined value is observed, it indicates that there is no available data.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun venue(): Optional<String> = venue.getOptional("venue")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [orderId].
     *
     * Unlike [orderId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("order_id") @ExcludeMissing fun _orderId(): JsonField<String> = orderId

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
     * Returns the raw JSON value of [transactionTime].
     *
     * Unlike [transactionTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("transaction_time")
    @ExcludeMissing
    fun _transactionTime(): JsonField<OffsetDateTime> = transactionTime

    /**
     * Returns the raw JSON value of [instrumentId].
     *
     * Unlike [instrumentId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("instrument_id")
    @ExcludeMissing
    fun _instrumentId(): JsonField<String> = instrumentId

    /**
     * Returns the raw JSON value of [price].
     *
     * Unlike [price], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("price") @ExcludeMissing fun _price(): JsonField<String> = price

    /**
     * Returns the raw JSON value of [symbol].
     *
     * Unlike [symbol], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("symbol") @ExcludeMissing fun _symbol(): JsonField<String> = symbol

    /**
     * Returns the raw JSON value of [underlyingInstrumentId].
     *
     * Unlike [underlyingInstrumentId], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("underlying_instrument_id")
    @ExcludeMissing
    fun _underlyingInstrumentId(): JsonField<String> = underlyingInstrumentId

    /**
     * Returns the raw JSON value of [venue].
     *
     * Unlike [venue], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("venue") @ExcludeMissing fun _venue(): JsonField<String> = venue

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
         * .orderId()
         * .quantity()
         * .side()
         * .transactionTime()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Execution]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var orderId: JsonField<String>? = null
        private var quantity: JsonField<String>? = null
        private var side: JsonField<Side>? = null
        private var transactionTime: JsonField<OffsetDateTime>? = null
        private var instrumentId: JsonField<String> = JsonMissing.of()
        private var price: JsonField<String> = JsonMissing.of()
        private var symbol: JsonField<String> = JsonMissing.of()
        private var underlyingInstrumentId: JsonField<String> = JsonMissing.of()
        private var venue: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(execution: Execution) = apply {
            id = execution.id
            orderId = execution.orderId
            quantity = execution.quantity
            side = execution.side
            transactionTime = execution.transactionTime
            instrumentId = execution.instrumentId
            price = execution.price
            symbol = execution.symbol
            underlyingInstrumentId = execution.underlyingInstrumentId
            venue = execution.venue
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

        /** Identifier of the order this execution belongs to. */
        fun orderId(orderId: String) = orderId(JsonField.of(orderId))

        /**
         * Sets [Builder.orderId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.orderId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun orderId(orderId: JsonField<String>) = apply { this.orderId = orderId }

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

        /**
         * Unique instrument identifier. `null` when this fill has no single resolvable instrument.
         * When a null/undefined value is observed, it indicates it does not apply.
         */
        fun instrumentId(instrumentId: String?) = instrumentId(JsonField.ofNullable(instrumentId))

        /** Alias for calling [Builder.instrumentId] with `instrumentId.orElse(null)`. */
        fun instrumentId(instrumentId: Optional<String>) = instrumentId(instrumentId.getOrNull())

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

        /**
         * Fill price. `null` for multileg fills, whose price lives only at the leg level. When a
         * null/undefined value is observed, it indicates it does not apply.
         */
        fun price(price: String?) = price(JsonField.ofNullable(price))

        /** Alias for calling [Builder.price] with `price.orElse(null)`. */
        fun price(price: Optional<String>) = price(price.getOrNull())

        /**
         * Sets [Builder.price] to an arbitrary JSON value.
         *
         * You should usually call [Builder.price] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun price(price: JsonField<String>) = apply { this.price = price }

        /**
         * Trading symbol. `null` when this fill has no single resolvable instrument. When a
         * null/undefined value is observed, it indicates it does not apply.
         */
        fun symbol(symbol: String?) = symbol(JsonField.ofNullable(symbol))

        /** Alias for calling [Builder.symbol] with `symbol.orElse(null)`. */
        fun symbol(symbol: Optional<String>) = symbol(symbol.getOrNull())

        /**
         * Sets [Builder.symbol] to an arbitrary JSON value.
         *
         * You should usually call [Builder.symbol] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun symbol(symbol: JsonField<String>) = apply { this.symbol = symbol }

        /**
         * Underlying instrument identifier for a derivative fill. `null` for a non-derivative fill,
         * when the underlier could not be resolved, or when a multileg fill's legs resolve to
         * different underliers. When a null/undefined value is observed, it indicates it does not
         * apply.
         */
        fun underlyingInstrumentId(underlyingInstrumentId: String?) =
            underlyingInstrumentId(JsonField.ofNullable(underlyingInstrumentId))

        /**
         * Alias for calling [Builder.underlyingInstrumentId] with
         * `underlyingInstrumentId.orElse(null)`.
         */
        fun underlyingInstrumentId(underlyingInstrumentId: Optional<String>) =
            underlyingInstrumentId(underlyingInstrumentId.getOrNull())

        /**
         * Sets [Builder.underlyingInstrumentId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.underlyingInstrumentId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun underlyingInstrumentId(underlyingInstrumentId: JsonField<String>) = apply {
            this.underlyingInstrumentId = underlyingInstrumentId
        }

        /**
         * Venue where this fill occurred, as reported by that venue. Distinct from an order's
         * `venue`, which is the routing destination. Codes are not normalized, so the format varies
         * by venue. When a null/undefined value is observed, it indicates that there is no
         * available data.
         */
        fun venue(venue: String?) = venue(JsonField.ofNullable(venue))

        /** Alias for calling [Builder.venue] with `venue.orElse(null)`. */
        fun venue(venue: Optional<String>) = venue(venue.getOrNull())

        /**
         * Sets [Builder.venue] to an arbitrary JSON value.
         *
         * You should usually call [Builder.venue] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun venue(venue: JsonField<String>) = apply { this.venue = venue }

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
         * .orderId()
         * .quantity()
         * .side()
         * .transactionTime()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): Execution =
            Execution(
                checkRequired("id", id),
                checkRequired("orderId", orderId),
                checkRequired("quantity", quantity),
                checkRequired("side", side),
                checkRequired("transactionTime", transactionTime),
                instrumentId,
                price,
                symbol,
                underlyingInstrumentId,
                venue,
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
        orderId()
        quantity()
        side().validate()
        transactionTime()
        instrumentId()
        price()
        symbol()
        underlyingInstrumentId()
        venue()
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
            (if (orderId.asKnown().isPresent) 1 else 0) +
            (if (quantity.asKnown().isPresent) 1 else 0) +
            (side.asKnown().getOrNull()?.validity() ?: 0) +
            (if (transactionTime.asKnown().isPresent) 1 else 0) +
            (if (instrumentId.asKnown().isPresent) 1 else 0) +
            (if (price.asKnown().isPresent) 1 else 0) +
            (if (symbol.asKnown().isPresent) 1 else 0) +
            (if (underlyingInstrumentId.asKnown().isPresent) 1 else 0) +
            (if (venue.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Execution &&
            id == other.id &&
            orderId == other.orderId &&
            quantity == other.quantity &&
            side == other.side &&
            transactionTime == other.transactionTime &&
            instrumentId == other.instrumentId &&
            price == other.price &&
            symbol == other.symbol &&
            underlyingInstrumentId == other.underlyingInstrumentId &&
            venue == other.venue &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            orderId,
            quantity,
            side,
            transactionTime,
            instrumentId,
            price,
            symbol,
            underlyingInstrumentId,
            venue,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Execution{id=$id, orderId=$orderId, quantity=$quantity, side=$side, transactionTime=$transactionTime, instrumentId=$instrumentId, price=$price, symbol=$symbol, underlyingInstrumentId=$underlyingInstrumentId, venue=$venue, additionalProperties=$additionalProperties}"
}
