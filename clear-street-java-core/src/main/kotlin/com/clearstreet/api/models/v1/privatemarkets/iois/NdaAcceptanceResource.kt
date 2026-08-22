// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.privatemarkets.iois

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
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

/**
 * Public evidence that an NDA version was accepted. Signing IP and other provenance remain
 * audit-only and are never returned by this API.
 */
class NdaAcceptanceResource
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val acceptedAt: JsonField<OffsetDateTime>,
    private val agreementId: JsonField<String>,
    private val version: JsonField<Int>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("accepted_at")
        @ExcludeMissing
        acceptedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("agreement_id")
        @ExcludeMissing
        agreementId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("version") @ExcludeMissing version: JsonField<Int> = JsonMissing.of(),
    ) : this(acceptedAt, agreementId, version, mutableMapOf())

    /**
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun acceptedAt(): OffsetDateTime = acceptedAt.getRequired("accepted_at")

    /**
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun agreementId(): String = agreementId.getRequired("agreement_id")

    /**
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun version(): Int = version.getRequired("version")

    /**
     * Returns the raw JSON value of [acceptedAt].
     *
     * Unlike [acceptedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("accepted_at")
    @ExcludeMissing
    fun _acceptedAt(): JsonField<OffsetDateTime> = acceptedAt

    /**
     * Returns the raw JSON value of [agreementId].
     *
     * Unlike [agreementId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("agreement_id")
    @ExcludeMissing
    fun _agreementId(): JsonField<String> = agreementId

    /**
     * Returns the raw JSON value of [version].
     *
     * Unlike [version], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("version") @ExcludeMissing fun _version(): JsonField<Int> = version

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
         * Returns a mutable builder for constructing an instance of [NdaAcceptanceResource].
         *
         * The following fields are required:
         * ```java
         * .acceptedAt()
         * .agreementId()
         * .version()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [NdaAcceptanceResource]. */
    class Builder internal constructor() {

        private var acceptedAt: JsonField<OffsetDateTime>? = null
        private var agreementId: JsonField<String>? = null
        private var version: JsonField<Int>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(ndaAcceptanceResource: NdaAcceptanceResource) = apply {
            acceptedAt = ndaAcceptanceResource.acceptedAt
            agreementId = ndaAcceptanceResource.agreementId
            version = ndaAcceptanceResource.version
            additionalProperties = ndaAcceptanceResource.additionalProperties.toMutableMap()
        }

        fun acceptedAt(acceptedAt: OffsetDateTime) = acceptedAt(JsonField.of(acceptedAt))

        /**
         * Sets [Builder.acceptedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.acceptedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun acceptedAt(acceptedAt: JsonField<OffsetDateTime>) = apply {
            this.acceptedAt = acceptedAt
        }

        fun agreementId(agreementId: String) = agreementId(JsonField.of(agreementId))

        /**
         * Sets [Builder.agreementId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.agreementId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun agreementId(agreementId: JsonField<String>) = apply { this.agreementId = agreementId }

        fun version(version: Int) = version(JsonField.of(version))

        /**
         * Sets [Builder.version] to an arbitrary JSON value.
         *
         * You should usually call [Builder.version] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun version(version: JsonField<Int>) = apply { this.version = version }

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
         * Returns an immutable instance of [NdaAcceptanceResource].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .acceptedAt()
         * .agreementId()
         * .version()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): NdaAcceptanceResource =
            NdaAcceptanceResource(
                checkRequired("acceptedAt", acceptedAt),
                checkRequired("agreementId", agreementId),
                checkRequired("version", version),
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
    fun validate(): NdaAcceptanceResource = apply {
        if (validated) {
            return@apply
        }

        acceptedAt()
        agreementId()
        version()
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
        (if (acceptedAt.asKnown().isPresent) 1 else 0) +
            (if (agreementId.asKnown().isPresent) 1 else 0) +
            (if (version.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is NdaAcceptanceResource &&
            acceptedAt == other.acceptedAt &&
            agreementId == other.agreementId &&
            version == other.version &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(acceptedAt, agreementId, version, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "NdaAcceptanceResource{acceptedAt=$acceptedAt, agreementId=$agreementId, version=$version, additionalProperties=$additionalProperties}"
}
