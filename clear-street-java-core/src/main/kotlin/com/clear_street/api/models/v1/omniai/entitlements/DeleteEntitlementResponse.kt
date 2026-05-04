// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.omniai.entitlements

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
import java.util.Collections
import java.util.Objects

class DeleteEntitlementResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val entitlementId: JsonField<String>,
    private val revoked: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("entitlement_id")
        @ExcludeMissing
        entitlementId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("revoked") @ExcludeMissing revoked: JsonField<Boolean> = JsonMissing.of(),
    ) : this(entitlementId, revoked, mutableMapOf())

    /**
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun entitlementId(): String = entitlementId.getRequired("entitlement_id")

    /**
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun revoked(): Boolean = revoked.getRequired("revoked")

    /**
     * Returns the raw JSON value of [entitlementId].
     *
     * Unlike [entitlementId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("entitlement_id")
    @ExcludeMissing
    fun _entitlementId(): JsonField<String> = entitlementId

    /**
     * Returns the raw JSON value of [revoked].
     *
     * Unlike [revoked], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("revoked") @ExcludeMissing fun _revoked(): JsonField<Boolean> = revoked

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
         * Returns a mutable builder for constructing an instance of [DeleteEntitlementResponse].
         *
         * The following fields are required:
         * ```java
         * .entitlementId()
         * .revoked()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DeleteEntitlementResponse]. */
    class Builder internal constructor() {

        private var entitlementId: JsonField<String>? = null
        private var revoked: JsonField<Boolean>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(deleteEntitlementResponse: DeleteEntitlementResponse) = apply {
            entitlementId = deleteEntitlementResponse.entitlementId
            revoked = deleteEntitlementResponse.revoked
            additionalProperties = deleteEntitlementResponse.additionalProperties.toMutableMap()
        }

        fun entitlementId(entitlementId: String) = entitlementId(JsonField.of(entitlementId))

        /**
         * Sets [Builder.entitlementId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.entitlementId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun entitlementId(entitlementId: JsonField<String>) = apply {
            this.entitlementId = entitlementId
        }

        fun revoked(revoked: Boolean) = revoked(JsonField.of(revoked))

        /**
         * Sets [Builder.revoked] to an arbitrary JSON value.
         *
         * You should usually call [Builder.revoked] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun revoked(revoked: JsonField<Boolean>) = apply { this.revoked = revoked }

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
         * Returns an immutable instance of [DeleteEntitlementResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .entitlementId()
         * .revoked()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): DeleteEntitlementResponse =
            DeleteEntitlementResponse(
                checkRequired("entitlementId", entitlementId),
                checkRequired("revoked", revoked),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): DeleteEntitlementResponse = apply {
        if (validated) {
            return@apply
        }

        entitlementId()
        revoked()
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
        (if (entitlementId.asKnown().isPresent) 1 else 0) +
            (if (revoked.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DeleteEntitlementResponse &&
            entitlementId == other.entitlementId &&
            revoked == other.revoked &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(entitlementId, revoked, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "DeleteEntitlementResponse{entitlementId=$entitlementId, revoked=$revoked, additionalProperties=$additionalProperties}"
}
