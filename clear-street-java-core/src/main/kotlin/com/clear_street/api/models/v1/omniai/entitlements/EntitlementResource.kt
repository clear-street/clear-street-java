// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.omniai.entitlements

import com.clear_street.api.core.ExcludeMissing
import com.clear_street.api.core.JsonField
import com.clear_street.api.core.JsonMissing
import com.clear_street.api.core.JsonValue
import com.clear_street.api.core.checkRequired
import com.clear_street.api.errors.ClearStreetInvalidDataException
import com.clear_street.api.models.v1.omniai.EntitlementCode
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class EntitlementResource
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val agreementId: JsonField<String>,
    private val entitlementCode: JsonField<EntitlementCode>,
    private val entitlementId: JsonField<String>,
    private val grantedAt: JsonField<String>,
    private val tradingAccountId: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("agreement_id")
        @ExcludeMissing
        agreementId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("entitlement_code")
        @ExcludeMissing
        entitlementCode: JsonField<EntitlementCode> = JsonMissing.of(),
        @JsonProperty("entitlement_id")
        @ExcludeMissing
        entitlementId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("granted_at") @ExcludeMissing grantedAt: JsonField<String> = JsonMissing.of(),
        @JsonProperty("trading_account_id")
        @ExcludeMissing
        tradingAccountId: JsonField<Long> = JsonMissing.of(),
    ) : this(
        agreementId,
        entitlementCode,
        entitlementId,
        grantedAt,
        tradingAccountId,
        mutableMapOf(),
    )

    /**
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun agreementId(): String = agreementId.getRequired("agreement_id")

    /**
     * Stable entitlement code granted by an agreement.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun entitlementCode(): EntitlementCode = entitlementCode.getRequired("entitlement_code")

    /**
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun entitlementId(): String = entitlementId.getRequired("entitlement_id")

    /**
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun grantedAt(): String = grantedAt.getRequired("granted_at")

    /**
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun tradingAccountId(): Long = tradingAccountId.getRequired("trading_account_id")

    /**
     * Returns the raw JSON value of [agreementId].
     *
     * Unlike [agreementId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("agreement_id")
    @ExcludeMissing
    fun _agreementId(): JsonField<String> = agreementId

    /**
     * Returns the raw JSON value of [entitlementCode].
     *
     * Unlike [entitlementCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("entitlement_code")
    @ExcludeMissing
    fun _entitlementCode(): JsonField<EntitlementCode> = entitlementCode

    /**
     * Returns the raw JSON value of [entitlementId].
     *
     * Unlike [entitlementId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("entitlement_id")
    @ExcludeMissing
    fun _entitlementId(): JsonField<String> = entitlementId

    /**
     * Returns the raw JSON value of [grantedAt].
     *
     * Unlike [grantedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("granted_at") @ExcludeMissing fun _grantedAt(): JsonField<String> = grantedAt

    /**
     * Returns the raw JSON value of [tradingAccountId].
     *
     * Unlike [tradingAccountId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("trading_account_id")
    @ExcludeMissing
    fun _tradingAccountId(): JsonField<Long> = tradingAccountId

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
         * Returns a mutable builder for constructing an instance of [EntitlementResource].
         *
         * The following fields are required:
         * ```java
         * .agreementId()
         * .entitlementCode()
         * .entitlementId()
         * .grantedAt()
         * .tradingAccountId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [EntitlementResource]. */
    class Builder internal constructor() {

        private var agreementId: JsonField<String>? = null
        private var entitlementCode: JsonField<EntitlementCode>? = null
        private var entitlementId: JsonField<String>? = null
        private var grantedAt: JsonField<String>? = null
        private var tradingAccountId: JsonField<Long>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(entitlementResource: EntitlementResource) = apply {
            agreementId = entitlementResource.agreementId
            entitlementCode = entitlementResource.entitlementCode
            entitlementId = entitlementResource.entitlementId
            grantedAt = entitlementResource.grantedAt
            tradingAccountId = entitlementResource.tradingAccountId
            additionalProperties = entitlementResource.additionalProperties.toMutableMap()
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

        /** Stable entitlement code granted by an agreement. */
        fun entitlementCode(entitlementCode: EntitlementCode) =
            entitlementCode(JsonField.of(entitlementCode))

        /**
         * Sets [Builder.entitlementCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.entitlementCode] with a well-typed [EntitlementCode]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun entitlementCode(entitlementCode: JsonField<EntitlementCode>) = apply {
            this.entitlementCode = entitlementCode
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

        fun grantedAt(grantedAt: String) = grantedAt(JsonField.of(grantedAt))

        /**
         * Sets [Builder.grantedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.grantedAt] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun grantedAt(grantedAt: JsonField<String>) = apply { this.grantedAt = grantedAt }

        fun tradingAccountId(tradingAccountId: Long) =
            tradingAccountId(JsonField.of(tradingAccountId))

        /**
         * Sets [Builder.tradingAccountId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tradingAccountId] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun tradingAccountId(tradingAccountId: JsonField<Long>) = apply {
            this.tradingAccountId = tradingAccountId
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
         * Returns an immutable instance of [EntitlementResource].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .agreementId()
         * .entitlementCode()
         * .entitlementId()
         * .grantedAt()
         * .tradingAccountId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): EntitlementResource =
            EntitlementResource(
                checkRequired("agreementId", agreementId),
                checkRequired("entitlementCode", entitlementCode),
                checkRequired("entitlementId", entitlementId),
                checkRequired("grantedAt", grantedAt),
                checkRequired("tradingAccountId", tradingAccountId),
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
    fun validate(): EntitlementResource = apply {
        if (validated) {
            return@apply
        }

        agreementId()
        entitlementCode().validate()
        entitlementId()
        grantedAt()
        tradingAccountId()
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
        (if (agreementId.asKnown().isPresent) 1 else 0) +
            (entitlementCode.asKnown().getOrNull()?.validity() ?: 0) +
            (if (entitlementId.asKnown().isPresent) 1 else 0) +
            (if (grantedAt.asKnown().isPresent) 1 else 0) +
            (if (tradingAccountId.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EntitlementResource &&
            agreementId == other.agreementId &&
            entitlementCode == other.entitlementCode &&
            entitlementId == other.entitlementId &&
            grantedAt == other.grantedAt &&
            tradingAccountId == other.tradingAccountId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            agreementId,
            entitlementCode,
            entitlementId,
            grantedAt,
            tradingAccountId,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "EntitlementResource{agreementId=$agreementId, entitlementCode=$entitlementCode, entitlementId=$entitlementId, grantedAt=$grantedAt, tradingAccountId=$tradingAccountId, additionalProperties=$additionalProperties}"
}
