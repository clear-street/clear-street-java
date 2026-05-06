// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.accounts.exercises

import com.clear_street.api.core.ExcludeMissing
import com.clear_street.api.core.JsonField
import com.clear_street.api.core.JsonMissing
import com.clear_street.api.core.JsonValue
import com.clear_street.api.core.checkKnown
import com.clear_street.api.core.checkRequired
import com.clear_street.api.core.toImmutable
import com.clear_street.api.errors.ClearStreetInvalidDataException
import com.clear_street.api.models.ApiError
import com.clear_street.api.models.BaseResponse
import com.clear_street.api.models.ResponseMetadata
import com.clear_street.api.models.active.v1.accounts.exercises.ExerciseInstruction
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ExerciseGetExercisesResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val metadata: JsonField<ResponseMetadata>,
    private val error: JsonField<ApiError>,
    private val data: JsonField<List<ExerciseInstruction>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("metadata")
        @ExcludeMissing
        metadata: JsonField<ResponseMetadata> = JsonMissing.of(),
        @JsonProperty("error") @ExcludeMissing error: JsonField<ApiError> = JsonMissing.of(),
        @JsonProperty("data")
        @ExcludeMissing
        data: JsonField<List<ExerciseInstruction>> = JsonMissing.of(),
    ) : this(metadata, error, data, mutableMapOf())

    fun toBaseResponse(): BaseResponse =
        BaseResponse.builder().metadata(metadata).error(error).build()

    /**
     * Response metadata, including the request ID and optional pagination info.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun metadata(): ResponseMetadata = metadata.getRequired("metadata")

    /**
     * Structured error details when the request is unsuccessful.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun error(): Optional<ApiError> = error.getOptional("error")

    /**
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun data(): List<ExerciseInstruction> = data.getRequired("data")

    /**
     * Returns the raw JSON value of [metadata].
     *
     * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("metadata")
    @ExcludeMissing
    fun _metadata(): JsonField<ResponseMetadata> = metadata

    /**
     * Returns the raw JSON value of [error].
     *
     * Unlike [error], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("error") @ExcludeMissing fun _error(): JsonField<ApiError> = error

    /**
     * Returns the raw JSON value of [data].
     *
     * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<List<ExerciseInstruction>> = data

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
         * Returns a mutable builder for constructing an instance of [ExerciseGetExercisesResponse].
         *
         * The following fields are required:
         * ```java
         * .metadata()
         * .data()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ExerciseGetExercisesResponse]. */
    class Builder internal constructor() {

        private var metadata: JsonField<ResponseMetadata>? = null
        private var error: JsonField<ApiError> = JsonMissing.of()
        private var data: JsonField<MutableList<ExerciseInstruction>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(exerciseGetExercisesResponse: ExerciseGetExercisesResponse) = apply {
            metadata = exerciseGetExercisesResponse.metadata
            error = exerciseGetExercisesResponse.error
            data = exerciseGetExercisesResponse.data.map { it.toMutableList() }
            additionalProperties = exerciseGetExercisesResponse.additionalProperties.toMutableMap()
        }

        /** Response metadata, including the request ID and optional pagination info. */
        fun metadata(metadata: ResponseMetadata) = metadata(JsonField.of(metadata))

        /**
         * Sets [Builder.metadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metadata] with a well-typed [ResponseMetadata] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun metadata(metadata: JsonField<ResponseMetadata>) = apply { this.metadata = metadata }

        /** Structured error details when the request is unsuccessful. */
        fun error(error: ApiError?) = error(JsonField.ofNullable(error))

        /** Alias for calling [Builder.error] with `error.orElse(null)`. */
        fun error(error: Optional<ApiError>) = error(error.getOrNull())

        /**
         * Sets [Builder.error] to an arbitrary JSON value.
         *
         * You should usually call [Builder.error] with a well-typed [ApiError] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun error(error: JsonField<ApiError>) = apply { this.error = error }

        fun data(data: List<ExerciseInstruction>) = data(JsonField.of(data))

        /**
         * Sets [Builder.data] to an arbitrary JSON value.
         *
         * You should usually call [Builder.data] with a well-typed `List<ExerciseInstruction>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun data(data: JsonField<List<ExerciseInstruction>>) = apply {
            this.data = data.map { it.toMutableList() }
        }

        /**
         * Adds a single [ExerciseInstruction] to [Builder.data].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addData(data: ExerciseInstruction) = apply {
            this.data =
                (this.data ?: JsonField.of(mutableListOf())).also {
                    checkKnown("data", it).add(data)
                }
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
         * Returns an immutable instance of [ExerciseGetExercisesResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .metadata()
         * .data()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ExerciseGetExercisesResponse =
            ExerciseGetExercisesResponse(
                checkRequired("metadata", metadata),
                error,
                checkRequired("data", data).map { it.toImmutable() },
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
    fun validate(): ExerciseGetExercisesResponse = apply {
        if (validated) {
            return@apply
        }

        metadata().validate()
        error().ifPresent { it.validate() }
        data().forEach { it.validate() }
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
        (metadata.asKnown().getOrNull()?.validity() ?: 0) +
            (error.asKnown().getOrNull()?.validity() ?: 0) +
            (data.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ExerciseGetExercisesResponse &&
            metadata == other.metadata &&
            error == other.error &&
            data == other.data &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(metadata, error, data, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ExerciseGetExercisesResponse{metadata=$metadata, error=$error, data=$data, additionalProperties=$additionalProperties}"
}
