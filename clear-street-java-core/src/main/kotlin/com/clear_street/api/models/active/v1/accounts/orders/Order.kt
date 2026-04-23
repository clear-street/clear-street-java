// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.accounts.orders

import com.clear_street.api.core.ExcludeMissing
import com.clear_street.api.core.JsonField
import com.clear_street.api.core.JsonMissing
import com.clear_street.api.core.JsonValue
import com.clear_street.api.core.checkKnown
import com.clear_street.api.core.checkRequired
import com.clear_street.api.core.toImmutable
import com.clear_street.api.errors.ClearStreetInvalidDataException
import com.clear_street.api.models.active.v1.SecurityIdSource
import com.clear_street.api.models.active.v1.SecurityType
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * A trading order with its current state and execution details.
 *
 * This is the unified API representation of an order across its lifecycle, combining data from
 * execution reports, order status queries, and parent/child tracking.
 */
class Order
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val accountId: JsonField<Long>,
    private val clientOrderId: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val filledQuantity: JsonField<String>,
    private val leavesQuantity: JsonField<String>,
    private val orderType: JsonField<OrderType>,
    private val quantity: JsonField<String>,
    private val securityId: JsonField<String>,
    private val securityIdSource: JsonField<SecurityIdSource>,
    private val securityType: JsonField<SecurityType>,
    private val side: JsonField<Side>,
    private val status: JsonField<OrderStatus>,
    private val symbol: JsonField<String>,
    private val timeInForce: JsonField<TimeInForce>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val venue: JsonField<String>,
    private val averageFillPrice: JsonField<String>,
    private val details: JsonField<List<String>>,
    private val expiresAt: JsonField<OffsetDateTime>,
    private val limitOffset: JsonField<String>,
    private val limitPrice: JsonField<String>,
    private val stopPrice: JsonField<String>,
    private val strategy: JsonField<OrderStrategy>,
    private val trailingOffsetAmt: JsonField<String>,
    private val trailingOffsetAmtType: JsonField<TrailingOffsetType>,
    private val trailingWatermarkPx: JsonField<String>,
    private val trailingWatermarkTs: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("account_id") @ExcludeMissing accountId: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("client_order_id")
        @ExcludeMissing
        clientOrderId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("filled_quantity")
        @ExcludeMissing
        filledQuantity: JsonField<String> = JsonMissing.of(),
        @JsonProperty("leaves_quantity")
        @ExcludeMissing
        leavesQuantity: JsonField<String> = JsonMissing.of(),
        @JsonProperty("order_type")
        @ExcludeMissing
        orderType: JsonField<OrderType> = JsonMissing.of(),
        @JsonProperty("quantity") @ExcludeMissing quantity: JsonField<String> = JsonMissing.of(),
        @JsonProperty("security_id")
        @ExcludeMissing
        securityId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("security_id_source")
        @ExcludeMissing
        securityIdSource: JsonField<SecurityIdSource> = JsonMissing.of(),
        @JsonProperty("security_type")
        @ExcludeMissing
        securityType: JsonField<SecurityType> = JsonMissing.of(),
        @JsonProperty("side") @ExcludeMissing side: JsonField<Side> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<OrderStatus> = JsonMissing.of(),
        @JsonProperty("symbol") @ExcludeMissing symbol: JsonField<String> = JsonMissing.of(),
        @JsonProperty("time_in_force")
        @ExcludeMissing
        timeInForce: JsonField<TimeInForce> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("venue") @ExcludeMissing venue: JsonField<String> = JsonMissing.of(),
        @JsonProperty("average_fill_price")
        @ExcludeMissing
        averageFillPrice: JsonField<String> = JsonMissing.of(),
        @JsonProperty("details")
        @ExcludeMissing
        details: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("expires_at")
        @ExcludeMissing
        expiresAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("limit_offset")
        @ExcludeMissing
        limitOffset: JsonField<String> = JsonMissing.of(),
        @JsonProperty("limit_price")
        @ExcludeMissing
        limitPrice: JsonField<String> = JsonMissing.of(),
        @JsonProperty("stop_price") @ExcludeMissing stopPrice: JsonField<String> = JsonMissing.of(),
        @JsonProperty("strategy")
        @ExcludeMissing
        strategy: JsonField<OrderStrategy> = JsonMissing.of(),
        @JsonProperty("trailing_offset_amt")
        @ExcludeMissing
        trailingOffsetAmt: JsonField<String> = JsonMissing.of(),
        @JsonProperty("trailing_offset_amt_type")
        @ExcludeMissing
        trailingOffsetAmtType: JsonField<TrailingOffsetType> = JsonMissing.of(),
        @JsonProperty("trailing_watermark_px")
        @ExcludeMissing
        trailingWatermarkPx: JsonField<String> = JsonMissing.of(),
        @JsonProperty("trailing_watermark_ts")
        @ExcludeMissing
        trailingWatermarkTs: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(
        id,
        accountId,
        clientOrderId,
        createdAt,
        filledQuantity,
        leavesQuantity,
        orderType,
        quantity,
        securityId,
        securityIdSource,
        securityType,
        side,
        status,
        symbol,
        timeInForce,
        updatedAt,
        venue,
        averageFillPrice,
        details,
        expiresAt,
        limitOffset,
        limitPrice,
        stopPrice,
        strategy,
        trailingOffsetAmt,
        trailingOffsetAmtType,
        trailingWatermarkPx,
        trailingWatermarkTs,
        mutableMapOf(),
    )

    /**
     * Engine-assigned unique identifier for this order (UUID).
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * Account placing the order
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun accountId(): Long = accountId.getRequired("account_id")

    /**
     * Client-provided identifier echoed back (FIX tag 11).
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun clientOrderId(): String = clientOrderId.getRequired("client_order_id")

    /**
     * Timestamp when order was created (UTC)
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * Cumulative filled quantity
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun filledQuantity(): String = filledQuantity.getRequired("filled_quantity")

    /**
     * Remaining unfilled quantity
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun leavesQuantity(): String = leavesQuantity.getRequired("leaves_quantity")

    /**
     * Type of order (MARKET, LIMIT, etc.)
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun orderType(): OrderType = orderType.getRequired("order_type")

    /**
     * Total order quantity
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun quantity(): String = quantity.getRequired("quantity")

    /**
     * The identifier for the traded instrument (CMS/CUSIP/ISIN/FIGI for equities or option OPRA
     * OSI)
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun securityId(): String = securityId.getRequired("security_id")

    /**
     * The source of the security identifier
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun securityIdSource(): SecurityIdSource = securityIdSource.getRequired("security_id_source")

    /**
     * Type of security
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun securityType(): SecurityType = securityType.getRequired("security_type")

    /**
     * Side of the order (BUY, SELL, SELL_SHORT)
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun side(): Side = side.getRequired("side")

    /**
     * Current status of the order
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): OrderStatus = status.getRequired("status")

    /**
     * Trading symbol
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun symbol(): String = symbol.getRequired("symbol")

    /**
     * Time in force instruction
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun timeInForce(): TimeInForce = timeInForce.getRequired("time_in_force")

    /**
     * Timestamp of the most recent update (UTC)
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

    /**
     * MIC code of the venue where the order is routed
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun venue(): String = venue.getRequired("venue")

    /**
     * Average fill price across all executions
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun averageFillPrice(): Optional<String> = averageFillPrice.getOptional("average_fill_price")

    /**
     * Contains execution, rejection or cancellation details, if any
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun details(): Optional<List<String>> = details.getOptional("details")

    /**
     * Timestamp when the order will expire (UTC). Present when time_in_force is GOOD_TILL_DATE.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun expiresAt(): Optional<OffsetDateTime> = expiresAt.getOptional("expires_at")

    /**
     * Limit offset for trailing stop-limit orders (signed)
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun limitOffset(): Optional<String> = limitOffset.getOptional("limit_offset")

    /**
     * Limit price (for LIMIT and STOP_LIMIT orders)
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun limitPrice(): Optional<String> = limitPrice.getOptional("limit_price")

    /**
     * Stop price (for STOP and STOP_LIMIT orders)
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun stopPrice(): Optional<String> = stopPrice.getOptional("stop_price")

    /**
     * Execution strategy for this order
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun strategy(): Optional<OrderStrategy> = strategy.getOptional("strategy")

    /**
     * Trailing offset amount for trailing orders
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun trailingOffsetAmt(): Optional<String> = trailingOffsetAmt.getOptional("trailing_offset_amt")

    /**
     * Trailing offset type for trailing orders
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun trailingOffsetAmtType(): Optional<TrailingOffsetType> =
        trailingOffsetAmtType.getOptional("trailing_offset_amt_type")

    /**
     * Trailing watermark price for trailing orders
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun trailingWatermarkPx(): Optional<String> =
        trailingWatermarkPx.getOptional("trailing_watermark_px")

    /**
     * Trailing watermark timestamp for trailing orders
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun trailingWatermarkTs(): Optional<OffsetDateTime> =
        trailingWatermarkTs.getOptional("trailing_watermark_ts")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [accountId].
     *
     * Unlike [accountId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("account_id") @ExcludeMissing fun _accountId(): JsonField<Long> = accountId

    /**
     * Returns the raw JSON value of [clientOrderId].
     *
     * Unlike [clientOrderId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("client_order_id")
    @ExcludeMissing
    fun _clientOrderId(): JsonField<String> = clientOrderId

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [filledQuantity].
     *
     * Unlike [filledQuantity], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("filled_quantity")
    @ExcludeMissing
    fun _filledQuantity(): JsonField<String> = filledQuantity

    /**
     * Returns the raw JSON value of [leavesQuantity].
     *
     * Unlike [leavesQuantity], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("leaves_quantity")
    @ExcludeMissing
    fun _leavesQuantity(): JsonField<String> = leavesQuantity

    /**
     * Returns the raw JSON value of [orderType].
     *
     * Unlike [orderType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("order_type") @ExcludeMissing fun _orderType(): JsonField<OrderType> = orderType

    /**
     * Returns the raw JSON value of [quantity].
     *
     * Unlike [quantity], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("quantity") @ExcludeMissing fun _quantity(): JsonField<String> = quantity

    /**
     * Returns the raw JSON value of [securityId].
     *
     * Unlike [securityId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("security_id") @ExcludeMissing fun _securityId(): JsonField<String> = securityId

    /**
     * Returns the raw JSON value of [securityIdSource].
     *
     * Unlike [securityIdSource], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("security_id_source")
    @ExcludeMissing
    fun _securityIdSource(): JsonField<SecurityIdSource> = securityIdSource

    /**
     * Returns the raw JSON value of [securityType].
     *
     * Unlike [securityType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("security_type")
    @ExcludeMissing
    fun _securityType(): JsonField<SecurityType> = securityType

    /**
     * Returns the raw JSON value of [side].
     *
     * Unlike [side], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("side") @ExcludeMissing fun _side(): JsonField<Side> = side

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<OrderStatus> = status

    /**
     * Returns the raw JSON value of [symbol].
     *
     * Unlike [symbol], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("symbol") @ExcludeMissing fun _symbol(): JsonField<String> = symbol

    /**
     * Returns the raw JSON value of [timeInForce].
     *
     * Unlike [timeInForce], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("time_in_force")
    @ExcludeMissing
    fun _timeInForce(): JsonField<TimeInForce> = timeInForce

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated_at")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

    /**
     * Returns the raw JSON value of [venue].
     *
     * Unlike [venue], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("venue") @ExcludeMissing fun _venue(): JsonField<String> = venue

    /**
     * Returns the raw JSON value of [averageFillPrice].
     *
     * Unlike [averageFillPrice], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("average_fill_price")
    @ExcludeMissing
    fun _averageFillPrice(): JsonField<String> = averageFillPrice

    /**
     * Returns the raw JSON value of [details].
     *
     * Unlike [details], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("details") @ExcludeMissing fun _details(): JsonField<List<String>> = details

    /**
     * Returns the raw JSON value of [expiresAt].
     *
     * Unlike [expiresAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("expires_at")
    @ExcludeMissing
    fun _expiresAt(): JsonField<OffsetDateTime> = expiresAt

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
     * Returns the raw JSON value of [stopPrice].
     *
     * Unlike [stopPrice], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("stop_price") @ExcludeMissing fun _stopPrice(): JsonField<String> = stopPrice

    /**
     * Returns the raw JSON value of [strategy].
     *
     * Unlike [strategy], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("strategy") @ExcludeMissing fun _strategy(): JsonField<OrderStrategy> = strategy

    /**
     * Returns the raw JSON value of [trailingOffsetAmt].
     *
     * Unlike [trailingOffsetAmt], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("trailing_offset_amt")
    @ExcludeMissing
    fun _trailingOffsetAmt(): JsonField<String> = trailingOffsetAmt

    /**
     * Returns the raw JSON value of [trailingOffsetAmtType].
     *
     * Unlike [trailingOffsetAmtType], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("trailing_offset_amt_type")
    @ExcludeMissing
    fun _trailingOffsetAmtType(): JsonField<TrailingOffsetType> = trailingOffsetAmtType

    /**
     * Returns the raw JSON value of [trailingWatermarkPx].
     *
     * Unlike [trailingWatermarkPx], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("trailing_watermark_px")
    @ExcludeMissing
    fun _trailingWatermarkPx(): JsonField<String> = trailingWatermarkPx

    /**
     * Returns the raw JSON value of [trailingWatermarkTs].
     *
     * Unlike [trailingWatermarkTs], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("trailing_watermark_ts")
    @ExcludeMissing
    fun _trailingWatermarkTs(): JsonField<OffsetDateTime> = trailingWatermarkTs

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
         * Returns a mutable builder for constructing an instance of [Order].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .accountId()
         * .clientOrderId()
         * .createdAt()
         * .filledQuantity()
         * .leavesQuantity()
         * .orderType()
         * .quantity()
         * .securityId()
         * .securityIdSource()
         * .securityType()
         * .side()
         * .status()
         * .symbol()
         * .timeInForce()
         * .updatedAt()
         * .venue()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Order]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var accountId: JsonField<Long>? = null
        private var clientOrderId: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var filledQuantity: JsonField<String>? = null
        private var leavesQuantity: JsonField<String>? = null
        private var orderType: JsonField<OrderType>? = null
        private var quantity: JsonField<String>? = null
        private var securityId: JsonField<String>? = null
        private var securityIdSource: JsonField<SecurityIdSource>? = null
        private var securityType: JsonField<SecurityType>? = null
        private var side: JsonField<Side>? = null
        private var status: JsonField<OrderStatus>? = null
        private var symbol: JsonField<String>? = null
        private var timeInForce: JsonField<TimeInForce>? = null
        private var updatedAt: JsonField<OffsetDateTime>? = null
        private var venue: JsonField<String>? = null
        private var averageFillPrice: JsonField<String> = JsonMissing.of()
        private var details: JsonField<MutableList<String>>? = null
        private var expiresAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var limitOffset: JsonField<String> = JsonMissing.of()
        private var limitPrice: JsonField<String> = JsonMissing.of()
        private var stopPrice: JsonField<String> = JsonMissing.of()
        private var strategy: JsonField<OrderStrategy> = JsonMissing.of()
        private var trailingOffsetAmt: JsonField<String> = JsonMissing.of()
        private var trailingOffsetAmtType: JsonField<TrailingOffsetType> = JsonMissing.of()
        private var trailingWatermarkPx: JsonField<String> = JsonMissing.of()
        private var trailingWatermarkTs: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(order: Order) = apply {
            id = order.id
            accountId = order.accountId
            clientOrderId = order.clientOrderId
            createdAt = order.createdAt
            filledQuantity = order.filledQuantity
            leavesQuantity = order.leavesQuantity
            orderType = order.orderType
            quantity = order.quantity
            securityId = order.securityId
            securityIdSource = order.securityIdSource
            securityType = order.securityType
            side = order.side
            status = order.status
            symbol = order.symbol
            timeInForce = order.timeInForce
            updatedAt = order.updatedAt
            venue = order.venue
            averageFillPrice = order.averageFillPrice
            details = order.details.map { it.toMutableList() }
            expiresAt = order.expiresAt
            limitOffset = order.limitOffset
            limitPrice = order.limitPrice
            stopPrice = order.stopPrice
            strategy = order.strategy
            trailingOffsetAmt = order.trailingOffsetAmt
            trailingOffsetAmtType = order.trailingOffsetAmtType
            trailingWatermarkPx = order.trailingWatermarkPx
            trailingWatermarkTs = order.trailingWatermarkTs
            additionalProperties = order.additionalProperties.toMutableMap()
        }

        /** Engine-assigned unique identifier for this order (UUID). */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Account placing the order */
        fun accountId(accountId: Long) = accountId(JsonField.of(accountId))

        /**
         * Sets [Builder.accountId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountId] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun accountId(accountId: JsonField<Long>) = apply { this.accountId = accountId }

        /** Client-provided identifier echoed back (FIX tag 11). */
        fun clientOrderId(clientOrderId: String) = clientOrderId(JsonField.of(clientOrderId))

        /**
         * Sets [Builder.clientOrderId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.clientOrderId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun clientOrderId(clientOrderId: JsonField<String>) = apply {
            this.clientOrderId = clientOrderId
        }

        /** Timestamp when order was created (UTC) */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** Cumulative filled quantity */
        fun filledQuantity(filledQuantity: String) = filledQuantity(JsonField.of(filledQuantity))

        /**
         * Sets [Builder.filledQuantity] to an arbitrary JSON value.
         *
         * You should usually call [Builder.filledQuantity] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun filledQuantity(filledQuantity: JsonField<String>) = apply {
            this.filledQuantity = filledQuantity
        }

        /** Remaining unfilled quantity */
        fun leavesQuantity(leavesQuantity: String) = leavesQuantity(JsonField.of(leavesQuantity))

        /**
         * Sets [Builder.leavesQuantity] to an arbitrary JSON value.
         *
         * You should usually call [Builder.leavesQuantity] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun leavesQuantity(leavesQuantity: JsonField<String>) = apply {
            this.leavesQuantity = leavesQuantity
        }

        /** Type of order (MARKET, LIMIT, etc.) */
        fun orderType(orderType: OrderType) = orderType(JsonField.of(orderType))

        /**
         * Sets [Builder.orderType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.orderType] with a well-typed [OrderType] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun orderType(orderType: JsonField<OrderType>) = apply { this.orderType = orderType }

        /** Total order quantity */
        fun quantity(quantity: String) = quantity(JsonField.of(quantity))

        /**
         * Sets [Builder.quantity] to an arbitrary JSON value.
         *
         * You should usually call [Builder.quantity] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun quantity(quantity: JsonField<String>) = apply { this.quantity = quantity }

        /**
         * The identifier for the traded instrument (CMS/CUSIP/ISIN/FIGI for equities or option OPRA
         * OSI)
         */
        fun securityId(securityId: String) = securityId(JsonField.of(securityId))

        /**
         * Sets [Builder.securityId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.securityId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun securityId(securityId: JsonField<String>) = apply { this.securityId = securityId }

        /** The source of the security identifier */
        fun securityIdSource(securityIdSource: SecurityIdSource) =
            securityIdSource(JsonField.of(securityIdSource))

        /**
         * Sets [Builder.securityIdSource] to an arbitrary JSON value.
         *
         * You should usually call [Builder.securityIdSource] with a well-typed [SecurityIdSource]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun securityIdSource(securityIdSource: JsonField<SecurityIdSource>) = apply {
            this.securityIdSource = securityIdSource
        }

        /** Type of security */
        fun securityType(securityType: SecurityType) = securityType(JsonField.of(securityType))

        /**
         * Sets [Builder.securityType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.securityType] with a well-typed [SecurityType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun securityType(securityType: JsonField<SecurityType>) = apply {
            this.securityType = securityType
        }

        /** Side of the order (BUY, SELL, SELL_SHORT) */
        fun side(side: Side) = side(JsonField.of(side))

        /**
         * Sets [Builder.side] to an arbitrary JSON value.
         *
         * You should usually call [Builder.side] with a well-typed [Side] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun side(side: JsonField<Side>) = apply { this.side = side }

        /** Current status of the order */
        fun status(status: OrderStatus) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [OrderStatus] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun status(status: JsonField<OrderStatus>) = apply { this.status = status }

        /** Trading symbol */
        fun symbol(symbol: String) = symbol(JsonField.of(symbol))

        /**
         * Sets [Builder.symbol] to an arbitrary JSON value.
         *
         * You should usually call [Builder.symbol] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun symbol(symbol: JsonField<String>) = apply { this.symbol = symbol }

        /** Time in force instruction */
        fun timeInForce(timeInForce: TimeInForce) = timeInForce(JsonField.of(timeInForce))

        /**
         * Sets [Builder.timeInForce] to an arbitrary JSON value.
         *
         * You should usually call [Builder.timeInForce] with a well-typed [TimeInForce] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun timeInForce(timeInForce: JsonField<TimeInForce>) = apply {
            this.timeInForce = timeInForce
        }

        /** Timestamp of the most recent update (UTC) */
        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        /** MIC code of the venue where the order is routed */
        fun venue(venue: String) = venue(JsonField.of(venue))

        /**
         * Sets [Builder.venue] to an arbitrary JSON value.
         *
         * You should usually call [Builder.venue] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun venue(venue: JsonField<String>) = apply { this.venue = venue }

        /** Average fill price across all executions */
        fun averageFillPrice(averageFillPrice: String?) =
            averageFillPrice(JsonField.ofNullable(averageFillPrice))

        /** Alias for calling [Builder.averageFillPrice] with `averageFillPrice.orElse(null)`. */
        fun averageFillPrice(averageFillPrice: Optional<String>) =
            averageFillPrice(averageFillPrice.getOrNull())

        /**
         * Sets [Builder.averageFillPrice] to an arbitrary JSON value.
         *
         * You should usually call [Builder.averageFillPrice] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun averageFillPrice(averageFillPrice: JsonField<String>) = apply {
            this.averageFillPrice = averageFillPrice
        }

        /** Contains execution, rejection or cancellation details, if any */
        fun details(details: List<String>) = details(JsonField.of(details))

        /**
         * Sets [Builder.details] to an arbitrary JSON value.
         *
         * You should usually call [Builder.details] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun details(details: JsonField<List<String>>) = apply {
            this.details = details.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [details].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addDetail(detail: String) = apply {
            details =
                (details ?: JsonField.of(mutableListOf())).also {
                    checkKnown("details", it).add(detail)
                }
        }

        /**
         * Timestamp when the order will expire (UTC). Present when time_in_force is GOOD_TILL_DATE.
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

        /** Limit price (for LIMIT and STOP_LIMIT orders) */
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

        /** Stop price (for STOP and STOP_LIMIT orders) */
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

        /** Execution strategy for this order */
        fun strategy(strategy: OrderStrategy?) = strategy(JsonField.ofNullable(strategy))

        /** Alias for calling [Builder.strategy] with `strategy.orElse(null)`. */
        fun strategy(strategy: Optional<OrderStrategy>) = strategy(strategy.getOrNull())

        /**
         * Sets [Builder.strategy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.strategy] with a well-typed [OrderStrategy] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun strategy(strategy: JsonField<OrderStrategy>) = apply { this.strategy = strategy }

        /** Alias for calling [strategy] with `OrderStrategy.ofSor(sor)`. */
        fun strategy(sor: OrderStrategy.Sor) = strategy(OrderStrategy.ofSor(sor))

        /** Alias for calling [strategy] with `OrderStrategy.ofVwap(vwap)`. */
        fun strategy(vwap: OrderStrategy.Vwap) = strategy(OrderStrategy.ofVwap(vwap))

        /** Alias for calling [strategy] with `OrderStrategy.ofTwap(twap)`. */
        fun strategy(twap: OrderStrategy.Twap) = strategy(OrderStrategy.ofTwap(twap))

        /** Alias for calling [strategy] with `OrderStrategy.ofAp(ap)`. */
        fun strategy(ap: OrderStrategy.Ap) = strategy(OrderStrategy.ofAp(ap))

        /** Alias for calling [strategy] with `OrderStrategy.ofPov(pov)`. */
        fun strategy(pov: OrderStrategy.Pov) = strategy(OrderStrategy.ofPov(pov))

        /** Alias for calling [strategy] with `OrderStrategy.ofDark(dark)`. */
        fun strategy(dark: OrderStrategy.Dark) = strategy(OrderStrategy.ofDark(dark))

        /** Alias for calling [strategy] with `OrderStrategy.ofDma(dma)`. */
        fun strategy(dma: OrderStrategy.Dma) = strategy(OrderStrategy.ofDma(dma))

        /** Trailing offset amount for trailing orders */
        fun trailingOffsetAmt(trailingOffsetAmt: String?) =
            trailingOffsetAmt(JsonField.ofNullable(trailingOffsetAmt))

        /** Alias for calling [Builder.trailingOffsetAmt] with `trailingOffsetAmt.orElse(null)`. */
        fun trailingOffsetAmt(trailingOffsetAmt: Optional<String>) =
            trailingOffsetAmt(trailingOffsetAmt.getOrNull())

        /**
         * Sets [Builder.trailingOffsetAmt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.trailingOffsetAmt] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun trailingOffsetAmt(trailingOffsetAmt: JsonField<String>) = apply {
            this.trailingOffsetAmt = trailingOffsetAmt
        }

        /** Trailing offset type for trailing orders */
        fun trailingOffsetAmtType(trailingOffsetAmtType: TrailingOffsetType?) =
            trailingOffsetAmtType(JsonField.ofNullable(trailingOffsetAmtType))

        /**
         * Alias for calling [Builder.trailingOffsetAmtType] with
         * `trailingOffsetAmtType.orElse(null)`.
         */
        fun trailingOffsetAmtType(trailingOffsetAmtType: Optional<TrailingOffsetType>) =
            trailingOffsetAmtType(trailingOffsetAmtType.getOrNull())

        /**
         * Sets [Builder.trailingOffsetAmtType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.trailingOffsetAmtType] with a well-typed
         * [TrailingOffsetType] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun trailingOffsetAmtType(trailingOffsetAmtType: JsonField<TrailingOffsetType>) = apply {
            this.trailingOffsetAmtType = trailingOffsetAmtType
        }

        /** Trailing watermark price for trailing orders */
        fun trailingWatermarkPx(trailingWatermarkPx: String?) =
            trailingWatermarkPx(JsonField.ofNullable(trailingWatermarkPx))

        /**
         * Alias for calling [Builder.trailingWatermarkPx] with `trailingWatermarkPx.orElse(null)`.
         */
        fun trailingWatermarkPx(trailingWatermarkPx: Optional<String>) =
            trailingWatermarkPx(trailingWatermarkPx.getOrNull())

        /**
         * Sets [Builder.trailingWatermarkPx] to an arbitrary JSON value.
         *
         * You should usually call [Builder.trailingWatermarkPx] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun trailingWatermarkPx(trailingWatermarkPx: JsonField<String>) = apply {
            this.trailingWatermarkPx = trailingWatermarkPx
        }

        /** Trailing watermark timestamp for trailing orders */
        fun trailingWatermarkTs(trailingWatermarkTs: OffsetDateTime?) =
            trailingWatermarkTs(JsonField.ofNullable(trailingWatermarkTs))

        /**
         * Alias for calling [Builder.trailingWatermarkTs] with `trailingWatermarkTs.orElse(null)`.
         */
        fun trailingWatermarkTs(trailingWatermarkTs: Optional<OffsetDateTime>) =
            trailingWatermarkTs(trailingWatermarkTs.getOrNull())

        /**
         * Sets [Builder.trailingWatermarkTs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.trailingWatermarkTs] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun trailingWatermarkTs(trailingWatermarkTs: JsonField<OffsetDateTime>) = apply {
            this.trailingWatermarkTs = trailingWatermarkTs
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
         * Returns an immutable instance of [Order].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .accountId()
         * .clientOrderId()
         * .createdAt()
         * .filledQuantity()
         * .leavesQuantity()
         * .orderType()
         * .quantity()
         * .securityId()
         * .securityIdSource()
         * .securityType()
         * .side()
         * .status()
         * .symbol()
         * .timeInForce()
         * .updatedAt()
         * .venue()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): Order =
            Order(
                checkRequired("id", id),
                checkRequired("accountId", accountId),
                checkRequired("clientOrderId", clientOrderId),
                checkRequired("createdAt", createdAt),
                checkRequired("filledQuantity", filledQuantity),
                checkRequired("leavesQuantity", leavesQuantity),
                checkRequired("orderType", orderType),
                checkRequired("quantity", quantity),
                checkRequired("securityId", securityId),
                checkRequired("securityIdSource", securityIdSource),
                checkRequired("securityType", securityType),
                checkRequired("side", side),
                checkRequired("status", status),
                checkRequired("symbol", symbol),
                checkRequired("timeInForce", timeInForce),
                checkRequired("updatedAt", updatedAt),
                checkRequired("venue", venue),
                averageFillPrice,
                (details ?: JsonMissing.of()).map { it.toImmutable() },
                expiresAt,
                limitOffset,
                limitPrice,
                stopPrice,
                strategy,
                trailingOffsetAmt,
                trailingOffsetAmtType,
                trailingWatermarkPx,
                trailingWatermarkTs,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): Order = apply {
        if (validated) {
            return@apply
        }

        id()
        accountId()
        clientOrderId()
        createdAt()
        filledQuantity()
        leavesQuantity()
        orderType().validate()
        quantity()
        securityId()
        securityIdSource().validate()
        securityType().validate()
        side().validate()
        status().validate()
        symbol()
        timeInForce().validate()
        updatedAt()
        venue()
        averageFillPrice()
        details()
        expiresAt()
        limitOffset()
        limitPrice()
        stopPrice()
        strategy().ifPresent { it.validate() }
        trailingOffsetAmt()
        trailingOffsetAmtType().ifPresent { it.validate() }
        trailingWatermarkPx()
        trailingWatermarkTs()
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
            (if (accountId.asKnown().isPresent) 1 else 0) +
            (if (clientOrderId.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (filledQuantity.asKnown().isPresent) 1 else 0) +
            (if (leavesQuantity.asKnown().isPresent) 1 else 0) +
            (orderType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (quantity.asKnown().isPresent) 1 else 0) +
            (if (securityId.asKnown().isPresent) 1 else 0) +
            (securityIdSource.asKnown().getOrNull()?.validity() ?: 0) +
            (securityType.asKnown().getOrNull()?.validity() ?: 0) +
            (side.asKnown().getOrNull()?.validity() ?: 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (if (symbol.asKnown().isPresent) 1 else 0) +
            (timeInForce.asKnown().getOrNull()?.validity() ?: 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (if (venue.asKnown().isPresent) 1 else 0) +
            (if (averageFillPrice.asKnown().isPresent) 1 else 0) +
            (details.asKnown().getOrNull()?.size ?: 0) +
            (if (expiresAt.asKnown().isPresent) 1 else 0) +
            (if (limitOffset.asKnown().isPresent) 1 else 0) +
            (if (limitPrice.asKnown().isPresent) 1 else 0) +
            (if (stopPrice.asKnown().isPresent) 1 else 0) +
            (strategy.asKnown().getOrNull()?.validity() ?: 0) +
            (if (trailingOffsetAmt.asKnown().isPresent) 1 else 0) +
            (trailingOffsetAmtType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (trailingWatermarkPx.asKnown().isPresent) 1 else 0) +
            (if (trailingWatermarkTs.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Order &&
            id == other.id &&
            accountId == other.accountId &&
            clientOrderId == other.clientOrderId &&
            createdAt == other.createdAt &&
            filledQuantity == other.filledQuantity &&
            leavesQuantity == other.leavesQuantity &&
            orderType == other.orderType &&
            quantity == other.quantity &&
            securityId == other.securityId &&
            securityIdSource == other.securityIdSource &&
            securityType == other.securityType &&
            side == other.side &&
            status == other.status &&
            symbol == other.symbol &&
            timeInForce == other.timeInForce &&
            updatedAt == other.updatedAt &&
            venue == other.venue &&
            averageFillPrice == other.averageFillPrice &&
            details == other.details &&
            expiresAt == other.expiresAt &&
            limitOffset == other.limitOffset &&
            limitPrice == other.limitPrice &&
            stopPrice == other.stopPrice &&
            strategy == other.strategy &&
            trailingOffsetAmt == other.trailingOffsetAmt &&
            trailingOffsetAmtType == other.trailingOffsetAmtType &&
            trailingWatermarkPx == other.trailingWatermarkPx &&
            trailingWatermarkTs == other.trailingWatermarkTs &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            accountId,
            clientOrderId,
            createdAt,
            filledQuantity,
            leavesQuantity,
            orderType,
            quantity,
            securityId,
            securityIdSource,
            securityType,
            side,
            status,
            symbol,
            timeInForce,
            updatedAt,
            venue,
            averageFillPrice,
            details,
            expiresAt,
            limitOffset,
            limitPrice,
            stopPrice,
            strategy,
            trailingOffsetAmt,
            trailingOffsetAmtType,
            trailingWatermarkPx,
            trailingWatermarkTs,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Order{id=$id, accountId=$accountId, clientOrderId=$clientOrderId, createdAt=$createdAt, filledQuantity=$filledQuantity, leavesQuantity=$leavesQuantity, orderType=$orderType, quantity=$quantity, securityId=$securityId, securityIdSource=$securityIdSource, securityType=$securityType, side=$side, status=$status, symbol=$symbol, timeInForce=$timeInForce, updatedAt=$updatedAt, venue=$venue, averageFillPrice=$averageFillPrice, details=$details, expiresAt=$expiresAt, limitOffset=$limitOffset, limitPrice=$limitPrice, stopPrice=$stopPrice, strategy=$strategy, trailingOffsetAmt=$trailingOffsetAmt, trailingOffsetAmtType=$trailingOffsetAmtType, trailingWatermarkPx=$trailingWatermarkPx, trailingWatermarkTs=$trailingWatermarkTs, additionalProperties=$additionalProperties}"
}
