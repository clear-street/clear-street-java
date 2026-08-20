// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.omniai

import com.clearstreet.api.core.ExcludeMissing
import com.clearstreet.api.core.JsonField
import com.clearstreet.api.core.JsonMissing
import com.clearstreet.api.core.JsonValue
import com.clearstreet.api.core.checkRequired
import com.clearstreet.api.errors.ClearStreetInvalidDataException
import com.clearstreet.api.models.v1.orders.RequestOrderType
import com.clearstreet.api.models.v1.orders.RequestPositionEffect
import com.clearstreet.api.models.v1.orders.RequestTimeInForce
import com.clearstreet.api.models.v1.orders.Side
import com.clearstreet.api.models.v1.orders.TrailingOffsetType
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Request to submit a new order (PlaceOrderRequest from spec) */
class PrefillNewOrderRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val orderType: JsonField<RequestOrderType>,
    private val quantity: JsonField<String>,
    private val side: JsonField<Side>,
    private val timeInForce: JsonField<RequestTimeInForce>,
    private val id: JsonField<String>,
    private val expiresAt: JsonField<OffsetDateTime>,
    private val extendedHours: JsonField<Boolean>,
    private val instrumentId: JsonField<String>,
    private val itemId: JsonField<String>,
    private val limitOffset: JsonField<String>,
    private val limitPrice: JsonField<String>,
    private val positionIntent: JsonField<RequestPositionEffect>,
    private val stopPrice: JsonField<String>,
    private val symbol: JsonField<String>,
    private val trailingOffset: JsonField<String>,
    private val trailingOffsetType: JsonField<TrailingOffsetType>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("order_type")
        @ExcludeMissing
        orderType: JsonField<RequestOrderType> = JsonMissing.of(),
        @JsonProperty("quantity") @ExcludeMissing quantity: JsonField<String> = JsonMissing.of(),
        @JsonProperty("side") @ExcludeMissing side: JsonField<Side> = JsonMissing.of(),
        @JsonProperty("time_in_force")
        @ExcludeMissing
        timeInForce: JsonField<RequestTimeInForce> = JsonMissing.of(),
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("expires_at")
        @ExcludeMissing
        expiresAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("extended_hours")
        @ExcludeMissing
        extendedHours: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("instrument_id")
        @ExcludeMissing
        instrumentId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("item_id") @ExcludeMissing itemId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("limit_offset")
        @ExcludeMissing
        limitOffset: JsonField<String> = JsonMissing.of(),
        @JsonProperty("limit_price")
        @ExcludeMissing
        limitPrice: JsonField<String> = JsonMissing.of(),
        @JsonProperty("position_intent")
        @ExcludeMissing
        positionIntent: JsonField<RequestPositionEffect> = JsonMissing.of(),
        @JsonProperty("stop_price") @ExcludeMissing stopPrice: JsonField<String> = JsonMissing.of(),
        @JsonProperty("symbol") @ExcludeMissing symbol: JsonField<String> = JsonMissing.of(),
        @JsonProperty("trailing_offset")
        @ExcludeMissing
        trailingOffset: JsonField<String> = JsonMissing.of(),
        @JsonProperty("trailing_offset_type")
        @ExcludeMissing
        trailingOffsetType: JsonField<TrailingOffsetType> = JsonMissing.of(),
    ) : this(
        orderType,
        quantity,
        side,
        timeInForce,
        id,
        expiresAt,
        extendedHours,
        instrumentId,
        itemId,
        limitOffset,
        limitPrice,
        positionIntent,
        stopPrice,
        symbol,
        trailingOffset,
        trailingOffsetType,
        mutableMapOf(),
    )

    /**
     * Type of order
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun orderType(): RequestOrderType = orderType.getRequired("order_type")

    /**
     * Quantity to trade. For COMMON_STOCK: shares (may be fractional if supported). For OPTION
     * (single-leg): contracts (must be an integer)
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun quantity(): String = quantity.getRequired("quantity")

    /**
     * Side of the order
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun side(): Side = side.getRequired("side")

    /**
     * Time in force
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun timeInForce(): RequestTimeInForce = timeInForce.getRequired("time_in_force")

    /**
     * Optional client-provided unique ID (idempotency). Required to be unique per account.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * The timestamp when the order should expire (UTC). Required when time_in_force is
     * GOOD_TILL_DATE.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun expiresAt(): Optional<OffsetDateTime> = expiresAt.getOptional("expires_at")

    /**
     * Allow trading outside regular trading hours. Some brokers disallow options outside RTH.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun extendedHours(): Optional<Boolean> = extendedHours.getOptional("extended_hours")

    /**
     * Instrument ID (UUID) or symbol (equity ticker or OSI option symbol). Either `symbol` or
     * `instrument_id` must be provided.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun instrumentId(): Optional<String> = instrumentId.getOptional("instrument_id")

    /**
     * Interaction-tracking identity. Absent on messages created before tracking. When a
     * null/undefined value is observed, it indicates that there is no available data.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun itemId(): Optional<String> = itemId.getOptional("item_id")

    /**
     * Limit offset for trailing stop-limit orders (signed)
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun limitOffset(): Optional<String> = limitOffset.getOptional("limit_offset")

    /**
     * Limit price (required for LIMIT and STOP_LIMIT orders)
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun limitPrice(): Optional<String> = limitPrice.getOptional("limit_price")

    /**
     * Optional open/close intent for this order. When omitted, the platform determines the position
     * effect.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun positionIntent(): Optional<RequestPositionEffect> =
        positionIntent.getOptional("position_intent")

    /**
     * Stop price (required for STOP and STOP_LIMIT orders)
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun stopPrice(): Optional<String> = stopPrice.getOptional("stop_price")

    /**
     * Trading symbol. For equities, use the ticker symbol (e.g., "TSLA"). For options, use the OSI
     * symbol (e.g., "TSLA 250117C00190000"). Either `symbol` or `instrument_id` must be provided.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun symbol(): Optional<String> = symbol.getOptional("symbol")

    /**
     * Trailing offset amount (required for trailing orders)
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun trailingOffset(): Optional<String> = trailingOffset.getOptional("trailing_offset")

    /**
     * Trailing offset type (PRICE or PERCENT_BPS)
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun trailingOffsetType(): Optional<TrailingOffsetType> =
        trailingOffsetType.getOptional("trailing_offset_type")

    /**
     * Returns the raw JSON value of [orderType].
     *
     * Unlike [orderType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("order_type")
    @ExcludeMissing
    fun _orderType(): JsonField<RequestOrderType> = orderType

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
     * Returns the raw JSON value of [timeInForce].
     *
     * Unlike [timeInForce], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("time_in_force")
    @ExcludeMissing
    fun _timeInForce(): JsonField<RequestTimeInForce> = timeInForce

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [expiresAt].
     *
     * Unlike [expiresAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("expires_at")
    @ExcludeMissing
    fun _expiresAt(): JsonField<OffsetDateTime> = expiresAt

    /**
     * Returns the raw JSON value of [extendedHours].
     *
     * Unlike [extendedHours], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("extended_hours")
    @ExcludeMissing
    fun _extendedHours(): JsonField<Boolean> = extendedHours

    /**
     * Returns the raw JSON value of [instrumentId].
     *
     * Unlike [instrumentId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("instrument_id")
    @ExcludeMissing
    fun _instrumentId(): JsonField<String> = instrumentId

    /**
     * Returns the raw JSON value of [itemId].
     *
     * Unlike [itemId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("item_id") @ExcludeMissing fun _itemId(): JsonField<String> = itemId

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
     * Returns the raw JSON value of [positionIntent].
     *
     * Unlike [positionIntent], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("position_intent")
    @ExcludeMissing
    fun _positionIntent(): JsonField<RequestPositionEffect> = positionIntent

    /**
     * Returns the raw JSON value of [stopPrice].
     *
     * Unlike [stopPrice], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("stop_price") @ExcludeMissing fun _stopPrice(): JsonField<String> = stopPrice

    /**
     * Returns the raw JSON value of [symbol].
     *
     * Unlike [symbol], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("symbol") @ExcludeMissing fun _symbol(): JsonField<String> = symbol

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

        /**
         * Returns a mutable builder for constructing an instance of [PrefillNewOrderRequest].
         *
         * The following fields are required:
         * ```java
         * .orderType()
         * .quantity()
         * .side()
         * .timeInForce()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PrefillNewOrderRequest]. */
    class Builder internal constructor() {

        private var orderType: JsonField<RequestOrderType>? = null
        private var quantity: JsonField<String>? = null
        private var side: JsonField<Side>? = null
        private var timeInForce: JsonField<RequestTimeInForce>? = null
        private var id: JsonField<String> = JsonMissing.of()
        private var expiresAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var extendedHours: JsonField<Boolean> = JsonMissing.of()
        private var instrumentId: JsonField<String> = JsonMissing.of()
        private var itemId: JsonField<String> = JsonMissing.of()
        private var limitOffset: JsonField<String> = JsonMissing.of()
        private var limitPrice: JsonField<String> = JsonMissing.of()
        private var positionIntent: JsonField<RequestPositionEffect> = JsonMissing.of()
        private var stopPrice: JsonField<String> = JsonMissing.of()
        private var symbol: JsonField<String> = JsonMissing.of()
        private var trailingOffset: JsonField<String> = JsonMissing.of()
        private var trailingOffsetType: JsonField<TrailingOffsetType> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(prefillNewOrderRequest: PrefillNewOrderRequest) = apply {
            orderType = prefillNewOrderRequest.orderType
            quantity = prefillNewOrderRequest.quantity
            side = prefillNewOrderRequest.side
            timeInForce = prefillNewOrderRequest.timeInForce
            id = prefillNewOrderRequest.id
            expiresAt = prefillNewOrderRequest.expiresAt
            extendedHours = prefillNewOrderRequest.extendedHours
            instrumentId = prefillNewOrderRequest.instrumentId
            itemId = prefillNewOrderRequest.itemId
            limitOffset = prefillNewOrderRequest.limitOffset
            limitPrice = prefillNewOrderRequest.limitPrice
            positionIntent = prefillNewOrderRequest.positionIntent
            stopPrice = prefillNewOrderRequest.stopPrice
            symbol = prefillNewOrderRequest.symbol
            trailingOffset = prefillNewOrderRequest.trailingOffset
            trailingOffsetType = prefillNewOrderRequest.trailingOffsetType
            additionalProperties = prefillNewOrderRequest.additionalProperties.toMutableMap()
        }

        /** Type of order */
        fun orderType(orderType: RequestOrderType) = orderType(JsonField.of(orderType))

        /**
         * Sets [Builder.orderType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.orderType] with a well-typed [RequestOrderType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun orderType(orderType: JsonField<RequestOrderType>) = apply { this.orderType = orderType }

        /**
         * Quantity to trade. For COMMON_STOCK: shares (may be fractional if supported). For OPTION
         * (single-leg): contracts (must be an integer)
         */
        fun quantity(quantity: String) = quantity(JsonField.of(quantity))

        /**
         * Sets [Builder.quantity] to an arbitrary JSON value.
         *
         * You should usually call [Builder.quantity] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun quantity(quantity: JsonField<String>) = apply { this.quantity = quantity }

        /** Side of the order */
        fun side(side: Side) = side(JsonField.of(side))

        /**
         * Sets [Builder.side] to an arbitrary JSON value.
         *
         * You should usually call [Builder.side] with a well-typed [Side] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun side(side: JsonField<Side>) = apply { this.side = side }

        /** Time in force */
        fun timeInForce(timeInForce: RequestTimeInForce) = timeInForce(JsonField.of(timeInForce))

        /**
         * Sets [Builder.timeInForce] to an arbitrary JSON value.
         *
         * You should usually call [Builder.timeInForce] with a well-typed [RequestTimeInForce]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun timeInForce(timeInForce: JsonField<RequestTimeInForce>) = apply {
            this.timeInForce = timeInForce
        }

        /** Optional client-provided unique ID (idempotency). Required to be unique per account. */
        fun id(id: String?) = id(JsonField.ofNullable(id))

        /** Alias for calling [Builder.id] with `id.orElse(null)`. */
        fun id(id: Optional<String>) = id(id.getOrNull())

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * The timestamp when the order should expire (UTC). Required when time_in_force is
         * GOOD_TILL_DATE.
         */
        fun expiresAt(expiresAt: OffsetDateTime?) = expiresAt(JsonField.ofNullable(expiresAt))

        /** Alias for calling [Builder.expiresAt] with `expiresAt.orElse(null)`. */
        fun expiresAt(expiresAt: Optional<OffsetDateTime>) = expiresAt(expiresAt.getOrNull())

        /**
         * Sets [Builder.expiresAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expiresAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun expiresAt(expiresAt: JsonField<OffsetDateTime>) = apply { this.expiresAt = expiresAt }

        /**
         * Allow trading outside regular trading hours. Some brokers disallow options outside RTH.
         */
        fun extendedHours(extendedHours: Boolean?) =
            extendedHours(JsonField.ofNullable(extendedHours))

        /**
         * Alias for [Builder.extendedHours].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun extendedHours(extendedHours: Boolean) = extendedHours(extendedHours as Boolean?)

        /** Alias for calling [Builder.extendedHours] with `extendedHours.orElse(null)`. */
        fun extendedHours(extendedHours: Optional<Boolean>) =
            extendedHours(extendedHours.getOrNull())

        /**
         * Sets [Builder.extendedHours] to an arbitrary JSON value.
         *
         * You should usually call [Builder.extendedHours] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun extendedHours(extendedHours: JsonField<Boolean>) = apply {
            this.extendedHours = extendedHours
        }

        /**
         * Instrument ID (UUID) or symbol (equity ticker or OSI option symbol). Either `symbol` or
         * `instrument_id` must be provided.
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
         * Interaction-tracking identity. Absent on messages created before tracking. When a
         * null/undefined value is observed, it indicates that there is no available data.
         */
        fun itemId(itemId: String?) = itemId(JsonField.ofNullable(itemId))

        /** Alias for calling [Builder.itemId] with `itemId.orElse(null)`. */
        fun itemId(itemId: Optional<String>) = itemId(itemId.getOrNull())

        /**
         * Sets [Builder.itemId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.itemId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun itemId(itemId: JsonField<String>) = apply { this.itemId = itemId }

        /** Limit offset for trailing stop-limit orders (signed) */
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

        /** Limit price (required for LIMIT and STOP_LIMIT orders) */
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

        /**
         * Optional open/close intent for this order. When omitted, the platform determines the
         * position effect.
         */
        fun positionIntent(positionIntent: RequestPositionEffect?) =
            positionIntent(JsonField.ofNullable(positionIntent))

        /** Alias for calling [Builder.positionIntent] with `positionIntent.orElse(null)`. */
        fun positionIntent(positionIntent: Optional<RequestPositionEffect>) =
            positionIntent(positionIntent.getOrNull())

        /**
         * Sets [Builder.positionIntent] to an arbitrary JSON value.
         *
         * You should usually call [Builder.positionIntent] with a well-typed
         * [RequestPositionEffect] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun positionIntent(positionIntent: JsonField<RequestPositionEffect>) = apply {
            this.positionIntent = positionIntent
        }

        /** Stop price (required for STOP and STOP_LIMIT orders) */
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

        /**
         * Trading symbol. For equities, use the ticker symbol (e.g., "TSLA"). For options, use the
         * OSI symbol (e.g., "TSLA 250117C00190000"). Either `symbol` or `instrument_id` must be
         * provided.
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

        /** Trailing offset amount (required for trailing orders) */
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

        /** Trailing offset type (PRICE or PERCENT_BPS) */
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
         * Returns an immutable instance of [PrefillNewOrderRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .orderType()
         * .quantity()
         * .side()
         * .timeInForce()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PrefillNewOrderRequest =
            PrefillNewOrderRequest(
                checkRequired("orderType", orderType),
                checkRequired("quantity", quantity),
                checkRequired("side", side),
                checkRequired("timeInForce", timeInForce),
                id,
                expiresAt,
                extendedHours,
                instrumentId,
                itemId,
                limitOffset,
                limitPrice,
                positionIntent,
                stopPrice,
                symbol,
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
    fun validate(): PrefillNewOrderRequest = apply {
        if (validated) {
            return@apply
        }

        orderType().validate()
        quantity()
        side().validate()
        timeInForce().validate()
        id()
        expiresAt()
        extendedHours()
        instrumentId()
        itemId()
        limitOffset()
        limitPrice()
        positionIntent().ifPresent { it.validate() }
        stopPrice()
        symbol()
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
        (orderType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (quantity.asKnown().isPresent) 1 else 0) +
            (side.asKnown().getOrNull()?.validity() ?: 0) +
            (timeInForce.asKnown().getOrNull()?.validity() ?: 0) +
            (if (id.asKnown().isPresent) 1 else 0) +
            (if (expiresAt.asKnown().isPresent) 1 else 0) +
            (if (extendedHours.asKnown().isPresent) 1 else 0) +
            (if (instrumentId.asKnown().isPresent) 1 else 0) +
            (if (itemId.asKnown().isPresent) 1 else 0) +
            (if (limitOffset.asKnown().isPresent) 1 else 0) +
            (if (limitPrice.asKnown().isPresent) 1 else 0) +
            (positionIntent.asKnown().getOrNull()?.validity() ?: 0) +
            (if (stopPrice.asKnown().isPresent) 1 else 0) +
            (if (symbol.asKnown().isPresent) 1 else 0) +
            (if (trailingOffset.asKnown().isPresent) 1 else 0) +
            (trailingOffsetType.asKnown().getOrNull()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PrefillNewOrderRequest &&
            orderType == other.orderType &&
            quantity == other.quantity &&
            side == other.side &&
            timeInForce == other.timeInForce &&
            id == other.id &&
            expiresAt == other.expiresAt &&
            extendedHours == other.extendedHours &&
            instrumentId == other.instrumentId &&
            itemId == other.itemId &&
            limitOffset == other.limitOffset &&
            limitPrice == other.limitPrice &&
            positionIntent == other.positionIntent &&
            stopPrice == other.stopPrice &&
            symbol == other.symbol &&
            trailingOffset == other.trailingOffset &&
            trailingOffsetType == other.trailingOffsetType &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            orderType,
            quantity,
            side,
            timeInForce,
            id,
            expiresAt,
            extendedHours,
            instrumentId,
            itemId,
            limitOffset,
            limitPrice,
            positionIntent,
            stopPrice,
            symbol,
            trailingOffset,
            trailingOffsetType,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PrefillNewOrderRequest{orderType=$orderType, quantity=$quantity, side=$side, timeInForce=$timeInForce, id=$id, expiresAt=$expiresAt, extendedHours=$extendedHours, instrumentId=$instrumentId, itemId=$itemId, limitOffset=$limitOffset, limitPrice=$limitPrice, positionIntent=$positionIntent, stopPrice=$stopPrice, symbol=$symbol, trailingOffset=$trailingOffset, trailingOffsetType=$trailingOffsetType, additionalProperties=$additionalProperties}"
}
