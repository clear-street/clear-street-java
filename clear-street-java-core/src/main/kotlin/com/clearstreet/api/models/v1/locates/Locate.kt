// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.locates

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
import java.time.LocalDate
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** A locate request joined with the locate granted for it, if any. */
class Locate
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val accountId: JsonField<Long>,
    private val clientRequestId: JsonField<String>,
    private val effectiveDate: JsonField<LocalDate>,
    private val instrumentId: JsonField<String>,
    private val locateRequestId: JsonField<String>,
    private val requestedQuantity: JsonField<Long>,
    private val status: JsonField<LocateStatus>,
    private val locateId: JsonField<String>,
    private val quantity: JsonField<Long>,
    private val relatedOrderId: JsonField<String>,
    private val reservedQuantity: JsonField<Long>,
    private val usedQuantity: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("account_id") @ExcludeMissing accountId: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("client_request_id")
        @ExcludeMissing
        clientRequestId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("effective_date")
        @ExcludeMissing
        effectiveDate: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("instrument_id")
        @ExcludeMissing
        instrumentId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("locate_request_id")
        @ExcludeMissing
        locateRequestId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("requested_quantity")
        @ExcludeMissing
        requestedQuantity: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<LocateStatus> = JsonMissing.of(),
        @JsonProperty("locate_id") @ExcludeMissing locateId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("quantity") @ExcludeMissing quantity: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("related_order_id")
        @ExcludeMissing
        relatedOrderId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("reserved_quantity")
        @ExcludeMissing
        reservedQuantity: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("used_quantity")
        @ExcludeMissing
        usedQuantity: JsonField<Long> = JsonMissing.of(),
    ) : this(
        accountId,
        clientRequestId,
        effectiveDate,
        instrumentId,
        locateRequestId,
        requestedQuantity,
        status,
        locateId,
        quantity,
        relatedOrderId,
        reservedQuantity,
        usedQuantity,
        mutableMapOf(),
    )

    /**
     * Account the locate is booked to.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun accountId(): Long = accountId.getRequired("account_id")

    /**
     * Caller-assigned id of the locate request.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun clientRequestId(): String = clientRequestId.getRequired("client_request_id")

    /**
     * New York calendar date the locate is in force for.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun effectiveDate(): LocalDate = effectiveDate.getRequired("effective_date")

    /**
     * Instrument id.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun instrumentId(): String = instrumentId.getRequired("instrument_id")

    /**
     * Engine-assigned locate request id.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun locateRequestId(): String = locateRequestId.getRequired("locate_request_id")

    /**
     * Number of shares requested.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun requestedQuantity(): Long = requestedQuantity.getRequired("requested_quantity")

    /**
     * Presented status of the locate.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): LocateStatus = status.getRequired("status")

    /**
     * Engine-assigned locate id; set once the locate is granted. When a null/undefined value is
     * observed, it indicates it does not apply.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun locateId(): Optional<String> = locateId.getOptional("locate_id")

    /**
     * Number of shares granted; set once the locate is granted. When a null/undefined value is
     * observed, it indicates it does not apply.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun quantity(): Optional<Long> = quantity.getOptional("quantity")

    /**
     * Client order id the request relates to, if any. When a null/undefined value is observed, it
     * indicates it does not apply.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun relatedOrderId(): Optional<String> = relatedOrderId.getOptional("related_order_id")

    /**
     * Number of granted shares reserved. When a null/undefined value is observed, it indicates it
     * does not apply.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun reservedQuantity(): Optional<Long> = reservedQuantity.getOptional("reserved_quantity")

    /**
     * Number of granted shares already used. When a null/undefined value is observed, it indicates
     * it does not apply.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun usedQuantity(): Optional<Long> = usedQuantity.getOptional("used_quantity")

    /**
     * Returns the raw JSON value of [accountId].
     *
     * Unlike [accountId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("account_id") @ExcludeMissing fun _accountId(): JsonField<Long> = accountId

    /**
     * Returns the raw JSON value of [clientRequestId].
     *
     * Unlike [clientRequestId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("client_request_id")
    @ExcludeMissing
    fun _clientRequestId(): JsonField<String> = clientRequestId

    /**
     * Returns the raw JSON value of [effectiveDate].
     *
     * Unlike [effectiveDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("effective_date")
    @ExcludeMissing
    fun _effectiveDate(): JsonField<LocalDate> = effectiveDate

    /**
     * Returns the raw JSON value of [instrumentId].
     *
     * Unlike [instrumentId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("instrument_id")
    @ExcludeMissing
    fun _instrumentId(): JsonField<String> = instrumentId

    /**
     * Returns the raw JSON value of [locateRequestId].
     *
     * Unlike [locateRequestId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("locate_request_id")
    @ExcludeMissing
    fun _locateRequestId(): JsonField<String> = locateRequestId

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
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<LocateStatus> = status

    /**
     * Returns the raw JSON value of [locateId].
     *
     * Unlike [locateId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("locate_id") @ExcludeMissing fun _locateId(): JsonField<String> = locateId

    /**
     * Returns the raw JSON value of [quantity].
     *
     * Unlike [quantity], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("quantity") @ExcludeMissing fun _quantity(): JsonField<Long> = quantity

    /**
     * Returns the raw JSON value of [relatedOrderId].
     *
     * Unlike [relatedOrderId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("related_order_id")
    @ExcludeMissing
    fun _relatedOrderId(): JsonField<String> = relatedOrderId

    /**
     * Returns the raw JSON value of [reservedQuantity].
     *
     * Unlike [reservedQuantity], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("reserved_quantity")
    @ExcludeMissing
    fun _reservedQuantity(): JsonField<Long> = reservedQuantity

    /**
     * Returns the raw JSON value of [usedQuantity].
     *
     * Unlike [usedQuantity], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("used_quantity")
    @ExcludeMissing
    fun _usedQuantity(): JsonField<Long> = usedQuantity

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
         * Returns a mutable builder for constructing an instance of [Locate].
         *
         * The following fields are required:
         * ```java
         * .accountId()
         * .clientRequestId()
         * .effectiveDate()
         * .instrumentId()
         * .locateRequestId()
         * .requestedQuantity()
         * .status()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Locate]. */
    class Builder internal constructor() {

        private var accountId: JsonField<Long>? = null
        private var clientRequestId: JsonField<String>? = null
        private var effectiveDate: JsonField<LocalDate>? = null
        private var instrumentId: JsonField<String>? = null
        private var locateRequestId: JsonField<String>? = null
        private var requestedQuantity: JsonField<Long>? = null
        private var status: JsonField<LocateStatus>? = null
        private var locateId: JsonField<String> = JsonMissing.of()
        private var quantity: JsonField<Long> = JsonMissing.of()
        private var relatedOrderId: JsonField<String> = JsonMissing.of()
        private var reservedQuantity: JsonField<Long> = JsonMissing.of()
        private var usedQuantity: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(locate: Locate) = apply {
            accountId = locate.accountId
            clientRequestId = locate.clientRequestId
            effectiveDate = locate.effectiveDate
            instrumentId = locate.instrumentId
            locateRequestId = locate.locateRequestId
            requestedQuantity = locate.requestedQuantity
            status = locate.status
            locateId = locate.locateId
            quantity = locate.quantity
            relatedOrderId = locate.relatedOrderId
            reservedQuantity = locate.reservedQuantity
            usedQuantity = locate.usedQuantity
            additionalProperties = locate.additionalProperties.toMutableMap()
        }

        /** Account the locate is booked to. */
        fun accountId(accountId: Long) = accountId(JsonField.of(accountId))

        /**
         * Sets [Builder.accountId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountId] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun accountId(accountId: JsonField<Long>) = apply { this.accountId = accountId }

        /** Caller-assigned id of the locate request. */
        fun clientRequestId(clientRequestId: String) =
            clientRequestId(JsonField.of(clientRequestId))

        /**
         * Sets [Builder.clientRequestId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.clientRequestId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun clientRequestId(clientRequestId: JsonField<String>) = apply {
            this.clientRequestId = clientRequestId
        }

        /** New York calendar date the locate is in force for. */
        fun effectiveDate(effectiveDate: LocalDate) = effectiveDate(JsonField.of(effectiveDate))

        /**
         * Sets [Builder.effectiveDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.effectiveDate] with a well-typed [LocalDate] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun effectiveDate(effectiveDate: JsonField<LocalDate>) = apply {
            this.effectiveDate = effectiveDate
        }

        /** Instrument id. */
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

        /** Engine-assigned locate request id. */
        fun locateRequestId(locateRequestId: String) =
            locateRequestId(JsonField.of(locateRequestId))

        /**
         * Sets [Builder.locateRequestId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.locateRequestId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun locateRequestId(locateRequestId: JsonField<String>) = apply {
            this.locateRequestId = locateRequestId
        }

        /** Number of shares requested. */
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

        /** Presented status of the locate. */
        fun status(status: LocateStatus) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [LocateStatus] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun status(status: JsonField<LocateStatus>) = apply { this.status = status }

        /**
         * Engine-assigned locate id; set once the locate is granted. When a null/undefined value is
         * observed, it indicates it does not apply.
         */
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

        /**
         * Number of shares granted; set once the locate is granted. When a null/undefined value is
         * observed, it indicates it does not apply.
         */
        fun quantity(quantity: Long?) = quantity(JsonField.ofNullable(quantity))

        /**
         * Alias for [Builder.quantity].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun quantity(quantity: Long) = quantity(quantity as Long?)

        /** Alias for calling [Builder.quantity] with `quantity.orElse(null)`. */
        fun quantity(quantity: Optional<Long>) = quantity(quantity.getOrNull())

        /**
         * Sets [Builder.quantity] to an arbitrary JSON value.
         *
         * You should usually call [Builder.quantity] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun quantity(quantity: JsonField<Long>) = apply { this.quantity = quantity }

        /**
         * Client order id the request relates to, if any. When a null/undefined value is observed,
         * it indicates it does not apply.
         */
        fun relatedOrderId(relatedOrderId: String?) =
            relatedOrderId(JsonField.ofNullable(relatedOrderId))

        /** Alias for calling [Builder.relatedOrderId] with `relatedOrderId.orElse(null)`. */
        fun relatedOrderId(relatedOrderId: Optional<String>) =
            relatedOrderId(relatedOrderId.getOrNull())

        /**
         * Sets [Builder.relatedOrderId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.relatedOrderId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun relatedOrderId(relatedOrderId: JsonField<String>) = apply {
            this.relatedOrderId = relatedOrderId
        }

        /**
         * Number of granted shares reserved. When a null/undefined value is observed, it indicates
         * it does not apply.
         */
        fun reservedQuantity(reservedQuantity: Long?) =
            reservedQuantity(JsonField.ofNullable(reservedQuantity))

        /**
         * Alias for [Builder.reservedQuantity].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun reservedQuantity(reservedQuantity: Long) = reservedQuantity(reservedQuantity as Long?)

        /** Alias for calling [Builder.reservedQuantity] with `reservedQuantity.orElse(null)`. */
        fun reservedQuantity(reservedQuantity: Optional<Long>) =
            reservedQuantity(reservedQuantity.getOrNull())

        /**
         * Sets [Builder.reservedQuantity] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reservedQuantity] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun reservedQuantity(reservedQuantity: JsonField<Long>) = apply {
            this.reservedQuantity = reservedQuantity
        }

        /**
         * Number of granted shares already used. When a null/undefined value is observed, it
         * indicates it does not apply.
         */
        fun usedQuantity(usedQuantity: Long?) = usedQuantity(JsonField.ofNullable(usedQuantity))

        /**
         * Alias for [Builder.usedQuantity].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun usedQuantity(usedQuantity: Long) = usedQuantity(usedQuantity as Long?)

        /** Alias for calling [Builder.usedQuantity] with `usedQuantity.orElse(null)`. */
        fun usedQuantity(usedQuantity: Optional<Long>) = usedQuantity(usedQuantity.getOrNull())

        /**
         * Sets [Builder.usedQuantity] to an arbitrary JSON value.
         *
         * You should usually call [Builder.usedQuantity] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun usedQuantity(usedQuantity: JsonField<Long>) = apply { this.usedQuantity = usedQuantity }

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
         * Returns an immutable instance of [Locate].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .accountId()
         * .clientRequestId()
         * .effectiveDate()
         * .instrumentId()
         * .locateRequestId()
         * .requestedQuantity()
         * .status()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): Locate =
            Locate(
                checkRequired("accountId", accountId),
                checkRequired("clientRequestId", clientRequestId),
                checkRequired("effectiveDate", effectiveDate),
                checkRequired("instrumentId", instrumentId),
                checkRequired("locateRequestId", locateRequestId),
                checkRequired("requestedQuantity", requestedQuantity),
                checkRequired("status", status),
                locateId,
                quantity,
                relatedOrderId,
                reservedQuantity,
                usedQuantity,
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
    fun validate(): Locate = apply {
        if (validated) {
            return@apply
        }

        accountId()
        clientRequestId()
        effectiveDate()
        instrumentId()
        locateRequestId()
        requestedQuantity()
        status().validate()
        locateId()
        quantity()
        relatedOrderId()
        reservedQuantity()
        usedQuantity()
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
            (if (clientRequestId.asKnown().isPresent) 1 else 0) +
            (if (effectiveDate.asKnown().isPresent) 1 else 0) +
            (if (instrumentId.asKnown().isPresent) 1 else 0) +
            (if (locateRequestId.asKnown().isPresent) 1 else 0) +
            (if (requestedQuantity.asKnown().isPresent) 1 else 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (if (locateId.asKnown().isPresent) 1 else 0) +
            (if (quantity.asKnown().isPresent) 1 else 0) +
            (if (relatedOrderId.asKnown().isPresent) 1 else 0) +
            (if (reservedQuantity.asKnown().isPresent) 1 else 0) +
            (if (usedQuantity.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Locate &&
            accountId == other.accountId &&
            clientRequestId == other.clientRequestId &&
            effectiveDate == other.effectiveDate &&
            instrumentId == other.instrumentId &&
            locateRequestId == other.locateRequestId &&
            requestedQuantity == other.requestedQuantity &&
            status == other.status &&
            locateId == other.locateId &&
            quantity == other.quantity &&
            relatedOrderId == other.relatedOrderId &&
            reservedQuantity == other.reservedQuantity &&
            usedQuantity == other.usedQuantity &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            accountId,
            clientRequestId,
            effectiveDate,
            instrumentId,
            locateRequestId,
            requestedQuantity,
            status,
            locateId,
            quantity,
            relatedOrderId,
            reservedQuantity,
            usedQuantity,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Locate{accountId=$accountId, clientRequestId=$clientRequestId, effectiveDate=$effectiveDate, instrumentId=$instrumentId, locateRequestId=$locateRequestId, requestedQuantity=$requestedQuantity, status=$status, locateId=$locateId, quantity=$quantity, relatedOrderId=$relatedOrderId, reservedQuantity=$reservedQuantity, usedQuantity=$usedQuantity, additionalProperties=$additionalProperties}"
}
