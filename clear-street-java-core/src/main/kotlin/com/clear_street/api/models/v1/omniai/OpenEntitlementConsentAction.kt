// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.omniai

import com.clear_street.api.core.ExcludeMissing
import com.clear_street.api.core.JsonField
import com.clear_street.api.core.JsonMissing
import com.clear_street.api.core.JsonValue
import com.clear_street.api.core.checkKnown
import com.clear_street.api.core.checkRequired
import com.clear_street.api.core.toImmutable
import com.clear_street.api.errors.ClearStreetInvalidDataException
import com.clear_street.api.models.v1.omniai.entitlements.EntitlementAgreementKey
import com.clear_street.api.models.v1.omniai.entitlements.EntitlementCode
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

/** Action to open entitlement consent flow for one or more accounts. */
class OpenEntitlementConsentAction
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val accountIds: JsonField<List<Long>>,
    private val agreementKey: JsonField<EntitlementAgreementKey>,
    private val entitlementCodes: JsonField<List<EntitlementCode>>,
    private val reason: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("account_ids")
        @ExcludeMissing
        accountIds: JsonField<List<Long>> = JsonMissing.of(),
        @JsonProperty("agreement_key")
        @ExcludeMissing
        agreementKey: JsonField<EntitlementAgreementKey> = JsonMissing.of(),
        @JsonProperty("entitlement_codes")
        @ExcludeMissing
        entitlementCodes: JsonField<List<EntitlementCode>> = JsonMissing.of(),
        @JsonProperty("reason") @ExcludeMissing reason: JsonField<String> = JsonMissing.of(),
    ) : this(accountIds, agreementKey, entitlementCodes, reason, mutableMapOf())

    /**
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun accountIds(): List<Long> = accountIds.getRequired("account_ids")

    /**
     * Stable entitlement agreement family key.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun agreementKey(): EntitlementAgreementKey = agreementKey.getRequired("agreement_key")

    /**
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun entitlementCodes(): List<EntitlementCode> =
        entitlementCodes.getRequired("entitlement_codes")

    /**
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun reason(): String = reason.getRequired("reason")

    /**
     * Returns the raw JSON value of [accountIds].
     *
     * Unlike [accountIds], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("account_ids")
    @ExcludeMissing
    fun _accountIds(): JsonField<List<Long>> = accountIds

    /**
     * Returns the raw JSON value of [agreementKey].
     *
     * Unlike [agreementKey], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("agreement_key")
    @ExcludeMissing
    fun _agreementKey(): JsonField<EntitlementAgreementKey> = agreementKey

    /**
     * Returns the raw JSON value of [entitlementCodes].
     *
     * Unlike [entitlementCodes], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("entitlement_codes")
    @ExcludeMissing
    fun _entitlementCodes(): JsonField<List<EntitlementCode>> = entitlementCodes

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
         * Returns a mutable builder for constructing an instance of [OpenEntitlementConsentAction].
         *
         * The following fields are required:
         * ```java
         * .accountIds()
         * .agreementKey()
         * .entitlementCodes()
         * .reason()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [OpenEntitlementConsentAction]. */
    class Builder internal constructor() {

        private var accountIds: JsonField<MutableList<Long>>? = null
        private var agreementKey: JsonField<EntitlementAgreementKey>? = null
        private var entitlementCodes: JsonField<MutableList<EntitlementCode>>? = null
        private var reason: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(openEntitlementConsentAction: OpenEntitlementConsentAction) = apply {
            accountIds = openEntitlementConsentAction.accountIds.map { it.toMutableList() }
            agreementKey = openEntitlementConsentAction.agreementKey
            entitlementCodes =
                openEntitlementConsentAction.entitlementCodes.map { it.toMutableList() }
            reason = openEntitlementConsentAction.reason
            additionalProperties = openEntitlementConsentAction.additionalProperties.toMutableMap()
        }

        fun accountIds(accountIds: List<Long>) = accountIds(JsonField.of(accountIds))

        /**
         * Sets [Builder.accountIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountIds] with a well-typed `List<Long>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun accountIds(accountIds: JsonField<List<Long>>) = apply {
            this.accountIds = accountIds.map { it.toMutableList() }
        }

        /**
         * Adds a single [Long] to [accountIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAccountId(accountId: Long) = apply {
            accountIds =
                (accountIds ?: JsonField.of(mutableListOf())).also {
                    checkKnown("accountIds", it).add(accountId)
                }
        }

        /** Stable entitlement agreement family key. */
        fun agreementKey(agreementKey: EntitlementAgreementKey) =
            agreementKey(JsonField.of(agreementKey))

        /**
         * Sets [Builder.agreementKey] to an arbitrary JSON value.
         *
         * You should usually call [Builder.agreementKey] with a well-typed
         * [EntitlementAgreementKey] value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun agreementKey(agreementKey: JsonField<EntitlementAgreementKey>) = apply {
            this.agreementKey = agreementKey
        }

        fun entitlementCodes(entitlementCodes: List<EntitlementCode>) =
            entitlementCodes(JsonField.of(entitlementCodes))

        /**
         * Sets [Builder.entitlementCodes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.entitlementCodes] with a well-typed
         * `List<EntitlementCode>` value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun entitlementCodes(entitlementCodes: JsonField<List<EntitlementCode>>) = apply {
            this.entitlementCodes = entitlementCodes.map { it.toMutableList() }
        }

        /**
         * Adds a single [EntitlementCode] to [entitlementCodes].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addEntitlementCode(entitlementCode: EntitlementCode) = apply {
            entitlementCodes =
                (entitlementCodes ?: JsonField.of(mutableListOf())).also {
                    checkKnown("entitlementCodes", it).add(entitlementCode)
                }
        }

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
         * Returns an immutable instance of [OpenEntitlementConsentAction].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .accountIds()
         * .agreementKey()
         * .entitlementCodes()
         * .reason()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): OpenEntitlementConsentAction =
            OpenEntitlementConsentAction(
                checkRequired("accountIds", accountIds).map { it.toImmutable() },
                checkRequired("agreementKey", agreementKey),
                checkRequired("entitlementCodes", entitlementCodes).map { it.toImmutable() },
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
    fun validate(): OpenEntitlementConsentAction = apply {
        if (validated) {
            return@apply
        }

        accountIds()
        agreementKey().validate()
        entitlementCodes().forEach { it.validate() }
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
        (accountIds.asKnown().getOrNull()?.size ?: 0) +
            (agreementKey.asKnown().getOrNull()?.validity() ?: 0) +
            (entitlementCodes.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (reason.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is OpenEntitlementConsentAction &&
            accountIds == other.accountIds &&
            agreementKey == other.agreementKey &&
            entitlementCodes == other.entitlementCodes &&
            reason == other.reason &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(accountIds, agreementKey, entitlementCodes, reason, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "OpenEntitlementConsentAction{accountIds=$accountIds, agreementKey=$agreementKey, entitlementCodes=$entitlementCodes, reason=$reason, additionalProperties=$additionalProperties}"
}
