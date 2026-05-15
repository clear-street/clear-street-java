// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.positions

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

/** A position instruction and its current lifecycle state. */
class PositionInstruction
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val accountId: JsonField<Long>,
    private val instructionId: JsonField<String>,
    private val instructionType: JsonField<PositionInstructionType>,
    private val instrumentId: JsonField<String>,
    private val quantity: JsonField<String>,
    private val status: JsonField<PositionInstructionStatus>,
    private val symbol: JsonField<String>,
    private val acceptedQuantity: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val rejectionReason: JsonField<String>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("account_id") @ExcludeMissing accountId: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("instruction_id")
        @ExcludeMissing
        instructionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("instruction_type")
        @ExcludeMissing
        instructionType: JsonField<PositionInstructionType> = JsonMissing.of(),
        @JsonProperty("instrument_id")
        @ExcludeMissing
        instrumentId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("quantity") @ExcludeMissing quantity: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status")
        @ExcludeMissing
        status: JsonField<PositionInstructionStatus> = JsonMissing.of(),
        @JsonProperty("symbol") @ExcludeMissing symbol: JsonField<String> = JsonMissing.of(),
        @JsonProperty("accepted_quantity")
        @ExcludeMissing
        acceptedQuantity: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("rejection_reason")
        @ExcludeMissing
        rejectionReason: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(
        id,
        accountId,
        instructionId,
        instructionType,
        instrumentId,
        quantity,
        status,
        symbol,
        acceptedQuantity,
        createdAt,
        rejectionReason,
        updatedAt,
        mutableMapOf(),
    )

    /**
     * Server-assigned id. Used as the path parameter on cancel.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * Account the instruction belongs to.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun accountId(): Long = accountId.getRequired("account_id")

    /**
     * Caller-supplied idempotency key echoed from the submit request; the server-assigned fallback
     * when none was supplied.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun instructionId(): String = instructionId.getRequired("instruction_id")

    /**
     * The action this instruction requests.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun instructionType(): PositionInstructionType = instructionType.getRequired("instruction_type")

    /**
     * Identifier of the options contract this instruction acts on.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun instrumentId(): String = instrumentId.getRequired("instrument_id")

    /**
     * Number of contracts included in the instruction.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun quantity(): String = quantity.getRequired("quantity")

    /**
     * Current lifecycle status.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): PositionInstructionStatus = status.getRequired("status")

    /**
     * Options symbol (OSI) for display.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun symbol(): String = symbol.getRequired("symbol")

    /**
     * Number of contracts accepted by the clearing venue. Populated once the instruction reaches
     * `ACCEPTED`.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun acceptedQuantity(): Optional<String> = acceptedQuantity.getOptional("accepted_quantity")

    /**
     * When the instruction was first accepted by the service.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("created_at")

    /**
     * Human-readable explanation populated on any non-success terminal status — `REJECTED`,
     * `ENGINE_REJECTED`, or `CANCEL_FAILED`. On a `207 Multi-Status` batch submit the top-level
     * `error` field summarizes the batch; per-row detail continues to live here.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun rejectionReason(): Optional<String> = rejectionReason.getOptional("rejection_reason")

    /**
     * When the instruction's lifecycle state last changed.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun updatedAt(): Optional<OffsetDateTime> = updatedAt.getOptional("updated_at")

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
     * Returns the raw JSON value of [instructionId].
     *
     * Unlike [instructionId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("instruction_id")
    @ExcludeMissing
    fun _instructionId(): JsonField<String> = instructionId

    /**
     * Returns the raw JSON value of [instructionType].
     *
     * Unlike [instructionType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("instruction_type")
    @ExcludeMissing
    fun _instructionType(): JsonField<PositionInstructionType> = instructionType

    /**
     * Returns the raw JSON value of [instrumentId].
     *
     * Unlike [instrumentId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("instrument_id")
    @ExcludeMissing
    fun _instrumentId(): JsonField<String> = instrumentId

    /**
     * Returns the raw JSON value of [quantity].
     *
     * Unlike [quantity], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("quantity") @ExcludeMissing fun _quantity(): JsonField<String> = quantity

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status")
    @ExcludeMissing
    fun _status(): JsonField<PositionInstructionStatus> = status

    /**
     * Returns the raw JSON value of [symbol].
     *
     * Unlike [symbol], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("symbol") @ExcludeMissing fun _symbol(): JsonField<String> = symbol

    /**
     * Returns the raw JSON value of [acceptedQuantity].
     *
     * Unlike [acceptedQuantity], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("accepted_quantity")
    @ExcludeMissing
    fun _acceptedQuantity(): JsonField<String> = acceptedQuantity

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [rejectionReason].
     *
     * Unlike [rejectionReason], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rejection_reason")
    @ExcludeMissing
    fun _rejectionReason(): JsonField<String> = rejectionReason

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated_at")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

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
         * Returns a mutable builder for constructing an instance of [PositionInstruction].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .accountId()
         * .instructionId()
         * .instructionType()
         * .instrumentId()
         * .quantity()
         * .status()
         * .symbol()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PositionInstruction]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var accountId: JsonField<Long>? = null
        private var instructionId: JsonField<String>? = null
        private var instructionType: JsonField<PositionInstructionType>? = null
        private var instrumentId: JsonField<String>? = null
        private var quantity: JsonField<String>? = null
        private var status: JsonField<PositionInstructionStatus>? = null
        private var symbol: JsonField<String>? = null
        private var acceptedQuantity: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var rejectionReason: JsonField<String> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(positionInstruction: PositionInstruction) = apply {
            id = positionInstruction.id
            accountId = positionInstruction.accountId
            instructionId = positionInstruction.instructionId
            instructionType = positionInstruction.instructionType
            instrumentId = positionInstruction.instrumentId
            quantity = positionInstruction.quantity
            status = positionInstruction.status
            symbol = positionInstruction.symbol
            acceptedQuantity = positionInstruction.acceptedQuantity
            createdAt = positionInstruction.createdAt
            rejectionReason = positionInstruction.rejectionReason
            updatedAt = positionInstruction.updatedAt
            additionalProperties = positionInstruction.additionalProperties.toMutableMap()
        }

        /** Server-assigned id. Used as the path parameter on cancel. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Account the instruction belongs to. */
        fun accountId(accountId: Long) = accountId(JsonField.of(accountId))

        /**
         * Sets [Builder.accountId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountId] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun accountId(accountId: JsonField<Long>) = apply { this.accountId = accountId }

        /**
         * Caller-supplied idempotency key echoed from the submit request; the server-assigned
         * fallback when none was supplied.
         */
        fun instructionId(instructionId: String) = instructionId(JsonField.of(instructionId))

        /**
         * Sets [Builder.instructionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.instructionId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun instructionId(instructionId: JsonField<String>) = apply {
            this.instructionId = instructionId
        }

        /** The action this instruction requests. */
        fun instructionType(instructionType: PositionInstructionType) =
            instructionType(JsonField.of(instructionType))

        /**
         * Sets [Builder.instructionType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.instructionType] with a well-typed
         * [PositionInstructionType] value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun instructionType(instructionType: JsonField<PositionInstructionType>) = apply {
            this.instructionType = instructionType
        }

        /** Identifier of the options contract this instruction acts on. */
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

        /** Number of contracts included in the instruction. */
        fun quantity(quantity: String) = quantity(JsonField.of(quantity))

        /**
         * Sets [Builder.quantity] to an arbitrary JSON value.
         *
         * You should usually call [Builder.quantity] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun quantity(quantity: JsonField<String>) = apply { this.quantity = quantity }

        /** Current lifecycle status. */
        fun status(status: PositionInstructionStatus) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [PositionInstructionStatus]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun status(status: JsonField<PositionInstructionStatus>) = apply { this.status = status }

        /** Options symbol (OSI) for display. */
        fun symbol(symbol: String) = symbol(JsonField.of(symbol))

        /**
         * Sets [Builder.symbol] to an arbitrary JSON value.
         *
         * You should usually call [Builder.symbol] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun symbol(symbol: JsonField<String>) = apply { this.symbol = symbol }

        /**
         * Number of contracts accepted by the clearing venue. Populated once the instruction
         * reaches `ACCEPTED`.
         */
        fun acceptedQuantity(acceptedQuantity: String?) =
            acceptedQuantity(JsonField.ofNullable(acceptedQuantity))

        /** Alias for calling [Builder.acceptedQuantity] with `acceptedQuantity.orElse(null)`. */
        fun acceptedQuantity(acceptedQuantity: Optional<String>) =
            acceptedQuantity(acceptedQuantity.getOrNull())

        /**
         * Sets [Builder.acceptedQuantity] to an arbitrary JSON value.
         *
         * You should usually call [Builder.acceptedQuantity] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun acceptedQuantity(acceptedQuantity: JsonField<String>) = apply {
            this.acceptedQuantity = acceptedQuantity
        }

        /** When the instruction was first accepted by the service. */
        fun createdAt(createdAt: OffsetDateTime?) = createdAt(JsonField.ofNullable(createdAt))

        /** Alias for calling [Builder.createdAt] with `createdAt.orElse(null)`. */
        fun createdAt(createdAt: Optional<OffsetDateTime>) = createdAt(createdAt.getOrNull())

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /**
         * Human-readable explanation populated on any non-success terminal status — `REJECTED`,
         * `ENGINE_REJECTED`, or `CANCEL_FAILED`. On a `207 Multi-Status` batch submit the top-level
         * `error` field summarizes the batch; per-row detail continues to live here.
         */
        fun rejectionReason(rejectionReason: String?) =
            rejectionReason(JsonField.ofNullable(rejectionReason))

        /** Alias for calling [Builder.rejectionReason] with `rejectionReason.orElse(null)`. */
        fun rejectionReason(rejectionReason: Optional<String>) =
            rejectionReason(rejectionReason.getOrNull())

        /**
         * Sets [Builder.rejectionReason] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rejectionReason] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun rejectionReason(rejectionReason: JsonField<String>) = apply {
            this.rejectionReason = rejectionReason
        }

        /** When the instruction's lifecycle state last changed. */
        fun updatedAt(updatedAt: OffsetDateTime?) = updatedAt(JsonField.ofNullable(updatedAt))

        /** Alias for calling [Builder.updatedAt] with `updatedAt.orElse(null)`. */
        fun updatedAt(updatedAt: Optional<OffsetDateTime>) = updatedAt(updatedAt.getOrNull())

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

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
         * Returns an immutable instance of [PositionInstruction].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .accountId()
         * .instructionId()
         * .instructionType()
         * .instrumentId()
         * .quantity()
         * .status()
         * .symbol()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PositionInstruction =
            PositionInstruction(
                checkRequired("id", id),
                checkRequired("accountId", accountId),
                checkRequired("instructionId", instructionId),
                checkRequired("instructionType", instructionType),
                checkRequired("instrumentId", instrumentId),
                checkRequired("quantity", quantity),
                checkRequired("status", status),
                checkRequired("symbol", symbol),
                acceptedQuantity,
                createdAt,
                rejectionReason,
                updatedAt,
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
    fun validate(): PositionInstruction = apply {
        if (validated) {
            return@apply
        }

        id()
        accountId()
        instructionId()
        instructionType().validate()
        instrumentId()
        quantity()
        status().validate()
        symbol()
        acceptedQuantity()
        createdAt()
        rejectionReason()
        updatedAt()
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
            (if (instructionId.asKnown().isPresent) 1 else 0) +
            (instructionType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (instrumentId.asKnown().isPresent) 1 else 0) +
            (if (quantity.asKnown().isPresent) 1 else 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (if (symbol.asKnown().isPresent) 1 else 0) +
            (if (acceptedQuantity.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (rejectionReason.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PositionInstruction &&
            id == other.id &&
            accountId == other.accountId &&
            instructionId == other.instructionId &&
            instructionType == other.instructionType &&
            instrumentId == other.instrumentId &&
            quantity == other.quantity &&
            status == other.status &&
            symbol == other.symbol &&
            acceptedQuantity == other.acceptedQuantity &&
            createdAt == other.createdAt &&
            rejectionReason == other.rejectionReason &&
            updatedAt == other.updatedAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            accountId,
            instructionId,
            instructionType,
            instrumentId,
            quantity,
            status,
            symbol,
            acceptedQuantity,
            createdAt,
            rejectionReason,
            updatedAt,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PositionInstruction{id=$id, accountId=$accountId, instructionId=$instructionId, instructionType=$instructionType, instrumentId=$instrumentId, quantity=$quantity, status=$status, symbol=$symbol, acceptedQuantity=$acceptedQuantity, createdAt=$createdAt, rejectionReason=$rejectionReason, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
