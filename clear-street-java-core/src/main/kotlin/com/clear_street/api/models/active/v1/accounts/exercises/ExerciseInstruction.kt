// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.accounts.exercises

import com.clear_street.api.core.ExcludeMissing
import com.clear_street.api.core.JsonField
import com.clear_street.api.core.JsonMissing
import com.clear_street.api.core.JsonValue
import com.clear_street.api.core.checkRequired
import com.clear_street.api.errors.ClearStreetInvalidDataException
import com.clear_street.api.models.v1.SecurityIdSource
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
 * The API representation of a single CSC instruction, combining the caller's request with the
 * `oems-csc` lifecycle state.
 */
class ExerciseInstruction
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val accountId: JsonField<Long>,
    private val action: JsonField<ExerciseAction>,
    private val clientExerciseId: JsonField<String>,
    private val instrumentId: JsonField<String>,
    private val quantity: JsonField<String>,
    private val securityId: JsonField<String>,
    private val securityIdSource: JsonField<SecurityIdSource>,
    private val status: JsonField<ExerciseStatus>,
    private val symbol: JsonField<String>,
    private val acceptedQuantity: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val error: JsonField<String>,
    private val rejectionReason: JsonField<String>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("account_id") @ExcludeMissing accountId: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("action")
        @ExcludeMissing
        action: JsonField<ExerciseAction> = JsonMissing.of(),
        @JsonProperty("client_exercise_id")
        @ExcludeMissing
        clientExerciseId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("instrument_id")
        @ExcludeMissing
        instrumentId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("quantity") @ExcludeMissing quantity: JsonField<String> = JsonMissing.of(),
        @JsonProperty("security_id")
        @ExcludeMissing
        securityId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("security_id_source")
        @ExcludeMissing
        securityIdSource: JsonField<SecurityIdSource> = JsonMissing.of(),
        @JsonProperty("status")
        @ExcludeMissing
        status: JsonField<ExerciseStatus> = JsonMissing.of(),
        @JsonProperty("symbol") @ExcludeMissing symbol: JsonField<String> = JsonMissing.of(),
        @JsonProperty("accepted_quantity")
        @ExcludeMissing
        acceptedQuantity: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("error") @ExcludeMissing error: JsonField<String> = JsonMissing.of(),
        @JsonProperty("rejection_reason")
        @ExcludeMissing
        rejectionReason: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(
        id,
        accountId,
        action,
        clientExerciseId,
        instrumentId,
        quantity,
        securityId,
        securityIdSource,
        status,
        symbol,
        acceptedQuantity,
        createdAt,
        error,
        rejectionReason,
        updatedAt,
        mutableMapOf(),
    )

    /**
     * Stable server-assigned id for the instruction (the engine instruction UUID). Used as the
     * `{exercise_id}` path parameter on DELETE.
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
     * The instruction type as understood by this API.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun action(): ExerciseAction = action.getRequired("action")

    /**
     * Caller-supplied correlation id (echoed from the submit request, or the server-generated
     * fallback when the caller omitted one).
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun clientExerciseId(): String = clientExerciseId.getRequired("client_exercise_id")

    /**
     * OEMS instrument identifier the instruction is for.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun instrumentId(): String = instrumentId.getRequired("instrument_id")

    /**
     * Quantity of contracts.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun quantity(): String = quantity.getRequired("quantity")

    /**
     * Security identifier (display-only; resolved from the instrument cache).
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun securityId(): String = securityId.getRequired("security_id")

    /**
     * Security identifier source (display-only).
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun securityIdSource(): SecurityIdSource = securityIdSource.getRequired("security_id_source")

    /**
     * Current lifecycle status.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): ExerciseStatus = status.getRequired("status")

    /**
     * Trading symbol resolved from the instrument cache. Empty if the instrument cannot be resolved
     * (e.g. expired option).
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun symbol(): String = symbol.getRequired("symbol")

    /**
     * Quantity accepted by OCC. Populated after `ACCEPTED`.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun acceptedQuantity(): Optional<String> = acceptedQuantity.getOptional("accepted_quantity")

    /**
     * Row creation timestamp surfaced from `oems-csc`.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("created_at")

    /**
     * Inline error detail when a batch entry was rejected (omitted on success).
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun error(): Optional<String> = error.getOptional("error")

    /**
     * Reason text populated on terminal reject / cancel-failed statuses.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun rejectionReason(): Optional<String> = rejectionReason.getOptional("rejection_reason")

    /**
     * Last update timestamp surfaced from `oems-csc`.
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
     * Returns the raw JSON value of [action].
     *
     * Unlike [action], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("action") @ExcludeMissing fun _action(): JsonField<ExerciseAction> = action

    /**
     * Returns the raw JSON value of [clientExerciseId].
     *
     * Unlike [clientExerciseId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("client_exercise_id")
    @ExcludeMissing
    fun _clientExerciseId(): JsonField<String> = clientExerciseId

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
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<ExerciseStatus> = status

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
     * Returns the raw JSON value of [error].
     *
     * Unlike [error], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("error") @ExcludeMissing fun _error(): JsonField<String> = error

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
         * Returns a mutable builder for constructing an instance of [ExerciseInstruction].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .accountId()
         * .action()
         * .clientExerciseId()
         * .instrumentId()
         * .quantity()
         * .securityId()
         * .securityIdSource()
         * .status()
         * .symbol()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ExerciseInstruction]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var accountId: JsonField<Long>? = null
        private var action: JsonField<ExerciseAction>? = null
        private var clientExerciseId: JsonField<String>? = null
        private var instrumentId: JsonField<String>? = null
        private var quantity: JsonField<String>? = null
        private var securityId: JsonField<String>? = null
        private var securityIdSource: JsonField<SecurityIdSource>? = null
        private var status: JsonField<ExerciseStatus>? = null
        private var symbol: JsonField<String>? = null
        private var acceptedQuantity: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var error: JsonField<String> = JsonMissing.of()
        private var rejectionReason: JsonField<String> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(exerciseInstruction: ExerciseInstruction) = apply {
            id = exerciseInstruction.id
            accountId = exerciseInstruction.accountId
            action = exerciseInstruction.action
            clientExerciseId = exerciseInstruction.clientExerciseId
            instrumentId = exerciseInstruction.instrumentId
            quantity = exerciseInstruction.quantity
            securityId = exerciseInstruction.securityId
            securityIdSource = exerciseInstruction.securityIdSource
            status = exerciseInstruction.status
            symbol = exerciseInstruction.symbol
            acceptedQuantity = exerciseInstruction.acceptedQuantity
            createdAt = exerciseInstruction.createdAt
            error = exerciseInstruction.error
            rejectionReason = exerciseInstruction.rejectionReason
            updatedAt = exerciseInstruction.updatedAt
            additionalProperties = exerciseInstruction.additionalProperties.toMutableMap()
        }

        /**
         * Stable server-assigned id for the instruction (the engine instruction UUID). Used as the
         * `{exercise_id}` path parameter on DELETE.
         */
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

        /** The instruction type as understood by this API. */
        fun action(action: ExerciseAction) = action(JsonField.of(action))

        /**
         * Sets [Builder.action] to an arbitrary JSON value.
         *
         * You should usually call [Builder.action] with a well-typed [ExerciseAction] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun action(action: JsonField<ExerciseAction>) = apply { this.action = action }

        /**
         * Caller-supplied correlation id (echoed from the submit request, or the server-generated
         * fallback when the caller omitted one).
         */
        fun clientExerciseId(clientExerciseId: String) =
            clientExerciseId(JsonField.of(clientExerciseId))

        /**
         * Sets [Builder.clientExerciseId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.clientExerciseId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun clientExerciseId(clientExerciseId: JsonField<String>) = apply {
            this.clientExerciseId = clientExerciseId
        }

        /** OEMS instrument identifier the instruction is for. */
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

        /** Quantity of contracts. */
        fun quantity(quantity: String) = quantity(JsonField.of(quantity))

        /**
         * Sets [Builder.quantity] to an arbitrary JSON value.
         *
         * You should usually call [Builder.quantity] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun quantity(quantity: JsonField<String>) = apply { this.quantity = quantity }

        /** Security identifier (display-only; resolved from the instrument cache). */
        fun securityId(securityId: String) = securityId(JsonField.of(securityId))

        /**
         * Sets [Builder.securityId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.securityId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun securityId(securityId: JsonField<String>) = apply { this.securityId = securityId }

        /** Security identifier source (display-only). */
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

        /** Current lifecycle status. */
        fun status(status: ExerciseStatus) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [ExerciseStatus] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun status(status: JsonField<ExerciseStatus>) = apply { this.status = status }

        /**
         * Trading symbol resolved from the instrument cache. Empty if the instrument cannot be
         * resolved (e.g. expired option).
         */
        fun symbol(symbol: String) = symbol(JsonField.of(symbol))

        /**
         * Sets [Builder.symbol] to an arbitrary JSON value.
         *
         * You should usually call [Builder.symbol] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun symbol(symbol: JsonField<String>) = apply { this.symbol = symbol }

        /** Quantity accepted by OCC. Populated after `ACCEPTED`. */
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

        /** Row creation timestamp surfaced from `oems-csc`. */
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

        /** Inline error detail when a batch entry was rejected (omitted on success). */
        fun error(error: String?) = error(JsonField.ofNullable(error))

        /** Alias for calling [Builder.error] with `error.orElse(null)`. */
        fun error(error: Optional<String>) = error(error.getOrNull())

        /**
         * Sets [Builder.error] to an arbitrary JSON value.
         *
         * You should usually call [Builder.error] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun error(error: JsonField<String>) = apply { this.error = error }

        /** Reason text populated on terminal reject / cancel-failed statuses. */
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

        /** Last update timestamp surfaced from `oems-csc`. */
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
         * Returns an immutable instance of [ExerciseInstruction].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .accountId()
         * .action()
         * .clientExerciseId()
         * .instrumentId()
         * .quantity()
         * .securityId()
         * .securityIdSource()
         * .status()
         * .symbol()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ExerciseInstruction =
            ExerciseInstruction(
                checkRequired("id", id),
                checkRequired("accountId", accountId),
                checkRequired("action", action),
                checkRequired("clientExerciseId", clientExerciseId),
                checkRequired("instrumentId", instrumentId),
                checkRequired("quantity", quantity),
                checkRequired("securityId", securityId),
                checkRequired("securityIdSource", securityIdSource),
                checkRequired("status", status),
                checkRequired("symbol", symbol),
                acceptedQuantity,
                createdAt,
                error,
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
    fun validate(): ExerciseInstruction = apply {
        if (validated) {
            return@apply
        }

        id()
        accountId()
        action().validate()
        clientExerciseId()
        instrumentId()
        quantity()
        securityId()
        securityIdSource().validate()
        status().validate()
        symbol()
        acceptedQuantity()
        createdAt()
        error()
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
            (action.asKnown().getOrNull()?.validity() ?: 0) +
            (if (clientExerciseId.asKnown().isPresent) 1 else 0) +
            (if (instrumentId.asKnown().isPresent) 1 else 0) +
            (if (quantity.asKnown().isPresent) 1 else 0) +
            (if (securityId.asKnown().isPresent) 1 else 0) +
            (securityIdSource.asKnown().getOrNull()?.validity() ?: 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (if (symbol.asKnown().isPresent) 1 else 0) +
            (if (acceptedQuantity.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (error.asKnown().isPresent) 1 else 0) +
            (if (rejectionReason.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ExerciseInstruction &&
            id == other.id &&
            accountId == other.accountId &&
            action == other.action &&
            clientExerciseId == other.clientExerciseId &&
            instrumentId == other.instrumentId &&
            quantity == other.quantity &&
            securityId == other.securityId &&
            securityIdSource == other.securityIdSource &&
            status == other.status &&
            symbol == other.symbol &&
            acceptedQuantity == other.acceptedQuantity &&
            createdAt == other.createdAt &&
            error == other.error &&
            rejectionReason == other.rejectionReason &&
            updatedAt == other.updatedAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            accountId,
            action,
            clientExerciseId,
            instrumentId,
            quantity,
            securityId,
            securityIdSource,
            status,
            symbol,
            acceptedQuantity,
            createdAt,
            error,
            rejectionReason,
            updatedAt,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ExerciseInstruction{id=$id, accountId=$accountId, action=$action, clientExerciseId=$clientExerciseId, instrumentId=$instrumentId, quantity=$quantity, securityId=$securityId, securityIdSource=$securityIdSource, status=$status, symbol=$symbol, acceptedQuantity=$acceptedQuantity, createdAt=$createdAt, error=$error, rejectionReason=$rejectionReason, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
