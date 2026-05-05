// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.accounts

import com.clear_street.api.core.ExcludeMissing
import com.clear_street.api.core.JsonField
import com.clear_street.api.core.JsonMissing
import com.clear_street.api.core.JsonValue
import com.clear_street.api.errors.ClearStreetInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class AccountSettings
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val risk: JsonField<RiskSettings>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("risk") @ExcludeMissing risk: JsonField<RiskSettings> = JsonMissing.of()
    ) : this(risk, mutableMapOf())

    /**
     * Risk settings for the account
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun risk(): Optional<RiskSettings> = risk.getOptional("risk")

    /**
     * Returns the raw JSON value of [risk].
     *
     * Unlike [risk], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("risk") @ExcludeMissing fun _risk(): JsonField<RiskSettings> = risk

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

        /** Returns a mutable builder for constructing an instance of [AccountSettings]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AccountSettings]. */
    class Builder internal constructor() {

        private var risk: JsonField<RiskSettings> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(accountSettings: AccountSettings) = apply {
            risk = accountSettings.risk
            additionalProperties = accountSettings.additionalProperties.toMutableMap()
        }

        /** Risk settings for the account */
        fun risk(risk: RiskSettings?) = risk(JsonField.ofNullable(risk))

        /** Alias for calling [Builder.risk] with `risk.orElse(null)`. */
        fun risk(risk: Optional<RiskSettings>) = risk(risk.getOrNull())

        /**
         * Sets [Builder.risk] to an arbitrary JSON value.
         *
         * You should usually call [Builder.risk] with a well-typed [RiskSettings] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun risk(risk: JsonField<RiskSettings>) = apply { this.risk = risk }

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
         * Returns an immutable instance of [AccountSettings].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): AccountSettings = AccountSettings(risk, additionalProperties.toMutableMap())
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
    fun validate(): AccountSettings = apply {
        if (validated) {
            return@apply
        }

        risk().ifPresent { it.validate() }
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
    @JvmSynthetic internal fun validity(): Int = (risk.asKnown().getOrNull()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AccountSettings &&
            risk == other.risk &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(risk, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AccountSettings{risk=$risk, additionalProperties=$additionalProperties}"
}
