// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.positions

import com.clear_street.api.core.ExcludeMissing
import com.clear_street.api.core.JsonField
import com.clear_street.api.core.JsonMissing
import com.clear_street.api.core.JsonValue
import com.clear_street.api.core.Params
import com.clear_street.api.core.checkRequired
import com.clear_street.api.core.http.Headers
import com.clear_street.api.core.http.QueryParams
import com.clear_street.api.core.toImmutable
import com.clear_street.api.errors.ClearStreetInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Submit one or more position instructions (Exercise, Do-Not-Exercise, Contrary Exercise Advice)
 * against the account.
 *
 * Batch semantics:
 * - **All rows accepted** → `200 OK`. Every row is in `data` with `status = SENT`.
 * - **Partial success** → `207 Multi-Status`. `data` contains every row; rejected rows carry
 *   `status = ENGINE_REJECTED` (or `REJECTED`) and `rejection_reason`. The top-level `error`
 *   summarizes the batch failure.
 * - **All rows rejected** → `4xx`/`5xx` error response. The HTTP status reflects the underlying
 *   cause: `409` for duplicate `instruction_id`, `400` for validation failures such as DNE/CEA on a
 *   non-expiry day, `503` if the clearing service is unavailable. No `data` is returned.
 *
 * Pre-flight validation (unknown `instrument_id`, unencodable `quantity`) short-circuits the whole
 * batch with a `4xx` before any row is submitted.
 */
