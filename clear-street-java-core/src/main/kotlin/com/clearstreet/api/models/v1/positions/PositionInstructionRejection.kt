// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.positions

import com.clearstreet.api.core.ExcludeMissing
import com.clearstreet.api.core.JsonField
import com.clearstreet.api.core.JsonMissing
import com.clearstreet.api.core.JsonValue
import com.clearstreet.api.core.checkRequired
import com.clearstreet.api.core.toImmutable
import com.clearstreet.api.errors.ClearStreetInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

/**
 * Machine-readable detail for a rejected position instruction.
 *
 * Present on every rejected row that carries a `rejection_reason`, across the full lifecycle —
 * submit, cancel, get, and list. Branch on `reason` for programmatic handling and template your own
 * copy from `metadata`; `rejection_reason` remains the human-readable fallback. Forward-only:
 * instructions rejected before this field shipped may carry only `rejection_reason`.
 */
class PositionInstructionRejection
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val domain: JsonField<String>,
    private val metadata: JsonField<Metadata>,
    private val reason: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("domain") @ExcludeMissing domain: JsonField<String> = JsonMissing.of(),
        @JsonProperty("metadata") @ExcludeMissing metadata: JsonField<Metadata> = JsonMissing.of(),
        @JsonProperty("reason") @ExcludeMissing reason: JsonField<String> = JsonMissing.of(),
    ) : this(domain, metadata, reason, mutableMapOf())

    /**
     * Namespacing domain of the `reason` code — `com.clearstreet.oems.exercise` for reasons OEMS
     * validates, `com.clearstreet.oems.clearing` for clearing-owned reasons.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun domain(): String = domain.getRequired("domain")

    /**
     * Reason-specific parameters as a string→string map. Which keys are present depends on
     * `reason`:
     * - `INSUFFICIENT_POSITION` → `available`, `requested`
     * - `DNE_NOT_ON_EXPIRY` / `CEA_NOT_ON_EXPIRY` → `expiry`, `business_date`
     * - `EXERCISE_PAST_CUTOFF` → `cutoff_time`
     * - `DUPLICATE_INSTRUCTION` → `existing_id`
     *
     * Empty for reasons that carry no parameters. New keys may be added over time, so treat unknown
     * keys leniently.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun metadata(): Metadata = metadata.getRequired("metadata")

    /**
     * Stable, machine-readable reason code, e.g. `DNE_NOT_ON_EXPIRY`, `INSUFFICIENT_POSITION`,
     * `OPTIONS_LEVEL_EXCEEDED`, `EXERCISE_PAST_CUTOFF`.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun reason(): String = reason.getRequired("reason")

    /**
     * Returns the raw JSON value of [domain].
     *
     * Unlike [domain], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("domain") @ExcludeMissing fun _domain(): JsonField<String> = domain

    /**
     * Returns the raw JSON value of [metadata].
     *
     * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

    /**
     * Returns the raw JSON value of [reason].
     *
     * Unlike [reason], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<String> = reason

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
         * Returns a mutable builder for constructing an instance of [PositionInstructionRejection].
         *
         * The following fields are required:
         * ```java
         * .domain()
         * .metadata()
         * .reason()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PositionInstructionRejection]. */
    class Builder internal constructor() {

        private var domain: JsonField<String>? = null
        private var metadata: JsonField<Metadata>? = null
        private var reason: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(positionInstructionRejection: PositionInstructionRejection) = apply {
            domain = positionInstructionRejection.domain
            metadata = positionInstructionRejection.metadata
            reason = positionInstructionRejection.reason
            additionalProperties = positionInstructionRejection.additionalProperties.toMutableMap()
        }

        /**
         * Namespacing domain of the `reason` code — `com.clearstreet.oems.exercise` for reasons
         * OEMS validates, `com.clearstreet.oems.clearing` for clearing-owned reasons.
         */
        fun domain(domain: String) = domain(JsonField.of(domain))

        /**
         * Sets [Builder.domain] to an arbitrary JSON value.
         *
         * You should usually call [Builder.domain] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun domain(domain: JsonField<String>) = apply { this.domain = domain }

        /**
         * Reason-specific parameters as a string→string map. Which keys are present depends on
         * `reason`:
         * - `INSUFFICIENT_POSITION` → `available`, `requested`
         * - `DNE_NOT_ON_EXPIRY` / `CEA_NOT_ON_EXPIRY` → `expiry`, `business_date`
         * - `EXERCISE_PAST_CUTOFF` → `cutoff_time`
         * - `DUPLICATE_INSTRUCTION` → `existing_id`
         *
         * Empty for reasons that carry no parameters. New keys may be added over time, so treat
         * unknown keys leniently.
         */
        fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

        /**
         * Sets [Builder.metadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metadata] with a well-typed [Metadata] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

        /**
         * Stable, machine-readable reason code, e.g. `DNE_NOT_ON_EXPIRY`, `INSUFFICIENT_POSITION`,
         * `OPTIONS_LEVEL_EXCEEDED`, `EXERCISE_PAST_CUTOFF`.
         */
        fun reason(reason: String) = reason(JsonField.of(reason))

        /**
         * Sets [Builder.reason] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reason] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun reason(reason: JsonField<String>) = apply { this.reason = reason }

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
         * Returns an immutable instance of [PositionInstructionRejection].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .domain()
         * .metadata()
         * .reason()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PositionInstructionRejection =
            PositionInstructionRejection(
                checkRequired("domain", domain),
                checkRequired("metadata", metadata),
                checkRequired("reason", reason),
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
    fun validate(): PositionInstructionRejection = apply {
        if (validated) {
            return@apply
        }

        domain()
        metadata().validate()
        reason()
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
        (if (domain.asKnown().isPresent) 1 else 0) +
            (metadata.asKnown().getOrNull()?.validity() ?: 0) +
            (if (reason.asKnown().isPresent) 1 else 0)

    /**
     * Reason-specific parameters as a string→string map. Which keys are present depends on
     * `reason`:
     * - `INSUFFICIENT_POSITION` → `available`, `requested`
     * - `DNE_NOT_ON_EXPIRY` / `CEA_NOT_ON_EXPIRY` → `expiry`, `business_date`
     * - `EXERCISE_PAST_CUTOFF` → `cutoff_time`
     * - `DUPLICATE_INSTRUCTION` → `existing_id`
     *
     * Empty for reasons that carry no parameters. New keys may be added over time, so treat unknown
     * keys leniently.
     */
    class Metadata
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Metadata]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Metadata]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(metadata: Metadata) = apply {
                additionalProperties = metadata.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Metadata].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Metadata = Metadata(additionalProperties.toImmutable())
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
        fun validate(): Metadata = apply {
            if (validated) {
                return@apply
            }

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
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Metadata && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PositionInstructionRejection &&
            domain == other.domain &&
            metadata == other.metadata &&
            reason == other.reason &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(domain, metadata, reason, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PositionInstructionRejection{domain=$domain, metadata=$metadata, reason=$reason, additionalProperties=$additionalProperties}"
}
