// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.accounts.exercises

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
import com.clear_street.api.models.active.v1.accounts.exercises.ExerciseAction
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Submit one or more option lifecycle instructions against the account. Each row is routed to
 * `oems-csc` independently; per-row rejections are surfaced on the corresponding response entry
 * without failing the batch.
 */
class ExerciseSubmitExercisesParams
private constructor(
    private val accountId: Long?,
    private val exercises: List<Exercise>,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun accountId(): Optional<Long> = Optional.ofNullable(accountId)

    fun exercises(): List<Exercise> = exercises

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [ExerciseSubmitExercisesParams].
         *
         * The following fields are required:
         * ```java
         * .exercises()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ExerciseSubmitExercisesParams]. */
    class Builder internal constructor() {

        private var accountId: Long? = null
        private var exercises: MutableList<Exercise>? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(exerciseSubmitExercisesParams: ExerciseSubmitExercisesParams) = apply {
            accountId = exerciseSubmitExercisesParams.accountId
            exercises = exerciseSubmitExercisesParams.exercises.toMutableList()
            additionalHeaders = exerciseSubmitExercisesParams.additionalHeaders.toBuilder()
            additionalQueryParams = exerciseSubmitExercisesParams.additionalQueryParams.toBuilder()
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

        fun exercises(exercises: List<Exercise>) = apply {
            this.exercises = exercises.toMutableList()
        }

        /**
         * Adds a single [Exercise] to [exercises].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addExercise(exercise: Exercise) = apply {
            exercises = (exercises ?: mutableListOf()).apply { add(exercise) }
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
         * Returns an immutable instance of [ExerciseSubmitExercisesParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .exercises()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ExerciseSubmitExercisesParams =
            ExerciseSubmitExercisesParams(
                accountId,
                checkRequired("exercises", exercises).toImmutable(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): List<Exercise> = exercises

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> accountId?.toString() ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /**
     * One exercise / DNE / CEA instruction requested by a client.
     *
     * Cancel is not an action — use `DELETE /accounts/{account_id}/exercises/{exercise_id}`.
     */
    class Exercise
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val action: JsonField<ExerciseAction>,
        private val instrumentId: JsonField<String>,
        private val quantity: JsonField<String>,
        private val clientExerciseId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("action")
            @ExcludeMissing
            action: JsonField<ExerciseAction> = JsonMissing.of(),
            @JsonProperty("instrument_id")
            @ExcludeMissing
            instrumentId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("quantity")
            @ExcludeMissing
            quantity: JsonField<String> = JsonMissing.of(),
            @JsonProperty("client_exercise_id")
            @ExcludeMissing
            clientExerciseId: JsonField<String> = JsonMissing.of(),
        ) : this(action, instrumentId, quantity, clientExerciseId, mutableMapOf())

        /**
         * Instruction type.
         *
         * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun action(): ExerciseAction = action.getRequired("action")

        /**
         * OEMS instrument identifier. api-gw resolves this to `security_id` + `security_id_source`
         * via the instrument cache before dispatching to `oems-csc`. Unknown ids return 404.
         *
         * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun instrumentId(): String = instrumentId.getRequired("instrument_id")

        /**
         * Quantity of contracts to exercise / DNE / CEA.
         *
         * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun quantity(): String = quantity.getRequired("quantity")

        /**
         * Caller-supplied correlation id. Echoed back on the response and used as the FIX
         * `pos_req_id` (tag 710) for idempotency. If omitted the server generates a UUID.
         *
         * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun clientExerciseId(): Optional<String> =
            clientExerciseId.getOptional("client_exercise_id")

        /**
         * Returns the raw JSON value of [action].
         *
         * Unlike [action], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("action") @ExcludeMissing fun _action(): JsonField<ExerciseAction> = action

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
         * Returns the raw JSON value of [clientExerciseId].
         *
         * Unlike [clientExerciseId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("client_exercise_id")
        @ExcludeMissing
        fun _clientExerciseId(): JsonField<String> = clientExerciseId

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
             * Returns a mutable builder for constructing an instance of [Exercise].
             *
             * The following fields are required:
             * ```java
             * .action()
             * .instrumentId()
             * .quantity()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Exercise]. */
        class Builder internal constructor() {

            private var action: JsonField<ExerciseAction>? = null
            private var instrumentId: JsonField<String>? = null
            private var quantity: JsonField<String>? = null
            private var clientExerciseId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(exercise: Exercise) = apply {
                action = exercise.action
                instrumentId = exercise.instrumentId
                quantity = exercise.quantity
                clientExerciseId = exercise.clientExerciseId
                additionalProperties = exercise.additionalProperties.toMutableMap()
            }

            /** Instruction type. */
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
             * OEMS instrument identifier. api-gw resolves this to `security_id` +
             * `security_id_source` via the instrument cache before dispatching to `oems-csc`.
             * Unknown ids return 404.
             */
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

            /** Quantity of contracts to exercise / DNE / CEA. */
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
             * Caller-supplied correlation id. Echoed back on the response and used as the FIX
             * `pos_req_id` (tag 710) for idempotency. If omitted the server generates a UUID.
             */
            fun clientExerciseId(clientExerciseId: String?) =
                clientExerciseId(JsonField.ofNullable(clientExerciseId))

            /**
             * Alias for calling [Builder.clientExerciseId] with `clientExerciseId.orElse(null)`.
             */
            fun clientExerciseId(clientExerciseId: Optional<String>) =
                clientExerciseId(clientExerciseId.getOrNull())

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
             * Returns an immutable instance of [Exercise].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .action()
             * .instrumentId()
             * .quantity()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Exercise =
                Exercise(
                    checkRequired("action", action),
                    checkRequired("instrumentId", instrumentId),
                    checkRequired("quantity", quantity),
                    clientExerciseId,
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
        fun validate(): Exercise = apply {
            if (validated) {
                return@apply
            }

            action().validate()
            instrumentId()
            quantity()
            clientExerciseId()
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
            (action.asKnown().getOrNull()?.validity() ?: 0) +
                (if (instrumentId.asKnown().isPresent) 1 else 0) +
                (if (quantity.asKnown().isPresent) 1 else 0) +
                (if (clientExerciseId.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Exercise &&
                action == other.action &&
                instrumentId == other.instrumentId &&
                quantity == other.quantity &&
                clientExerciseId == other.clientExerciseId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(action, instrumentId, quantity, clientExerciseId, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Exercise{action=$action, instrumentId=$instrumentId, quantity=$quantity, clientExerciseId=$clientExerciseId, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ExerciseSubmitExercisesParams &&
            accountId == other.accountId &&
            exercises == other.exercises &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(accountId, exercises, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ExerciseSubmitExercisesParams{accountId=$accountId, exercises=$exercises, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