class PositionSubmitPositionInstructionsParams
private constructor(
    private val accountId: Long?,
    private val instructions: List<Instruction>,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun accountId(): Optional<Long> = Optional.ofNullable(accountId)

    fun instructions(): List<Instruction> = instructions

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [PositionSubmitPositionInstructionsParams].
         *
         * The following fields are required:
         * ```java
         * .instructions()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PositionSubmitPositionInstructionsParams]. */
    class Builder internal constructor() {

        private var accountId: Long? = null
        private var instructions: MutableList<Instruction>? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            positionSubmitPositionInstructionsParams: PositionSubmitPositionInstructionsParams
        ) = apply {
            accountId = positionSubmitPositionInstructionsParams.accountId
            instructions = positionSubmitPositionInstructionsParams.instructions.toMutableList()
            additionalHeaders =
                positionSubmitPositionInstructionsParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                positionSubmitPositionInstructionsParams.additionalQueryParams.toBuilder()
        }

        fun accountId(accountId: Long?) = apply { this.accountId = accountId }

        /**
         * Alias for [Builder.accountId].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun accountId(accountId: Long) = accountId(accountId as Long?)

        /** Alias for calling [Builder.accountId] with `accountId.orElse(null)`. */
        fun accountId(accountId: Optional<Long>) = accountId(accountId.getOrNull())

        fun instructions(instructions: List<Instruction>) = apply {
            this.instructions = instructions.toMutableList()
        }

        /**
         * Adds a single [Instruction] to [instructions].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addInstruction(instruction: Instruction) = apply {
            instructions = (instructions ?: mutableListOf()).apply { add(instruction) }
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [PositionSubmitPositionInstructionsParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .instructions()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PositionSubmitPositionInstructionsParams =
            PositionSubmitPositionInstructionsParams(
                accountId,
                checkRequired("instructions", instructions).toImmutable(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): List<Instruction> = instructions

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> accountId?.toString() ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /**
     * A position instruction to submit.
     *
     * Use `DELETE /accounts/{account_id}/positions/instructions/{instruction_id}` to cancel an
     * outstanding instruction.
     */
    class Instruction
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val instructionType: JsonField<PositionInstructionType>,
        private val instrumentId: JsonField<String>,
        private val quantity: JsonField<String>,
        private val instructionId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("instruction_type")
            @ExcludeMissing
            instructionType: JsonField<PositionInstructionType> = JsonMissing.of(),
            @JsonProperty("instrument_id")
            @ExcludeMissing
            instrumentId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("quantity")
            @ExcludeMissing
            quantity: JsonField<String> = JsonMissing.of(),
            @JsonProperty("instruction_id")
            @ExcludeMissing
            instructionId: JsonField<String> = JsonMissing.of(),
        ) : this(instructionType, instrumentId, quantity, instructionId, mutableMapOf())

        /**
         * The action to take.
         *
         * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun instructionType(): PositionInstructionType =
            instructionType.getRequired("instruction_type")

        /**
         * Identifier of the options contract to act on. Unknown ids return 404.
         *
         * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun instrumentId(): String = instrumentId.getRequired("instrument_id")

        /**
         * Number of contracts to include in the instruction.
         *
         * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun quantity(): String = quantity.getRequired("quantity")

        /**
         * Caller-supplied idempotency key. Echoed on the response. The server generates a unique id
         * when omitted.
         *
         * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun instructionId(): Optional<String> = instructionId.getOptional("instruction_id")

        /**
         * Returns the raw JSON value of [instructionType].
         *
         * Unlike [instructionType], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("instruction_type")
        @ExcludeMissing
        fun _instructionType(): JsonField<PositionInstructionType> = instructionType

        /**
         * Returns the raw JSON value of [instrumentId].
         *
         * Unlike [instrumentId], this method doesn't throw if the JSON field has an unexpected
         * type.
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
         * Returns the raw JSON value of [instructionId].
         *
         * Unlike [instructionId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("instruction_id")
        @ExcludeMissing
        fun _instructionId(): JsonField<String> = instructionId

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
             * Returns a mutable builder for constructing an instance of [Instruction].
             *
             * The following fields are required:
             * ```java
             * .instructionType()
             * .instrumentId()
             * .quantity()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Instruction]. */
        class Builder internal constructor() {

            private var instructionType: JsonField<PositionInstructionType>? = null
            private var instrumentId: JsonField<String>? = null
            private var quantity: JsonField<String>? = null
            private var instructionId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(instruction: Instruction) = apply {
                instructionType = instruction.instructionType
                instrumentId = instruction.instrumentId
                quantity = instruction.quantity
                instructionId = instruction.instructionId
                additionalProperties = instruction.additionalProperties.toMutableMap()
            }

            /** The action to take. */
            fun instructionType(instructionType: PositionInstructionType) =
                instructionType(JsonField.of(instructionType))

            /**
             * Sets [Builder.instructionType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.instructionType] with a well-typed
             * [PositionInstructionType] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun instructionType(instructionType: JsonField<PositionInstructionType>) = apply {
                this.instructionType = instructionType
            }

            /** Identifier of the options contract to act on. Unknown ids return 404. */
            fun instrumentId(instrumentId: String) = instrumentId(JsonField.of(instrumentId))

            /**
             * Sets [Builder.instrumentId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.instrumentId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun instrumentId(instrumentId: JsonField<String>) = apply {
                this.instrumentId = instrumentId
            }

            /** Number of contracts to include in the instruction. */
            fun quantity(quantity: String) = quantity(JsonField.of(quantity))

            /**
             * Sets [Builder.quantity] to an arbitrary JSON value.
             *
             * You should usually call [Builder.quantity] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun quantity(quantity: JsonField<String>) = apply { this.quantity = quantity }

            /**
             * Caller-supplied idempotency key. Echoed on the response. The server generates a
             * unique id when omitted.
             */
            fun instructionId(instructionId: String?) =
                instructionId(JsonField.ofNullable(instructionId))

            /** Alias for calling [Builder.instructionId] with `instructionId.orElse(null)`. */
            fun instructionId(instructionId: Optional<String>) =
                instructionId(instructionId.getOrNull())

            /**
             * Sets [Builder.instructionId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.instructionId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun instructionId(instructionId: JsonField<String>) = apply {
                this.instructionId = instructionId
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
             * Returns an immutable instance of [Instruction].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .instructionType()
             * .instrumentId()
             * .quantity()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Instruction =
                Instruction(
                    checkRequired("instructionType", instructionType),
                    checkRequired("instrumentId", instrumentId),
                    checkRequired("quantity", quantity),
                    instructionId,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws ClearStreetInvalidDataException if any value type in this object doesn't match
         *   its expected type.
         */
        fun validate(): Instruction = apply {
            if (validated) {
                return@apply
            }

            instructionType().validate()
            instrumentId()
            quantity()
            instructionId()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (instructionType.asKnown().getOrNull()?.validity() ?: 0) +
                (if (instrumentId.asKnown().isPresent) 1 else 0) +
                (if (quantity.asKnown().isPresent) 1 else 0) +
                (if (instructionId.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Instruction &&
                instructionType == other.instructionType &&
                instrumentId == other.instrumentId &&
                quantity == other.quantity &&
                instructionId == other.instructionId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                instructionType,
                instrumentId,
                quantity,
                instructionId,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Instruction{instructionType=$instructionType, instrumentId=$instrumentId, quantity=$quantity, instructionId=$instructionId, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PositionSubmitPositionInstructionsParams &&
            accountId == other.accountId &&
            instructions == other.instructions &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(accountId, instructions, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "PositionSubmitPositionInstructionsParams{accountId=$accountId, instructions=$instructions, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
