// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.accounts.locates

import com.clear_street.api.core.ExcludeMissing
import com.clear_street.api.core.JsonField
import com.clear_street.api.core.JsonMissing
import com.clear_street.api.core.JsonValue
import com.clear_street.api.core.checkRequired
import com.clear_street.api.errors.ClearStreetInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Represents a single locate order and its status */
class LocateOrder
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val locateOrderId: JsonField<String>,
    private val locatedQuantity: JsonField<Long>,
    private val mpid: JsonField<String>,
    private val requestedAt: JsonField<OffsetDateTime>,
    private val requestedQuantity: JsonField<Long>,
    private val status: JsonField<LocateOrderStatus>,
    private val symbol: JsonField<String>,
    private val borrowRate: JsonField<String>,
    private val deskComment: JsonField<String>,
    private val expiresAt: JsonField<OffsetDateTime>,
    private val locateId: JsonField<String>,
    private val locatedAt: JsonField<OffsetDateTime>,
    private val referenceId: JsonField<String>,
    private val totalCost: JsonField<String>,
    private val traderComment: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("locate_order_id")
        @ExcludeMissing
        locateOrderId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("located_quantity")
        @ExcludeMissing
        locatedQuantity: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("mpid") @ExcludeMissing mpid: JsonField<String> = JsonMissing.of(),
        @JsonProperty("requested_at")
        @ExcludeMissing
        requestedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("requested_quantity")
        @ExcludeMissing
        requestedQuantity: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("status")
        @ExcludeMissing
        status: JsonField<LocateOrderStatus> = JsonMissing.of(),
        @JsonProperty("symbol") @ExcludeMissing symbol: JsonField<String> = JsonMissing.of(),
        @JsonProperty("borrow_rate")
        @ExcludeMissing
        borrowRate: JsonField<String> = JsonMissing.of(),
        @JsonProperty("desk_comment")
        @ExcludeMissing
        deskComment: JsonField<String> = JsonMissing.of(),
        @JsonProperty("expires_at")
        @ExcludeMissing
        expiresAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("locate_id") @ExcludeMissing locateId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("located_at")
        @ExcludeMissing
        locatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("reference_id")
        @ExcludeMissing
        referenceId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("total_cost") @ExcludeMissing totalCost: JsonField<String> = JsonMissing.of(),
        @JsonProperty("trader_comment")
        @ExcludeMissing
        traderComment: JsonField<String> = JsonMissing.of(),
    ) : this(
        locateOrderId,
        locatedQuantity,
        mpid,
        requestedAt,
        requestedQuantity,
        status,
        symbol,
        borrowRate,
        deskComment,
        expiresAt,
        locateId,
        locatedAt,
        referenceId,
        totalCost,
        traderComment,
        mutableMapOf(),
    )

    /**
     * The unique system-generated ID for the locate order
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun locateOrderId(): String = locateOrderId.getRequired("locate_order_id")

    /**
     * The quantity of shares that have been located
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun locatedQuantity(): Long = locatedQuantity.getRequired("located_quantity")

    /**
     * The client Market Participant Identifier, assigned by Clear Street
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun mpid(): String = mpid.getRequired("mpid")

    /**
     * The timestamp when the locate order was received from the client in UTC
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun requestedAt(): OffsetDateTime = requestedAt.getRequired("requested_at")

    /**
     * The quantity of shares requested by the client
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun requestedQuantity(): Long = requestedQuantity.getRequired("requested_quantity")

    /**
     * The status of the locate order
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): LocateOrderStatus = status.getRequired("status")

    /**
     * The symbol of the security to locate
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun symbol(): String = symbol.getRequired("symbol")

    /**
     * The borrow rate for the security if held overnight, expressed as a decimal
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun borrowRate(): Optional<String> = borrowRate.getOptional("borrow_rate")

    /**
     * Comments provided by the trading desk
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun deskComment(): Optional<String> = deskComment.getOptional("desk_comment")

    /**
     * The timestamp when the locate order will expire, set once the order has been processed, in
     * UTC
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun expiresAt(): Optional<OffsetDateTime> = expiresAt.getOptional("expires_at")

    /**
     * A unique ID for the locate order, available after the order has been `OFFERED`
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun locateId(): Optional<String> = locateId.getOptional("locate_id")

    /**
     * The timestamp when the security was located in UTC
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun locatedAt(): Optional<OffsetDateTime> = locatedAt.getOptional("located_at")

    /**
     * The reference ID provided when submitting the locate order
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun referenceId(): Optional<String> = referenceId.getOptional("reference_id")

    /**
     * The total cost of the locate
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun totalCost(): Optional<String> = totalCost.getOptional("total_cost")

    /**
     * Comments provided by the trader when submitting the locate order
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun traderComment(): Optional<String> = traderComment.getOptional("trader_comment")

    /**
     * Returns the raw JSON value of [locateOrderId].
     *
     * Unlike [locateOrderId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("locate_order_id")
    @ExcludeMissing
    fun _locateOrderId(): JsonField<String> = locateOrderId

    /**
     * Returns the raw JSON value of [locatedQuantity].
     *
     * Unlike [locatedQuantity], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("located_quantity")
    @ExcludeMissing
    fun _locatedQuantity(): JsonField<Long> = locatedQuantity

    /**
     * Returns the raw JSON value of [mpid].
     *
     * Unlike [mpid], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("mpid") @ExcludeMissing fun _mpid(): JsonField<String> = mpid

    /**
     * Returns the raw JSON value of [requestedAt].
     *
     * Unlike [requestedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("requested_at")
    @ExcludeMissing
    fun _requestedAt(): JsonField<OffsetDateTime> = requestedAt

    /**
     * Returns the raw JSON value of [requestedQuantity].
     *
     * Unlike [requestedQuantity], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("requested_quantity")
    @ExcludeMissing
    fun _requestedQuantity(): JsonField<Long> = requestedQuantity

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<LocateOrderStatus> = status

    /**
     * Returns the raw JSON value of [symbol].
     *
     * Unlike [symbol], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("symbol") @ExcludeMissing fun _symbol(): JsonField<String> = symbol

    /**
     * Returns the raw JSON value of [borrowRate].
     *
     * Unlike [borrowRate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("borrow_rate") @ExcludeMissing fun _borrowRate(): JsonField<String> = borrowRate

    /**
     * Returns the raw JSON value of [deskComment].
     *
     * Unlike [deskComment], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("desk_comment")
    @ExcludeMissing
    fun _deskComment(): JsonField<String> = deskComment

    /**
     * Returns the raw JSON value of [expiresAt].
     *
     * Unlike [expiresAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("expires_at")
    @ExcludeMissing
    fun _expiresAt(): JsonField<OffsetDateTime> = expiresAt

    /**
     * Returns the raw JSON value of [locateId].
     *
     * Unlike [locateId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("locate_id") @ExcludeMissing fun _locateId(): JsonField<String> = locateId

    /**
     * Returns the raw JSON value of [locatedAt].
     *
     * Unlike [locatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("located_at")
    @ExcludeMissing
    fun _locatedAt(): JsonField<OffsetDateTime> = locatedAt

    /**
     * Returns the raw JSON value of [referenceId].
     *
     * Unlike [referenceId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("reference_id")
    @ExcludeMissing
    fun _referenceId(): JsonField<String> = referenceId

    /**
     * Returns the raw JSON value of [totalCost].
     *
     * Unlike [totalCost], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("total_cost") @ExcludeMissing fun _totalCost(): JsonField<String> = totalCost

    /**
     * Returns the raw JSON value of [traderComment].
     *
     * Unlike [traderComment], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("trader_comment")
    @ExcludeMissing
    fun _traderComment(): JsonField<String> = traderComment

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
         * Returns a mutable builder for constructing an instance of [LocateOrder].
         *
         * The following fields are required:
         * ```java
         * .locateOrderId()
         * .locatedQuantity()
         * .mpid()
         * .requestedAt()
         * .requestedQuantity()
         * .status()
         * .symbol()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [LocateOrder]. */
    class Builder internal constructor() {

        private var locateOrderId: JsonField<String>? = null
        private var locatedQuantity: JsonField<Long>? = null
        private var mpid: JsonField<String>? = null
        private var requestedAt: JsonField<OffsetDateTime>? = null
        private var requestedQuantity: JsonField<Long>? = null
        private var status: JsonField<LocateOrderStatus>? = null
        private var symbol: JsonField<String>? = null
        private var borrowRate: JsonField<String> = JsonMissing.of()
        private var deskComment: JsonField<String> = JsonMissing.of()
        private var expiresAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var locateId: JsonField<String> = JsonMissing.of()
        private var locatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var referenceId: JsonField<String> = JsonMissing.of()
        private var totalCost: JsonField<String> = JsonMissing.of()
        private var traderComment: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(locateOrder: LocateOrder) = apply {
            locateOrderId = locateOrder.locateOrderId
            locatedQuantity = locateOrder.locatedQuantity
            mpid = locateOrder.mpid
            requestedAt = locateOrder.requestedAt
            requestedQuantity = locateOrder.requestedQuantity
            status = locateOrder.status
            symbol = locateOrder.symbol
            borrowRate = locateOrder.borrowRate
            deskComment = locateOrder.deskComment
            expiresAt = locateOrder.expiresAt
            locateId = locateOrder.locateId
            locatedAt = locateOrder.locatedAt
            referenceId = locateOrder.referenceId
            totalCost = locateOrder.totalCost
            traderComment = locateOrder.traderComment
            additionalProperties = locateOrder.additionalProperties.toMutableMap()
        }

        /** The unique system-generated ID for the locate order */
        fun locateOrderId(locateOrderId: String) = locateOrderId(JsonField.of(locateOrderId))

        /**
         * Sets [Builder.locateOrderId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.locateOrderId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun locateOrderId(locateOrderId: JsonField<String>) = apply {
            this.locateOrderId = locateOrderId
        }

        /** The quantity of shares that have been located */
        fun locatedQuantity(locatedQuantity: Long) = locatedQuantity(JsonField.of(locatedQuantity))

        /**
         * Sets [Builder.locatedQuantity] to an arbitrary JSON value.
         *
         * You should usually call [Builder.locatedQuantity] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun locatedQuantity(locatedQuantity: JsonField<Long>) = apply {
            this.locatedQuantity = locatedQuantity
        }

        /** The client Market Participant Identifier, assigned by Clear Street */
        fun mpid(mpid: String) = mpid(JsonField.of(mpid))

        /**
         * Sets [Builder.mpid] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mpid] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun mpid(mpid: JsonField<String>) = apply { this.mpid = mpid }

        /** The timestamp when the locate order was received from the client in UTC */
        fun requestedAt(requestedAt: OffsetDateTime) = requestedAt(JsonField.of(requestedAt))

        /**
         * Sets [Builder.requestedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.requestedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun requestedAt(requestedAt: JsonField<OffsetDateTime>) = apply {
            this.requestedAt = requestedAt
        }

        /** The quantity of shares requested by the client */
        fun requestedQuantity(requestedQuantity: Long) =
            requestedQuantity(JsonField.of(requestedQuantity))

        /**
         * Sets [Builder.requestedQuantity] to an arbitrary JSON value.
         *
         * You should usually call [Builder.requestedQuantity] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun requestedQuantity(requestedQuantity: JsonField<Long>) = apply {
            this.requestedQuantity = requestedQuantity
        }

        /** The status of the locate order */
        fun status(status: LocateOrderStatus) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [LocateOrderStatus] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun status(status: JsonField<LocateOrderStatus>) = apply { this.status = status }

        /** The symbol of the security to locate */
        fun symbol(symbol: String) = symbol(JsonField.of(symbol))

        /**
         * Sets [Builder.symbol] to an arbitrary JSON value.
         *
         * You should usually call [Builder.symbol] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun symbol(symbol: JsonField<String>) = apply { this.symbol = symbol }

        /** The borrow rate for the security if held overnight, expressed as a decimal */
        fun borrowRate(borrowRate: String?) = borrowRate(JsonField.ofNullable(borrowRate))

        /** Alias for calling [Builder.borrowRate] with `borrowRate.orElse(null)`. */
        fun borrowRate(borrowRate: Optional<String>) = borrowRate(borrowRate.getOrNull())

        /**
         * Sets [Builder.borrowRate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.borrowRate] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun borrowRate(borrowRate: JsonField<String>) = apply { this.borrowRate = borrowRate }

        /** Comments provided by the trading desk */
        fun deskComment(deskComment: String?) = deskComment(JsonField.ofNullable(deskComment))

        /** Alias for calling [Builder.deskComment] with `deskComment.orElse(null)`. */
        fun deskComment(deskComment: Optional<String>) = deskComment(deskComment.getOrNull())

        /**
         * Sets [Builder.deskComment] to an arbitrary JSON value.
         *
         * You should usually call [Builder.deskComment] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun deskComment(deskComment: JsonField<String>) = apply { this.deskComment = deskComment }

        /**
         * The timestamp when the locate order will expire, set once the order has been processed,
         * in UTC
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

        /** A unique ID for the locate order, available after the order has been `OFFERED` */
        fun locateId(locateId: String?) = locateId(JsonField.ofNullable(locateId))

        /** Alias for calling [Builder.locateId] with `locateId.orElse(null)`. */
        fun locateId(locateId: Optional<String>) = locateId(locateId.getOrNull())

        /**
         * Sets [Builder.locateId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.locateId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun locateId(locateId: JsonField<String>) = apply { this.locateId = locateId }

        /** The timestamp when the security was located in UTC */
        fun locatedAt(locatedAt: OffsetDateTime?) = locatedAt(JsonField.ofNullable(locatedAt))

        /** Alias for calling [Builder.locatedAt] with `locatedAt.orElse(null)`. */
        fun locatedAt(locatedAt: Optional<OffsetDateTime>) = locatedAt(locatedAt.getOrNull())

        /**
         * Sets [Builder.locatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.locatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun locatedAt(locatedAt: JsonField<OffsetDateTime>) = apply { this.locatedAt = locatedAt }

        /** The reference ID provided when submitting the locate order */
        fun referenceId(referenceId: String?) = referenceId(JsonField.ofNullable(referenceId))

        /** Alias for calling [Builder.referenceId] with `referenceId.orElse(null)`. */
        fun referenceId(referenceId: Optional<String>) = referenceId(referenceId.getOrNull())

        /**
         * Sets [Builder.referenceId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.referenceId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun referenceId(referenceId: JsonField<String>) = apply { this.referenceId = referenceId }

        /** The total cost of the locate */
        fun totalCost(totalCost: String?) = totalCost(JsonField.ofNullable(totalCost))

        /** Alias for calling [Builder.totalCost] with `totalCost.orElse(null)`. */
        fun totalCost(totalCost: Optional<String>) = totalCost(totalCost.getOrNull())

        /**
         * Sets [Builder.totalCost] to an arbitrary JSON value.
         *
         * You should usually call [Builder.totalCost] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun totalCost(totalCost: JsonField<String>) = apply { this.totalCost = totalCost }

        /** Comments provided by the trader when submitting the locate order */
        fun traderComment(traderComment: String?) =
            traderComment(JsonField.ofNullable(traderComment))

        /** Alias for calling [Builder.traderComment] with `traderComment.orElse(null)`. */
        fun traderComment(traderComment: Optional<String>) =
            traderComment(traderComment.getOrNull())

        /**
         * Sets [Builder.traderComment] to an arbitrary JSON value.
         *
         * You should usually call [Builder.traderComment] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun traderComment(traderComment: JsonField<String>) = apply {
            this.traderComment = traderComment
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
         * Returns an immutable instance of [LocateOrder].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .locateOrderId()
         * .locatedQuantity()
         * .mpid()
         * .requestedAt()
         * .requestedQuantity()
         * .status()
         * .symbol()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): LocateOrder =
            LocateOrder(
                checkRequired("locateOrderId", locateOrderId),
                checkRequired("locatedQuantity", locatedQuantity),
                checkRequired("mpid", mpid),
                checkRequired("requestedAt", requestedAt),
                checkRequired("requestedQuantity", requestedQuantity),
                checkRequired("status", status),
                checkRequired("symbol", symbol),
                borrowRate,
                deskComment,
                expiresAt,
                locateId,
                locatedAt,
                referenceId,
                totalCost,
                traderComment,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): LocateOrder = apply {
        if (validated) {
            return@apply
        }

        locateOrderId()
        locatedQuantity()
        mpid()
        requestedAt()
        requestedQuantity()
        status().validate()
        symbol()
        borrowRate()
        deskComment()
        expiresAt()
        locateId()
        locatedAt()
        referenceId()
        totalCost()
        traderComment()
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
        (if (locateOrderId.asKnown().isPresent) 1 else 0) +
            (if (locatedQuantity.asKnown().isPresent) 1 else 0) +
            (if (mpid.asKnown().isPresent) 1 else 0) +
            (if (requestedAt.asKnown().isPresent) 1 else 0) +
            (if (requestedQuantity.asKnown().isPresent) 1 else 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (if (symbol.asKnown().isPresent) 1 else 0) +
            (if (borrowRate.asKnown().isPresent) 1 else 0) +
            (if (deskComment.asKnown().isPresent) 1 else 0) +
            (if (expiresAt.asKnown().isPresent) 1 else 0) +
            (if (locateId.asKnown().isPresent) 1 else 0) +
            (if (locatedAt.asKnown().isPresent) 1 else 0) +
            (if (referenceId.asKnown().isPresent) 1 else 0) +
            (if (totalCost.asKnown().isPresent) 1 else 0) +
            (if (traderComment.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is LocateOrder &&
            locateOrderId == other.locateOrderId &&
            locatedQuantity == other.locatedQuantity &&
            mpid == other.mpid &&
            requestedAt == other.requestedAt &&
            requestedQuantity == other.requestedQuantity &&
            status == other.status &&
            symbol == other.symbol &&
            borrowRate == other.borrowRate &&
            deskComment == other.deskComment &&
            expiresAt == other.expiresAt &&
            locateId == other.locateId &&
            locatedAt == other.locatedAt &&
            referenceId == other.referenceId &&
            totalCost == other.totalCost &&
            traderComment == other.traderComment &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            locateOrderId,
            locatedQuantity,
            mpid,
            requestedAt,
            requestedQuantity,
            status,
            symbol,
            borrowRate,
            deskComment,
            expiresAt,
            locateId,
            locatedAt,
            referenceId,
            totalCost,
            traderComment,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "LocateOrder{locateOrderId=$locateOrderId, locatedQuantity=$locatedQuantity, mpid=$mpid, requestedAt=$requestedAt, requestedQuantity=$requestedQuantity, status=$status, symbol=$symbol, borrowRate=$borrowRate, deskComment=$deskComment, expiresAt=$expiresAt, locateId=$locateId, locatedAt=$locatedAt, referenceId=$referenceId, totalCost=$totalCost, traderComment=$traderComment, additionalProperties=$additionalProperties}"
}
