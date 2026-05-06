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
    private val agreementKey: JsonField<EntitlementAgreementKey>,
    private val reason: JsonField<String>,
    private val requestedEntitlementCodes: JsonField<List<EntitlementCode>>,
    private val tradingAccountIds: JsonField<List<Long>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("agreement_key")
        @ExcludeMissing
        agreementKey: JsonField<EntitlementAgreementKey> = JsonMissing.of(),
        @JsonProperty("reason") @ExcludeMissing reason: JsonField<String> = JsonMissing.of(),
        @JsonProperty("requested_entitlement_codes")
        @ExcludeMissing
        requestedEntitlementCodes: JsonField<List<EntitlementCode>> = JsonMissing.of(),
        @JsonProperty("trading_account_ids")
        @ExcludeMissing
        tradingAccountIds: JsonField<List<Long>> = JsonMissing.of(),
    ) : this(agreementKey, reason, requestedEntitlementCodes, tradingAccountIds, mutableMapOf())

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
    fun reason(): String = reason.getRequired("reason")

    /**
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun requestedEntitlementCodes(): List<EntitlementCode> =
        requestedEntitlementCodes.getRequired("requested_entitlement_codes")

    /**
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun tradingAccountIds(): List<Long> = tradingAccountIds.getRequired("trading_account_ids")

    /**
     * Returns the raw JSON value of [agreementKey].
     *
     * Unlike [agreementKey], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("agreement_key")
    @ExcludeMissing
    fun _agreementKey(): JsonField<EntitlementAgreementKey> = agreementKey

    /**
     * Returns the raw JSON value of [reason].
     *
     * Unlike [reason], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<String> = reason

    /**
     * Returns the raw JSON value of [requestedEntitlementCodes].
     *
     * Unlike [requestedEntitlementCodes], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("requested_entitlement_codes")
    @ExcludeMissing
    fun _requestedEntitlementCodes(): JsonField<List<EntitlementCode>> = requestedEntitlementCodes

    /**
     * Returns the raw JSON value of [tradingAccountIds].
     *
     * Unlike [tradingAccountIds], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("trading_account_ids")
    @ExcludeMissing
    fun _tradingAccountIds(): JsonField<List<Long>> = tradingAccountIds

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
         * .agreementKey()
         * .reason()
         * .requestedEntitlementCodes()
         * .tradingAccountIds()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [OpenEntitlementConsentAction]. */
    class Builder internal constructor() {

        private var agreementKey: JsonField<EntitlementAgreementKey>? = null
        private var reason: JsonField<String>? = null
        private var requestedEntitlementCodes: JsonField<MutableList<EntitlementCode>>? = null
        private var tradingAccountIds: JsonField<MutableList<Long>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(openEntitlementConsentAction: OpenEntitlementConsentAction) = apply {
            agreementKey = openEntitlementConsentAction.agreementKey
            reason = openEntitlementConsentAction.reason
            requestedEntitlementCodes =
                openEntitlementConsentAction.requestedEntitlementCodes.map { it.toMutableList() }
            tradingAccountIds =
                openEntitlementConsentAction.tradingAccountIds.map { it.toMutableList() }
            additionalProperties = openEntitlementConsentAction.additionalProperties.toMutableMap()
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

        fun reason(reason: String) = reason(JsonField.of(reason))

        /**
         * Sets [Builder.reason] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reason] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun reason(reason: JsonField<String>) = apply { this.reason = reason }

        fun requestedEntitlementCodes(requestedEntitlementCodes: List<EntitlementCode>) =
            requestedEntitlementCodes(JsonField.of(requestedEntitlementCodes))

        /**
         * Sets [Builder.requestedEntitlementCodes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.requestedEntitlementCodes] with a well-typed
         * `List<EntitlementCode>` value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun requestedEntitlementCodes(requestedEntitlementCodes: JsonField<List<EntitlementCode>>) =
            apply {
                this.requestedEntitlementCodes =
                    requestedEntitlementCodes.map { it.toMutableList() }
            }

        /**
         * Adds a single [EntitlementCode] to [requestedEntitlementCodes].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRequestedEntitlementCode(requestedEntitlementCode: EntitlementCode) = apply {
            requestedEntitlementCodes =
                (requestedEntitlementCodes ?: JsonField.of(mutableListOf())).also {
                    checkKnown("requestedEntitlementCodes", it).add(requestedEntitlementCode)
                }
        }

        fun tradingAccountIds(tradingAccountIds: List<Long>) =
            tradingAccountIds(JsonField.of(tradingAccountIds))

        /**
         * Sets [Builder.tradingAccountIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tradingAccountIds] with a well-typed `List<Long>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun tradingAccountIds(tradingAccountIds: JsonField<List<Long>>) = apply {
            this.tradingAccountIds = tradingAccountIds.map { it.toMutableList() }
        }

        /**
         * Adds a single [Long] to [tradingAccountIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTradingAccountId(tradingAccountId: Long) = apply {
            tradingAccountIds =
                (tradingAccountIds ?: JsonField.of(mutableListOf())).also {
                    checkKnown("tradingAccountIds", it).add(tradingAccountId)
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
         * Returns an immutable instance of [OpenEntitlementConsentAction].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .agreementKey()
         * .reason()
         * .requestedEntitlementCodes()
         * .tradingAccountIds()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): OpenEntitlementConsentAction =
            OpenEntitlementConsentAction(
                checkRequired("agreementKey", agreementKey),
                checkRequired("reason", reason),
                checkRequired("requestedEntitlementCodes", requestedEntitlementCodes).map {
                    it.toImmutable()
                },
                checkRequired("tradingAccountIds", tradingAccountIds).map { it.toImmutable() },
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

        agreementKey().validate()
        reason()
        requestedEntitlementCodes().forEach { it.validate() }
        tradingAccountIds()
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
        (agreementKey.asKnown().getOrNull()?.validity() ?: 0) +
            (if (reason.asKnown().isPresent) 1 else 0) +
            (requestedEntitlementCodes.asKnown().getOrNull()?.sumOf { it.validity().toInt() }
                ?: 0) +
            (tradingAccountIds.asKnown().getOrNull()?.size ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is OpenEntitlementConsentAction &&
            agreementKey == other.agreementKey &&
            reason == other.reason &&
            requestedEntitlementCodes == other.requestedEntitlementCodes &&
            tradingAccountIds == other.tradingAccountIds &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            agreementKey,
            reason,
            requestedEntitlementCodes,
            tradingAccountIds,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "OpenEntitlementConsentAction{agreementKey=$agreementKey, reason=$reason, requestedEntitlementCodes=$requestedEntitlementCodes, tradingAccountIds=$tradingAccountIds, additionalProperties=$additionalProperties}"
}
